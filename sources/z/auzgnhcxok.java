package z;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
final class auzgnhcxok {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private int f126960iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private androidx.compose.ui.layout.esjtqupxsv[] f126963zoijcleaow = new androidx.compose.ui.layout.esjtqupxsv[32];

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private float[] f126961ppxfxbqfkf = new float[32];

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private byte[] f126962wkgbmnqykc = new byte[32];

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private androidx.collection.wypolnanlu f126958eablkybsjg = androidx.collection.jhduphickx.zoijcleaow();

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final androidx.collection.wypolnanlu f126959gxszxtbevo = androidx.collection.jhduphickx.zoijcleaow();

    public final void eablkybsjg(androidx.compose.ui.layout.esjtqupxsv esjtqupxsvVar, float f13) {
        int iRoivzttewh = hg.agtfadlqog.roivzttewh(this.f126963zoijcleaow, esjtqupxsvVar);
        if (iRoivzttewh >= 0) {
            float[] fArr = this.f126961ppxfxbqfkf;
            if (fArr[iRoivzttewh] != f13) {
                fArr[iRoivzttewh] = f13;
                this.f126962wkgbmnqykc[iRoivzttewh] = 1;
                return;
            } else {
                byte[] bArr = this.f126962wkgbmnqykc;
                if (bArr[iRoivzttewh] == 2) {
                    bArr[iRoivzttewh] = 0;
                    return;
                }
                return;
            }
        }
        int i13 = this.f126960iobyxmoadg;
        androidx.compose.ui.layout.esjtqupxsv[] esjtqupxsvVarArr = this.f126963zoijcleaow;
        if (i13 == esjtqupxsvVarArr.length) {
            int i14 = i13 * 2;
            Object[] objArrCopyOf = Arrays.copyOf(esjtqupxsvVarArr, i14);
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(objArrCopyOf, "copyOf(...)");
            this.f126963zoijcleaow = (androidx.compose.ui.layout.esjtqupxsv[]) objArrCopyOf;
            float[] fArrCopyOf = Arrays.copyOf(this.f126961ppxfxbqfkf, i14);
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(fArrCopyOf, "copyOf(...)");
            this.f126961ppxfxbqfkf = fArrCopyOf;
            byte[] bArrCopyOf = Arrays.copyOf(this.f126962wkgbmnqykc, i14);
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(bArrCopyOf, "copyOf(...)");
            this.f126962wkgbmnqykc = bArrCopyOf;
        }
        this.f126963zoijcleaow[i13] = esjtqupxsvVar;
        this.f126962wkgbmnqykc[i13] = 3;
        this.f126961ppxfxbqfkf[i13] = f13;
        this.f126960iobyxmoadg++;
    }

    public final void iobyxmoadg() {
        int i13 = this.f126960iobyxmoadg;
        for (int i14 = 0; i14 < i13; i14++) {
            this.f126963zoijcleaow[i14] = null;
            this.f126961ppxfxbqfkf[i14] = Float.NaN;
            this.f126962wkgbmnqykc[i14] = 0;
        }
        this.f126960iobyxmoadg = 0;
    }

