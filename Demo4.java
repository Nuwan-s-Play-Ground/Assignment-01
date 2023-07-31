public class Demo4 {
    public static void main(String[] args) {
        
    int day=28;
    int month=12;
    int year=2023;
    int hour=23;
    int minute=59;
    int second=59;

    final String COLOUR1="\033[35;1m";
    final String COLOUR2="\033[30;1m";
    final String COLOUR3="\033[31;1m";
    final String COLOUR4="\033[34;1m";
    final String COLOUR5="\033[33;1m";
    final String COULUR6="\033[32;1m";
    final String COLOUR_REST="\033[2;0m";

    System.out.printf("\"%s%d%s/%s%d%s/%s%d%s %s%d%s:%s%d%s:%s%d%s\"\n",COLOUR1,month,COLOUR_REST,COLOUR2,day,COLOUR_REST,COLOUR3,year,COLOUR_REST,COLOUR4,hour,COLOUR_REST,COLOUR5,minute,COLOUR_REST,COULUR6,second,COLOUR_REST);
    }
}
