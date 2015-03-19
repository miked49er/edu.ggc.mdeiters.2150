
package edu.ggc.mdeiters.IC6;

import javafx.embed.swing.SwingFXUtils;
import javafx.scene.image.Image;
import javafx.scene.image.PixelReader;
import javafx.scene.image.PixelWriter;
import javafx.scene.image.WritableImage;

import javax.imageio.ImageIO;

import java.io.File;

/** Class: PicEditor
 * @author Mike Deiters
 * @version 1.1
 * ITEC 2150 Spring 2015
 * Written: Mar 17, 2015
 * 
 * Class Description: Picture editing tools
 * 
 * Purpose: Perform various edits on a picture
 * 
 */
public class PicEditor {

	private WritableImage writePic;
	private PixelReader reader;
	private PixelWriter writer;

	/**
	 * Method: imageReader 
	 * @param src Image passed in to be edited
	 * Method Description: Initiate the WritableImage, PixelReader, and the PixelWriter
	 */
	public void imageReader(Image src) {

		// Reads src

		reader = src.getPixelReader();

		// Creates an image that can be written

		writePic = new WritableImage((int) src.getWidth(), (int) src.getHeight());

		// Writes to writePic

		writer = writePic.getPixelWriter();
	}

	/**
	 * Method: invertColors 
	 * @param src Image passed in to be edited
	 * @return writePic Image that has been edited
	 * Method Description: Inverts each pixel of src
	 */
	public Image invertColors(Image src) {

		imageReader(src);

		for (int i = 0; i < writePic.getWidth(); i++) {

			for (int j = 0; j < src.getHeight(); j++) {

				// Inverts pixel coordinate (i,j) of src

				writer.setColor(i, j, reader.getColor(i, j).invert());
			}
		}

		return writePic;
	}

	/**
	 * Method: adjustColors 
	 * @param src Image passed in to be edited
	 * @param num Int used to adjust the Argb
	 * @return writePic Image that has been edited
	 * Method Description: Adjust the Argb of each pixel in src
	 */
	public Image adjustColors(Image src, int num) {

		imageReader(src);

		for (int i = 0; i < writePic.getWidth(); i++) {

			for (int j = 0; j < src.getHeight(); j++) {

				// Adjusts the Argb of pixel coordinate (i,j) in src

				writer.setArgb(i, j, (reader.getArgb(i, j) + num));
			}
		}

		return writePic;
	}
	
	/**
	 * Method: saveImg 
	 * @param src File to save the image to
	 * @return String of to tell the user if the save was successful
	 * Method Description: saves the edited image
	 */
	public String saveImg(File src) {
		
		try {
			
			ImageIO.write(SwingFXUtils.fromFXImage(writePic, null), "png", src);
			
			return "The image saved";
		
		} catch (Exception e) {
			
			return "An error occured. Please try again.";
		}
	}
}
