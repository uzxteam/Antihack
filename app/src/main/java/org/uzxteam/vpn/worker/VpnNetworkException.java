package org.uzxteam.vpn.worker;

public class VpnNetworkException extends Exception {
    public VpnNetworkException(String s) {
        super(s);
    }

    public VpnNetworkException(String s, Throwable t) {
        super(s, t);
    }

}
