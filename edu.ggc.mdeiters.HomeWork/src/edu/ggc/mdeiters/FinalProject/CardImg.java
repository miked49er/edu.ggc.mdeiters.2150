
package edu.ggc.mdeiters.FinalProject;


/**
 * Class: CardImg
 * @author Mike Deiters
 * @version 1.0
 * ITEC 2150 Spring 2015
 * Written: Apr 14, 2015
 * 
 * Class Description: Databank of images for the cards
 * 
 * Purpose: Store the card images
 *
 */
public class CardImg {

	public String cardBack;
	public String aceSpades;
	public String twoSpades;
	public String threeSpades;
	public String fourSpades;
	public String fiveSpades;
	public String sixSpades;
	public String sevenSpades;
	public String eightSpades;
	public String nineSpades;
	public String tenSpades;
	public String jackSpades;
	public String queenSpades;
	public String kingSpades;
	public String aceHearts;
	public String twoHearts;
	public String threeHearts;
	public String fourHearts;
	public String fiveHearts;
	public String sixHearts;
	public String sevenHearts;
	public String eightHearts;
	public String nineHearts;
	public String tenHearts;
	public String jackHearts;
	public String queenHearts;
	public String kingHearts;
	public String aceDiamonds;
	public String twoDiamonds;
	public String threeDiamonds;
	public String fourDiamonds;
	public String fiveDiamonds;
	public String sixDiamonds;
	public String sevenDiamonds;
	public String eightDiamonds;
	public String nineDiamonds;
	public String tenDiamonds;
	public String jackDiamonds;
	public String queenDiamonds;
	public String kingDiamonds;
	public String aceClubs;
	public String twoClubs;
	public String threeClubs;
	public String fourClubs;
	public String fiveClubs;
	public String sixClubs;
	public String sevenClubs;
	public String eightClubs;
	public String nineClubs;
	public String tenClubs;
	public String jackClubs;
	public String queenClubs;
	public String kingClubs;

	/**
	 * Constructor: CardImg
	 * @param OS String of the computer's operating system
	 */
	public CardImg(String OS) {

		if (OS.startsWith("Windows")) { // Determines the file system to find the Crazy8s.txt file

			WindowsImg();
		}
		else {

			UnixImg();
		}
	}

	/**
	 * Method: findImage 
	 * @param card Card
	 * @return String of the image location
	 * Method Description: Finds the associated card's image
	 */
	public String findImage(Card card) {

		if (card == null) { // If card is null return the cardBack image

			return cardBack;
		}
		switch (card.getValueAsString()) { // Looks first at the card's value then the suit to find which image is associated with the card
			case "Ace":

				switch (card.getSuitAsString()) {
					case "Spades":
						return aceSpades;
					case "Hearts":
						return aceHearts;
					case "Diamonds":
						return aceDiamonds;
					case "Clubs":
						return aceClubs;
				}
			case "2":

				switch (card.getSuitAsString()) {
					case "Spades":
						return twoSpades;
					case "Hearts":
						return twoHearts;
					case "Diamonds":
						return twoDiamonds;
					case "Clubs":
						return twoClubs;
				}
			case "3":

				switch (card.getSuitAsString()) {
					case "Spades":
						return threeSpades;
					case "Hearts":
						return threeHearts;
					case "Diamonds":
						return threeDiamonds;
					case "Clubs":
						return threeClubs;
				}
			case "4":

				switch (card.getSuitAsString()) {
					case "Spades":
						return fourSpades;
					case "Hearts":
						return fourHearts;
					case "Diamonds":
						return fourDiamonds;
					case "Clubs":
						return fourClubs;
				}
			case "5":

				switch (card.getSuitAsString()) {
					case "Spades":
						return fiveSpades;
					case "Hearts":
						return fiveHearts;
					case "Diamonds":
						return fiveDiamonds;
					case "Clubs":
						return fiveClubs;
				}
			case "6":

				switch (card.getSuitAsString()) {
					case "Spades":
						return sixSpades;
					case "Hearts":
						return sixHearts;
					case "Diamonds":
						return sixDiamonds;
					case "Clubs":
						return sixClubs;
				}
			case "7":

				switch (card.getSuitAsString()) {
					case "Spades":
						return sevenSpades;
					case "Hearts":
						return sevenHearts;
					case "Diamonds":
						return sevenDiamonds;
					case "Clubs":
						return sevenClubs;
				}
			case "8":

				switch (card.getSuitAsString()) {
					case "Spades":
						return eightSpades;
					case "Hearts":
						return eightHearts;
					case "Diamonds":
						return eightDiamonds;
					case "Clubs":
						return eightClubs;
				}
			case "9":

				switch (card.getSuitAsString()) {
					case "Spades":
						return nineSpades;
					case "Hearts":
						return nineHearts;
					case "Diamonds":
						return nineDiamonds;
					case "Clubs":
						return nineClubs;
				}
			case "10":

				switch (card.getSuitAsString()) {
					case "Spades":
						return tenSpades;
					case "Hearts":
						return tenHearts;
					case "Diamonds":
						return tenDiamonds;
					case "Clubs":
						return tenClubs;
				}
			case "Jack":

				switch (card.getSuitAsString()) {
					case "Spades":
						return jackSpades;
					case "Hearts":
						return jackHearts;
					case "Diamonds":
						return jackDiamonds;
					case "Clubs":
						return jackClubs;
				}
			case "Queen":

				switch (card.getSuitAsString()) {
					case "Spades":
						return queenSpades;
					case "Hearts":
						return queenHearts;
					case "Diamonds":
						return queenDiamonds;
					case "Clubs":
						return queenClubs;
				}
			case "King":

				switch (card.getSuitAsString()) {
					case "Spades":
						return kingSpades;
					case "Hearts":
						return kingHearts;
					case "Diamonds":
						return kingDiamonds;
					case "Clubs":
						return kingClubs;
				}
			default:
				return cardBack;
		}
	}

