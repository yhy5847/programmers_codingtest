public class Car {
    int speed = 100;
    String color = "black";
    public int CarSpeed (int speed) {
        for(int i = 2; i < 10; ++i) {
            if(speed >= 1000){
                break;
            }
            speed *= i;
        }
        return speed;
    }
}
