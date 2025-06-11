import java.util.ArrayList;
public class PersonalityTestFunctions {

	public static String personalityType(int introvert,  int extrovert, int sensing, int intuitive, int thinking, int feeling, int judging, int perception){
	
	String personality = "";

		String energy = (introvert > extrovert) ? (personality += "I") : (personality += "E");
		String mind = (sensing > intuitive) ? (personality += "S") : (personality += "N");
		String nature = (thinking > feeling) ? (personality += "T") : (personality += "F");
		String tactics = (judging > perception) ? (personality += "J") : (personality += "P");
	 
	return personality;
	}

	public static String energyDetails(ArrayList<String> energy, int introvert, int extrovert){
		
		String choicesInEnergy = "";

		for (String item : energy){
		choicesInEnergy += String.format("%s%n", item);
		}
		choicesInEnergy += String.format("Number of A selected: %d%nNumber of B selected: %d%n", extrovert, introvert);
	return choicesInEnergy;
	}

	public static String mindDetails(ArrayList<String> mind, int sensing, int intuitive){
		
		String choicesInMind = "";

		for (String item : mind){
		choicesInMind += String.format("%s%n", item);
		}
		choicesInMind += String.format("Number of A selected: %d%nNumber of B selected: %d%n", intuitive, sensing);
	return choicesInMind;
	}

	public static String natureDetails(ArrayList<String> nature, int thinking, int feeling){
		
		String choicesInNature = "";

		for (String item : nature){
		choicesInNature += String.format("%s%n", item);
		}
		choicesInNature += String.format("Number of A selected: %d%nNumber of B selected: %d%n", thinking, feeling);
	return choicesInNature;
	}

	public static String tacticsDetails(ArrayList<String> tactics, int judging, int perception){
		
		String choicesInTactics = "";

		for (String item : tactics){
		choicesInTactics += String.format("%s%n", item);
		}
		choicesInTactics += String.format("Number of A selected: %d%nNumber of B selected: %d%n", judging, perception);
	return choicesInTactics;
	}

	public static String usersName(String myName){

	String refinedName = "";
	for (int index = 0; index < myName.length(); index++){

		if (myName.charAt(index) >= 'a' && myName.charAt(index) <= 'z' || 
		myName.charAt(index) >= 'A' && myName.charAt(index) <= 'Z'){
			if (index > 1 && myName.charAt(index - 1) == ' '){
				refinedName += String.valueOf(myName.charAt(index)).toUpperCase();
			} else { 	refinedName += myName.charAt(index);	}
		}else if (myName.charAt(index) == ' ' ){ refinedName += myName.charAt(index);
		} else { myName.replaceAll(String.valueOf(myName.charAt(index)), "");  }
	}
	return refinedName;
	}

	public static String commander(){
	String entj = """
			ENTJ (Commander) is a personality type with the Extraverted, Intuitive, Thinking, and Judging traits.
			They are decisive people who love momentum and accomplishment. They gather information to construct their
			 creative visions but rarely hesitate for long before acting on them.
			People with the ENTJ personality type (Commanders) are natural-born leaders. Embodying the gifts of charisma 
			and confidence, ENTJs project authority in a way that draws crowds together behind a common goal. However, these 
			personalities are also characterized by an often ruthless level of rationality, using theirdrive, determination, and 
			sharp mind to achieve whatever objectives they’ve set for themselves. Their intensitymight sometimes rub people 
			the wrong way, but ultimately, ENTJs take pride in both their work ethic and theirimpressive level of self-discipline.
			""";
	return entj;
	}
	
	public static String logician(){
	String intp = """
			INTP (Logician) is a personality type with the Introverted, Intuitive, Thinking, and Prospecting traits. These flexible 
			thinkers enjoy taking an unconventional approach to many aspects of life. They often seek out unlikely paths, mixing 
			willingness to experiment with personal creativity.
			People with the INTP personality type (Logicians) pride themselves on their unique perspective and vigorous intellect. 
			They can’t help but puzzle over the mysteries of the universe – which may explain why some of the most influential 
			philosophers and scientists of all time have been INTPs. People with this personality type tend to prefer solitude, as 
			they can easily become immersed in their thoughts when they are left to their own devices. They are also incredibly 
			creative and inventive, and they are not afraid to express their novel ways of thinking or to stand out from the crowd.
			""";
	return intp;
	}

	public static String architect (){
	String intj = """
			INTJ (Architect) is a personality type with the Introverted, Intuitive, Thinking, and Judging traits. These thoughtful 
			tacticians love perfecting the details of life, applying creativity and rationality to everything they do. Their inner 
			world is often a private, complex one.
			People with the INTJ personality type (Architects) are intellectually curious individuals with a deep-seated thirst 
			for knowledge. 
			INTJs tend to value creative ingenuity, straightforward rationality, and self-improvement. They consistently work 
			toward enhancing intellectual abilities and are often driven by an intense desire to master any and every topic 
			that piques their interest.
			""";
	return intj;
	}

	public static String debater (){
	String entp = """
			ENTP (Debater) is a personality type with the Extraverted, Intuitive, Thinking, and Prospecting traits. They tend to
			be bold and creative, deconstructing and rebuilding ideas with great mental agility. They pursue their goals vigorously 
			despite any resistance they might encounter.
			Quick-witted and audacious, people with the ENTP personality type (Debaters) aren’t afraid to disagree with the status 
			quo. In fact, they’re not afraid to disagree with pretty much anything or anyone. Few things light up these personalities 
			more than a bit of verbal sparring – and if the conversation veers into controversial terrain, so much the better.
			It would be a mistake, though, to think of ENTPs as disagreeable or mean-spirited. Instead, people with this personality 
			type are knowledgeable and curious with a playful sense of humor, and they can be incredibly entertaining. They simply 
			have an offbeat, contrarian idea of fun – one that usually involves a healthy dose of spirited debate.
			""";
	return entp;
	}

