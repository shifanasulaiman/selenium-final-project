package utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import constants.Constant;

public class ExcelUtility 
{
	static FileInputStream obj; // Used to read the Excel file.
	static XSSFWorkbook w; //Represents the workbook (Excel file).
	static XSSFSheet s; //Represents a specific sheet within the workbook.
	
	public static String getstringdata(int a,int b, String sheet) throws IOException
	{
		String testdatafile=Constant.FILEPATH;
		obj=new FileInputStream(testdatafile);
		w=new XSSFWorkbook(obj);
		s=w.getSheet(sheet);
		XSSFRow r=s.getRow(a);
		XSSFCell c=r.getCell(b);
		return c.getStringCellValue();
	}
	public static String getIntegerdata(int a,int b, String sheet) throws IOException
	{
		String testdatafile=Constant.FILEPATH;
		obj=new FileInputStream(testdatafile);
		w=new XSSFWorkbook(obj);//reading excel sheet data
		s=w.getSheet(sheet);
		XSSFRow r=s.getRow(a);
		XSSFCell c=r.getCell(b);
		int x=(int) c.getNumericCellValue();
		return String.valueOf(x);
	}
	

}
