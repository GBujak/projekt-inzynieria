/*
* This code has been generated by the Rebel: a code generator for modern Java.
*
* Drop us a line or two at feedback@archetypesoftware.com: we would love to hear from you!
*/
package Model1;

import java.util.*;
import java.time.*;



// ----------- << imports@AAAAAAF13PqtwUKYei0= >>
// ----------- >>

// ----------- << class.annotations@AAAAAAF13PqtwUKYei0= >>
// ----------- >>
public class Pielegniarka extends Uzytkownik {
    // ----------- << attribute.annotations@AAAAAAF13PtAUU7GV1c= >>
    // ----------- >>
    private Leczenie ;

    public Leczenie get() {
        return ;
    }

    public void set(Leczenie ) {
        this. = ;
    }

    public void link(Leczenie _) {
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

// ----------- << class.extras@AAAAAAF13PqtwUKYei0= >>
// ----------- >>
}