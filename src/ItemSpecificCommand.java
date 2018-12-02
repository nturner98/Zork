import java.util.ArrayList;

/** This command will preform an action specific to that comman
*
* @author Alecander Lovelandd
*/
class ItemSpecificCommand extends Command {

  private String verb;
  private String noun;

  /**Conrustor which verb and noun instance varaibles to the paramaters passed.
  *
  * @param verb specific action preformed by object.
  * @param noun noun that describes what the object is.
  */
  ItemSpecificCommand(String verb, String noun) {
    this.verb = verb;
    this.noun = noun;
  }
  /** This method returns a string whcih contains the verb from the item which has a specific command, and if the
  * item does not exist it will  catch an exception and return that the item does not exist
  */
  public String execute() {

    Item itemReferredTo = null;
    try {
      itemReferredTo = GameState.instance().getItemInVicinityNamed(noun);
    } catch (Item.NoItemException e) {
      return "There's no " + this.noun + " here.";
    }

    String msg = itemReferredTo.getMessageForVerb(this.verb);

    if (msg == null) {
      return "Sorry, you can't " + verb + " the " + noun + ".\n";
    } else if (itemReferredTo.hasEvent(this.verb) == true) {

      /*TODO
      0. Drop -- Ben
        0b. Disappear -- Ben
      1. Wound/heal events -- Nick
        1b. Die event -- Nick
      2. Score events -- Alex
        2b. Win events -- Alex
      3.Transform -- Ben
      4. Teleport -- Ben

      Should be a for each loop thru the command arraylist
       */

       ArrayList<String> actions = new ArrayList(itemReferredTo.getEventForVerb(verb));
       for (String action : actions) {
         //System.out.println(action + "DEBUG.\n"); //DEBUG

         if (action.contains("Drop")) {
           System.out.println("Contains Drop."); //DEBUG
         } else if (action.contains("Disappear")) {
           System.out.println("Contains Disappear."); //DEBUG
         } else if (action.contains("Wound")){
           System.out.println("Contains Wound."); //DEBUG
         } else if (action.contains("Die")) {
           System.out.println("Contains Die."); //DEBUG
         } else if (action.contains("Score")) {
           System.out.println("Contains Score."); //DEBUG
         } else if (action.contains("Win")) {
           System.out.println("Contains Win."); //DEBUG
         } else if (action.contains("Transform")) {
           System.out.println("Contains Transform."); //DEBUG
         } else if (action.contains("Teleport")) {
           System.out.println("Contains Teleport.");  //DEBUG
         } else {
           System.out.println("contains something else idk. if you make it here I messed up bad.\n"); //DEBUG
         }

       }


      return msg + ".\n"; //This is from hasEvent!\n";  //DEBUG

    } else {
      return msg + ".\n";
    }
  }
}
