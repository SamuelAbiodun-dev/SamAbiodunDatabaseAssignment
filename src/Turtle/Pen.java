package Turtle;

public class Pen {
    public PenPosition getPosition() {
        return position;
    }

    public void setPosition(PenPosition position) {
        this.position = position;
    }

    private PenPosition position = PenPosition.UP;
}
