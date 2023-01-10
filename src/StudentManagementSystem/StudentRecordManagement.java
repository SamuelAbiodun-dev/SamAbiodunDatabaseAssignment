package StudentManagementSystem;
import java.util.LinkedList;
import java.util.Scanner;
public class StudentRecordManagement {
    LinkedList<Record> list;
    public StudentRecordManagement(){
        list = new LinkedList<>();
    }

    public void add(Record record){
        if(!find(record.getIdNumber())){
            list.add(record);
        }
        else{
            System.out.println("Record already exists in the Record list");
        }
    }
    public boolean find(int idNumber){
        for(Record lst : list){
            if(lst.getIdNumber() == idNumber){
                System.out.println(lst);
                return true;
            }
        }
        return false;
    }
    public void delete(int recordIdNumber){
        Record recordDelete = null;

        for(Record lst2 : list){
            if(lst2.getIdNumber() == recordIdNumber){
                recordDelete = lst2;
            }
        }
        if(recordDelete == null){
            System.out.println("Invalid record Id");
        }
        else{
            list.remove(recordDelete);

            System.out.println("Successfully removed record from the list");
        }
    }
    public Record findRecord(int idNumber){
        for(Record lst : list){
            if(lst.getIdNumber() == idNumber){
                return lst;
            }
        }
         return null;
    }
    public void update(int id, Scanner input){
        if(find(id)){
            Record rec = findRecord(id);

            System.out.print(
                    "What is the new Student id number?: "
            );
            int idNumber = input.nextInt();

            System.out.print("What is the new Student contact number?: ");
            int contactNumber = input.nextInt();
            input.nextLine();

            System.out.print("What is the new Student's name?: ");
            String name = input.nextLine();
            rec.setIdNumber(idNumber);
            rec.setName(name);
            rec.setContactNumber(contactNumber);
            System.out.println("Record updated successfully");
        }
        else{
            System.out.println("Record not found in the Student list");
        }
    }
    public void display(){
        if(list.isEmpty()){
            System.out.println("The list has no records\n");
        }
        for(Record record : list){
            System.out.println(record.toString());
        }
    }
}
