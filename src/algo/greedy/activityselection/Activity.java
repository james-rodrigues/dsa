package algo.greedy.activityselection;

/**
 * The Class Activity.
 */
public class Activity {
	
	/** The name. */
	private String name;
	
	/** The start time. */
	private int startTime;
	
	/** The finish time. */
	private int finishTime;

	/**
	 * Instantiates a new activity.
	 *
	 * @param name the name
	 * @param startTime the start time
	 * @param finishTime the finish time
	 */
	//Constructor
	public Activity(String name, int startTime, int finishTime) {
		this.name = name;
		this.startTime = startTime;
		this.finishTime = finishTime;
	}//end of method

	
	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}//end of method

	
	/**
	 * Sets the name.
	 *
	 * @param name the new name
	 */
	public void setName(String name) {
		this.name = name;
	}//end of method

	
	/**
	 * Gets the start time.
	 *
	 * @return the start time
	 */
	public int getStartTime() {
		return startTime;
	}//end of method
	

	/**
	 * Sets the start time.
	 *
	 * @param startTime the new start time
	 */
	public void setStartTime(int startTime) {
		this.startTime = startTime;
	}//end of method

	
	/**
	 * Gets the finish time.
	 *
	 * @return the finish time
	 */
	public int getFinishTime() {
		return finishTime;
	}//end of method

	
	/**
	 * Sets the finish time.
	 *
	 * @param finishTime the new finish time
	 */
	public void setFinishTime(int finishTime) {
		this.finishTime = finishTime;
	}//end of method
	

	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return "Activity :" + name + ", start time = " + startTime + ", finish time = " + finishTime;
	}//end of method

}//end of class
