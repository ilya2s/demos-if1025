package animaux;


public class Animal {
    protected static int uneVariableStatic = 50;

    public Animal(){
        uneVariableStatic = 10;
    }

    public void getType() {
        System.out.println("Je suis un animal");
    }

    public void setVariable(int x) {
        uneVariableStatic=x;
    }

    public int getVariable(){
        return uneVariableStatic;
    }


}
