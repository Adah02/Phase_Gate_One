PersonalityTestFunctions {

	public static String personalityType (int introvert,  int extrovert, int sensing, int intuitive, int thinking, int feeling, int judging, int perception){
	
	String personality = "";

	((introvert > extrovert) ? personality += "I" : personality += "E");
	((sensing > intuitive) ? personality += "S" : personality += "N");
	((thinking > feeling) ? personality += "T" : personality += "F");
	((judging > perception) ? personality += "J" : personality += "P");
	 
	return personality;
	}

	


}