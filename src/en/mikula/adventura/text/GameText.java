package en.mikula.adventura.text;

/**
 * Class used to store static texts outside of the game
 * class so the main game class won't be bothered with
 * these long methods
 *
 * @author Marek Mikula
 * @version 4/6/2021
 */
public class GameText {
    /**
     * Renders starting text to user
     */
    public static void startingText() {
        String[] text = {
                "Alien",
                "written by Marek Mikula",
                "subject: Ellen Ripley",
                "year: 2159",
                "location: mother ship Nostromo, planet LV178",
                "You are waking up after a long day shift as a control technic on the mother ship Nostromo. Something is not right. You've been woken up by an emergency siren and a smell of burnt plastic. You should go to command bridge and find out what is going on.",
                "Use 'help' command to list all available commands. Good luck."
        };
        System.out.println(String.join("\n", text));
    }

    /**
     * Renders ending text to user
     */
    public static void endingText(long time) {
        String[] text = {
                "The end",
                "It took you " + (time / 1000) + " seconds to finish the game.",
                "Thanks for playing, Marek Mikula"
        };
        System.out.println(String.join("\n", text));
    }

}