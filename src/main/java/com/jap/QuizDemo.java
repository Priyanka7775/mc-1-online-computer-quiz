package com.jap;

public class QuizDemo {

    //return the school name which has got the highest score in quiz
    //Handle the NumberFormatException
    public String highestScore(String []nameOfSchool , String[] scores ){
       int maxScore=0;
        try {
            int highest= 0;
            for (int i=0;i<scores.length;i++){
                if(highest < Integer.parseInt(scores[i])) {
                     highest = Integer.parseInt(scores[i]);
                     maxScore=i;
                }
            }

            System.out.println("highest = " + highest);

        }catch (NumberFormatException exception) {
            System.out.println(exception);
            return exception.toString();
        }
        return nameOfSchool[maxScore];

    }
    //convert all the names in uppercase
    //Handle the NullPointerException
    public String[] convertAllNamesToCapital(String name[]){
        String upperCase[] = new String[0];
        try{
            for (int i=0;i< name.length;i++){
                upperCase[i]=name[i].toUpperCase();
                System.out.println("upperCase = " + upperCase);
            }

        }catch (NullPointerException exception) {
            System.out.println(exception);
            return new String[]{exception.toString()};
        }
        return upperCase;

    }
}






