package x2;

import android.os.Bundle;
import y2.stevsuqkhv;

/* JADX INFO: loaded from: classes.dex */
public final class nufgyqmvbu implements eablkybsjg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public int f120992iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final int f120993ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public int f120994zoijcleaow;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final String f120991wkgbmnqykc = stevsuqkhv.uawqvzlxes(0);

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private static final String f120989eablkybsjg = stevsuqkhv.uawqvzlxes(1);

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private static final String f120990gxszxtbevo = stevsuqkhv.uawqvzlxes(2);

    public nufgyqmvbu(int i13, int i14, int i15) {
        this.f120992iobyxmoadg = i13;
        this.f120994zoijcleaow = i14;
        this.f120993ppxfxbqfkf = i15;
    }

    public static nufgyqmvbu iobyxmoadg(Bundle bundle) {
        return new nufgyqmvbu(bundle.getInt(f120991wkgbmnqykc), bundle.getInt(f120989eablkybsjg), bundle.getInt(f120990gxszxtbevo));
    }

    public Bundle zoijcleaow() {
        Bundle bundle = new Bundle();
        bundle.putInt(f120991wkgbmnqykc, this.f120992iobyxmoadg);
        bundle.putInt(f120989eablkybsjg, this.f120994zoijcleaow);
        bundle.putInt(f120990gxszxtbevo, this.f120993ppxfxbqfkf);
        return bundle;
    }
}
