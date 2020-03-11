package webapplication;

public class Ip {

    static String domain = "aieml";
    double ipAddress;
    String transferProtocol;

    static void setDomain(String aDomain) {
        domain = aDomain;
    }

    void setIpAddress(double ipAddress) {
        this.ipAddress = ipAddress;
    }

    void setTransferProtocol(String transferProtocol) {
        this.transferProtocol = transferProtocol;
    }

    static String getDomain() {
        return domain;
    }

    double getIpAddress() {
        return ipAddress;
    }

    String getTransferProtocol() {
        return transferProtocol;
    }

    Ip() {

    }

    Ip(double ipAddress, String transferProtocol) {
        this.ipAddress = ipAddress;
        this.transferProtocol = transferProtocol;
    }

    void ipDetailPrinter() {
        System.out.println("*************IP DETAILS*************");
        System.out.println("domain           : " + Ip.getDomain());
        System.out.println("ipAddress        : " + getIpAddress());
        System.out.println("transferProtocol : " + getTransferProtocol());
        System.out.println("************************************");
    }

//    Ip ipDetails(){
//        return new Ip();
//    }
    
    Ip setIpAdress(Ip ip){
        ip.ipAddress=this.ipAddress;
        return ip;
    }
}
