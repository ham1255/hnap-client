/*
 * James Buncle 2017
 */
package uk.co.jbuncle.hnapclient.interfaces;

/**
 *
 * @author James Buncle <jbuncle@hotmail.com>
 */
public interface HnapSessionI {

    String getAuth(final String soapAction);

    String getCookie();

    String getLoginPassword();
    
}
