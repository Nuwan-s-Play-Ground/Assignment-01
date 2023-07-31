public class Demo6task_b {
    public static void main(String[] args) {
        
        String name="NAME";
        String age="AGE";
        String divider ="\033[33;1m|\033[2;0m";
    
        final String COLOUR1="\033[30;1m";
        final String COLOUR2="\033[31;2m";
        final String COLOUR3="\033[33;1m";
        final String COLOUR4="\033[34;1m";
        final String RESET="\033[2;0m";

        String name1="Alice";
        String name2="Bob";
        String age1="24";
        String age2="30";

        System.out.printf("%s+%10s+%5s+%s\n",COLOUR3,"-".repeat(10),"-".repeat(5),RESET);
        System.out.printf("%s%s%-10s%s%s%s%5s%s%s\n",divider,COLOUR4,name,RESET,divider,COLOUR4,age,RESET,divider);
        System.out.printf("%s+%10s+%5s+%s\n",COLOUR3,"-".repeat(10),"-".repeat(5),RESET);
        System.out.printf("%s%s%-10s%s%s%s%5s%s%s\n",divider,COLOUR1,name1,RESET,divider,COLOUR2,age1,RESET,divider);
        System.out.printf("%s%s%-10s%s%s%s%5s%s%s\n",divider,COLOUR1,name2,RESET,divider,COLOUR2,age2,RESET,divider);
        System.out.printf("%s+%10s+%5s+%s\n",COLOUR3,"-".repeat(10),"-".repeat(5),RESET);
        
    }
}
