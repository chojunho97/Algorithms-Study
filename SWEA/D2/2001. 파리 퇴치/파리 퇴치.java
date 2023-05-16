import java.util.*;

public class Solution{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t=sc.nextInt();
		for(int tc=0; tc<t; tc++) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			
			int max=0;
			int[][] a = new int[n][n];
			for(int i =0; i<n; i++) {
				for(int j=0; j<n; j++) {
					a[i][j]=sc.nextInt();
				}
			}
			
			for(int i=0; i<n-m+1;i++) {
				for(int j=0; j<n-m+1; j++) {
					int sum=0;
					for(int k=0; k<m; k++) {
						for(int l=0; l<m; l++) {
							sum+=a[i+k][j+l];
						}
					}
					max=Math.max(max, sum);
				}
			}
			System.out.println("#"+(tc+1)+" "+max);
		}
	}
}