package ChibuzorAssignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SevenSegmentDisplayTest {
    @Test
    public void displayTest() {
        SevenSegmentDisplay sevenSegment = new SevenSegmentDisplay();
        sevenSegment.display();
    }
    @Test
    public void setScreenTest() {
        SevenSegmentDisplay sevenSegment = new SevenSegmentDisplay();
        sevenSegment.setScreen("11111111");
        sevenSegment.display();
    }



}