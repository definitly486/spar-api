package com.google.crypto.tink.shaded.protobuf;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class rlfsiqarku {

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private static final rlfsiqarku f24001gxszxtbevo = new rlfsiqarku(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private boolean f24002eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private int f24003iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private Object[] f24004ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private int f24005wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private int[] f24006zoijcleaow;

    private rlfsiqarku() {
        this(0, new int[8], new Object[8], true);
    }

    static rlfsiqarku btonecajqb(rlfsiqarku rlfsiqarkuVar, rlfsiqarku rlfsiqarkuVar2) {
        int i13 = rlfsiqarkuVar.f24003iobyxmoadg + rlfsiqarkuVar2.f24003iobyxmoadg;
        int[] iArrCopyOf = Arrays.copyOf(rlfsiqarkuVar.f24006zoijcleaow, i13);
        System.arraycopy(rlfsiqarkuVar2.f24006zoijcleaow, 0, iArrCopyOf, rlfsiqarkuVar.f24003iobyxmoadg, rlfsiqarkuVar2.f24003iobyxmoadg);
        Object[] objArrCopyOf = Arrays.copyOf(rlfsiqarkuVar.f24004ppxfxbqfkf, i13);
        System.arraycopy(rlfsiqarkuVar2.f24004ppxfxbqfkf, 0, objArrCopyOf, rlfsiqarkuVar.f24003iobyxmoadg, rlfsiqarkuVar2.f24003iobyxmoadg);
        return new rlfsiqarku(i13, iArrCopyOf, objArrCopyOf, true);
    }

    private static boolean draadjrbmk(Object[] objArr, Object[] objArr2, int i13) {
        for (int i14 = 0; i14 < i13; i14++) {
            if (!objArr[i14].equals(objArr2[i14])) {
                return false;
            }
        }
        return true;
    }

    static rlfsiqarku gtknphoqwx() {
        return new rlfsiqarku();
    }

    private static int gxszxtbevo(int[] iArr, int i13) {
        int i14 = 17;
        for (int i15 = 0; i15 < i13; i15++) {
            i14 = (i14 * 31) + iArr[i15];
        }
        return i14;
    }

    private static int lqeggnwhkg(Object[] objArr, int i13) {
        int iHashCode = 17;
        for (int i14 = 0; i14 < i13; i14++) {
            iHashCode = (iHashCode * 31) + objArr[i14].hashCode();
        }
        return iHashCode;
    }

    private static boolean ojitshcjhn(int[] iArr, int[] iArr2, int i13) {
        for (int i14 = 0; i14 < i13; i14++) {
            if (iArr[i14] != iArr2[i14]) {
                return false;
            }
        }
        return true;
    }

    public static rlfsiqarku ppxfxbqfkf() {
        return f24001gxszxtbevo;
    }

    private static void vdvldrhtss(int i13, Object obj, zfvoamnweg zfvoamnwegVar) {
        int iIobyxmoadg = sflfametgt.iobyxmoadg(i13);
        int iZoijcleaow = sflfametgt.zoijcleaow(i13);
        if (iZoijcleaow == 0) {
            zfvoamnwegVar.writeInt64(iIobyxmoadg, ((Long) obj).longValue());
            return;
        }
        if (iZoijcleaow == 1) {
            zfvoamnwegVar.writeFixed64(iIobyxmoadg, ((Long) obj).longValue());
            return;
        }
        if (iZoijcleaow == 2) {
            zfvoamnwegVar.wkgbmnqykc(iIobyxmoadg, (nufgyqmvbu) obj);
            return;
        }
        if (iZoijcleaow != 3) {
            if (iZoijcleaow != 5) {
                throw new RuntimeException(InvalidProtocolBufferException.dxjokdxxww());
            }
            zfvoamnwegVar.writeFixed32(iIobyxmoadg, ((Integer) obj).intValue());
        } else if (zfvoamnwegVar.fieldOrder() == zfvoamnweg.iobyxmoadg.ASCENDING) {
            zfvoamnwegVar.writeStartGroup(iIobyxmoadg);
            ((rlfsiqarku) obj).oxmwwwfdhm(zfvoamnwegVar);
            zfvoamnwegVar.writeEndGroup(iIobyxmoadg);
        } else {
            zfvoamnwegVar.writeEndGroup(iIobyxmoadg);
            ((rlfsiqarku) obj).oxmwwwfdhm(zfvoamnwegVar);
            zfvoamnwegVar.writeStartGroup(iIobyxmoadg);
        }
    }

    private void zoijcleaow(int i13) {
        int[] iArr = this.f24006zoijcleaow;
        if (i13 > iArr.length) {
            int i14 = this.f24003iobyxmoadg;
            int i15 = i14 + (i14 / 2);
            if (i15 >= i13) {
                i13 = i15;
            }
            if (i13 < 8) {
                i13 = 8;
            }
            this.f24006zoijcleaow = Arrays.copyOf(iArr, i13);
            this.f24004ppxfxbqfkf = Arrays.copyOf(this.f24004ppxfxbqfkf, i13);
        }
    }

    void agtfadlqog(int i13, Object obj) {
        iobyxmoadg();
        zoijcleaow(this.f24003iobyxmoadg + 1);
        int[] iArr = this.f24006zoijcleaow;
        int i14 = this.f24003iobyxmoadg;
        iArr[i14] = i13;
        this.f24004ppxfxbqfkf[i14] = obj;
        this.f24003iobyxmoadg = i14 + 1;
    }

    rlfsiqarku dxjokdxxww(rlfsiqarku rlfsiqarkuVar) {
        if (rlfsiqarkuVar.equals(ppxfxbqfkf())) {
            return this;
        }
        iobyxmoadg();
        int i13 = this.f24003iobyxmoadg + rlfsiqarkuVar.f24003iobyxmoadg;
        zoijcleaow(i13);
        System.arraycopy(rlfsiqarkuVar.f24006zoijcleaow, 0, this.f24006zoijcleaow, this.f24003iobyxmoadg, rlfsiqarkuVar.f24003iobyxmoadg);
        System.arraycopy(rlfsiqarkuVar.f24004ppxfxbqfkf, 0, this.f24004ppxfxbqfkf, this.f24003iobyxmoadg, rlfsiqarkuVar.f24003iobyxmoadg);
        this.f24003iobyxmoadg = i13;
        return this;
    }

    public int eablkybsjg() {
        int i13 = this.f24005wkgbmnqykc;
        if (i13 != -1) {
            return i13;
        }
        int iPmvmpeiblj = 0;
        for (int i14 = 0; i14 < this.f24003iobyxmoadg; i14++) {
            iPmvmpeiblj += CodedOutputStream.pmvmpeiblj(sflfametgt.iobyxmoadg(this.f24006zoijcleaow[i14]), (nufgyqmvbu) this.f24004ppxfxbqfkf[i14]);
        }
        this.f24005wkgbmnqykc = iPmvmpeiblj;
        return iPmvmpeiblj;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof rlfsiqarku)) {
            return false;
        }
        rlfsiqarku rlfsiqarkuVar = (rlfsiqarku) obj;
        int i13 = this.f24003iobyxmoadg;
        return i13 == rlfsiqarkuVar.f24003iobyxmoadg && ojitshcjhn(this.f24006zoijcleaow, rlfsiqarkuVar.f24006zoijcleaow, i13) && draadjrbmk(this.f24004ppxfxbqfkf, rlfsiqarkuVar.f24004ppxfxbqfkf, this.f24003iobyxmoadg);
    }

    public int hashCode() {
        int i13 = this.f24003iobyxmoadg;
        return ((((527 + i13) * 31) + gxszxtbevo(this.f24006zoijcleaow, i13)) * 31) + lqeggnwhkg(this.f24004ppxfxbqfkf, this.f24003iobyxmoadg);
    }

    void iobyxmoadg() {
        if (!this.f24002eablkybsjg) {
            throw new UnsupportedOperationException();
        }
    }

    public void nufgyqmvbu() {
        this.f24002eablkybsjg = false;
    }

    public void oxmwwwfdhm(zfvoamnweg zfvoamnwegVar) {
        if (this.f24003iobyxmoadg == 0) {
            return;
        }
        if (zfvoamnwegVar.fieldOrder() == zfvoamnweg.iobyxmoadg.ASCENDING) {
            for (int i13 = 0; i13 < this.f24003iobyxmoadg; i13++) {
                vdvldrhtss(this.f24006zoijcleaow[i13], this.f24004ppxfxbqfkf[i13], zfvoamnwegVar);
            }
            return;
        }
        for (int i14 = this.f24003iobyxmoadg - 1; i14 >= 0; i14--) {
            vdvldrhtss(this.f24006zoijcleaow[i14], this.f24004ppxfxbqfkf[i14], zfvoamnwegVar);
        }
    }

    void rgvfuqvkyq(zfvoamnweg zfvoamnwegVar) {
        if (zfvoamnwegVar.fieldOrder() == zfvoamnweg.iobyxmoadg.DESCENDING) {
            for (int i13 = this.f24003iobyxmoadg - 1; i13 >= 0; i13--) {
                zfvoamnwegVar.writeMessageSetItem(sflfametgt.iobyxmoadg(this.f24006zoijcleaow[i13]), this.f24004ppxfxbqfkf[i13]);
            }
            return;
        }
        for (int i14 = 0; i14 < this.f24003iobyxmoadg; i14++) {
            zfvoamnwegVar.writeMessageSetItem(sflfametgt.iobyxmoadg(this.f24006zoijcleaow[i14]), this.f24004ppxfxbqfkf[i14]);
        }
    }

    final void wflxmlrfwp(StringBuilder sb3, int i13) {
        for (int i14 = 0; i14 < this.f24003iobyxmoadg; i14++) {
            dsvhmnatus.wkgbmnqykc(sb3, i13, String.valueOf(sflfametgt.iobyxmoadg(this.f24006zoijcleaow[i14])), this.f24004ppxfxbqfkf[i14]);
        }
    }

    public int wkgbmnqykc() {
        int iDsvhmnatus;
        int i13 = this.f24005wkgbmnqykc;
        if (i13 != -1) {
            return i13;
        }
        int i14 = 0;
        for (int i15 = 0; i15 < this.f24003iobyxmoadg; i15++) {
            int i16 = this.f24006zoijcleaow[i15];
            int iIobyxmoadg = sflfametgt.iobyxmoadg(i16);
            int iZoijcleaow = sflfametgt.zoijcleaow(i16);
            if (iZoijcleaow == 0) {
                iDsvhmnatus = CodedOutputStream.dsvhmnatus(iIobyxmoadg, ((Long) this.f24004ppxfxbqfkf[i15]).longValue());
            } else if (iZoijcleaow == 1) {
                iDsvhmnatus = CodedOutputStream.agtfadlqog(iIobyxmoadg, ((Long) this.f24004ppxfxbqfkf[i15]).longValue());
            } else if (iZoijcleaow == 2) {
                iDsvhmnatus = CodedOutputStream.gxszxtbevo(iIobyxmoadg, (nufgyqmvbu) this.f24004ppxfxbqfkf[i15]);
            } else if (iZoijcleaow == 3) {
                iDsvhmnatus = (CodedOutputStream.jpowsppfya(iIobyxmoadg) * 2) + ((rlfsiqarku) this.f24004ppxfxbqfkf[i15]).wkgbmnqykc();
            } else {
                if (iZoijcleaow != 5) {
                    throw new IllegalStateException(InvalidProtocolBufferException.dxjokdxxww());
                }
                iDsvhmnatus = CodedOutputStream.draadjrbmk(iIobyxmoadg, ((Integer) this.f24004ppxfxbqfkf[i15]).intValue());
            }
            i14 += iDsvhmnatus;
        }
        this.f24005wkgbmnqykc = i14;
        return i14;
    }

    private rlfsiqarku(int i13, int[] iArr, Object[] objArr, boolean z13) {
        this.f24005wkgbmnqykc = -1;
        this.f24003iobyxmoadg = i13;
        this.f24006zoijcleaow = iArr;
        this.f24004ppxfxbqfkf = objArr;
        this.f24002eablkybsjg = z13;
    }
}
