package com.epam.appliance.context;

import com.epam.appliance.former.impl.*;
import com.epam.appliance.product.Kettle;
import com.epam.appliance.product.Laptop;
import com.epam.appliance.product.Oven;
import com.epam.appliance.product.Product;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public enum ApplicationController {
    INSTANCE;

    final String FILE_PATH = "/Users/ilia/Documents/EPAM-training/Appliances/src/com/epam/appliance/appliances_db.txt";

    public void start(){
        try{
            File dbFile = new File(FILE_PATH);
            Scanner dbScanner = new Scanner(dbFile);
            List<Product> listDataBase = new ArrayList<>();
            while(dbScanner.hasNextLine()){
                String nextLine = dbScanner.nextLine();
                if ("".equals(nextLine)){
                    continue;
                }
                String[] entityNameAndDescription = nextLine.split(":", 2);
                String entityName = entityNameAndDescription[0].strip();
                String entityDescription = entityNameAndDescription[1].strip();
                switch (entityName) {
                    case "Oven" -> listDataBase.add(OvenFormer.INSTANCE.formAppliance(entityDescription));
                    case "Laptop" -> listDataBase.add(LaptopFormer.INSTANCE.formAppliance(entityDescription));
                    case "Refrigerator" -> listDataBase.add(RefrigeratorFormer.INSTANCE.formAppliance(entityDescription));
                    case "VacuumCleaner" -> listDataBase.add(VacuumCleanerFormer.INSTANCE.formAppliance(entityDescription));
                    case "TabletPC" -> listDataBase.add(TabletPCFormer.INSTANCE.formAppliance(entityDescription));
                    case "Speakers" -> listDataBase.add(SpeakersFormer.INSTANCE.formAppliance(entityDescription));
                    case "Kettle" -> listDataBase.add(KettleFormer.INSTANCE.formAppliance(entityDescription));
                }
            }

            // Find cheapest
            System.out.println("Cheapest: " + listDataBase.stream()
                    .sorted(Comparator.comparing(Product::getPrice))
                    .collect(Collectors.toList())
                    .get(0).toString());

            // Find all kettles
            System.out.println("Kettles: " + listDataBase.stream()
                    .filter((o)-> o instanceof Kettle)
                    .collect(Collectors.toList()).toString());

        } catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}
