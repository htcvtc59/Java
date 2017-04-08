/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package session03.security.platform;

/**
 *
 * @author ChuTuanLuyen
 */
public class CustomPropertyInArgument {
    public static void main(String[] args) {
        System.out.println("Run program as java -DprocName <..ClassName..>");
        String procName = System.getProperty("procName");
        System.out.println("Proc: " + procName);
    }
}
