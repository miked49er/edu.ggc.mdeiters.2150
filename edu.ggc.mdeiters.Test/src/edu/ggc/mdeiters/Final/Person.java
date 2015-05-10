package edu.ggc.mdeiters.Final;

public class Person implements Comparable<Person>
{
    private String name;
    private int age;
    
    
    public Person()
    {
        name = "";
        age = 0;
    }
    
    public Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    @Override
    public int compareTo(Person pers)
    {
        return age - pers.getAge();
    }

	@Override
    public String toString() {

	    return name + " " + age;
    }
    
    
}
