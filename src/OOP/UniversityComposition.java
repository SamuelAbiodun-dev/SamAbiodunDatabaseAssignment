package OOP;

import java.util.ArrayList;

public class UniversityComposition {
    public static void main(String[] args) {
        College agriculture = new College("FUNAAB Agros", " P.O.B 213, Funaab old Road, Abeokuta");
        College veterinary = new College("FUNAAB Vets", "P.O.B 311, behind A.S Oye Hall, Abeokuta");
        College microbiology = new College("FUNAAB Mcb", "P.O.B 121, Funaab Zoo close, off Abiola Sport Centre, Abeokuta");
        ArrayList<College> college = new ArrayList<>();
        college.add(agriculture);
        college.add(veterinary);
        college.add(microbiology);

        University university = new University(college);
        ArrayList<College> colleges = (ArrayList<College>) university.getTotalCollegesInUniversity();
        for(College col : colleges){
            System.out.println("Name:" + col.name + " and" + " Address:" + col.address);
        }
    }
}
