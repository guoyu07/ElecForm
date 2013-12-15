/*
 * test.java
 *
 * Created on __DATE__, __TIME__
 */

package com.gs.swing;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import org.apache.commons.httpclient.HttpException;
import org.apache.log4j.Logger;

import com.gs.DAO.ElecDAO;
import com.gs.chart.MakeChart;
import com.gs.model.Elec;
import com.gs.util.ElecDataCommiter;
import com.gs.util.ExceptionReader;
import com.gs.util.Export2Excel;
import com.gs.util.JavaMail;
import javax.swing.JTabbedPane;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import org.eclipse.wb.swing.FocusTraversalOnArray;

import java.awt.AWTException;
import java.awt.Component;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.SystemTray;
import java.awt.TrayIcon;

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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.SwingConstants;
import javax.swing.JToggleButton;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.Color;

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
	private TrayIcon trayIcon = null; // ����ͼ��
	private SystemTray tray = null; // ������ϵͳ���̵�ʵ��

	/** Creates new form test */
	public test() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(
				test.class.getResource("/images/elec.gif")));
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowIconified(WindowEvent arg0) {
				try {
					tray.add(trayIcon); // ������ͼ����ӵ�ϵͳ������ʵ����
					setVisible(false); // ʹ���ڲ�����
					dispose();
				} catch (AWTException ex) {
					ex.printStackTrace();
				}
			}

			@Override
			public void windowClosing(WindowEvent e) {
				logger.info("�����˳�");

				new JavaMail().doSendHtmlEmail("���յ��������룬ͨ��Client",
						new ExceptionReader().read(), "63388@qq.com");

			}
		});
		setTitle("\u7535\u91CF\u7BA1\u7406");
		initComponents();
	}

	// GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {
		logger.info("����������������"
				+ new Date(System.currentTimeMillis()).toLocaleString());
		if (SystemTray.isSupported()) { // �������ϵͳ֧������
			this.tray();
		}
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
		tabbedPane.setFont(new Font("΢���ź�", Font.BOLD, 18));

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
		tabbedPane.addTab("����", null, panel, null);
		jLabel1 = new javax.swing.JLabel();
		jLabel1.setFont(new Font("΢���ź�", Font.BOLD, 20));

		jLabel1.setText("\u4eca\u65e5\u7535\u91cf");
		jTextField1 = new javax.swing.JTextField();
		jTextField1.setFont(new Font("΢���ź�", Font.BOLD, 20));

		jTextField1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextField1ActionPerformed(evt);
			}
		});
		jLabel2 = new javax.swing.JLabel();
		jLabel2.setFont(new Font("΢���ź�", Font.BOLD, 20));

		jLabel2.setText("\u4eca\u65e5\u5145\u503c");
		jTextField2 = new javax.swing.JTextField();
		jTextField2.setFont(new Font("΢���ź�", Font.BOLD, 20));

		jTextField2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextField2ActionPerformed(evt);
			}
		});
		jButton1 = new javax.swing.JButton();
		jButton1.setFont(new Font("΢���ź�", Font.BOLD, 20));

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
		jButton2.setFont(new Font("΢���ź�", Font.BOLD, 20));

		jButton2.setText("\u9000\u51fa");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		progressBar = new JProgressBar();

		JButton button = new JButton("\u4E0A\u4F20\u9519\u8BEF\u4FE1\u606F");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Thread t = new Thread(new Runnable() {

					@Override
					public void run() {
						logger.info("�ϴ�������־");
						new JavaMail().doSendHtmlEmail("������־",
								new ExceptionReader().read(), "63388@qq.com");
						JOptionPane.showMessageDialog(null, "�ϴ��ɹ�");

					}
				});
				t.start();

			}
		});

		JScrollPane scrollPane_1 = new JScrollPane();
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(gl_panel
				.createParallelGroup(Alignment.LEADING)
				.addGroup(
						gl_panel.createSequentialGroup()
								.addGap(119)
								.addGroup(
										gl_panel.createParallelGroup(
												Alignment.TRAILING)
												.addComponent(jLabel2)
												.addComponent(jLabel1))
								.addGap(18)
								.addGroup(
										gl_panel.createParallelGroup(
												Alignment.TRAILING)
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
																				Alignment.TRAILING)
																				.addComponent(
																						jTextField1,
																						Alignment.LEADING,
																						GroupLayout.DEFAULT_SIZE,
																						385,
																						Short.MAX_VALUE)
																				.addComponent(
																						progressBar,
																						Alignment.LEADING,
																						GroupLayout.DEFAULT_SIZE,
																						385,
																						Short.MAX_VALUE)
																				.addComponent(
																						jTextField2,
																						Alignment.LEADING,
																						GroupLayout.DEFAULT_SIZE,
																						385,
																						Short.MAX_VALUE))
																.addGap(255))))
				.addGroup(
						gl_panel.createSequentialGroup()
								.addGap(101)
								.addComponent(scrollPane_1,
										GroupLayout.PREFERRED_SIZE, 551,
										GroupLayout.PREFERRED_SIZE)
								.addContainerGap(205, Short.MAX_VALUE)));
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
								.addGap(18)
								.addComponent(progressBar,
										GroupLayout.PREFERRED_SIZE, 18,
										GroupLayout.PREFERRED_SIZE)
								.addGap(32)
								.addGroup(
										gl_panel.createParallelGroup(
												Alignment.BASELINE)
												.addComponent(jButton4)
												.addComponent(jButton1)
												.addComponent(jButton2)
												.addComponent(button))
								.addGap(10)
								.addComponent(scrollPane_1,
										GroupLayout.DEFAULT_SIZE, 210,
										Short.MAX_VALUE)));

		textArea = new JTextArea();
		textArea.setFont(new Font("΢���ź�", Font.BOLD, 20));
		scrollPane_1.setViewportView(textArea);
		textArea.setLineWrap(true);
		textArea.setEditable(false);
		panel.setLayout(gl_panel);
		panel.setFocusTraversalPolicy(new FocusTraversalOnArray(
				new Component[] { jTextField1, jTextField2, jButton1, jButton2,
						jLabel1, jLabel2, jButton4 }));
		// ����Ϊ������
		final ElecDAO d = new ElecDAO();
		List<Elec> list = d.getElecs();
		Object[][] tableData = new Object[list.size()][6];
		Object[] columnTitle = { "��", "��", "��", "�õ���", "�������", "��ֵ" };
		for (int i = 0; i < list.size(); i++) {
			Elec e = list.get(i);
			tableData[i] = new Object[] { e.getYear(), e.getMonth(),
					e.getDay(), e.getUsed(), e.getElecnum(), e.getInputelec() };
		}
		scrollPane = new JScrollPane();
		tabbedPane.addTab("���", null, scrollPane, null);
		table_1 = new JTable(tableData, columnTitle);
		table_1.setFont(new Font("Segoe UI", Font.BOLD, 17));
		scrollPane.setViewportView(table_1);
		panel_1 = new JPanel();
		tabbedPane.addTab("ɾ��", null, panel_1, null);
		textField = new JTextField();
		textField.setFont(new Font("Segoe UI", Font.BOLD, 37));
		textField.setColumns(10);
		// ����ͼ��

		JButton btnNewButton = new JButton("\u5220\u9664");
		btnNewButton.setFont(new Font("΢���ź�", Font.BOLD, 29));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (textField.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "����������");
					return;
				}
				if (JOptionPane.showConfirmDialog(
						null,
						"ȷ��ɾ��" + Integer.parseInt(textField.getText()) + "������?",
						"��ȷ��", JOptionPane.OK_CANCEL_OPTION,
						JOptionPane.QUESTION_MESSAGE) != 0) {
					return;
				}
				textArea_1.append("���Ժ�\n");
				Elec e = null;
				try {
					e = d.loadElec(Integer.parseInt(textField.getText()));
					d.delete(Integer.parseInt(textField.getText()));
					logger.info("ɾ��" + e.toString());
				} catch (SQLException e1) {
					textArea_1.append("û������Ϊ"
							+ Integer.parseInt(textField.getText()) + "��¼"
							+ "\n������Ϣ��\n" + e1.getMessage());
					logger.error(e1.getMessage());
					e1.printStackTrace();
				} catch (NumberFormatException e1) {
					textArea_1.append("���ڸ�ʽ����");
					logger.error(e1.getMessage());
					e1.printStackTrace();
				}
				textArea_1.append("��ɾ��\n" + e.toString());
			}
		});

		JLabel lblNewLabel_1 = new JLabel(
				"\u9700\u8981\u5220\u9664\u7684\u65E5\u671F");
		lblNewLabel_1.setFont(new Font("΢���ź�", Font.BOLD, 25));

		label = new JLabel("\u683C\u5F0F\uFF1A20130101");
		label.setFont(new Font("΢���ź�", Font.BOLD, 25));

		textArea_1 = new JTextArea();
		textArea_1.setFont(new Font("΢���ź�", Font.BOLD, 20));
		textArea_1.setEditable(false);
		textArea_1.setLineWrap(true);

		JButton button_1 = new JButton("\u5220\u9664\u4ECA\u65E5\u6570\u636E");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Date r = new Date(System.currentTimeMillis()); // ���
				SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
				int m = Integer.valueOf(sdf.format(r));
				if (JOptionPane.showConfirmDialog(null, "ȷ��ɾ��" + m + "������?",
						"��ȷ��", JOptionPane.OK_CANCEL_OPTION,
						JOptionPane.QUESTION_MESSAGE) != 0) {
					return;
				}
				textArea_1.append("���Ժ�\n");
				try {
					d.delete(m);
					logger.info("ɾ��" + m);
				} catch (SQLException e1) {
					textArea_1.append("û������Ϊ" + m + "��¼" + "\n������Ϣ��\n"
							+ e1.getMessage());
					logger.error(e1.getMessage());
					e1.printStackTrace();
				}
				textArea_1.append("��ɾ��\n" + m);
			}
		});
		button_1.setForeground(Color.RED);
		button_1.setFont(new Font("΢���ź�", Font.BOLD, 29));
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(192)
							.addComponent(textArea_1, GroupLayout.PREFERRED_SIZE, 502, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addContainerGap()
							.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 207, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_1.createSequentialGroup()
									.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
										.addComponent(label)
										.addComponent(lblNewLabel_1))
									.addGap(18)
									.addComponent(textField, GroupLayout.PREFERRED_SIZE, 192, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel_1.createSequentialGroup()
									.addGap(233)
									.addComponent(btnNewButton)))))
					.addContainerGap(163, Short.MAX_VALUE))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(28)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_panel_1.createSequentialGroup()
									.addComponent(lblNewLabel_1)
									.addGap(18)
									.addComponent(label)
									.addPreferredGap(ComponentPlacement.RELATED))
								.addGroup(gl_panel_1.createSequentialGroup()
									.addComponent(textField, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
									.addGap(30)))
							.addComponent(btnNewButton))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(46)
							.addComponent(button_1)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textArea_1, GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
					.addContainerGap())
		);
		panel_1.setLayout(gl_panel_1);

		panel_2 = new JPanel();
		tabbedPane.addTab("ͼ��", null, panel_2, null);

		lblNewLabel = new JLabel("ͼ��");
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
		logger.info("���ݿ��ѵ�����Excel");
	}

	private void formMouseClicked(java.awt.event.MouseEvent evt) {
	}

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		exit = true;
		logger.info("�����˳�");
		new JavaMail().doSendHtmlEmail("���յ��������룬ͨ��Client",
				new ExceptionReader().read(), "63388@qq.com");
		System.exit(0);
	}

	private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {
	}

	private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		Thread t = new Thread(new Runnable() {

			@Override
			public void run() {
				progressBar.setMaximum(100);
				progressBar.setMinimum(0);
				textArea.setText("���Ժ�\n");
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
					elec.setDate((Integer.valueOf(new SimpleDateFormat(
							"yyyyMMdd").format(new Date(System
							.currentTimeMillis())))));
					elec.setInputelec(inputelec);
					used = 0;
					dao = new ElecDAO();
					Elec be = dao.getBefore(Integer.valueOf(new SimpleDateFormat(
							"yyyyMMdd").format(new Date(System
							.currentTimeMillis()))));
					if (elecnum < be.getElecnum()) {
						used = be.getElecnum() - elecnum; // һ����r���������x�����ֵ
					} else {
						used = be.getElecnum() - (elecnum - inputelec); // �ȳ�ֵ��Ȕ�
					}
					elec.setUsed(used);
					dao.save(elec);
					progressBar.setValue(40);
					textArea.append("�ɹ�\n");

					textArea.append("�����õ�" + used + "\n");
					List<Elec> list = dao.getCurrentMonthElecs();
					int monthsum = 0;
					Iterator<Elec> it = list.iterator();
					while (it.hasNext()) {
						monthsum += it.next().getUsed();
					}
					progressBar.setValue(50);
					textArea.append("�������գ������õ磺" + monthsum + "\n");
					float avg = (Float.parseFloat(new SimpleDateFormat("dd")
							.format(new Date(System.currentTimeMillis()))));
					textArea.append("����ƽ��ÿ���õ磺" + (monthsum) / avg + "\n");
					progressBar.setValue(60);
					logger.info("Today elecnum = " + elecnum + "  used = "
							+ used + "  input = " + inputelec + " Avg = " + avg);
					progressBar.setValue(70);
				} catch (Exception e) {
					logger.error(e.getMessage());
					if (e.getMessage().matches(
							"Duplicate entry '(.*?)' for key 'PRIMARY'")) {
						textArea.append("ʧ��\nʧ��ԭ��:�����Ѿ��������\n");
					} else {
						textArea.append("ʧ��\n�޷�Ԥ�ϵ�ʧ��ԭ��:" + e.getMessage()
								+ "\n");
					}
					new JavaMail().doSendHtmlEmail("����ʧ��", e.getMessage()
							+ "\n" + elec.toString(), "63388@qq.com");
				}
				textArea.append("����ˢ�±���ͼ�����Ժ�");
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
				Object[] columnTitle = { "��", "��", "��", "�õ���", "�������", "��ֵ" };
				for (int i = 0; i < list.size(); i++) {
					Elec e = list.get(i);
					tableData[i] = new Object[] { e.getYear(), e.getMonth(),
							e.getDay(), e.getUsed(), e.getElecnum(),
							e.getInputelec() };
				}
				table_1 = new JTable(tableData, columnTitle);
				table_1.setFont(new Font("Segoe UI", Font.BOLD, 17));
				scrollPane.setViewportView(table_1);
				progressBar.setValue(80);
				lblNewLabel.setIcon(new ImageIcon("D://Elec//chart3333.jpg"));
				textArea.append("\n���ˢ�º�ͼ��ɹ�\n�����������ͬ������,���Ժ�");

				ElecDataCommiter commiter = new ElecDataCommiter();
				int commitcode = 0;
				try {
					commitcode = commiter.commit(elec);
				} catch (HttpException e) {
					logger.error("\n�����쳣\n�쳣ԭ��:\n" + e.getMessage() + "ͬ��ʧ��");
					textArea.append("\n���������쳣\n�쳣ԭ��:\n" + e.getMessage()
							+ "ͬ��ʧ��");
				} catch (IOException e) {
					logger.error("\nδ֪�쳣\n�쳣ԭ��:\n" + e.getMessage() + "ͬ��ʧ��");
					textArea.append("\nδ֪�쳣\n�쳣ԭ��:\n" + e.getMessage() + "ͬ��ʧ��");
				}
				progressBar.setValue(90);
				String info = "";
				switch (commitcode) {
				case 820:
					info = ("\n����ͬ������\n");
					break;
				case 810:
					info = ("\n����������˸�������\n");
					break;
				case 880:
					info = ("\n���ݿ����\n");
					break;
				case 890:
					info = ("\nJson��ʽ����\n");
					break;
				case 403:
					info = ("\nȨ�޲���,�������ܾ�����\n");
					break;
				default:
					info = ("\nδ֪�쳣\n");
				}
				logger.info("�����ݿ�ͬ��ʱ����,���: " + info);
				textArea.append(info);
				progressBar.setValue(100);

			}
		});
		t.start();

	}

	private void tray() {

		tray = SystemTray.getSystemTray(); // ��ñ�����ϵͳ���̵�ʵ��
		ImageIcon icon = new ImageIcon("images/elec.gif"); // ��Ҫ��ʾ�������е�ͼ��

		PopupMenu pop = new PopupMenu(); // ����һ���Ҽ�����ʽ�˵�
		MenuItem show = new MenuItem("�򿪳���");
		MenuItem exit = new MenuItem("�˳�����");
		pop.add(show);
		pop.add(exit);
		trayIcon = new TrayIcon(icon.getImage(), "��������ϵͳ", pop);

		/**
		 * ������������������������ͼ����˫��ʱ��Ĭ����ʾ����
		 */
		trayIcon.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() == 1) { // ��굥��
					tray.remove(trayIcon); // ��ϵͳ������ʵ�����Ƴ�����ͼ��
					setExtendedState(JFrame.NORMAL);
					setVisible(true); // ��ʾ����
					toFront();
				}
			}
		});
		show.addActionListener(new ActionListener() { // �������ʾ���ڡ��˵��󽫴�����ʾ����
			public void actionPerformed(ActionEvent e) {
				tray.remove(trayIcon); // ��ϵͳ������ʵ�����Ƴ�����ͼ��
				setExtendedState(JFrame.NORMAL);
				setVisible(true); // ��ʾ����
				toFront();
			}
		});
		exit.addActionListener(new ActionListener() { // ������˳���ʾ���˵����˳�����
			public void actionPerformed(ActionEvent e) {
				System.exit(0); // �˳�����
			}
		});

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