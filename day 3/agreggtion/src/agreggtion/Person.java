package agreggtion;

public class Person {

    String name;
    String gender;
    int idNo;
    ieadentiCard id;
    
    Person(){
        
    }
    
    Person(String name,String gender,int idNo,ieadentiCard id){
        this.name=name;
        this.gender=gender;
        this.idNo=idNo;
        this.id=id;
    }
      Person(ieadentiCard id){
        
        this.id=id;
    }
    
    void printPerson(){
        id.printId();
    }
}
