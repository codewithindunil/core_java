
package mycompany;


public class Address {
    int homeNo;
    String road;
    String town;
    String province;

    void setHomeNo(int homeNo) {
        this.homeNo = homeNo;
    }

    void setRosd(String road) {
        this.road = road;
    }

    void setTown(String town) {
        this.town = town;
    }

    void setProvince(String province) {
        this.province = province;
    }
    Address(){
        
    }
    Address(int homeNo,String road,String town,String province){
        this.homeNo = homeNo;
        this.road = road;
        this.town = town;
        this.province = province;
    }
      void printAddress() {
        System.out.println("===================+=========");
        System.out.println("homeNo        : " + homeNo);
        System.out.println("road          : " + road);
        System.out.println("town          : " + town);
        System.out.println("province      : " + province);
        System.out.println("=============================");

    }
}
