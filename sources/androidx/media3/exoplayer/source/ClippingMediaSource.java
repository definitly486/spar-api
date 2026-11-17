package androidx.media3.exoplayer.source;

import io.appmetrica.analytics.coreutils.internal.services.telephony.CellularNetworkTypeExtractor;
import java.io.IOException;
import java.util.ArrayList;
import y2.stevsuqkhv;

/* JADX INFO: loaded from: classes.dex */
public final class ClippingMediaSource extends jpowsppfya {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private final long f11055agtfadlqog;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private long f11056cqumvgiudr;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private long f11057iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private IllegalClippingException f11058jyumaefscl;

    /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
    private final ArrayList f11059kcexrzcfyt;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private final boolean f11060ojitshcjhn;

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    private final boolean f11061oxmwwwfdhm;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private final boolean f11062rgvfuqvkyq;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    private final boolean f11063vdvldrhtss;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final long f11064wflxmlrfwp;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private ppxfxbqfkf f11065yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final v2.cdpycssgdh.ppxfxbqfkf f11066zdlpuopuiu;

    public static final class IllegalClippingException extends IOException {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public final int f11067zdlpuopuiu;

        public IllegalClippingException(int i13) {
            this(i13, -9223372036854775807L, -9223372036854775807L);
        }

        private static String iobyxmoadg(int i13, long j13, long j14) {
            if (i13 == 0) {
                return "invalid period count";
            }
            if (i13 == 1) {
                return "not seekable to start";
            }
            if (i13 != 2) {
                return CellularNetworkTypeExtractor.UNKNOWN_NETWORK_TYPE_VALUE;
            }
            y2.iobyxmoadg.lqeggnwhkg((j13 == -9223372036854775807L || j14 == -9223372036854775807L) ? false : true);
            return "start exceeds end. Start time: " + j13 + ", End time: " + j14;
        }

        public IllegalClippingException(int i13, long j13, long j14) {
            super("Illegal clipping: " + iobyxmoadg(i13, j13, j14));
            this.f11067zdlpuopuiu = i13;
        }
    }

    private static final class ppxfxbqfkf extends wflxmlrfwp {

        /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
        private final boolean f11068dxjokdxxww;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private final long f11069gxszxtbevo;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        private final long f11070lqeggnwhkg;

        /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
        private final long f11071nufgyqmvbu;

        public ppxfxbqfkf(v2.cdpycssgdh cdpycssgdhVar, long j13, long j14, boolean z13) throws IllegalClippingException {
            super(cdpycssgdhVar);
            if (j14 != Long.MIN_VALUE && j14 < j13) {
                throw new IllegalClippingException(2, j13, j14);
            }
            boolean z14 = false;
            if (cdpycssgdhVar.dxjokdxxww() != 1) {
                throw new IllegalClippingException(0);
            }
            v2.cdpycssgdh.ppxfxbqfkf ppxfxbqfkfVarAgtfadlqog = cdpycssgdhVar.agtfadlqog(0, new v2.cdpycssgdh.ppxfxbqfkf());
            long jMax = Math.max(0L, j13);
            if (!z13 && !ppxfxbqfkfVarAgtfadlqog.f115284gtknphoqwx && jMax != 0 && !ppxfxbqfkfVarAgtfadlqog.f115288nufgyqmvbu) {
                throw new IllegalClippingException(1);
            }
            long jMax2 = j14 == Long.MIN_VALUE ? ppxfxbqfkfVarAgtfadlqog.f115292wflxmlrfwp : Math.max(0L, j14);
            long j15 = ppxfxbqfkfVarAgtfadlqog.f115292wflxmlrfwp;
            if (j15 != -9223372036854775807L) {
                jMax2 = jMax2 > j15 ? j15 : jMax2;
                if (jMax > jMax2) {
                    jMax = jMax2;
                }
            }
            this.f11069gxszxtbevo = jMax;
            this.f11070lqeggnwhkg = jMax2;
            this.f11071nufgyqmvbu = jMax2 == -9223372036854775807L ? -9223372036854775807L : jMax2 - jMax;
            if (ppxfxbqfkfVarAgtfadlqog.f115282dxjokdxxww && (jMax2 == -9223372036854775807L || (j15 != -9223372036854775807L && jMax2 == j15))) {
                z14 = true;
            }
            this.f11068dxjokdxxww = z14;
        }

        @Override // androidx.media3.exoplayer.source.wflxmlrfwp, v2.cdpycssgdh
        public v2.cdpycssgdh.zoijcleaow lqeggnwhkg(int i13, v2.cdpycssgdh.zoijcleaow zoijcleaowVar, boolean z13) {
            this.f11293eablkybsjg.lqeggnwhkg(0, zoijcleaowVar, z13);
            long jAgtfadlqog = zoijcleaowVar.agtfadlqog() - this.f11069gxszxtbevo;
            long j13 = this.f11071nufgyqmvbu;
            return zoijcleaowVar.kcexrzcfyt(zoijcleaowVar.f115302iobyxmoadg, zoijcleaowVar.f115306zoijcleaow, 0, j13 == -9223372036854775807L ? -9223372036854775807L : j13 - jAgtfadlqog, jAgtfadlqog);
        }

