public class HomeWork5 {
    public static void main(String[] args) {
        // 4. Создать массив из 5 сотрудников.
        Employee[] employees = {
                new Employee("Abdalkin Vladimir Andreevich", "Engineer of 1 category", "abdalkinVA@rack.ru", "+7-925-655-47-07", 25000, 32),
                new Employee("Burdin Michail Sergeevich", "Lead Engineer", "burdinMS@rack.ru", "+7-925-655-47-08", 40000, 35),
                new Employee("Vladimirov Sergei Vladimirovich", "Lead Engineer", "VladimirovSV@rack.ru", "+7-925-655-47-09", 43000, 40),
                new Employee("Kats Sergei Iosifovich", "Lead Engineer", "KatsSI@rack.ru", "+7-925-655-47-10", 45000, 42),
                new Employee("Grekov Sergei Michailovich", "Chief Specialist", "GrekovSM@rack.ru", "+7-925-655-47-11", 100000, 50)};

        //5. С помощью цикла вывести информацию только о
        // сотрудниках старше 40 лет.
        int OlderAge = 40;
        for (Employee employee : employees)
        {
            if (employee.age >= OlderAge)
            {
                employee.printInfo();
                System.out.println();
            }
        }
    }
}
