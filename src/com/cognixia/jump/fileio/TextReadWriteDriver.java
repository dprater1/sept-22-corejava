package com.cognixia.jump.fileio;

import java.io.File;
import java.io.IOException;

// Getting started on working with files, and relative paths
public class TextReadWriteDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// relative path is generally the best thing to do because of file location
		// portability
		String relativeFilepath = "resources1/temp.txt";
		File file = new File(relativeFilepath);
		// This file represents a file / directory
		File resourceFolder = new File("resources1");

		// check if file exists at rel path location specified
		System.out.println("Does file exist? " + relativeFilepath + ": " + file.exists());

		// if file does not exist, make it
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				if (!resourceFolder.exists()) {
					if (resourceFolder.mkdir()) {
						System.out.println("Folder: " + resourceFolder.getName() + " created.");
					}
					else {
						System.out.println("Folder unable to be created.");
					}
				}

				System.out.println("File " + file.getName() + " could not be created with path" + " " + file.getPath());

			}
			System.out.println("File Created." + file.getName());

		}
		System.out.println(file.getAbsolutePath());
		System.out.println(file.lastModified());
	}

}