        @Override // androidx.media3.exoplayer.source.wflxmlrfwp, v2.cdpycssgdh
        public v2.cdpycssgdh.ppxfxbqfkf ojitshcjhn(int i13, v2.cdpycssgdh.ppxfxbqfkf ppxfxbqfkfVar, long j13) {
            this.f11293eablkybsjg.ojitshcjhn(0, ppxfxbqfkfVar, 0L);
            long j14 = ppxfxbqfkfVar.f115291rgvfuqvkyq;
            long j15 = this.f11069gxszxtbevo;
            ppxfxbqfkfVar.f115291rgvfuqvkyq = j14 + j15;
            ppxfxbqfkfVar.f115292wflxmlrfwp = this.f11071nufgyqmvbu;
            ppxfxbqfkfVar.f115282dxjokdxxww = this.f11068dxjokdxxww;
            long j16 = ppxfxbqfkfVar.f115281draadjrbmk;
            if (j16 != -9223372036854775807L) {
                long jMax = Math.max(j16, j15);
                ppxfxbqfkfVar.f115281draadjrbmk = jMax;
                long j17 = this.f11070lqeggnwhkg;
                if (j17 != -9223372036854775807L) {
                    jMax = Math.min(jMax, j17);
                }
                ppxfxbqfkfVar.f115281draadjrbmk = jMax - this.f11069gxszxtbevo;
            }
            long jT = stevsuqkhv.t(this.f11069gxszxtbevo);
            long j18 = ppxfxbqfkfVar.f115283eablkybsjg;
            if (j18 != -9223372036854775807L) {
                ppxfxbqfkfVar.f115283eablkybsjg = j18 + jT;
            }
            long j19 = ppxfxbqfkfVar.f115285gxszxtbevo;
            if (j19 != -9223372036854775807L) {
                ppxfxbqfkfVar.f115285gxszxtbevo = j19 + jT;
            }
            return ppxfxbqfkfVar;
        }
    }

    public static final class zoijcleaow {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private boolean f11072eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private boolean f11073gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final oxmwwwfdhm f11074iobyxmoadg;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        private boolean f11075lqeggnwhkg;

        /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
        private boolean f11076nufgyqmvbu;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private long f11079zoijcleaow;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private boolean f11078wkgbmnqykc = true;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private long f11077ppxfxbqfkf = Long.MIN_VALUE;

        public zoijcleaow(oxmwwwfdhm oxmwwwfdhmVar) {
            this.f11074iobyxmoadg = (oxmwwwfdhm) y2.iobyxmoadg.eablkybsjg(oxmwwwfdhmVar);
        }

        public zoijcleaow btonecajqb(boolean z13) {
            y2.iobyxmoadg.lqeggnwhkg(!this.f11076nufgyqmvbu);
            this.f11078wkgbmnqykc = z13;
            return this;
        }

        public zoijcleaow draadjrbmk(boolean z13) {
            y2.iobyxmoadg.lqeggnwhkg(!this.f11076nufgyqmvbu);
            this.f11073gxszxtbevo = z13;
            return this;
        }

        public zoijcleaow dxjokdxxww(boolean z13) {
            y2.iobyxmoadg.lqeggnwhkg(!this.f11076nufgyqmvbu);
            this.f11072eablkybsjg = z13;
            return this;
        }

        public zoijcleaow gtknphoqwx(long j13) {
            y2.iobyxmoadg.lqeggnwhkg(!this.f11076nufgyqmvbu);
            this.f11077ppxfxbqfkf = j13;
            return this;
        }

        public ClippingMediaSource nufgyqmvbu() {
            this.f11076nufgyqmvbu = true;
            return new ClippingMediaSource(this);
        }

        public zoijcleaow wflxmlrfwp(long j13) {
            y2.iobyxmoadg.iobyxmoadg(j13 >= 0);
            y2.iobyxmoadg.lqeggnwhkg(!this.f11076nufgyqmvbu);
            this.f11079zoijcleaow = j13;
            return this;
        }
    }

