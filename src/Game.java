public class Game {
    private  Team team1;
    private  Team team2;
    private String time;

    private String date;

    private String location;

    //create our constructors

    public Game(){

    }//ends our empty constructor

    public Game(Team t1, Team t2, String time, String aDate , String local){

        team1 = t1;
        team2 = t2;
        this.time = time;
        date = aDate;
        this.location = local;
    }//ends our loaded constructor

    //begin creating our set/get methods


    public Team getTeam1(){

        return  team1;
    }//ends our getTeam1

    public Team getTeam2() {

        return team2;

    }//ends our getTeam2

    public String getTime() {

        return time;

    }//ends our getTime

    public String getaDate() {

        return date;

    }//ends our getTime

    public String getLocation(){
        return location;
    }


}
