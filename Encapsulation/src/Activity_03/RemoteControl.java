package Activity_03;

public class RemoteControl extends Television {

	public void turnUpTheSound() {
		if (this.sound < 100) this.sound++;
	}

	public void turnDownTheSound() {
		if (this.sound > 0) this.sound--;
	}

	public void changeChannel(int channel) {
		this.channel = channel;
	}

}