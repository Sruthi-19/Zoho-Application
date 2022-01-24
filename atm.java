import java.util.*;
import java.text.SimpleDateFormat;  
import java.util.Date;  
import java.io.IOException;


class atm{

    public static int amount[]={2000,500,200,100};
    public static int notes_count[]={0,0,0,0};
    public static int add_money[] = new int[4];
    public static String user_name[]={"sruthi","raghav"};
    public static String user_len[][] = new String[user_name.length][8]; 
    public static String user_password[]={"1911","0104"};
    public static String user_id[]={"user_01","user_02"};
    public static int user_balance[]={19000,10400};
    public static SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
    public static Date date = new Date();  
    public static Scanner sc=new Scanner(System.in);
   
    public static void adminDepositMoney(){
        clearScreen();
        System.out.println("\tWelcome Admin");
        System.out.println("Number of Rs.2000 notes to be added :");
        add_money[0]=add_money[0]+sc.nextInt();
        System.out.println("Number of Rs.500 notes to be added   :");
        add_money[1]=add_money[1]+sc.nextInt();
        System.out.println("Number of Rs.200 notes to be added   :");
        add_money[2]=add_money[2]+sc.nextInt();
        System.out.println("Number of Rs.100 notes to be added   :");
        add_money[3]=add_money[3]+sc.nextInt();
        System.out.println("Amount Deposited Successfully");
        System.out.println("Press 1 to continue");
        int num=sc.nextInt();
        if(num==1){
        	
        }
        
        }
    
    
    public static void pinChange(int i){
        clearScreen();
        System.out.println("\tWelcome "+user_name[i]);
        System.out.println("Enter New Pin:");
        String new_pin=sc.next();
        sc.nextLine();
        System.out.println("Confirm New Pin:");
        String confirm_new_pin=sc.next();
        sc.nextLine();
        if(new_pin.equals(confirm_new_pin)){
            user_password[i]=new_pin;
            System.out.println("Pin has been changed succesfully....");
        }else{
            System.out.println("Pin Mismatch!");
        }

    }

    public static void userDepositMoney(int i){
        clearScreen();
        System.out.println("\tWelcome "+user_name[i]);
        System.out.println("Number of Rs.2000 notes to be added :");
        int no_of_2000=sc.nextInt();
        add_money[0]=add_money[0]+no_of_2000;
        System.out.println("Number of Rs.500 notes to be added   :");
        int no_of_500=sc.nextInt();
        add_money[1]=add_money[1]+no_of_500;
        System.out.println("Number of Rs.200 notes to be added   :");
        int no_of_200=sc.nextInt();
        add_money[2]=add_money[2]+no_of_200;
        System.out.println("Number of Rs.100 notes to be added   :");
        int no_of_100=sc.nextInt();
        add_money[3]=add_money[3]+no_of_100;
        int amount=(no_of_2000*2000)+(no_of_500*500)+(no_of_200*200)+(no_of_100*100);
        user_balance[i]=user_balance[i]+amount;
        
        System.out.println("Amount Deposited Successfully....");
        System.out.println("Press 1 to continue");
        user_len[i][0]=user_len[i][1];
        user_len[i][1]=user_len[i][2];
        user_len[i][2]=user_len[i][3];
        user_len[i][3]=user_len[i][4];
        user_len[i][4]=user_len[i][5];
        user_len[i][5]=formatter.format(date) + " Rs: "+amount+" deposited ";
        int num=sc.nextInt();
        if(num==1){

        }

       


    }

    public static void amountTransaction(int i){
        clearScreen();
        System.out.println("\tWelcome "+user_name[i]);
        System.out.println("Enter Bank ID to transfer :");
        String bank_id=sc.next();
        sc.nextLine();
       
     
        int amt_transfer=0;
        int setflag=0;
       
        for(int t=0;t<user_id.length;t++){
          
            if(bank_id.equals(user_id[t])){
                
               amt_transfer=t;
               setflag=1;
               break;
            }
        }
        if(setflag==1){

        System.out.println("Enter Amount to be transferred to "+user_name[amt_transfer]);
        int amount=sc.nextInt();
        if(user_balance[i]>=amount){
        	user_balance[i]-=amount;
        	user_balance[amt_transfer]+=amount;
            System.out.println("Amount Transferred Successfully....");
           
            
            user_len[i][0]=user_len[i][1];
            user_len[i][1]=user_len[i][2];
            user_len[i][2]=user_len[i][3];
            user_len[i][3]=user_len[i][4];
            user_len[i][4]=user_len[i][5];
            user_len[i][5]=formatter.format(date) + " Rs: "+amount+" transfered to "+bank_id+"";

            

        }else{
            System.out.println("Insufficient Balance...");
        }}
        
         else{
            System.out.println("Invalid ID");
        }
       
        System.out.println("Press 1 to continue");
        int num=sc.nextInt();
        if(num==1){

        }


    }

