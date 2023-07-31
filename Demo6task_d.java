public class Demo6task_d {
    public static void main(String[] args) {
        String item="ITEM";
        String qnt="QUANTITY";
        String price="PRICE";
        String divider ="\033[33;1m|\033[2;0m";
        final String COLOURW=" \033[1:1m";
        final String COLOUR1="\033[30;1m";
        final String COLOUR2="\033[31;2m";
        final String COLOUR3="\033[33;1m";
        final String COLOURB="\033[34;2m";
        final String RESET="\033[2;0m";
        final String COLOURG="\033[32;1m";

        String item1=" Apples ";
        String qnt1=" 5 ";
        String item2=" Orenges ";
        String qnt2=" 10 ";

        float price1=0.99f;
        float price2=1.49f;

        System.out.printf("%s+%20s+%12s+%8s+%s\n",COLOUR3,"-".repeat(20),"-".repeat(12),"-".repeat(8),RESET);
        System.out.printf("%s%s%-19s%s%s%s%-11s%s%s%s%-7s%s%s\n",divider,COLOURW,item,RESET,divider,COLOURW,qnt,RESET,divider,COLOURW,price,RESET,divider);
        System.out.printf("%s+%s%s%20s%s%s+%12s+%s%s%8s%s%s+%s\n",COLOUR3,RESET,COLOURG,"-".repeat(20),RESET,COLOUR3,"-".repeat(12),RESET,COLOURG,"-".repeat(8),RESET,COLOUR3,RESET);
        System.out.printf("%s%s%-20s%s%s%s%12s%s%s%s%s$%s%,-7.2f%s%s\n",divider,COLOUR1,item1,RESET,divider,COLOURB,qnt1,RESET,divider,COLOURG,RESET,COLOUR2,price1,RESET,divider);
        System.out.printf("%s%s%-20s%s%s%s%12s%s%s%s%s$%s%,-7.2f%s%s\n",divider,COLOUR1,item2,RESET,divider,COLOURB,qnt2,RESET,divider,COLOURG,RESET,COLOUR2,price2,RESET,divider);
        System.out.printf("%s+%s%s%20s%s%s+%12s+%s%s%8s%s%s+%s\n",COLOUR3,RESET,COLOURG,"-".repeat(20),RESET,COLOUR3,"-".repeat(12),RESET,COLOURG,"-".repeat(8),RESET,COLOUR3,RESET);
    }
}
