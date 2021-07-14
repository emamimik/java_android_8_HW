package hw7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public boolean decreaseFood(int n) {
        int a = food - n;
        if (a < 0) return false;
        food -= n;
        return true;
    }
    public void allFood (int food) {
        this.food += food;
    }
    public void info(){
        System.out.println("plate :  " + food);
    }
}
