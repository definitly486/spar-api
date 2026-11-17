package org.xbill.DNS.config;

import java.net.InetSocketAddress;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class eablkybsjg extends zoijcleaow {
    @Override // im.gxszxtbevo
    public void iobyxmoadg() throws InitializationException {
        wflxmlrfwp();
        try {
            Class<?> cls = Class.forName("sun.net.dns.ResolverConfiguration");
            Object objInvoke = cls.getDeclaredMethod("open", null).invoke(null, null);
            Iterator it = ((List) cls.getMethod("nameservers", null).invoke(objInvoke, null)).iterator();
            while (it.hasNext()) {
                lqeggnwhkg(new InetSocketAddress((String) it.next(), 53));
            }
            Iterator it2 = ((List) cls.getMethod("searchlist", null).invoke(objInvoke, null)).iterator();
            while (it2.hasNext()) {
                nufgyqmvbu((String) it2.next());
            }
        } catch (Exception e13) {
            throw new InitializationException(e13);
        }
    }

    @Override // im.gxszxtbevo
    public boolean isEnabled() {
        return Boolean.getBoolean("dnsjava.configprovider.sunjvm.enabled");
    }
}
