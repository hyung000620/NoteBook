import java.util.*;
public class Main {
  public boolean isPrime(int num){
  	if(num == 1) return false;
    for(int i =2; i< num; i++){
    	if(num%i == 0) return false;
    }
  }
  public ArrayList<Integer> solution(int n, int[] arr){
  	ArrayList<Integer> answer = new ArrayList<>();
    for(int i=0; i<n; i++){
    	int tmp = arr[i];
      	int res = 0;
      	while(tmp >0){
        	int t = tmp%10;
          	res = res*10 +t;
          	tmp = tmp/10;
        }
      if(isPrime(res)) answer.add(res);
    }
    return answer;
  }
  
  public static void main(String[] args){
    Main main = new Main();
    Scanner in=new Scanner(System.in);
    int n = in.nextInt();
    int[] arr = new int[n];
    for(int i=0; i<n; i++){
    	arr[i] = in.nextInt();
    }
    for(int x : main.solution(n, arr)){
    	System.out.print(x+" ");
    }
    }
}