    public final float ppxfxbqfkf(androidx.compose.ui.layout.esjtqupxsv esjtqupxsvVar, float f13) {
        int iRoivzttewh = hg.agtfadlqog.roivzttewh(this.f126963zoijcleaow, esjtqupxsvVar);
        return iRoivzttewh < 0 ? f13 : this.f126961ppxfxbqfkf[iRoivzttewh];
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00bc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x00be A[LOOP:3: B:28:0x0085->B:42:0x00be, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:79:0x00c3 A[EDGE_INSN: B:79:0x00c3->B:43:0x00c3 BREAK  A[LOOP:3: B:28:0x0085->B:42:0x00be], SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public final void wkgbmnqykc(boolean z13, tzroggbefp tzroggbefpVar, androidx.collection.dsvhmnatus dsvhmnatusVar) {
        pkzmftpjix pkzmftpjixVar;
        int i13 = this.f126960iobyxmoadg;
        for (int i14 = 0; i14 < i13; i14++) {
            byte b13 = this.f126962wkgbmnqykc[i14];
            if (b13 == 3) {
                androidx.collection.wypolnanlu wypolnanluVar = this.f126959gxszxtbevo;
                androidx.compose.ui.layout.esjtqupxsv esjtqupxsvVar = this.f126963zoijcleaow[i14];
                kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(esjtqupxsvVar);
                wypolnanluVar.cqumvgiudr(esjtqupxsvVar);
            } else if (b13 != 0 && dsvhmnatusVar != null) {
                androidx.compose.ui.layout.esjtqupxsv esjtqupxsvVar2 = this.f126963zoijcleaow[i14];
                kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(esjtqupxsvVar2);
                androidx.collection.wypolnanlu wypolnanluVar2 = (androidx.collection.wypolnanlu) dsvhmnatusVar.yggfygwlhe(esjtqupxsvVar2);
                if (wypolnanluVar2 != null) {
                    this.f126958eablkybsjg.jyumaefscl(wypolnanluVar2);
                }
            }
        }
        int i15 = this.f126960iobyxmoadg;
        int i16 = 0;
        for (int i17 = 0; i17 < i15; i17++) {
            byte[] bArr = this.f126962wkgbmnqykc;
            if (bArr[i17] == 2) {
                i16++;
            } else if (i16 > 0) {
                androidx.compose.ui.layout.esjtqupxsv[] esjtqupxsvVarArr = this.f126963zoijcleaow;
                esjtqupxsvVarArr[i17 - i16] = esjtqupxsvVarArr[i17];
            }
            bArr[i17] = 2;
        }
        int i18 = this.f126960iobyxmoadg;
        for (int i19 = i18 - i16; i19 < i18; i19++) {
            this.f126963zoijcleaow[i19] = null;
        }
        this.f126960iobyxmoadg -= i16;
        tzroggbefp tzroggbefpVarH = tzroggbefpVar.H();
        androidx.collection.wypolnanlu wypolnanluVar3 = this.f126959gxszxtbevo;
        Object[] objArr = wypolnanluVar3.f4398zoijcleaow;
        long[] jArr = wypolnanluVar3.f4395iobyxmoadg;
        int length = jArr.length - 2;
        long j13 = 255;
        if (length >= 0) {
            int i23 = 0;
            while (true) {
                long j14 = jArr[i23];
                if ((((~j14) << 7) & j14 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i24 = 8 - ((~(i23 - length)) >>> 31);
                    int i25 = 0;
                    while (i25 < i24) {
                        if ((j14 & j13) < 128) {
                            (tzroggbefpVarH == null ? tzroggbefpVar : tzroggbefpVarH).Y((androidx.compose.ui.layout.esjtqupxsv) objArr[(i23 << 3) + i25]);
                        }
                        j14 >>= 8;
                        i25++;
                        j13 = 255;
                    }
                    if (i24 != 8) {
                        break;
                    }
                    if (i23 != length) {
                        break;
                    }
                    i23++;
                    j13 = 255;
                } else if (i23 != length) {
                    break;
                    break;
                } else {
                    i23++;
                    j13 = 255;
                }
            }
        }
        this.f126959gxszxtbevo.wflxmlrfwp();
        androidx.collection.wypolnanlu wypolnanluVar4 = this.f126958eablkybsjg;
        Object[] objArr2 = wypolnanluVar4.f4398zoijcleaow;
        long[] jArr2 = wypolnanluVar4.f4395iobyxmoadg;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i26 = 0;
            while (true) {
                long j15 = jArr2[i26];
                if ((((~j15) << 7) & j15 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i27 = 8 - ((~(i26 - length2)) >>> 31);
                    for (int i28 = 0; i28 < i27; i28++) {
                        if ((j15 & 255) < 128 && (pkzmftpjixVar = (pkzmftpjix) ((grlcpdaxtj) objArr2[(i26 << 3) + i28]).get()) != null) {
                            if (z13) {
                                pkzmftpjixVar.H(false);
                            } else {
                                pkzmftpjixVar.L(false);
                            }
                        }
                        j15 >>= 8;
                    }
                    if (i27 != 8) {
                        break;
                    }
                }
                if (i26 == length2) {
                    break;
                } else {
                    i26++;
                }
            }
        }
        this.f126958eablkybsjg.wflxmlrfwp();
    }

    public final boolean zoijcleaow(androidx.compose.ui.layout.esjtqupxsv esjtqupxsvVar) {
        return hg.agtfadlqog.okpsazkaxt(this.f126963zoijcleaow, esjtqupxsvVar);
    }
}
