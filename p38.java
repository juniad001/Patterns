package programs;
/*  A
   BBB
  CCCCC
 DDDDDDD
EEEEEEEEE
program to print this pattern*/

public class p38 {
	public static void main(String[] args) {
		int row = 5;
		int noch = 1;
		int space = row-1;
		char ch = 'A';
		for(int i = 0;i<row;i++) {
			for(int j = 0;j<space;j++) {
				System.out.print(' ');
			}
			for(int k = 0;k<noch;k++) {
				System.out.print(ch);
			}
			System.out.println();
			ch++;
			noch+=2;
			space--;
		}
	}
}
