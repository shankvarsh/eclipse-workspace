package sem2;

public class StringAscBin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str[]= {"Kai", "Cherry","Chay1","Chay2","Angel","Angela", "Pinky", "Isabella", "Panda"};
		String temp;
		for (int i=0; i<str.length; i++)
		{
			for(int j=i+1; j<str.length;j++)
			{
				if(str[j].compareTo(str[i])>0)
				{
					temp=str[i];
					str[i]=str[j];
					str[j]=temp;
				}
			}
			System.out.println(str[i]);
		}
	}

}
