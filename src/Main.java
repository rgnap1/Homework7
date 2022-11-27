import java.util.Scanner;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println(" ");
        System.out.println("Homework 7.1");
        System.out.println("//task1");

        int moneyboxInMounth = 15_000;
        int totalMoney= 2_459_000;
        int saveMoney = 0;
        int numberMonth = 1;
        double percent = 0.12;
        while (saveMoney<totalMoney) {
            saveMoney+=moneyboxInMounth;
            if (numberMonth%12==0){
                saveMoney+=saveMoney*percent;
            }
            System.out.println("Месяц " +  numberMonth + " сумма накоплений равна " + saveMoney + " рублей");
            numberMonth++;
        }
        System.out.println("Всего месяцев " + numberMonth);

        System.out.println("Homework 7.1 ");
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
        System.out.println("Homework 7.1");
        System.out.println("//task3");
        System.out.println(" ");
        //task3
        int population = 12_000_000;
        int fertilityInYearBy1000= 17;
        int mortalityInYearBy1000 = 8;
        int increase = fertilityInYearBy1000-mortalityInYearBy1000;
        for (int year = 1; year<=10;year++){
            population+=population*increase/1000;
            System.out.println("Год " + year + " численность населения составляет " + population );
        }


        System.out.println(" ");
        System.out.println("Homework 7.2");
        System.out.println("//task1,2");
        //task1,2
        int startContribution = 15_000;
        int fullContribution = 12_000_000;
        int month= 1;
        double percent2 = 0.07;
        for ( ; startContribution <= fullContribution; month++){
            startContribution += startContribution * percent2;
            if (month%6==0){
                System.out.println("Месяц " + month + " накопления " + startContribution);
            }
        }
        System.out.println("Потребуется " + month + " месяцев,чтобы накопить " + startContribution);
        System.out.println("Homework 7.2 ");
        System.out.println("//task3");
        //task3
        int vasiliiMoney = 15_000;
        int vasiliiYears = 9;
        double percent3 = 0.07;
        int month1 = 1;
        for (;month1 <= vasiliiYears*12 ; month1++){
            vasiliiMoney += vasiliiMoney*percent3;
            if (month1%6==0){
                System.out.println("Месяц " + month1 + " накопления " + vasiliiMoney);
            }
        }

        System.out.println("Homework 7.2 ");
        System.out.println("//task4");
        //task4
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи число: ");
        int firstFriday = scanner.nextInt();
        if(firstFriday>0 && firstFriday<=7){
            for (int day=firstFriday;day<=31;day+=7){
                System.out.println(" Сегодня пятница %s  чисчло, необходимо подготовить отчет\n"+ day );
            }
        }
        scanner.close();



        System.out.println(" ");
        System.out.println("Homework 7.3");
        System.out.println("//task1");
        //task1
        int cometFlightStartYear= 1822;
        int cometFlightAfterYear = 2122;
        int year1 = 2022;
        for (; year1>cometFlightStartYear; year1--){
            if (year1%79==0){
                System.out.println("Комета пролетала над Землей в " + year1 + " году");
            }
        }
        for (int year2 = 2022; year2<cometFlightAfterYear; year2++){
            if (year2%79==0){
                System.out.println("В следующий раз комета пролетит над Землей в " + year2 + " году");
            }
        }
        System.out.println("Homework 7.3");
        System.out.println("Task1, option 2");
        int year = 0;
        int nowYear = LocalDate.now().getYear();
        int startYear = nowYear-200;
        int finishYear = nowYear+100;
        int period = 79;
        while (year<=finishYear){
            if(year>=startYear){
                System.out.println(year);
            }
            year+=period;
        }



        System.out.println("Homework 7.3 ");
        System.out.println("//task2");
        //task2
        for (int u = 2; u < 3; u++){
            for(int w = 1; w<= 10; w++)
                System.out.println(u+"*"+w+"="+u*w);
        }















    }
}

