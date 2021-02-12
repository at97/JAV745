public class Test02 {

    public static void main(String[] args) {
        // Course points =  gradeValuePoints   x  course credits
        int totalPoint = 0;

        String[]  courseName = {"Intro to Java", "Intro to Web", "Intro to DB"};
        int[]  marks = {55, 92, 81};  // 55 is the mark gotten in Java. 92 is the mark gotten in Web and 81 in Intro to DB
        int[]  credits = {3,3,4}; // Intro to Java is a 3 credit course.  Intro to Web is a 3 credit course. Intro to DB is a 4 credit course

        double totalCoursePoints = calculateTotalCoursePoints(credits, marks);
        double totalCredits = calculateTotalCredits(credits);
        double semesterGPA = calculateGPA(totalCoursePoints, totalCredits);

        System.out.println("Total points: " + totalCoursePoints);
        System.out.println("Total credits: " + totalCredits);
        System.out.println("Semester GPA: " + semesterGPA);
    }

    public static double calculateTotalCoursePoints(int[] creditArray, int[] marks) {
        double totalPoints = 0;
        // Assuming this is the same as creditArray.length
        int[] gradeValuePoint = new int[marks.length];

        // Calculate the grade value point based on course mark
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] <= 59.9) {
                gradeValuePoint[i] = 0;
            } else if (marks[i] <= 69.9) {
                gradeValuePoint[i] = 1;
            }  else if (marks[i] <= 79.9) {
                gradeValuePoint[i] = 2;
            }  else if (marks[i] <= 89.9) {
                gradeValuePoint[i] = 3;
            }  else if (marks[i] <= 100) {
                gradeValuePoint[i] = 4;
            }
        }

        // Course points =  gradeValuePoints * Course credits
        for (int i = 0; i < marks.length; i++) {
            // Course points =  gradeValuePoints * Course credits
            totalPoints += (gradeValuePoint[i] * creditArray[i]);
        }

        return totalPoints;
    }

    public static double calculateTotalCredits(int[] creditArray) {
        double totalCredits = 0;

        // Sum the array
        for (int i = 0; i < creditArray.length; i++) {
            totalCredits += creditArray[i];
        }
        return totalCredits;
    }

    public static double calculateGPA (double coursePoints, double credits) {
        // Semester GPA  =   total course points /total credits earned
        double GPA = coursePoints / credits;
        return GPA;
    }
}
