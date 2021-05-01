package com.google.challenges; 

public class Answer 
{
    //function for creating a string of prime numbers
    public static String getPrime()
    {   
        //declaration of variables
        String rs= "";
        int i,j;
        //stirng creation logic
        for(i=2;i<30000;i++)
        {
            boolean flag = true;
            for(div=2;div*div<=i;div++)
            {
                if(i%div==0)
                {
                    flag = false;
                    break;    
                }
            }
            if(flag == true){
                rs += i;
            }
        }
        return rs;
    }
    //function for returning unique id for each minion
    public static String answer(int n) 
    { 
        //declaration of variables
        String s;
        //id generation logic
        s=getPrime();
        String as=  s.substring(n,n+5);
        return as;
    } 
}