package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.domain.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante student = new Estudante();
        Estudante student02 = new Estudante();
        student.name = "Ozzy";
        student.age = 999;
        student.sex = 'M';

        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.sex);

        System.out.println("----------------------");

        student02.name = "Layne Staley";
        student02.age = 30;
        student02.sex = 'M';

        System.out.println(student02.name);
        System.out.println(student02.age);
        System.out.println(student02.sex);
    }
}
