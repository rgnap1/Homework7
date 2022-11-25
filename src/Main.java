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
        int totalPeoleInYear = ((1000+fertilityInYear)-mortalityInYear);
//        System.out.println("Население в год " + totalPeoleInYear);
        int c = 2022;
        while (c<=2032){
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
        int fulldayInMounth = 31;
        int friday = 2;
        for (int f=2;f<fulldayInMounth;f = f+7){
                System.out.println(" Сегодня пятница " + f + " число. Необходимо подготовить отчет.");
        }











    }
}

