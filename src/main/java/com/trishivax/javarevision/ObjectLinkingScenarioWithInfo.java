package com.trishivax.javarevision;

public class ObjectLinkingScenarioWithInfo {

    static void main(String[] args) {
        Mannu1  mObj = new Mannu1();
        System.out.println(mObj.sk.s.k.deptId);

    }
}


class Mannu1 {
    int age = 35;
    String name="kp";
    SuklaJee sk = new SuklaJee();
}

class SuklaJee{
    String mobileNo = "9999999999999999";
    String address = "Bangalore";
    Sonia s = new Sonia();
}
class Sonia{
    String course = "BE";
    String emailId = "sonia@abc.com";
    Kavya k = new Kavya();
}
class Kavya{
    String deptId = "R&D";
}