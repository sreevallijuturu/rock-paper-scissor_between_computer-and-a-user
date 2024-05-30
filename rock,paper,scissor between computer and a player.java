import java.util.Scanner;
import java.util.Random;
public class Rock_Paper_Scissor_computer_Vs_User
{
        public static void main(String[] args)
        {
            Random rnd=new Random();
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the player name");
            String name =sc.nextLine();
            System.out.println("enter the number of levels you wanted to play");
            int levels=sc.nextInt();
            int user_count =0;
            int computer_count =0;
            while (levels > 0)
            {
                int computer=rnd.nextInt(3);
                System.out.println("computer has made its choice");
                System.out.println(name +" please enter your choice (0.rock 1.paper 2.scissor)");
                int user = sc.nextInt();

                switch (user)
                {
                    case 0:
                        switch (computer)
                        {
                            case 0 ->
                            {
                                System.out.println("both the players got tie");
                                System.out.println(name +" count is "+ user_count);
                                System.out.println("computer count is "+ computer_count);
                                System.out.println("------------------------------");

                            }
                            case 1 ->
                            {
                                System.out.println("computer won the game");
                                computer_count++;
                                System.out.println(name +" count is "+ user_count);
                                System.out.println("computer count is "+ computer_count);
                                System.out.println("------------------------------");
                            }
                            case 2->
                            {
                                System.out.println(name +" won the game");
                                user_count++;
                                System.out.println(name +" count is "+ user_count);
                                System.out.println("computer count is "+ computer_count);
                                System.out.println("------------------------------");
                            }

                        }
                        break;
                    case 1:
                        switch (computer)
                        {
                            case 0 ->
                            {
                                System.out.println(name +" wins the game");
                                user_count++;
                                System.out.println(name +" count is "+ user_count);
                                System.out.println("computer count is "+ computer_count);
                                System.out.println("------------------------------");
                            }
                            case 1 ->
                            {
                                System.out.println("both the players got tie");
                                System.out.println(name +" count is "+ user_count);
                                System.out.println("computer count is "+ computer_count);
                                System.out.println("------------------------------");
                            }
                            case 2 ->
                            {
                                System.out.println("computer won the game");
                                computer_count++;
                                System.out.println(name +" count is "+ user_count);
                                System.out.println("computer count is "+ computer_count);
                                System.out.println("------------------------------");
                            }

                        }
                        break;
                    case 2:
                        switch (computer)
                        {
                            case 0 ->
                            {
                                System.out.println("computer won the game");
                                computer_count++;
                                System.out.println(name +" count is "+ user_count);
                                System.out.println("computer count is "+ computer_count);
                                System.out.println("------------------------------");
                            }
                            case 1 ->
                            {
                                System.out.println(name +" won the game");
                                user_count++;
                                System.out.println(name +" count is "+ user_count);
                                System.out.println("computer count is "+ computer_count);
                                System.out.println("------------------------------");
                            }
                            case 2 ->
                            {
                                System.out.println("both the players got tie");
                                System.out.println(name +" count is "+ user_count);
                                System.out.println("computer count is "+ computer_count);
                                System.out.println("------------------------------");
                            }

                        }
                        break;
                    default:
                        System.out.println(name +" you have eneterd the wrong choice,so computer gets the point.\n next time please enter the correct choice");
                        computer_count++;
                        System.out.println(name +" count is "+ user_count);
                        System.out.println("computer count is "+ computer_count);
                        System.out.println("------------------------------");


                }
                levels--;
            }
            if(user_count > computer_count)
            {
                System.out.println(name +" wins the game");
            }
            else if(user_count < computer_count)
            {
                System.out.println("computer wins the game");
            }
            else
            {
                System.out.println(" both the players got tie \n try the game once again");

            }
        }
    }


