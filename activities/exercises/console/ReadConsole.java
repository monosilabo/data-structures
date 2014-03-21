import java.io.BufferedReader;
import java.io.InputStreamReader;

class ReadConsole {

	public static void main(String args[]) throws Exception {
		InputStreamReader isr = new InputStreamReader(System.in);

		BufferedReader br = new BufferedReader(isr);

		String s;
		while ((s = br.readLine()) != null) {
			System.out.println(s.length());
		}
		isr.close();
	}
}