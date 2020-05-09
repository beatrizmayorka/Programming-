package Activity_03;

public class Main {

	public static void main(String[] args) {
		
		RemoteControl firstRemoteControl = new RemoteControl();

		firstRemoteControl.getInitialChannel(); // Initial state
		firstRemoteControl.getInitialSound(); // Initial state

		firstRemoteControl.turnUpTheSound(); // Changes the sound to 1.
		firstRemoteControl.turnUpTheSound(); // Changes the sound to 2.
		firstRemoteControl.turnUpTheSound(); // Changes the sound to 3.
		firstRemoteControl.turnUpTheSound(); // Changes the sound to 4.
		firstRemoteControl.turnUpTheSound(); // --- This is the final sound (5) --- 
		
		firstRemoteControl.changeChannel(12); // Changes the channel

		firstRemoteControl.getCurrentChannel(); // Shows the final state
		firstRemoteControl.getCurrentSound(); // Shows the final state

	}

}