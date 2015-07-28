package CityTransport; /**
 * Created by user on 22.07.2015.
 */

class CityTransport extends Transport {
    private static int id=1;
    protected  int idRegNumber=1;
    protected int[] cords;

    @Override
    void move(int x,int y) {
        System.out.println("I'm CityTransport!" +
                "I drive through the city to "+x+" "+y);
    }

    @Override
    void stop() {
        System.out.println("I stand");
    }

    @Override
    public String governmentNumber() {
        return "State ID: " + idRegNumber ;
    }
   private void setIdRegNumber() {
        id=idRegNumber;
        idRegNumber++;
    }

    public CityTransport() {
        super(id);
        cords= new int[]{0, 0};
    }
}
