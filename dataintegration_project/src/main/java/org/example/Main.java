package org.example;


import tech.tablesaw.api.Table;

public class Main {
    public Table tableGDP;
    public Table tableUnemplmt;

    public static void main(String[] args) {
        GDPInputHandler gdpHandler = new GDPInputHandler();
        UnemplmtInputHandler unempHandler = new UnemplmtInputHandler();


        gdpHandler.readCSV("C:\\Users\\Niklas\\Desktop\\Niklas\\Datenintegration\\teamBlue\\dataintegration_project\\0_datasets\\worldwide_GDP_2018-2022.csv");
        unempHandler.readCSV("C:\\Users\\Niklas\\Desktop\\Niklas\\Datenintegration\\teamBlue\\dataintegration_project\\0_datasets\\worldwide unemployment1960-2021.csv");

        System.out.println(gdpHandler.getTable());
        System.out.println(unempHandler.getTable());

    }
}