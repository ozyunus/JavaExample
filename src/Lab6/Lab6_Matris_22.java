package Lab6;

public class Lab6_Matris_22 {

	public static void main(String[] args) {
		int number1=0;
		int number2=0;
		int count = 0;
		int[][] table = {
				{1,9,6,8},
				{29,8,4,9},
				{6,4,5,4},
				{8,9,4,7}
				
		};
		for (int i=0; i<table.length; i++) {
			for (int j=0; j<table[i].length; j++) {
				number1=table[i][j];
				number2=table[j][i];
				if(number1==number2) {
					count++;
				}
			}
		}
		
		if(count==((table[0].length*table.length) )) {
			System.out.println("simetrik");
		}
		else {
			System.out.println("değil");
		}
		
		
		/*
		if (count==table[0].length*table.length){
			count= (count - table.length)/2;
		}
		if(count==((table[0].length*table.length)-table.length)/2) {
			System.out.println("simetrik");
			System.out.println("count :"+count);
		}
		else {
			System.out.println("Değil!");
			System.out.println("count :"+count);

		}
		*/
	}

}
