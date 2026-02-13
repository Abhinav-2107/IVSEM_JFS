import java.util.*;
class sinknode{
			public static void main(String[] args){
				int arr[][] = {{0,1,1,0,1},{0,0,0,1,0},{0,0,0,1,1},{0,0,0,0,0},{0,0,0,0,0}};
				boolean a = false;
				for(int i=0;i<arr.length;i++){
					for(int j=0;j<arr[i].length;j++){
						if(arr[i][j]==1){
						a=false;
							break;
						}else{
							a=true;
						}
				}if(a==true){
					System.out.println((char)(65+i));
				}
				}
			}
}