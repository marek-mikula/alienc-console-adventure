package en.mikula.adventure.base;

import en.mikula.adventure.base.inputs.FileInput;
import en.mikula.adventure.base.inputs.Input;
import en.mikula.adventure.base.inputs.UserInput;
import en.mikula.adventure.exceptions.EndOfFileException;

import java.io.FileNotFoundException;

/**
 * Reads command from given input
 *
 * @author Marek Mikula
 * @version 4/6/2021
 */
public class CommandReader {

    private final Input input;

    private final CommandParser commandParser;

    public CommandReader(Game game, String[] args) throws FileNotFoundException {
        commandParser = new CommandParser(game);
        input = args.length > 0 ? new FileInput(args[0]) : new UserInput();
    }

    /**
     * Reads one line from user and pass it to
     * command parser.
     *
     * @return parsed command
     */
    public String readCommand() throws EndOfFileException {
        System.out.print("> "); // Print trailing character before command
        return commandParser.parseCommand(input.readLine());
    }

    /**
     * @return current input implementation
     */
    public Input getInput() {
        return input;
    }

}