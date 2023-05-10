package org.example;

import tech.tablesaw.api.Table;

import java.nio.file.Path;

public class GDPInputHandler {
    public Table table;

    public void readCSV(String path){
        this.table = Table.read().csv(path);
    }

    public Table getTable(){
        return this.table;
    }
}
