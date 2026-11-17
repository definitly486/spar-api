package im;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.net.InetSocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.StringTokenizer;

/* JADX INFO: loaded from: classes3.dex */
public class wkgbmnqykc extends org.xbill.DNS.config.zoijcleaow {

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private int f44970gxszxtbevo;

    protected void agtfadlqog(String str, String str2, String str3) {
        wflxmlrfwp();
        String property = System.getProperty(str);
        if (property != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(property, StringUtils.COMMA);
            while (stringTokenizer.hasMoreTokens()) {
                String strNextToken = stringTokenizer.nextToken();
                try {
                    URI uri = new URI("dns://" + strNextToken);
                    int i13 = 53;
                    if (uri.getHost() == null) {
                        lqeggnwhkg(new InetSocketAddress(strNextToken, 53));
                    } else {
                        int port = uri.getPort();
                        if (port != -1) {
                            i13 = port;
                        }
                        lqeggnwhkg(new InetSocketAddress(uri.getHost(), i13));
                    }
                } catch (URISyntaxException unused) {
                    this.f74286zoijcleaow.kcexrzcfyt("Ignored invalid server {}", strNextToken);
                }
            }
        }
        draadjrbmk(System.getProperty(str2), StringUtils.COMMA);
        this.f44970gxszxtbevo = gtknphoqwx(System.getProperty(str3));
    }

    @Override // im.gxszxtbevo
    public void iobyxmoadg() {
        agtfadlqog("dns.server", "dns.search", "dns.ndots");
    }

    @Override // im.gxszxtbevo
    public int ppxfxbqfkf() {
        return this.f44970gxszxtbevo;
    }
}
