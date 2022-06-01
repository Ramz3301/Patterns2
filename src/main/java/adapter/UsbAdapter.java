package adapter;

public class UsbAdapter implements ReadInfo {

    private final MemoryCard memoryCard;

    public UsbAdapter(MemoryCard memoryCard) {
        this.memoryCard = memoryCard;
    }

    @Override
    public void read() {
        memoryCard.read();
    }
}
