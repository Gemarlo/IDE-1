//Gemarlo Reid
//CSC 222
// This is pretty cool, so the getter methods are set in the print statements
// Retrieving the variables created and stored from user prompts in setTeamData() method, where we returned those variables then utilized them within the display method.
// mascot sport and school name were in addition to location and date assignment requirements
import java.util.Scanner;
public class TestTeam {


    //main method
    public static void main(String[] args) {

        //test our team class

        Team team1 = setTeamData(); //new Team("PCHS", "Basketball", "Cougars");
        display(team1);
//        System.out.println("team1: " + team1.getSchool());

    }//ends our main method/driver






    public static Team setTeamData() {


        Scanner input = new Scanner(System.in);

        Team temp;
        String name, sport, mascot, location, date;
        System.out.println("Enter school name >> ");
        name = input.nextLine();
        System.out.println("Enter sport  >> ");
        sport = input.nextLine();
        System.out.println("Enter mascot >> ");
        mascot = input.nextLine();
        System.out.println("Enter date game will be held >> ");
        date = input.nextLine();
        System.out.println("Enter the location will be held >> ");
        location = input.nextLine();

        temp = new Team(name, sport, mascot, date, location);


        return temp;





    }// ends our setTeamData Method


    public static void display(Team t) {
    /*
        Public School 118 Curling team Tuna
        Our motto is Sportsmanship!
     */
        System.out.println(t.getSchool() + STR." \{t.getSport()} team \{t.getMascot()}\n Our motto is \{Team.MOTTO}" + STR." The game will be held at \{t.getLocation()}\n"+ STR." on \{t.getaDate()}!\n We hope to see you there!");

        //ends our display method
    }



}//ends our TestTeam class
