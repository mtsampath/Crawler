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
			String regex = ".*(\b[A-Z0-9._%+-]+@[A-Z0-9.-]+\.[A-Z]{2,4}\b).*";
			Pattern p = Pattern.compile(regex);
			Matcher m = p.matcher(strTemp);
			if (m.matches()) {
				 String email = m.group(1);
    				System.out.println email;
			}
	}
	catch (Exception ex) {
		ex.printStackTrace();
	}
}