	/**
	 * Method: WindowsImg 
	 * @return void
	 * Method Description: Locates the images using the Windows file system
	 */
	private void WindowsImg() {

		this.cardBack = getClass().getResource("Images\\Card_Back.png").toExternalForm();
		this.aceSpades = getClass().getResource("Images\\Spades_Ace.png").toExternalForm();
		this.twoSpades = getClass().getResource("Images\\Spades_2.png").toExternalForm();
		this.threeSpades = getClass().getResource("Images\\Spades_3.png").toExternalForm();
		this.fourSpades = getClass().getResource("Images\\Spades_4.png").toExternalForm();
		this.fiveSpades = getClass().getResource("Images\\Spades_5.png").toExternalForm();
		this.sixSpades = getClass().getResource("Images\\Spades_6.png").toExternalForm();
		this.sevenSpades = getClass().getResource("Images\\Spades_7.png").toExternalForm();
		this.eightSpades = getClass().getResource("Images\\Spades_8.png").toExternalForm();
		this.nineSpades = getClass().getResource("Images\\Spades_9.png").toExternalForm();
		this.tenSpades = getClass().getResource("Images\\Spades_10.png").toExternalForm();
		this.jackSpades = getClass().getResource("Images\\Spades_Jack.png").toExternalForm();
		this.queenSpades = getClass().getResource("Images\\Spades_Queen.png").toExternalForm();
		this.kingSpades = getClass().getResource("Images\\Spades_King.png").toExternalForm();
		this.aceHearts = getClass().getResource("Images\\Hearts_Ace.png").toExternalForm();
		this.twoHearts = getClass().getResource("Images\\Hearts_2.png").toExternalForm();
		this.threeHearts = getClass().getResource("Images\\Hearts_3.png").toExternalForm();
		this.fourHearts = getClass().getResource("Images\\Hearts_4.png").toExternalForm();
		this.fiveHearts = getClass().getResource("Images\\Hearts_5.png").toExternalForm();
		this.sixHearts = getClass().getResource("Images\\Hearts_6.png").toExternalForm();
		this.sevenHearts = getClass().getResource("Images\\Hearts_7.png").toExternalForm();
		this.eightHearts = getClass().getResource("Images\\Hearts_8.png").toExternalForm();
		this.nineHearts = getClass().getResource("Images\\Hearts_9.png").toExternalForm();
		this.tenHearts = getClass().getResource("Images\\Hearts_10.png").toExternalForm();
		this.jackHearts = getClass().getResource("Images\\Hearts_Jack.png").toExternalForm();
		this.queenHearts = getClass().getResource("Images\\Hearts_Queen.png").toExternalForm();
		this.kingHearts = getClass().getResource("Images\\Hearts_King.png").toExternalForm();
		this.aceDiamonds = getClass().getResource("Images\\Diamonds_Ace.png").toExternalForm();
		this.twoDiamonds = getClass().getResource("Images\\Diamonds_2.png").toExternalForm();
		this.threeDiamonds = getClass().getResource("Images\\Diamonds_3.png").toExternalForm();
		this.fourDiamonds = getClass().getResource("Images\\Diamonds_4.png").toExternalForm();
		this.fiveDiamonds = getClass().getResource("Images\\Diamonds_5.png").toExternalForm();
		this.sixDiamonds = getClass().getResource("Images\\Diamonds_6.png").toExternalForm();
		this.sevenDiamonds = getClass().getResource("Images\\Diamonds_7.png").toExternalForm();
		this.eightDiamonds = getClass().getResource("Images\\Diamonds_8.png").toExternalForm();
		this.nineDiamonds = getClass().getResource("Images\\Diamonds_9.png").toExternalForm();
		this.tenDiamonds = getClass().getResource("Images\\Diamonds_10.png").toExternalForm();
		this.jackDiamonds = getClass().getResource("Images\\Diamonds_Jack.png").toExternalForm();
		this.queenDiamonds = getClass().getResource("Images\\Diamonds_Queen.png").toExternalForm();
		this.kingDiamonds = getClass().getResource("Images\\Diamonds_King.png").toExternalForm();
		this.aceClubs = getClass().getResource("Images\\Clubs_Ace.png").toExternalForm();
		this.twoClubs = getClass().getResource("Images\\Clubs_2.png").toExternalForm();
		this.threeClubs = getClass().getResource("Images\\Clubs_3.png").toExternalForm();
		this.fourClubs = getClass().getResource("Images\\Clubs_4.png").toExternalForm();
		this.fiveClubs = getClass().getResource("Images\\Clubs_5.png").toExternalForm();
		this.sixClubs = getClass().getResource("Images\\Clubs_6.png").toExternalForm();
		this.sevenClubs = getClass().getResource("Images\\Clubs_7.png").toExternalForm();
		this.eightClubs = getClass().getResource("Images\\Clubs_8.png").toExternalForm();
		this.nineClubs = getClass().getResource("Images\\Clubs_9.png").toExternalForm();
		this.tenClubs = getClass().getResource("Images\\Clubs_10.png").toExternalForm();
		this.jackClubs = getClass().getResource("Images\\Clubs_Jack.png").toExternalForm();
		this.queenClubs = getClass().getResource("Images\\Clubs_Queen.png").toExternalForm();
		this.kingClubs = getClass().getResource("Images\\Clubs_King.png").toExternalForm();

	}

