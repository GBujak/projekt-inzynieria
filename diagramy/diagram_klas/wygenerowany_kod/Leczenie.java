/*
* This code has been generated by the Rebel: a code generator for modern Java.
*
* Drop us a line or two at feedback@archetypesoftware.com: we would love to hear from you!
*/
package Model1;

import java.util.*;
import java.time.*;



// ----------- << imports@AAAAAAF13PsfvE0TpKw= >>
// ----------- >>

// ----------- << class.annotations@AAAAAAF13PsfvE0TpKw= >>
// ----------- >>
public class Leczenie {
    // ----------- << attribute.annotations@AAAAAAF13PtAUU7FwuM= >>
    // ----------- >>
    private Pielegniarka ;

    public Pielegniarka get() {
        return ;
    }

    public void set(Pielegniarka ) {
        this. = ;
    }

    public void link(Pielegniarka _) {
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

// ----------- << class.extras@AAAAAAF13PsfvE0TpKw= >>
// ----------- >>
}