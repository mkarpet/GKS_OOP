public class OOP {
    public static void main(String[]args){

        Student student1 = new Student("Maksim","Karpov");
        Student student2 = new Student("Boolat","Shogidoolin");
        Student student3 = new Student("Maklat","Kardoolin");
        Student student4 = new Student("Booksim","Shogirpov");
        student1.setScores(new double[]{15,20,25});
        student2.setScores(new double[]{25,26,21,20});
        student3.setScores(new double[]{15,56,23,25});
        student4.setScores(new double[]{1,5,8});
        System.out.println(student1.getNameAndSurname() + " " + student1.averageScore());
        System.out.println(student2.getNameAndSurname() + " " + student2.averageScore());
        System.out.println(student3.getNameAndSurname() + " " + student3.averageScore());
        System.out.println(student4.getNameAndSurname() + " " + student4.averageScore());

        student1.name = "Baksim";
        student1.setScores(new double[]{25,20,10});

        student2.name = "Moolat";
        student2.setScores(new double[]{20,20,20});
        System.out.println();
        System.out.println(student1.getNameAndSurname() + " " + student1.averageScore());
        System.out.println(student2.getNameAndSurname() + " " + student2.averageScore());
        System.out.println(student3.getNameAndSurname() + " " + student3.averageScore());
        System.out.println(student4.getNameAndSurname() + " " + student4.averageScore());

    }
    static class Human{
        String name;
        String surname;
        Human(String name,String surname){
            this.name = name;
            this.surname = surname;

        }
        String getNameAndSurname() {
            return name + " " + surname;
        }

    }
    static class Student extends Human{
        double[] scores;


        Student(String name, String surname) {
            super(name, surname);
        }
        void setScores(double[]scores){
            this.scores = scores;
        }
        double averageScore(){
            double s = 0;
            for (int i = 0; i < scores.length; i++) {
                s = s+scores[i];


            }
            s = s/scores.length;
            return s;
        }
    }

}
