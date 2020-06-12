package com.assegd.demos.completetutorial.interfacedemos;

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
        System.out.println("In a Pencil");
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
