/*
* This code has been generated by the Rebel: a code generator for modern Java.
*
* Drop us a line or two at feedback@archetypesoftware.com: we would love to hear from you!
*/
package Model1;

import java.util.*;
import java.time.*;



// ----------- << imports@AAAAAAF13RbvVNLZpIE= >>
// ----------- >>

// ----------- << class.annotations@AAAAAAF13RbvVNLZpIE= >>
// ----------- >>
public class PlanZajec {
    // ----------- << attribute.annotations@AAAAAAF13SRsBhLUn/U= >>
    // ----------- >>
    private Planista ;

    // ----------- << attribute.annotations@AAAAAAF13SR1OBPaVbU= >>
    // ----------- >>
    private Dyrektor ;

    // ----------- << attribute.annotations@AAAAAAF13SXRyB78L2w= >>
    // ----------- >>
    private Zajecie ;

    public Planista get() {
        return ;
    }

    public Dyrektor get() {
        return ;
    }

    public Zajecie get() {
        return ;
    }

    public void set(Planista ) {
        this. = ;
    }

    public void set(Dyrektor ) {
        this. = ;
    }

    public void set(Zajecie ) {
        this. = ;
    }

    public void link(Planista _) {
        if (_ != null) {
            _.unlink();
            _.set(this);
        }

        unlink();
        set(_);
    }

    public void link(Dyrektor _) {
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

    // ----------- << method.annotations@AAAAAAF13SNAogSkdMs= >>
    // ----------- >>
    public void zatwierdz() {
    // ----------- << method.body@AAAAAAF13SNAogSkdMs= >>
    // ----------- >>
    }
// ----------- << class.extras@AAAAAAF13RbvVNLZpIE= >>
// ----------- >>
}