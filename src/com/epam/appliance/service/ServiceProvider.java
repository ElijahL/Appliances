package com.epam.appliance.service;

import com.epam.appliance.service.impl.WarehouseServiceImpl;

public class ServiceProvider {
    private static final ServiceProvider INSTANCE = new ServiceProvider();

    private final WarehouseService warehouseService = new WarehouseServiceImpl();

    public ServiceProvider(){}

    public WarehouseService getWarehouseService(){
        return warehouseService;
    }

    public static ServiceProvider getInstance(){
        return INSTANCE;
    }
}
