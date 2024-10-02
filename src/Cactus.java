import javax.swing.*;
//Här har jag använt mig av ett arv eftersom att Cactus äver av klassen Greenets
public class Cactus extends Greenest {

    public Cactus(String name, double length) {
        //Här har jag hämtar variablerna name & lengtgh från superklassen in till konstruktorn
        super(name, length);
    }

    // metoden giveLiquid är ett exempel på runtime polymorfism eftersom att den ser olika ut beroend på vilken klass
    //den skapas upp i.
    @Override
    public void lastMessage() {
        JOptionPane.showMessageDialog(null,"Kaktusen " + getName()
                + " behöver " + amountOfLiquid() + "cl" + GreenestEnum.MINERAL_WATER.getLiquidType()  + " per dag.");
    }

    @Override
    public double amountOfLiquid() {
        return GreenestEnum.FOR_CACTUS.getLiquidAmount();
    }
}
