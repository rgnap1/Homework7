public class Main {
    public static void main(String[] args) {
        System.out.println(" ");
        System.out.println("//Homework 7.1");
        System.out.println("//task1");

        int moneyboxInMounth = 15000;
        int totalMoneyInMounth ;
        int totalMoney= 2459000;
        int totalMoney2 = 0;
        int i = 1;
        while (totalMoney2<totalMoney) {
            totalMoneyInMounth = moneyboxInMounth/100;
            totalMoneyInMounth = totalMoneyInMounth+moneyboxInMounth;
            //           totalMoney2 = totalMoney*12;
            totalMoney2 = totalMoney2+totalMoneyInMounth;
            System.out.println("Месяц " +  i + " сумма накоплений равна " + totalMoney2 + " рублей");
            i++;
        }
        System.out.println("Всего месяцев " + i);

        //       System.out.println("За  накоплений под 12% годовых скопилось вего " + totalMoney2 + " рублей" );
        System.out.println(" ");
        System.out.println("//task2");
        System.out.println(" ");
        //task2
        int a = 1;
        int b = 10;
        while (a<=b){
            System.out.print(a + " ");
            a++;
        } System.out.println(" ");
        for (b= 10; b>0; b--){
            System.out.print(b + " ");
        }
        System.out.println(" ");
        System.out.println("//task3");
        System.out.println(" ");
        //task3
        int y = 12_000_000;
        int fertilityInYear= 17;
        //       System.out.println("Рождаемость " + fertilityInYear);
        int mortalityInYear = 8;
        //       System.out.println("Смертность " + mortalityInYear);
        int c = 2022;
        while (c<=2032){
            int totalPeoleInYear = (y/1000)*17-(y/1000)*8;
//            System.out.println("Население в год " + totalPeoleInYear);
            y = y+totalPeoleInYear;
            //           System.out.println(y);
            System.out.println("Год " + c + " численность населения составляет " + y );
            c++;
        }
        System.out.println(" ");
        System.out.println("//Homework 7.2");
        System.out.println("//task1,2");
        //task1,2
        int startContribution = 15_000;
        int fullContribution = 12_000_000;
        int m = 1;
        for ( ; startContribution <= fullContribution; m++){
            startContribution = startContribution + ((startContribution/100)*7);
            if (m%6==0){
                System.out.println("Месяц " + m + " накопления " + startContribution);
            }
        }
        System.out.println("Потребуется " + m + " месяцев,чтобы накопить " + startContribution);
        System.out.println(" ");
        System.out.println("//task3");
        //task3
        int vasiliiMoney = 15_000;
        int vasiliiYears = 9;
        for (int v = 0;v < vasiliiYears ; v++){
            vasiliiMoney = vasiliiMoney+((vasiliiMoney/100)*7);
            vasiliiYears = 9*12;
            if (v%6==0){
                System.out.println("Месяц " + v + " накопления " + vasiliiMoney);
            }
        }
        System.out.println(" ");
        System.out.println("//task4");
        //task4
        int fullDayInMonth = 31;
        int friday = 2;
        for (int f=2;f<fullDayInMonth;f = f+7){
                System.out.println(" Сегодня пятница " + f + " число. Необходимо подготовить отчет.");
        }
        System.out.println(" ");
        System.out.println("//Homework 7.3");
        System.out.println("//task1");
        //task1
        int cometFlightStartYear= 1822;
        int cometFlightAfterYear = 2122;
        for (int z = 2022; z>cometFlightStartYear; z--){
            if (z%79==0){
                System.out.println("Комета пролетала над Землей в " + z + " году");
            }
        }
        for (int k = 2022; k<cometFlightAfterYear; k++){
            if (k%79==0){
                System.out.println("В следующий раз комета пролетит над Землей в " + k + " году");
            }
        }
        System.out.println(" ");
        System.out.println("//task2");
        //task2
        for (int u = 2; u < 3; u++){
            for(int w = 1; w<= 10; w++)
                System.out.println(u+"*"+w+"="+u*w);
        }















    }
}

