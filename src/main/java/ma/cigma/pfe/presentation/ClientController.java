package ma.cigma.pfe.presentation;




import ma.cigma.pfe.models.Client;
import ma.cigma.pfe.service.*;


public class ClientController {

    IclientService service ;

    public IclientService getService() {

        return service;
    }


    public void setservice (IclientService service) {
        System.out.println("appel constrctor de classe client controller");
        this.service=service;

    }

    public ClientController() {

    }


    public boolean save (Client c) {
        System.out.println("presentation");
        service.save(c);
        return service.save(c);

    }

}
