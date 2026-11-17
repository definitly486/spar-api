package androidx.transition;

import android.os.Build;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
class jpowsppfya extends pkzmftpjix {

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private static boolean f13528lqeggnwhkg = true;

    static class iobyxmoadg {
        static void iobyxmoadg(View view, int i13) {
            view.setTransitionVisibility(i13);
        }
    }

    jpowsppfya() {
    }

    @Override // androidx.transition.yadqdtsiqt
    public void gxszxtbevo(View view, int i13) {
        if (Build.VERSION.SDK_INT == 28) {
            super.gxszxtbevo(view, i13);
        } else if (f13528lqeggnwhkg) {
            try {
                iobyxmoadg.iobyxmoadg(view, i13);
            } catch (NoSuchMethodError unused) {
                f13528lqeggnwhkg = false;
            }
        }
    }
}
