package androidx.appcompat.view;

import android.content.Context;
import android.content.res.Configuration;

/* JADX INFO: loaded from: classes.dex */
public class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private Context f2704iobyxmoadg;

    private iobyxmoadg(Context context) {
        this.f2704iobyxmoadg = context;
    }

    public static iobyxmoadg zoijcleaow(Context context) {
        return new iobyxmoadg(context);
    }

    public boolean eablkybsjg() {
        return this.f2704iobyxmoadg.getResources().getBoolean(lqeggnwhkg.zoijcleaow.abc_action_bar_embed_tabs);
    }

    public boolean gxszxtbevo() {
        return true;
    }

    public boolean iobyxmoadg() {
        return this.f2704iobyxmoadg.getApplicationInfo().targetSdkVersion < 14;
    }

    public int ppxfxbqfkf() {
        return this.f2704iobyxmoadg.getResources().getDisplayMetrics().widthPixels / 2;
    }

    public int wkgbmnqykc() {
        Configuration configuration = this.f2704iobyxmoadg.getResources().getConfiguration();
        int i13 = configuration.screenWidthDp;
        int i14 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i13 > 600) {
            return 5;
        }
        if (i13 > 960 && i14 > 720) {
            return 5;
        }
        if (i13 > 720 && i14 > 960) {
            return 5;
        }
        if (i13 >= 500) {
            return 4;
        }
        if (i13 > 640 && i14 > 480) {
            return 4;
        }
        if (i13 <= 480 || i14 <= 640) {
            return i13 >= 360 ? 3 : 2;
        }
        return 4;
    }
}
