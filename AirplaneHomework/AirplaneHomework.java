public class AirplaneHomework {
    public static void main(String[] args) {
        int[] shatle = new int[101];
        for (int i = 1; i < shatle.length ; i++) {
            shatle[i] = i; }
        for (int i = 1; i < shatle.length ; i++) {
            if (i== 4 || i==9 ){
                i++;
            }
            System.out.print(shatle[i]+ " ");
        }
    }
}
