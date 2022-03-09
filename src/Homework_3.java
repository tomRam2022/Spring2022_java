public class Homework_3 {
    public static void main(String[] args) {

        /**
         *
         * Due date: Mar 8 2022
         *
         *C -> F
         * C -> K
         *
         * F -> C
         * F -> K
         *
         * K -> C
         * K -> F
         *
         */



        double fTemp = 60;
        double fahTempToCels = (fTemp- 32) * 5/9;
        double fahTempToKelv = (fTemp+459.67)* 5/9;
        double cTemp = 15.55;
        double celsTempToFah = cTemp * 9/5 + 32;
        double celsTempToKelv = cTemp + 273.15;
        double kTemp = 288.70;
        double kelvTempToCels = kTemp - 273.15;
        double kelvTempToFah = kTemp * 9/5 - 459.67;

        System.out.println();
        System.out.println(cTemp + " degrees celsius to fahrenheit = " + celsTempToFah);
        System.out.println(cTemp + " degrees celsius to kelvin = " + celsTempToKelv);
        System.out.println(fTemp + " degrees fahrenheit to celsius = " + fahTempToCels);
        System.out.println(fTemp + " degrees fahrenheit to kelvin = " + fahTempToKelv);
        System.out.println(kTemp + " kelvin to celsius degree = " + kelvTempToCels);
        System.out.println(kTemp + " kelvin to fahrenheit degrees + " + kelvTempToFah);

    }
}
