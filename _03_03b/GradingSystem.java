package _03_03b;

public class GradingSystem {

  public boolean isAPass(int percentage) {
   
    if(percentage >=60){
      return true;
    }
    return false;
  }

  public char getGrade(int percentage) {
    if(percentage >=90){
      return 'A';
    }
    else if(percentage>=80 && percentage <=89){
      return 'B';
    }
     else if(percentage>=70 && percentage <=79){
      return 'C';
     }
     else if (percentage>=60 && percentage<=69) {
       return 'D';
     }
     else{
      return 'F';
     }
  }
  public String retakeMessage(int percentage, boolean allowedToRetake) {
    if(percentage<=60&&allowedToRetake==true){
      return "The student has been entered for a retake.";
    }
    else if(percentage<=60&& allowedToRetake==false){
      return "The student is not allowed to retake this exam.";
    }
    else{
      return "Retake not required";
    }
  }

}
