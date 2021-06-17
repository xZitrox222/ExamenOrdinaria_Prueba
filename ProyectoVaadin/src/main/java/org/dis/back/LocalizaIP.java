package org.dis.back;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.google.gson.Gson;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.text.ParseException;
import java.util.Scanner;

public class LocalizaIP {

    public static void main( String[] args ) {
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

        /*float num = 0;
        Scanner leer = new Scanner(System.in);

        System.out.print("Introduzca una IP: ");
        num = leer.nextFloat();

        Gson gson = new Gson();
        User p = gson.fromJson(json, User.class);

        if (num >= p.getIp_from() && num <= p.getIp_to()) {
            System.out.println(json);
        }*/

        System.out.println(json);

    }
}
