package javaReview;
public class ArrayRev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]=new int[2];
arr[0]=1;
arr[1]=2;

for(int i:arr) {
	System.out.println(i);
}
/*----------------*/
int a[]= {58,96,56,45};
for(int j:a) {
	System.out.println(j);
}
/*----Multidimensional Array----
int b[][]={{1,2},{1,3},{1,5},{1,9}};
for(int k=0; k<5; k++) {
	for(int m=0; m<5; m++) {
	System.out.println(b[k][m]+" ");
}
	System.out.println();
}*/

	}

}
