package basic;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class Topic_02_Data_Type {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2 loại kiểu dữ liệu
		// Kiểu nguyên hủy (Primitive Type): 8 loại, lưu dữ liệu trong chính bản thân nó
		//char (kí tự-16)
		char c='A';
		//byte (số nguyên-8)
		byte bNumber=15;
		System.out.println(bNumber);
		//short (số nguyên-16)
		short sNumber=-32000;
		System.out.println(sNumber);
		//int (số nguyên-32)
		int iNumber=2000000000;
		System.out.println(iNumber);
		//long (số nguyên-64)
		long lNumber=900029900;
		System.out.println(lNumber);
		//float (số thực-32)
		float fNumber= 9.5f;
		System.out.println(fNumber);
		//double (số thực-64)
		double dNumber=9.5d;
		System.out.println(dNumber);
		//boolean (logic-1 True/False)
		boolean marriedStatus=false;
		System.out.println(marriedStatus);
		//Kiểu tham chiếu (Reference type): 5 loại, lưu dữ liệu theo
		//Object
		Object o=new Object();
		//Array
		String[] address= {"Ha Noi", "Sai Gon", "Da Nang"};
		Integer[] phone = {1932, 2323};
		Long a[] = {10000L, 30000L, 40000L};
		//string (chuỗi kí tự)
		
		//Class
		Topic_02_Data_Type Topic=new Topic_02_Data_Type();
		//collection List/Set/Queue
		String name="automation";
		String cityName=new String("Ho Chi Minh");
		//Interface
		WebDriver driver=null;
		List<WebElement> checkboxes=driver.findElements(By.tagName("input"));
		

	}

}
