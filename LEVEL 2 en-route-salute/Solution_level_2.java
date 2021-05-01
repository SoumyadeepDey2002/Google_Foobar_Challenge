import java.util.*;


public class Main{
    public static int solution(String s) {
        //Your code here
        int n = s.length();
        int left[] = new int[n];
        int right[] = new int[n];
        
        int cum = 0;
        //precomputing the number of people present at the left of someone 
        //going left
        for(int i=0;i<n;i++){
            if(s.charAt(i) == '>'){
                cum++;
            }
            left[i] = cum;
        }
        
        cum = 0;
        
        //precomputing the number of people present at the right of someone
        //going right
        for(int i=n-1;i>=0;i--){
            if(s.charAt(i) == '<'){
                cum++;
            }
            right[i] = cum;
        }
        
        int sum = 0;
        
        for(int i=0;i<n;i++){
            if(s.charAt(i) == '<'){
                sum += left[i];
            }
            else if(s.charAt(i) == '>'){
                sum += right[i];
            }
        }
        
        return sum;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(solution(s));
    }
}