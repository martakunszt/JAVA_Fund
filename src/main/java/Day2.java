public class Day2 {
    public static void main(String[] args) {

//Boolean data
        boolean signal = true;
        boolean blockade = false;

        if (signal && blockade){
            System.out.println("Go ahead"); // this won't print out to the console
            //because variables are set to false (&& both of the variable have to be true)
        }

        if(signal || blockade){ //this will print out text to the console
            // because only one of the variables have to be true
            System.out.println("Go ahead");
        }

        //exercise: write a program that when exceeded the speed limit prints a warning

        int limit = 11;
        if(limit > 0 && limit <= 10){
            System.out.println("You exceeded the speed limit");
        }
        else if(limit > 10){
            System.out.println("SLOW DOWN!");
        }

        //exercise: create a for loop, using arrays

        //int[] array = {0,1,2,3,4,5,6,7,8,9};
        int[] array1 = new int[10];

        for(int i = 0; i < 10; i++){
            array1[i] = i; //why array1[i]=i?
            System.out.println("Value of the current cell is: " + array1[i]);
        }

        //exercise: create an array showing days of the week

        String[] week = new String[7]; //printing into an array
        week[0] = "Monday";
        System.out.println(week[0]);
        week[1] = "Chewsday";
        System.out.println(week[1]);
        week[2] = "Wednesday";
        System.out.println(week[2]);
        week[3] = "Thursday";
        System.out.println(week[3]);
        week[4] = "Friday";
        System.out.println(week[4]);
        week[5] = "Saturday";
        System.out.println(week[5]);
        week[6] = "Sunday";
        System.out.println(week[6]);

        String[] months ={"January", "February", "March"}; //declaring values
        System.out.println(months[0]);


        Point p1 = new Point(); //new class that we are importing from a Point.java file/class
        //System.out.println(p1.hashCode());
       /* System.out.println(p1.x);
        p1.x = 5;
        System.out.println(p1.x);

        Point p2 = new Point();
        p2.showcoord(); //takes x as a global variable = 0
        p1.showcoord(); //takes x as a local variable = 5

        int xField = p1.getX();
        System.out.println(xField); //getX stores the value in memory*/


//setters and getters

        Point p3 = new Point();
        p3.setX(6);
        System.out.println(p3.getX());
        System.out.println(p3.getY());


        Point.metodaStatycna(); //static method

        System.out.println(Point.poleStatyczneTypuInt = 20);
    }
}

