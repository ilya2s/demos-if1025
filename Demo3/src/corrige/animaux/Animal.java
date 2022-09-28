package corrige.animaux;

public class Animal {
    protected static int uneVariableStatic;     // Attribut static (Appartient à la classe et non à un objet Animal)


    // Constructeur
    public Animal(){
        uneVariableStatic = 50;
    }


    // Méthodes
    public void getType() {
        System.out.println("Je suis un animal");
    }

    public void setVariable(int x) {
        uneVariableStatic = x;
    }

    public int getVariable(){
        return uneVariableStatic;
    }
}