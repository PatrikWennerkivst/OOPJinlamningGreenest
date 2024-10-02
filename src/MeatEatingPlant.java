import javax.swing.*;
//Här har jag använt mig av ett arv eftersom att MeatEatingPlant äver av klassen Greenets
public class MeatEatingPlant extends Greenest {

    public MeatEatingPlant(String name, double length) {
        //Här har jag hämtar variablerna name & lengtgh från superklassen in till konstruktorn
        super(name,length);
    }

    // metoden giveLiquid är ett exempel på runtime polymorfism eftersom att den ser olika ut beroend på vilken klass
    //den skapas upp i.
    @Override
    public void lastMessage() {
        JOptionPane.showMessageDialog(null,"Den köttätande växten " + getName()
                + " behöver " + amountOfLiquid() + "L" + GreenestEnum.PROTIENSHAKE.getLiquidType() + " per dag.");
    }
    @Override
    public double amountOfLiquid() {
        double proteinShakePerDay = GreenestEnum.MEAT_EATING_PLANTS_BASE.getLiquidAmount() +
                (GreenestEnum.MEAT_EATING_PLANTS_PER_M.getLiquidAmount() * getLength());
        return proteinShakePerDay;
    }
}
