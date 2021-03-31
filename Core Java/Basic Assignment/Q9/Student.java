public class Student {
    private int subjectA,subjectB,subjectC;

    public Student(int subjectA,int subjectB,int subjectC){
        this.subjectA = subjectA;
        this.subjectB = subjectB;
        this.subjectC = subjectC;
    }

    public int studentsTotalMarksInAllSubjects(Student[] students) {
        int totalMarks = 0;
        for(Student student:students){
            totalMarks = totalMarks + student.subjectA + student.subjectB + student.subjectC;
        }
        return totalMarks;
    }

    public double studentsAverageMarksInAllSubjects(Student[] students) {
        int totalMarks = 0;
        for(Student student:students){
            totalMarks = totalMarks + student.subjectA + student.subjectB + student.subjectC;
        }

        return (double) (totalMarks/students.length);
    }

    public int[] subjectWiseMarks(Student[] students,String subjectName){

        int[] arr = new int[students.length];
        for(int i=0; i<students.length;i++){

            if(subjectName.equals("subjectA")){
                arr[i] = students[i].subjectA;
            }else if(subjectName.equals("subjectB")){
                arr[i] = students[i].subjectB;
            }else if(subjectName.equals("subjectC")){
                arr[i] = students[i].subjectC;
            }

        }
        return arr;
    }

    public int subjectATotalByStudents(int[] marks) {
        int totalMarks = 0;
        for(int mark:marks){
            totalMarks += mark;
        }
        return totalMarks;
    }


    public int subjectBTotalByStudents(int[] marks) {
        int totalMarks = 0;
        for(int mark:marks){
            totalMarks += mark;
        }
        return totalMarks;
    }


    public int subjectCTotalByStudents(int[] marks) {
        int totalMarks = 0;
        for(int mark:marks){
            totalMarks += mark;
        }
        return totalMarks;
    }

    public int subjectTotalByStudents(int[] marks){
        int totalMarks = 0;
        for(int mark:marks){
            totalMarks += mark;
        }
        return totalMarks;
    }

    public double subjectAAverageByStudents(int[] marks) {
        int totalMarks = 0;
        for(int mark:marks){
            totalMarks += mark;
        }
        return (double)(totalMarks/3);
    }
    public double subjectBAverageByStudents(int[] marks) {
        int totalMarks = 0;
        for(int mark:marks){
            totalMarks += mark;
        }
        return (double)(totalMarks/3);
    }
    public double subjectCAverageByStudents(int[] marks) {
        int totalMarks = 0;
        for(int mark:marks){
            totalMarks += mark;
        }
        return (double)(totalMarks/3);
    }

    public double subjectAverageByStudents(int[] marks){
        int totalMarks = 0;
        for(int mark:marks){
            totalMarks += mark;
        }
        return (double)(totalMarks/3);
    }

}
