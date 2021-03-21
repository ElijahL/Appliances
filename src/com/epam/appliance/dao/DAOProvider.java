package com.epam.appliance.dao;

import com.epam.appliance.dao.impl.FileFindApplianceDAO;

public class DAOProvider {
    private static final DAOProvider INSTANCE = new DAOProvider();

    private final FindApplianceDAO findApplianceDAO = new FileFindApplianceDAO();

    private DAOProvider(){};

    public static DAOProvider getInstance(){
        return INSTANCE;
    }

    public FindApplianceDAO getFindApplianceDAO(){
        return findApplianceDAO;
    }
}
