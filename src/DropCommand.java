/**
 * This type of command will remove an item from the adventurues inventory
 * and place it in the room they are in.
 * @author Alexander Loveland
 */
class DropCommand extends Command {

    private String itemName;

    /**
     * This is a basic setter for the itemName.
     * @param itemName the name of the item being dropped
     */
    DropCommand(String itemName) {
        this.itemName = itemName;
    }

    /**
     * [execute description]
     * @return [description]
     */

    public String execute() {

        if (itemName == null || itemName.trim().length() == 0) {
            return "Drop what?\n";
        }
        try {
            Item theItem = GameState.instance().getItemFromInventoryNamed(
                itemName);
            GameState.instance().removeFromInventory(theItem);
            GameState.instance().getAdventurersCurrentRoom().add(theItem);
            return Clock.instance().addTime() + theItem.getPrimaryName() + " dropped.\n";
        } catch (Item.NoItemException e) {
            return "You don't have a " + itemName + ".\n";
        }
    }
}
