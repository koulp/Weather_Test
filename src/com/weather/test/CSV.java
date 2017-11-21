package com.weather.test;

import org.json.JSONArray;
import org.json.JSONException;

import java.io.*;

public class CSV {

    public void exportfile(JSONArray daily)throws FileNotFoundException, JSONException {
        PrintWriter pw = new PrintWriter(new File("test.csv"));
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<daily.length();i++) {
            sb.append("Max percentage humidity");
            sb.append(";");
            sb.append(daily.getJSONObject(i).getString("maxhumidity"));
            sb.append('\n');
            sb.append("Max Temp in C");
            sb.append(";");
            sb.append(daily.getJSONObject(i).getString("maxtempm"));
            sb.append('\n');
            sb.append("Min Temp in C");
            sb.append(";");
            sb.append(daily.getJSONObject(i).getString("mintempm"));
            sb.append('\n');
            sb.append("Precipitation in mm");
            sb.append(";");
            sb.append(daily.getJSONObject(i).getString("precipm"));
            sb.append('\n');
        }
        pw.write(sb.toString());
        pw.close();
        System.out.println("Exported metrics on Project FilePath!");;
    }
}
