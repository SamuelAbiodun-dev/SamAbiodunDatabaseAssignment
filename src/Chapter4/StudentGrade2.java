                                    package Chapter4;

                                    public class StudentGrade2 {

                                        private String name;
                                        private double average;
                                        public StudentGrade2(String name, double average){
                                            this.name = name;
                                            if(average > 0.0){
                                                if(average <= 100.0){
                                                    this.average = average;
                                                }
                                            }
                                        }
                                        public void setName(String name){
                                            this.name = name;
                                        }
                                        public String getName(){
                                            return name;
                                        }
                                        public void setAverage(double gradeAverage){
                                            if(0.0 < average){
                                                if(average <= 100.0){
                                                    this.average = gradeAverage;
                                                }
                                            }
                                        }
                                        public double getAverage(){
                                            return average;
                                        }
                                        public String gradeLetter(){
                                            String letterGrade = "";
                                            if(average >= 90){
                                                letterGrade = "A";
                                            }
                                            else if(average >= 80){
                                                letterGrade = "B";
                                            }
                                            else if(average >= 70){
                                                letterGrade = "C";
                                            }
                                            else if(average >= 60){
                                                letterGrade = "D";
                                            }
                                            else{
                                                letterGrade = "F";
                                            }
                                            return letterGrade;
                                        }
                                    }
