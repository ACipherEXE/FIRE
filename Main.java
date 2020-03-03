package FIRE;
import java.awt.Desktop;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Scanner;

/**
 * 
 * @author ACipherEXE Reason: I wanted to make my own version of a virtual
 *         assistant. So I made one by scratch. But slowly I want it to become a exploit tool.
 *
 */
public class Main {

	public static void main(String[] args) throws IOException {
		 
	            
		Scanner userInput = new Scanner(System.in);
		UserName user = new UserName("username.txt");
		String userNameOutput = user.getFilename();
		String userNameOutput2 = null;
		
		if (userNameOutput == null) {
			try {
				FileWriter writer = new FileWriter("username.txt");
				System.out.println("Put your username here:");
				writer.write(userInput.nextLine());
				writer.close();

			} catch (IOException e) {
				e.printStackTrace();
			}
			userNameOutput2 = user.getFilename();
			System.out.println("Hello " + userNameOutput2 + " I am FIRE nice to meet you.");
			System.out.println("I am a security tool made for companies to exploit their systems");
			System.out.println("If used for other reasons could lead to legal issues");
			System.out.println("Please use me responsively and legaly");
			userNameOutput = userNameOutput2;
		} else {
			System.out.println("Welcome " + userNameOutput);
		}
		//While loop to keep it running
		boolean powerSwitch = true;
		while (powerSwitch == true) {
			
			// Time and Date Stuff
			
			TimeAndDate currentTimeAndDate = new TimeAndDate ();
			System.out.println(currentTimeAndDate.getDateAndTime());

			System.out.println("\nHow can I help you " + userNameOutput + "?");
			String commandInput = userInput.nextLine();
			
			// This is a ping look up
			
			if (commandInput.contains("ping")) { 
				System.out.println("What do you want me to ping?");
				
				commandInput = userInput.nextLine();
				Ping ping = new Ping(commandInput);
				String outputPing = ping.getIpWebName();
				System.out.println(outputPing);
			
				// search google
			
			}if (commandInput.contains("search")) {
				System.out.println("What do you want me to search?");
				commandInput = userInput.nextLine();
				Search googleSearch = new Search(commandInput);
				googleSearch.getSearchQuery();
				
				
			}
			if (commandInput.contains("play")) {
				if(commandInput.contains("music")) {
					
				    
				}
			}
			if (commandInput.contains("find")){
				if(commandInput.contains("ip")) {
					if(commandInput.contains("address")) {
					findIP currentIp = new findIP ();
					System.out.println(currentIp.getFindIp());
						
					}
				}if(commandInput.contains("current")) {
					if(commandInput.contains("song")) {
						
						
					}
				}else {
					
				}
				
			}
			if(commandInput.contains("open")) {
				
				if(commandInput.contains("note")) {
					Runtime runtime = Runtime.getRuntime();
					try
			        {
			            runtime.exec("notepad.exe");
			        }
			        catch (IOException e)
			        {
			            e.printStackTrace();
			        }
				}
				if(commandInput.contains("file manager")) {
					Runtime runtime = Runtime.getRuntime();
					try
			        {
			            runtime.exec("explorer.exe");
			        }
			        catch (IOException e)
			        {
			            e.printStackTrace();
			        }
				}
				if(commandInput.contains("browser")) {
					System.out.println("Opening a tab");
					if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
					    try {
							Desktop.getDesktop().browse(new URI("http://www.google.com"));
						} catch (URISyntaxException e) {
							e.printStackTrace();
						}
					}
				}
				
				else {
					System.out.println("Sorry I dont have that yet");
				}
				
			}
			if (commandInput.contains("exit")) {
				System.out.println("Alright have a great day~");
				powerSwitch = false;
				userInput.close();
			}
		}
	}
	
}
