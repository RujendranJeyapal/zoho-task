package zoho;
import task.Task1;
import task4.*:
import java.util.Scanner;

public class Main {


    public static void main(String[] args)  {


        Task1 taskObject=new Task1();


        System.out.println("1.Find the length of a String   2.String-->character Arrray   3.penultimate(Find the Last but one of a string)   4.Find the no of occurrences of a letter   5.Find the greatest position of the letter   6.Print last 5 character of a String   7.Print first three character of a String   8.Replace first 3 character of a string with 'XYZ'   9.String starts with 'ent'   10.String ends with 'le'   11.Lowercase-->Uppercase   12.Uppercase-->Lowercase   13.Reverse a string   14.Multiple strings   15.Single string without spaces   16.Enclose each string into a String array   17.Merge each String with '-'   18.Two input strings are equal   19.Two input strings are equal   20.string with no spaces either at the beginning or end");


        System.out.println("");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Question number");
        int number = 0;


                try 
                {
                number = input.nextInt();
                input.nextLine();
                }
                catch (Exception value)
                {
                System.out.println("");
                }
       



        switch (number) 
        {
        
               case 1:
                    {
                      String inputString1=args[0];
                       System.out.println(taskObject.getLength(inputString1));
                    }
                    catch(MistakeOccuredException ex)
                    {
                    System.out.println(ex.getMessage());
                    }
                    
                    break;

                case 2:
                     System.out.println("Enter a string");
                    
                     String inputString =input.nextLine();
                   try
                    { 
                    for(char outputChar: taskObject.stringToCharacter(inputString))
                    
                    System.out.println(outputChar);
                    
                    }       
                    catch(MistakeOccuredException ex)
                    {
                    System.out.println(ex.getMessage());
                    }
                    break;


                case 3:
                    System.out.println("Enter a string");
                    String name3=input.nextLine();
                    System.out.println("Enter the Position");
                    
                    
                    try
                    {
                    
                    int position=input.nextInt();
                    
                    
                    
                   
                                              
                         System.out.println(taskObject.letterOfPosition(name3,position-1));  
                       
                    catch (MistakeOccuredException empty)
                    {
                        System.out.println(empty.getMessage());
                    }
                     
                    catch(Exception ex)
                    {
                    System.out.println("Please enter a number");
                    }

                      break;


                case 4:
                    System.out.println("Enter a string");

                    String name4 =input.nextLine();


                    System.out.println("Enter a letter");
                    char letter = input.next().charAt(0);
               
                   try
                    {

                    System.out.println(taskObject.occurrencesOfLetter(name4, letter));
                    }
                    catch(MistakeOccuredException error)
                    {
                    System.out.println(error.getMessage());
                    }
                    break;


                case 5:
                    System.out.println("Enter a string");

                    String name5 = input.nextLine();


                    System.out.println("Enter a letter");

                    char letter1 = input.next().charAt(0);
                    try
                    {
                      System.out.println(taskObject.greatestPosition(name5, letter1));
                    }
               
                      catch(MistakeOccuredException error)
                    {
                                        System.out.println(error.getMessage());
                

                    }
                    break;


                case 6:
                    System.out.println("Enter a string");

                    String name6 = input.nextLine();
                    try
                    {
                    System.out.println("Enter the starting Position");
                    int startPosition=input.nextInt();
                    System.out.println("Enter the ending Position");
                    int endPosition=input.nextInt();         
                    System.out.println(taskObject.printLetters(name6,startPosition-1,endPosition));
                     
                    catch (MistakeOccuredException empty)
                    {
                        System.out.println(empty.getMessage());
                    }
                    
                     catch(Exception ex)
                    {
                    System.out.println("Please enter a number");
                    }
                    
                    break;


                case 7:
                    System.out.println("Enter a string");
                    String name7 =input.nextLine();
                    try
                    {
                    System.out.println("Enter the starting Position");
                    int startPosition=input.nextInt();
                    System.out.println("Enter the ending Position");
                    int endPosition=input.nextInt();    
                    System.out.println(taskObject.printLetters(name7,startPosition,endPosition));
                    }
                    catch (MistakeOccuredException empty)
                    {
                    System.out.println(empty.getMessage());
                    }
                    
                    catch(Exception ex)
                    {
                    System.out.println("Please enter a number");
                    }
                    
                    break;


              case 8:
                    System.out.println("Enter a string");
                    String name8 = input.nextLine();
                    System.out.println("Enter Replace letters");
                    String name_8=input.nextLine();
       
                    
                    try
                    {
                    System.out.println("Enter the starting Position");
                    int firstPositionToReplace=input.nextInt();
                    System.out.println("Enter the ending Position");
                    int lastPositionToReplace=input.nextInt();
                    
                    
                 
                    
                    System.out.println(taskObject.replaceWithAnotherLetter(name8,name_8,firstPositionToReplace-1,lastPositionToReplace));
                    
                    catch (MistakeOccuredException empty) 
                    {
                        System.out.println(empty.getMessage());
                    }
                    
                     catch(Exception ex)
                    {
                        System.out.println("Please enter a number");
                    }
                    
                    break;


                case 9:
                    System.out.println("Enter a string");
                    String name9 = input.nextLine();
                    System.out.println("Enter a letter to check for start");
                    String name_9=input.nextLine();
         
                     try
                     {
                        
                        System.out.println(taskObject.startingCheck(name9,name_9));
                     }
           
                     catch(MistakeOccuredException empty)
                     {
                        System.out.println(empty.getMessage());  
                     }
                    break;
                    
                case 10:
                    System.out.println("Enter a string");
                    String name10 = input.nextLine();
                    System.out.println("Enter a letter to check for end");
                    String name_10=input.nextLine();
         
                  
                    try
                    {  
                   
                      System.out.println(taskObject.endingCheck(name10,name_10));
                    
                    }
                    catch(MistakeOccuredException empty)
                    {
                       System.out.println(empty.getMessage());
                    }
                    break;


                case 11:
                    System.out.println("Enter a string");
                    String name11 = input.nextLine();
                    try
                    {
                    System.out.println(taskObject.upperCase(name11));
                    }
                    catch(MistakeOccuredException empty)
                    {
                    System.out.println(empty.getMessage());
                    }
                    break;


                case 12:
                    System.out.println("Enter a string");
                    String name12 =input.nextLine();
                
                    try
                    {
                    System.out.println(taskObject.lowerCase(name12));
                    }
                    catch(MistakeOccuredException empty)
                    {
                    System.out.println(empty.getMessage());
                    }
                    break;


                case 13:
                    System.out.println("Enter a string");

                    String name13 =input.nextLine();
                    try
                    {
                    System.out.println(taskObject.toReverseAString(name13));
                    }
                    catch(MistakeOccuredException empty)
                    {
                    System.out.println(empty.getMessage());
                    }
                    break;


                case 14:
                    System.out.println("Enter a String");
                    String name14 =input.nextLine();                  
                    try
                    {
                    System.out.println(taskObject.stringsInNextLine(name14));
                    }
                    catch(MistakeOccuredException empty)
                    {
                    System.out.println(empty.getMessage());
                    }  
                    break;
                    
                    
                case 15:
                    System.out.println("Enter a String");
                    String name15 =input.nextLine();
                    try
                    {
                    System.out.println(taskObject.concatenateStrings(name15));
                    }
                    catch(MistakeOccuredException empty)
                    {
                    System.out.println(empty.getMessage());
                    }
                    break;
                    
                case 16:
                    System.out.println("Enter a sentence");
                    String name16 =input.nextLine();
                 
                    try
                    {
                    String splitSentence[]=taskObject.splitStrings(name16);
                    for(String k:splitSentence)
                    {
                    System.out.println(k);
                    }
                    }
                    catch(MistakeOccuredException empty)
                    {
                    System.out.println(empty.getMessage());
                    }  
                    
                    break;
                    
                case 17:
                    System.out.println("Howmany String you want..");
                    int number1 = input.nextInt();
                    input.nextLine();
                    String name17[] = new String[number1];
                    System.out.println("Enter your string");
                    
                    for (int i = 0; i < number1; i++)
                    {
                        name17[i] = input.nextLine();
                        
                    }
                    try
                    {
                    System.out.println(taskObject.mergeWith(name17));
                    }
                    catch(MistakeOccuredException empty)
                    {
                    System.out.println(empty.getMessage());
                    }
                    break;
                    
                case 18:
                    System.out.println("Enter a 1st string");
                    String name18 =input.nextLine();
                    System.out.println("Enter a 2nd string");
                    String name_18 =input.nextLine();
                    try
                    {
                        System.out.println(taskObject.checkTwoStringsEqual(name18, name_18));
                    }
                    catch(MistakeOccuredException empty)
                    {
                    System.out.println(empty.getMessage());
                    } 
                    break;
                    
                case 19:
                    System.out.println("Enter a 1st string");
                    String name19 =input.nextLine();
                    System.out.println("Enter a 2nd string");
                    String name_19 =input.nextLine();
                    try
                    {
                    System.out.println(taskObject.checkTwoStringsEqualIgnoreCase(name19, name_19));
                    }
                    catch(MistakeOccuredException empty)
                    {
                    System.out.println(empty.getMessage());
                    }
                    break;
                    
                case 20:
                    System.out.println("Enter a sentence");
                    String name20 =input.nextLine();
                    try
                    {
                    System.out.println(taskObject.toTrimAString(name20));
                    }
                    catch(MistakeOccuredException empty)
                    {
                    System.out.println(empty.getMessage());
                    }
                    break;
                default:
                    System.out.println("Invalid Input...!");
            }
        }
    }



