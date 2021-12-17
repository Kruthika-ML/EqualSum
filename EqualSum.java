public class EqualSum {
    public static void main(String[] args) {
        hasEqualSum(1,1,1);
        hasEqualSum(1,1,2);
        hasEqualSum(1,-1,0);
    }
    public static void hasEqualSum(int int1, int int2, int int3){
        int Sum = int1 + int2;
        if(Sum == int3){
            System.out.println("True");
        }else {
            System.out.println("False");
        }
    }
}
