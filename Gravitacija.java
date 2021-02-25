public class Gravitacija{
    public static void main(String[] args){
        System.out.println("OIS je zakon!");

        double nd = Integer.parseInt(args[0]) * 1000;
    }

    public static double izracun(double nd){
        final double c = 6.674 * Math.pow(10,-11);
        final double m = 5.972 * Math.pow(10,24);
        final double r = 6.371 * Math.pow(10,6);
        double a = c*m/Math.pow(r+nd,2);
        return a;
    }

    public static void izpis(double nd, double a){
        System.out.println(nd);
        System.out.println(a);
    }
}