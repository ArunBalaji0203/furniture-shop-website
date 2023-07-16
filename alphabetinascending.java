import java.util.Arrays;

public class alphabetinascending{
    public static void main(String[] args){
        char c[]={'d','e','g','f','a','s','b','c'};
        char tmp;
        for(int i=0;i<c.length;i++){
            for(int j=i+1;j<c.length;j++){
                if(c[i]-48>c[j]-48){
                    tmp=c[i];
                    c[i]=c[j];
                    c[j]=tmp;

                }
            }
        }
        System.out.println(Arrays.toString(c));
    }
}