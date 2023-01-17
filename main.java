	public static int countLowercaseChars(String s) {
		int cnt = 0;
		for (int i = 0; i < s.length(); i++) {
			if(Character.isLowerCase(s.charAt(i))) {
				cnt++;
			}
		}
		return cnt;
	}
