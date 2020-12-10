package nl.novi.dpcc.builder.domain.b;

import nl.novi.dpcc.builder.domain.Garage;
import nl.novi.dpcc.builder.domain.Garden;
import nl.novi.dpcc.builder.domain.HouseType;
import nl.novi.dpcc.builder.domain.a.HouseA;
import nl.novi.dpcc.builder.domain.a.HouseABuilder;

public class HouseBBuilder extends HouseABuilder{
    // Niet verplicht
    private Garden garden;
    private Garage garage;

    public HouseBBuilder() {

    }

    public HouseBBuilder withGarden(Garden garden){
        this.garden = garden;
        return this;
    }

    public HouseBBuilder withGarage(Garage garage){
        this.garage = garage;
        return this;
    }

    @Override
    public HouseB build(){
        HouseA houseA = super.build();
        HouseB houseB = new HouseB(houseA.getAddress(),houseA.getHouseType());
        houseB.setGarden(garden);
        houseB.setGarage(garage);
        return houseB;
    }

}
