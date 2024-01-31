import java.util.Scanner;
import java.util.regex.Pattern;

public class Worker {




    Scanner scanner = new Scanner(System.in);
    private final static int FEMALETAXRATE = 30;
    private final  static int MALETAXRATE = 50;

    private String id;
    private String name ;
    private String gender;
    private String position;
    private String hours;
    private String rate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getHours() {
        return hours;
    }

    public void setHours(String hours) {
        this.hours = hours;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }




    public void input (){
        System.out.print(" - Enter id : ");
        id = scanner.nextLine();
        Pattern pattern = Pattern.compile("[0-9]+");
        if(pattern.matcher(id).matches()){
            System.out.print(" - Enter name : ");
            name = scanner.nextLine();
            System.out.print(" - Enter gender : ");
            gender = scanner.nextLine();
            Pattern pattern1 = Pattern.compile("[a-zA-z]+");
            if(pattern1.matcher(gender).matches()){
                System.out.print(" - Enter position : ");
                position = scanner.nextLine();
                System.out.print(" - Enter hours : ");
                hours = scanner.nextLine();
                Pattern pattern2 = Pattern.compile("\\d*\\.\\d+");
                if(pattern2.matcher(hours).matches()){
                    System.out.print(" - Enter rate : ");
                    rate = scanner.nextLine();
                    Pattern pattern3 = Pattern.compile("\\d*\\.\\d+");
                    if(pattern3.matcher(rate).matches()){
                        System.out.println("  SUCCESSFULLY... !!!");
                    }else {
                        System.out.println("  INVALID INPUT !! INPUT ONLY FLOAT .");
                    }
                }else {
                    System.out.println("  INVALID INPUT !! INPUT ONLY FLOAT .");
                }


            }else {
                System.out.println("  INVALID INPUT !! INPUT ONLY LETTER .");
            }
        }else{
            System.out.println("  INVALID INPUT !! INPUT ONLY INTEGER OR NUMBERS PLEASE .");
        }

    }


    public void outputInfo(){
        int convertID = Integer.parseInt(getId());
        float convertHours = Float.parseFloat(getHours());
        float convertRate = Float.parseFloat(getRate());
        System.out.println(" ID : " + convertID);
        System.out.println(" Name : " + getName());
        System.out.println(" Gender : " + getGender());
        System.out.println(" Position : " + getPosition());
        System.out.println(" Hours : " + convertHours);
        System.out.println(" Rate : " + convertRate);
        System.out.println(" Final salary : " + salary());
        System.out.println(" Tax salary deduction : " + fineTaxDeduction() + "$");    }

    private float salary(){
        return Float.parseFloat(getHours())*Float.parseFloat(getRate());
    }

    private float fineTaxDeduction(){
        float rate =0;
        if(gender.equals("female")){
            rate = FEMALETAXRATE;
        }
        else{
            rate = MALETAXRATE;
        }
        System.out.println(" Tax : " + rate + "%");
        return  salary() * ( rate / 100);

    }
}
