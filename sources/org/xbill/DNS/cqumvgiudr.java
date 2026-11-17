package org.xbill.DNS;

import kotlin.KotlinVersion;

/* JADX INFO: loaded from: classes3.dex */
public abstract class cqumvgiudr {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final oipsdeybqn f74287iobyxmoadg;

    static {
        oipsdeybqn oipsdeybqnVar = new oipsdeybqn("DNSSEC Digest Algorithm", 2);
        f74287iobyxmoadg = oipsdeybqnVar;
        oipsdeybqnVar.gxszxtbevo(KotlinVersion.MAX_COMPONENT_VALUE);
        oipsdeybqnVar.lqeggnwhkg(true);
        oipsdeybqnVar.iobyxmoadg(1, "SHA-1");
        oipsdeybqnVar.iobyxmoadg(2, "SHA-256");
        oipsdeybqnVar.iobyxmoadg(3, "GOST R 34.11-94");
        oipsdeybqnVar.iobyxmoadg(4, "SHA-384");
    }

    public static String iobyxmoadg(int i13) {
        return f74287iobyxmoadg.wkgbmnqykc(i13);
    }
}
