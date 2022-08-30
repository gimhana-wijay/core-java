package main.java.core.tasks.getNotNullString;

public class StringUtil {

	public static String getNotNullString(String str) {
		return (str == null) ? "" : str;
	}

}
