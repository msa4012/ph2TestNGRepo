package tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.*;

import org.testng.annotations.BeforeMethod;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.chrome.*;
import org.testng.annotations.*;

import pages.Loginpage;

@Listeners(ListenerClass.class)
		public class LoginTest extends Baseclass {
		    
			XSSFWorkbook Workbook;
		    XSSFSheet sheet1;
		    
		    @BeforeTest
		    public void fetchdata() throws IOException {
		        
		        FileInputStream fis = new FileInputStream("exceldata.xlsx");
		        Workbook = new XSSFWorkbook(fis);
		        sheet1 = Workbook.getSheetAt(0);      
		        
		        
		    }
		    
		    @Test
		    public void login() {
		    	
		    	   
		        Loginpage loginpage = new Loginpage(driver);
		        
		        String MobileNo =  sheet1.getRow(0).getCell(0).getStringCellValue();
		        loginpage.LogintoApp(MobileNo);
		        
		       		        
		    }
		}