import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {

    @Test
    void everyStatementTestC0(){

        List<String> resList = new ArrayList<>();
        resList.add("0");
        resList.add("#");
        resList.add("0");
        resList.add("0");
        resList.add("0");
        resList.add("#");
        resList.add("#");
        resList.add("0");
        resList.add("#");

        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("#");
        list.add("2");
        list.add("1");
        list.add("2");
        list.add("#");
        list.add("#");
        list.add("2");
        list.add("#");




        assertEquals(list, SILab2.function(resList));

        List<String> exList = new ArrayList<>();
        list.add("0");
        list.add("#");
        list.add("0");


        assertThrows(IllegalArgumentException.class, () -> SILab2.function(exList));

        List<String> exList2 = new ArrayList<>();



        assertThrows(IllegalArgumentException.class, () -> SILab2.function(exList2));
    }

    @Test
    void everyBranchTestC1(){
        List<String> resList = new ArrayList<>();
        resList.add("0");
        resList.add("#");
        resList.add("0");
        resList.add("0");
        resList.add("0");
        resList.add("#");
        resList.add("#");
        resList.add("0");
        resList.add("#");

        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("#");
        list.add("2");
        list.add("1");
        list.add("2");
        list.add("#");
        list.add("#");
        list.add("2");
        list.add("#");


        assertEquals(list, SILab2.function(resList));

        List<String> exList = new ArrayList<>();
        list.add("0");
        list.add("#");
        list.add("0");

        assertThrows(IllegalArgumentException.class, () -> SILab2.function(exList));

        List<String> exList2 = new ArrayList<>();

        assertThrows(IllegalArgumentException.class, () -> SILab2.function(exList2));
    }
}