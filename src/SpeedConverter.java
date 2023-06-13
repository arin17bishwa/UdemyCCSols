public class SpeedConverter {
    public static void main(String[] args) {
        System.out.println(toMilesPerHour(1.5));
        System.out.println(toMilesPerHour(10.25));
        System.out.println(toMilesPerHour(-5.6));
        System.out.println(toMilesPerHour(25.42));
        System.out.println(toMilesPerHour(75.114));

        printConversion(1.5);
        printConversion(10.25);
        printConversion(-1.5);
    }
    public static long toMilesPerHour(double kilometersPerHour){
        if (kilometersPerHour<0){
            return -1L;
        }
        double dividingFactor=1.609;
        return  Math.round(kilometersPerHour/dividingFactor);
    }

    public static void printConversion(double kilometersPerHour){
        long result=toMilesPerHour(kilometersPerHour);
        if (result<0){
            System.out.println("Invalid Value");
            return;
        }
        System.out.println(kilometersPerHour+" km/h = "+result+" mi/h");
    }

}
