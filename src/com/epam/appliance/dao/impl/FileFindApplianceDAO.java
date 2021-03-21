package com.epam.appliance.dao.impl;

import com.epam.appliance.dao.DAOException;
import com.epam.appliance.dao.FindApplianceDAO;
import com.epam.appliance.entity.Appliance;
import com.epam.appliance.former.ApplianceFormer;
import com.epam.appliance.former.ApplianceFormerProvider;
import com.epam.appliance.former.FormerException;

import javax.swing.text.html.parser.Entity;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FileFindApplianceDAO implements FindApplianceDAO {

    public FileFindApplianceDAO(){};

    @Override
    public List<Appliance> findByCategory(String request) throws DAOException {
        request = request.toLowerCase();
        String appliancesDBFile = "resources/appliances_db.txt";
        List<Appliance> listOfMatchedAppliances = new ArrayList<>();

        try(BufferedReader reader = new BufferedReader(new FileReader(appliancesDBFile))) {
            ApplianceFormerProvider formersProvider = new ApplianceFormerProvider();

            String[] splittedParameters = request.split(" ");
            Map<String, String> requestParameterValuePairs = Arrays.stream(splittedParameters)
                    .map(elem -> elem.split("="))
                    .collect(Collectors.toMap(e -> e[0], e -> e[1]));
            String category = requestParameterValuePairs.get("category");

            String applianceInfo;
            while((applianceInfo = reader.readLine()) != null){
                applianceInfo = applianceInfo.toLowerCase();
                if(isApplianceInfoContainsParameters(applianceInfo, requestParameterValuePairs)){
                    ApplianceFormer former = formersProvider.getFormer(category);
                    if(former == null){
                        throw new DAOException("Category is not  found.");
                    }
                    String applianceCharacteristics = applianceInfo.split(":")[1].strip();
                    Appliance matchedAppliance = former.formAppliance(applianceCharacteristics);
                    listOfMatchedAppliances.add(matchedAppliance);
                }
            }
        } catch (FormerException | IOException e){
            throw new DAOException(e.getMessage());
        }

        return listOfMatchedAppliances;
    }

    private boolean isApplianceInfoContainsParameters(String applianceInfo,
                                                      Map<String, String> parameterValuePairs){
        for(Map.Entry<String, String> pair: parameterValuePairs.entrySet()){
            if(!applianceInfo.contains(pair.getValue())){
                return false;
            }
        }
        return true;
    }
}
