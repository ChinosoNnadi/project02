package Project2;
/*
* We have to calculate the average of marks obtained in three subjects
by student A and by student B. Create class 'Marks' with an abstract
method 'getPercentage' that will be returning the average percentage
of marks. Provide implementation of abstract method in classes 'A'
and 'B'. The constructor of student A takes the marks in three
subjects as its parameters and the marks in four subjects as its
parameters for student B. Test your code
* */
public interface Mark {

     double getPercentage(int math, int chemistry, int physics);

     double getPercentage(int math, int chemistry, int physics, int biology);
}
class StudentA implements Mark{
    int totalMark;
    @Override
    public double getPercentage(int math, int chemistry, int physics) {
        totalMark = math+chemistry+physics;
        double avgPercentage = totalMark/3;
        return avgPercentage;
    }

    @Override
    public double getPercentage(int math, int chemistry, int physics, int biology) {
        return 0;
    }
}
class StudentB implements Mark{
    private int biology;
    @Override
    public double getPercentage(int math, int chemistry, int physics) {
        return 0;
    }

    @Override
    public double getPercentage(int math, int chemistry, int physics, int biology) {
        int totalMark2 = math+chemistry+physics+biology;
        double avgPercentage = totalMark2/4;
        return avgPercentage;
    }
}
class MarkTester{
    public static void main(String[] args) {
        Mark [] m = {new StudentA(), new StudentB()};
        for (Mark arr:m){
            System.out.println(arr.getPercentage(90, 78, 99));
            System.out.println(arr.getPercentage(90,30, 67, 89));
        }
    }
}