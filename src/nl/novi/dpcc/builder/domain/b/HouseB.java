package nl.novi.dpcc.builder.domain.b;

import nl.novi.dpcc.builder.domain.Address;
import nl.novi.dpcc.builder.domain.Garage;
import nl.novi.dpcc.builder.domain.Garden;
import nl.novi.dpcc.builder.domain.HouseType;
import nl.novi.dpcc.builder.domain.a.HouseA;

public class HouseB extends HouseA {

    // Niet verplicht
    private Garden garden;
    private Garage garage;

    public HouseB(Address address, HouseType houseType) {
        super(address, houseType);
    }

    public Garden getGarden() {
        return garden;
    }

    public void setGarden(Garden garden) {
        this.garden = garden;
    }

    public Garage getGarage() {
        return garage;
    }

    public void setGarage(Garage garage) {
        this.garage = garage;
    }

    @Override
    public String toString() {
        return "HouseB{" +
                "address=" + getAddress().toString() +
                ", houseType=" + getHouseType().toString() +
                ", garden=" + garden.toString() +
                ", garage=" + garage.toString() +
                "} ";
    }
}
