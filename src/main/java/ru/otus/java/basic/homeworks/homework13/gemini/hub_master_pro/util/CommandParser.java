package ru.otus.java.basic.homeworks.homework13.gemini.hub_master_pro.util;

import ru.otus.java.basic.homeworks.homework13.gemini.hub_master_pro.dto.CommandDto;
import ru.otus.java.basic.homeworks.homework13.gemini.hub_master_pro.exception.InvalidCommandException;

import java.math.BigDecimal;

public class CommandParser {
    public static CommandDto parse(String input) throws InvalidCommandException {
        if (input == null || input.isBlank()) {
            throw new InvalidCommandException("Wrong command");
        }

        String[] parts = input.split("\\|");
        String action = parts[0].toUpperCase();

        if (action.equalsIgnoreCase("ADD")) {
            if (parts.length != 5) throw new InvalidCommandException("Для ADD нужно 5 параметров");
            return new CommandDto(action, parts[1], parts[2], new BigDecimal(parts[3]), new BigDecimal(parts[4]));
        } else if (action.equalsIgnoreCase("REMOVE")) {
            if (parts.length != 2) throw new InvalidCommandException("Для REMOVE требуется 2 параметра");
            return new CommandDto(action, parts[1], null, BigDecimal.ZERO, BigDecimal.ZERO);
        }

        throw new InvalidCommandException("Неизвестное действие: " + action);
    }
}
