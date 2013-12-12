package com.gs.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import com.gs.DAO.ElecDAO;
import com.gs.model.Elec;

public class Export2Excel {
	private Logger logger = Logger.getLogger(this.getClass());
	public String fileToBeWrite = "D:\\Elec\\test.xls";
	public ElecDAO dao;
	public List<Elec> elecs;

	public void main() {
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet();
			get();
			elecs = dao.getElecs();
			HSSFRow row = sheet.createRow(0);
			row.createCell(0).setCellValue("����");
			row.createCell(1).setCellValue("�������");
			row.createCell(2).setCellValue("��ֵ");
			row.createCell(3).setCellValue("ʹ��");
			for (int j = 0; j < elecs.size(); j++) {
				Elec e = elecs.get(j);
				System.out.println(e);
				row = sheet.createRow(j + 1);
				row.createCell(0).setCellValue(e.getDate());
				row.createCell(1).setCellValue(e.getElecnum());
				row.createCell(2).setCellValue(e.getInputelec());
				row.createCell(3).setCellValue(e.getUsed());
			}
			FileOutputStream fileOut = new FileOutputStream(fileToBeWrite);
			workbook.write(fileOut);
			fileOut.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void get() {
		dao = new ElecDAO();
	}

}