    private void tzroggbefp(v2.cdpycssgdh cdpycssgdhVar) {
        long j13;
        long j14;
        cdpycssgdhVar.agtfadlqog(0, this.f11066zdlpuopuiu);
        long jEablkybsjg = this.f11066zdlpuopuiu.eablkybsjg();
        if (this.f11065yggfygwlhe == null || this.f11059kcexrzcfyt.isEmpty() || this.f11062rgvfuqvkyq) {
            long j15 = this.f11064wflxmlrfwp;
            long j16 = this.f11055agtfadlqog;
            if (this.f11063vdvldrhtss) {
                long jPpxfxbqfkf = this.f11066zdlpuopuiu.ppxfxbqfkf();
                j15 += jPpxfxbqfkf;
                j16 += jPpxfxbqfkf;
            }
            this.f11057iwizpuwonk = jEablkybsjg + j15;
            this.f11056cqumvgiudr = this.f11055agtfadlqog != Long.MIN_VALUE ? jEablkybsjg + j16 : Long.MIN_VALUE;
            int size = this.f11059kcexrzcfyt.size();
            for (int i13 = 0; i13 < size; i13++) {
                ((androidx.media3.exoplayer.source.zoijcleaow) this.f11059kcexrzcfyt.get(i13)).jyumaefscl(this.f11057iwizpuwonk, this.f11056cqumvgiudr);
            }
            j13 = j15;
            j14 = j16;
        } else {
            long j17 = this.f11057iwizpuwonk - jEablkybsjg;
            j14 = this.f11055agtfadlqog != Long.MIN_VALUE ? this.f11056cqumvgiudr - jEablkybsjg : Long.MIN_VALUE;
            j13 = j17;
        }
        try {
            ppxfxbqfkf ppxfxbqfkfVar = new ppxfxbqfkf(cdpycssgdhVar, j13, j14, this.f11061oxmwwwfdhm);
            this.f11065yggfygwlhe = ppxfxbqfkfVar;
            lereixgezr(ppxfxbqfkfVar);
        } catch (IllegalClippingException e13) {
            this.f11058jyumaefscl = e13;
            for (int i14 = 0; i14 < this.f11059kcexrzcfyt.size(); i14++) {
                ((androidx.media3.exoplayer.source.zoijcleaow) this.f11059kcexrzcfyt.get(i14)).oxmwwwfdhm(this.f11058jyumaefscl);
            }
        }
    }

    @Override // androidx.media3.exoplayer.source.oxmwwwfdhm
    public void lqeggnwhkg(vdvldrhtss vdvldrhtssVar) {
        y2.iobyxmoadg.lqeggnwhkg(this.f11059kcexrzcfyt.remove(vdvldrhtssVar));
        this.f11229gtknphoqwx.lqeggnwhkg(((androidx.media3.exoplayer.source.zoijcleaow) vdvldrhtssVar).f11340zdlpuopuiu);
        if (!this.f11059kcexrzcfyt.isEmpty() || this.f11062rgvfuqvkyq) {
            return;
        }
        tzroggbefp(((ppxfxbqfkf) y2.iobyxmoadg.eablkybsjg(this.f11065yggfygwlhe)).f11293eablkybsjg);
    }

    @Override // androidx.media3.exoplayer.source.ppxfxbqfkf, androidx.media3.exoplayer.source.iobyxmoadg
    protected void pmvmpeiblj() {
        super.pmvmpeiblj();
        this.f11058jyumaefscl = null;
        this.f11065yggfygwlhe = null;
    }

    @Override // androidx.media3.exoplayer.source.oxmwwwfdhm
    public vdvldrhtss rgvfuqvkyq(oxmwwwfdhm.zoijcleaow zoijcleaowVar, p3.zoijcleaow zoijcleaowVar2, long j13) {
        androidx.media3.exoplayer.source.zoijcleaow zoijcleaowVar3 = new androidx.media3.exoplayer.source.zoijcleaow(this.f11229gtknphoqwx.rgvfuqvkyq(zoijcleaowVar, zoijcleaowVar2, j13), this.f11060ojitshcjhn, this.f11057iwizpuwonk, this.f11056cqumvgiudr);
        this.f11059kcexrzcfyt.add(zoijcleaowVar3);
        return zoijcleaowVar3;
    }

    @Override // androidx.media3.exoplayer.source.ppxfxbqfkf, androidx.media3.exoplayer.source.oxmwwwfdhm
    public void wflxmlrfwp() throws IllegalClippingException {
        IllegalClippingException illegalClippingException = this.f11058jyumaefscl;
        if (illegalClippingException != null) {
            throw illegalClippingException;
        }
        super.wflxmlrfwp();
    }

    @Override // androidx.media3.exoplayer.source.jpowsppfya
    protected void wypolnanlu(v2.cdpycssgdh cdpycssgdhVar) {
        if (this.f11058jyumaefscl != null) {
            return;
        }
        tzroggbefp(cdpycssgdhVar);
    }

    private ClippingMediaSource(zoijcleaow zoijcleaowVar) {
        super(zoijcleaowVar.f11074iobyxmoadg);
        this.f11064wflxmlrfwp = zoijcleaowVar.f11079zoijcleaow;
        this.f11055agtfadlqog = zoijcleaowVar.f11077ppxfxbqfkf;
        this.f11060ojitshcjhn = zoijcleaowVar.f11078wkgbmnqykc;
        this.f11062rgvfuqvkyq = zoijcleaowVar.f11072eablkybsjg;
        this.f11063vdvldrhtss = zoijcleaowVar.f11073gxszxtbevo;
        this.f11061oxmwwwfdhm = zoijcleaowVar.f11075lqeggnwhkg;
        this.f11059kcexrzcfyt = new ArrayList();
        this.f11066zdlpuopuiu = new v2.cdpycssgdh.ppxfxbqfkf();
    }
}
