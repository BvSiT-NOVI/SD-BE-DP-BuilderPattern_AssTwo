package nl.novi.dpcc.builder.domain.b;

import nl.novi.dpcc.builder.domain.Address;
import nl.novi.dpcc.builder.domain.Garage;
import nl.novi.dpcc.builder.domain.Garden;
import nl.novi.dpcc.builder.domain.HouseType;
import nl.novi.dpcc.builder.domain.a.HouseA;
import nl.novi.dpcc.builder.domain.a.HouseABuilder;

public class HouseBBuilder {
    private Address address;
    private HouseType houseType;

    // Niet verplicht
    private Garden garden;
    private Garage garage;

    public HouseBBuilder withHouseType(HouseType houseType){
        this.houseType = houseType;
        return this;
    }

    public HouseBBuilder withAddress(Address address){
        this.address = address;
        return this;
    }

    public HouseBBuilder withGarden(Garden garden){
        this.garden = garden;
        return this;
    }

    public HouseBBuilder withGarage(Garage garage){
        this.garage = garage;
        return this;
    }

    public HouseB build(){
        HouseA houseA = new HouseABuilder()
                .withHouseType(houseType)
                .withAddress(address)
                .build(); //Throws error if required attributes are not set
        HouseB houseB = new HouseB(houseA.getAddress(),houseA.getHouseType());
        houseB.setGarage(garage);
        houseB.setGarden(garden);
        return houseB;
    }

}
