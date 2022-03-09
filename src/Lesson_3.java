import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.time.Month;


public class Lesson_3 {
    public static void main(String[] args) throws ParseException {

        /*
        https://javarush.ipnodns.ru/lesson/lect3.html
        Задание № 1
        Дата рождения
        Вывести на экран дату своего рождения в виде: MAY 1 2012
         */

        //дата рождения указаной текстом в одну сроку
        String birthday = "04 08 1984";
        // просто для теста
        // String birthday = "04 8 1984";

        // введёное строковое значение разобъём на элементы массивы через регулярное выражение
        String[] arrayStr = birthday.split(" ");

        String myDate = null, myMonth = null, myYear = null;
        myDate = arrayStr[0];
        myMonth = arrayStr[1];
        myYear = arrayStr[2];

        // System.out.println("дата="+myDate );
        // System.out.println("месяц="+myMonth);
        // System.out.println("год="+myYear);


        //посмотрим какое первое значение переменной myDate
        char firstSimbooloFDate = myDate.charAt(0);
        // если первый символ myDate =0 ,переопределим значене
        if (firstSimbooloFDate == '0') {
            // System.out.println("> "+myMonth.charAt(1));
            myDate = String.valueOf(myDate.charAt(1));
        }

        //посмотрим какое первое значение переменной myMonth
        char firstSimbooloFMonth = myMonth.charAt(0);
        //System.out.println("первый символ месяца myMonth= "+ firstSimbooloFMonth);

        // если первый символ myMonth =0 ,переопределим значене
        if (firstSimbooloFMonth == '0') {
            // System.out.println("> "+myMonth.charAt(1));
            myMonth = String.valueOf(myMonth.charAt(1));
        }
        //System.out.println("новое значение месяца"+myMonth);
        System.out.println(Month.of(Integer.parseInt(myMonth)) + " " + myDate + " " + myYear);
        /*
            можно было бы сразу присвоить три значения трём переменным или просто написать текстом,
            но мы нищем лёгких путей :)

        */

        //задания 2
        int i = 850;
        System.out.println(i);

        // Задание 3
        // StarCraft
        //Создать 10 зергов, 5 протосов и 12 терран.
        //Дать им всем уникальные имена.

        Zergs myZorg1 = new Zergs("1");
        Zergs myZorg2 = new Zergs("2");
        Zergs myZorg3 = new Zergs("3");
        Zergs myZorg4 = new Zergs("4");
        Zergs myZorg5 = new Zergs("5");
        Zergs myZorg6 = new Zergs("6");
        Zergs myZorg7 = new Zergs("7");
        Zergs myZorg8 = new Zergs("8");
        Zergs myZorg9 = new Zergs("9");
        Zergs myZorg10 = new Zergs("10");

        Protos myProtos1 = new Protos("1");
        Protos myProtos2= new Protos("2");
        Protos myProtos3 = new Protos("3");
        Protos myProtos4 = new Protos("4");
        Protos myProtos5 = new Protos("5");

        Terran myTerran1 = new Terran("1");
        Terran myTerran2 = new Terran("2");
        Terran myTerran3 = new Terran("3");
        Terran myTerran4 = new Terran("4");
        Terran myTerran5 = new Terran("5");
        Terran myTerran6 = new Terran("6");
        Terran myTerran7 = new Terran("7");
        Terran myTerran8 = new Terran("8");
        Terran myTerran9 = new Terran("9");
        Terran myTerran10 = new Terran("10");
        Terran myTerran11 = new Terran("11");
        Terran myTerran12 = new Terran("12");


    /* задание 4
    Произведение 10 чисел

    Вывести на экран произведение чисел от 1 до 10.
    Подсказка: будет три миллиона с хвостиком
     */

        int sumOfNumber =1;
        for (int k = 1; k <11 ; k++){
            sumOfNumber*=k;

        }
        System.out.println(sumOfNumber);

    /* Задание 5
    Сумма 10 чисел

    Вывести на экран сумму чисел от 1 до 10 построчно:
     */

        int mySum=0;
        for(int s=1;s<11;s++){
            mySum+=s;
            System.out.println(mySum);
        }

        /* Задание 6
        Мама мыла раму

        Вывести на экран все возможные комбинации слов «Мама», «Мыла», «Раму».
        Подсказка: их 6 штук. Каждую комбинацию вывести с новой строки. Слова не разделять.
         */
        String[] arrayTxt = new String[]{"Мама", "Мыла", "Раму"};;
              for (int m = 0; m < arrayTxt.length; m++) {
            for (int c = 0; c < arrayTxt.length; c++) {
                for (int k = 0; k < arrayTxt.length; k++) {
                    if(m != c & m != k & c != k) // Условие убирающие повторы
                        System.out.println(arrayTxt[m]+arrayTxt[c]+arrayTxt[k]);
                }
            }
        }

    /* Задание 7
    Таблица умножения
    Выведи на экран таблицу умножения 10 на 10 в следующем виде:
    1 2 3 …
    2 4 6 …
    3 6 9 …
     */
        int[] myTableOfMultiplication = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int q : myTableOfMultiplication) {
            for (int w : myTableOfMultiplication) {
                System.out.printf("%4d", (q * w));
            }
            System.out.println();
        }


