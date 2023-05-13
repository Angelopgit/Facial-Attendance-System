import java.awt.EventQueue;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.core.MatOfRect;
import org.opencv.core.Rect;
import org.opencv.core.Scalar;
import org.opencv.core.Size;
import org.opencv.core.CvType;
import org.opencv.videoio.VideoCapture;
import org.opencv.imgproc.Imgproc;
import org.opencv.objdetect.CascadeClassifier;
import org.opencv.imgcodecs.Imgcodecs;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.Dimension;


public class JavaCam extends JFrame {
	 private VideoCapture videoCapture;
	 private BufferedImage bufferedImage;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
    	System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try { 
					JavaCam frame = new JavaCam();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace(); 
				}
			} 
		});
		  
	}
 
// 
// Create the frame.   Init Java Panel 
//
	public JavaCam() {
		getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JPanel panel = new JPanel();
		panel.setSize(new Dimension(100, 100));
		panel.setMinimumSize(new Dimension(100, 100));
		panel.setBackground(new Color(192, 192, 192));
		getContentPane().add(panel);

		videoCapture = new VideoCapture(0);

 
	}
	 

}
