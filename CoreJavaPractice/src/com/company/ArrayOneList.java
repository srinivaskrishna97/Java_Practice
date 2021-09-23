package com.company;
import java.util.ArrayList;

public class ArrayOneList {
    public static void main(String[] args) {
        ArrayList<String> app = new ArrayList<String>();

        app.add("app_1");
        app.add("app_2");
        app.add("app_3");
        app.add("app_4");
        app.add("app_5");
        app.add("app_6");
        app.add("app_7");

        for ( String i : app ) {
            System.out.println(i);
        }

        System.out.println(app);
        System.out.println(app.size());

    }
}
