package org.dis.back;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws IOException, ParseException{

        int num = 0;
        Scanner leer = new Scanner(System.in);

        System.out.print("Introduzca una IP: ");
        num = leer.nextInt();

        JSONParser jsonparser = new JSONParser();

        FileReader reader = new FileReader("..\\ProyectoVaadin\\LocalizaIP.json");

        Object obj = jsonparser.parse(reader);

        JSONObject empjsonobj = (JSONObject)obj;


        int ipF = (int) empjsonobj.get("ip_from");
        int ipT = (int) empjsonobj.get("ip_to");

        if (num >= ipF && num <= ipT) {

                String countC = (String) empjsonobj.get("country_code");
                String countN = (String) empjsonobj.get("country_name");
                String regN = (String) empjsonobj.get("region_name");
                String citN = (String) empjsonobj.get("city_name");
                float lat = (float) empjsonobj.get("latitude");
                float lon = (float) empjsonobj.get("longitude");
                String zipC = (String) empjsonobj.get("zip_code");
                String timeZ = (String) empjsonobj.get("time_zone");

                System.out.println("ip_from:" + ipF);
                System.out.println("ip_to:" + ipT);
                System.out.println("country_code:" + countC);
                System.out.println("country_name:" + countN);
                System.out.println("region_name:" + regN);
                System.out.println("city_name:" + citN);
                System.out.println("latitude:" + lat);
                System.out.println("longitude:" + lon);
                System.out.println("zip_code:" + zipC);
                System.out.println("time_zone:" + timeZ);
        }

    }

}
