/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session05.signature;

import java.security.Provider;
import java.security.Provider.Service;
import java.security.Security;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author ChuTuanLuyen
 */
public class ProviderShow {

    public static void main(String[] args) {
        Provider[] providers = Security.getProviders();
        for (int i = 0; i < providers.length; i++) {
            Provider provider = providers[i];
            System.out.println("------------------------");
            System.out.println(provider);
            String info = provider.getInfo();
            System.out.println(info);
            Set<Service> services = provider.getServices();
            for (Iterator<Service> it = services.iterator(); it.hasNext();) {
                Service service = it.next();
                System.out.println("Algo: " + service);
            }

        }
    }
}