    public static void miniStatement(int i){
        clearScreen();
        System.out.println("\tWelcome "+user_name[i]);
        System.out.println("Mini Statement :");
            
            for(int j=0;j<7;j++){
                String user_null=user_len[i][6];
              
                if(user_len[i][j]!=user_null){
                System.out.println(user_len[i][j]);}
            }
            System.out.println("Press 1 to continue");
            int num=sc.nextInt();
            if(num==1){

            }
    }

    public static void adminCheckBalance(){
        clearScreen();
        System.out.println("\tWelcome Admin");
        int note_2000_balance=add_money[0];
        int note_500_balance=add_money[1];
        int note_200_balance=add_money[2];
        int note_100_balance=add_money[3];
        System.out.println("Balance Rs.2000 Notes  :"+note_2000_balance);
        System.out.println("Balance Rs.500 Notes   :"+note_500_balance);
        System.out.println("Balance Rs.200 Notes   :"+note_200_balance);
        System.out.println("Balance Rs.100 Notes   :"+note_100_balance);
        System.out.println("Admin Balance Amount Displayed....");
        System.out.println("Press 1 to continue");
        int num=sc.nextInt();
        if(num==1){

        }
    }

    public static void userCheckBalance(int i){
        clearScreen();
        System.out.println("\tWelcome "+user_name[i]);
        System.out.println("Amount :"+user_balance[i]);
        System.out.println("User "+ user_name[i] +" Balance Amount Displayed ...");
        System.out.println("Press 1 to continue");
        int num=sc.nextInt();
        if(num==1){

        }
    }

    public static void withdrawMoney(int i){
        clearScreen();
        System.out.println("\tWelcome "+user_name[i]);
        System.out.println("Enter Amount to be withdrawn :");
        int withdraw_amount=sc.nextInt();
       int  withdraw_amount1=withdraw_amount;
       int withdraw_amount2=withdraw_amount;
      int count_notes[]=new int [4];
      int count_notes1[]=new int [4];
      int cnt=0;
      for(int j=0;j<4;j++){
          count_notes1[j]=add_money[j];
          cnt+=add_money[j];
      } 
      
      

      int amount=(add_money[0]*2000)+(add_money[1]*500)+(add_money[2]*200)+(add_money[3]*100);
       if(withdraw_amount%10==0 && withdraw_amount<=amount  ){
        v:while(withdraw_amount1>0){
            if(cnt!=0){
               
        if(withdraw_amount1>=2000 && count_notes1[0]!=0){
           count_notes[0]++;   
           count_notes1[0]--;    
           withdraw_amount1=withdraw_amount1-2000;
        }else if(withdraw_amount1>=500 && count_notes1[1]!=0){
            count_notes[1]++;     
            count_notes1[1]--;     
            withdraw_amount1=withdraw_amount1-500;
        }else if(withdraw_amount1>=200 && count_notes1[2]!=0){
            count_notes[2]++;           
            count_notes1[2]--;
            withdraw_amount1=withdraw_amount1-200;
        }else if(withdraw_amount1>=100 && count_notes1[3]!=0){
            count_notes1[3]--;
           count_notes[3]++;
           withdraw_amount1=withdraw_amount1-100;
        }
    cnt--;}else{
        
        break v;
    }
}  }
   
   
  
    int amount1=(count_notes[0]*2000)+(count_notes[1]*500)+(count_notes[2]*200)+(count_notes[3]*100);
   
     int count =0;
     int count1=0;
     int count2=0;
            for(int j=0;j<4;j++){
                  count2+=count_notes[j];
                if(count_notes[j]!=0){
                    count1++;
                    if(count_notes[j]<=add_money[j])
                    count+=1;
                }
            }
            
       
        int two_thousand=0,five_hundred=0,two_hundred=0,one_hundred=0;
       
        if(withdraw_amount<=amount && withdraw_amount<=user_balance[i] && count==count1 ){
           if(withdraw_amount%10==0  ){
                while(withdraw_amount>0){
                if(withdraw_amount>=2000 && count_notes[0]!=0){
                   two_thousand++;
                   add_money[0]--;
                   count_notes[0]--;
                   withdraw_amount=withdraw_amount-2000;
                }else if(withdraw_amount>=500 && count_notes[1]!=0){
                    five_hundred++;
                    add_money[1]--;
                    count_notes[1]--;
                    withdraw_amount=withdraw_amount-500;
                }else if(withdraw_amount>=200 && count_notes[2]!=0){
                    two_hundred++;
                    add_money[2]--;
                    count_notes[2]--;
                    withdraw_amount=withdraw_amount-200;
                }else if(withdraw_amount>=100 && count_notes[3]!=0){
                   one_hundred++;
                   add_money[3]--;
                   count_notes[3]--;
                   withdraw_amount=withdraw_amount-100;
                }
            }
            System.out.println("2000 notes :"+two_thousand);
            System.out.println("500 notes  :"+five_hundred);
            System.out.println("200 notes  :"+two_hundred);
            System.out.println("100 notes  :"+one_hundred);
            System.out.println("\tThanks for visiting");
            user_balance[i]=user_balance[i]-withdraw_amount2;


        }else{
            System.out.println("Enter amount only in hundreds");
        }}else{
            System.out.println("Insufficient money in atm visit near by atm....");
        }
        System.out.println("Press 1 to continue");
        int one=sc.nextInt();
        if(one==1){

        }
       
      
       
    }

