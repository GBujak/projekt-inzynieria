/*
* This code has been generated by the Rebel: a code generator for modern Java.
*
* Drop us a line or two at feedback@archetypesoftware.com: we would love to hear from you!
*/
package Model1;

import java.util.*;
import java.time.*;



// ----------- << imports@AAAAAAF1vnam6Fsj5Zw= >>
// ----------- >>

// ----------- << class.annotations@AAAAAAF1vnam6Fsj5Zw= >>
// ----------- >>
public class Klasa {
    // ----------- << attribute.annotations@AAAAAAF1vndF0VzZOkY= >>
    // ----------- >>
    private String Nazwa;

    // ----------- << attribute.annotations@AAAAAAF1vneGO112ir4= >>
    // ----------- >>
    private Byte RozmiarGrupy;

    // ----------- << attribute.annotations@AAAAAAF1vnbOpFwQIH8= >>
    // ----------- >>
    private Uczeń ;

    // ----------- << attribute.annotations@AAAAAAF13Q02WJVICuc= >>
    // ----------- >>
    private Przedmiot ;

    // ----------- << attribute.annotations@AAAAAAF1vnPtvVfPRao= >>
    // ----------- >>
    private Nauczyciel ;

    // ----------- << attribute.annotations@AAAAAAF13ScITzwrmSk= >>
    // ----------- >>
    private Zajecie ;

    private String getNazwa() {
        return Nazwa;
    }

    private Byte getRozmiarGrupy() {
        return RozmiarGrupy;
    }

    public Uczeń get() {
        return ;
    }

    public Przedmiot get() {
        return ;
    }

    public Nauczyciel get() {
        return ;
    }

    public Zajecie get() {
        return ;
    }

    private void setNazwa(String Nazwa) {
        this.Nazwa = Nazwa;
    }

    private void setRozmiarGrupy(Byte RozmiarGrupy) {
        this.RozmiarGrupy = RozmiarGrupy;
    }

    public void set(Uczeń ) {
        this. = ;
    }

    public void set(Przedmiot ) {
        this. = ;
    }

    public void set(Nauczyciel ) {
        this. = ;
    }

    public void set(Zajecie ) {
        this. = ;
    }

    public void link(Uczeń _) {
        if (_ != null) {
            _.unlink();
            _.set(this);
        }

        unlink();
        set(_);
    }

    public void link(Przedmiot _) {
        if (_ != null) {
            _.unlink();
            _.set(this);
        }

        unlink();
        set(_);
    }

    public void link(Nauczyciel _) {
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

    // ----------- << method.annotations@AAAAAAF1vngiIV5ex54= >>
    // ----------- >>
    public void dodajUcznia() {
    // ----------- << method.body@AAAAAAF1vngiIV5ex54= >>
    // ----------- >>
    }
    // ----------- << method.annotations@AAAAAAF1vnhhhF77jbQ= >>
    // ----------- >>
    public void usunUcznia() {
    // ----------- << method.body@AAAAAAF1vnhhhF77jbQ= >>
    // ----------- >>
    }
    // ----------- << method.annotations@AAAAAAF1vnisiF/FO5Q= >>
    // ----------- >>
    public void usunGrupe() {
    // ----------- << method.body@AAAAAAF1vnisiF/FO5Q= >>
    // ----------- >>
    }
// ----------- << class.extras@AAAAAAF1vnam6Fsj5Zw= >>
// ----------- >>
}