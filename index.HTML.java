<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Weather Dashboard</title>
        <link rel="stylesheet" href="styles.css">
    </head>
    <body>
        <div class="container">
            <h1>Weather Dashboard</h1>
            <input type="text" id="city" placeholder="Enter City Name">
            <button id="searchBtn">Search</button>
            <div id="weatherDetails">
                <h3 id="cityName"></h3>
                <p id="temperature"></p>
                <p id="humidity"></p>
                <p id="wind"></p>
            </div>
        </div>
        <script src="script.js"></script>
    </body>
</html>