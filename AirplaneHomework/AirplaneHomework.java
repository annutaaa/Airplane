public class AirplaneHomework {
    public static void main(String[] args) {
        int shatle = 1;

        for (int i = 0; i < 100; i++) {
            if (shatle % 10 == 4 || shatle % 10 == 9) {
                shatle++;
            }
            if (shatle / 10 % 10 == 4 || shatle / 10 % 10 == 9) {
                shatle += 10;
            }
            System.out.print(shatle + " ");
            shatle++;
        }
    }
}
