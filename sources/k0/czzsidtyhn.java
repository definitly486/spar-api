package k0;

import android.graphics.RectF;
import android.text.Layout;

/* JADX INFO: loaded from: classes.dex */
public abstract class czzsidtyhn {
    private static final int eablkybsjg(wwaezpbzkn.iobyxmoadg iobyxmoadgVar, RectF rectF, int i13, int i14, int i15, float f13, float f14, float[] fArr, l0.gxszxtbevo gxszxtbevoVar, tg.rgvfuqvkyq rgvfuqvkyqVar) {
        int iZoijcleaow;
        int iZoijcleaow2;
        if (!lqeggnwhkg(rectF, f13, f14)) {
            return -1;
        }
        if ((iobyxmoadgVar.ppxfxbqfkf() || rectF.left > f13) && (!iobyxmoadgVar.ppxfxbqfkf() || rectF.right < f14)) {
            iZoijcleaow = iobyxmoadgVar.zoijcleaow();
            int iIobyxmoadg = iobyxmoadgVar.iobyxmoadg();
            while (iIobyxmoadg - iZoijcleaow > 1) {
                int i16 = (iIobyxmoadg + iZoijcleaow) / 2;
                float fIobyxmoadg = iobyxmoadg(i16, i13, fArr);
                if ((iobyxmoadgVar.ppxfxbqfkf() || fIobyxmoadg <= rectF.left) && (!iobyxmoadgVar.ppxfxbqfkf() || fIobyxmoadg >= rectF.right)) {
                    iZoijcleaow = i16;
                } else {
                    iIobyxmoadg = i16;
                }
            }
            if (iobyxmoadgVar.ppxfxbqfkf()) {
                iZoijcleaow = iIobyxmoadg;
            }
        } else {
            iZoijcleaow = iobyxmoadgVar.zoijcleaow();
        }
        int iPpxfxbqfkf = gxszxtbevoVar.ppxfxbqfkf(iZoijcleaow);
        if (iPpxfxbqfkf == -1 || (iZoijcleaow2 = gxszxtbevoVar.zoijcleaow(iPpxfxbqfkf)) >= iobyxmoadgVar.iobyxmoadg()) {
            return -1;
        }
        int iGxszxtbevo = zg.gtknphoqwx.gxszxtbevo(iZoijcleaow2, iobyxmoadgVar.zoijcleaow());
        int iBtonecajqb = zg.gtknphoqwx.btonecajqb(iPpxfxbqfkf, iobyxmoadgVar.iobyxmoadg());
        RectF rectF2 = new RectF(0.0f, i14, 0.0f, i15);
        while (true) {
            rectF2.left = iobyxmoadgVar.ppxfxbqfkf() ? iobyxmoadg(iBtonecajqb - 1, i13, fArr) : iobyxmoadg(iGxszxtbevo, i13, fArr);
            rectF2.right = iobyxmoadgVar.ppxfxbqfkf() ? zoijcleaow(iGxszxtbevo, i13, fArr) : zoijcleaow(iBtonecajqb - 1, i13, fArr);
            if (((Boolean) rgvfuqvkyqVar.invoke(rectF2, rectF)).booleanValue()) {
                return iGxszxtbevo;
            }
            iGxszxtbevo = gxszxtbevoVar.iobyxmoadg(iGxszxtbevo);
            if (iGxszxtbevo == -1 || iGxszxtbevo >= iobyxmoadgVar.iobyxmoadg()) {
                return -1;
            }
            iBtonecajqb = zg.gtknphoqwx.btonecajqb(gxszxtbevoVar.ppxfxbqfkf(iGxszxtbevo), iobyxmoadgVar.iobyxmoadg());
        }
    }

