package com.koreait.board;

import javax.servlet.http.HttpServletRequest;

public class Utils {
	public static int getParameterInt(HttpServletRequest request, String key, int def) {
		if(getParameterInt(request, key)==0) {
			return def;
		}
		return getParameterInt(request, key);
	}
	
	public static int getParameterInt(HttpServletRequest request, String key) {
		String param = request.getParameter(key);
		int result = parseStringToInt(param);
		return result;
	}
	
	public static int parseStringToInt(String val) {
		try {
			return Integer.parseInt(val);
		} catch(Exception e) {}
		return 0;
	}
	
}
