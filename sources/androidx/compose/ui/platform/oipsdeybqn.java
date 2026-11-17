package androidx.compose.ui.platform;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;

/* JADX INFO: loaded from: classes.dex */
final class oipsdeybqn implements ydmasvzmpa {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Matrix f7022iobyxmoadg = new Matrix();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int[] f7023zoijcleaow = new int[2];

    @Override // androidx.compose.ui.platform.ydmasvzmpa
    public void iobyxmoadg(View view, float[] fArr) {
        this.f7022iobyxmoadg.reset();
        view.transformMatrixToGlobal(this.f7022iobyxmoadg);
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            view = parent;
            parent = view.getParent();
        }
        view.getLocationOnScreen(this.f7023zoijcleaow);
        int[] iArr = this.f7023zoijcleaow;
        int i13 = iArr[0];
        int i14 = iArr[1];
        view.getLocationInWindow(iArr);
        int[] iArr2 = this.f7023zoijcleaow;
        this.f7022iobyxmoadg.postTranslate(iArr2[0] - i13, iArr2[1] - i14);
        h.cllcsxoeiz.zoijcleaow(fArr, this.f7022iobyxmoadg);
    }
}
