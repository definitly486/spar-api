package org.xbill.DNS.config;

import java.net.InetSocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Hashtable;
import java.util.List;
import java.util.StringTokenizer;
import javax.naming.NamingException;
import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;

/* JADX INFO: loaded from: classes3.dex */
public class wkgbmnqykc implements im.gxszxtbevo {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final am.iobyxmoadg f74279zoijcleaow = am.zoijcleaow.dxjokdxxww(wkgbmnqykc.class);

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private zoijcleaow f74280iobyxmoadg;

    private static final class zoijcleaow extends org.xbill.DNS.config.zoijcleaow {

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private static final am.iobyxmoadg f74281gxszxtbevo;

        static {
            am.iobyxmoadg iobyxmoadgVarDxjokdxxww = am.zoijcleaow.dxjokdxxww(zoijcleaow.class);
            f74281gxszxtbevo = iobyxmoadgVarDxjokdxxww;
            iobyxmoadgVarDxjokdxxww.yggfygwlhe("JNDI class: {}", DirContext.class.getName());
        }

        private zoijcleaow() {
        }

        @Override // im.gxszxtbevo
        public void iobyxmoadg() {
            String str;
            wflxmlrfwp();
            Hashtable hashtable = new Hashtable();
            hashtable.put("java.naming.factory.initial", "com.sun.jndi.dns.DnsContextFactory");
            hashtable.put("java.naming.provider.url", "dns://");
            String str2 = null;
            try {
                InitialDirContext initialDirContext = new InitialDirContext(hashtable);
                str = (String) initialDirContext.getEnvironment().get("java.naming.provider.url");
                try {
                    initialDirContext.close();
                } catch (NamingException unused) {
                    str2 = str;
                    str = str2;
                }
            } catch (NamingException unused2) {
            }
            if (str != null) {
                StringTokenizer stringTokenizer = new StringTokenizer(str, " ");
                while (stringTokenizer.hasMoreTokens()) {
                    String strNextToken = stringTokenizer.nextToken();
                    try {
                        URI uri = new URI(strNextToken);
                        String host = uri.getHost();
                        if (host != null && !host.isEmpty()) {
                            int port = uri.getPort();
                            if (port == -1) {
                                port = 53;
                            }
                            lqeggnwhkg(new InetSocketAddress(host, port));
                        }
                    } catch (URISyntaxException e13) {
                        f74281gxszxtbevo.lqeggnwhkg("Could not parse {} as a dns server, ignoring", strNextToken, e13);
                    }
                }
            }
        }
    }

    public wkgbmnqykc() {
        if (System.getProperty("java.vendor").contains("Android")) {
            return;
        }
        try {
            this.f74280iobyxmoadg = new zoijcleaow();
        } catch (NoClassDefFoundError unused) {
            f74279zoijcleaow.wkgbmnqykc("JNDI DNS not available");
        }
    }

    @Override // im.gxszxtbevo
    public void iobyxmoadg() {
        this.f74280iobyxmoadg.iobyxmoadg();
    }

    @Override // im.gxszxtbevo
    public boolean isEnabled() {
        return this.f74280iobyxmoadg != null;
    }

    @Override // im.gxszxtbevo
    public List wkgbmnqykc() {
        return this.f74280iobyxmoadg.wkgbmnqykc();
    }

    @Override // im.gxszxtbevo
    public List zoijcleaow() {
        return this.f74280iobyxmoadg.zoijcleaow();
    }
}
