package h;

import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public abstract class iozdgvuglv {
    public static final ColorFilter iobyxmoadg(long j13, int i13) {
        return Build.VERSION.SDK_INT >= 29 ? ikoacuggdj.f38909iobyxmoadg.iobyxmoadg(j13, i13) : new PorterDuffColorFilter(bfopjjpdmp.nufgyqmvbu(j13), androidx.compose.ui.graphics.iobyxmoadg.zoijcleaow(i13));
    }

    public static final ColorFilter zoijcleaow(androidx.compose.ui.graphics.wkgbmnqykc wkgbmnqykcVar) {
        return wkgbmnqykcVar.iobyxmoadg();
    }
}
