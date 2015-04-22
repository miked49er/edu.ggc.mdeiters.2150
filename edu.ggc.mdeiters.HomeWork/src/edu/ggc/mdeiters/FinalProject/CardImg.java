
package edu.ggc.mdeiters.FinalProject;

import javafx.scene.image.Image;

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

	public Image cardBack;
	public Image aceSpades;
	public Image twoSpades;
	public Image threeSpades;
	public Image fourSpades;
	public Image fiveSpades;
	public Image sixSpades;
	public Image sevenSpades;
	public Image eightSpades;
	public Image nineSpades;
	public Image tenSpades;
	public Image jackSpades;
	public Image queenSpades;
	public Image kingSpades;
	public Image aceHearts;
	public Image twoHearts;
	public Image threeHearts;
	public Image fourHearts;
	public Image fiveHearts;
	public Image sixHearts;
	public Image sevenHearts;
	public Image eightHearts;
	public Image nineHearts;
	public Image tenHearts;
	public Image jackHearts;
	public Image queenHearts;
	public Image kingHearts;
	public Image aceDiamonds;
	public Image twoDiamonds;
	public Image threeDiamonds;
	public Image fourDiamonds;
	public Image fiveDiamonds;
	public Image sixDiamonds;
	public Image sevenDiamonds;
	public Image eightDiamonds;
	public Image nineDiamonds;
	public Image tenDiamonds;
	public Image jackDiamonds;
	public Image queenDiamonds;
	public Image kingDiamonds;
	public Image aceClubs;
	public Image twoClubs;
	public Image threeClubs;
	public Image fourClubs;
	public Image fiveClubs;
	public Image sixClubs;
	public Image sevenClubs;
	public Image eightClubs;
	public Image nineClubs;
	public Image tenClubs;
	public Image jackClubs;
	public Image queenClubs;
	public Image kingClubs;

	/**
	 * Method: WindowsImg 
	 * @return void
	 * Method Description: Locates the images using the Windows file system
	 */
	public void WindowsImg() {

		this.cardBack = new Image("_images\\Card_Back.png");
		this.aceSpades = new Image("_images\\Spades_Ace.png");
		this.twoSpades = new Image("_images\\Spades_2.png");
		this.threeSpades = new Image("_images\\Spades_3.png");
		this.fourSpades = new Image("_images\\Spades_4.png");
		this.fiveSpades = new Image("_images\\Spades_5.png");
		this.sixSpades = new Image("_images\\Spades_6.png");
		this.sevenSpades = new Image("_images\\Spades_7.png");
		this.eightSpades = new Image("_images\\Spades_8.png");
		this.nineSpades = new Image("_images\\Spades_9.png");
		this.tenSpades = new Image("_images\\Spades_10.png");
		this.jackSpades = new Image("_images\\Spades_Jack.png");
		this.queenSpades = new Image("_images\\Spades_Queen.png");
		this.kingSpades = new Image("_images\\Spades_King.png");
		this.aceHearts = new Image("_images\\Hearts_Ace.png");
		this.twoHearts = new Image("_images\\Hearts_2.png");
		this.threeHearts = new Image("_images\\Hearts_3.png");
		this.fourHearts = new Image("_images\\Hearts_4.png");
		this.fiveHearts = new Image("_images\\Hearts_5.png");
		this.sixHearts = new Image("_images\\Hearts_6.png");
		this.sevenHearts = new Image("_images\\Hearts_7.png");
		this.eightHearts = new Image("_images\\Hearts_8.png");
		this.nineHearts = new Image("_images\\Hearts_9.png");
		this.tenHearts = new Image("_images\\Hearts_10.png");
		this.jackHearts = new Image("_images\\Hearts_Jack.png");
		this.queenHearts = new Image("_images\\Hearts_Queen.png");
		this.kingHearts = new Image("_images\\Hearts_King.png");
		this.aceDiamonds = new Image("_images\\Diamonds_Ace.png");
		this.twoDiamonds = new Image("_images\\Diamonds_2.png");
		this.threeDiamonds = new Image("_images\\Diamonds_3.png");
		this.fourDiamonds = new Image("_images\\Diamonds_4.png");
		this.fiveDiamonds = new Image("_images\\Diamonds_5.png");
		this.sixDiamonds = new Image("_images\\Diamonds_6.png");
		this.sevenDiamonds = new Image("_images\\Diamonds_7.png");
		this.eightDiamonds = new Image("_images\\Diamonds_8.png");
		this.nineDiamonds = new Image("_images\\Diamonds_9.png");
		this.tenDiamonds = new Image("_images\\Diamonds_10.png");
		this.jackDiamonds = new Image("_images\\Diamonds_Jack.png");
		this.queenDiamonds = new Image("_images\\Diamonds_Queen.png");
		this.kingDiamonds = new Image("_images\\Diamonds_King.png");
		this.aceClubs = new Image("_images\\Clubs_Ace.png");
		this.twoClubs = new Image("_images\\Clubs_2.png");
		this.threeClubs = new Image("_images\\Clubs_3.png");
		this.fourClubs = new Image("_images\\Clubs_4.png");
		this.fiveClubs = new Image("_images\\Clubs_5.png");
		this.sixClubs = new Image("_images\\Clubs_6.png");
		this.sevenClubs = new Image("_images\\Clubs_7.png");
		this.eightClubs = new Image("_images\\Clubs_8.png");
		this.nineClubs = new Image("_images\\Clubs_9.png");
		this.tenClubs = new Image("_images\\Clubs_10.png");
		this.jackClubs = new Image("_images\\Clubs_Jack.png");
		this.queenClubs = new Image("_images\\Clubs_Queen.png");
		this.kingClubs = new Image("_images\\Clubs_King.png");

	}

	/**
	 * Method: UnixImg 
	 * @return void
	 * Method Description: Locates the images using the Unix file system
	 */
	public void UnixImg() {

		this.cardBack = new Image("_images/Card_Back.png");
		this.aceSpades = new Image("_images/Spades_Ace.png");
		this.twoSpades = new Image("_images/Spades_2.png");
		this.threeSpades = new Image("_images/Spades_3.png");
		this.fourSpades = new Image("_images/Spades_4.png");
		this.fiveSpades = new Image("_images/Spades_5.png");
		this.sixSpades = new Image("_images/Spades_6.png");
		this.sevenSpades = new Image("_images/Spades_7.png");
		this.eightSpades = new Image("_images/Spades_8.png");
		this.nineSpades = new Image("_images/Spades_9.png");
		this.tenSpades = new Image("_images/Spades_10.png");
		this.jackSpades = new Image("_images/Spades_Jack.png");
		this.queenSpades = new Image("_images/Spades_Queen.png");
		this.kingSpades = new Image("_images/Spades_King.png");
		this.aceHearts = new Image("_images/Hearts_Ace.png");
		this.twoHearts = new Image("_images/Hearts_2.png");
		this.threeHearts = new Image("_images/Hearts_3.png");
		this.fourHearts = new Image("_images/Hearts_4.png");
		this.fiveHearts = new Image("_images/Hearts_5.png");
		this.sixHearts = new Image("_images/Hearts_6.png");
		this.sevenHearts = new Image("_images/Hearts_7.png");
		this.eightHearts = new Image("_images/Hearts_8.png");
		this.nineHearts = new Image("_images/Hearts_9.png");
		this.tenHearts = new Image("_images/Hearts_10.png");
		this.jackHearts = new Image("_images/Hearts_Jack.png");
		this.queenHearts = new Image("_images/Hearts_Queen.png");
		this.kingHearts = new Image("_images/Hearts_King.png");
		this.aceDiamonds = new Image("_images/Diamonds_Ace.png");
		this.twoDiamonds = new Image("_images/Diamonds_2.png");
		this.threeDiamonds = new Image("_images/Diamonds_3.png");
		this.fourDiamonds = new Image("_images/Diamonds_4.png");
		this.fiveDiamonds = new Image("_images/Diamonds_5.png");
		this.sixDiamonds = new Image("_images/Diamonds_6.png");
		this.sevenDiamonds = new Image("_images/Diamonds_7.png");
		this.eightDiamonds = new Image("_images/Diamonds_8.png");
		this.nineDiamonds = new Image("_images/Diamonds_9.png");
		this.tenDiamonds = new Image("_images/Diamonds_10.png");
		this.jackDiamonds = new Image("_images/Diamonds_Jack.png");
		this.queenDiamonds = new Image("_images/Diamonds_Queen.png");
		this.kingDiamonds = new Image("_images/Diamonds_King.png");
		this.aceClubs = new Image("_images/Clubs_Ace.png");
		this.twoClubs = new Image("_images/Clubs_2.png");
		this.threeClubs = new Image("_images/Clubs_3.png");
		this.fourClubs = new Image("_images/Clubs_4.png");
		this.fiveClubs = new Image("_images/Clubs_5.png");
		this.sixClubs = new Image("_images/Clubs_6.png");
		this.sevenClubs = new Image("_images/Clubs_7.png");
		this.eightClubs = new Image("_images/Clubs_8.png");
		this.nineClubs = new Image("_images/Clubs_9.png");
		this.tenClubs = new Image("_images/Clubs_10.png");
		this.jackClubs = new Image("_images/Clubs_Jack.png");
		this.queenClubs = new Image("_images/Clubs_Queen.png");
		this.kingClubs = new Image("_images/Clubs_King.png");
	}
}
