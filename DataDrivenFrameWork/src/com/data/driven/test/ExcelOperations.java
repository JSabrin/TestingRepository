package com.data.driven.test;

import com.excel.utility.Xls_Reader;

public class ExcelOperations {

	public static void main(String[] args) {
		Xls_Reader reader = new Xls_Reader("C:\\Users\\sabrina\\workspace\\Project1\\src\\"
				+ "com\\excel\\data\\HalfEbay.Test.Data.xlsx");
	
	if (!reader.isSheetExist("HomePage")) {
		reader.addSheet("HomePage");
	}
	
	int colCount = reader.getColumnCount("RegTestData");
	System.out.println("Total column in this present RegTestData sheet: ==== " + colCount);
	
	System.out.println(reader.getCellRowNum("RegTestData", "firstname", "Tom"));
	
	System.out.println(reader.getCellRowNum("RegTestData", "state", "california"));
	
	System.out.println(reader.getCellRowNum("RegTestData", "firstname", "James"));
	
	
	
	}

}