    private static final int gxszxtbevo(rlfsiqarku rlfsiqarkuVar, Layout layout, wwaezpbzkn wwaezpbzknVar, int i13, RectF rectF, l0.gxszxtbevo gxszxtbevoVar, tg.rgvfuqvkyq rgvfuqvkyqVar, boolean z13) {
        int lineTop = layout.getLineTop(i13);
        int lineBottom = layout.getLineBottom(i13);
        int lineStart = layout.getLineStart(i13);
        int lineEnd = layout.getLineEnd(i13);
        if (lineStart == lineEnd) {
            return -1;
        }
        float[] fArr = new float[(lineEnd - lineStart) * 2];
        rlfsiqarkuVar.zoijcleaow(i13, fArr);
        wwaezpbzkn.iobyxmoadg[] iobyxmoadgVarArrWkgbmnqykc = wwaezpbzknVar.wkgbmnqykc(i13);
        zg.nufgyqmvbu nufgyqmvbuVarZfvoamnweg = z13 ? hg.agtfadlqog.zfvoamnweg(iobyxmoadgVarArrWkgbmnqykc) : zg.gtknphoqwx.vdvldrhtss(hg.agtfadlqog.opjhrmiecq(iobyxmoadgVarArrWkgbmnqykc), 0);
        int iWkgbmnqykc = nufgyqmvbuVarZfvoamnweg.wkgbmnqykc();
        int iEablkybsjg = nufgyqmvbuVarZfvoamnweg.eablkybsjg();
        int iGxszxtbevo = nufgyqmvbuVarZfvoamnweg.gxszxtbevo();
        if ((iGxszxtbevo <= 0 || iWkgbmnqykc > iEablkybsjg) && (iGxszxtbevo >= 0 || iEablkybsjg > iWkgbmnqykc)) {
            return -1;
        }
        int i14 = iWkgbmnqykc;
        while (true) {
            wwaezpbzkn.iobyxmoadg iobyxmoadgVar = iobyxmoadgVarArrWkgbmnqykc[i14];
            float fIobyxmoadg = iobyxmoadgVar.ppxfxbqfkf() ? iobyxmoadg(iobyxmoadgVar.iobyxmoadg() - 1, lineStart, fArr) : iobyxmoadg(iobyxmoadgVar.zoijcleaow(), lineStart, fArr);
            float fZoijcleaow = iobyxmoadgVar.ppxfxbqfkf() ? zoijcleaow(iobyxmoadgVar.zoijcleaow(), lineStart, fArr) : zoijcleaow(iobyxmoadgVar.iobyxmoadg() - 1, lineStart, fArr);
            int iEablkybsjg2 = z13 ? eablkybsjg(iobyxmoadgVar, rectF, lineStart, lineTop, lineBottom, fIobyxmoadg, fZoijcleaow, fArr, gxszxtbevoVar, rgvfuqvkyqVar) : ppxfxbqfkf(iobyxmoadgVar, rectF, lineStart, lineTop, lineBottom, fIobyxmoadg, fZoijcleaow, fArr, gxszxtbevoVar, rgvfuqvkyqVar);
            if (iEablkybsjg2 >= 0) {
                return iEablkybsjg2;
            }
            if (i14 == iEablkybsjg) {
                return -1;
            }
            i14 += iGxszxtbevo;
            iEablkybsjg = iEablkybsjg;
            iobyxmoadgVarArrWkgbmnqykc = iobyxmoadgVarArrWkgbmnqykc;
        }
    }

    private static final float iobyxmoadg(int i13, int i14, float[] fArr) {
        return fArr[(i13 - i14) * 2];
    }

    private static final boolean lqeggnwhkg(RectF rectF, float f13, float f14) {
        return f14 >= rectF.left && f13 <= rectF.right;
    }

