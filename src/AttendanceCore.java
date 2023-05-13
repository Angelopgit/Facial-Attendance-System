import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.opencv.core.Core;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.TextArea;
import java.awt.Label;
import java.awt.Font;
import java.awt.Canvas;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class AttendanceCore extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AttendanceCore frame = new AttendanceCore();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace(); 
				}
			}
		});
	}

	/**
	 * Create the frame. Button Controls
	 */ 
	public AttendanceCore() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 591, 530);
		contentPane = new JPanel(); 
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		Label label = new Label("Employee Attendance System");
		label.setForeground(new Color(255, 255, 255));
		label.setFont(new Font("Arial Black", Font.BOLD, 39));
		contentPane.add(label);
		
		JButton btnNewButton = new JButton("Start Attendance");
		btnNewButton.setBackground(new Color(0, 128, 64));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
				JavaCam jvcm = new JavaCam();
				jvcm.show();
				dispose();
			}  
		});
		 
		JButton btnManualAttendance = new JButton("Manual Attendance");
		btnManualAttendance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			} 
		});
		btnManualAttendance.setBackground(new Color(255, 128, 0));
		contentPane.add(btnManualAttendance);
		contentPane.add(btnNewButton);
		  
		JButton btnExitMenu = new JButton("Exit Menu");
		btnExitMenu.setBackground(new Color(0, 128, 64));
		contentPane.add(btnExitMenu);
		
		Canvas canvas = new Canvas();
		contentPane.add(canvas); 
		
	}

}
