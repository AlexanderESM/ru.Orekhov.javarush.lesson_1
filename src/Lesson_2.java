public class Lesson_2 {
    public static void main(String[] args) {

        //Создать объект типа Cat 2 раза.
        new Cat();
        new Cat();

        //Создать 3 объекта типа Dog (собака) и присвоить им имена "Max", "Bella", "Jack".
        Dog Max = new Dog();
        Dog Bella = new Dog();
        Dog Jack = new Dog();

        System.out.println("Мне так плохо! Хочу, чтобы все умерли!");

        System.out.println();
        int i = 19;
        System.out.println(i);


        //Объявляет ссылочную переменную с именем cat и типом Cat. Значение переменной cat – ссылка null.
        Cat cat_1;
        Cat cat_2;
        Cat cat_3;
        Cat cat_4;
        Cat cat_5;
        Cat cat_6;
        Cat cat_7;
        Cat cat_8;
        Cat cat_9;
        Cat cat_10;

        /*
        Создаёт ссылочную переменную cat типа Cat.
        Создаёт новый объект типа Cat.
        Присваивает в переменную cat ссылку на новосозданный объект.
        */
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        Cat cat4 = new Cat();
        Cat cat5 = new Cat();
        Cat cat6 = new Cat();
        Cat cat7 = new Cat();
        Cat cat8 = new Cat();

   /*
         Создайте 10 переменных типа Cat и 8 объектов типа Cat.
        Создайте объект типа Cat(кот), объект типа Dog (собака), объект типа Fish (рыбка) и объект типа Woman.
        Присвойте каждому животному владельца (owner).
         */
        Cat myCat = new Cat();
        Dog myDog = new Dog();
        Fish myFish = new Fish();

        myCat.owner = "Вася";
        myDog.owner = "Петя";
        myFish.owner = "Маша";

        //вывод на экрена имена владельцев
        System.out.println(myFish.owner);
        System.out.println(myCat.owner);
        System.out.println(myDog.owner);



        MinAndMaxValue myVal = new MinAndMaxValue();
        System.out.println("Минимум из двух числе (a<b):"+ myVal.minVal(1, 5) );
        System.out.println("Минимум из двух числе (a>b):"+ myVal.minVal(9, 3) );
        System.out.println("Минимум из двух числе (a = b):"+ myVal.minVal(0, 0) );
        System.out.println("Минимум из двух числе (тип double ):"+ myVal.minVal(11.23, 5.1234) );

        System.out.println("Максимально из двух числе (a > b):"+ myVal.maxVal(99, 1) );
        System.out.println("Максимально из двух числе (a < b):"+ myVal.maxVal(2,  4) );
        System.out.println("Максимально из двух числе (a = b):"+ myVal.maxVal(70, 70) );
        System.out.println("Максимально из двух числе (тип double ):"+ myVal.maxVal(11.23, 5.1234) );


        System.out.println("Минимум из трёх числе:"+ myVal.minOfThree(1,2,3) );
        System.out.println("Минимум из трёх числе:"+ myVal.minOfThree(4,5,6) );
        System.out.println("Минимум из трёх числе:"+ myVal.minOfThree(11,11,11) );
        System.out.println("Минимум из трёх числе (тип double ):"+ myVal.minOfThree(11.22,12, 9.876) );

        System.out.println("Максимум из трёх числе (через тернарным оператор):"+ myVal.maxOfThree(1,2,3) );
        System.out.println("Максимум из трёх числе (через тернарным оператор):"+ myVal.maxOfThree(4, 5,6) );
        System.out.println("Максимум из трёх числе (через тернарным оператор):"+ myVal.maxOfThree(77, 77,77) );
        System.out.println("Максимум из дтрёх числе - тип double (через тернарным оператор):"
                            + myVal.maxOfThree(11.23, 5.1234, 10.01) );

        System.out.println("Минимум четырёх чисел: "+  myVal.minOfFour(4, 1, 3, 2)  );

        myVal.printString("Hello java world!");

        myVal.printStringInLine("Вы действительно проверяете всё это?");

    }
}


class MinAndMaxValue {
    //минимум из 2х числех (тип данных int)
    int minVal(int a, int b) {
        if (a == b) return a;
        return (a < b) ? a : b;
    }

    //минимум из 2х числех (тип данных double)
    double minVal(double a, double b) {
        if (a == b) return a;
        return (a < b) ? a : b;

    }

    //максимум из 2х числех (тип данных int)
    int maxVal(int a, int b) {
        if (a == b) return a;
        return (a > b) ? a : b;
    }

    //максимум из 2х числех (тип данных double)
    double maxVal(double a, double b) {
        if (a == b) return a;
        return (a > b) ? a : b;

    }

    //Максимум трёх чисел (тип int) - через тернарным оператор

    int maxOfThree(int a, int b, int c){
        if ( (a==b)&&(b==c) ) return a;
        return c > (a > b ? a : b) ? c : ((a > b) ? a : b);
    }

    double  maxOfThree(double a, double b, double c){
        if ( (a==b)&&(b==c) ) return a;
        return c > (a > b ? a : b) ? c : ((a > b) ? a : b);
    }

    //Минимум трёх числе (тип int)
    int minOfThree(int a, int b,int c){
        if ( (a==b)&&(b==c) ) return a;
        return Math.min(a, Math.min(b, c));
    }
    //Минимум трёх числе (тип double)
    double minOfThree(double a, double b,double c){
        if ( (a==b)&&(b==c) ) return a;
        return Math.min(a, Math.min(b, c));
    }

    /*
    Минимум четырёх чисел
    Написать функцию, которая вычисляет минимум из четырёх чисел.
    Функция min(a,b,c,d) должна использовать (вызывать) функцию min(a,b)
     */

    int minOfFour (int a, int b, int c, int d){
    return (minVal(a, b) < minVal(c, d) ) ? minVal(a, b) : minVal(c, d);
    }
    /*
    Дублирование строки
    Написать функцию, которая выводит переданную строку на экран три раза, каждый раз с новой строки.
    */
    void printString(String str){
        for (int i = 0; i <= 2; i++){
            System.out.println(str);
        }
    }

    /*
    Вывод текста на экран
    Написать функцию, которая выводит переданную строку (слово) на экран три раза, но в одной строке.
    Слова должны быть разделены пробелом и не должны сливаться в одно.
     */
    void printStringInLine(String str){
        for (int i = 0; i <= 2; i++){
            System.out.print(str+" ");
        }
    }


}


    class Cat { String owner;}
    class Dog {String owner;}
    class Fish {String owner;}
    class Woman {String owner;}
