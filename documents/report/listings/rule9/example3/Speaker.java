package reportexamples.rule9.example3;

public class Speaker {

	/* the volume from one to ten */
	private int volume;

	public Speaker() {
		volume = 3;
	}

	public int getVolume() {
		if(volume < 10) {
			return volume;	
		}
		return 10;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

}
