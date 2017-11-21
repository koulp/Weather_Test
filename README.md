# Weather_Test

Java Weather Test system for monitoring Weather specifically on New York 30/10/2017 which we chose.

Overview:
Created method fetchHistoricalData for parsing the data from wunderground API to a JSONObject.
To do that i used a BufferedReader which reads an input stream of characters.
Then used readAll method to append those characters to a StringBuilder which goes into a jsonText and creates the JSONObject.

Printed data on screen to see data parsed successfully.
Exported data from daily summary such as maxhumidity getting String data from the JSONObject and appending them to a CSV file.

Koulpas Dimitris
