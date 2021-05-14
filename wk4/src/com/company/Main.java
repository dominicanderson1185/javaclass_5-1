package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Main {

//http://www.json-generator.com/api/json/get/bPuptCNIuq?indent=2
    //
    public static void main(String[] args) throws MalformedURLException {
      try{
        URL url = new URL("http://www.json-generator.com/api/json/get/bPuptCNIuq?indent=2");
        URLConnection urlConnection = url.openConnection();
        HttpURLConnection connection = null;
        if(urlConnection instanceof HttpURLConnection) {
            connection = (HttpURLConnection) urlConnection;
        }else {
            System.out.println("Please enter an HTTP URL.");
            return;
        }

        BufferedReader in = new BufferedReader(
                new InputStreamReader(connection.getInputStream()));
        String urlString = "";
        String current;

        while((current = in.readLine()) != null) {
            urlString += current;
        }
        System.out.println(urlString);
    } catch (IOException e) {
        e.printStackTrace();
    }

}
}
