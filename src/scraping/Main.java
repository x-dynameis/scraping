package scraping;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.IOException;

public class Main {
	
	public static void main(String[] args) {
		try {
		String targetURL ="http://x31.peps.jp/marinamari0318";
		Document doc =Jsoup.connect(targetURL).get();
		Elements elm =doc.select("a");
		
		
		for(Element elms:elm) {
			String title = elms.text();
			System.out.println(title);
		}
		
		}catch(IOException e) {
			
			e.printStackTrace();
		}
	}
	
}
