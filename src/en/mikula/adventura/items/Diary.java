package en.mikula.adventura.items;

/**
 * @author Marek Mikula
 * @version 4/9/2021
 */
public class Diary extends Item implements Interactive {

    public static final String STORAGE_CODE = "1948";

    @Override
    public String getName() {
        return "Ellen Ripley's diary";
    }

    @Override
    public ItemCode getCode() {
        return ItemCode.ITEM_0;
    }

    @Override
    public String interact() {
        return String.format("The diary is pretty old. But there is a code to storage room [%s] on the page 5.", STORAGE_CODE);
    }
}
