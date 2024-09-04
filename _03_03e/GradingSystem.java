package _03_03e;

public class GradingSystem {

  public boolean isAPass(int percentage) {
    if (percentage >= 60) {
      return true;
    } else {
      return false;
    }
  }

  public char getGrade(int percentage) {
    if (percentage >= 90) {
      return 'A';
    } else if (percentage >= 80) {
      return 'B';
    } else if (percentage >= 70) {
      return 'C';
    } else if (percentage >= 60) {
      return 'D';
    } else {
      return 'F';
    }
  }

  public String retakeMessage(int percentage, boolean allowedToRetake) {
    if (percentage < 60 && allowedToRetake) {
      return "The student has been entered for a retake.";
    } else if (percentage < 60 && !allowedToRetake) {
      return "The student is not allowed to retake this exam.";
    } else {
      return "A retake is not required.";
    }

  }

}
