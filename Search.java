package FIRE;
import java.io.IOException;

public class Search {
private String searchQuery;
Runtime runtime = Runtime.getRuntime();
public String getSearchQuery() {
	runtime = Runtime.getRuntime();
	String[] s = new String[] {"C:\\\\Program Files (x86)\\\\Google\\\\Chrome\\\\Application\\\\chrome.exe", 
			"https://www.google.com/search?q="+searchQuery};
	try
    {
        runtime.exec(s);        
    }
    catch (IOException e)
    {
        e.printStackTrace();
    }
	return searchQuery;
}

public void setSearchQuery(String searchQuery) {
	this.searchQuery = searchQuery;
}
public Search(String searchQuery) {
	this.searchQuery = searchQuery;
}

}
