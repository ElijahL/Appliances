package com.epam.appliance.service;

import com.epam.appliance.entity.Appliance;

import java.util.List;

public interface WarehouseService {
    List<Appliance> findByCategory(String category) throws ServiceException;
}