     /* Заданиие 8
     Семь цветов радуги
    Создать 7 объектов, чтобы на экран вывелись 7 цветов радуги (ROYGBIV).
    Каждый объект при создании выводит на экран определенный цвет.
     */
        Red myRed = new Red();
        Orange myOrange = new Orange();
        Yellow myYellow = new Yellow();
        Green myGreen = new Green();
        Blue myBlue = new Blue();
        Indigo myIndigo = new Indigo();
        Violet myViolet = new Violet();

        /* Задание 9
        Экранирование символов
    Про экранирование символов в Java читайте в дополнительном материале к лекции.
    Вывести на экран следующий текст - две строки:
    It's Windows path: "C:\Program Files\Java\jdk1.7.0\bin"
    It's Java string: \"C:\\Program Files\\Java\\jdk1.7.0\\bin\"
    */

        System.out.println( "It's Windows path: \"C:\\Program Files\\Java\\jdk1.7.0\\bin\""  );
        System.out.println( "It's Java string: \\\"C:\\\\Program Files\\\\Java\\\\jdk1.7.0\\\\bin\\\""  );

    /* Задание 10
    Изучаем японский
    Выведи на экран 日本語
     */
        System.out.println("\u65E5\u672C\u8A9E");

    /*Задание 11
    Как захватить мир

    Ввести с клавиатуры число и имя, вывести на экран строку:
    «имя» захватит мир через «число» лет. Му-ха-ха!
    ( Последовательность вводимых данных имеет большое значение.)

    */
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Укажите ваше имя:");

        String name= null;
        try {
            name = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // System.out.println();
        System.out.print("Укажите ваш возраст:");

        String Age= null;
        try {
            Age = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(name+" захватит мир через "+Age+" лет."+ " Му-ха-ха!");

    /* Задание 12
    Зарплата через 5 лет
    Ввести с клавиатуры отдельно Имя, число1, число2. Вывести надпись: «Имя» получает «число1» через «число2» лет.
    */
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Укажите имя:");
        try {
            name = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

       // System.out.println();
        System.out.print("Укажите сумму:");
        String money = null;
        try {
            money = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // System.out.println();
        System.out.print("Укажите возраст:");
        String age = null;
        try {
            age = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(name + " получает " + money + " через " + age + " лет.");


        /* Задание 13
        Скромность украшает человека
        Ввести с клавиатуры имя и вывести надпись: name зарабатывает $5,000. Ха-ха-ха!
        */
        System.out.print("Укажите имя:");
        try {
            name = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(name + " зарабатывает $5,000. Ха-ха-ха! ");
        
        /* Задание 14
        Спонсор - это звучит гордо

        Ввести с клавиатуры два имени и вывести надпись:
        name1 проспонсировал name2, и она стала известной певицей.
         */
        System.out.print("Укажите первое имя:");
        try {
            name = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String nameTwo= null;
        System.out.print("Укажите второе имя:");
        try {
            nameTwo = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(name+" проспонсировал "+ nameTwo+", и она стала известной певицей.");

        /*  Задание 15
        Чистая любовь
        Ввести с клавиатуры три имени, вывести на экран надпись name1 + name2 + name3 = Чистая любовь, да-да!
         */

        System.out.print("Укажите первое имя:");
        try {
            name = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.print("Укажите второе имя:");
        try {
            nameTwo = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String nameThree=null;
        System.out.print("Укажите третье имя:");
        try {
            nameThree = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println( name +" + "+ nameTwo+" + " + nameThree + " = Чистая любовь, да-да!" );

    }

}
//для радуги
class Red{ Red() {System.out.println("Red");}};
class Orange{ Orange() {System.out.println("Orange");}};
class Yellow{ Yellow() {System.out.println("Yellow");}};
class Green { Green() {System.out.println("Green");}};
class Blue { Blue() {System.out.println("Blue");}};
class Indigo { Indigo() {System.out.println("Indigo");}};
class Violet{  Violet() {System.out.println("Violet");} };

// для StarCraft
class Zergs{ String name;
    Zergs(String nameOfZerg) {}
};

class Protos{ String name;
    Protos(String nameOfProtos) {}
};

class Terran{ String name;
    Terran(String nameOfTerran) {}
};


