package Chapter4;

public class Graduate {
private String name;
private double average;

    public Graduate(String name, double average) {
        this.name = name;
        if(average > 0.0){
            if(average <= 100.0) {
                this.average = average;
            }
        }
    }
        public String getName() {
            return name;
        }


        public void setName(String Name){
        this.name = name;
        }

        public void setAverage(double graduateAverage){
            if(average > 0.0){
                if(average <= 100.0) {
                    this.average = average;
                }
            }
        }
        public double getAverage(){
        return average;
        }

        public String getGrade() {
            String grade = "";

            if(average >= 90.0) {
                grade = "A";
            }
            else if (average >= 80.0) {
                grade = "B";
                }
            else if(average >= 70.0) {
                grade = "C";
            }
            else if(average >= 60.0) {
                grade = "D";
            }
            else if(average >= 50.0) {
                grade = "E";
            }
            else {
                grade = "F";
            }
            return grade;
    }
            }


