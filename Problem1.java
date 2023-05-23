import java.util.*;

public class week13_1 {
     static Pair[] arr=new Pair[10];
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList< String > list = new ArrayList<String>();
        System.out.print("Enter five integers and five doubles: ");

        
        for(int i=0;i<10;++i)
        {
            list.add(input.next());
        }
        
        sort(list);
        
        for(int i=0;i<10;++i)
        {
            System.out.print(list.get(arr[i].index)+" ");
        }
        input.close();
    }

     public static void sort(ArrayList<String> list) 
    {
        
        for(int i=0;i<10;++i)
        {
            arr[i]=new Pair(Double.parseDouble(list.get(i)),i); 
        }
        Arrays.sort(arr);

        
    }
    static class Pair implements Comparable<Pair>
    {
        public double d;
        public int index;
        Pair(double dd, int idx )
        {
            d=dd;index=idx;
        }

        @Override
        public int compareTo(Pair p)
        {
            if(Double.compare(this.d,p.d)<0) return -1;
            else if(Double.compare(this.d,p.d)==0) return 0;
            else return 1;

        }
    }
}
