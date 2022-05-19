public class BinaryToDecConvert {
    public static void main(String[] args) {
        BinaryToDecConvert.binarytodec(10110);
    }
        static void binarytodec(int x)
        {
            int result=0;
            int base=1;
            while(x>0)
            {
                int rem=x%10;
                if(rem==1)
                {
                    result=result+base;

                }
                x=x/10;
                base=base*2;
            }
            System.out.print(result);
        }
    }

