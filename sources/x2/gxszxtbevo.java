package x2;

import android.os.Bundle;
import y2.stevsuqkhv;

/* JADX INFO: loaded from: classes.dex */
public final class gxszxtbevo implements eablkybsjg {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final String f120931ppxfxbqfkf = stevsuqkhv.uawqvzlxes(0);

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final String f120932wkgbmnqykc = stevsuqkhv.uawqvzlxes(1);

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final String f120933iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final int f120934zoijcleaow;

    public gxszxtbevo(String str, int i13) {
        this.f120933iobyxmoadg = str;
        this.f120934zoijcleaow = i13;
    }

    public static gxszxtbevo iobyxmoadg(Bundle bundle) {
        return new gxszxtbevo((String) y2.iobyxmoadg.eablkybsjg(bundle.getString(f120931ppxfxbqfkf)), bundle.getInt(f120932wkgbmnqykc));
    }

    public Bundle zoijcleaow() {
        Bundle bundle = new Bundle();
        bundle.putString(f120931ppxfxbqfkf, this.f120933iobyxmoadg);
        bundle.putInt(f120932wkgbmnqykc, this.f120934zoijcleaow);
        return bundle;
    }
}
