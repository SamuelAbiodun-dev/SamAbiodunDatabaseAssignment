//package Chapter3;
//
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class AirConditionerTest {
//    @Test
//    public void acOnTest() {
//        //I bought an AC
//        AirConditioner myAc = new AirConditioner();
//        //my AC is off (precondition)
//        assertFalse(myAc.isOn());
//        //I turned it on (Action)
//        myAc.isOn();
//        //it is on (Assertion)
//        assertTrue(myAc.isOn());
//    }
//    @Test
//    public void acIsOff() {
//        //given that I have Bike
//        AirConditioner myAc = new AirConditioner();
//        //given that my bike is off
//        assertFalse(myAc.isOn());
//        //when I turn it on
//        myAc.isOn();
//        //check that it is on
//        assertTrue(myAc.isOn());
//        //when i turn it off
//        myAc.isOff();
//        //check that it is off
//        assertFalse(myAc.isOn());
//    }
//    @Test
//    public void increaseAcTemp() {
//        //I bought an AC
//        AirConditioner myAc = new AirConditioner();
//        //given that my bike is off
//        assertFalse(myAc.isOn());
//        //I turned it on (Action)
//        myAc.isOn();
//        //it is on (Assertion)
//        assertTrue(myAc.isOn());
//        //I increased the temperature
//       myAc.tempIncrease();
//       //check if the temperature has increased
//        assertEquals(17, myAc.getTemp());
//        }
//        @Test
//        public void decreaseAcTemp() {
//            //I bought an AC
//            AirConditioner myAc = new AirConditioner();
//            //given that my bike is off
//            assertFalse(myAc.isOn());
//            //I turned it on (Action)
//            myAc.isOn();
//            //it is on (Assertion)
//            assertTrue(myAc.isOn());
//            //I increased the temperature
//            myAc.tempDecrease();
//            //check if the temperature has increased
//            assertEquals(16, myAc.getTemp());
//        }
//        @Test
//    public void increaseBeyondThirty() {
//            //I bought an AC
//            AirConditioner myAc = new AirConditioner();
//            //given that my bike is off
//            assertFalse(myAc.isOn());
//            //I turned it on (Action)
//            myAc.isOn();
//            //it is on (Assertion)
//            assertTrue(myAc.isOn());
//            //increase beyond thirty
//            int count = 0;
//                    while(count != 30) {
//                        myAc.tempIncrease();
//                        count++;
//                        //check the temperature
//                        assertEquals(30, myAc.getTemp());
//                    }
//
//    }
//    @Test
//    public void decreaseBeyondSixteen() {
//        //I bought an AC
//        AirConditioner myAc = new AirConditioner();
//        //given that my bike is off
//        assertFalse(myAc.isOn());
//        //I turned it on (Action)
//        myAc.isOn();
//        //it is on (Assertion)
//        assertTrue(myAc.isOn());
//        //increase beyond thirty
//        int count = 0;
//        while (count != 16) {
//            myAc.tempDecrease();
//            count++;
//            //check the temperature
//            assertEquals(16, myAc.getTemp());
//        }
//    }
//    }