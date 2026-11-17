package org.xbill.DNS;

/* JADX INFO: loaded from: classes3.dex */
public abstract class x {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final oipsdeybqn f74555iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final String[] f74556ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final String[] f74557zoijcleaow;

    static {
        oipsdeybqn oipsdeybqnVar = new oipsdeybqn("Message Section", 3);
        f74555iobyxmoadg = oipsdeybqnVar;
        f74557zoijcleaow = new String[]{"QUESTIONS", "ANSWERS", "AUTHORITY RECORDS", "ADDITIONAL RECORDS"};
        f74556ppxfxbqfkf = new String[]{"ZONE", "PREREQUISITES", "UPDATE RECORDS", "ADDITIONAL RECORDS"};
        oipsdeybqnVar.gxszxtbevo(3);
        oipsdeybqnVar.lqeggnwhkg(true);
        oipsdeybqnVar.iobyxmoadg(0, "qd");
        oipsdeybqnVar.iobyxmoadg(1, "an");
        oipsdeybqnVar.iobyxmoadg(2, "au");
        oipsdeybqnVar.iobyxmoadg(3, "ad");
    }

    public static String iobyxmoadg(int i13) {
        f74555iobyxmoadg.ppxfxbqfkf(i13);
        return f74557zoijcleaow[i13];
    }

    public static String ppxfxbqfkf(int i13) {
        f74555iobyxmoadg.ppxfxbqfkf(i13);
        return f74556ppxfxbqfkf[i13];
    }

    public static String zoijcleaow(int i13) {
        return f74555iobyxmoadg.wkgbmnqykc(i13);
    }
}
