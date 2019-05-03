import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class DeltaTime {
	public static void main (String[] args) throws IOException {
		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		
		String line;
		while ((line = buffer.readLine()) != null) {
			line = line.trim();
	        
			if (line.length() > 0) {
				String[] times = line.split(" ");
				String[] time1_parts = times[0].split(":");
				String[] time2_parts = times[1].split(":");
				
				int time1_secs = Integer.parseInt(time1_parts[0]) * 60 * 60;
				time1_secs += Integer.parseInt(time1_parts[1]) * 60;
				time1_secs += Integer.parseInt(time1_parts[2]);
				
				int time2_secs = Integer.parseInt(time2_parts[0]) * 60 * 60;
				time2_secs += Integer.parseInt(time2_parts[1]) * 60;
				time2_secs += Integer.parseInt(time2_parts[2]);
				
				int diff_secs = 0;
				if (time1_secs > time2_secs) {
					diff_secs = time1_secs - time2_secs;
				} else {
					diff_secs = time2_secs - time1_secs;
				}
				
				int hours = diff_secs / (60 * 60);
				diff_secs -= hours * 60 * 60;
				int mins = diff_secs / 60;
				diff_secs -= mins * 60;
				
				System.out.format("%1$02d:%2$02d:%3$02d\n", hours, mins, diff_secs);

			}
		}
	}
}
