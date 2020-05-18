public class RoomDoor extends Door implements Alarm {
    @Override
    public void alarm() {
        System.out.println("Alarm sounding ....");
    }

    @Override
    void open() {
        System.out.println("Open the room door...");
    }

    @Override
    void close() {
        System.out.println("Close the room door...");
    }
}
