package com.group4.group4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;


public class UserListTest {


    @Test
    public void checkUserTest() {

        ArrayList<String> kalle = new ArrayList<>();
        kalle.add(0, "Städa");
        kalle.add(1, "Tvätta");
        kalle.add(2, "Damma");



        assertEquals("Städa", kalle.get(0));
        assertEquals("Tvätta", kalle.get(1));
        assertEquals("Damma", kalle.get(2));

        assertEquals(true, UserList.checkUserList("Kalle", kalle));
        assertEquals(false, UserList.checkUserList("Anna", kalle));

        

    }

}
