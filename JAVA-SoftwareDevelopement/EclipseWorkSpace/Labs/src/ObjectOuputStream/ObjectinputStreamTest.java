package ObjectOuputStream;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ObjectinputStreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d:\\output2.obj"));
			int num = ois.readInt();
			System.out.println("num=" + num);
			
			Student stu = (Student)ois.readObject();
			System.out.println("Student name=" + stu.getName());
			System.out.println("Student age=" + stu.getAge());
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
