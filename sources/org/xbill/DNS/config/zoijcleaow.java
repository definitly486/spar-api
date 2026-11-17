package org.xbill.DNS.config;

import java.net.Inet4Address;
import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import org.xbill.DNS.TextParseException;
import org.xbill.DNS.auzgnhcxok;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zoijcleaow implements im.gxszxtbevo {

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final boolean f74283wkgbmnqykc = Boolean.getBoolean("java.net.preferIPv4Stack");

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private static final boolean f74282eablkybsjg = Boolean.getBoolean("java.net.preferIPv6Addresses");

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final List f74284iobyxmoadg = new ArrayList(3);

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    protected final am.iobyxmoadg f74286zoijcleaow = am.zoijcleaow.dxjokdxxww(getClass());

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    protected final List f74285ppxfxbqfkf = new ArrayList(1);

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean btonecajqb(InetSocketAddress inetSocketAddress) {
        return inetSocketAddress.getAddress() instanceof Inet4Address;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int dxjokdxxww(InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2) {
        return Integer.compare(inetSocketAddress2.getAddress().getAddress().length, inetSocketAddress.getAddress().getAddress().length);
    }

    protected void draadjrbmk(String str, String str2) {
        if (str != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(str, str2);
            while (stringTokenizer.hasMoreTokens()) {
                nufgyqmvbu(stringTokenizer.nextToken());
            }
        }
    }

    protected int gtknphoqwx(String str) {
        if (str == null || str.isEmpty()) {
            return 1;
        }
        try {
            int i13 = Integer.parseInt(str);
            if (i13 < 0) {
                return 1;
            }
            if (i13 > 15) {
                return 15;
            }
            return i13;
        } catch (NumberFormatException unused) {
            return 1;
        }
    }

    protected void lqeggnwhkg(InetSocketAddress inetSocketAddress) {
        if (this.f74284iobyxmoadg.contains(inetSocketAddress)) {
            return;
        }
        this.f74284iobyxmoadg.add(inetSocketAddress);
        this.f74286zoijcleaow.yggfygwlhe("Added {} to nameservers", inetSocketAddress);
    }

    protected void nufgyqmvbu(String str) {
        if (str == null || str.isEmpty()) {
            return;
        }
        try {
            auzgnhcxok auzgnhcxokVarKcexrzcfyt = auzgnhcxok.kcexrzcfyt(str, auzgnhcxok.f74233pmvmpeiblj);
            if (this.f74285ppxfxbqfkf.contains(auzgnhcxokVarKcexrzcfyt)) {
                return;
            }
            this.f74285ppxfxbqfkf.add(auzgnhcxokVarKcexrzcfyt);
            this.f74286zoijcleaow.yggfygwlhe("Added {} to search paths", auzgnhcxokVarKcexrzcfyt);
        } catch (TextParseException unused) {
            this.f74286zoijcleaow.kcexrzcfyt("Could not parse search path {} as a dns name, ignoring", str);
        }
    }

    protected final void wflxmlrfwp() {
        this.f74284iobyxmoadg.clear();
        this.f74285ppxfxbqfkf.clear();
    }

    @Override // im.gxszxtbevo
    public final List wkgbmnqykc() {
        return Collections.unmodifiableList(this.f74285ppxfxbqfkf);
    }

    @Override // im.gxszxtbevo
    public final List zoijcleaow() {
        if (f74282eablkybsjg) {
            return (List) this.f74284iobyxmoadg.stream().sorted(new Comparator() { // from class: im.iobyxmoadg
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return org.xbill.DNS.config.zoijcleaow.dxjokdxxww((InetSocketAddress) obj, (InetSocketAddress) obj2);
                }
            }).collect(Collectors.toList());
        }
        return f74283wkgbmnqykc ? (List) this.f74284iobyxmoadg.stream().filter(new Predicate() { // from class: im.zoijcleaow
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return org.xbill.DNS.config.zoijcleaow.btonecajqb((InetSocketAddress) obj);
            }
        }).collect(Collectors.toList()) : Collections.unmodifiableList(this.f74284iobyxmoadg);
    }
}
