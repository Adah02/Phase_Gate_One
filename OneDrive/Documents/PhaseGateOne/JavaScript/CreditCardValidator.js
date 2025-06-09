function cardValidity(cardNumber){
	let cardValid = false;
		if (cardNumber.charAt(0) > '2' && cardNumber.charAt(0) < '7'){
			if (cardNumber.length >= 13 && cardNumber.length <= 16){
				if (cardNumber.charAt(0) == '3' && cardNumber.charAt(1) != '7'){
				cardValid = false;
				}else {
				cardValid = true;
				}
			}else {
				cardValid = false;
				}
		} else {
			cardValid = false;
			}
	let validity = (cardValid) ? "Valid" : "Invalid";
	return validity;
	}

function creditCardType(cardNumber){
	let cardType = "";

	if (cardNumber.length() >= 13 && cardNumber.length() <= 16){
		if (cardNumber.charAt(0) == '4'){
			cardType = "VisaCard";
		} else if (cardNumber.charAt(0) == '5'){
			cardType = "MasterCard";
		} else if (cardNumber.charAt(0) == '6'){
			cardType = "DiscoverCard";
		} else if (cardNumber.charAt(0) == '3' && cardNumber.charAt(1) == '7'){
			cardType = "AmericanExpressCard";
		} else { cardType = "Invalid Card"; }
	} else { 
		cardType = "Invalid Card";
	}

	return cardType;
	}
