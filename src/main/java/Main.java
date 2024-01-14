public class Main {
    public static void main(String[] args) { //psvm and enter creates public static void
        /*System.out.println("hello world"); //sout enter will provide you with this function
        byte var1; //declaration this will allocate memory for this byte without its value
       var1 = 9; //initiation

        byte var5 = 99; //only uses 1byte of memory so you can't allocate a number larger than byte
        byte varDoRzutowania = (byte) 333;
        System.out.println("wartość zmiennej to " + varDoRzutowania);
        short var2;
        int var3=129;
      long var4;*/

       /* if (var3 <= 127){
            System.out.println("zmienna zmieści się na zmiennej byte");

    }
       else  {
            System.out.println("zmienna przekroczy zakres");
        }
    }*/

//Exercise based on temp. print appropiate text
        int temp = 20;
        if (temp <= 0) {
            System.out.println("dawg put on a hat, it's cold outside");

        } else {
            System.out.println("have a nice day");
        }

        String stringtext = "alokuje sobie pamięć dopiero po kompilacji";
        char character1 = 'b'; //single quotes
        System.out.println(character1 + stringtext);
        char znakASCII = 1; //to wywoła odpowiedni znak ASCII


//Exercise, print text
        String text = "green";

        if (text == "red"){
            System.out.println("Stop!");
        } else if (text == "green") {
            System.out.println("Go!");
        } else{
            System.out.println("Unknown signal");
        }
// changing value of variable
        int var = 20;
        System.out.println("my variable is: " + var);

        var = 333;
        System.out.println("my new variable is: " + var);


        //incrementation, shortcuts etc
        int newValue = 10;
        System.out.println(newValue);
        newValue= newValue + 1;
        System.out.println(newValue);
        newValue = newValue - 1;
        System.out.println(newValue);
        newValue++;
        System.out.println(newValue);
        newValue--;
        System.out.println(newValue);
        newValue = newValue +10;
        System.out.println(newValue);
        newValue +=10;
        System.out.println(newValue);

        int newVar= 0;
        System.out.println(newVar++); //first you need to println only newVar to be able to see the incremented value
        // or instead of vewVar++ use ++newVar, see the example below
        //System.out.println(++newVar);

        /*if(newVar == 0){
            int anotherVar = 2;
            newVar++;
        }*/

        int i;
        for(i = 0; i<10; i++){
            System.out.println("Napis wyświetlił się po raz " + i);
        }
/* while (i <=10){ //neverending loop, cause i will always be lower than 10
    System.out.println("cokolwiek");
}*/

        while (i++ <=10){
            System.out.println("Napis wyświetlił sie po raz " + i);
        }

        int liczba = 2;

        while(liczba > 0){ //will run as long as the condition is true
            System.out.println("liczba to " + liczba);
            liczba--;
        }

        liczba = -1;
        do{ //do while loop will always run at least once, even if the variable is not true!
            System.out.println("wartość z pętli do-while to " + liczba);
            liczba--;
        } while(liczba > 0);



        //exercise, check if number is even using modulo

        int mod = 7;
        System.out.println(mod % 2); //because 2*3 = 6, and the rest is 1

        int max = 101;
        if(max % 2 == 0){
            System.out.println("this is an even number");
        } else{
            System.out.println("this is not an even number");
        }

        for (int ii = 0; ii<10; ii++){
            System.out.println("print anything");
        }


//Boolean data
        boolean signal = false;
        boolean blockade = false;

        if (signal && blockade){
            System.out.println("Go ahead");
        }


    }
}
