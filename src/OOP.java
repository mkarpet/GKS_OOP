public class OOP {
    public static void main(String[]args){

        // Создание четырех студентов.
        Student student1 = new Student("Maksim","Karpov");
        Student student2 = new Student("Boolat","Shogidoolin");
        Student student3 = new Student("Maklat","Kardoolin");
        Student student4 = new Student("Booksim","Shogirpov");
        // Задание баллов.
        student1.setScores(new double[]{15,20,25});
        student2.setScores(new double[]{25,26,21,20});
        student3.setScores(new double[]{15,56,23,25});
        student4.setScores(new double[]{1,5,8});
        // Вывод имени, фамилии, среднего балла.
        System.out.println(student1.getNameAndSurname() + " " + student1.averageScore());
        System.out.println(student2.getNameAndSurname() + " " + student2.averageScore());
        System.out.println(student3.getNameAndSurname() + " " + student3.averageScore());
        System.out.println(student4.getNameAndSurname() + " " + student4.averageScore());
        // Переименование студента и задание другого количества баллов.
        student1.name = "Baksim";
        student1.setScores(new double[]{25,20,10});

        student2.name = "Moolat";
        student2.setScores(new double[]{20,20,20});
        // Вывод имени, фамилии, среднего балла.
        System.out.println();
        System.out.println(student1.getNameAndSurname() + " " + student1.averageScore());
        System.out.println(student2.getNameAndSurname() + " " + student2.averageScore());
        System.out.println(student3.getNameAndSurname() + " " + student3.averageScore());
        System.out.println(student4.getNameAndSurname() + " " + student4.averageScore());

    }
    static class Human{
        String name;
        String surname;
        // Конструктор для создания человека с именем и фамилией.
        Human(String name,String surname){
            this.name = name;
            this.surname = surname;

        }
        // Метод, возвращающий имя и фамилию.
        String getNameAndSurname() {
            return name + " " + surname;
        }

    }
    static class Student extends Human{
        double[] scores;

        // Конструктор для создания студента с именем и фамилией.
        Student(String name, String surname) {
            super(name, surname);
        }
        // Метод для задания баллов.
        void setScores(double[]scores){
            this.scores = scores;
        }
        // Метод, возвращающий среднее количество баллов.
        double averageScore(){
            double s = 0;
            for (int i = 0; i < scores.length; i++) {
                s = s+scores[i];


            }
            // Деление на количество баллов
            s = s/scores.length;
            return s;
        }
    }

}
