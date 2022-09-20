package Chapter5;

import java.util.Scanner;
public class AddAndDisplay{

public static void main(String[] args)
        {
        Scanner scan=new Scanner(System.in);
        char opt='Y';
        int counter=0,nve=0,pve=0,zero=0,num;
        while(opt=='y'||opt=='Y')
        {
        ++counter;
        System.out.println("Enter the number: ");
        num=scan.nextInt();
        if(num==0)
        ++zero;
        else if(num>0)
        ++pve;
        else ++nve;
        System.out.println("Enter 'Y' if you wish to continue else enter 'N'!");
        opt=scan.next().charAt(0);
        }
        System.out.println("Total Number Of Entries: "+counter);
        System.out.println("Negative Entries: "+nve);
        System.out.println("Positive Entries: "+pve);
        System.out.println("Zero Entries: "+zero);
        scan.close();
        }
        }


