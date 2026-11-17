package androidx.compose.ui.platform;

import android.graphics.Matrix;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
final class sflfametgt implements ydmasvzmpa {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final float[] f7062iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int[] f7063zoijcleaow;

    public /* synthetic */ sflfametgt(float[] fArr, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(fArr);
    }

    private final void ppxfxbqfkf(float[] fArr, float f13, float f14) {
        hcddaimhww.btonecajqb(fArr, f13, f14, this.f7062iobyxmoadg);
    }

    private final void wkgbmnqykc(View view, float[] fArr) {
        Object parent = view.getParent();
        if (parent instanceof View) {
            wkgbmnqykc((View) parent, fArr);
            ppxfxbqfkf(fArr, -view.getScrollX(), -view.getScrollY());
            ppxfxbqfkf(fArr, view.getLeft(), view.getTop());
        } else {
            int[] iArr = this.f7063zoijcleaow;
            view.getLocationInWindow(iArr);
            ppxfxbqfkf(fArr, -view.getScrollX(), -view.getScrollY());
            ppxfxbqfkf(fArr, iArr[0], iArr[1]);
        }
        Matrix matrix = view.getMatrix();
        if (matrix.isIdentity()) {
            return;
        }
        zoijcleaow(fArr, matrix);
    }

    private final void zoijcleaow(float[] fArr, Matrix matrix) {
        h.cllcsxoeiz.zoijcleaow(this.f7062iobyxmoadg, matrix);
        hcddaimhww.dxjokdxxww(fArr, this.f7062iobyxmoadg);
    }

    @Override // androidx.compose.ui.platform.ydmasvzmpa
    public void iobyxmoadg(View view, float[] fArr) {
        h.hszhottldk.nufgyqmvbu(fArr);
        wkgbmnqykc(view, fArr);
    }

    private sflfametgt(float[] fArr) {
        this.f7062iobyxmoadg = fArr;
        this.f7063zoijcleaow = new int[2];
    }
}
