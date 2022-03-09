public class Lesson_1 {

    public static void main(String[] args) {
        String name1="Hello";
        String name2="java";
        String name3="Happy New Year";

        int i=0;
        while (i<10){
            System.out.println("Когда я вырасту, то хочу быть паровым экскаватором!");
            i++;
        }
        System.out.println(name3);
       int s=5;
       int t=6;
       int x= s+t;

        System.out.println();
        printTesxt();

        System.out.println();
        printText2();

        String str1="it's";
        String str2="Nothing personal,";
        String str3="just business.";

        System.out.println();
        System.out.println(str2+" "+str1+" "+str3);
    }

    static void printTesxt(){
        System.out.println("Меня зовут Амиго.");
        System.out.println();

        System.out.println("Я согласен на зарплату $10/месяц в первый год.");
        System.out.println("Я согласен на зарплату $20/месяц во второй год.");
        System.out.println("Я согласен на зарплату $30/месяц в третий год.");
        System.out.println("Я согласен на зарплату $40/месяц в четвертый год.");
        System.out.println("Я согласен на зарплату $50/месяц в пятый год.");

        System.out.println();
        System.out.println("Спасибо за щедрость, друг Риша!");

    };


    static void printText2(){
        System.out.println("Меня зовут Амиго.");
        System.out.println();

        System.out.println("Я согласен на зарплату $800/месяц в первый год.");
        System.out.println("Я согласен на зарплату $1500/месяц во второй год.");
        System.out.println("Я согласен на зарплату $2200/месяц в третий год.");
        System.out.println("Я согласен на зарплату $2700/месяц в четвертый год.");
        System.out.println("Я согласен на зарплату $3200/месяц в пятый год.");

        System.out.println();
        System.out.println("Спасибо за щедрость, друг Риша!");
    }

}
