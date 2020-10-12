package com.jeipz.main.utils;

import java.util.Set;

public class Utility {

	/**
	 * Replace last occurrence of {@code ','} 
	 * in a given {@code String} into {@code 'and'}
	 * 
	 * @param text {@code String} to format
	 * @return formatted {@code String}
	 */
	public static String changeLastCommaToAnd(String text) {
		int lastCommaIndex = text.lastIndexOf(',');
		if (lastCommaIndex != -1) {
			String firstTrimmedStr = text.substring(0, lastCommaIndex);
			String secondTrimmedStr = text.substring(lastCommaIndex + 2, text.length());
			text = firstTrimmedStr + " and " + secondTrimmedStr;
		}
		return text;
	}

	/**
	 * Remove brackets {@code '[]'} in {@code list.toString()} output
	 *  
	 * @param <T> type of the List
	 * @param list to remove brackets {@code '[]'}
	 * @return {@code String} of given list without brackets {@code '[]'}
	 */
	public static <T> String removeSetStringBrackets(Set<T> list) {
		String listStr = list.toString();
		return listStr.substring(1, listStr.length() - 1);
	}

}
