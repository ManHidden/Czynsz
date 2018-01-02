public class Calculations {
    
    static double price;
    static double oldMeasurmentPower = 7388.1;
    static double newMeasurmentPower = 7488.9;
    static double differencePower = newMeasurmentPower - oldMeasurmentPower;

    static double oldMeasurmentGas = 1272.423;
    static double newMeasurmentGas = 1304.970;
    static double differenceGas = newMeasurmentGas - oldMeasurmentGas;

    static double oldMeasurmentWater = 970.371;
    static double newMeasurmentWater = 981.824;
    static double differenceWater = newMeasurmentWater - oldMeasurmentWater;

    public static double Power(){
        price = ( newMeasurmentPower - oldMeasurmentPower ) * 0.6848;
        return Rounding.round(price, 2);
    }

    public static double Gas(){
        price = ( newMeasurmentGas - oldMeasurmentGas ) * 3.2;
        return Rounding.round(price, 2);
    }

    public static double Water(){
        price = ( newMeasurmentWater - oldMeasurmentWater ) * 10.16;
        return Rounding.round(price, 2);
    }

    public static double Rubbish(){
        return Rounding.round(3 * 10.13, 2);
    }

    public static double Internet(){
        price = 61.20;
        return Rounding.round(price, 2);
    }

    public static double Rent(){
        return 2400;
    }

    public static void printCalculations(){
        System.out.println("Cena za prąd: " + Power() + ", za osobę: " + Rounding.round(Power()/4, 2));
        System.out.println("Cena za gaz: " + Gas() + ", za osobę: " + Rounding.round(Gas()/4, 2));
        System.out.println("Cena za wodę: " + Water() + ", za osobę: " + Rounding.round(Water()/4, 2));
        System.out.println("Cena za śmieci: " + Rubbish() + ", za osobę: " + Rounding.round(Rubbish()/3, 2));
        System.out.println("Cena za internet: " + Internet() + ", za osobę: " + Rounding.round(Internet()/3, 2));
        System.out.println("Cena za czynsz: " + Rent() + ", za osobę: " + Rounding.round(Rent()/4, 2));
    }

    public static void perPerson(){
        double Karol = Power()/4 + Gas()/4 + Water()/4 + Rubbish()/3 + Internet()/3 + Rent()/4;
        double Sylwia = Power()/4 + Gas()/4 + Water()/4 + Rubbish()/3 + Rent()/4;
        double Roksana = Power()/4 + Gas()/4 + Water()/4 + Rubbish()/3 + Internet()/3 + Rent()/4;
        double Patryk = Power()/4 + Gas()/4 + Water()/4 + Internet()/3 + Rent()/4;

        System.out.println("Karol: " + Rounding.round(Karol, 2));
        System.out.println("Patryk: " + Rounding.round(Patryk, 2));
        System.out.println("Roksana: " + Rounding.round(Roksana, 2));
        System.out.println("Sylwia: " + Rounding.round(Sylwia, 2));
    }

    public static void toPay(){
        double toPay = Power() + Gas() + Water() + Rubbish() + Internet() + Rent();
        System.out.println("Do spółdzielni: 300zł");
        toPay -= 300;
        System.out.println("Do właścicieli: " + toPay + "zł");
    }

    public static void detailedCalculations(){
        System.out.println("Prąd: " + Rounding.round(differencePower, 4) + " * 0.6848" + " = " + Power());
        System.out.println("Gaz: " + Rounding.round(differenceGas, 4) + " * 3.2" + " = " + Gas());
        System.out.println("Woda: " + Rounding.round(differenceWater, 4) + " * 10.16" + " = " + Water());
    }

}


