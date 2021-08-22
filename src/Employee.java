public class Employee {
        //1. Создать класс "Сотрудник" с полями: ФИО, должность,
        // email, телефон, зарплата, возраст.
        String FullName;
        String Position;
        String email;
        String numberphone;
        float salary;
        int age;

        //2. Конструктор класса должен заполнять
        // эти поля при создании объекта.
        Employee (String FullName, String Position, String email, String numberphone, float salary, int age)
        {
                this.FullName = FullName;
                this.Position = Position;
                this.email = email;
                this.numberphone = numberphone;
                this.salary = salary;
                this.age = age;}

        // 3. Внутри класса «Сотрудник» написать метод,
        // который выводит информацию об объекте в консоль.
        void printInfo()
        {
         System.out.println("ФИО: " + FullName);
         System.out.println("Должность: " + Position);
         System.out.println("email: " + email);
         System.out.println("Номер тел.: " + numberphone);
         System.out.println("Заработная плата: " + salary);
         System.out.println("Возраст: " + age);
        }
}
