package x2;

import android.os.Bundle;
import y2.stevsuqkhv;

/* JADX INFO: loaded from: classes.dex */
public final class dxjokdxxww {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final String f120929zoijcleaow = stevsuqkhv.uawqvzlxes(0);

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final String f120930iobyxmoadg;

    public dxjokdxxww(String str) {
        this.f120930iobyxmoadg = str;
    }

    public static dxjokdxxww iobyxmoadg(Bundle bundle) {
        return new dxjokdxxww((String) y2.iobyxmoadg.eablkybsjg(bundle.getString(f120929zoijcleaow)));
    }

    public Bundle zoijcleaow() {
        Bundle bundle = new Bundle();
        bundle.putString(f120929zoijcleaow, this.f120930iobyxmoadg);
        return bundle;
    }
}
