package Bootcamp;

public class Swapnibbles {
	static int swapnibbles(int x){
		return ((x & 0x0F)<<4 |(x & 0xF0)>>4);
	}
	public static void main(String[] args){
		int x=100;
		System.out.println(swapnibbles(x));
	}

}