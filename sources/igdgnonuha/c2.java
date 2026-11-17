package igdgnonuha;

/* JADX INFO: loaded from: classes.dex */
public final class c2 {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final c2 f42655iobyxmoadg = new c2();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public static final int f42656zoijcleaow = 0;

    private c2() {
    }

    public final b2 iobyxmoadg(long j13, long j14, long j15, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i13, int i14) {
        long jDraadjrbmk = (i14 & 1) != 0 ? z.f44180iobyxmoadg.iobyxmoadg(draadjrbmkVar, 6).draadjrbmk() : j13;
        long jWflxmlrfwp = (i14 & 2) != 0 ? h.oipsdeybqn.wflxmlrfwp(z.f44180iobyxmoadg.iobyxmoadg(draadjrbmkVar, 6).dxjokdxxww(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null) : j14;
        long jWflxmlrfwp2 = (i14 & 4) != 0 ? h.oipsdeybqn.wflxmlrfwp(z.f44180iobyxmoadg.iobyxmoadg(draadjrbmkVar, 6).dxjokdxxww(), ulzqkzuiru.f43940iobyxmoadg.zoijcleaow(draadjrbmkVar, 6), 0.0f, 0.0f, 0.0f, 14, null) : j15;
        if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
            androidx.compose.runtime.jyumaefscl.ntlheqmsrt(1370708026, i13, -1, "androidx.compose.material.RadioButtonDefaults.colors (RadioButton.kt:161)");
        }
        boolean z13 = (((6 ^ (i13 & 14)) > 4 && draadjrbmkVar.wkgbmnqykc(jDraadjrbmk)) || (i13 & 6) == 4) | ((((i13 & 112) ^ 48) > 32 && draadjrbmkVar.wkgbmnqykc(jWflxmlrfwp)) || (i13 & 48) == 32) | ((((i13 & 896) ^ 384) > 256 && draadjrbmkVar.wkgbmnqykc(jWflxmlrfwp2)) || (i13 & 384) == 256);
        Object objYadqdtsiqt = draadjrbmkVar.yadqdtsiqt();
        if (z13 || objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
            objYadqdtsiqt = new metgxyhuhe(jDraadjrbmk, jWflxmlrfwp, jWflxmlrfwp2, null);
            draadjrbmkVar.jyumaefscl(objYadqdtsiqt);
        }
        metgxyhuhe metgxyhuheVar = (metgxyhuhe) objYadqdtsiqt;
        if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
            androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
        }
        return metgxyhuheVar;
    }
}
