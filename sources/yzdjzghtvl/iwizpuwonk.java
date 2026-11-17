package yzdjzghtvl;

/* JADX INFO: loaded from: classes.dex */
public final class iwizpuwonk {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private int f126931iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private int[] f126933zoijcleaow = new int[16];

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private ezmngbhpjk.cqumvgiudr[] f126932ppxfxbqfkf = new ezmngbhpjk.cqumvgiudr[16];

    private final int ppxfxbqfkf(int i13, Object obj, int i14) {
        int i15 = i13 - 1;
        while (true) {
            if (-1 >= i15 || this.f126933zoijcleaow[i15] != i14) {
                break;
            }
            ezmngbhpjk.cqumvgiudr cqumvgiudrVar = this.f126932ppxfxbqfkf[i15];
            if ((cqumvgiudrVar != null ? cqumvgiudrVar.get() : null) == obj) {
                return i15;
            }
            i15--;
        }
        int i16 = i13 + 1;
        int i17 = this.f126931iobyxmoadg;
        while (i16 < i17) {
            if (this.f126933zoijcleaow[i16] != i14) {
                return -(i16 + 1);
            }
            ezmngbhpjk.cqumvgiudr cqumvgiudrVar2 = this.f126932ppxfxbqfkf[i16];
            if ((cqumvgiudrVar2 != null ? cqumvgiudrVar2.get() : null) == obj) {
                return i16;
            }
            i16++;
        }
        i16 = this.f126931iobyxmoadg;
        return -(i16 + 1);
    }

    private final int zoijcleaow(Object obj, int i13) {
        int i14 = this.f126931iobyxmoadg - 1;
        int i15 = 0;
        while (i15 <= i14) {
            int i16 = (i15 + i14) >>> 1;
            int i17 = this.f126933zoijcleaow[i16];
            if (i17 < i13) {
                i15 = i16 + 1;
            } else {
                if (i17 <= i13) {
                    ezmngbhpjk.cqumvgiudr cqumvgiudrVar = this.f126932ppxfxbqfkf[i16];
                    return obj == (cqumvgiudrVar != null ? cqumvgiudrVar.get() : null) ? i16 : ppxfxbqfkf(i16, obj, i13);
                }
                i14 = i16 - 1;
            }
        }
        return -(i15 + 1);
    }

    public final int eablkybsjg() {
        return this.f126931iobyxmoadg;
    }

    public final ezmngbhpjk.cqumvgiudr[] gxszxtbevo() {
        return this.f126932ppxfxbqfkf;
    }

    public final boolean iobyxmoadg(Object obj) {
        int iZoijcleaow;
        int i13 = this.f126931iobyxmoadg;
        int iIobyxmoadg = ezmngbhpjk.oxmwwwfdhm.iobyxmoadg(obj);
        if (i13 > 0) {
            iZoijcleaow = zoijcleaow(obj, iIobyxmoadg);
            if (iZoijcleaow >= 0) {
                return false;
            }
        } else {
            iZoijcleaow = -1;
        }
        int i14 = -(iZoijcleaow + 1);
        ezmngbhpjk.cqumvgiudr[] cqumvgiudrVarArr = this.f126932ppxfxbqfkf;
        int length = cqumvgiudrVarArr.length;
        if (i13 == length) {
            int i15 = length * 2;
            ezmngbhpjk.cqumvgiudr[] cqumvgiudrVarArr2 = new ezmngbhpjk.cqumvgiudr[i15];
            int[] iArr = new int[i15];
            int i16 = i14 + 1;
            System.arraycopy(cqumvgiudrVarArr, i14, cqumvgiudrVarArr2, i16, i13 - i14);
            System.arraycopy(this.f126932ppxfxbqfkf, 0, cqumvgiudrVarArr2, 0, i14);
            hg.agtfadlqog.draadjrbmk(this.f126933zoijcleaow, iArr, i16, i14, i13);
            hg.agtfadlqog.vdvldrhtss(this.f126933zoijcleaow, iArr, 0, 0, i14, 6, null);
            this.f126932ppxfxbqfkf = cqumvgiudrVarArr2;
            this.f126933zoijcleaow = iArr;
        } else {
            int i17 = i14 + 1;
            System.arraycopy(cqumvgiudrVarArr, i14, cqumvgiudrVarArr, i17, i13 - i14);
            int[] iArr2 = this.f126933zoijcleaow;
            hg.agtfadlqog.draadjrbmk(iArr2, iArr2, i17, i14, i13);
        }
        this.f126932ppxfxbqfkf[i14] = new ezmngbhpjk.cqumvgiudr(obj);
        this.f126933zoijcleaow[i14] = iIobyxmoadg;
        this.f126931iobyxmoadg++;
        return true;
    }

    public final void lqeggnwhkg(int i13) {
        this.f126931iobyxmoadg = i13;
    }

    public final int[] wkgbmnqykc() {
        return this.f126933zoijcleaow;
    }
}
