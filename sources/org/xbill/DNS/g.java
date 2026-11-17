package org.xbill.DNS;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.List;
import org.xbill.DNS.config.InitializationException;

/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private static g f74363eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private static List f74364gxszxtbevo;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final am.iobyxmoadg f74365wkgbmnqykc = am.zoijcleaow.dxjokdxxww(g.class);

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private int f74367ppxfxbqfkf;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final List f74366iobyxmoadg = new ArrayList(2);

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final List f74368zoijcleaow = new ArrayList(0);

    public g() {
        this.f74367ppxfxbqfkf = 1;
        synchronized (g.class) {
            try {
                if (f74364gxszxtbevo == null) {
                    f74364gxszxtbevo = new ArrayList(8);
                    if (!Boolean.getBoolean("dnsjava.configprovider.skipinit")) {
                        f74364gxszxtbevo.add(new im.wkgbmnqykc());
                        f74364gxszxtbevo.add(new im.eablkybsjg());
                        f74364gxszxtbevo.add(new org.xbill.DNS.config.gxszxtbevo());
                        f74364gxszxtbevo.add(new org.xbill.DNS.config.iobyxmoadg());
                        f74364gxszxtbevo.add(new org.xbill.DNS.config.wkgbmnqykc());
                        f74364gxszxtbevo.add(new org.xbill.DNS.config.eablkybsjg());
                        f74364gxszxtbevo.add(new im.ppxfxbqfkf());
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        for (im.gxszxtbevo gxszxtbevoVar : f74364gxszxtbevo) {
            if (gxszxtbevoVar.isEnabled()) {
                try {
                    gxszxtbevoVar.iobyxmoadg();
                    if (this.f74366iobyxmoadg.isEmpty()) {
                        this.f74366iobyxmoadg.addAll(gxszxtbevoVar.zoijcleaow());
                    }
                    if (this.f74368zoijcleaow.isEmpty()) {
                        List listWkgbmnqykc = gxszxtbevoVar.wkgbmnqykc();
                        if (!listWkgbmnqykc.isEmpty()) {
                            this.f74368zoijcleaow.addAll(listWkgbmnqykc);
                            this.f74367ppxfxbqfkf = gxszxtbevoVar.ppxfxbqfkf();
                        }
                    }
                    if (!this.f74366iobyxmoadg.isEmpty() && !this.f74368zoijcleaow.isEmpty()) {
                        return;
                    }
                } catch (InitializationException e13) {
                    f74365wkgbmnqykc.ojitshcjhn("Failed to initialize provider", e13);
                }
            }
        }
        if (this.f74366iobyxmoadg.isEmpty()) {
            this.f74366iobyxmoadg.add(new InetSocketAddress(InetAddress.getLoopbackAddress(), 53));
        }
    }

    private static void iobyxmoadg() {
        if (f74363eablkybsjg == null || f74364gxszxtbevo == null) {
            wkgbmnqykc();
        }
    }

    public static void wkgbmnqykc() {
        g gVar = new g();
        synchronized (g.class) {
            f74363eablkybsjg = gVar;
        }
    }

    public static synchronized g zoijcleaow() {
        iobyxmoadg();
        return f74363eablkybsjg;
    }

    public List eablkybsjg() {
        return this.f74368zoijcleaow;
    }

    public InetSocketAddress gxszxtbevo() {
        return (InetSocketAddress) this.f74366iobyxmoadg.get(0);
    }

    public List lqeggnwhkg() {
        return this.f74366iobyxmoadg;
    }

    public int ppxfxbqfkf() {
        return this.f74367ppxfxbqfkf;
    }
}
