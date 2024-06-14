

public class Team {


    public static final String MOTTO = "our motto is sportsmanship!" ;
    //create instance variables
    private String school;
    private String sport;
    private String mascot;
    private String date;
    private String location;




    public Team() {

    }//end our default constructor

    public Team(String aSchool, String aSport, String aMascot, String aDate, String aLocation) {
        //overload constructor
        school = aSchool;
        sport = aSport;
        mascot = aMascot;
        date = aDate;
        location = aLocation;


    }//ends our team constructor



//begin creating getter/setter methods

//getter for our school

public String getSchool() {

    return school;
}//ends our getSchool method

public String getSport() {

    return sport;
}//ends our getSport method

public String getMascot() {

    return mascot;
}//ends our getMascot method
public String getaDate() {

    return date;
}//ends our getSchool method
public String getLocation() {

    return location;
}//ends our getSchool method


}//ends the Team class\
