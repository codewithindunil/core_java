
package agreggtion;


public class ieadentiCard {
    
    String name;
    String gender;
    int idNo;
    
    ieadentiCard(){
        
    }
    
    ieadentiCard(String name,String gender,int idNo){
        this.name=name;
        this.gender=gender;
        this.idNo=idNo;
        
    }
    
    
    void printId(){
        System.out.println("name   : "+name);
        System.out.println("gender : "+gender);
        System.out.println("id no  : "+idNo);
    }
    
    
}