	public static String adventurer (){
	String isfp = """
			ISFP (Adventurer) is a personality type with the Introverted, Observant, Feeling, and Prospecting traits. They tend to 
			have open minds, approaching life, new experiences, and people with grounded warmth. Their ability to stay in the 
			moment helps them uncover exciting potentials.
			People with the ISFP personality type (Adventurers) are true artists – although not necessarily in the conventional 
			sense. For these types, life itself is a canvas for self-expression. From what they wear to how they spend their free 
			time, they act in ways that vividly reflect who they are as unique individuals. With their exploratory spirit and their 
			ability to find joy in everyday life, ISFPs can be among the most interesting people you’ll ever meet.
			Driven by their sense of fairness and their open-mindedness, people with this personality type move through life 
			with an infectiously encouraging attitude. They love motivating those close to them to follow their passions and usually 
			follow their own interests with the same unhindered enthusiasm. The only irony? Unassuming and humble, ISFPs tend 
			to see themselves as “just doing their own thing,” so they may not even realize how remarkable they really are.
			""";
	return isfp;
	}

	public static String virtuoso (){
	String istp = """
			ISTP (Virtuoso) is a personality type with the Introverted, Observant, Thinking, and Prospecting traits. They tend to have 
			an individualistic mindset, pursuing goals without needing much external connection. They engage in life with inquisitiveness 
			and personal skill, varying their approach as needed.
			People with the ISTP personality type (Virtuosos) love to explore with their hands and their eyes, touching and examining 
			the world around them with an impressive diligence, a casual curiosity, and a healthy dose of skepticism. They are natural 
			makers, moving from project to project, building the useful and the superfluous for the fun of it and learning from their 
			environment as they go. They find no greater joy than in getting their hands dirty pulling things apart and putting them back 
			together, leaving them just a little bit better than they were before.
			ISTPs prefer to approach problems directly, seeking straightforward solutions over convoluted troubleshooting methods. 
			People with this personality type rely heavily on firsthand experience and trial and error as they execute their ideas and 
			projects. And as they do so, they usually prefer to work at their own pace, on their own terms, and without unnecessary 
			interruptions.
			""";
		return istp;
		}

	public static String entrepreneur (){
	String estp = """
			ESTP (Entrepreneur) is a personality type with the Extraverted, Observant, Thinking, and Prospecting traits. They tend to 
			be energetic and action-oriented, deftly navigating whatever is in front of them. They love uncovering life’s opportunities, 
			whether socializing with others or in more personal pursuits.
			People with the ESTP personality type (Entrepreneurs) are vibrant individuals brimming with an enthusiastic and 
			spontaneous energy. They tend to be on the competitive side, often assuming that a competitive mindset is a necessity in 
			order to achieve success in life. With their driven, action-oriented attitudes, they rarely waste time thinking about the past. 
			In fact, they excel at keeping their attention rooted in their present – so much so that they rarely find themselves fixated on 
			the time throughout the day.
			Theory, abstract concepts, and plodding discussions about global issues and their implications don’t keep ESTP personalities 
			interested for long. They keep their conversations energetic, with a good dose of intelligence, but they like to talk about what 
			is – or better yet, to just go out and do it. They often leap before they look, fixing their mistakes as they go rather than sitting 
			idle and preparing contingencies and escape clauses.
			""";
	return estp;
	}

	public static String entertainer (){
	String esfp = """
			ESFP (Entertainer) is a personality type with the Extraverted, Observant, Feeling, and Prospecting traits. These people love 
			vibrant experiences, engaging in life eagerly and taking pleasure in discovering the unknown. They can be very social, often 
			encouraging others into shared activities.
			If anyone is to be found spontaneously breaking into song and dance, it is people with the ESFP personality type (Entertainers). 
			They get caught up in the excitement of the moment and want everyone else to feel that way too. No other type is as generous 
			with their time and energy when it comes to encouraging others, and no other type does it with such irresistible style.
			ESFP personalities are inclined toward putting on a show for others and generally appear to be very comfortable in the spotlight. 
			However, it is not their love for being the center of attention that drives this sense of confidence but their knack for sensing what’s 
			appropriate in certain situations. They have an uncanny ability to mirror the behaviors of those around them.
			ESFPs truly enjoy the simplest things, and there’s no greater joy for them than just having fun with a good group of friends. People 
			with this personality type would almost always choose to be with friends over spending time alone. With their unique and earthy 
			wit, they love soaking up attention and making every get-together feel a bit like a party.
			""";
	return esfp;
	}

	public static String personalityTrait (String type){
	
	String trait = "";
	if (type == "ENTJ"){ 	trait = commander();
	} else if (type == "INTP"){	trait = logician();
	} else if (type == "INTJ"){	trait = architect ();
	} else if (type == "ENTP"){	trait = debater ();
	} else if (type == "ISFP"){	trait = adventurer ();
	} else if (type == "ISTP"){	trait = virtuoso ();
	} else if (type == "ESTP"){	trait = entrepreneur ();
	} else if (type == "ESFP"){	trait = entertainer ();
	}
	return trait;
	}

}

