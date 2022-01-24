package ma.cigma.pfe.service;


import ma.cigma.pfe.dao.IClientDao;


import ma.cigma.pfe.models.Client;


public class ClientServiceImpl implements IclientService{


    IClientDao dao;




    public void setDao(IClientDao dao) {
        this.dao = dao;
    }



    public ClientServiceImpl() {
        System.out.println("constrtr de la classe clientserviceimpl");
    }



    @Override
    public boolean save(Client c) {
        System.out.println("service");

        return dao.save(c);
    }

}
