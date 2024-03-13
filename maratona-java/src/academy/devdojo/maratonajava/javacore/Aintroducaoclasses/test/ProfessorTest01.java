package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.domain.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor teacher = new Professor();
        teacher.name = "Master Roshi";
        teacher.age = 149;
        teacher.sex = 'M';

        System.out.println("Name: " + teacher.name + " Age: " + teacher.age + " Sex: " + teacher.sex);
    }
}
