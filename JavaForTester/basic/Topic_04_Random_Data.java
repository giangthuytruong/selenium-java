package basic;

import java.util.Random;

public class Topic_04_Random_Data {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand=new Random();
		System.out.println(rand.nextInt());
		//0->999=1000 số
		System.out.println(rand.nextInt(999));
		//1-1000=1000 số
		System.out.println(rand.nextInt(9999));
		System.out.println(rand.nextDouble());
		System.out.println(rand.nextLong());
		System.out.println(rand.nextFloat());
		//Vì các loại khác ra số âm (email ko có số âm) =>Chọn nextInt(9999)
		System.out.println("stevejob"+rand.nextInt(9999)+"@hotmail.net");
	}

}
