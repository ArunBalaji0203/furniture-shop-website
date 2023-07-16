import java.util.Arrays;
import java.util.Scanner;

public class arrayprograms{
    public static void main(String[] args){
        arrayprograms ap=new arrayprograms();
       // ap.zohoprgrm1();
       // ap.numpattern();
      ap.stringcount();
    // ap.stringcount1();
      // ap.Parenthesis();
     // ap.palindrome();
    }
    private void stringcount1() {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the string : ");
        String s=sc.nextLine();
        char c[]=new char[s.length()];
        int count[]=new int[s.length()];
        int i,j,k=0;
        for(i=0;i<s.length();i++){
            for(j=0;j<k;j++){
                if(s.charAt(i)==c[j]){
                    count[j]++;
                    break;
                }
            }
            if(j==k){
              //  count=0;
                c[k]=s.charAt(i);
                count[k]=1;
                k++;
            }            
        }
        for(int p=0;p<k;p++){
            System.out.print(c[p]+""+count[p]);
        }
    }
    private void palindrome() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string or number : ");
        String s=sc.nextLine();
        char c[]=new char[s.length()];
        int i,j=0,count=0;
        for(i=s.length()-1;i>=0;i--){
            c[j]=s.charAt(i);
            j++;
        }
        for(int k=0;k<s.length();k++){
            if(c[k]==s.charAt(k)){
                count++;
            }
        }
        if(count==s.length()){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }

    private void Parenthesis() {
        int l=0,i=1,len;
        String s="{[()]}()";
        len=s.length()*2;
        System.out.print("The Given Parenthesis "+s.toString()+" is : ");
        while(i<=len){
            if(s.length()==0){
                break;
            }
              if(l>=s.length()){
               l=0;
                          }  
                 if(s.charAt(l)=='{'&&s.charAt(l+1)=='}'||s.charAt(l)=='('&&s.charAt(l+1)==')'||s.charAt(l)=='['&&s.charAt(l+1)==']'){
                        s=s.substring(0,l)+s.substring(l+1+1,s.length());
                    }
                    l++;  
                    i++;
                }
        if(s.length()==0){
            System.out.print("BALANCED");
        }else{
            System.out.print("UNBALANCED");
        }
    }

    private void stringcount() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string : ");
        String s=sc.nextLine();//a10b2
        int i=0,j,num=0;
        char letter;
        for(i=0;i<s.length();i++)
        {
            if(s.charAt(i)<='9'&&s.charAt(i)>='0')
            {
                letter=s.charAt(i-1);
                while(i<s.length()&&s.charAt(i)<='9'&&s.charAt(i)>='0')
                {
                    num=(num*10)+s.charAt(i)-48;
                    i++;
                }
                for(j=0;j<num;j++)
                {
                    System.out.print(letter);
                }
            }
             num=0; 
        } 
        
    }

    private void numpattern() {
        int last, sise,n=3,front=0,i,j;
        sise=n*2-1;
        last=sise-1;
        int a[][]=new int[sise][sise];
        while(n!=0){
        for(i=front;i<=last;i++){
            for(j=front;j<=last;j++){
                if(i==front||i==last||j==front||j==last){
                    a[i][j]=n;
                }
            }
        }front++;
        last--;
        n--;
    }
    for(i=0;i<a.length;i++){
        for(j=0;j<a[0].length;j++){
            System.out.print(a[i][j]+" ");
        }
        System.out.println();
    }
    }

    private void zohoprgrm1() {
        int i=0,len,s=0;
        int a[]={1,2,3,4,5,6,7,8,9};
        int b[]=new int[a.length];
        System.out.println("The array elements are : "+Arrays.toString(a));
        if(a.length%2!=0){
        len=a.length-1;
        }else{
            len=a.length;
        }
      //  System.out.print("After complete : ");
        for(i=0;i<a.length;i++){
            if(i%2==0){
              //  System.out.print(a[i]+" ");
                b[s]=a[i];
                s++;
            }else{
                //System.out.print(a[len-i]+" ");
                b[s]=a[len-i];
                s++;
            }   
        }
        System.out.print("After complete : "+Arrays.toString(b));
    }
}