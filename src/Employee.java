public class Employee
{
    public static final int MIN_AGE = 0;
    public static final int MIN_SALARY = 0;

    private String name;
    private int age;      // делаем строго по ТЗ )
    private int salary;
    private int id;
    private static int staffSize = 0;

    Employee (String givenName, int givenAge, int givenSalary)
    {
        name = givenName;
        setAge(givenAge);
        setSalary(givenSalary);

        staffSize++;
        id = staffSize;
    }

    // Указываем возраст
    private void setAge (int givenAge)
    {
        if (givenAge<MIN_AGE)
        {
            System.out.println("Не, ну мы понимаем, что когда-то в гвардию заочно еще младенцев записывали, но чтобы ДО рождения - это уже совсем перебор. :P");
            age = MIN_AGE;
        }
        else age = givenAge;
    }

    // Устанавливаем зарплату
    public void setSalary (int givenSalary)
    {
        if (givenSalary<MIN_SALARY)
        {
            System.out.println("Мечта учредителя: чтобы сотрудники платили за приход на работу :P");
            salary = MIN_SALARY;
        }
        else salary = givenSalary;
    }

    // Геттеры
    public String getName ()
    {return name;}

    public int getAge ()
    {return age;}

    public int getSalary()
    {return salary;}

    public int getID()
    {return id;}

    public static int getStaffSize ()
    {return staffSize;}
}
