
package agreggtion;


public class Agreggtion {

   
    public static void main(String[] args) {
//        ieadentiCard id1 = new ieadentiCard("indunil", "male",94);
//        Person p1 = new Person("indunil", "male",12,new ieadentiCard("indunil", "male",94));
        Person p2 = new Person(new ieadentiCard("indunil", "male",94));
        
        p2.printPerson();
    }

}
