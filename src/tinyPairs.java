public class tinyPairs {
    public static void main(String[] args){
        int[] a = new int[]{16,1,4,2,14};
        int[] b = new int[]{7,11,2,0,15};
        int k = 743;

        int c = solution(a,b,k);
        System.out.println(c);

    }

    public static int solution(int a[],int b[], int k){
        int tinyPairsCount = 0;
        String num1 = "";
        for(int i=0;i<=a.length-1;i++){
            num1 = a[i] + "" +b[a.length-i-1];
            if(Integer.parseInt(num1)<k){
                tinyPairsCount++;
            }
        }
        return  tinyPairsCount;
    }
}
