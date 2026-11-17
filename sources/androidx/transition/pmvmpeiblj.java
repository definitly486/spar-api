package androidx.transition;

import android.os.Build;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes2.dex */
abstract class pmvmpeiblj {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static boolean f13549iobyxmoadg = true;

    static class iobyxmoadg {
        static int iobyxmoadg(ViewGroup viewGroup, int i13) {
            return viewGroup.getChildDrawingOrder(i13);
        }

        static void zoijcleaow(ViewGroup viewGroup, boolean z13) {
            viewGroup.suppressLayout(z13);
        }
    }

    private static void iobyxmoadg(ViewGroup viewGroup, boolean z13) {
        if (f13549iobyxmoadg) {
            try {
                iobyxmoadg.zoijcleaow(viewGroup, z13);
            } catch (NoSuchMethodError unused) {
                f13549iobyxmoadg = false;
            }
        }
    }

    static void zoijcleaow(ViewGroup viewGroup, boolean z13) {
        if (Build.VERSION.SDK_INT >= 29) {
            iobyxmoadg.zoijcleaow(viewGroup, z13);
        } else {
            iobyxmoadg(viewGroup, z13);
        }
    }
}
