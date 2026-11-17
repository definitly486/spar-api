package org.xbill.DNS;

/* JADX INFO: loaded from: classes3.dex */
public abstract class wwaezpbzkn {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final oipsdeybqn f74553iobyxmoadg;

    static {
        oipsdeybqn oipsdeybqnVar = new oipsdeybqn("EDNS Flag", 3);
        f74553iobyxmoadg = oipsdeybqnVar;
        oipsdeybqnVar.gxszxtbevo(65535);
        oipsdeybqnVar.nufgyqmvbu("FLAG");
        oipsdeybqnVar.lqeggnwhkg(true);
        oipsdeybqnVar.iobyxmoadg(32768, "do");
    }

    public static String iobyxmoadg(int i13) {
        return f74553iobyxmoadg.wkgbmnqykc(1 << (15 - i13));
    }
}
