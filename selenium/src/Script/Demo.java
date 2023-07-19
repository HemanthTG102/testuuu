package Script;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Demo 
{
	public static void main(String[] args) throws IOException
	{
		FileInputStream fis=new FileInputStream("./properties/browser.property");
		
		Properties p1=new Properties();
		
		p1.load(fis);
		
		String data = p1.getProperty("name");
		
		System.out.println(data);
	}
}


