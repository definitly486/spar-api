package org.xbill.DNS.config;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class iobyxmoadg extends zoijcleaow {

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private static final am.iobyxmoadg f74276gxszxtbevo = am.zoijcleaow.dxjokdxxww(iobyxmoadg.class);

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private static Context f74277lqeggnwhkg = null;

    @Override // im.gxszxtbevo
    public void iobyxmoadg() throws InitializationException {
        LinkProperties linkProperties;
        wflxmlrfwp();
        Context context = f74277lqeggnwhkg;
        if (context == null) {
            throw new InitializationException("Context must be initialized by calling setContext");
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(ConnectivityManager.class);
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (activeNetwork == null || (linkProperties = connectivityManager.getLinkProperties(activeNetwork)) == null) {
            return;
        }
        Iterator<InetAddress> it = linkProperties.getDnsServers().iterator();
        while (it.hasNext()) {
            lqeggnwhkg(new InetSocketAddress(it.next(), 53));
        }
        draadjrbmk(linkProperties.getDomains(), StringUtils.COMMA);
    }

    @Override // im.gxszxtbevo
    public boolean isEnabled() {
        return System.getProperty("java.vendor").contains("Android");
    }
}
