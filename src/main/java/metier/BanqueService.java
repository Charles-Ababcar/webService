/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metier;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import serviceWeb.Compte;

/**
 *
 * @author DELL
 */
@WebService(serviceName="BanqueWS")
public class BanqueService {
    @WebMethod(operationName="ConversionCFAtoEuro")
	public double conversion(@WebParam(name="montant")double mt){
	return mt*655;
	}
	@WebMethod()
	public Compte getCompte(long cpt){
	return new Compte(cpt,Math.random(),new Date());
	}
	@WebMethod()
	public List<Compte> getComptes(){
	List<Compte> cptes=new ArrayList<Compte>();
	cptes.add(new Compte(1,10000));
	cptes.add(new Compte(2,4000));
	return cptes;
	}
}
