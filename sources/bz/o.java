package bz;

import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes2.dex */
class o extends metgxyhuhe {
    o() {
        super(kc2.lqeggnwhkg.LocalIPv6);
    }

    private static String yadqdtsiqt(String str) {
        try {
            if (str.isEmpty() || !str.contains("%")) {
                return "";
            }
            str = str.substring(0, str.indexOf(37));
            return str;
        } catch (Error unused) {
            return str;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // bz.metgxyhuhe
    /* JADX INFO: renamed from: cdpycssgdh, reason: merged with bridge method [inline-methods] */
    public String lereixgezr() throws u4 {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
                while (inetAddresses.hasMoreElements()) {
                    InetAddress inetAddressNextElement = inetAddresses.nextElement();
                    if ((inetAddressNextElement instanceof Inet6Address) && !inetAddressNextElement.isLoopbackAddress()) {
                        String hostAddress = inetAddressNextElement.getHostAddress();
                        return hostAddress != null ? yadqdtsiqt(hostAddress) : "";
                    }
                }
            }
            throw new u4("Uncaught exception");
        } catch (SocketException e13) {
            throw new u4(e13.getMessage(), e13);
        }
    }
}
