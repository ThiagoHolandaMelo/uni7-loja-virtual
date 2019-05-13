package br.com.tutorial;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class SessionBean
 */
@Stateless
@LocalBean
public class SessionBean {

    public String MetodoSessionBean() {
    	return "Metodo em execução...";
    }

}
