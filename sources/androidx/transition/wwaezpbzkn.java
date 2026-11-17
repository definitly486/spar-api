package androidx.transition;

import android.graphics.Matrix;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
abstract class wwaezpbzkn extends yadqdtsiqt {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private static boolean f13555eablkybsjg = true;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static boolean f13556wkgbmnqykc = true;

    static class iobyxmoadg {
        static void iobyxmoadg(View view, Matrix matrix) {
            view.setAnimationMatrix(matrix);
        }

        static void ppxfxbqfkf(View view, Matrix matrix) {
            view.transformMatrixToLocal(matrix);
        }

        static void zoijcleaow(View view, Matrix matrix) {
            view.transformMatrixToGlobal(matrix);
        }
    }

    wwaezpbzkn() {
    }

    @Override // androidx.transition.yadqdtsiqt
    public void lqeggnwhkg(View view, Matrix matrix) {
        if (f13556wkgbmnqykc) {
            try {
                iobyxmoadg.zoijcleaow(view, matrix);
            } catch (NoSuchMethodError unused) {
                f13556wkgbmnqykc = false;
            }
        }
    }

    @Override // androidx.transition.yadqdtsiqt
    public void nufgyqmvbu(View view, Matrix matrix) {
        if (f13555eablkybsjg) {
            try {
                iobyxmoadg.ppxfxbqfkf(view, matrix);
            } catch (NoSuchMethodError unused) {
                f13555eablkybsjg = false;
            }
        }
    }
}
