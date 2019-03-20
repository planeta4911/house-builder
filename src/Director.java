public class Director {

    public void buildPoorHouse(IBuilder house){
        house.buildRoof();
        house.buildFloor();
        house.buildGrass();
        house.buildGrass();
        house.buildBasement();
    }

    public void buildRichHouse(IBuilder house){
        house.buildRoof();
        house.buildFloor();
        house.buildFloor();
        house.buildGrass();
        house.buildStatue();
        house.buildStatue();
        house.buildGrass();
        house.buildBasement();
    }
}
