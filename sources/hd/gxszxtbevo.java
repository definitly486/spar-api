package hd;

import android.util.SparseIntArray;

/* JADX INFO: loaded from: classes2.dex */
public abstract class gxszxtbevo {

    public static class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        int f40076iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        int f40077ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        int f40078zoijcleaow;

        public iobyxmoadg(int i13, int i14, int i15) {
            this.f40076iobyxmoadg = i13;
            this.f40078zoijcleaow = i14;
            this.f40077ppxfxbqfkf = i15;
        }

        public iobyxmoadg iobyxmoadg(iobyxmoadg iobyxmoadgVar) {
            return new iobyxmoadg(this.f40076iobyxmoadg - iobyxmoadgVar.wkgbmnqykc(), this.f40078zoijcleaow - iobyxmoadgVar.ppxfxbqfkf(), this.f40077ppxfxbqfkf - iobyxmoadgVar.zoijcleaow());
        }

        public int ppxfxbqfkf() {
            return this.f40078zoijcleaow;
        }

        public int wkgbmnqykc() {
            return this.f40076iobyxmoadg;
        }

        public int zoijcleaow() {
            return this.f40077ppxfxbqfkf;
        }
    }

    public static iobyxmoadg iobyxmoadg(SparseIntArray[] sparseIntArrayArr) {
        int i13;
        int i14;
        SparseIntArray sparseIntArray;
        int i15 = 0;
        if (sparseIntArrayArr == null || (sparseIntArray = sparseIntArrayArr[0]) == null) {
            i13 = 0;
            i14 = 0;
        } else {
            int i16 = 0;
            i13 = 0;
            i14 = 0;
            while (i15 < sparseIntArray.size()) {
                int iKeyAt = sparseIntArray.keyAt(i15);
                int iValueAt = sparseIntArray.valueAt(i15);
                i16 += iValueAt;
                if (iKeyAt > 700) {
                    i14 += iValueAt;
                }
                if (iKeyAt > 16) {
                    i13 += iValueAt;
                }
                i15++;
            }
            i15 = i16;
        }
        return new iobyxmoadg(i15, i13, i14);
    }
}
