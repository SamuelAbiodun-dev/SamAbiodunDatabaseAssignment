package ChapterEight.Chapter8;

import ChapterEight.Day;

public class Native1{
    private Day dayOfBirth;
    public Native1(Day dayOfBirth){
        this.dayOfBirth = dayOfBirth;
    }
    public Day getDayOfBirth(){
        return dayOfBirth;
    }
    public void setDayOfBirth(Day dayOfBirth){
        this.dayOfBirth = dayOfBirth;
    }
}
