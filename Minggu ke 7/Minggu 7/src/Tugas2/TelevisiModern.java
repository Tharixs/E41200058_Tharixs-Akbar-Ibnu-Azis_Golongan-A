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
public class TelevisiModern extends Televisi{
    
    static String TELETEXT = "Teletext";
    static String TV = "Televisi";
    private String cd = "";
    
    public TelevisiModern(String model, int i) {
        super(model, i);
    }
    @Override
    public String getDeskripsi() {
        return super.getDeskripsi(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void getChannels() {
        super.getChannels(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setChannels(String[] semuaChannel) {
        super.setChannels(semuaChannel); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setChannelAktif(int aktif) {
        super.setChannelAktif(aktif); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setVolume(int vol) {
        super.setVolume(vol); //To change body of generated methods, choose Tools | Templates.
    }
    public void setModusTampilan(String display){
        TelevisiModern.TELETEXT = display;
    }
    public void getModusTampilan() {
        System.out.println("Modus Tampilan : "+TELETEXT);
    }

    void setHalamanTeletext(int page) {
        System.out.println("Berpindah ke halaman Teletext : "+page);
    }

    void setDiscTray(String cd) {
        this.cd = cd;
    }
     void playCD() {
        if(cd == ""){
            System.out.println("Tidak ada cd didalam disk tray!");
        }else{
            System.out.println("Memutar film "+cd);
        }
    }

    
}
