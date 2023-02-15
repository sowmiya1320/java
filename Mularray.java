package javabasic;

public class Mularray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] myNumbers= {{1,2,3,4},{5,6,7}};     //{0,1,2,3}length=4,{0,1,2}length=3
		for(int i=0;i<myNumbers.length;++i)
		{
			for(int j=0;j<myNumbers[i].length;++j)
			{
				System.out.println(myNumbers[i][j]);
			}
														
		}

	}

}
