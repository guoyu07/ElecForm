package com.gs.chart;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

import com.gs.model.Elec;
/**
 * @author GaoShen
 * @packageName com.gs.chart
 */
public class MakeChart {
	private Logger logger = Logger.getLogger(this.getClass());
	private List<Elec> elecs;
	private Elec e;

	public List<Elec> getElecs() {
		return elecs;
	}

	public void setElecs(List<Elec> elecs) {
		this.elecs = elecs;
	}

	public CategoryDataset getDataSet() {
		DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		Iterator<Elec> iter = elecs.iterator();
		for (;iter.hasNext();) {
			e = iter.next();
			Integer day = e.getDay();
			dataset.addValue((double)e.getUsed(), "Apple", day.toString());
		}
		return dataset;
	}
	
	public void make(List<Elec> elecs) throws Exception{
			setElecs(elecs);
	        JFreeChart chart;
			try {
				chart = ChartFactory.createLineChart("Yong Dian Liang", // ͼ�����
						"Ri Qi", // Ŀ¼�����ʾ��ǩ
						"Dang Tian Yong Liang", // ��ֵ�����ʾ��ǩ
						getDataSet(), // ���ݼ�
						PlotOrientation.VERTICAL, // ͼ����ˮƽ����ֱ
						false, // �Ƿ���ʾͼ��(���ڼ򵥵���״ͼ������ false)
						false, // �Ƿ����ɹ���
						false // �Ƿ����� URL ����
						);
			} catch (Exception e) {
				logger.error(e.getMessage());
				throw e;
			} 
	                           
	        FileOutputStream fos_jpg = null; 
	        try { 
	            fos_jpg = new FileOutputStream("D://Elec//chart3333.jpg"); 
	            ChartUtilities.writeChartAsJPEG(fos_jpg,1.0f,chart,500,400,null); 
	        } catch(Exception e){
	        	logger.error(e.getMessage());
	        	e.printStackTrace();
	        }finally { 
	            try { 
	                fos_jpg.close(); 
	            } catch (Exception e) {
	            	logger.error(e.getMessage());
	            	throw e;
	            } 
	            logger.info("Chart Finish!");
	        } 
	}
}
