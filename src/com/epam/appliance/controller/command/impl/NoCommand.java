package com.epam.appliance.controller.command.impl;

import com.epam.appliance.controller.command.Command;
import com.epam.appliance.controller.command.CommandException;

public class NoCommand implements Command {
    @Override
    public String execute(String request) throws CommandException {
        return "Wrong command. The list of existing commands:\n" +
                "- 'findbycategory'";
    }
}
