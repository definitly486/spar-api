package org.xbill.DNS;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final oipsdeybqn f74288iobyxmoadg;

    static {
        oipsdeybqn oipsdeybqnVar = new oipsdeybqn("DNS Rcode", 2);
        f74288iobyxmoadg = oipsdeybqnVar;
        oipsdeybqnVar.gxszxtbevo(4095);
        oipsdeybqnVar.nufgyqmvbu("RESERVED");
        oipsdeybqnVar.lqeggnwhkg(true);
        oipsdeybqnVar.iobyxmoadg(0, "NOERROR");
        oipsdeybqnVar.iobyxmoadg(1, "FORMERR");
        oipsdeybqnVar.iobyxmoadg(2, "SERVFAIL");
        oipsdeybqnVar.iobyxmoadg(3, "NXDOMAIN");
        oipsdeybqnVar.iobyxmoadg(4, "NOTIMP");
        oipsdeybqnVar.zoijcleaow(4, "NOTIMPL");
        oipsdeybqnVar.iobyxmoadg(5, "REFUSED");
        oipsdeybqnVar.iobyxmoadg(6, "YXDOMAIN");
        oipsdeybqnVar.iobyxmoadg(7, "YXRRSET");
        oipsdeybqnVar.iobyxmoadg(8, "NXRRSET");
        oipsdeybqnVar.iobyxmoadg(9, "NOTAUTH");
        oipsdeybqnVar.iobyxmoadg(10, "NOTZONE");
        oipsdeybqnVar.iobyxmoadg(16, "BADVERS");
        oipsdeybqnVar.iobyxmoadg(17, "BADKEY");
        oipsdeybqnVar.iobyxmoadg(18, "BADTIME");
        oipsdeybqnVar.iobyxmoadg(19, "BADMODE");
        oipsdeybqnVar.iobyxmoadg(20, "BADNAME");
        oipsdeybqnVar.iobyxmoadg(21, "BADALG");
        oipsdeybqnVar.iobyxmoadg(22, "BADTRUNC");
        oipsdeybqnVar.iobyxmoadg(23, "BADCOOKIE");
    }

    public static String iobyxmoadg(int i13) {
        return i13 == 16 ? "BADSIG" : zoijcleaow(i13);
    }

    public static String zoijcleaow(int i13) {
        return f74288iobyxmoadg.wkgbmnqykc(i13);
    }
}
