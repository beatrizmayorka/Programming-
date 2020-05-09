package Activity_03;

public class Television {   
	protected int channel;
	protected int sound;
	
	  public void getInitialChannel() {
		  System.out.printf("Start channel: 0\n");
	  }

	  public void getInitialSound() {
		  System.out.printf("Start sound: 0\n");
	  }
	
	  public void getCurrentChannel() {
		  System.out.printf("\nCurrent channel: %d\n", this.channel);
	  }

	  public void getCurrentSound() {
		  System.out.printf("Current sound: %d\n", this.sound);
	  } 
	 
}