import java.util.Scanner;
public class TestGame {
    public static void main(String[] args) {

    }//ends our testGame



    public static void display(Game g){
        Team t1 = g.getTeam1();
        Team t2 = g.getTeam2();

        System.out.println(STR."The game between \{t1.getSchool()} \{t1.getSport()}\{t1.getMascot()}");


        System.out.println(STR."   takes place at \{g.getLocation()}");

    }//ends our main method/driver

    public static Team setTeamData() {

        Scanner input = new Scanner(System.in);

        Team temp;
        String name, sport, mascot, date, location;
        System.out.println("Enter school name >> ");
        name = input.nextLine();
        System.out.println("Enter sport  >> ");
        sport = input.nextLine();
        System.out.println("Enter mascot >> ");
        mascot = input.nextLine();
        System.out.println("Enter mascot >> ");
        date = input.nextLine();
        System.out.println("Enter the location the game will be held >> ");
        location = input.nextLine();

        temp = new Team(name, sport, mascot, date, location);


        return temp;

    }// ends our setTeamData Method



}
