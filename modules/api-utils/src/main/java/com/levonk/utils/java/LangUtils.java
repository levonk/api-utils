package com.levonk.utils.java;

class LangUtils {
	private LangUtils() {};

	public static boolean hasClass( final String className ) {
		try {
			Class.forName( className );
			return true;
		} catch (Throwable t) {
			return false;
		}
	}
}
