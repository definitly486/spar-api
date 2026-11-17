package androidx.media3.exoplayer.source;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class MergingMediaSource extends androidx.media3.exoplayer.source.ppxfxbqfkf {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private static final v2.kcexrzcfyt f11080iwizpuwonk = new v2.kcexrzcfyt.ppxfxbqfkf().wkgbmnqykc("MergingMediaSource").iobyxmoadg();

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private final List f11081agtfadlqog;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final boolean f11082draadjrbmk;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final boolean f11083gtknphoqwx;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private IllegalMergeException f11084jyumaefscl;

    /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
    private final com.google.common.collect.istkbnxepw f11085kcexrzcfyt;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private final v2.cdpycssgdh[] f11086ojitshcjhn;

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    private final Map f11087oxmwwwfdhm;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private final ArrayList f11088rgvfuqvkyq;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    private final m3.eablkybsjg f11089vdvldrhtss;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final oxmwwwfdhm[] f11090wflxmlrfwp;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private long[][] f11091yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private int f11092zdlpuopuiu;

    public static final class IllegalMergeException extends IOException {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public final int f11093zdlpuopuiu;

        public IllegalMergeException(int i13) {
            this.f11093zdlpuopuiu = i13;
        }
    }

    private static final class ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final oxmwwwfdhm.zoijcleaow f11094iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final vdvldrhtss f11095zoijcleaow;

        private ppxfxbqfkf(oxmwwwfdhm.zoijcleaow zoijcleaowVar, vdvldrhtss vdvldrhtssVar) {
            this.f11094iobyxmoadg = zoijcleaowVar;
            this.f11095zoijcleaow = vdvldrhtssVar;
        }
    }

    private static final class zoijcleaow extends wflxmlrfwp {

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private final long[] f11096gxszxtbevo;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        private final long[] f11097lqeggnwhkg;

        public zoijcleaow(v2.cdpycssgdh cdpycssgdhVar, Map map) {
            super(cdpycssgdhVar);
            int iRgvfuqvkyq = cdpycssgdhVar.rgvfuqvkyq();
            this.f11097lqeggnwhkg = new long[cdpycssgdhVar.rgvfuqvkyq()];
            v2.cdpycssgdh.ppxfxbqfkf ppxfxbqfkfVar = new v2.cdpycssgdh.ppxfxbqfkf();
            for (int i13 = 0; i13 < iRgvfuqvkyq; i13++) {
                this.f11097lqeggnwhkg[i13] = cdpycssgdhVar.agtfadlqog(i13, ppxfxbqfkfVar).f115292wflxmlrfwp;
            }
            int iDxjokdxxww = cdpycssgdhVar.dxjokdxxww();
            this.f11096gxszxtbevo = new long[iDxjokdxxww];
            v2.cdpycssgdh.zoijcleaow zoijcleaowVar = new v2.cdpycssgdh.zoijcleaow();
            for (int i14 = 0; i14 < iDxjokdxxww; i14++) {
                cdpycssgdhVar.lqeggnwhkg(i14, zoijcleaowVar, true);
                long jLongValue = ((Long) y2.iobyxmoadg.eablkybsjg((Long) map.get(zoijcleaowVar.f115306zoijcleaow))).longValue();
                long[] jArr = this.f11096gxszxtbevo;
                jLongValue = jLongValue == Long.MIN_VALUE ? zoijcleaowVar.f115305wkgbmnqykc : jLongValue;
                jArr[i14] = jLongValue;
                long j13 = zoijcleaowVar.f115305wkgbmnqykc;
                if (j13 != -9223372036854775807L) {
                    long[] jArr2 = this.f11097lqeggnwhkg;
                    int i15 = zoijcleaowVar.f115304ppxfxbqfkf;
                    jArr2[i15] = jArr2[i15] - (j13 - jLongValue);
                }
            }
        }

        @Override // androidx.media3.exoplayer.source.wflxmlrfwp, v2.cdpycssgdh
        public v2.cdpycssgdh.zoijcleaow lqeggnwhkg(int i13, v2.cdpycssgdh.zoijcleaow zoijcleaowVar, boolean z13) {
            super.lqeggnwhkg(i13, zoijcleaowVar, z13);
            zoijcleaowVar.f115305wkgbmnqykc = this.f11096gxszxtbevo[i13];
            return zoijcleaowVar;
        }

        /* JADX WARN: Code duplicated, block: B:8:0x001e  */
        @Override // androidx.media3.exoplayer.source.wflxmlrfwp, v2.cdpycssgdh
        public v2.cdpycssgdh.ppxfxbqfkf ojitshcjhn(int i13, v2.cdpycssgdh.ppxfxbqfkf ppxfxbqfkfVar, long j13) {
            long jMin;
            super.ojitshcjhn(i13, ppxfxbqfkfVar, j13);
            long j14 = this.f11097lqeggnwhkg[i13];
            ppxfxbqfkfVar.f115292wflxmlrfwp = j14;
            if (j14 != -9223372036854775807L) {
                long j15 = ppxfxbqfkfVar.f115281draadjrbmk;
                if (j15 == -9223372036854775807L) {
                    jMin = ppxfxbqfkfVar.f115281draadjrbmk;
                } else {
                    jMin = Math.min(j15, j14);
                }
            } else {
                jMin = ppxfxbqfkfVar.f115281draadjrbmk;
            }
            ppxfxbqfkfVar.f115281draadjrbmk = jMin;
            return ppxfxbqfkfVar;
        }
    }

    public MergingMediaSource(oxmwwwfdhm... oxmwwwfdhmVarArr) {
        this(false, oxmwwwfdhmVarArr);
    }

    private void jpowsppfya() {
        v2.cdpycssgdh[] cdpycssgdhVarArr;
        v2.cdpycssgdh.zoijcleaow zoijcleaowVar = new v2.cdpycssgdh.zoijcleaow();
        for (int i13 = 0; i13 < this.f11092zdlpuopuiu; i13++) {
            int i14 = 0;
            long j13 = Long.MIN_VALUE;
            while (true) {
                cdpycssgdhVarArr = this.f11086ojitshcjhn;
                if (i14 >= cdpycssgdhVarArr.length) {
                    break;
                }
                long jBtonecajqb = cdpycssgdhVarArr[i14].gxszxtbevo(i13, zoijcleaowVar).btonecajqb();
                if (jBtonecajqb != -9223372036854775807L) {
                    long j14 = jBtonecajqb + this.f11091yggfygwlhe[i13][i14];
                    if (j13 == Long.MIN_VALUE || j14 < j13) {
                        j13 = j14;
                    }
                }
                i14++;
            }
            Object objWflxmlrfwp = cdpycssgdhVarArr[0].wflxmlrfwp(i13);
            this.f11087oxmwwwfdhm.put(objWflxmlrfwp, Long.valueOf(j13));
            Iterator it = this.f11085kcexrzcfyt.get(objWflxmlrfwp).iterator();
            while (it.hasNext()) {
                ((androidx.media3.exoplayer.source.zoijcleaow) it.next()).jyumaefscl(0L, j13);
            }
        }
    }

    private void ylkuphrtab() {
        v2.cdpycssgdh.zoijcleaow zoijcleaowVar = new v2.cdpycssgdh.zoijcleaow();
        for (int i13 = 0; i13 < this.f11092zdlpuopuiu; i13++) {
            long j13 = -this.f11086ojitshcjhn[0].gxszxtbevo(i13, zoijcleaowVar).agtfadlqog();
            int i14 = 1;
            while (true) {
                v2.cdpycssgdh[] cdpycssgdhVarArr = this.f11086ojitshcjhn;
                if (i14 < cdpycssgdhVarArr.length) {
                    this.f11091yggfygwlhe[i13][i14] = j13 - (-cdpycssgdhVarArr[i14].gxszxtbevo(i13, zoijcleaowVar).agtfadlqog());
                    i14++;
                }
            }
        }
    }

    @Override // androidx.media3.exoplayer.source.oxmwwwfdhm
    public void btonecajqb(v2.kcexrzcfyt kcexrzcfytVar) {
        this.f11090wflxmlrfwp[0].btonecajqb(kcexrzcfytVar);
    }

    @Override // androidx.media3.exoplayer.source.ppxfxbqfkf, androidx.media3.exoplayer.source.iobyxmoadg
    protected void esjtqupxsv(b3.wflxmlrfwp wflxmlrfwpVar) {
        super.esjtqupxsv(wflxmlrfwpVar);
        for (int i13 = 0; i13 < this.f11090wflxmlrfwp.length; i13++) {
            wwaezpbzkn(Integer.valueOf(i13), this.f11090wflxmlrfwp[i13]);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.media3.exoplayer.source.ppxfxbqfkf
    /* JADX INFO: renamed from: hcddaimhww, reason: merged with bridge method [inline-methods] */
    public void iozdgvuglv(Integer num, oxmwwwfdhm oxmwwwfdhmVar, v2.cdpycssgdh cdpycssgdhVar) {
        if (this.f11084jyumaefscl != null) {
            return;
        }
        if (this.f11092zdlpuopuiu == -1) {
            this.f11092zdlpuopuiu = cdpycssgdhVar.dxjokdxxww();
        } else if (cdpycssgdhVar.dxjokdxxww() != this.f11092zdlpuopuiu) {
            this.f11084jyumaefscl = new IllegalMergeException(0);
            return;
        }
        if (this.f11091yggfygwlhe.length == 0) {
            this.f11091yggfygwlhe = (long[][]) Array.newInstance((Class<?>) Long.TYPE, this.f11092zdlpuopuiu, this.f11086ojitshcjhn.length);
        }
        this.f11088rgvfuqvkyq.remove(oxmwwwfdhmVar);
        this.f11086ojitshcjhn[num.intValue()] = cdpycssgdhVar;
        if (this.f11088rgvfuqvkyq.isEmpty()) {
            if (this.f11083gtknphoqwx) {
                ylkuphrtab();
            }
            v2.cdpycssgdh zoijcleaowVar = this.f11086ojitshcjhn[0];
            if (this.f11082draadjrbmk) {
                jpowsppfya();
                zoijcleaowVar = new zoijcleaow(zoijcleaowVar, this.f11087oxmwwwfdhm);
            }
            lereixgezr(zoijcleaowVar);
        }
    }

    @Override // androidx.media3.exoplayer.source.oxmwwwfdhm
    public void lqeggnwhkg(vdvldrhtss vdvldrhtssVar) {
        if (this.f11082draadjrbmk) {
            androidx.media3.exoplayer.source.zoijcleaow zoijcleaowVar = (androidx.media3.exoplayer.source.zoijcleaow) vdvldrhtssVar;
            for (Map.Entry entry : this.f11085kcexrzcfyt.iobyxmoadg()) {
                if (((androidx.media3.exoplayer.source.zoijcleaow) entry.getValue()).equals(zoijcleaowVar)) {
                    this.f11085kcexrzcfyt.remove(entry.getKey(), entry.getValue());
                    break;
                }
            }
            vdvldrhtssVar = zoijcleaowVar.f11340zdlpuopuiu;
        }
        jyumaefscl jyumaefsclVar = (jyumaefscl) vdvldrhtssVar;
        for (int i13 = 0; i13 < this.f11090wflxmlrfwp.length; i13++) {
            List list = (List) this.f11081agtfadlqog.get(i13);
            for (int i14 = 0; i14 < list.size(); i14++) {
                if (((ppxfxbqfkf) list.get(i14)).f11095zoijcleaow.equals(vdvldrhtssVar)) {
                    list.remove(i14);
                    break;
                }
            }
            this.f11090wflxmlrfwp[i13].lqeggnwhkg(jyumaefsclVar.gtknphoqwx(i13));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.media3.exoplayer.source.ppxfxbqfkf
    /* JADX INFO: renamed from: pkzmftpjix, reason: merged with bridge method [inline-methods] */
    public oxmwwwfdhm.zoijcleaow istkbnxepw(Integer num, oxmwwwfdhm.zoijcleaow zoijcleaowVar) {
        List list = (List) this.f11081agtfadlqog.get(num.intValue());
        for (int i13 = 0; i13 < list.size(); i13++) {
            if (((ppxfxbqfkf) list.get(i13)).f11094iobyxmoadg.equals(zoijcleaowVar)) {
                return ((ppxfxbqfkf) ((List) this.f11081agtfadlqog.get(0)).get(i13)).f11094iobyxmoadg;
            }
        }
        return null;
    }

    @Override // androidx.media3.exoplayer.source.ppxfxbqfkf, androidx.media3.exoplayer.source.iobyxmoadg
    protected void pmvmpeiblj() {
        super.pmvmpeiblj();
        Arrays.fill(this.f11086ojitshcjhn, (Object) null);
        this.f11092zdlpuopuiu = -1;
        this.f11084jyumaefscl = null;
        this.f11088rgvfuqvkyq.clear();
        Collections.addAll(this.f11088rgvfuqvkyq, this.f11090wflxmlrfwp);
    }

    @Override // androidx.media3.exoplayer.source.oxmwwwfdhm
    public v2.kcexrzcfyt ppxfxbqfkf() {
        oxmwwwfdhm[] oxmwwwfdhmVarArr = this.f11090wflxmlrfwp;
        return oxmwwwfdhmVarArr.length > 0 ? oxmwwwfdhmVarArr[0].ppxfxbqfkf() : f11080iwizpuwonk;
    }

    @Override // androidx.media3.exoplayer.source.oxmwwwfdhm
    public vdvldrhtss rgvfuqvkyq(oxmwwwfdhm.zoijcleaow zoijcleaowVar, p3.zoijcleaow zoijcleaowVar2, long j13) {
        int length = this.f11090wflxmlrfwp.length;
        vdvldrhtss[] vdvldrhtssVarArr = new vdvldrhtss[length];
        int iZoijcleaow = this.f11086ojitshcjhn[0].zoijcleaow(zoijcleaowVar.f11262iobyxmoadg);
        for (int i13 = 0; i13 < length; i13++) {
            oxmwwwfdhm.zoijcleaow zoijcleaowVarIobyxmoadg = zoijcleaowVar.iobyxmoadg(this.f11086ojitshcjhn[i13].wflxmlrfwp(iZoijcleaow));
            vdvldrhtssVarArr[i13] = this.f11090wflxmlrfwp[i13].rgvfuqvkyq(zoijcleaowVarIobyxmoadg, zoijcleaowVar2, j13 - this.f11091yggfygwlhe[iZoijcleaow][i13]);
            ((List) this.f11081agtfadlqog.get(i13)).add(new ppxfxbqfkf(zoijcleaowVarIobyxmoadg, vdvldrhtssVarArr[i13]));
        }
        jyumaefscl jyumaefsclVar = new jyumaefscl(this.f11089vdvldrhtss, this.f11091yggfygwlhe[iZoijcleaow], vdvldrhtssVarArr);
        if (!this.f11082draadjrbmk) {
            return jyumaefsclVar;
        }
        androidx.media3.exoplayer.source.zoijcleaow zoijcleaowVar3 = new androidx.media3.exoplayer.source.zoijcleaow(jyumaefsclVar, false, 0L, ((Long) y2.iobyxmoadg.eablkybsjg((Long) this.f11087oxmwwwfdhm.get(zoijcleaowVar.f11262iobyxmoadg))).longValue());
        this.f11085kcexrzcfyt.put(zoijcleaowVar.f11262iobyxmoadg, zoijcleaowVar3);
        return zoijcleaowVar3;
    }

    @Override // androidx.media3.exoplayer.source.ppxfxbqfkf, androidx.media3.exoplayer.source.oxmwwwfdhm
    public void wflxmlrfwp() throws IllegalMergeException {
        IllegalMergeException illegalMergeException = this.f11084jyumaefscl;
        if (illegalMergeException != null) {
            throw illegalMergeException;
        }
        super.wflxmlrfwp();
    }

    public MergingMediaSource(boolean z13, oxmwwwfdhm... oxmwwwfdhmVarArr) {
        this(z13, false, oxmwwwfdhmVarArr);
    }

    public MergingMediaSource(boolean z13, boolean z14, oxmwwwfdhm... oxmwwwfdhmVarArr) {
        this(z13, z14, new m3.gxszxtbevo(), oxmwwwfdhmVarArr);
    }

    public MergingMediaSource(boolean z13, boolean z14, m3.eablkybsjg eablkybsjgVar, oxmwwwfdhm... oxmwwwfdhmVarArr) {
        this.f11083gtknphoqwx = z13;
        this.f11082draadjrbmk = z14;
        this.f11090wflxmlrfwp = oxmwwwfdhmVarArr;
        this.f11089vdvldrhtss = eablkybsjgVar;
        this.f11088rgvfuqvkyq = new ArrayList(Arrays.asList(oxmwwwfdhmVarArr));
        this.f11092zdlpuopuiu = -1;
        this.f11081agtfadlqog = new ArrayList(oxmwwwfdhmVarArr.length);
        for (int i13 = 0; i13 < oxmwwwfdhmVarArr.length; i13++) {
            this.f11081agtfadlqog.add(new ArrayList());
        }
        this.f11086ojitshcjhn = new v2.cdpycssgdh[oxmwwwfdhmVarArr.length];
        this.f11091yggfygwlhe = new long[0][];
        this.f11087oxmwwwfdhm = new HashMap();
        this.f11085kcexrzcfyt = com.google.common.collect.cdpycssgdh.iobyxmoadg().iobyxmoadg().eablkybsjg();
    }
}
