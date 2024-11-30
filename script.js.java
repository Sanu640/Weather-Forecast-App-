const apiKey = 'YOUR_API_KEY';  // Get your API key from OpenWeatherMap
const searchBtn = document.getElementById('searchBtn');
const cityInput = document.getElementById('city');
const cityName = document.getElementById('cityName');
const temperature = document.getElementById('temperature');
const humidity = document.getElementById('humidity');
const wind = document.getElementById('wind');

// Event listener for Search button
searchBtn.addEventListener('click', getWeatherData);

function getWeatherData() {
    const city = cityInput.value;

    if (city === "") {
        alert("Please enter a city name!");
        return;
    }

    const apiUrl = `https://api.openweathermap.org/data/2.5/weather?q=${city}&appid=${apiKey}&units=metric`;

    fetch(apiUrl)
        .then(response => response.json())
        .then(data => {
            if (data.cod === "404") {
                alert("City not found. Please try again.");
            } else {
                cityName.innerText = `Weather in ${data.name}`;
                temperature.innerText = `Temperature: ${data.main.temp}°C`;
                humidity.innerText = `Humidity: ${data.main.humidity}%`;
                wind.innerText = `Wind: ${data.wind.speed} m/s`;
            }
        })
        .catch(error => {
            alert("Something went wrong, please try again.");
        });
}