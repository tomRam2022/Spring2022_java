package Class7;

public class HomeWork_3 {
    public static void main(String[] args) {
        double fTemp = 60.0D;
        double fahTempToCels = (fTemp - 32.0D) * 5.0D / 9.0D;
        double fahTempToKelv = (fTemp + 459.67D) * 5.0D / 9.0D;
        double cTemp = 15.55D;
        double celsTempToFah = cTemp * 9.0D / 5.0D + 32.0D;
        double celsTempToKelv = cTemp + 273.15D;
        double kTemp = 288.7D;
        double kelvTempToCels = kTemp - 273.15D;
        double kelvTempToFah = kTemp * 9.0D / 5.0D - 459.67D;
        System.out.println();
        System.out.println(cTemp + " degrees celsius to fahrenheit = " + celsTempToFah);
        System.out.println(cTemp + " degrees celsius to kelvin = " + celsTempToKelv);
        System.out.println(fTemp + " degrees fahrenheit to celsius = " + fahTempToCels);
        System.out.println(fTemp + " degrees fahrenheit to kelvin = " + fahTempToKelv);
        System.out.println(kTemp + " kelvin to celsius degree = " + kelvTempToCels);
        System.out.println(kTemp + " kelvin to fahrenheit degrees + " + kelvTempToFah);
    }
}
