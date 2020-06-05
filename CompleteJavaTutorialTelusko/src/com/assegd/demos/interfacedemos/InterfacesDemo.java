package com.assegd.demos.interfacedemos;

interface Writer{
    void write();
}

class Pen implements Writer{
    public void write(){
        System.out.println("In a Pem");
    }
}


class Pencil implements Writer{
    public void write(){
        System.out.println("In a Pemcil");
    }
}

class Kit{
    public void doSomething(Writer w){
        w.write();
    }
}

public class InterfacesDemo {

    public static void main(String[] args) {
        Writer objPen = new Pen();
        Writer objPencil = new Pencil();

        Kit doSomething = new Kit();
        doSomething.doSomething(objPen);
        doSomething.doSomething(objPencil);

    }
}