    public static void delay(int delay){

        try{
            Thread.sleep(delay);
        }
        catch(InterruptedException ex ){
             Thread.currentThread().interrupt();
        }
        }
        
    public static void clearScreen(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void main(String[] args){
       
        int block=0;
        while(true){
            
            System.out.println("Welcome to ATM\nAdmin : 1\nUser  : 2\nExit  : 3");
            int choice=sc.nextInt();
            if(choice==1){
                a:while(true){
                clearScreen();
                System.out.println("Welcome to ATM\nAdmin : 1\nUser  : 2\nExit  : 3\n"+choice);
                System.out.println("Enter the Admin Username :");
                String usrname1=sc.next();
                sc.nextLine();
                System.out.println("Enter the Admin Password :");
                String usrpass1=sc.nextLine();
                if(usrname1.equals("Admin_001") && usrpass1.equals("abcd")){
                    
                    while(true){
                       clearScreen();
                        System.out.println("\tWelcome Admin\nDeposit money : 1\nBalance : 2\nHome  :3");
                        int admin =sc.nextInt();
                        if(admin==1){
                               adminDepositMoney();
                        }else if(admin==2){
                               adminCheckBalance();
                        }else if(admin==3){
                             break a;
                        }else {
                            System.out.println("Invalid input");
                            delay(2000);
                          
                        }    
                    }

                }else{
                    System.out.println("Invalid Admin User Name or password");
                    delay(2000);
                   
                    
                }}

            }
            else if(choice==2){
            	
                System.out.println("Enter the  username :");
                String user_name_entered=sc.next();
                sc.nextLine();
                System.out.println("Enter the  password :");
                String user_password_entered=sc.next();
                sc.nextLine();
                for(int i=0;i<user_name.length;i++){
                    
                    
                      if(user_name_entered.equals(user_name[i]) && user_password_entered.equals(user_password[i])){
                          block=0;
                          while(true){
                          	clearScreen();
                          	System.out.println("\tWelcome "+user_name[i]);
                          	System.out.println("Deposit money : 1\nWithdraw money:2\nBalance : 3\nMini Statement  :4\nPin Generation :5\nTransaction :6\nHome  :7");
                          	int user_option =sc.nextInt();
                          	
                          	if(user_option==1){
                          		userDepositMoney(i);
                          		}
                          	
                          	else if(user_option==2){
                          		withdrawMoney(i);
                          		}
                          	
                          	else if(user_option==3){
                          		userCheckBalance(i);
                          		}
                          	
                          	else if(user_option==4){
                          		miniStatement(i);
                          		}
                          	
                          	else if(user_option==5){
                          		pinChange(i);
                          		}
                          	
                          	else if(user_option==6){
                          		amountTransaction(i);
                          		}
                          	
                          	else if(user_option==7){
                          		break ;
                          		}
                          	
                          	else {
                          		System.out.println("Invalid input");
                          		delay(2000);
                          		}
                          	}
                          }
                      
                    else{
                    	System.out.println("Your card has been blocked");
                    	}

            }}else if(choice==3){
                System.out.println("Thank You for Visiting....");
                break;
            }else{
                System.out.println("Invalid Input");
                delay(2000);
                //1continue;
            }
            
                 
        }
    }
}