public class playground {
    public static void main(String[] args) {
        int i = nbYear(1500, 5, 100, 5000);
        System.out.println(i);

    }

    public static int nbYear(int p0, double percent, int aug, int p) {
        int result = 0;

        while(p0 < p){
            p0 = p0 + (int)Math.floor(p0*percent/100) + aug;
            System.out.println(result + "tambien p0 " + p0);
            result++;
        }
        return result;
    }
}
