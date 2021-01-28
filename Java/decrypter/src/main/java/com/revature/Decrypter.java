package com.revature;

import com.revature.screens.HomeScreen;
import com.revature.util.AppState;
import com.revature.util.Map;

public class Decrypter {

    private static AppState app = new AppState();

    public static void main(String[] args) {

        Map<String, Integer> mapTest = new Map<>();
        mapTest.put("test1", 1);
        mapTest.put("test2", 2);
        mapTest.put("test3", 3);
        System.out.println("size = "+mapTest.size());
        System.out.println("value of test1 = "+mapTest.get("test1"));
        System.out.println("value of test2 = "+mapTest.get("test2"));
        System.out.println("value of test3 = "+mapTest.get("test3"));

        mapTest.put("test1", -1);
        System.out.println("size = "+ mapTest.size());
        System.out.println("values of test1 = "+mapTest.get("test1"));

        mapTest.put(null, 0);
        System.out.println("size = " + mapTest.size());
        //System.out.println("values of null = "+ mapTest.get(null));

        mapTest.put("nullVal", null);
        System.out.println(mapTest.getOrDefault("nullVal", -5));


        System.out.println("size = "+ mapTest.size());
        System.out.println("values of null: "+ mapTest.get(null));

        System.out.println(mapTest.get("test1"));
        System.out.println(mapTest.get("asd"));

//        while (app.isAppRunning()) {
//            app.getRouter().navigate("/home");
//        }
//
    }

    public static AppState app() {
        return app;
    }
}
