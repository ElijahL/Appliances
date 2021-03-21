package com.epam.appliance;

import com.epam.appliance.controller.ApplicationController;

public class Application {
    public static void main(String[] args) {
        String request = "findbycategory/category=vacuumcleaner power_consumption=100";
        String response = ApplicationController.getInstance().doAction(request);
        System.out.println(response);
    }
}
