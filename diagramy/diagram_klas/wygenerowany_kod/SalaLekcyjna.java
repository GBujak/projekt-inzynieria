/*
* This code has been generated by the Rebel: a code generator for modern Java.
*
* Drop us a line or two at feedback@archetypesoftware.com: we would love to hear from you!
*/
package Model1;

import java.util.*;
import java.time.*;



// ----------- << imports@AAAAAAF13PPbOwvh2Ao= >>
// ----------- >>

// ----------- << class.annotations@AAAAAAF13PPbOwvh2Ao= >>
// ----------- >>
public class SalaLekcyjna {
    // ----------- << attribute.annotations@AAAAAAF13PQ2yAytZUw= >>
    // ----------- >>
    private Integer iloscMiejsc;

    // ----------- << attribute.annotations@AAAAAAF13PSEvw2M2k8= >>
    // ----------- >>
    private String nazwa;

    // ----------- << attribute.annotations@AAAAAAF13PS57w5r+qk= >>
    // ----------- >>
    private Date ostatioSprzatana;

    // ----------- << attribute.annotations@AAAAAAF13Pb7ySkFrZU= >>
    // ----------- >>
    private Wozny ;

    // ----------- << attribute.annotations@AAAAAAF13SdNTEVdDvU= >>
    // ----------- >>
    private Zajecie ;

    public Integer getIloscMiejsc() {
        return iloscMiejsc;
    }

    public String getNazwa() {
        return nazwa;
    }

    public Date getOstatioSprzatana() {
        return ostatioSprzatana;
    }

    public Wozny get() {
        return ;
    }

    public Zajecie get() {
        return ;
    }

    public void setIloscMiejsc(Integer iloscMiejsc) {
        this.iloscMiejsc = iloscMiejsc;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public void setOstatioSprzatana(Date ostatioSprzatana) {
        this.ostatioSprzatana = ostatioSprzatana;
    }

    public void set(Wozny ) {
        this. = ;
    }

    public void set(Zajecie ) {
        this. = ;
    }

    public void link(Wozny _) {
        if (_ != null) {
            _.unlink();
            _.set(this);
        }

        unlink();
        set(_);
    }

    public void link(Zajecie _) {
        if (_ != null) {
            _.unlink();
            _.set(this);
        }

        unlink();
        set(_);
    }

    public void unlink() {
        if (get() != null) {
            get().set(null);
            set(null);
        }
    }

    public void unlink() {
        if (get() != null) {
            get().set(null);
            set(null);
        }
    }

// ----------- << class.extras@AAAAAAF13PPbOwvh2Ao= >>
// ----------- >>
}