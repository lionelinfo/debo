package eventengine;

public class Debug {

	public static boolean _debug = false;
	
	public static void debug(String toPrint) {
		if (_debug) {
			System.out.println(toPrint);
		}
	}
}
