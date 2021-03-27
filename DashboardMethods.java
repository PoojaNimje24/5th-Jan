package com.jbk.pages;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DashboardMethods {
	public static List<String> baseMethod(String file) throws Exception{
		FileInputStream fis = new FileInputStream(file);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh=wb.getSheetAt(0);
		int row =sh.getPhysicalNumberOfRows();
		int col=sh.getRow(row-1).getPhysicalNumberOfCells();
		System.out.println(row+","+col);
		List<String> expData=new ArrayList<String>();
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				Cell cell=sh.getRow(i).getCell(j);
				String data=cell.getStringCellValue();
				System.out.println(data+" ");
				expData.add(data);	
			}
		}
		return expData;
	}

}
