package com.epam.appliance.controller.command;

import com.epam.appliance.controller.command.impl.FindByCategoryCommand;
import com.epam.appliance.controller.command.impl.NoCommand;

import java.util.HashMap;
import java.util.Map;

public class CommandProvider {
    private Map<String, Command> commands = new HashMap<>();

    public CommandProvider(){
        commands.put("findbycategory", new FindByCategoryCommand());
        commands.put("nocommand", new NoCommand());
    }

    public Command getCommand(String commandName){
        Command command;
        command = commands.get(commandName);
        return command == null ? commands.get("nocommand") : command;
    }
}
