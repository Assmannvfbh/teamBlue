package org.example;

import tech.tablesaw.api.Table;
import tech.tablesaw.io.Source;
import tech.tablesaw.io.csv.CsvReadOptions;

import java.io.File;
import java.net.URL;

public class UnemplmtInputHandler {

    public Table table;

    public void readCSV(String path){
        this.table = Table.read().usingOptions(CsvReadOptions.builder(new File(path)).separator(';'));
    }


    public Table getTable(){
        return this.table;
    }
}
