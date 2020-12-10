package nl.novi.dpcc.builder.domain.a;

import nl.novi.dpcc.builder.domain.Address;
import nl.novi.dpcc.builder.domain.HouseType;

public class HouseABuilder {
    private Address address;
    private HouseType houseType;

    public HouseABuilder withAddress(Address address){
        this.address = address;
        return this;
    }

    public HouseABuilder withHouseType(HouseType houseType){
        this.houseType = houseType;
        return this;
    }

    public HouseA build(){
        if (address==null){
            throw new RuntimeException("address cannot be null");
        }
        if (houseType==null){
            throw new RuntimeException("houseType cannot be null");
        }
        return new HouseA(address,houseType);
    }

}
