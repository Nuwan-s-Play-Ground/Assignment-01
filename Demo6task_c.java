public class Demo6task_c {
    public static void main(String[] args) {

        String city="CITY";
        String state="STATE";
        String pop="POPULATION";
        String divider ="\033[33;1m|\033[2;0m";
        
        final String COLOURW=" \033[1:1m";
        final String COLOUR1="\033[30;1m";
        final String COLOUR2="\033[31;2m";
        final String COLOUR3="\033[33;1m";
        final String COLOUR4="\033[32;2m";
        final String RESET="\033[2;0m";

        String city1=" Los Angeles ";
        String city2FirstPart=" NEW";
        String citry2SecondPart=" York ";
        String state1=" California ";
        
        int pop1=3966936;
        int pop2=8336817;

        System.out.printf("%s+%20s+%12s+%12s+%s\n",COLOUR3,"-".repeat(20),"-".repeat(12),"-".repeat(12),RESET);
        System.out.printf("%s%s%-19s%s%s%s%-11s%s%s%s%-11s%s%s\n",divider,COLOURW,city,RESET,divider,COLOURW,state,RESET,divider,COLOURW,pop,RESET,divider);
        System.out.printf("%s+%20s+%12s+%12s+%s\n",COLOUR3,"-".repeat(20),"-".repeat(12),"-".repeat(12),RESET);
        System.out.printf("%s%s%-20s%s%s%s%-12s%s%s%s%,12d%s%s\n",divider,COLOUR1,city1,RESET,divider,COLOUR1,state1,RESET,divider,COLOUR2,pop1,RESET,divider);
        System.out.printf("%s%s%-4s%s%s%-16s%s%s%s%4s%s%s%-8s%s%s%s%,12d%s%s\n",divider,COLOUR4,city2FirstPart,RESET,COLOUR1,citry2SecondPart,RESET,divider,COLOUR4,city2FirstPart,RESET,COLOUR1,citry2SecondPart,RESET,divider,COLOUR2,pop2,RESET,divider);
        System.out.printf("%s+%20s+%12s+%12s+%s\n",COLOUR3,"-".repeat(20),"-".repeat(12),"-".repeat(12),RESET);
    }
}
