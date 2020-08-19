// По заданию номер 4 не понял: "Вывести при помощи методов из пункта 3 ФИО и возраст."
// Куда и откуда вывести? Из одного сотрудника? Из всех?
// В консоль и так все выводится в 5 задании.
// В общем, 4 я просто скипнул.


public class HomeWork4
{
    public static void main (String[] args)
    {
        Employee[] staff = new Employee[7]; // Пусть будет побольше

        staff[0] = new Employee("Лом",19,12_130);
        staff[1] = new Employee("Фукс",39,0);
        staff[2] = new Employee("Христофор Бонифатьевич",55,50_000);
        staff[3] = new Employee("Джулико Бандитто",35,200_000);
        staff[4] = new Employee("Де Ля Воро Гангстеритто",36,200_000);
        staff[5] = new Employee("Шеф",44,1_000_000);
        staff[6] = new Employee("Ноль-Ноль-Икс",35,300_000);


        System.out.println("Выводим весь список сотрудников:");
        printFromAge(staff,0);


        System.out.println("\nВыводим список сотрудников старше 40:");
        printFromAge(staff,40);


        raiseSalaryFromAge(staff,45,5000);
        System.out.println("\nПодняли зарплату сотрудникам старше 45 лет на 5000:");
        printFromAge(staff,0);


        int averageSalary = getAverageSalary(staff);
        int averageAge = getAverageAge(staff);
        String out = String.format("\nСредняя зарплата - %,d, средний возраст - %d",
                                   averageSalary, averageAge).replace(".", " ");
        System.out.println(out);


        System.out.printf("\nОбщее количество сотрудников по счетчику - %d", Employee.getStaffSize());
    }

    // Печатаем список сотрудников старше указанного возраста
    public static void printFromAge (Employee[] givenStaff, int givenAge)
    {
        for(int i=0; i<givenStaff.length; i++)
        {
            if (givenStaff[i].getAge()>=givenAge)
            {
                String name = givenStaff[i].getName();
                int age = givenStaff[i].getAge();
                int salary=givenStaff[i].getSalary();
                int id=givenStaff[i].getID();
                String out = String.format("ID: %d  |  Имя: %-25s  |  Возраст: %d  |  Зарплата: %,d",
                                                id, name, age, salary).replace("."," ");
                System.out.println(out);
            }
        }
    }

    // Меняем зарпалту на указанное число сотрудникам старше указанного возраста
    public static void raiseSalaryFromAge (Employee[] givenStaff, int givenAge, int givenBonus)
    {
        for(int i=0; i<givenStaff.length; i++)
        {
            if (givenStaff[i].getAge()>=givenAge)
            {
                int newSalary = givenStaff[i].getSalary() + givenBonus;
                givenStaff[i].setSalary(newSalary);
            }
        }
    }

    // Считаем среднюю зарплату
    public static int getAverageSalary (Employee[] givenStaff)
    {
        int sum = 0;

        for (int i=0; i<givenStaff.length; i++)
        {
            sum += givenStaff[i].getSalary();
        }

        return sum / givenStaff.length;
    }

    // Считаем средний возраст
    public static int getAverageAge (Employee[] givenStaff)
    {
        int sum = 0;

        for (int i=0; i<givenStaff.length; i++)
        {
            sum += givenStaff[i].getAge();
        }

        return sum / givenStaff.length;
    }
}
