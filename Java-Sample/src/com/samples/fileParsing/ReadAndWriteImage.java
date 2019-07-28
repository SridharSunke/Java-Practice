package com.samples.fileParsing;

import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ReadAndWriteImage {

	public static void main(String[] args) throws IOException {
		FileInputStream fstream = new FileInputStream("C:\\testnew\\out.text");
		BufferedInputStream bstream = new BufferedInputStream(fstream);
				
				
				BufferedImage img = new BufferedImage(200, 500, BufferedImage.TYPE_INT_ARGB);
				img=ImageIO.read(new File("c://sample.png"));
				
				ImageIO.write(img, "jpg", new File("I:/output.jpg"));
				
	}
}
