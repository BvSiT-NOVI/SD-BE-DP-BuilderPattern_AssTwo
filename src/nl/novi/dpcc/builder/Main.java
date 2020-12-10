package nl.novi.dpcc.builder;

import nl.novi.dpcc.builder.domain.Address;
import nl.novi.dpcc.builder.domain.a.HouseABuilder;
import nl.novi.dpcc.builder.domain.HouseType;
import nl.novi.dpcc.builder.domain.a.HouseA;
import nl.novi.dpcc.builder.domain.b.HouseB;
import nl.novi.dpcc.builder.domain.b.HouseBBuilder;

public class Main {

    public static void main(String[] args) {
	// write your code here
        HouseA houseA = new HouseABuilder()
                            .withHouseType(HouseType.HOUSE)
                            .withAddress(new Address("straatA",23,"1234AB","Amsterdam"))
                            .build();
        System.out.println(houseA);

        HouseB houseB = new HouseBBuilder()
                .withAddress(new Address("straatB",2,"1234AB","Amsterdam"))
                .withHouseType(HouseType.APPARTMENT)
                .build();

    }
}
