package org.dis.back;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.google.gson.Gson;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.util.Scanner;

public class LocalizaIP {

    public static void main(String[] args ) {
        String json = "";

        try {
            BufferedReader lectorJson = new BufferedReader(new FileReader("LocalizaIP.json"));

            String linea = "";
            while ((linea = lectorJson.readLine()) != null) {
                json += linea;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Gson gson = new Gson();
        User p = gson.fromJson(json, User.class);

        //p.setNum(2532573185L);

        long num;
        Scanner leer = new Scanner(System.in);

        System.out.print("Introduzca un número: ");
        num = leer.nextLong();

        //Solo lee el bucle si el valor es cero, y aun así no funciona

        if (num >= p.getIp_from() && num <= p.getIp_to()) {
            System.out.println("ip_from:" + p.getIp_from());
            System.out.println("ip_to:" + p.getIp_to());
            System.out.println("country_zone:" + p.getCountry_code());
            System.out.println("country_name:" + p.getCountry_name());
            System.out.println("region_name:" + p.getRegion_name());
            System.out.println("city_name:" + p.getCity_name());
            System.out.println("latitude:" + p.getLatitude());
            System.out.println("longitude:" + p.getLongitude());
            System.out.println("zip_code:" + p.getZip_code());
            System.out.println("time_zone:" + p.getTime_zone());
        }

        //System.out.println(json);

    }
}