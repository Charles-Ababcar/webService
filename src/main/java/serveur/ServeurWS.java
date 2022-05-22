/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serveur;

import javax.xml.ws.Endpoint;
import metier.BanqueService;

/**
 *
 * @author DELL
 */
public class ServeurWS {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="http://localhost:8181/";
		Endpoint.publish(url, new BanqueService());
		System.out.println(url+"?WSDL");
	}

}
