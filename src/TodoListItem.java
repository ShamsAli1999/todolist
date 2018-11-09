
public class TodoListItem {
	
	String description;
	int i;
	boolean isDone = false;

	public TodoListItem(String string, int i) {
		this.description = string;
		this.i = i;
	}

	public Object getDescription() {
		return this.description;
	}

	public Object getPriority() {
		
		return i;
	}
	public void markDone() {
		this.isDone = true;
		
	}

	public boolean isDone() {
		return this.isDone = true;
	}

	
	
	

}
