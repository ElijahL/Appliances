package com.epam.appliance.controller.command.impl;

import com.epam.appliance.controller.command.Command;
import com.epam.appliance.controller.command.CommandException;
import com.epam.appliance.entity.Appliance;
import com.epam.appliance.service.ServiceException;
import com.epam.appliance.service.ServiceProvider;

import java.util.List;

public class FindByCategoryCommand implements Command {

    @Override
    public String execute(String requestParameters) throws CommandException {

        List<Appliance> matchedAppliances;
        try {
            matchedAppliances = ServiceProvider.getInstance()
                    .getWarehouseService()
                    .findByCategory(requestParameters);
        } catch (ServiceException e){
            throw new CommandException(e.getMessage());
        }

        String response = (matchedAppliances == null || matchedAppliances.size() == 0)
                ? "Nothing has been found."
                : matchedAppliances.toString();

        return response;
    }
}
