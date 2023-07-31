public class Demo6task_a {
    public static void main(String[] args) {
        
    final String  COLOUR1="\033[31;7m";
    final String COLOUR2="\033[32;7m";
    final String RESET="\033[2;0m";
    
    System.out.printf("%s[%5s5%s%s0%%%4s]%s\n",COLOUR1,"",RESET,COLOUR2,"",RESET);

    }
}
