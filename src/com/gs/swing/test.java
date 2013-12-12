/*
 * test.java
 *
 * Created on __DATE__, __TIME__
 */

package com.gs.swing;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import org.apache.log4j.Logger;

import com.gs.DAO.ElecDAO;
import com.gs.chart.MakeChart;
import com.gs.model.Elec;
import com.gs.util.ExceptionReader;
import com.gs.util.Export2Excel;
import com.gs.util.JavaMail;
import javax.swing.JTabbedPane;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JProgressBar;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.SwingConstants;
import javax.swing.JToggleButton;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * 
 * @author __USER__
 */
public class test extends javax.swing.JFrame {
	private static Logger logger = Logger.getLogger(test.class);
	private static boolean exit = false;
	// GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton4;
	private javax.swing.JFrame jFrame1;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JTextField jTextField1;
	private javax.swing.JTextField jTextField2;
	private JTabbedPane tabbedPane;
	private JPanel panel;
	private JScrollPane scrollPane;
	private JTable table_1;
	private JTextArea textArea;
	private JProgressBar progressBar;
	private JPanel panel_1;
	private JTextField textField;
	private JLabel label;
	private JTextArea textArea_1;
	private JPanel panel_2;
	private JLabel lblNewLabel;

	/** Creates new form test */
	public test() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				logger.info("窗体退出");
				new JavaMail().doSendHtmlEmail("今日电量已输入，通过Client",
						new ExceptionReader().read(), "63388@qq.com");
			}
		});
		setTitle("\u7535\u91CF\u7BA1\u7406");
		initComponents();
	}

	// GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {
		logger.info("电量管理中心启动"
				+ new Date(System.currentTimeMillis()).toLocaleString());
		jFrame1 = new javax.swing.JFrame();
		jLabel3 = new javax.swing.JLabel();

		javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(
				jFrame1.getContentPane());
		jFrame1.getContentPane().setLayout(jFrame1Layout);
		jFrame1Layout.setHorizontalGroup(jFrame1Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 400,
				Short.MAX_VALUE));
		jFrame1Layout.setVerticalGroup(jFrame1Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 300,
				Short.MAX_VALUE));

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				formMouseClicked(evt);
			}
		});

		tabbedPane = new JTabbedPane(JTabbedPane.TOP);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		layout.setHorizontalGroup(layout
				.createParallelGroup(Alignment.TRAILING).addGroup(
						layout.createSequentialGroup()
								.addComponent(tabbedPane,
										GroupLayout.DEFAULT_SIZE, 784,
										Short.MAX_VALUE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(jLabel3,
										GroupLayout.PREFERRED_SIZE, 0,
										GroupLayout.PREFERRED_SIZE)
								.addContainerGap()));
		layout.setVerticalGroup(layout
				.createParallelGroup(Alignment.TRAILING)
				.addGroup(
						layout.createSequentialGroup()
								.addContainerGap(362, Short.MAX_VALUE)
								.addComponent(jLabel3).addGap(108))
				.addComponent(tabbedPane, GroupLayout.DEFAULT_SIZE, 470,
						Short.MAX_VALUE));

		panel = new JPanel();
		tabbedPane.addTab("输入", null, panel, null);
		jLabel1 = new javax.swing.JLabel();

		jLabel1.setText("\u4eca\u65e5\u7535\u91cf");
		jTextField1 = new javax.swing.JTextField();

		jTextField1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextField1ActionPerformed(evt);
			}
		});
		jLabel2 = new javax.swing.JLabel();

		jLabel2.setText("\u4eca\u65e5\u5145\u503c");
		jTextField2 = new javax.swing.JTextField();

		jTextField2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextField2ActionPerformed(evt);
			}
		});
		jButton1 = new javax.swing.JButton();

		jButton1.setText("\u597d");

		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});
		jButton4 = new javax.swing.JButton();

		jButton4.setText("\u5BFC\u51FA");
		jButton4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton4ActionPerformed(evt);
			}
		});
		jButton2 = new javax.swing.JButton();

		jButton2.setText("\u9000\u51fa");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		textArea = new JTextArea();
		textArea.setLineWrap(true);
		textArea.setEditable(false);

		progressBar = new JProgressBar();

		JButton button = new JButton("\u4E0A\u4F20\u9519\u8BEF\u4FE1\u606F");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				logger.info("上传错误日志");
				new JavaMail().doSendHtmlEmail("错误日志",
						new ExceptionReader().read(), "63388@qq.com");
			}
		});
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(gl_panel
				.createParallelGroup(Alignment.LEADING)
				.addGroup(
						gl_panel.createSequentialGroup()
								.addGap(255)
								.addComponent(progressBar,
										GroupLayout.PREFERRED_SIZE, 167,
										GroupLayout.PREFERRED_SIZE)
								.addContainerGap(357, Short.MAX_VALUE))
				.addGroup(
						gl_panel.createSequentialGroup()
								.addGap(123)
								.addGroup(
										gl_panel.createParallelGroup(
												Alignment.TRAILING)
												.addComponent(jLabel2)
												.addComponent(jLabel1))
								.addPreferredGap(ComponentPlacement.RELATED)
								.addGroup(
										gl_panel.createParallelGroup(
												Alignment.LEADING)
												.addGroup(
														gl_panel.createSequentialGroup()
																.addComponent(
																		jButton4)
																.addGap(72)
																.addComponent(
																		jButton1)
																.addGap(87)
																.addComponent(
																		jButton2)
																.addGap(53)
																.addComponent(
																		button)
																.addGap(140))
												.addGroup(
														gl_panel.createSequentialGroup()
																.addGroup(
																		gl_panel.createParallelGroup(
																				Alignment.LEADING)
																				.addComponent(
																						textArea,
																						GroupLayout.DEFAULT_SIZE,
																						349,
																						Short.MAX_VALUE)
																				.addComponent(
																						jTextField2,
																						GroupLayout.DEFAULT_SIZE,
																						349,
																						Short.MAX_VALUE)
																				.addComponent(
																						jTextField1,
																						349,
																						349,
																						Short.MAX_VALUE))
																.addGap(255)))));
		gl_panel.setVerticalGroup(gl_panel
				.createParallelGroup(Alignment.LEADING)
				.addGroup(
						gl_panel.createSequentialGroup()
								.addGap(47)
								.addGroup(
										gl_panel.createParallelGroup(
												Alignment.BASELINE)
												.addComponent(jLabel1)
												.addComponent(
														jTextField1,
														GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE,
														GroupLayout.PREFERRED_SIZE))
								.addGap(27)
								.addGroup(
										gl_panel.createParallelGroup(
												Alignment.BASELINE)
												.addComponent(jLabel2)
												.addComponent(
														jTextField2,
														GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE,
														GroupLayout.PREFERRED_SIZE))
								.addGap(15)
								.addComponent(progressBar,
										GroupLayout.PREFERRED_SIZE, 18,
										GroupLayout.PREFERRED_SIZE)
								.addGap(35)
								.addGroup(
										gl_panel.createParallelGroup(
												Alignment.BASELINE)
												.addComponent(jButton4)
												.addComponent(jButton1)
												.addComponent(jButton2)
												.addComponent(button))
								.addGap(39)
								.addComponent(textArea,
										GroupLayout.PREFERRED_SIZE, 207,
										GroupLayout.PREFERRED_SIZE)
								.addContainerGap(14, Short.MAX_VALUE)));
		panel.setLayout(gl_panel);
		panel.setFocusTraversalPolicy(new FocusTraversalOnArray(
				new Component[] { jTextField1, jTextField2, jButton1, jButton2,
						jLabel1, jLabel2, jButton4 }));
		// 以下为表格加载
		final ElecDAO d = new ElecDAO();
		List<Elec> list = d.getElecs();
		Object[][] tableData = new Object[list.size()][6];
		Object[] columnTitle = { "年", "月", "日", "用电量", "当天电量", "充值" };
		for (int i = 0; i < list.size(); i++) {
			Elec e = list.get(i);
			tableData[i] = new Object[] { e.getYear(), e.getMonth(),
					e.getDay(), e.getUsed(), e.getElecnum(), e.getInputelec() };
		}
		scrollPane = new JScrollPane();
		tabbedPane.addTab("表格", null, scrollPane, null);
		table_1 = new JTable(tableData, columnTitle);
		scrollPane.setViewportView(table_1);
		panel_1 = new JPanel();
		tabbedPane.addTab("删除", null, panel_1, null);
		textField = new JTextField();
		textField.setColumns(10);
		// 加载图表
		// lblNewLabel.setIcon(new ImageIcon("D://Elec//chart3333.jpg"));

		JButton btnNewButton = new JButton("\u5220\u9664");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textArea_1.append("请稍候\n");
				Elec e = null;
				try {
					e = d.loadElec(Integer.parseInt(textField.getText()));
					d.delete(Integer.parseInt(textField.getText()));
					logger.info("删除" + e.toString());
				} catch (SQLException e1) {
					textArea_1.append("没有日期为"+Integer.parseInt(textField.getText())+"记录" + "\n错误信息：\n" + e1.getMessage());
					logger.error(e1.getMessage());
					e1.printStackTrace();
				}catch (NumberFormatException e1) {
					textArea_1.append("日期格式错误");
					logger.error(e1.getMessage());
					e1.printStackTrace();
				} 
				textArea_1.append("已删除\n" + e.toString());
			}
		});

		JLabel lblNewLabel_1 = new JLabel(
				"\u9700\u8981\u5220\u9664\u7684\u65E5\u671F");

		label = new JLabel("\u683C\u5F0F\uFF1A20130101");

		textArea_1 = new JTextArea();
		textArea_1.setEditable(false);
		textArea_1.setLineWrap(true);
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1
				.setHorizontalGroup(gl_panel_1
						.createParallelGroup(Alignment.LEADING)
						.addGroup(
								gl_panel_1.createSequentialGroup()
										.addContainerGap(392, Short.MAX_VALUE)
										.addComponent(btnNewButton).addGap(330))
						.addGroup(
								gl_panel_1
										.createSequentialGroup()
										.addGap(196)
										.addGroup(
												gl_panel_1
														.createParallelGroup(
																Alignment.LEADING)
														.addComponent(
																textArea_1,
																GroupLayout.PREFERRED_SIZE,
																502,
																GroupLayout.PREFERRED_SIZE)
														.addGroup(
																gl_panel_1
																		.createSequentialGroup()
																		.addGroup(
																				gl_panel_1
																						.createParallelGroup(
																								Alignment.LEADING)
																						.addComponent(
																								lblNewLabel_1)
																						.addComponent(
																								label))
																		.addGap(45)
																		.addComponent(
																				textField,
																				GroupLayout.PREFERRED_SIZE,
																				192,
																				GroupLayout.PREFERRED_SIZE)))
										.addContainerGap(81, Short.MAX_VALUE)));
		gl_panel_1
				.setVerticalGroup(gl_panel_1
						.createParallelGroup(Alignment.LEADING)
						.addGroup(
								gl_panel_1
										.createSequentialGroup()
										.addGap(112)
										.addGroup(
												gl_panel_1
														.createParallelGroup(
																Alignment.TRAILING)
														.addGroup(
																gl_panel_1
																		.createSequentialGroup()
																		.addComponent(
																				lblNewLabel_1)
																		.addPreferredGap(
																				ComponentPlacement.UNRELATED)
																		.addComponent(
																				label))
														.addComponent(
																textField,
																GroupLayout.PREFERRED_SIZE,
																25,
																GroupLayout.PREFERRED_SIZE))
										.addGap(38)
										.addComponent(btnNewButton)
										.addGap(32)
										.addComponent(textArea_1,
												GroupLayout.PREFERRED_SIZE,
												153, GroupLayout.PREFERRED_SIZE)
										.addContainerGap(69, Short.MAX_VALUE)));
		panel_1.setLayout(gl_panel_1);

		panel_2 = new JPanel();
		tabbedPane.addTab("图表", null, panel_2, null);

		lblNewLabel = new JLabel("图表");
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(gl_panel_2.createParallelGroup(
				Alignment.LEADING).addGroup(
				gl_panel_2.createSequentialGroup().addGap(115)
						.addComponent(lblNewLabel)
						.addContainerGap(136, Short.MAX_VALUE)));
		gl_panel_2.setVerticalGroup(gl_panel_2.createParallelGroup(
				Alignment.LEADING).addGroup(
				gl_panel_2
						.createSequentialGroup()
						.addGap(57)
						.addComponent(lblNewLabel)
						.addContainerGap(GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE)));
		panel_2.setLayout(gl_panel_2);
		getContentPane().setLayout(layout);
		lblNewLabel.setIcon(new ImageIcon("D://Elec//chart3333.jpg"));
		pack();
	}// </editor-fold>
		// GEN-END:initComponents

	private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
		Export2Excel e = new Export2Excel();
		e.main();
		logger.info("数据库已导出到Excel");
	}

	private void formMouseClicked(java.awt.event.MouseEvent evt) {
	}

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		exit = true;
		logger.info("窗体退出");
		new JavaMail().doSendHtmlEmail("今日电量已输入，通过Client",
				new ExceptionReader().read(), "63388@qq.com");
		System.exit(0);
	}

	private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {
	}

	private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		progressBar.setMaximum(100);
		progressBar.setMinimum(0);
		textArea.setText("请稍候\n");
		textArea.paintImmediately(textArea.getBounds());
		progressBar.setValue(10);
		int elecnum = (Integer.parseInt(jTextField1.getText()));
		if (jTextField2.getText().equals(""))
			jTextField2.setText("0");
		int inputelec = (Integer.parseInt(jTextField2.getText()));
		Elec elec = null;
		ElecDAO dao = null;
		progressBar.setValue(20);
		int used = 0;
		try {
			elec = new Elec();
			elec.setDay(Integer.valueOf(new SimpleDateFormat("d")
					.format(new Date(System.currentTimeMillis()))));
			elec.setElecnum(elecnum);
			elec.setMonth(Integer.valueOf(new SimpleDateFormat("M")
					.format(new Date(System.currentTimeMillis()))));
			elec.setYear(Integer.valueOf(new SimpleDateFormat("yyyy")
					.format(new Date(System.currentTimeMillis()))));
			elec.setDate((Integer.valueOf(new SimpleDateFormat("yyyyMMdd")
					.format(new Date(System.currentTimeMillis())))));
			elec.setInputelec(inputelec);
			used = 0;
			dao = new ElecDAO();
			Elec be = dao.getBefore(Integer.valueOf(new SimpleDateFormat(
					"yyyyMMdd").format(new Date(System.currentTimeMillis()))));
			if (elecnum < be.getElecnum()) {
				used = be.getElecnum() - elecnum; // 一般情況，或者先讀數后充值
			} else {
				used = be.getElecnum() - (elecnum - inputelec); // 先充值后度數
			}
			elec.setUsed(used);
			dao.save(elec);
			progressBar.setValue(40);
			textArea.append("成功\n");
			textArea.paintImmediately(textArea.getBounds());

			textArea.append("今日用电" + used + "\n");
			textArea.paintImmediately(textArea.getBounds());
			List<Elec> list = dao.getCurrentMonthElecs();
			int monthsum = 0;
			Iterator<Elec> it = list.iterator();
			while (it.hasNext()) {
				monthsum += it.next().getUsed();
			}
			progressBar.setValue(60);
			textArea.append("截至今日，本月用电：" + monthsum + "\n");
			textArea.paintImmediately(textArea.getBounds());
			float avg = (Float.parseFloat(new SimpleDateFormat("dd")
					.format(new Date(System.currentTimeMillis()))));
			textArea.append("本月平均每日用电：" + (monthsum) / avg + "\n");
			textArea.paintImmediately(textArea.getBounds());
			progressBar.setValue(80);
			logger.info("Today elecnum = " + elecnum + "  used = " + used
					+ "  input = " + inputelec + " Avg = " + avg);
			/*
			 * new JavaMail().doSendHtmlEmail( "今日电量已输入，通过Client",
			 * "Today elecnum = " + elecnum + "  used = " + used + "  input = "
			 * + inputelec + new ExceptionReader().read(), "63388@qq.com");
			 */
			progressBar.setValue(90);
		} catch (Exception e) {
			logger.error(e.getMessage());
			if (e.getMessage().matches(
					"Duplicate entry '(.*?)' for key 'PRIMARY'")) {
				textArea.append("失败\n失败原因:今日已经输入过了\n");
				textArea.paintImmediately(textArea.getBounds());
			} else {
				textArea.append("失败\n无法预料的失败原因:" + e.getMessage() + "\n");
				textArea.paintImmediately(textArea.getBounds());
			}
			new JavaMail().doSendHtmlEmail("输入失败",
					e.getMessage() + "\n" + elec.toString(), "63388@qq.com");
		}
		textArea.append("正在刷新表格和图表，请稍候。");
		textArea.paintImmediately(textArea.getBounds());
		MakeChart c = new MakeChart();
		ElecDAO d = new ElecDAO();
		try {
			c.make(d.getCurrentMonthElecs());
		} catch (Exception e) {
			logger.error(e.getMessage());
			e.printStackTrace();
		}
		List<Elec> list = d.getElecs();
		Object[][] tableData = new Object[list.size()][6];
		Object[] columnTitle = { "年", "月", "日", "用电量", "当天电量", "充值" };
		for (int i = 0; i < list.size(); i++) {
			Elec e = list.get(i);
			tableData[i] = new Object[] { e.getYear(), e.getMonth(),
					e.getDay(), e.getUsed(), e.getElecnum(), e.getInputelec() };
		}
		table_1 = new JTable(tableData, columnTitle);
		scrollPane.setViewportView(table_1);
		progressBar.setValue(100);
		lblNewLabel.setIcon(new ImageIcon("D://Elec//chart3333.jpg"));
		textArea.append("\n表格刷新和图表成功");
		textArea.paintImmediately(textArea.getBounds());

	}

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				MakeChart c = new MakeChart();
				ElecDAO d = new ElecDAO();
				try {
					c.make(d.getCurrentMonthElecs());
				} catch (Exception e) {
					logger.error(e.getMessage());
					e.printStackTrace();
				}
				new test().setVisible(true);

			}
		});
	}
}