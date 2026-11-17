package androidx.transition;

import android.graphics.Matrix;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
class hkdspvbjdz extends jpowsppfya {
    hkdspvbjdz() {
    }

    @Override // androidx.transition.yadqdtsiqt
    public void eablkybsjg(View view, float f13) {
        view.setTransitionAlpha(f13);
    }

    @Override // androidx.transition.jpowsppfya, androidx.transition.yadqdtsiqt
    public void gxszxtbevo(View view, int i13) {
        view.setTransitionVisibility(i13);
    }

    @Override // androidx.transition.wwaezpbzkn, androidx.transition.yadqdtsiqt
    public void lqeggnwhkg(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // androidx.transition.wwaezpbzkn, androidx.transition.yadqdtsiqt
    public void nufgyqmvbu(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }

    @Override // androidx.transition.pkzmftpjix, androidx.transition.yadqdtsiqt
    public void wkgbmnqykc(View view, int i13, int i14, int i15, int i16) {
        view.setLeftTopRightBottom(i13, i14, i15, i16);
    }

    @Override // androidx.transition.yadqdtsiqt
    public float zoijcleaow(View view) {
        return view.getTransitionAlpha();
    }
}
