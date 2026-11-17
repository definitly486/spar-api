package v1;

import android.view.View;
import android.view.ViewParent;

/* JADX INFO: loaded from: classes.dex */
public class iozdgvuglv {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private int[] f115134eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private ViewParent f115135iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final View f115136ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private boolean f115137wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private ViewParent f115138zoijcleaow;

    public iozdgvuglv(View view) {
        this.f115136ppxfxbqfkf = view;
    }

    private void agtfadlqog(int i13, ViewParent viewParent) {
        if (i13 == 0) {
            this.f115135iobyxmoadg = viewParent;
        } else {
            if (i13 != 1) {
                return;
            }
            this.f115138zoijcleaow = viewParent;
        }
    }

    private int[] dxjokdxxww() {
        if (this.f115134eablkybsjg == null) {
            this.f115134eablkybsjg = new int[2];
        }
        return this.f115134eablkybsjg;
    }

    private boolean lqeggnwhkg(int i13, int i14, int i15, int i16, int[] iArr, int i17, int[] iArr2) {
        ViewParent viewParentNufgyqmvbu;
        int i18;
        int i19;
        int[] iArr3;
        if (!draadjrbmk() || (viewParentNufgyqmvbu = nufgyqmvbu(i17)) == null) {
            return false;
        }
        if (i13 == 0 && i14 == 0 && i15 == 0 && i16 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        if (iArr != null) {
            this.f115136ppxfxbqfkf.getLocationInWindow(iArr);
            i18 = iArr[0];
            i19 = iArr[1];
        } else {
            i18 = 0;
            i19 = 0;
        }
        if (iArr2 == null) {
            int[] iArrDxjokdxxww = dxjokdxxww();
            iArrDxjokdxxww[0] = 0;
            iArrDxjokdxxww[1] = 0;
            iArr3 = iArrDxjokdxxww;
        } else {
            iArr3 = iArr2;
        }
        czzsidtyhn.wkgbmnqykc(viewParentNufgyqmvbu, this.f115136ppxfxbqfkf, i13, i14, i15, i16, i17, iArr3);
        if (iArr != null) {
            this.f115136ppxfxbqfkf.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i18;
            iArr[1] = iArr[1] - i19;
        }
        return true;
    }

    private ViewParent nufgyqmvbu(int i13) {
        if (i13 == 0) {
            return this.f115135iobyxmoadg;
        }
        if (i13 != 1) {
            return null;
        }
        return this.f115138zoijcleaow;
    }

    public boolean btonecajqb() {
        return gtknphoqwx(0);
    }

    public boolean draadjrbmk() {
        return this.f115137wkgbmnqykc;
    }

    public void eablkybsjg(int i13, int i14, int i15, int i16, int[] iArr, int i17, int[] iArr2) {
        lqeggnwhkg(i13, i14, i15, i16, iArr, i17, iArr2);
    }

    public boolean gtknphoqwx(int i13) {
        return nufgyqmvbu(i13) != null;
    }

    public boolean gxszxtbevo(int i13, int i14, int i15, int i16, int[] iArr) {
        return lqeggnwhkg(i13, i14, i15, i16, iArr, 0, null);
    }

    public boolean iobyxmoadg(float f13, float f14, boolean z13) {
        ViewParent viewParentNufgyqmvbu;
        if (!draadjrbmk() || (viewParentNufgyqmvbu = nufgyqmvbu(0)) == null) {
            return false;
        }
        return czzsidtyhn.iobyxmoadg(viewParentNufgyqmvbu, this.f115136ppxfxbqfkf, f13, f14, z13);
    }

    public boolean ojitshcjhn(int i13) {
        return rgvfuqvkyq(i13, 0);
    }

    public void oxmwwwfdhm(int i13) {
        ViewParent viewParentNufgyqmvbu = nufgyqmvbu(i13);
        if (viewParentNufgyqmvbu != null) {
            czzsidtyhn.lqeggnwhkg(viewParentNufgyqmvbu, this.f115136ppxfxbqfkf, i13);
            agtfadlqog(i13, null);
        }
    }

    public boolean ppxfxbqfkf(int i13, int i14, int[] iArr, int[] iArr2) {
        return wkgbmnqykc(i13, i14, iArr, iArr2, 0);
    }

    public boolean rgvfuqvkyq(int i13, int i14) {
        if (gtknphoqwx(i14)) {
            return true;
        }
        if (!draadjrbmk()) {
            return false;
        }
        View view = this.f115136ppxfxbqfkf;
        for (ViewParent parent = this.f115136ppxfxbqfkf.getParent(); parent != null; parent = parent.getParent()) {
            if (czzsidtyhn.gxszxtbevo(parent, view, this.f115136ppxfxbqfkf, i13, i14)) {
                agtfadlqog(i14, parent);
                czzsidtyhn.eablkybsjg(parent, view, this.f115136ppxfxbqfkf, i13, i14);
                return true;
            }
            if (parent instanceof View) {
                view = (View) parent;
            }
        }
        return false;
    }

    public void vdvldrhtss() {
        oxmwwwfdhm(0);
    }

    public void wflxmlrfwp(boolean z13) {
        if (this.f115137wkgbmnqykc) {
            jhduphickx.jrbgnlbqoe(this.f115136ppxfxbqfkf);
        }
        this.f115137wkgbmnqykc = z13;
    }

    public boolean wkgbmnqykc(int i13, int i14, int[] iArr, int[] iArr2, int i15) {
        ViewParent viewParentNufgyqmvbu;
        int i16;
        int i17;
        if (!draadjrbmk() || (viewParentNufgyqmvbu = nufgyqmvbu(i15)) == null) {
            return false;
        }
        if (i13 == 0 && i14 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        if (iArr2 != null) {
            this.f115136ppxfxbqfkf.getLocationInWindow(iArr2);
            i16 = iArr2[0];
            i17 = iArr2[1];
        } else {
            i16 = 0;
            i17 = 0;
        }
        if (iArr == null) {
            iArr = dxjokdxxww();
        }
        iArr[0] = 0;
        iArr[1] = 0;
        czzsidtyhn.ppxfxbqfkf(viewParentNufgyqmvbu, this.f115136ppxfxbqfkf, i13, i14, iArr, i15);
        if (iArr2 != null) {
            this.f115136ppxfxbqfkf.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i16;
            iArr2[1] = iArr2[1] - i17;
        }
        return (iArr[0] == 0 && iArr[1] == 0) ? false : true;
    }

    public boolean zoijcleaow(float f13, float f14) {
        ViewParent viewParentNufgyqmvbu;
        if (!draadjrbmk() || (viewParentNufgyqmvbu = nufgyqmvbu(0)) == null) {
            return false;
        }
        return czzsidtyhn.zoijcleaow(viewParentNufgyqmvbu, this.f115136ppxfxbqfkf, f13, f14);
    }
}
