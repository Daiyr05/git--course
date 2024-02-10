package OOP;

public class Monster {
    private int eyes;
    private int legs;
    private int hands;


    public Monster(int eyes, int legs, int hands){
        this.eyes = eyes;
        this.legs = legs;
        this.hands = hands;
    }

    public Monster(){
        this.eyes = 2;
        this.eyes = 2;
        this.eyes = 2;
    }

    public void setEyes(int eyes){
        this.eyes = eyes;
    }

    public void setLegs(int legs){
        this.legs = legs;
    }

    public void setHands(int hands){
        this.hands = hands;
    }

    public int getEyes(){
        return this.eyes;
    }

    public int getLegs() {
        return this.legs;
    }

    public int getHands() {
        return this.hands;
    }

    public void info() {
        System.out.println("Eyes is " + this.eyes + "\nLegs is " +this.legs+"\nHands is "+this.hands);
    }

    public void speak(){
        System.out.println("Hello");
    }

    public void speak(int n){
        for (int i = 0; i<n; i++){
            System.out.println("Hello");
        }
    }

    public void speak(int n, String text){
        for (int i =0 ; i<n; i++){
            System.out.println(text);
        }
    }
}
