import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

/*
* Java Web Reader
* By Jason Barbier
*/

public static void mail (String[] args)	{
	try {
		URL CrawlURL = new URL("http://slashdot.org/");
		BufferedReader br = new BufferedReader(new InputStreamReader(CrawlURL.openStream()));
		String strTemp = "";
		while (null != (strTemp = br.readLine())) {
			System.out.println(strTemp);
		}
	}
	catch (Exception ex) {
		ex.printStackTrace();
	}
}
