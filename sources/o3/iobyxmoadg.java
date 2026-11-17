package o3;

import io.appmetrica.analytics.AppMetricaDefaultValues;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class iobyxmoadg extends ppxfxbqfkf {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private final int f71852agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final long f71853btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final long f71854draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final p3.wkgbmnqykc f71855dxjokdxxww;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final long f71856gtknphoqwx;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private long f71857iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private long f71858jyumaefscl;

    /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
    private float f71859kcexrzcfyt;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private final float f71860ojitshcjhn;

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    private final y2.dxjokdxxww f71861oxmwwwfdhm;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private final float f71862rgvfuqvkyq;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    private final com.google.common.collect.zdlpuopuiu f71863vdvldrhtss;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final int f71864wflxmlrfwp;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private int f71865yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private int f71866zdlpuopuiu;

    /* JADX INFO: renamed from: o3.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C1553iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public final long f71867iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public final long f71868zoijcleaow;

        public C1553iobyxmoadg(long j13, long j14) {
            this.f71867iobyxmoadg = j13;
            this.f71868zoijcleaow = j14;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1553iobyxmoadg)) {
                return false;
            }
            C1553iobyxmoadg c1553iobyxmoadg = (C1553iobyxmoadg) obj;
            return this.f71867iobyxmoadg == c1553iobyxmoadg.f71867iobyxmoadg && this.f71868zoijcleaow == c1553iobyxmoadg.f71868zoijcleaow;
        }

        public int hashCode() {
            return (((int) this.f71867iobyxmoadg) * 31) + ((int) this.f71868zoijcleaow);
        }
    }

    public static class zoijcleaow implements esjtqupxsv.zoijcleaow {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private final int f71869eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private final float f71870gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final int f71871iobyxmoadg;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        private final float f71872lqeggnwhkg;

        /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
        private final y2.dxjokdxxww f71873nufgyqmvbu;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final int f71874ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final int f71875wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final int f71876zoijcleaow;

        public zoijcleaow() {
            this(AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_COUNT_UPPER_BOUND, 25000, 25000, 0.7f);
        }

        @Override // o3.esjtqupxsv.zoijcleaow
        public final esjtqupxsv[] iobyxmoadg(esjtqupxsv.iobyxmoadg[] iobyxmoadgVarArr, p3.wkgbmnqykc wkgbmnqykcVar, androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow zoijcleaowVar, v2.cdpycssgdh cdpycssgdhVar) {
            com.google.common.collect.zdlpuopuiu zdlpuopuiuVarOxmwwwfdhm = iobyxmoadg.oxmwwwfdhm(iobyxmoadgVarArr);
            esjtqupxsv[] esjtqupxsvVarArr = new esjtqupxsv[iobyxmoadgVarArr.length];
            for (int i13 = 0; i13 < iobyxmoadgVarArr.length; i13++) {
                esjtqupxsv.iobyxmoadg iobyxmoadgVar = iobyxmoadgVarArr[i13];
                if (iobyxmoadgVar != null) {
                    int[] iArr = iobyxmoadgVar.f71848zoijcleaow;
                    if (iArr.length != 0) {
                        esjtqupxsvVarArr[i13] = iArr.length == 1 ? new lereixgezr(iobyxmoadgVar.f71846iobyxmoadg, iArr[0], iobyxmoadgVar.f71847ppxfxbqfkf) : zoijcleaow(iobyxmoadgVar.f71846iobyxmoadg, iArr, iobyxmoadgVar.f71847ppxfxbqfkf, wkgbmnqykcVar, (com.google.common.collect.zdlpuopuiu) zdlpuopuiuVarOxmwwwfdhm.get(i13));
                    }
                }
            }
            return esjtqupxsvVarArr;
        }

        protected iobyxmoadg zoijcleaow(v2.yadqdtsiqt yadqdtsiqtVar, int[] iArr, int i13, p3.wkgbmnqykc wkgbmnqykcVar, com.google.common.collect.zdlpuopuiu zdlpuopuiuVar) {
            return new iobyxmoadg(yadqdtsiqtVar, iArr, i13, wkgbmnqykcVar, this.f71871iobyxmoadg, this.f71876zoijcleaow, this.f71874ppxfxbqfkf, this.f71875wkgbmnqykc, this.f71869eablkybsjg, this.f71870gxszxtbevo, this.f71872lqeggnwhkg, zdlpuopuiuVar, this.f71873nufgyqmvbu);
        }

        public zoijcleaow(int i13, int i14, int i15, float f13) {
            this(i13, i14, i15, 1279, 719, f13, 0.75f, y2.dxjokdxxww.f123544iobyxmoadg);
        }

        public zoijcleaow(int i13, int i14, int i15, int i16, int i17, float f13, float f14, y2.dxjokdxxww dxjokdxxwwVar) {
            this.f71871iobyxmoadg = i13;
            this.f71876zoijcleaow = i14;
            this.f71874ppxfxbqfkf = i15;
            this.f71875wkgbmnqykc = i16;
            this.f71869eablkybsjg = i17;
            this.f71870gxszxtbevo = f13;
            this.f71872lqeggnwhkg = f14;
            this.f71873nufgyqmvbu = dxjokdxxwwVar;
        }
    }

    protected iobyxmoadg(v2.yadqdtsiqt yadqdtsiqtVar, int[] iArr, int i13, p3.wkgbmnqykc wkgbmnqykcVar, long j13, long j14, long j15, int i14, int i15, float f13, float f14, List list, y2.dxjokdxxww dxjokdxxwwVar) {
        long j16;
        super(yadqdtsiqtVar, iArr, i13);
        if (j15 < j13) {
            y2.kcexrzcfyt.nufgyqmvbu("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            j16 = j13;
        } else {
            j16 = j15;
        }
        this.f71855dxjokdxxww = wkgbmnqykcVar;
        this.f71853btonecajqb = j13 * 1000;
        this.f71856gtknphoqwx = j14 * 1000;
        this.f71854draadjrbmk = j16 * 1000;
        this.f71864wflxmlrfwp = i14;
        this.f71852agtfadlqog = i15;
        this.f71860ojitshcjhn = f13;
        this.f71862rgvfuqvkyq = f14;
        this.f71863vdvldrhtss = com.google.common.collect.zdlpuopuiu.jyumaefscl(list);
        this.f71861oxmwwwfdhm = dxjokdxxwwVar;
        this.f71859kcexrzcfyt = 1.0f;
        this.f71865yggfygwlhe = 0;
        this.f71858jyumaefscl = -9223372036854775807L;
        this.f71857iwizpuwonk = -2147483647L;
    }

    private static long[][] kcexrzcfyt(esjtqupxsv.iobyxmoadg[] iobyxmoadgVarArr) {
        long[][] jArr = new long[iobyxmoadgVarArr.length][];
        for (int i13 = 0; i13 < iobyxmoadgVarArr.length; i13++) {
            esjtqupxsv.iobyxmoadg iobyxmoadgVar = iobyxmoadgVarArr[i13];
            if (iobyxmoadgVar == null) {
                jArr[i13] = new long[0];
            } else {
                jArr[i13] = new long[iobyxmoadgVar.f71848zoijcleaow.length];
                int i14 = 0;
                while (true) {
                    int[] iArr = iobyxmoadgVar.f71848zoijcleaow;
                    if (i14 >= iArr.length) {
                        break;
                    }
                    long j13 = iobyxmoadgVar.f71846iobyxmoadg.iobyxmoadg(iArr[i14]).f9745btonecajqb;
                    long[] jArr2 = jArr[i13];
                    if (j13 == -1) {
                        j13 = 0;
                    }
                    jArr2[i14] = j13;
                    i14++;
                }
                Arrays.sort(jArr[i13]);
            }
        }
        return jArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.common.collect.zdlpuopuiu oxmwwwfdhm(esjtqupxsv.iobyxmoadg[] iobyxmoadgVarArr) {
        ArrayList arrayList = new ArrayList();
        for (esjtqupxsv.iobyxmoadg iobyxmoadgVar : iobyxmoadgVarArr) {
            if (iobyxmoadgVar == null || iobyxmoadgVar.f71848zoijcleaow.length <= 1) {
                arrayList.add(null);
            } else {
                com.google.common.collect.zdlpuopuiu.iobyxmoadg iobyxmoadgVarKcexrzcfyt = com.google.common.collect.zdlpuopuiu.kcexrzcfyt();
                iobyxmoadgVarKcexrzcfyt.iobyxmoadg(new C1553iobyxmoadg(0L, 0L));
                arrayList.add(iobyxmoadgVarKcexrzcfyt);
            }
        }
        long[][] jArrKcexrzcfyt = kcexrzcfyt(iobyxmoadgVarArr);
        int[] iArr = new int[jArrKcexrzcfyt.length];
        long[] jArr = new long[jArrKcexrzcfyt.length];
        for (int i13 = 0; i13 < jArrKcexrzcfyt.length; i13++) {
            long[] jArr2 = jArrKcexrzcfyt[i13];
            jArr[i13] = jArr2.length == 0 ? 0L : jArr2[0];
        }
        vdvldrhtss(arrayList, jArr);
        com.google.common.collect.zdlpuopuiu zdlpuopuiuVarZdlpuopuiu = zdlpuopuiu(jArrKcexrzcfyt);
        for (int i14 = 0; i14 < zdlpuopuiuVarZdlpuopuiu.size(); i14++) {
            int iIntValue = ((Integer) zdlpuopuiuVarZdlpuopuiu.get(i14)).intValue();
            int i15 = iArr[iIntValue] + 1;
            iArr[iIntValue] = i15;
            jArr[iIntValue] = jArrKcexrzcfyt[iIntValue][i15];
            vdvldrhtss(arrayList, jArr);
        }
        for (int i16 = 0; i16 < iobyxmoadgVarArr.length; i16++) {
            if (arrayList.get(i16) != null) {
                jArr[i16] = jArr[i16] * 2;
            }
        }
        vdvldrhtss(arrayList, jArr);
        com.google.common.collect.zdlpuopuiu.iobyxmoadg iobyxmoadgVarKcexrzcfyt2 = com.google.common.collect.zdlpuopuiu.kcexrzcfyt();
        for (int i17 = 0; i17 < arrayList.size(); i17++) {
            com.google.common.collect.zdlpuopuiu.iobyxmoadg iobyxmoadgVar2 = (com.google.common.collect.zdlpuopuiu.iobyxmoadg) arrayList.get(i17);
            iobyxmoadgVarKcexrzcfyt2.iobyxmoadg(iobyxmoadgVar2 == null ? com.google.common.collect.zdlpuopuiu.zynmafqrjb() : iobyxmoadgVar2.gtknphoqwx());
        }
        return iobyxmoadgVarKcexrzcfyt2.gtknphoqwx();
    }

    private static void vdvldrhtss(List list, long[] jArr) {
        long j13 = 0;
        for (long j14 : jArr) {
            j13 += j14;
        }
        for (int i13 = 0; i13 < list.size(); i13++) {
            com.google.common.collect.zdlpuopuiu.iobyxmoadg iobyxmoadgVar = (com.google.common.collect.zdlpuopuiu.iobyxmoadg) list.get(i13);
            if (iobyxmoadgVar != null) {
                iobyxmoadgVar.iobyxmoadg(new C1553iobyxmoadg(j13, jArr[i13]));
            }
        }
    }

    private static com.google.common.collect.zdlpuopuiu zdlpuopuiu(long[][] jArr) {
        com.google.common.collect.esjtqupxsv esjtqupxsvVarEablkybsjg = com.google.common.collect.cdpycssgdh.ppxfxbqfkf().iobyxmoadg().eablkybsjg();
        for (int i13 = 0; i13 < jArr.length; i13++) {
            long[] jArr2 = jArr[i13];
            if (jArr2.length > 1) {
                int length = jArr2.length;
                double[] dArr = new double[length];
                int i14 = 0;
                while (true) {
                    long[] jArr3 = jArr[i13];
                    double dLog = 0.0d;
                    if (i14 >= jArr3.length) {
                        break;
                    }
                    long j13 = jArr3[i14];
                    if (j13 != -1) {
                        dLog = Math.log(j13);
                    }
                    dArr[i14] = dLog;
                    i14++;
                }
                int i15 = length - 1;
                double d13 = dArr[i15] - dArr[0];
                int i16 = 0;
                while (i16 < i15) {
                    double d14 = dArr[i16];
                    i16++;
                    esjtqupxsvVarEablkybsjg.put(Double.valueOf(d13 == 0.0d ? 1.0d : (((d14 + dArr[i16]) * 0.5d) - dArr[0]) / d13), Integer.valueOf(i13));
                }
            }
        }
        return com.google.common.collect.zdlpuopuiu.jyumaefscl(esjtqupxsvVarEablkybsjg.values());
    }

    @Override // o3.ppxfxbqfkf, o3.esjtqupxsv
    public void btonecajqb() {
        this.f71858jyumaefscl = -9223372036854775807L;
    }

    @Override // o3.ppxfxbqfkf, o3.esjtqupxsv
    public void gxszxtbevo() {
    }

    @Override // o3.esjtqupxsv
    public int iobyxmoadg() {
        return this.f71866zdlpuopuiu;
    }

    @Override // o3.ppxfxbqfkf, o3.esjtqupxsv
    public void wkgbmnqykc(float f13) {
        this.f71859kcexrzcfyt = f13;
    }
}
