package Zadanie21;

public class Record extends Article implements Streamable {

    private String format;
    private int size;

    public Record(String format, int size){
        this.format = format;
        this.size = size;
    }

    @Override
    public byte[] nextPacket() {
        return new byte[0];
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public String getFormat() {
        return format;
    }
}
