package main.java.ru.job4j.poly;

public class Bus implements Transport {

    int passengers = 0;

    @Override
    public void drive() {
        System.out.println("Drive Drive Drive");
    }

    @Override
    public void passengers(int count) {
        passengers += count;
    }

    @Override
    public double tank(double liters) {
        return liters * 3.14;
    }
}
