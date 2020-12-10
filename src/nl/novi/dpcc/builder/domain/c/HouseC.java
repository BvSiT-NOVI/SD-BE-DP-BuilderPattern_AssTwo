package nl.novi.dpcc.builder.domain.c;

import nl.novi.dpcc.builder.domain.Address;
import nl.novi.dpcc.builder.domain.Garage;
import nl.novi.dpcc.builder.domain.Garden;
import nl.novi.dpcc.builder.domain.HouseType;
import nl.novi.dpcc.builder.domain.Room;
import nl.novi.dpcc.builder.domain.b.HouseB;

import java.util.List;

public class HouseC extends HouseB {

    /*
    //Verplicht
    private Address address;
    private HouseType houseType;

    // Niet verplicht
    private Garden garden;
    private Garage garage;
     */

    // Minimaal 1 kamer is verplicht
    private List<Room> rooms;

    public HouseC(Address address, HouseType houseType, List<Room> rooms) {
        super(address, houseType);
        this.rooms = rooms;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }


}
