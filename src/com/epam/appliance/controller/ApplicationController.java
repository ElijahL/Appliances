package com.epam.appliance.controller;

import com.epam.appliance.controller.command.Command;
import com.epam.appliance.controller.command.CommandException;
import com.epam.appliance.controller.command.CommandProvider;

public class ApplicationController implements Controller {
    private final static ApplicationController INSTANCE = new ApplicationController();

    private final CommandProvider provider = new CommandProvider();

    private final static int COMMAND_NAME = 0;
    private final static int PARAMETERS = 1;

    private ApplicationController(){}

    @Override
    public String doAction(String request) {
        String[] requestConstituents = request.split("/");
        String commandName = requestConstituents[COMMAND_NAME];
        String requestParameters = requestConstituents[PARAMETERS];

        Command command = provider.getCommand(commandName);

        String response = "";
        try {
            response = command.execute(requestParameters);
        } catch (CommandException e) {
            System.out.println(e.getMessage());
        }

        return "".equals(response) || response == null
                ? "Sorry, we have problems. Look at the hints and stay with us!"
                : response;
    }

    public static ApplicationController getInstance(){
        return INSTANCE;
    }
}
