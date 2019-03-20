public class PoorBuilder implements IBuilder {

    @Override
    public void buildRoof() {
        System.out.print("        .        \n" +
                "       / \\       \n" +
                "      /   \\     \n");
    }

    @Override
    public void buildFloor() {
        System.out.print("     -----     \n" +
                "     |   |     \n" +
                "     -----     \n");
    }

    @Override
    public void buildGrass() {
        System.out.print("////////");
    }

    @Override
    public void buildStatue() {
        System.out.print("@");
    }

    @Override
    public void buildBasement() {
        System.out.print("\n     --------     \n" +
                "     | oops  |     \n" +
                "     --------     \n");
    }
}
