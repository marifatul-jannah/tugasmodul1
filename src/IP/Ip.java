/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 *
 * @author Thole
 */
public class Ip {

    public static void cek(String command) throws UnknownHostException {
        try {
            //proses pengecekan
            Process p = Runtime.getRuntime().exec(command);
            BufferedReader inputStream = new BufferedReader(
            new InputStreamReader(p.getInputStream()));
            String s = "";
            while ((s = inputStream.readLine()) != null) {
            System.out.println(s);
            }
	} catch (Exception e) {
            e.printStackTrace();
	}
    }

    public static void main(String[] args) throws IOException {
        //memanggil/mendapatkan ip address dan host
        String ipaddress = InetAddress.getLocalHost().getHostAddress();
        String hostname = InetAddress.getLocalHost().getHostName();
        //menampilkan ip dan host yang telah di panggil
        System.out.println("Hostname komputer ini adalah : "+ hostname);
        System.out.println("IP Address komputer ini adalah : "+ ipaddress);
        System.out.println("Masukan IP Address : ");
        //membaca apa yang di masukan
        InputStream input = System.in;
        InputStreamReader reader = new InputStreamReader(input);
        BufferedReader bufReader = new BufferedReader(reader);
        String ip = bufReader.readLine();
        cek("ping " + ip);
    }
    
}
