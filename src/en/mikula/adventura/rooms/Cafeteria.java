package en.mikula.adventura.rooms;

/**
 * @author Marek Mikula
 * @version 4/9/2021
 */
public class Cafeteria extends Room {

    @Override
    public String getName() {
        return "Cafeteria";
    }

    @Override
    public RoomCode getRoomCode() {
        return RoomCode.ROOM_2;
    }

}
