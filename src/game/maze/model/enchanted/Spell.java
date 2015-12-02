package game.maze.model.enchanted;

public class Spell {

	/**
	 * 咒语内容
	 */
	private String message;
	
	boolean check(String message) {
		
		if(message != null && message.equals(this.message)) {
			return true;
		}
		return false;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
