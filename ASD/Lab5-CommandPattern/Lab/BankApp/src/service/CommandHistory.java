package service;

/**
 * Created by Rajiv on 3/25/2017.
 */

import java.util.ArrayList;
import java.util.Collection;

public class CommandHistory {

	private Collection<ICommand> commandlist = new ArrayList<ICommand>();
	private Collection<ICommand> undolist = new ArrayList<ICommand>();

	public void undo(){	
		if (commandlist.size()>0){
		ICommand commandObject = ((ArrayList<ICommand>)commandlist).get(commandlist.size()-1);
		((ArrayList<ICommand>)commandlist).remove(commandObject);
		commandObject.unExecute();
		undolist.add(commandObject);
		}
	}
  
	public void addCommand(ICommand commandObject){
		commandlist.add(commandObject);
	}

}
