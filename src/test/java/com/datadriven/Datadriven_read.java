package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Datadriven_read {
	public static void datasread() throws IOException {
		File f = new File ("F:\\seleniumworkspace7am\\MavenDepend\\src\\test\\java\\com\\datadriven\\Data1.xlsx");
		FileInputStream fi = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fi);
		Sheet s = w.getSheetAt(0);
		int physical = s.getPhysicalNumberOfRows();
		for (int i=0; i<physical; i++)
		{
		  Row r = s.getRow(i);
		  int phy = r.getPhysicalNumberOfCells();
		  for ( int j=0; j<phy; j++)
		  {
			  Cell c = r.getCell(j);
			  CellType ct = c.getCellType();
			  if(ct.equals(CellType.STRING)){
				  String st = c.getStringCellValue();
				  System.out.print(st + "       ");
			  }
			  else if (ct.equals(CellType.NUMERIC)) {
				  double nu = c.getNumericCellValue();
			      int n = (int) nu;
			      System.out.print(n + "       ");
			  }}
		  System.out.println();
		}}
	public static void readpardata() throws IOException {
		File f = new File ("F:\\seleniumworkspace7am\\MavenDepend\\src\\test\\java\\com\\datadriven\\Data1.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wo = new XSSFWorkbook(fis);
		Sheet s = wo.getSheetAt(0);
		System.out.println("---------------------------------------------");
		System.out.println("Enter the row you want to print");
		Scanner sca = new Scanner (System.in);
	    int nei = sca.nextInt();
		Row r = s.getRow(nei);
		  int phy = r.getPhysicalNumberOfCells();
		  for ( int j=0; j<phy; j++)
		  {
			  Cell c = r.getCell(j);
			  CellType ct = c.getCellType();
			  if(ct.equals(CellType.STRING)){
				  String st = c.getStringCellValue();
				  System.out.print(st + "       ");
			  }
			  else if (ct.equals(CellType.NUMERIC)) {
				  double nu = c.getNumericCellValue();
			      int n = (int) nu;
			      System.out.print(n + "       ");
			  }}}
	public static void writesdta() throws IOException
	{
		File f = new File ("F:\\seleniumworkspace7am\\MavenDepend\\src\\test\\java\\com\\datadriven\\Data1.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wo = new XSSFWorkbook(fis);
		Sheet s = wo.createSheet("Class2");
		s.createRow(0).createCell(0).setCellValue("S.NO");
		s.getRow(0).createCell(1).setCellValue("Day");
		s.getRow(0).createCell(2).setCellValue("Tutor1");
		s.getRow(0).createCell(3).setCellValue("Tutor2");
		s.createRow(1).createCell(0).setCellValue(1);
		s.getRow(1).createCell(1).setCellValue("Monday");
		s.getRow(1).createCell(2).setCellValue("Snega");
		s.getRow(1).createCell(3).setCellValue("Suresh");
		FileOutputStream fo = new FileOutputStream(f);
		wo.write(fo);
		wo.close();
	}
	public static void main(String[] args) throws IOException {
		datasread();
		readpardata();
		writesdta();
	}
	}

