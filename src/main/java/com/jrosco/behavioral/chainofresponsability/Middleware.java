package com.jrosco.behavioral.chainofresponsability;

import java.util.Arrays;

public abstract class Middleware {
    private Middleware next;

    /*
     * Builds chains of middleware objects
     */
    public static Middleware link(Middleware first, Middleware... chain) {
        var head = first;
        for (Middleware nextInChain : chain) {
            head.next = nextInChain;
            head = nextInChain;
        }
        return first;
    }

    /**
     * Subsclasses will implement this method with concrete checks
     */
    public abstract boolean check(String email, String password);

    /**
     * Runs check on the next object in chain or ends traversing if we are in last object of the chain
     */

    protected boolean checkNext(String email, String password) {
        if (next == null) {
            return true;
        }
        return next.check(email, password);
    }


}
