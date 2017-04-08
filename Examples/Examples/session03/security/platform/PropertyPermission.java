/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session03.security.platform;

/**
 *
 * @author ChuTuanLuyen
 */
public class PropertyPermission {

    public static void main(String[] args) {
        System.setProperty("java.security.policy", "C:/Users/ChuTuanLuyen/Documents/NetBeansProjects/C1108G_SJava/src/session03/security/platform/writeFile.policy");
        System.out.println(SecurityManager.class);
        System.setSecurityManager(new SecurityManager());
        String home = System.getProperty("user.home");
        System.out.println("UserHome: " + home);
        String path = System.getProperty("java.library.path");
        System.out.println("Path: " + path);
    }
}
