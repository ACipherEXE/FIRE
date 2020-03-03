package FIRE;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ping {
	private String ipWebName;

	public String getIpWebName() {
		try {
		    Process process = Runtime.getRuntime().exec("ping " +ipWebName);
		 
		    BufferedReader reader = new BufferedReader(
		            new InputStreamReader(process.getInputStream()));
		    String line;
		    while ((line = reader.readLine()) != null) {
		        System.out.println(line);
		    }
		 
		    reader.close();
		 
		} catch (IOException e) {
		    e.printStackTrace();
		}
		
		return ipWebName;
	}

	public void setIpWebName(String ipWebName) {
		this.ipWebName = ipWebName;
	}
	/**
	 * 
	 * @param ipWebName = eneter ip adress or website here.
	 * @throws FileNotFoundException
	 */
	public Ping(String ipWebName) throws FileNotFoundException {
		this.ipWebName = ipWebName;

	}
	
}

