public class MainKinderGarden {
    public static void main(String[] args) {

        Child c1 = new Child("Oliver Smith", 101, 3.5, "Allergic to peanuts");
        Child c2 = new Child("Emma Johnson", 102, 4.0, "Brings her own teddy bear for naptime");
        Child c3 = new Child("Liam Williams", 103, 3.2, "Very active, loves outdoor games");
        Child c4 = new Child("Ava Brown", 104, 4.5, "Loves drawing, speaks fluent Spanish");
        Child c5 = new Child("Noah Jones", 105, 2.8, "Still adjusting, might cry in the morning");
        Child c6 = new Child("Sophia Garcia", 106, 5.0, "Ready for preschool, very independent");
        Child c7 = new Child("Lucas Miller", 107, 3.7, "Asthma inhaler is in his backpack");
        Child c8 = new Child("Mia Davis", 108, 4.2, "Vegetarian diet only");
        Child c9 = new Child("Ethan Rodriguez", 109, 3.9, "Loves puzzles and building blocks");
        Child c10 = new Child("Isabella Martinez", 110, 4.8, "Needs help with tying her shoes");

        Parent p1 = new Parent("John Smith", 201, "+1-555-0191", "123 Maple Street, New York");
        Parent p2 = new Parent("Sarah Johnson", 202, "+1-555-0192", "456 Oak Avenue, Boston");
        Parent p3 = new Parent("Michael Williams", 203, "+1-555-0193", "789 Pine Road, Chicago");
        Parent p4 = new Parent("Emily Brown", 204, "+1-555-0194", "321 Elm Boulevard, Austin");
        Parent p5 = new Parent("David Jones", 205, "+1-555-0195", "654 Cedar Lane, Seattle");
        Parent p6 = new Parent("Jessica Garcia", 206, "+1-555-0196", "987 Birch Street, Miami");
        Parent p7 = new Parent("James Miller", 207, "+1-555-0197", "147 Walnut Drive, Denver");
        Parent p8 = new Parent("Ashley Davis", 208, "+1-555-0198", "258 Chestnut Court, San Francisco");
        Parent p9 = new Parent("Robert Rodriguez", 209, "+1-555-0199", "369 Willow Way, Houston");
        Parent p10 = new Parent("Amanda Martinez", 210, "+1-555-0120", "741 Cherry Lane, Phoenix");
    }
}


/*


-------------
name (String)
id(int)
age (double)
notes(String)

Parent
-------------
name(String)
id(int)
phone (String)
address(String)

Garden
-------------
name(String)
address(String)
phone (String)
director(String)
TreeMap<Child, Parent> children
--------------------------------
addToGarden(child c, Parent p)
printChildren()
removeFromGarden(int id)

 */