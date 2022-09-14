package com.swingGUIsample.frames;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JSplitPane;
import javax.swing.JToolBar;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JInternalFrame;
import javax.swing.JLayeredPane;

public class LDemo extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LDemo frame = new LDemo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LDemo() {
		setBackground(new Color(0, 0, 0));
		setForeground(new Color(255, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1033, 549);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ETPRO");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBackground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		lblNewLabel.setBounds(0, 0, 66, 64);
		contentPane.add(lblNewLabel);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setForeground(new Color(255, 255, 255));
		toolBar.setBackground(new Color(0, 0, 0));
		toolBar.setBounds(61, 0, 956, 64);
		contentPane.add(toolBar);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setForeground(new Color(0, 0, 0));
		layeredPane.setBackground(new Color(0, 0, 0));
		toolBar.add(layeredPane);
		
		JButton btnNewButton = new JButton("Tools");
		layeredPane.setLayer(btnNewButton, 1);
		btnNewButton.setBackground(new Color(0, 0, 0));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBounds(0, 39, 67, 23);
		layeredPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Quotes");
		btnNewButton_1.setBackground(new Color(0, 0, 0));
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBounds(63, 39, 79, 23);
		layeredPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Ticker");
		btnNewButton_2.setBackground(new Color(0, 0, 0));
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setBounds(137, 39, 79, 23);
		layeredPane.add(btnNewButton_2);
		
		JLabel lblNewLabel_1 = new JLabel("File");
		lblNewLabel_1.setBackground(new Color(0, 0, 0));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(0, 11, 62, 23);
		layeredPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Layout");
		lblNewLabel_1_1.setBackground(new Color(0, 0, 0));
		lblNewLabel_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setBounds(63, 9, 57, 27);
		layeredPane.add(lblNewLabel_1_1);
		
		JButton btnNewButton_3 = new JButton("Trade");
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_3.setBackground(new Color(0, 0, 0));
		btnNewButton_3.setForeground(new Color(255, 255, 255));
		btnNewButton_3.setBounds(216, 39, 67, 23);
		layeredPane.add(btnNewButton_3);
		
		JLabel lblNewLabel_2 = new JLabel("Settings");
		lblNewLabel_2.setBackground(new Color(0, 0, 0));
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(117, 11, 74, 23);
		layeredPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Help");
		lblNewLabel_3.setBackground(new Color(0, 0, 0));
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(195, 13, 63, 19);
		layeredPane.add(lblNewLabel_3);
		
		JToolBar toolBar_1 = new JToolBar();
		toolBar_1.setForeground(new Color(255, 255, 255));
		toolBar_1.setBackground(new Color(0, 0, 0));
		toolBar_1.setBounds(0, 480, 1017, 30);
		contentPane.add(toolBar_1);
		
		JButton btnNewButton_5 = new JButton("Connected O");
		btnNewButton_5.setForeground(new Color(0, 255, 0));
		btnNewButton_5.setBackground(new Color(0, 0, 0));
		toolBar_1.add(btnNewButton_5);
		
		JButton btnNewButton_4 = new JButton("Screen 1");
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_4.setForeground(new Color(255, 255, 255));
		btnNewButton_4.setBackground(new Color(0, 0, 0));
		toolBar_1.add(btnNewButton_4);
		
		JButton btnNewButton_4_1 = new JButton("Screen 2");
		btnNewButton_4_1.setForeground(Color.WHITE);
		btnNewButton_4_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_4_1.setBackground(Color.BLACK);
		toolBar_1.add(btnNewButton_4_1);
		
		JButton btnNewButton_6 = new JButton("Screen 3");
		btnNewButton_6.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_6.setBackground(new Color(0, 0, 0));
		btnNewButton_6.setForeground(new Color(255, 255, 255));
		toolBar_1.add(btnNewButton_6);
	}
}
