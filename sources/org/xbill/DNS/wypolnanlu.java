package org.xbill.DNS;

/* JADX INFO: loaded from: classes3.dex */
public abstract class wypolnanlu {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final oipsdeybqn f74554iobyxmoadg;

    static {
        oipsdeybqn oipsdeybqnVar = new oipsdeybqn("DNS Header Flag", 3);
        f74554iobyxmoadg = oipsdeybqnVar;
        oipsdeybqnVar.gxszxtbevo(15);
        oipsdeybqnVar.nufgyqmvbu("FLAG");
        oipsdeybqnVar.lqeggnwhkg(true);
        oipsdeybqnVar.iobyxmoadg(0, "qr");
        oipsdeybqnVar.iobyxmoadg(5, "aa");
        oipsdeybqnVar.iobyxmoadg(6, "tc");
        oipsdeybqnVar.iobyxmoadg(7, "rd");
        oipsdeybqnVar.iobyxmoadg(8, "ra");
        oipsdeybqnVar.iobyxmoadg(10, "ad");
        oipsdeybqnVar.iobyxmoadg(11, "cd");
    }

    public static boolean iobyxmoadg(int i13) {
        f74554iobyxmoadg.ppxfxbqfkf(i13);
        return (i13 < 1 || i13 > 4) && i13 < 12;
    }

    public static String zoijcleaow(int i13) {
        return f74554iobyxmoadg.wkgbmnqykc(i13);
    }
}
