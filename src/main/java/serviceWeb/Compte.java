/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serviceWeb;

import java.util.Date;

/**
 *
 * @author DELL
 */
public class Compte {
    private long numro; 
	public long numero;
	public double solde;
	public Date datecreation;
	public Compte(long n,double s,Date d) {
            numero=n;
            solde=s;
            datecreation=d;
	}
	public Compte(long n,double s) {
            numero=n;
            solde=s;
            datecreation=new Date();
	}
        
       public Long getNumero(){
            return this.numero;
}
}
