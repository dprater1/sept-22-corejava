package com.cognixia.jump.fileio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.cognixia.jump.classandobjects.Animal;
import com.cognixia.jump.classandobjects.Horse;

public class ObjectStreamDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("resources/objectFile.data");
		
		try {
			file.createNewFile();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		
		//writeObjectsToFile(file);
		readObjectsToFile(file);
		
	}

	private static void readObjectsToFile(File file) {
		
		// must know the order , and number of objects with types to read
		try (ObjectInputStream reader = new ObjectInputStream(new FileInputStream(file))){
			Animal animal = (Animal) reader.readObject();
			System.out.println(animal);
			
			Horse horse = (Horse) reader.readObject();
			System.out.println(horse);
			
			String string = (String) reader.readObject();
			System.out.println(string);
			
			int num = (int) reader.readInt();
			System.out.println(num);
			
			boolean bool = (boolean) reader.readBoolean();
			System.out.println(bool);
			
			char ch = (char) reader.readChar();
			System.out.println(ch);
			
			int[] numArr = (int[]) reader.readObject();
			System.out.println(Arrays.toString(numArr));
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	private static void writeObjectsToFile(File file) {
		Animal animal = new Animal("Whale", 2500);
		Horse horse = new Horse();
		String hello = "Hello World.";
		
		try(ObjectOutputStream writer = new ObjectOutputStream(new FileOutputStream(file))) {
			writer.writeObject(animal);
			writer.writeObject(horse);
			writer.writeObject(hello);
			
			int num = 4;
			boolean bool = true;
			char ch = '#';
			
			writer.writeInt(num);
			writer.writeBoolean(bool);
			writer.writeChar(ch);
			
			int[] numArr = {1,3,5,7};
			writer.writeObject(numArr);
			
			List<String> list = new ArrayList<>();
			list.add("str1");
			list.add("str2");
			
			
			writer.writeObject(list);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
