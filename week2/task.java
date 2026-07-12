package week2;

public class task {
    public static void main(String args[]){
        int[] marks={45,56,78,99,58};
        boolean passed =true;
        for(int i=0;i<marks.length;i++){
            if(marks[i]<35)
            {
                passed=false;
                break;
            }
        }
        if (passed)
        {
            System.out.println("the student is passed all exams");
        }
        else 
        {
            System.out.println("the student is failed in exams");
        }
    }
}