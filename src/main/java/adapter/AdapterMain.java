package adapter;

public class AdapterMain {
    public static void main(String[] args) {

        Computer computer1 = new Computer();
        Usb usb1 = new Usb();
        computer1.connect(usb1);

        Computer computer2 = new Computer();
        MemoryCard memoryCard = new MemoryCard();
        UsbAdapter usbAdapter = new UsbAdapter(memoryCard);
        computer2.connect(usbAdapter);


    }
}
