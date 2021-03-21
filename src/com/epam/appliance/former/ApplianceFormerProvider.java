package com.epam.appliance.former;

import com.epam.appliance.former.impl.*;

import java.util.HashMap;
import java.util.Map;

public class ApplianceFormerProvider {
    private final Map<String, ApplianceFormer> applianceFormers = new HashMap<>();

    public ApplianceFormerProvider(){
        applianceFormers.put("kettle", new KettleFormer());
        applianceFormers.put("laptop", new LaptopFormer());
        applianceFormers.put("oven", new OvenFormer());
        applianceFormers.put("refrigerator", new RefrigeratorFormer());
        applianceFormers.put("speakers", new SpeakersFormer());
        applianceFormers.put("tabletpc", new TabletPCFormer());
        applianceFormers.put("vacuumcleaner", new VacuumCleanerFormer());
    };

    public ApplianceFormer getFormer(String applianceName) throws FormerException {
        applianceName = applianceName.toLowerCase();
        return applianceFormers.get(applianceName);
    }
}
