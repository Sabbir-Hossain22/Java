public class BreakDemo {
    public static void main(String[] args) {
        
        for(int i=1 ; i<=10 ; i=i+3)
        {
            if (i==10)
            {
                continue;
            }
            System.out.println(i);
        }
        
    }
}
