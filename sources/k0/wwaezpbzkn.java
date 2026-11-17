package k0;

import android.text.Layout;
import android.text.TextUtils;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class wwaezpbzkn {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private char[] f53371eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final int f53372gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Layout f53373iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final List f53374ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final boolean[] f53375wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final List f53376zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final int f53377iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final boolean f53378ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final int f53379zoijcleaow;

        public iobyxmoadg(int i13, int i14, boolean z13) {
            this.f53377iobyxmoadg = i13;
            this.f53379zoijcleaow = i14;
            this.f53378ppxfxbqfkf = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return this.f53377iobyxmoadg == iobyxmoadgVar.f53377iobyxmoadg && this.f53379zoijcleaow == iobyxmoadgVar.f53379zoijcleaow && this.f53378ppxfxbqfkf == iobyxmoadgVar.f53378ppxfxbqfkf;
        }

        public int hashCode() {
            return (((Integer.hashCode(this.f53377iobyxmoadg) * 31) + Integer.hashCode(this.f53379zoijcleaow)) * 31) + Boolean.hashCode(this.f53378ppxfxbqfkf);
        }

        public final int iobyxmoadg() {
            return this.f53379zoijcleaow;
        }

        public final boolean ppxfxbqfkf() {
            return this.f53378ppxfxbqfkf;
        }

        public String toString() {
            return "BidiRun(start=" + this.f53377iobyxmoadg + ", end=" + this.f53379zoijcleaow + ", isRtl=" + this.f53378ppxfxbqfkf + ')';
        }

        public final int zoijcleaow() {
            return this.f53377iobyxmoadg;
        }
    }

    public wwaezpbzkn(Layout layout) {
        this.f53373iobyxmoadg = layout;
        ArrayList arrayList = new ArrayList();
        int length = 0;
        do {
            int iYfnezrywwk = mj.kcexrzcfyt.yfnezrywwk(this.f53373iobyxmoadg.getText(), '\n', length, false, 4, null);
            length = iYfnezrywwk < 0 ? this.f53373iobyxmoadg.getText().length() : iYfnezrywwk + 1;
            arrayList.add(Integer.valueOf(length));
        } while (length < this.f53373iobyxmoadg.getText().length());
        this.f53376zoijcleaow = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i13 = 0; i13 < size; i13++) {
            arrayList2.add(null);
        }
        this.f53374ppxfxbqfkf = arrayList2;
        this.f53375wkgbmnqykc = new boolean[this.f53376zoijcleaow.size()];
        this.f53372gxszxtbevo = this.f53376zoijcleaow.size();
    }

    private final int gtknphoqwx(int i13, int i14) {
        while (i13 > i14 && dxjokdxxww(this.f53373iobyxmoadg.getText().charAt(i13 - 1))) {
            i13--;
        }
        return i13;
    }

    public static /* synthetic */ int lqeggnwhkg(wwaezpbzkn wwaezpbzknVar, int i13, boolean z13, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            z13 = false;
        }
        return wwaezpbzknVar.gxszxtbevo(i13, z13);
    }

    private final float zoijcleaow(int i13, boolean z13) {
        int iBtonecajqb = zg.gtknphoqwx.btonecajqb(i13, this.f53373iobyxmoadg.getLineEnd(this.f53373iobyxmoadg.getLineForOffset(i13)));
        return z13 ? this.f53373iobyxmoadg.getPrimaryHorizontal(iBtonecajqb) : this.f53373iobyxmoadg.getSecondaryHorizontal(iBtonecajqb);
    }

    public final boolean btonecajqb(int i13) {
        return this.f53373iobyxmoadg.getParagraphDirection(this.f53373iobyxmoadg.getLineForOffset(nufgyqmvbu(i13))) == -1;
    }

    public final boolean dxjokdxxww(char c13) {
        return c13 == ' ' || c13 == '\n' || c13 == 5760 || (kotlin.jvm.internal.zdlpuopuiu.draadjrbmk(c13, 8192) >= 0 && kotlin.jvm.internal.zdlpuopuiu.draadjrbmk(c13, 8202) <= 0 && c13 != 8199) || c13 == 8287 || c13 == 12288;
    }

    public final int eablkybsjg(int i13) {
        return gtknphoqwx(this.f53373iobyxmoadg.getLineEnd(i13), this.f53373iobyxmoadg.getLineStart(i13));
    }

    public final int gxszxtbevo(int i13, boolean z13) {
        int iDraadjrbmk = hg.jyumaefscl.draadjrbmk(this.f53376zoijcleaow, Integer.valueOf(i13), 0, 0, 6, null);
        int i14 = iDraadjrbmk < 0 ? -(iDraadjrbmk + 1) : iDraadjrbmk + 1;
        if (z13 && i14 > 0) {
            int i15 = i14 - 1;
            if (i13 == ((Number) this.f53376zoijcleaow.get(i15)).intValue()) {
                return i15;
            }
        }
        return i14;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0062  */
    public final Bidi iobyxmoadg(int i13) {
        Bidi bidi;
        if (this.f53375wkgbmnqykc[i13]) {
            return (Bidi) this.f53374ppxfxbqfkf.get(i13);
        }
        int iIntValue = i13 == 0 ? 0 : ((Number) this.f53376zoijcleaow.get(i13 - 1)).intValue();
        int iIntValue2 = ((Number) this.f53376zoijcleaow.get(i13)).intValue();
        int i14 = iIntValue2 - iIntValue;
        char[] cArr = this.f53371eablkybsjg;
        if (cArr == null || cArr.length < i14) {
            cArr = new char[i14];
        }
        char[] cArr2 = cArr;
        TextUtils.getChars(this.f53373iobyxmoadg.getText(), iIntValue, iIntValue2, cArr2, 0);
        if (Bidi.requiresBidi(cArr2, 0, i14)) {
            bidi = new Bidi(cArr2, 0, null, 0, i14, btonecajqb(i13) ? 1 : 0);
            if (bidi.getRunCount() == 1) {
                bidi = null;
            }
        } else {
            bidi = null;
        }
        this.f53374ppxfxbqfkf.set(i13, bidi);
        this.f53375wkgbmnqykc[i13] = true;
        if (bidi != null) {
            char[] cArr3 = this.f53371eablkybsjg;
            cArr2 = cArr2 == cArr3 ? null : cArr3;
        }
        this.f53371eablkybsjg = cArr2;
        return bidi;
    }

    public final int nufgyqmvbu(int i13) {
        if (i13 == 0) {
            return 0;
        }
        return ((Number) this.f53376zoijcleaow.get(i13 - 1)).intValue();
    }

    public final float ppxfxbqfkf(int i13, boolean z13, boolean z14) {
        int iGtknphoqwx = i13;
        if (!z14) {
            return zoijcleaow(i13, z13);
        }
        int iIobyxmoadg = lmojexxdyd.iobyxmoadg(this.f53373iobyxmoadg, iGtknphoqwx, z14);
        int lineStart = this.f53373iobyxmoadg.getLineStart(iIobyxmoadg);
        int lineEnd = this.f53373iobyxmoadg.getLineEnd(iIobyxmoadg);
        if (iGtknphoqwx != lineStart && iGtknphoqwx != lineEnd) {
            return zoijcleaow(i13, z13);
        }
        if (iGtknphoqwx == 0 || iGtknphoqwx == this.f53373iobyxmoadg.getText().length()) {
            return zoijcleaow(i13, z13);
        }
        int iGxszxtbevo = gxszxtbevo(iGtknphoqwx, z14);
        boolean zBtonecajqb = btonecajqb(iGxszxtbevo);
        int iGtknphoqwx2 = gtknphoqwx(lineEnd, lineStart);
        int iNufgyqmvbu = nufgyqmvbu(iGxszxtbevo);
        int i14 = lineStart - iNufgyqmvbu;
        int i15 = iGtknphoqwx2 - iNufgyqmvbu;
        Bidi bidiIobyxmoadg = iobyxmoadg(iGxszxtbevo);
        Bidi bidiCreateLineBidi = bidiIobyxmoadg != null ? bidiIobyxmoadg.createLineBidi(i14, i15) : null;
        boolean z15 = false;
        if (bidiCreateLineBidi == null || bidiCreateLineBidi.getRunCount() == 1) {
            boolean zIsRtlCharAt = this.f53373iobyxmoadg.isRtlCharAt(lineStart);
            if (z13 || zBtonecajqb == zIsRtlCharAt) {
                zBtonecajqb = !zBtonecajqb;
            }
            if (iGtknphoqwx == lineStart) {
                z15 = zBtonecajqb;
            } else if (!zBtonecajqb) {
                z15 = true;
            }
            Layout layout = this.f53373iobyxmoadg;
            return z15 ? layout.getLineLeft(iIobyxmoadg) : layout.getLineRight(iIobyxmoadg);
        }
        int runCount = bidiCreateLineBidi.getRunCount();
        iobyxmoadg[] iobyxmoadgVarArr = new iobyxmoadg[runCount];
        for (int i16 = 0; i16 < runCount; i16++) {
            iobyxmoadgVarArr[i16] = new iobyxmoadg(bidiCreateLineBidi.getRunStart(i16) + lineStart, bidiCreateLineBidi.getRunLimit(i16) + lineStart, bidiCreateLineBidi.getRunLevel(i16) % 2 == 1);
        }
        int runCount2 = bidiCreateLineBidi.getRunCount();
        byte[] bArr = new byte[runCount2];
        for (int i17 = 0; i17 < runCount2; i17++) {
            bArr[i17] = (byte) bidiCreateLineBidi.getRunLevel(i17);
        }
        Bidi.reorderVisually(bArr, 0, iobyxmoadgVarArr, 0, runCount);
        int i18 = -1;
        if (iGtknphoqwx == lineStart) {
            for (int i19 = 0; i19 < runCount; i19++) {
                if (iobyxmoadgVarArr[i19].zoijcleaow() == iGtknphoqwx) {
                    i18 = i19;
                    break;
                }
            }
            iobyxmoadg iobyxmoadgVar = iobyxmoadgVarArr[i18];
            if (z13 || zBtonecajqb == iobyxmoadgVar.ppxfxbqfkf()) {
                zBtonecajqb = !zBtonecajqb;
            }
            if (i18 == 0 && zBtonecajqb) {
                return this.f53373iobyxmoadg.getLineLeft(iIobyxmoadg);
            }
            if (i18 != hg.agtfadlqog.opjhrmiecq(iobyxmoadgVarArr) || zBtonecajqb) {
                return zBtonecajqb ? this.f53373iobyxmoadg.getPrimaryHorizontal(iobyxmoadgVarArr[i18 - 1].zoijcleaow()) : this.f53373iobyxmoadg.getPrimaryHorizontal(iobyxmoadgVarArr[i18 + 1].zoijcleaow());
            }
            return this.f53373iobyxmoadg.getLineRight(iIobyxmoadg);
        }
        if (iGtknphoqwx > iGtknphoqwx2) {
            iGtknphoqwx = gtknphoqwx(iGtknphoqwx, lineStart);
        }
        for (int i23 = 0; i23 < runCount; i23++) {
            if (iobyxmoadgVarArr[i23].iobyxmoadg() == iGtknphoqwx) {
                i18 = i23;
                break;
            }
        }
        iobyxmoadg iobyxmoadgVar2 = iobyxmoadgVarArr[i18];
        if (!z13 && zBtonecajqb != iobyxmoadgVar2.ppxfxbqfkf()) {
            zBtonecajqb = !zBtonecajqb;
        }
        if (i18 == 0 && zBtonecajqb) {
            return this.f53373iobyxmoadg.getLineLeft(iIobyxmoadg);
        }
        if (i18 != hg.agtfadlqog.opjhrmiecq(iobyxmoadgVarArr) || zBtonecajqb) {
            return zBtonecajqb ? this.f53373iobyxmoadg.getPrimaryHorizontal(iobyxmoadgVarArr[i18 - 1].iobyxmoadg()) : this.f53373iobyxmoadg.getPrimaryHorizontal(iobyxmoadgVarArr[i18 + 1].iobyxmoadg());
        }
        return this.f53373iobyxmoadg.getLineRight(iIobyxmoadg);
    }

    public final iobyxmoadg[] wkgbmnqykc(int i13) {
        Bidi bidiCreateLineBidi;
        int lineStart = this.f53373iobyxmoadg.getLineStart(i13);
        int lineEnd = this.f53373iobyxmoadg.getLineEnd(i13);
        int iLqeggnwhkg = lqeggnwhkg(this, lineStart, false, 2, null);
        int iNufgyqmvbu = nufgyqmvbu(iLqeggnwhkg);
        int i14 = lineStart - iNufgyqmvbu;
        int i15 = lineEnd - iNufgyqmvbu;
        Bidi bidiIobyxmoadg = iobyxmoadg(iLqeggnwhkg);
        if (bidiIobyxmoadg == null || (bidiCreateLineBidi = bidiIobyxmoadg.createLineBidi(i14, i15)) == null) {
            return new iobyxmoadg[]{new iobyxmoadg(lineStart, lineEnd, this.f53373iobyxmoadg.isRtlCharAt(lineStart))};
        }
        int runCount = bidiCreateLineBidi.getRunCount();
        iobyxmoadg[] iobyxmoadgVarArr = new iobyxmoadg[runCount];
        for (int i16 = 0; i16 < runCount; i16++) {
            int runStart = bidiCreateLineBidi.getRunStart(i16) + lineStart;
            int runLimit = bidiCreateLineBidi.getRunLimit(i16) + lineStart;
            boolean z13 = true;
            if (bidiCreateLineBidi.getRunLevel(i16) % 2 != 1) {
                z13 = false;
            }
            iobyxmoadgVarArr[i16] = new iobyxmoadg(runStart, runLimit, z13);
        }
        return iobyxmoadgVarArr;
    }
}
