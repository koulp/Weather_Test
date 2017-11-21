package com.weather.test;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;

import static com.weather.test.JsonReader.readJsonFromUrl;

public class WeatherTest {
    public static void main(String[] args) throws IOException, JSONException {
        fetchHistoricalData();
    }

    private static void fetchHistoricalData()
            throws IOException, JSONException {
        JSONObject json = readJsonFromUrl("http://api.wunderground.com/api/b47151c17953c76f/history_20171030/q/NY/New_York.json");
        JSONObject myResponse = json.getJSONObject("history");
        JSONArray daily = (JSONArray) myResponse.get("dailysummary");
        ArrayList<String> list = new ArrayList<String>();

        System.out.println(myResponse.toString());
        CSV csv = new CSV();
        csv.exportfile(daily);
    }
}
