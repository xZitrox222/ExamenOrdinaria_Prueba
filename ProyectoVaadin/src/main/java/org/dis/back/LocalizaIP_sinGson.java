package org.dis.back;

import java.io.FileReader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.util.Scanner;

public class LocalizaIP_sinGson {
    public static void main(String[] args) throws Exception {
        JSONParser parser = new JSONParser();
        FileReader reader = new FileReader("LocalizaIP.json");
        Object obj = parser.parse(reader);
        JSONObject pJsonObj = (JSONObject)obj;
        JSONArray array = (JSONArray)pJsonObj.get("Data");

        for(int i = 0; i < array.size(); i++){
            JSONObject Data = (JSONObject)array.get(i);

            long ip_from = (long) Data.get("ip_from");
            long ip_to = (long) Data.get("ip_to");
            String country_code = (String) Data.get("country_code");
            String country_name = (String) Data.get("country_name");
            String region_name = (String) Data.get("region_name");
            String city_name = (String) Data.get("city_name");
            double latitude = (double) Data.get("latitude");
            double longitude = (double) Data.get("longitude");
            String zip_code = (String) Data.get("zip_code");
            String time_zone = (String) Data.get("time_zone");

            /*System.out.println("ip_from: " + ip_from);
            System.out.println("ip_to: " + ip_to);
            System.out.println("country_code: " + country_code);
            System.out.println("country_code: " + country_name);
            System.out.println("region_name: " + region_name);
            System.out.println("city_name: " + city_name);
            System.out.println("latitude: " + latitude);
            System.out.println("longitude: " + longitude);
            System.out.println("zip_code: " + zip_code);
            System.out.println("time_zone: " + time_zone);
            System.out.println("\n");*/

            long num;
            Scanner leer = new Scanner(System.in);

            System.out.print("Introduzca una IP: ");
            num = leer.nextLong();

            if (num >= ip_from && num <= ip_to) {
                System.out.println("\nDatos: ");
                System.out.println("ip_from: " + ip_from);
                System.out.println("ip_to: " + ip_to);
                System.out.println("country_code: " + country_code);
                System.out.println("country_code: " + country_name);
                System.out.println("region_name: " + region_name);
                System.out.println("city_name: " + city_name);
                System.out.println("latitude: " + latitude);
                System.out.println("longitude: " + longitude);
                System.out.println("zip_code: " + zip_code);
                System.out.println("time_zone: " + time_zone);
                System.out.println("\n");
            }
        }
    }
}

