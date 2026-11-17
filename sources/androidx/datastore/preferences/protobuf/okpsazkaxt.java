package androidx.datastore.preferences.protobuf;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class okpsazkaxt {

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private static final okpsazkaxt f8761gxszxtbevo = new okpsazkaxt(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private boolean f8762eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private int f8763iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private Object[] f8764ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private int f8765wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private int[] f8766zoijcleaow;

    private okpsazkaxt() {
        this(0, new int[8], new Object[8], true);
    }

    static okpsazkaxt draadjrbmk() {
        return new okpsazkaxt();
    }

    private static int dxjokdxxww(Object[] objArr, int i13) {
        int iHashCode = 17;
        for (int i14 = 0; i14 < i13; i14++) {
            iHashCode = (iHashCode * 31) + objArr[i14].hashCode();
        }
        return iHashCode;
    }

    public static okpsazkaxt eablkybsjg() {
        return f8761gxszxtbevo;
    }

    static okpsazkaxt gtknphoqwx(okpsazkaxt okpsazkaxtVar, okpsazkaxt okpsazkaxtVar2) {
        int i13 = okpsazkaxtVar.f8763iobyxmoadg + okpsazkaxtVar2.f8763iobyxmoadg;
        int[] iArrCopyOf = Arrays.copyOf(okpsazkaxtVar.f8766zoijcleaow, i13);
        System.arraycopy(okpsazkaxtVar2.f8766zoijcleaow, 0, iArrCopyOf, okpsazkaxtVar.f8763iobyxmoadg, okpsazkaxtVar2.f8763iobyxmoadg);
        Object[] objArrCopyOf = Arrays.copyOf(okpsazkaxtVar.f8764ppxfxbqfkf, i13);
        System.arraycopy(okpsazkaxtVar2.f8764ppxfxbqfkf, 0, objArrCopyOf, okpsazkaxtVar.f8763iobyxmoadg, okpsazkaxtVar2.f8763iobyxmoadg);
        return new okpsazkaxt(i13, iArrCopyOf, objArrCopyOf, true);
    }

    private static int nufgyqmvbu(int[] iArr, int i13) {
        int i14 = 17;
        for (int i15 = 0; i15 < i13; i15++) {
            i14 = (i14 * 31) + iArr[i15];
        }
        return i14;
    }

    private static boolean ppxfxbqfkf(int[] iArr, int[] iArr2, int i13) {
        for (int i14 = 0; i14 < i13; i14++) {
            if (iArr[i14] != iArr2[i14]) {
                return false;
            }
        }
        return true;
    }

    private static void rgvfuqvkyq(int i13, Object obj, uwvvkdfqfp uwvvkdfqfpVar) {
        int iIobyxmoadg = czzsidtyhn.iobyxmoadg(i13);
        int iZoijcleaow = czzsidtyhn.zoijcleaow(i13);
        if (iZoijcleaow == 0) {
            uwvvkdfqfpVar.writeInt64(iIobyxmoadg, ((Long) obj).longValue());
            return;
        }
        if (iZoijcleaow == 1) {
            uwvvkdfqfpVar.writeFixed64(iIobyxmoadg, ((Long) obj).longValue());
            return;
        }
        if (iZoijcleaow == 2) {
            uwvvkdfqfpVar.zoijcleaow(iIobyxmoadg, (gxszxtbevo) obj);
            return;
        }
        if (iZoijcleaow != 3) {
            if (iZoijcleaow != 5) {
                throw new RuntimeException(InvalidProtocolBufferException.nufgyqmvbu());
            }
            uwvvkdfqfpVar.writeFixed32(iIobyxmoadg, ((Integer) obj).intValue());
        } else if (uwvvkdfqfpVar.fieldOrder() == uwvvkdfqfp.iobyxmoadg.ASCENDING) {
            uwvvkdfqfpVar.writeStartGroup(iIobyxmoadg);
            ((okpsazkaxt) obj).vdvldrhtss(uwvvkdfqfpVar);
            uwvvkdfqfpVar.writeEndGroup(iIobyxmoadg);
        } else {
            uwvvkdfqfpVar.writeEndGroup(iIobyxmoadg);
            ((okpsazkaxt) obj).vdvldrhtss(uwvvkdfqfpVar);
            uwvvkdfqfpVar.writeStartGroup(iIobyxmoadg);
        }
    }

    private static boolean wkgbmnqykc(Object[] objArr, Object[] objArr2, int i13) {
        for (int i14 = 0; i14 < i13; i14++) {
            if (!objArr[i14].equals(objArr2[i14])) {
                return false;
            }
        }
        return true;
    }

    private void zoijcleaow() {
        int i13 = this.f8763iobyxmoadg;
        int[] iArr = this.f8766zoijcleaow;
        if (i13 == iArr.length) {
            int i14 = i13 + (i13 < 4 ? 8 : i13 >> 1);
            this.f8766zoijcleaow = Arrays.copyOf(iArr, i14);
            this.f8764ppxfxbqfkf = Arrays.copyOf(this.f8764ppxfxbqfkf, i14);
        }
    }

    void agtfadlqog(int i13, Object obj) {
        iobyxmoadg();
        zoijcleaow();
        int[] iArr = this.f8766zoijcleaow;
        int i14 = this.f8763iobyxmoadg;
        iArr[i14] = i13;
        this.f8764ppxfxbqfkf[i14] = obj;
        this.f8763iobyxmoadg = i14 + 1;
    }

    public void btonecajqb() {
        this.f8762eablkybsjg = false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof okpsazkaxt)) {
            return false;
        }
        okpsazkaxt okpsazkaxtVar = (okpsazkaxt) obj;
        int i13 = this.f8763iobyxmoadg;
        return i13 == okpsazkaxtVar.f8763iobyxmoadg && ppxfxbqfkf(this.f8766zoijcleaow, okpsazkaxtVar.f8766zoijcleaow, i13) && wkgbmnqykc(this.f8764ppxfxbqfkf, okpsazkaxtVar.f8764ppxfxbqfkf, this.f8763iobyxmoadg);
    }

    public int gxszxtbevo() {
        int iTzroggbefp;
        int i13 = this.f8765wkgbmnqykc;
        if (i13 != -1) {
            return i13;
        }
        int i14 = 0;
        for (int i15 = 0; i15 < this.f8763iobyxmoadg; i15++) {
            int i16 = this.f8766zoijcleaow[i15];
            int iIobyxmoadg = czzsidtyhn.iobyxmoadg(i16);
            int iZoijcleaow = czzsidtyhn.zoijcleaow(i16);
            if (iZoijcleaow == 0) {
                iTzroggbefp = CodedOutputStream.tzroggbefp(iIobyxmoadg, ((Long) this.f8764ppxfxbqfkf[i15]).longValue());
            } else if (iZoijcleaow == 1) {
                iTzroggbefp = CodedOutputStream.agtfadlqog(iIobyxmoadg, ((Long) this.f8764ppxfxbqfkf[i15]).longValue());
            } else if (iZoijcleaow == 2) {
                iTzroggbefp = CodedOutputStream.gxszxtbevo(iIobyxmoadg, (gxszxtbevo) this.f8764ppxfxbqfkf[i15]);
            } else if (iZoijcleaow == 3) {
                iTzroggbefp = (CodedOutputStream.wypolnanlu(iIobyxmoadg) * 2) + ((okpsazkaxt) this.f8764ppxfxbqfkf[i15]).gxszxtbevo();
            } else {
                if (iZoijcleaow != 5) {
                    throw new IllegalStateException(InvalidProtocolBufferException.nufgyqmvbu());
                }
                iTzroggbefp = CodedOutputStream.draadjrbmk(iIobyxmoadg, ((Integer) this.f8764ppxfxbqfkf[i15]).intValue());
            }
            i14 += iTzroggbefp;
        }
        this.f8765wkgbmnqykc = i14;
        return i14;
    }

    public int hashCode() {
        int i13 = this.f8763iobyxmoadg;
        return ((((527 + i13) * 31) + nufgyqmvbu(this.f8766zoijcleaow, i13)) * 31) + dxjokdxxww(this.f8764ppxfxbqfkf, this.f8763iobyxmoadg);
    }

    void iobyxmoadg() {
        if (!this.f8762eablkybsjg) {
            throw new UnsupportedOperationException();
        }
    }

    public int lqeggnwhkg() {
        int i13 = this.f8765wkgbmnqykc;
        if (i13 != -1) {
            return i13;
        }
        int iCdpycssgdh = 0;
        for (int i14 = 0; i14 < this.f8763iobyxmoadg; i14++) {
            iCdpycssgdh += CodedOutputStream.cdpycssgdh(czzsidtyhn.iobyxmoadg(this.f8766zoijcleaow[i14]), (gxszxtbevo) this.f8764ppxfxbqfkf[i14]);
        }
        this.f8765wkgbmnqykc = iCdpycssgdh;
        return iCdpycssgdh;
    }

    void ojitshcjhn(uwvvkdfqfp uwvvkdfqfpVar) {
        if (uwvvkdfqfpVar.fieldOrder() == uwvvkdfqfp.iobyxmoadg.DESCENDING) {
            for (int i13 = this.f8763iobyxmoadg - 1; i13 >= 0; i13--) {
                uwvvkdfqfpVar.writeMessageSetItem(czzsidtyhn.iobyxmoadg(this.f8766zoijcleaow[i13]), this.f8764ppxfxbqfkf[i13]);
            }
            return;
        }
        for (int i14 = 0; i14 < this.f8763iobyxmoadg; i14++) {
            uwvvkdfqfpVar.writeMessageSetItem(czzsidtyhn.iobyxmoadg(this.f8766zoijcleaow[i14]), this.f8764ppxfxbqfkf[i14]);
        }
    }

    public void vdvldrhtss(uwvvkdfqfp uwvvkdfqfpVar) {
        if (this.f8763iobyxmoadg == 0) {
            return;
        }
        if (uwvvkdfqfpVar.fieldOrder() == uwvvkdfqfp.iobyxmoadg.ASCENDING) {
            for (int i13 = 0; i13 < this.f8763iobyxmoadg; i13++) {
                rgvfuqvkyq(this.f8766zoijcleaow[i13], this.f8764ppxfxbqfkf[i13], uwvvkdfqfpVar);
            }
            return;
        }
        for (int i14 = this.f8763iobyxmoadg - 1; i14 >= 0; i14--) {
            rgvfuqvkyq(this.f8766zoijcleaow[i14], this.f8764ppxfxbqfkf[i14], uwvvkdfqfpVar);
        }
    }

    final void wflxmlrfwp(StringBuilder sb3, int i13) {
        for (int i14 = 0; i14 < this.f8763iobyxmoadg; i14++) {
            pkzmftpjix.ppxfxbqfkf(sb3, i13, String.valueOf(czzsidtyhn.iobyxmoadg(this.f8766zoijcleaow[i14])), this.f8764ppxfxbqfkf[i14]);
        }
    }

    private okpsazkaxt(int i13, int[] iArr, Object[] objArr, boolean z13) {
        this.f8765wkgbmnqykc = -1;
        this.f8763iobyxmoadg = i13;
        this.f8766zoijcleaow = iArr;
        this.f8764ppxfxbqfkf = objArr;
        this.f8762eablkybsjg = z13;
    }
}
