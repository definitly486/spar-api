package igdgnonuha;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final i f43035iobyxmoadg = new i();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public static final int f43036zoijcleaow = 0;

    private i() {
    }

    public final j iobyxmoadg(float f13, float f14, float f15, float f16, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i13, int i14) {
        if ((i14 & 1) != 0) {
            f13 = w0.nufgyqmvbu.lqeggnwhkg(6);
        }
        float f17 = f13;
        if ((i14 & 2) != 0) {
            f14 = w0.nufgyqmvbu.lqeggnwhkg(12);
        }
        float f18 = f14;
        if ((i14 & 4) != 0) {
            f15 = w0.nufgyqmvbu.lqeggnwhkg(8);
        }
        float f19 = f15;
        if ((i14 & 8) != 0) {
            f16 = w0.nufgyqmvbu.lqeggnwhkg(8);
        }
        float f23 = f16;
        if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
            androidx.compose.runtime.jyumaefscl.ntlheqmsrt(380403812, i13, -1, "androidx.compose.material.FloatingActionButtonDefaults.elevation (FloatingActionButton.kt:238)");
        }
        boolean z13 = ((((i13 & 14) ^ 6) > 4 && draadjrbmkVar.zoijcleaow(f17)) || (i13 & 6) == 4) | ((((i13 & 112) ^ 48) > 32 && draadjrbmkVar.zoijcleaow(f18)) || (i13 & 48) == 32) | ((((i13 & 896) ^ 384) > 256 && draadjrbmkVar.zoijcleaow(f19)) || (i13 & 384) == 256) | ((((i13 & 7168) ^ 3072) > 2048 && draadjrbmkVar.zoijcleaow(f23)) || (i13 & 3072) == 2048);
        Object objYadqdtsiqt = draadjrbmkVar.yadqdtsiqt();
        if (z13 || objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
            objYadqdtsiqt = new jztzpxfvev(f17, f18, f19, f23, null);
            draadjrbmkVar.jyumaefscl(objYadqdtsiqt);
        }
        jztzpxfvev jztzpxfvevVar = (jztzpxfvev) objYadqdtsiqt;
        if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
            androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
        }
        return jztzpxfvevVar;
    }
}