    private static final int ppxfxbqfkf(wwaezpbzkn.iobyxmoadg iobyxmoadgVar, RectF rectF, int i13, int i14, int i15, float f13, float f14, float[] fArr, l0.gxszxtbevo gxszxtbevoVar, tg.rgvfuqvkyq rgvfuqvkyqVar) {
        int iZoijcleaow;
        int iPpxfxbqfkf;
        if (!lqeggnwhkg(rectF, f13, f14)) {
            return -1;
        }
        if ((iobyxmoadgVar.ppxfxbqfkf() || rectF.right < f14) && (!iobyxmoadgVar.ppxfxbqfkf() || rectF.left > f13)) {
            iZoijcleaow = iobyxmoadgVar.zoijcleaow();
            int iIobyxmoadg = iobyxmoadgVar.iobyxmoadg();
            while (iIobyxmoadg - iZoijcleaow > 1) {
                int i16 = (iIobyxmoadg + iZoijcleaow) / 2;
                float fIobyxmoadg = iobyxmoadg(i16, i13, fArr);
                if ((iobyxmoadgVar.ppxfxbqfkf() || fIobyxmoadg <= rectF.right) && (!iobyxmoadgVar.ppxfxbqfkf() || fIobyxmoadg >= rectF.left)) {
                    iZoijcleaow = i16;
                } else {
                    iIobyxmoadg = i16;
                }
            }
            if (iobyxmoadgVar.ppxfxbqfkf()) {
                iZoijcleaow = iIobyxmoadg;
            }
        } else {
            iZoijcleaow = iobyxmoadgVar.iobyxmoadg() - 1;
        }
        int iZoijcleaow2 = gxszxtbevoVar.zoijcleaow(iZoijcleaow + 1);
        if (iZoijcleaow2 == -1 || (iPpxfxbqfkf = gxszxtbevoVar.ppxfxbqfkf(iZoijcleaow2)) <= iobyxmoadgVar.zoijcleaow()) {
            return -1;
        }
        int iGxszxtbevo = zg.gtknphoqwx.gxszxtbevo(iZoijcleaow2, iobyxmoadgVar.zoijcleaow());
        int iBtonecajqb = zg.gtknphoqwx.btonecajqb(iPpxfxbqfkf, iobyxmoadgVar.iobyxmoadg());
        RectF rectF2 = new RectF(0.0f, i14, 0.0f, i15);
        while (true) {
            rectF2.left = iobyxmoadgVar.ppxfxbqfkf() ? iobyxmoadg(iBtonecajqb - 1, i13, fArr) : iobyxmoadg(iGxszxtbevo, i13, fArr);
            rectF2.right = iobyxmoadgVar.ppxfxbqfkf() ? zoijcleaow(iGxszxtbevo, i13, fArr) : zoijcleaow(iBtonecajqb - 1, i13, fArr);
            if (((Boolean) rgvfuqvkyqVar.invoke(rectF2, rectF)).booleanValue()) {
                return iBtonecajqb;
            }
            iBtonecajqb = gxszxtbevoVar.wkgbmnqykc(iBtonecajqb);
            if (iBtonecajqb == -1 || iBtonecajqb <= iobyxmoadgVar.zoijcleaow()) {
                return -1;
            }
            iGxszxtbevo = zg.gtknphoqwx.gxszxtbevo(gxszxtbevoVar.zoijcleaow(iBtonecajqb), iobyxmoadgVar.zoijcleaow());
        }
    }

    public static final int[] wkgbmnqykc(rlfsiqarku rlfsiqarkuVar, Layout layout, wwaezpbzkn wwaezpbzknVar, RectF rectF, int i13, tg.rgvfuqvkyq rgvfuqvkyqVar) {
        int i14;
        int i15;
        l0.gxszxtbevo btonecajqbVar = i13 == 1 ? new l0.btonecajqb(rlfsiqarkuVar.lmojexxdyd(), rlfsiqarkuVar.ylkuphrtab()) : l0.lqeggnwhkg.iobyxmoadg(rlfsiqarkuVar.lmojexxdyd(), rlfsiqarkuVar.wwaezpbzkn());
        int lineForVertical = layout.getLineForVertical((int) rectF.top);
        if (rectF.top > rlfsiqarkuVar.draadjrbmk(lineForVertical) && (lineForVertical = lineForVertical + 1) >= rlfsiqarkuVar.wflxmlrfwp()) {
            return null;
        }
        int i16 = lineForVertical;
        int lineForVertical2 = layout.getLineForVertical((int) rectF.bottom);
        if (lineForVertical2 == 0 && rectF.bottom < rlfsiqarkuVar.iwizpuwonk(0)) {
            return null;
        }
        int iGxszxtbevo = gxszxtbevo(rlfsiqarkuVar, layout, wwaezpbzknVar, i16, rectF, btonecajqbVar, rgvfuqvkyqVar, true);
        while (true) {
            i14 = i16;
            i15 = iGxszxtbevo;
            if (i15 != -1 || i14 >= lineForVertical2) {
                break;
            }
            i16 = i14 + 1;
            iGxszxtbevo = gxszxtbevo(rlfsiqarkuVar, layout, wwaezpbzknVar, i16, rectF, btonecajqbVar, rgvfuqvkyqVar, true);
        }
        if (i15 == -1) {
            return null;
        }
        int iGxszxtbevo2 = gxszxtbevo(rlfsiqarkuVar, layout, wwaezpbzknVar, lineForVertical2, rectF, btonecajqbVar, rgvfuqvkyqVar, false);
        while (iGxszxtbevo2 == -1 && i14 < lineForVertical2) {
            lineForVertical2--;
            iGxszxtbevo2 = gxszxtbevo(rlfsiqarkuVar, layout, wwaezpbzknVar, lineForVertical2, rectF, btonecajqbVar, rgvfuqvkyqVar, false);
        }
        if (iGxszxtbevo2 == -1) {
            return null;
        }
        return new int[]{btonecajqbVar.zoijcleaow(i15 + 1), btonecajqbVar.ppxfxbqfkf(iGxszxtbevo2 - 1)};
    }

    private static final float zoijcleaow(int i13, int i14, float[] fArr) {
        return fArr[((i13 - i14) * 2) + 1];
    }
}
