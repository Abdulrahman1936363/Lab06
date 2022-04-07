/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.cpit252_lab06;


public class App {

 
    public static void main(String[] args) {
        BaseLogger logger = new FileLogger();
        System.out.println(logger.getLabel()
                + ". Level: " + logger.getLevel());

        // create a console logger
        BaseLogger logger2 = new ConsoleLogger();
        // decorate it with a CSV and HTML formatters
        logger2 = new CSVFormatter(logger2);
        logger2 = new HTTPFormatter(logger2);
        System.out.println(logger2.getLabel()
                + ". Level: " + logger2.getLevel());

        // create a file logger
        BaseLogger logger3 = new FileLogger();
        // decorate it with a JSON, CSV, and YAML formatters
        logger3 = new JSONFormatter(logger3);
        logger3 = new CSVFormatter(logger3);
        logger3 = new YAMLFormatter(logger3);
        System.out.println(logger3.getLabel()
                + ". Level: " + logger3.getLevel());
    }
}
