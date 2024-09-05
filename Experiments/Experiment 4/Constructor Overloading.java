import java.util.Scanner;

class Overload 
{
    String name;
    int age;

    // Constructor Overloading
    Overload() 
    {
        name = "Unknown";
        age = 0;
    }

    Overload(String name) 
    {
        this.name = name;
        this.age = 0;  // Default age
    }

    Overload(String name, int age) 
    {
        this.name = name;
        this.age = age;
    }

    void displayInfo() 
    {

        System.out.println("Name: " + name + "\nAge: " + age);
    }
}

public class Overloading 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Name and Age for person 1:");
        String name1 = scanner.nextLine();
        int age1 = scanner.nextInt();
        scanner.nextLine(); 

        Overload person1 = new Overload(name1, age1);

        System.out.println("Enter Name and Age for person 2:");
        String name2 = scanner.nextLine();
        int age2 = scanner.nextInt();

        System.out.println();

        Overload person2 = new Overload(name2, age2);

        // Display information 
        System.out.println("Information for person 1:");
        person1.displayInfo();
        System.out.println();
        System.out.println("Information for person 2:");
        person2.displayInfo();

        scanner.close();
    }
}

/*
Enter Name and Age for person 1:
Sam
25
Enter Name and Age for person 2:
Remi
26

Information for person 1:
Name: Sam
Age: 25

Information for person 2:
Name: Remi
Age: 26
*/
