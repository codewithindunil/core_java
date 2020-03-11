package webapplication;

public class Application {

    String name;
    String purpose;
    String devName;
    double appVersion;
    Ip ip;

    void setName(String name) {
        this.name = name;
    }

    void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    void setDevName(String devName) {
        this.devName = devName;
    }

    void setAppVersion(double appVersion) {
        this.appVersion = appVersion;
    }

    Application() {
        ip = new Ip();
    }

    Application(String name, String purpose, String devName, double appVersion, Ip ip) {
        this.name = name;
        this.purpose = purpose;
        this.devName = devName;
        this.appVersion = appVersion;
        this.ip = ip;
    }

    void appDetailPrint() {
        System.out.println("*******APP DETAILS********");
        System.out.println("name       : " + name);
        System.out.println("purpose    : " + purpose);
        System.out.println("devName    : " + devName);
        System.out.println("appVersion : " + appVersion);
        System.out.println("**************************");
        ip.ipDetailPrinter();

    }

    Ip getIp(){
        return ip;
    }

    void setIp(Ip ip) {
        this.ip = ip;
    }

}
