package FIRE;
import java.net.InetAddress;



public class findIP {
@SuppressWarnings("unused")
private String findIp;
private InetAddress localhost;
public String getFindIp() {
	
	try {
		localhost = InetAddress.getLocalHost(); 
        
	}catch (Exception e) {
		e.printStackTrace();
	}
	
	return "System IP Address : " + (localhost.getHostAddress()).trim();
}

public void setFindIP(String findIP) {
	this.setFindIp(findIP);
}

public void setFindIp(String findIp) {
	this.findIp = findIp;
}
}
