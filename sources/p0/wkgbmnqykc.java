package p0;

import android.graphics.Matrix;
import android.os.Build;
import android.view.inputmethod.CursorAnchorInfo;
import j0.f;
import j0.l;
import j0.m;

/* JADX INFO: loaded from: classes.dex */
public abstract class wkgbmnqykc {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1, types: [int] */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r17v0, types: [android.view.inputmethod.CursorAnchorInfo$Builder] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v9 */
    private static final CursorAnchorInfo.Builder iobyxmoadg(CursorAnchorInfo.Builder builder, int i13, int i14, ylkuphrtab ylkuphrtabVar, f fVar, g.lqeggnwhkg lqeggnwhkgVar) {
        ?? r13;
        int i15 = i13;
        int iZoijcleaow = ylkuphrtabVar.zoijcleaow(i15);
        int iZoijcleaow2 = ylkuphrtabVar.zoijcleaow(i14);
        float[] fArr = new float[(iZoijcleaow2 - iZoijcleaow) * 4];
        fVar.iwizpuwonk().ppxfxbqfkf(m.zoijcleaow(iZoijcleaow, iZoijcleaow2), fArr, 0);
        while (i15 < i14) {
            int iZoijcleaow3 = ylkuphrtabVar.zoijcleaow(i15);
            int i16 = (iZoijcleaow3 - iZoijcleaow) * 4;
            g.lqeggnwhkg lqeggnwhkgVar2 = new g.lqeggnwhkg(fArr[i16], fArr[i16 + 1], fArr[i16 + 2], fArr[i16 + 3]);
            boolean zRgvfuqvkyq = lqeggnwhkgVar.rgvfuqvkyq(lqeggnwhkgVar2);
            if (!ppxfxbqfkf(lqeggnwhkgVar, lqeggnwhkgVar2.nufgyqmvbu(), lqeggnwhkgVar2.gtknphoqwx()) || !ppxfxbqfkf(lqeggnwhkgVar, lqeggnwhkgVar2.dxjokdxxww(), lqeggnwhkgVar2.eablkybsjg())) {
                r13 = zRgvfuqvkyq;
                r13 = (zRgvfuqvkyq ? 1 : 0) | 2;
            }
            r13 = zRgvfuqvkyq;
            builder.addCharacterBounds(i15, lqeggnwhkgVar2.nufgyqmvbu(), lqeggnwhkgVar2.gtknphoqwx(), lqeggnwhkgVar2.dxjokdxxww(), lqeggnwhkgVar2.eablkybsjg(), fVar.ppxfxbqfkf(iZoijcleaow3) == v0.dxjokdxxww.Rtl ? r13 | 4 : r13);
            i15++;
        }
        return builder;
    }

    private static final boolean ppxfxbqfkf(g.lqeggnwhkg lqeggnwhkgVar, float f13, float f14) {
        float fNufgyqmvbu = lqeggnwhkgVar.nufgyqmvbu();
        if (f13 <= lqeggnwhkgVar.dxjokdxxww() && fNufgyqmvbu <= f13) {
            float fGtknphoqwx = lqeggnwhkgVar.gtknphoqwx();
            if (f14 <= lqeggnwhkgVar.eablkybsjg() && fGtknphoqwx <= f14) {
                return true;
            }
        }
        return false;
    }

    private static final CursorAnchorInfo.Builder wkgbmnqykc(CursorAnchorInfo.Builder builder, int i13, ylkuphrtab ylkuphrtabVar, f fVar, g.lqeggnwhkg lqeggnwhkgVar) {
        if (i13 < 0) {
            return builder;
        }
        int iZoijcleaow = ylkuphrtabVar.zoijcleaow(i13);
        g.lqeggnwhkg lqeggnwhkgVarEablkybsjg = fVar.eablkybsjg(iZoijcleaow);
        float fWflxmlrfwp = zg.gtknphoqwx.wflxmlrfwp(lqeggnwhkgVarEablkybsjg.nufgyqmvbu(), 0.0f, (int) (fVar.zynmafqrjb() >> 32));
        boolean zPpxfxbqfkf = ppxfxbqfkf(lqeggnwhkgVar, fWflxmlrfwp, lqeggnwhkgVarEablkybsjg.gtknphoqwx());
        boolean zPpxfxbqfkf2 = ppxfxbqfkf(lqeggnwhkgVar, fWflxmlrfwp, lqeggnwhkgVarEablkybsjg.eablkybsjg());
        boolean z13 = fVar.ppxfxbqfkf(iZoijcleaow) == v0.dxjokdxxww.Rtl;
        int i14 = (zPpxfxbqfkf || zPpxfxbqfkf2) ? 1 : 0;
        if (!zPpxfxbqfkf || !zPpxfxbqfkf2) {
            i14 |= 2;
        }
        builder.setInsertionMarkerLocation(fWflxmlrfwp, lqeggnwhkgVarEablkybsjg.gtknphoqwx(), lqeggnwhkgVarEablkybsjg.eablkybsjg(), lqeggnwhkgVarEablkybsjg.eablkybsjg(), z13 ? i14 | 4 : i14);
        return builder;
    }

    public static final CursorAnchorInfo zoijcleaow(CursorAnchorInfo.Builder builder, tzroggbefp tzroggbefpVar, ylkuphrtab ylkuphrtabVar, f fVar, Matrix matrix, g.lqeggnwhkg lqeggnwhkgVar, g.lqeggnwhkg lqeggnwhkgVar2, boolean z13, boolean z14, boolean z15, boolean z16) {
        builder.reset();
        builder.setMatrix(matrix);
        int iDraadjrbmk = l.draadjrbmk(tzroggbefpVar.gtknphoqwx());
        builder.setSelectionRange(iDraadjrbmk, l.gtknphoqwx(tzroggbefpVar.gtknphoqwx()));
        if (z13) {
            wkgbmnqykc(builder, iDraadjrbmk, ylkuphrtabVar, fVar, lqeggnwhkgVar);
        }
        if (z14) {
            l lVarBtonecajqb = tzroggbefpVar.btonecajqb();
            int iDraadjrbmk2 = lVarBtonecajqb != null ? l.draadjrbmk(lVarBtonecajqb.oxmwwwfdhm()) : -1;
            l lVarBtonecajqb2 = tzroggbefpVar.btonecajqb();
            int iGtknphoqwx = lVarBtonecajqb2 != null ? l.gtknphoqwx(lVarBtonecajqb2.oxmwwwfdhm()) : -1;
            if (iDraadjrbmk2 >= 0 && iDraadjrbmk2 < iGtknphoqwx) {
                builder.setComposingText(iDraadjrbmk2, tzroggbefpVar.draadjrbmk().subSequence(iDraadjrbmk2, iGtknphoqwx));
                iobyxmoadg(builder, iDraadjrbmk2, iGtknphoqwx, ylkuphrtabVar, fVar, lqeggnwhkgVar);
            }
        }
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 33 && z15) {
            zoijcleaow.iobyxmoadg(builder, lqeggnwhkgVar2);
        }
        if (i13 >= 34 && z16) {
            ppxfxbqfkf.iobyxmoadg(builder, fVar, lqeggnwhkgVar);
        }
        return builder.build();
    }
}