	/**
	 * Method: UnixImg 
	 * @return void
	 * Method Description: Locates the images using the Unix file system
	 */
	private void UnixImg() {

		this.cardBack = getClass().getResource("Images/Card_Back.png").toExternalForm();
		this.aceSpades = getClass().getResource("Images/Spades_Ace.png").toExternalForm();
		this.twoSpades = getClass().getResource("Images/Spades_2.png").toExternalForm();
		this.threeSpades = getClass().getResource("Images/Spades_3.png").toExternalForm();
		this.fourSpades = getClass().getResource("Images/Spades_4.png").toExternalForm();
		this.fiveSpades = getClass().getResource("Images/Spades_5.png").toExternalForm();
		this.sixSpades = getClass().getResource("Images/Spades_6.png").toExternalForm();
		this.sevenSpades = getClass().getResource("Images/Spades_7.png").toExternalForm();
		this.eightSpades = getClass().getResource("Images/Spades_8.png").toExternalForm();
		this.nineSpades = getClass().getResource("Images/Spades_9.png").toExternalForm();
		this.tenSpades = getClass().getResource("Images/Spades_10.png").toExternalForm();
		this.jackSpades = getClass().getResource("Images/Spades_Jack.png").toExternalForm();
		this.queenSpades = getClass().getResource("Images/Spades_Queen.png").toExternalForm();
		this.kingSpades = getClass().getResource("Images/Spades_King.png").toExternalForm();
		this.aceHearts = getClass().getResource("Images/Hearts_Ace.png").toExternalForm();
		this.twoHearts = getClass().getResource("Images/Hearts_2.png").toExternalForm();
		this.threeHearts = getClass().getResource("Images/Hearts_3.png").toExternalForm();
		this.fourHearts = getClass().getResource("Images/Hearts_4.png").toExternalForm();
		this.fiveHearts = getClass().getResource("Images/Hearts_5.png").toExternalForm();
		this.sixHearts = getClass().getResource("Images/Hearts_6.png").toExternalForm();
		this.sevenHearts = getClass().getResource("Images/Hearts_7.png").toExternalForm();
		this.eightHearts = getClass().getResource("Images/Hearts_8.png").toExternalForm();
		this.nineHearts = getClass().getResource("Images/Hearts_9.png").toExternalForm();
		this.tenHearts = getClass().getResource("Images/Hearts_10.png").toExternalForm();
		this.jackHearts = getClass().getResource("Images/Hearts_Jack.png").toExternalForm();
		this.queenHearts = getClass().getResource("Images/Hearts_Queen.png").toExternalForm();
		this.kingHearts = getClass().getResource("Images/Hearts_King.png").toExternalForm();
		this.aceDiamonds = getClass().getResource("Images/Diamonds_Ace.png").toExternalForm();
		this.twoDiamonds = getClass().getResource("Images/Diamonds_2.png").toExternalForm();
		this.threeDiamonds = getClass().getResource("Images/Diamonds_3.png").toExternalForm();
		this.fourDiamonds = getClass().getResource("Images/Diamonds_4.png").toExternalForm();
		this.fiveDiamonds = getClass().getResource("Images/Diamonds_5.png").toExternalForm();
		this.sixDiamonds = getClass().getResource("Images/Diamonds_6.png").toExternalForm();
		this.sevenDiamonds = getClass().getResource("Images/Diamonds_7.png").toExternalForm();
		this.eightDiamonds = getClass().getResource("Images/Diamonds_8.png").toExternalForm();
		this.nineDiamonds = getClass().getResource("Images/Diamonds_9.png").toExternalForm();
		this.tenDiamonds = getClass().getResource("Images/Diamonds_10.png").toExternalForm();
		this.jackDiamonds = getClass().getResource("Images/Diamonds_Jack.png").toExternalForm();
		this.queenDiamonds = getClass().getResource("Images/Diamonds_Queen.png").toExternalForm();
		this.kingDiamonds = getClass().getResource("Images/Diamonds_King.png").toExternalForm();
		this.aceClubs = getClass().getResource("Images/Clubs_Ace.png").toExternalForm();
		this.twoClubs = getClass().getResource("Images/Clubs_2.png").toExternalForm();
		this.threeClubs = getClass().getResource("Images/Clubs_3.png").toExternalForm();
		this.fourClubs = getClass().getResource("Images/Clubs_4.png").toExternalForm();
		this.fiveClubs = getClass().getResource("Images/Clubs_5.png").toExternalForm();
		this.sixClubs = getClass().getResource("Images/Clubs_6.png").toExternalForm();
		this.sevenClubs = getClass().getResource("Images/Clubs_7.png").toExternalForm();
		this.eightClubs = getClass().getResource("Images/Clubs_8.png").toExternalForm();
		this.nineClubs = getClass().getResource("Images/Clubs_9.png").toExternalForm();
		this.tenClubs = getClass().getResource("Images/Clubs_10.png").toExternalForm();
		this.jackClubs = getClass().getResource("Images/Clubs_Jack.png").toExternalForm();
		this.queenClubs = getClass().getResource("Images/Clubs_Queen.png").toExternalForm();
		this.kingClubs = getClass().getResource("Images/Clubs_King.png").toExternalForm();
	}
}
