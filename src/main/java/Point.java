public class Point {
    private int x = 9;
    private int y = 12; //private doesn't allow to use them outside of this class

    void showcoord() {
        System.out.println("x is:" + x + " y is: " + y); //only shows the output
        // -> prints to the console
    }

    int getX() {
        return x;
    };

    int getY() {
        return y;
    };

    public void setX(int x){
        this.x = x; //to get x in the Main class file you first need to set X
    }

    static void metodaStatycna() {
        System.out.println("Test metody statycznej - dostępnej dla klasy bez instancjonowania obiektu.");
    }
    static int poleStatyczneTypuInt;

}
