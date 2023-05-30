public class Droid{
    String name;
    int batteryLevel;
    public Droid(String droidName)
    {
        name = droidName;
        batteryLevel= 100;
    }
    public String toString()
    {
        return "Hello, I’m the droid: "+ name;
    }
    public void performTask(String task)
    {
        batteryLevel -=10;
        System.out.println(name+" is performing task: "+task);


    }
    public static void main(String[] args){
        //Inside main(), create a new instance of Droid named "Codey"
        Droid d= new Droid("Codey");
        System.out.println(d);
        //System.out.println(d.name);
        d.performTask("dancing");
        d.performTask("swimming");


    }
}