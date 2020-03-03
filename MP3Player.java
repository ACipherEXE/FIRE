package FIRE;

public class MP3Player {

	private String filename;

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}
	public MP3Player(String mp3Folder) {
		this.filename = mp3Folder;
	}
	
}
