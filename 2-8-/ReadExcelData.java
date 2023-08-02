package com.excel;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ReadExcelData 
{

	
	@DataProvider(name="tops")
	public static String[][] readExcel(String mysheet) throws InvalidFormatException, IOException
	{
		String[][] data=null;
			
		String filepath="D:\\login.xlsx"; //only string form path
		
		File file=new File(filepath); //to make an file
		
		XSSFWorkbook workbook=new XSSFWorkbook(file);//to open the excel file
		
		Sheet sheet=workbook.getSheet(mysheet);//to open the perticular sheet
		
		int nrows=sheet.getPhysicalNumberOfRows();
		System.out.println("no of rows are... "+nrows);
		
		data=new String[nrows][];
		for(int i=0;i<nrows;i++)//row
		{
			Row row=sheet.getRow(i);//ith row is selection
			int ncols=row.getPhysicalNumberOfCells();
			System.out.println("no of cols are.. "+ncols);
			data[i]=new String[ncols];
			for(int j=0;j<ncols;j++)//cols
			{
				Cell cell=row.getCell(j);
				cell.setCellType(CellType.STRING);
				data[i][j]=cell.getStringCellValue();
			}
		}
		return data;
	}
}
