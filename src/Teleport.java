/**
 * When triggered, this class will randomly teleport the user 
 * to some other room in the dungeon, which they may or may not 
 * have previously visited. 
 * This class will interact with the GameState and Command classes. 
 *@author Benjamin Madren
 **/
public class Teleport extends Command{
	public Room room;
	public Room destination;
	public String going;
	/**This method will check what room the user
	* is currently in.
	* @param room **/
	public Teleport(String room){
		this.going = room;
	}
		GameState getAdventurersCurrentRoom(GameState room){
		     return room;
		}	     
		/**This method will set the user's current room 
		 * to their desired destination. 
		 * @param destination **/
		GameState setAdventurersCurrentRoom(GameState destination){ 
	             return destination;	
		}

		String execute(){
			if(GameState.instance().getDungeon().Look(going) != null){
			GameState.instance().setAdventurersCurrentRoom(GameState.instance().getDungeon().Look(going));
			return GameState.instance().getAdventurersCurrentRoom().describe();
			}
			else{
				return "Null room, you can not go there." + going;
			}
		}
	}
	
