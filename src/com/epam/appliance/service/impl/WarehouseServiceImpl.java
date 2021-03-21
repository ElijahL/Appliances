package com.epam.appliance.service.impl;

import com.epam.appliance.dao.DAOException;
import com.epam.appliance.dao.DAOProvider;
import com.epam.appliance.entity.Appliance;
import com.epam.appliance.service.ServiceException;
import com.epam.appliance.service.WarehouseService;

import java.util.List;

public class WarehouseServiceImpl implements WarehouseService {
    @Override
    public List<Appliance> findByCategory(String category) throws ServiceException {
        List<Appliance> listOfMatchedAppliances;
        try {
            listOfMatchedAppliances = DAOProvider.getInstance()
                    .getFindApplianceDAO()
                    .findByCategory(category);
        } catch (DAOException e){
            throw new ServiceException(e.getMessage());
        }

        return listOfMatchedAppliances;
    }
}
