package adapter;

public class Computer {

    public Computer() {
        System.out.println("Компьютер включен");
    }

    public void connect(ReadInfo readInfo) {
        readInfo.read();
    }


}
