public class Main {
    public static void main(String[] args) {
        tack1();
        tack2();
        tack3();
        tack4();
        tack5();
        tack6();
        tack7();
        tack8();
    }
    public static void tack1 () {
        System.out.println("Задача №1");

        int a = 23;
         System.out.println("Значение переменной int с типом a ровно " +a);
        byte b = 127;
        System.out.println("Значение переменной byte с типом b ровно " +b);
        short c = 30000;
        System.out.println("Значение переменной short  с типом c ровно " +c);
        long d = 100000000;
        System.out.println("Значение переменной long с типом d ровно " +d);
        float e = 2.0019F;
        System.out.println("Значение переменной float с типом e ровно " +e);
        double i = 234234l;
        System.out.println("Значение переменной double с типом i ровно " +i);
    }
    public static void tack2 () {
        System.out.println("Задача №2");
        float e = 27.12F;
        System.out.println("Значение переменной float " +e);
        long a = 987678965549l;
        System.out.println("Значение переменной int " +a);
        float c = 2.786F;
        System.out.println("Значение переменной float " +c);
        short s = 569;
        System.out.println("Значение переменной short " +s);
        short w = -159;
        System.out.println("Значение переменной short " +w);
        short i = 27897;
        System.out.println("Значение переменной short " +i);
        byte b = 67;
        System.out.println("Значение переменной byte " +b);
    }
    public static void tack3 () {
        System.out.println("Задача №3");
        byte ludmila = 23;
        byte anna = 27;
        byte ekaterina = 30;
        int student = ekaterina + anna +ludmila;
        short sheets = 480;
        long sheetStudent = sheets/student;
        System.out.println("На каждого ученика рассчитано  " +sheetStudent+ " листов бумаги");
    }
    public static void tack4 () {
        System.out.println("Задача №4");
        byte bottle = 16;
        byte a = 20;
        int minBottle = bottle/2;
        int min20 = minBottle*20;
        System.out.println("За "+a+ " минут машина произвела "+min20+" штук бутылок");
        byte b = 1;
        byte hour = 60;
        int day = hour*24;
        int dayBottle = day*minBottle;
        System.out.println("За "+b+ " сутки машина произвела "+dayBottle +" штук бутылок");
        byte с = 3;
        byte hour1 = 60;
        int day1 = hour1*24;
        int day3 = day1*3;
        int dayBottle1 = day3*minBottle;
        System.out.println("За "+с+ " дня машина произвела "+dayBottle1+" штук бутылок");
        byte d = 31;
        byte hour2 = 60;
        int day2 = hour2*24;
        int day4 = day2*31;
        int dayBottle2 = day4*minBottle;
        System.out.println("За "+d+ " дня машина произвела "+dayBottle2+" штук бутылок");


    }
    public static void tack5 () {
        System.out.println("Задача №5");
        byte banok = 120;
        byte Klass1 = 6;
        int klassov = banok/Klass1;
        int banokBel = klassov*2;
        int banokCher = klassov*4;
        System.out.println("В школе, где "+klassov+ " классов, нужно "+banokBel+" банок белой краски и "+banokCher+" банок коричневой краски");
    }
    public static void tack6 () {
        System.out.println("Задача №6");
        int banan = 5*40;
        int milk = 200*105;
        int iceСream = 2*100;
        int RawEggs = 4*70;
        int weightInGrams = banan + milk + iceСream + RawEggs;
        double weightInKg = weightInGrams/1000;
        System.out.println("Вес "+weightInGrams+ " гр., вес "+weightInKg+"кг.");

    }
    public static void tack7 () {
        System.out.println("Задача №7");
        float a = 250;
        float b = 500;
        float c = 7000;
        float x = c/a;
        float w = c/b;
        double q = c/((a+b)/2);
        System.out.println("Кол-во дней похудения при потере 250 гр. = "+x);
        System.out.println("Кол-во дней похудения при потере 500 гр. = "+w);
        System.out.println("потребоваться дней в среднем, чтобы добиться результата похудения = "+q);


    }
    public static void tack8 () {
        System.out.println("Задача №8");
        float masha = 67760;
        float  denis = 83690;
        float  kristina = 76230;
        float  t = (masha*10)/100;
        float  y = (denis*10)/100;
        float  u = (kristina*10)/100;
        float  e = masha + t;
        float  r = denis + y;
        float o = kristina + u;
        float  g = (t*12);
        float  h= (y*12);
        float  j= (u*12);
        System.out.println("Маша теперь получает "+e+ " рублей. Годовой доход вырос на "+g);
        System.out.println("Маша теперь получает "+r+ " рублей. Годовой доход вырос на "+h);
        System.out.println("Маша теперь получает "+o+ " рублей. Годовой доход вырос на "+j);
    }

}