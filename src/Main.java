import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        System.out.println(T(10));
        System.out.println(NonReT(10));
    }
    static int T(int n)
    {
        if(n==0)
            return 1;
        else if(n==1)
            return 1;
        else
            return T(n-1)+(n-1)*T(n-2);
    }
    static int NonReT(int n)
    {
        if(n==0)
            return 1;
        else if(n==1)
            return 1;
        else{
            LinkedList<Integer> list= new LinkedList();
            list.add(1);
            list.add(1);
            while(list.size()<=n)
            {
                list.add(list.get(list.size()-1) + (list.size()-1) * list.get(list.size()-2));
            }
            return list.get(n);
        }
    }
}