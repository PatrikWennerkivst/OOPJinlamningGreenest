
//Här använder implementerar jag interfacet WaterForPlants så att alla subbklasser får
//tillgång till interfacet. Istället för att implementera den i varje subbklass.
public abstract class Greenest implements GreenestInterface {

    //Här har jag satt variablerna som private för att kapsla in dem.
    //Detta har jag gjort för att "skydda" dem från att kunna bli ändrade i
    //andra klasser.

    private String name;
    private double length;

    public Greenest(String name, double length) {
        this.name = name;
        this.length = length;
    }

    public String getName() {
        return name;
    }

    public double getLength() {
        return length;
    }
}