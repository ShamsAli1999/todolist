import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unused")
public class TodoList {
    List <TodoListItem> list = new Arraylist<>();

	

public TodoListItem getDescription() {
	// TODO Auto-generated method stub
		return null;
		}

	

    public void addItem(String description, int priority) {
    	TodoListItem item = new TodoListItem(description, priority);
    	list.add(item);
    	
 
    	
    }
    
    /*
     * Get the item at a given index.
     */
    public TodoListItem getItem(int i) {
        // TODO
        return null;
    }
    
    /*
     * Get the number of items in the list.
     */
    public int size() {
        // TODO
        return 0;
    }
    
    /*
     * Find the first item in the list which is not marked "done".
     * If all items are marked "done", this method returns null.
     */
    public TodoListItem findFirstNotDone() {
        // TODO
        return null;
    }
    
    /*
     * Find the highest-priority item which is not marked "done".
     * If all items are marked "done", this method returns null.
     */
    public TodoListItem findHighestPriorityNotDone() {
        // TODO
        return null;
    }
    
    /*
     * Search for items whose description contains the given text.
     * The descriptions are returned in a list.
     */
    public List<String> search(String text) {
        // TODO
        return null;
    }
}
