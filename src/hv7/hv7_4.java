package hv7;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class hv7_4 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
//		請寫一支程式,利用老師提供的Dog與Cat類別分別產生兩個物件,寫到C:\data\Object.ser裡。注
//		意物件寫入需注意的事項,若C:\內沒有data資料夾,請用程式新增這個資料夾
		//Folder
		File dataFolder = new File("C:\\data");
		String filePath = dataFolder + "\\Object.ser";
		if(!dataFolder.exists()) {
			dataFolder.mkdir();
		}
		//OutputAnimal
		Cat cat_1 = new Cat("A_Cat");
		Cat cat_2 = new Cat("B_Cat");
		Dog dog_1 = new Dog("A_Dog");
		Dog dog_2 = new Dog("B_Dog");
		FileOutputStream os = new FileOutputStream(filePath);
		ObjectOutputStream oo = new ObjectOutputStream(os);
		
		oo.writeObject(cat_1);
		oo.writeObject(cat_2);
		oo.writeObject(dog_1);
		oo.writeObject(dog_2);
		oo.close();
		os.close();
		
		
		//InputAnimals
		FileInputStream fi = new FileInputStream(filePath);
		ObjectInputStream oi = new ObjectInputStream(fi);
		List<Animal> animals=  new ArrayList<>(); ;
		
		while(true) {
			try {
				Animal a = (Animal) oi.readObject();
				animals.add(a);
			}catch(EOFException e) {
				break;
			}
		}
		
		for(Animal a : animals) {
			a.speak();
		}
	}
}
