/**
 *
 *@Author: Jacob Stockwell 
 *@Version: 09/24/18
 *
 * Description:This program is designed too 
 * fetch grade with classes
 */
 
public class Grade 
{
   private double exam1, exam2, finalExam, activityAvg, quizAvg = 0;
   private double projectAvg = 0; 
   private String studentName = "";
   /**
   */
   public static final int EXAM_1 = 1, EXAM_2 = 2, FINAL = 3; 
   /**
   */
   private static final double EXAM_WEIGHT = 0.15;
   private static final double FINAL_WEIGHT = 0.30; 
   private static final double ACT_WEIGHT = 0.05;
   private static final double QUIZ_WEIGHT = 0.10; 
   private static final double PROJ_WEIGHT = 0.25; 
   
   /**
     @param studentNameIn fo student name
   */
   public Grade(String studentNameIn)
   {
      studentName = studentNameIn; 
   
   
   }
   
   /**
    *@param activityAvgIn for activity grade
    *@param quizAvgIn for quiz grade
   */
   
   public void setLabAverages(double activityAvgIn, double quizAvgIn)
   {
      activityAvg = activityAvgIn;
      quizAvg = quizAvgIn; 
   
   }
   
   /**
    @param projectAvgIn for project average
   */
   
   public void setProjectAvg(double projectAvgIn)
   {
   
      projectAvg = projectAvgIn; 
   
   }
   
   /**
    *@param examType for exam type 
    *@param examScoreIn for scoreIn 
    *
   */
   
   public void setExamScore(int examType, double examScoreIn)
   {
      if (examType == EXAM_1)
      {
         exam1 = examScoreIn;
      }
      
      else if (examType == EXAM_2) 
      {
         exam2 = examScoreIn;
      
      }
      
      else if (examType == FINAL) 
      {
         finalExam = examScoreIn;
      
      }
   }
   
   /**
    *@return grade for calcGrade
   */
   
   public double calculateGrade()
   {
      double grade = exam1 * EXAM_WEIGHT + exam2 * EXAM_WEIGHT
         + finalExam * FINAL_WEIGHT
         + activityAvg * ACT_WEIGHT
         + quizAvg * QUIZ_WEIGHT
         + projectAvg * PROJ_WEIGHT;
   
      return grade;
   }
   
   /**
    *@return string 
   */
   
   public String toString()
   {
      
   
   
      return "Name: " + studentName + "\n"
            + "Course Grade: " + calculateGrade();
   }
   
   
}