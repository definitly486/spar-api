package androidx.transition;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
abstract class pkzmftpjix extends wwaezpbzkn {

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private static boolean f13548gxszxtbevo = true;

    static class iobyxmoadg {
        static void iobyxmoadg(View view, int i13, int i14, int i15, int i16) {
            view.setLeftTopRightBottom(i13, i14, i15, i16);
        }
    }

    pkzmftpjix() {
    }

    @Override // androidx.transition.yadqdtsiqt
    public void wkgbmnqykc(View view, int i13, int i14, int i15, int i16) {
        if (f13548gxszxtbevo) {
            try {
                iobyxmoadg.iobyxmoadg(view, i13, i14, i15, i16);
            } catch (NoSuchMethodError unused) {
                f13548gxszxtbevo = false;
            }
        }
    }
}
