package com.epam.appliance.controller.command;

public interface Command {
    String execute(String request) throws CommandException;
}
