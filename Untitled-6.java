import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc=new Scanner(System.in);
        long[] l=new long[3];
        for(int i=0;i<3;i++){
            l[i]=sc.nextLong();
        }
        if(l[0]+l[1]==l[2] || l[0]+l[2]==l[1] || l[1]+l[2]==l[0])
        System.out.println("Yes");
        else if(l[0]==l[1] && l[2]%2==0)
        System.out.println("Yes");
        else if(l[1]==l[2] && l[0]%2==0)
        System.out.println("Yes");
        else if(l[0]==l[2] && l[1]%2==0)
        System.out.println("Yes");
        else
        System.out.println("No");
        
    }
}