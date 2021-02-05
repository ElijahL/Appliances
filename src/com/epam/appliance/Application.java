package com.epam.appliance;

import com.epam.appliance.context.ApplicationController;

public class Application {
    public static void main(String[] args) {
        ApplicationController.INSTANCE.start();
    }
}
