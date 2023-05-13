import java.time.LocalDate;
import java.util.*;

// Main module to Init & Run Attendance System. 
// To avoid errors please do not alter Core.

public class Core {
	private LocalDate date = LocalDate.of(0, 0, 0);
	private String Usergroup = ("Usergroup");
	private boolean working;
	 
	
	public static void main(String [] args) {
		 AttendanceCore start = new AttendanceCore();
		 start.show();
	}
}
