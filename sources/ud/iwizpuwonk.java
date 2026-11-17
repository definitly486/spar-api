package ud;

import android.util.Base64;

/* JADX INFO: loaded from: classes2.dex */
public final class iwizpuwonk {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final iwizpuwonk f113386iobyxmoadg = new iwizpuwonk();

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final String f113387ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final String f113388wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final String f113389zoijcleaow;

    static {
        String strEncodeToString = Base64.encodeToString(mj.kcexrzcfyt.lereixgezr(jyumaefscl.f113390iobyxmoadg.eablkybsjg()), 10);
        f113389zoijcleaow = strEncodeToString;
        f113387ppxfxbqfkf = "firebase_session_" + strEncodeToString + "_data";
        f113388wkgbmnqykc = "firebase_session_" + strEncodeToString + "_settings";
    }

    private iwizpuwonk() {
    }

    public final String iobyxmoadg() {
        return f113387ppxfxbqfkf;
    }

    public final String zoijcleaow() {
        return f113388wkgbmnqykc;
    }
}
