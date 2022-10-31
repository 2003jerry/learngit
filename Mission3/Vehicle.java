package Mission3;

public class Vehicle {
    private int speed;
    private int size;
    private int x=0;

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setSize(int size) {
        this.size = size;
    }



    public Vehicle() {

    }
    public void move(){
        x+=speed;
    }
    public void speedUp(){
        speed++;
    }
    public void speedDown(){
        if(speed>0){
            speed--;
        }
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "当前的速度是：" + speed +
                ", 当前的size是：" + size +
                ",当前的横坐标是：" + x +
                '}';
    }

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.setSize(2);
        vehicle.setSpeed(2);
        System.out.println(vehicle);
        vehicle.move();
        System.out.println(vehicle);
        vehicle.speedDown();
        System.out.println(vehicle);
        vehicle.speedUp();
        System.out.println(vehicle);
    }
}
