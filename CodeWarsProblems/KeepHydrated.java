public class KeepHydrated {
    /*
    Nathan loves cycling.
    Because Nathan knows it is important to stay hydrated, he drinks 0.5 litres of water per hour of cycling.
    You get given the time in hours and you need to return the number of litres Nathan will drink, rounded
    to the smallest value.
    For example:
    time = 3 ----> litres = 1
    time = 6.7---> litres = 3
    time = 11.8--> litres = 5
     */
    public static void main(String[] args) {
    KeepHydrated obj1 = new KeepHydrated();
        System.out.println(obj1.Liters(3));
        System.out.println(obj1.Liters(6.7));
        System.out.println(obj1.Liters(11.8));


    }
    public String Liters(double time)  {
        int liters = (int)(time * 0.5);
        //because i want to return a string i must use String as the return type in method signature
        //this is not a static method so i must create an object to use this method
        return "time = " + time + " ----> liters = " + liters;

    }
}
