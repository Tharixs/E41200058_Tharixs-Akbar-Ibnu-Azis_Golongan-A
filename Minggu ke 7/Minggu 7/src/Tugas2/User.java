/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas2;

/**
 *
 * @author Tharixs Akbar Ibnu A
 */
public class User {

    public static void main(String[] args) {
//        Televisi tv = new Televisi("Tv Tempoe Doeloe, 14 inches ", 10);
//        String[] semuaChannel = {"RCTI", "SCTV", "INDOSIAR", "NET", "METRO TV",
//            "TRANS TV", "TRANS 7", "MNC TV", "G TV",
//            "ANTV","RRI"
//        };
//        String[] channelFavorit = {"RCTI", "SCTV", "INDOSIAR", "NET", "METRO TV"};
//        System.out.println("Saya membeli Televisi : " + tv.getDeskripsi()+" Channels");      
//        tv.getChannels();
//        tv.setChannels(semuaChannel);
//        tv.setChannels(channelFavorit);        
//        tv.setChannelAktif(5);
//        tv.setVolume(50);
//        tv.setChannelAktif(10);
//        tv.setChannelAktif(1);
        
        
//        Televisi modern
        TelevisiModern tv = new TelevisiModern("Tv modern, 24 inches ", 100);
        String[] semuaChannel = {"RCTI", "SCTV", "INDOSIAR", "NET", "METRO TV",
            "TRANS TV", "TRANS 7", "MNC TV", "G TV",
            "ANTV"
        };
        String[] channelFavorit = {"G TV", "TRANS TV", "TRANS 7", "NET"};
        System.out.println("Saya membeli Televisi : " + tv.getDeskripsi() + " Channels");
        tv.getChannels();
        tv.setChannels(semuaChannel);

        tv.setChannelAktif(3);
        tv.setVolume(50);
        tv.setChannelAktif(10);
        tv.setChannelAktif(1);
        tv.setModusTampilan(TelevisiModern.TELETEXT);
        tv.setHalamanTeletext(250);
        tv.setModusTampilan(TelevisiModern.TV);
        tv.playCD();
        tv.setDiscTray("ANd GAME");
        tv.playCD();

    }
}
