package javabasic;
//method
public class Main {
	static int boxVolume(int length, int height , int width) {
		int vol=length*height*width;
		return vol;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This is methods");
		int result=boxVolume(2,6,8);
		System.out.println(result);
	}

}
