package nl.novi.dpcc.builder;

import nl.novi.dpcc.builder.domain.Address;
import nl.novi.dpcc.builder.domain.a.HouseABuilder;
import nl.novi.dpcc.builder.domain.HouseType;
import nl.novi.dpcc.builder.domain.a.HouseA;

public class Main {

    public static void main(String[] args) {
	// write your code here
        HouseA houseA = new HouseABuilder()
                            .withHouseType(HouseType.HOUSE)
                            .withAddress(new Address("straatA",23,"1234AB","Amsterdam"))
                            .build();
        System.out.println(houseA);


    }
}
