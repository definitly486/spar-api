package com.google.android.material.carousel;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes2.dex */
public final class nufgyqmvbu extends wkgbmnqykc {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private int f22406ppxfxbqfkf = 0;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final int[] f22405wkgbmnqykc = {1};

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private static final int[] f22404eablkybsjg = {1, 0};

    boolean dxjokdxxww(iobyxmoadg iobyxmoadgVar, int i13) {
        int iEablkybsjg = iobyxmoadgVar.eablkybsjg() - i13;
        boolean z13 = iEablkybsjg > 0 && (iobyxmoadgVar.f22394ppxfxbqfkf > 0 || iobyxmoadgVar.f22395wkgbmnqykc > 1);
        while (iEablkybsjg > 0) {
            int i14 = iobyxmoadgVar.f22394ppxfxbqfkf;
            if (i14 > 0) {
                iobyxmoadgVar.f22394ppxfxbqfkf = i14 - 1;
            } else {
                int i15 = iobyxmoadgVar.f22395wkgbmnqykc;
                if (i15 > 1) {
                    iobyxmoadgVar.f22395wkgbmnqykc = i15 - 1;
                }
            }
            iEablkybsjg--;
        }
        return z13;
    }

    @Override // com.google.android.material.carousel.wkgbmnqykc
    gxszxtbevo lqeggnwhkg(zoijcleaow zoijcleaowVar, View view) {
        float fGxszxtbevo = zoijcleaowVar.gxszxtbevo();
        if (zoijcleaowVar.wkgbmnqykc()) {
            fGxszxtbevo = zoijcleaowVar.eablkybsjg();
        }
        RecyclerView.vdvldrhtss vdvldrhtssVar = (RecyclerView.vdvldrhtss) view.getLayoutParams();
        float f13 = ((ViewGroup.MarginLayoutParams) vdvldrhtssVar).topMargin + ((ViewGroup.MarginLayoutParams) vdvldrhtssVar).bottomMargin;
        float measuredHeight = view.getMeasuredHeight();
        if (zoijcleaowVar.wkgbmnqykc()) {
            f13 = ((ViewGroup.MarginLayoutParams) vdvldrhtssVar).leftMargin + ((ViewGroup.MarginLayoutParams) vdvldrhtssVar).rightMargin;
            measuredHeight = view.getMeasuredWidth();
        }
        float f14 = f13;
        float fWkgbmnqykc = wkgbmnqykc() + f14;
        float fMax = Math.max(ppxfxbqfkf() + f14, fWkgbmnqykc);
        float fMin = Math.min(measuredHeight + f14, fGxszxtbevo);
        float fIobyxmoadg = o1.iobyxmoadg.iobyxmoadg((measuredHeight / 3.0f) + f14, fWkgbmnqykc + f14, fMax + f14);
        float f15 = (fMin + fIobyxmoadg) / 2.0f;
        int[] iArrIobyxmoadg = f22405wkgbmnqykc;
        if (fGxszxtbevo < 2.0f * fWkgbmnqykc) {
            iArrIobyxmoadg = new int[]{0};
        }
        int[] iArrIobyxmoadg2 = f22404eablkybsjg;
        if (zoijcleaowVar.btonecajqb() == 1) {
            iArrIobyxmoadg = wkgbmnqykc.iobyxmoadg(iArrIobyxmoadg);
            iArrIobyxmoadg2 = wkgbmnqykc.iobyxmoadg(iArrIobyxmoadg2);
        }
        int[] iArr = iArrIobyxmoadg;
        int[] iArr2 = iArrIobyxmoadg2;
        int iMax = (int) Math.max(1.0d, Math.floor(((fGxszxtbevo - (eablkybsjg.dxjokdxxww(iArr2) * f15)) - (eablkybsjg.dxjokdxxww(iArr) * fMax)) / fMin));
        int iCeil = (int) Math.ceil(fGxszxtbevo / fMin);
        int i13 = (iCeil - iMax) + 1;
        int[] iArr3 = new int[i13];
        for (int i14 = 0; i14 < i13; i14++) {
            iArr3[i14] = iCeil - i14;
        }
        iobyxmoadg iobyxmoadgVarPpxfxbqfkf = iobyxmoadg.ppxfxbqfkf(fGxszxtbevo, fIobyxmoadg, fWkgbmnqykc, fMax, iArr, f15, iArr2, fMin, iArr3);
        this.f22406ppxfxbqfkf = iobyxmoadgVarPpxfxbqfkf.eablkybsjg();
        if (dxjokdxxww(iobyxmoadgVarPpxfxbqfkf, zoijcleaowVar.iobyxmoadg())) {
            iobyxmoadgVarPpxfxbqfkf = iobyxmoadg.ppxfxbqfkf(fGxszxtbevo, fIobyxmoadg, fWkgbmnqykc, fMax, new int[]{iobyxmoadgVarPpxfxbqfkf.f22394ppxfxbqfkf}, f15, new int[]{iobyxmoadgVarPpxfxbqfkf.f22395wkgbmnqykc}, fMin, new int[]{iobyxmoadgVarPpxfxbqfkf.f22392lqeggnwhkg});
        }
        return eablkybsjg.wkgbmnqykc(view.getContext(), f14, fGxszxtbevo, iobyxmoadgVarPpxfxbqfkf, zoijcleaowVar.btonecajqb());
    }

    @Override // com.google.android.material.carousel.wkgbmnqykc
    boolean nufgyqmvbu(zoijcleaow zoijcleaowVar, int i13) {
        return (i13 < this.f22406ppxfxbqfkf && zoijcleaowVar.iobyxmoadg() >= this.f22406ppxfxbqfkf) || (i13 >= this.f22406ppxfxbqfkf && zoijcleaowVar.iobyxmoadg() < this.f22406ppxfxbqfkf);
    }
}
