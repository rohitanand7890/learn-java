package abstractclass;

abstract class House{
    abstract public void windows();
    abstract public void doors();
    abstract public void toilets();
    public void elctricConnection(){
        System.out.println("electricity is present");
    }
}
class MasterBedroon extends House{
    @Override
    public void windows() {
        System.out.println("2 windows");
    }

    @Override
    public void doors() {
        System.out.println("3 doors");
    }

    @Override
    public void toilets() {
        System.out.println("1 toilet");
    }
    public void balcony(){
        System.out.println("1 balcony");
    }
}
class Guestroon extends House{
    @Override
    public void windows() {
        System.out.println("1 window ");
    }

    @Override
    public void doors() {
        System.out.println("1 door");
    }

    @Override
    public void toilets() {
        System.out.println("1 toilet");
    }
}
public class Mainclass {
    public static void main(String[] args) {
        House h1;
        h1= new Guestroon();
        h1.toilets();

        h1= new MasterBedroon();
        ((MasterBedroon) h1).balcony();
    }
}
