package OOP;

import java.util.List;

public class University {
    private final List<College> colleges;

    University(List<College> colleges){
        this.colleges = colleges;
    }
    public List<College> getTotalCollegesInUniversity(){
        return colleges;
    }
}
