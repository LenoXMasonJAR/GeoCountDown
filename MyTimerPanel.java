package project1;



import javax.swing.*;
import javax.swing.JPanel;
import javax.swing.Timer;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/*************************************************************************
 * GUI for the GeoCountDownTimer
 * 
 * @author Mason Mahoney
 * @version 9/15/2016
 *************************************************************************/
public class MyTimerPanel extends JPanel {

	private GeoCountDownTimer geoTimer;

	private Timer javaTimer;

	private TimerListener timer;

	private JPanel yPan;
	

	private JButton reset;
	private JButton start;
	private JButton stop;
	private JButton incDays;
	private JButton incMonths;
	private JButton incYears;
	private JButton decDays;
	private JButton decMonths;
	private JButton decYears;
	private JLabel month;
	private JLabel dash1;
	private JLabel dash2;
	private JLabel day;
	private JLabel year;

	public MyTimerPanel() {
		geoTimer = new GeoCountDownTimer(7, 15, 2780);
		timer = new TimerListener();
		yPan = new JPanel();
		yPan.setLayout(new BoxLayout(yPan, BoxLayout.Y_AXIS));
		
	
		
		month = new JLabel("" + geoTimer.getMonth());
		yPan.add(month, 2, 0);
		dash1 = new JLabel("/");
		yPan.add(dash1, 1);
		day = new JLabel("" + geoTimer.getDay());
		yPan.add(day, 2);
		dash2 = new JLabel("/");
		yPan.add(dash2, 3);
		year = new JLabel("" + geoTimer.getYear());
		yPan.add(year, 4);
		

		reset = new JButton("Reset");
		reset.addActionListener(timer);
		yPan.add(reset);
		
		start = new JButton("Start");
		start.addActionListener(timer);
		yPan.add(start);
		
		stop = new JButton("Stop");
		stop.addActionListener(timer);
		yPan.add(stop);
		
		incDays = new JButton("Add Days");
		incDays.addActionListener(timer);
		yPan.add(incDays);
		decDays = new JButton("Sub Days");
		decDays.addActionListener(timer);
		yPan.add(decDays);
		incMonths = new JButton("Add Months");
		incMonths.addActionListener(timer);
		yPan.add(incMonths);
		decMonths = new JButton("Sub Months");
		decMonths.addActionListener(timer);
		yPan.add(decMonths);
		incYears = new JButton("Add Years");
		incYears.addActionListener(timer);
		yPan.add(incYears);
		decYears = new JButton("Sub Years");
		decYears.addActionListener(timer);
		yPan.add(decYears);

		add(yPan);
		javaTimer = new Timer(100, timer);
	}

	private class TimerListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {

			if (javaTimer == e.getSource()) {

				geoTimer.dec();
				month.setText("" + geoTimer.getMonth());
				day.setText("" + geoTimer.getDay());
				year.setText("" + geoTimer.getYear());
			}
				if (decYears == e.getSource()) {
					try {
						if(geoTimer.getMonth() == 2 &&
								geoTimer.getDay() == 29)
								geoTimer.setDay(28);
								day.setText("" + geoTimer.getDay());
						geoTimer.setYear(geoTimer.getYear() - 1);
						year.setText("" + geoTimer.getYear());
					} catch (IllegalArgumentException error) {
						JOptionPane.showMessageDialog(null,
								"Cannot be before today's date");
					}
				}
				if (incYears == e.getSource()) {
					try {
						if(geoTimer.getMonth() == 2 &&
								geoTimer.getDay() == 29)
								geoTimer.setDay(28);
								day.setText("" + geoTimer.getDay());
						geoTimer.setYear(geoTimer.getYear() + 1);
						year.setText("" + geoTimer.getYear());
					} catch (IllegalArgumentException error) {
						JOptionPane.showMessageDialog(null,
								"Cannot be before today's date");
					}
				}
				if (decMonths == e.getSource()) {
					try{
						if(geoTimer.DAYS_IN_A_MONTH[geoTimer.getMonth() -1] >
						geoTimer.DAYS_IN_A_MONTH[geoTimer.getMonth() - 2]){
							geoTimer.setDay(geoTimer.DAYS_IN_A_MONTH
									[geoTimer.getMonth() - 2]);
						}
						geoTimer.setMonth(geoTimer.getMonth() -1);
						month.setText("" + geoTimer.getMonth());
					} catch(Exception error){
						JOptionPane.showMessageDialog(null,
								"Invalid number of month");
					}
				}
				if (incMonths == e.getSource()) {
					try{
						if(geoTimer.DAYS_IN_A_MONTH[geoTimer.getMonth() -1] >
						geoTimer.DAYS_IN_A_MONTH[geoTimer.getMonth()]){
							geoTimer.setDay(geoTimer.DAYS_IN_A_MONTH
									[geoTimer.getMonth() - 1]);
						}
						geoTimer.setMonth(geoTimer.getMonth() + 1);
						month.setText("" + geoTimer.getMonth());
					} catch(Exception error){
						JOptionPane.showMessageDialog(null,
								"Invalid number of month");
					}
				}
				if (decDays == e.getSource()) {
					try{
						geoTimer.dec();
						day.setText("" + geoTimer.getDay());
						month.setText("" + geoTimer.getMonth());
						year.setText("" + geoTimer.getYear());
				} catch(Exception error){
					JOptionPane.showMessageDialog(null,
							"Cannot be before today's date");
				}
				}
				if (incDays == e.getSource()) {
				try {
						geoTimer.inc();
						day.setText("" + geoTimer.getDay());
						month.setText("" + geoTimer.getMonth());
						year.setText("" + geoTimer.getYear());
				} catch(Exception error){
					JOptionPane.showMessageDialog(null,
							"Cannot be before today's date");
				}
				}
			if (start == e.getSource()) {
				javaTimer.start();
				incMonths.setEnabled(false);
				decMonths.setEnabled(false);
				incDays.setEnabled(false);
				decDays.setEnabled(false);
				incYears.setEnabled(false);
				decYears.setEnabled(false);
			}
			if (stop == e.getSource()) {
				javaTimer.stop();
				incMonths.setEnabled(true);
				decMonths.setEnabled(true);
				incDays.setEnabled(true);
				decDays.setEnabled(true);
				incYears.setEnabled(true);
				decYears.setEnabled(true);
			}
			if (reset == e.getSource()) {
				geoTimer = new GeoCountDownTimer(10, 8, 3546);
				month.setText("" + geoTimer.getMonth());
				day.setText("" + geoTimer.getDay());
				year.setText("" + geoTimer.getYear());
				javaTimer.stop();
				incMonths.setEnabled(true);
				decMonths.setEnabled(true);
				incDays.setEnabled(true);
				decDays.setEnabled(true);
				incYears.setEnabled(true);
				decYears.setEnabled(true);
			}

		}
	}

	public static void main(String args[]) {
		JFrame frame = new JFrame("Count Down Timer");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MyTimerPanel yPan = new MyTimerPanel();
		frame.getContentPane().add(yPan);
		frame.setSize(600, 400);
		frame.setVisible(true);
	}
}


