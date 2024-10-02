import javax.swing.*;
//Här har jag använt mig av ett arv eftersom att Palms äver av klassen Greenets
public class Palms extends Greenest {

    public Palms(String name, double length) {
        //Här har jag hämtar variablerna name & lengtgh från superklassen in till konstruktorn
        super(name, length);
    }

    //Metoden giveLiquid är ett exempel på runtime polymorfism eftersom att den ser olika ut beroend på vilken klass
    //den skapas upp i.
    @Override
    public void lastMessage() {
        JOptionPane.showMessageDialog(null,"Palmen " + getName()
                + " behöver " + amountOfLiquid() + "L" + GreenestEnum.TAP_WATER.getLiquidType() + " per dag.");
    }
    //Metoden amountOfLiquid är ett exempel på runtime polymorfism eftersom att den ser olika ut beroend på vilken klass
    //den skapas upp i.
    @Override
    public double amountOfLiquid() {
        double tapWaterPerDay = GreenestEnum.FOR_PALMS.getLiquidAmount() * getLength();
        return tapWaterPerDay;
    }
}
