package com.epam.appliance.dao;

import com.epam.appliance.entity.Appliance;

import java.util.List;
import java.util.Map;

public interface FindApplianceDAO {
    List<Appliance> findByCategory(String requestParameterValuePairs) throws DAOException;
}
