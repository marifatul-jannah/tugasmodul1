/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mac;

import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

/**
 *
 * @author Thole
 */
public class Mac {
    public static void main(String[] args) throws SocketException {
        System.out.println("MAC Address yang di temukan : ");
        //mendapatkan address mac
        Enumeration<NetworkInterface> networks = NetworkInterface.getNetworkInterfaces();
        NetworkInterface inter;
        while (networks.hasMoreElements()) {
            inter = networks.nextElement();
            byte[] mac = inter.getHardwareAddress();
            if (mac != null) {
                for (int i = 0; i < mac.length; i++) {
                    System.out.format("%02X%s", mac[i], (i < mac.length - 1) ? "-" : "");
                }
                System.out.println("");
            }
        }
    }
}
