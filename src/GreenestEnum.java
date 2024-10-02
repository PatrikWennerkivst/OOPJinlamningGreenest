public enum GreenestEnum {

    FOR_PALMS(0.5),
    MEAT_EATING_PLANTS_BASE(0.1),
    MEAT_EATING_PLANTS_PER_M(0.2),
    FOR_CACTUS(2),

    TAP_WATER(" kranvatten"),
    PROTIENSHAKE(" protienshake"),
    MINERAL_WATER(" mineralvatten");

    //Här har jag satt variablerna som private för att kapsla in dem.
    //Detta har jag gjort för att "skydda" dem från att kunna bli ändrade i
    //andra klasser
    private double liquidAmount;

    //Här har jag satt variablerna som private för att kapsla in dem.
    //Detta har jag gjort för att "skydda" dem från att kunna bli ändrade i
    //andra klasser
    private String liquidType;

    GreenestEnum(double liquidAmount) {
        this.liquidAmount = liquidAmount;
    }

    GreenestEnum(String liquidType) {
        this.liquidType = liquidType;
    }

    public double getLiquidAmount() {
        return liquidAmount;
    }

    public String getLiquidType() {
        return liquidType;
    }
}
