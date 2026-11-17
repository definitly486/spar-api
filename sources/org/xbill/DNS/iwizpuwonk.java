package org.xbill.DNS;

import kotlin.KotlinVersion;

/* JADX INFO: loaded from: classes3.dex */
public abstract class iwizpuwonk {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final oipsdeybqn f74398iobyxmoadg;

    static {
        oipsdeybqn oipsdeybqnVar = new oipsdeybqn("DNSSEC algorithm", 2);
        f74398iobyxmoadg = oipsdeybqnVar;
        oipsdeybqnVar.gxszxtbevo(KotlinVersion.MAX_COMPONENT_VALUE);
        oipsdeybqnVar.lqeggnwhkg(true);
        oipsdeybqnVar.iobyxmoadg(0, "DELETE");
        oipsdeybqnVar.iobyxmoadg(1, "RSAMD5");
        oipsdeybqnVar.iobyxmoadg(2, "DH");
        oipsdeybqnVar.iobyxmoadg(3, "DSA");
        oipsdeybqnVar.iobyxmoadg(5, "RSASHA1");
        oipsdeybqnVar.iobyxmoadg(6, "DSA-NSEC3-SHA1");
        oipsdeybqnVar.iobyxmoadg(7, "RSA-NSEC3-SHA1");
        oipsdeybqnVar.iobyxmoadg(8, "RSASHA256");
        oipsdeybqnVar.iobyxmoadg(10, "RSASHA512");
        oipsdeybqnVar.iobyxmoadg(12, "ECC-GOST");
        oipsdeybqnVar.iobyxmoadg(13, "ECDSAP256SHA256");
        oipsdeybqnVar.iobyxmoadg(14, "ECDSAP384SHA384");
        oipsdeybqnVar.iobyxmoadg(15, "ED25519");
        oipsdeybqnVar.iobyxmoadg(16, "ED448");
        oipsdeybqnVar.iobyxmoadg(252, "INDIRECT");
        oipsdeybqnVar.iobyxmoadg(253, "PRIVATEDNS");
        oipsdeybqnVar.iobyxmoadg(254, "PRIVATEOID");
    }

    public static String iobyxmoadg(int i13) {
        return f74398iobyxmoadg.wkgbmnqykc(i13);
    }
}
