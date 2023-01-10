package ChapterEight;

public class LivingThings {

    private static int count = 0;
    private String group;
    private String movement;
    private String reproduction;
    private String nutrition;
    private String irritability;
    private String growth;
    private String excretion;
    private String respiration;
    private String competition;
    private String adaptation;
    private String death;

    public LivingThings(String group ,String movement, String reproduction, String nutrition, String irritability,
    String growth, String excretion, String respiration, String competition, String adaptation, String death){
        this.group = group;
        this.movement = movement;
        this.reproduction = reproduction;
        this.nutrition = nutrition;
        this.irritability = irritability;
        this.growth = growth;
        this.excretion = excretion;
        this.respiration = respiration;
        this.competition = competition;
        this.adaptation = adaptation;
        this.death = death;
        ++count;
        System.out.printf("Living thing: %s; count = %d%n ", group, count);
    }
    public String getGroup(){
        return group;
    }
    public String getMovement(){
        return movement;
    }
    public String getReproduction(){
        return reproduction;
    }
    public String getNutrition(){
        return nutrition;
    }
    public String getIrritability(){
        return irritability;
    }
    public String getGrowth(){
        return growth;
    }
    public String getExcretion(){
        return excretion;
    }
    public String getRespiration(){
        return respiration;
    }
    public String getCompetition(){
        return competition;
    }
    public String getAdaptation(){
        return adaptation;
    }
    public String getDeath(){
        return death;
    }
    public static int getCount(){
        return count;
    }

}
