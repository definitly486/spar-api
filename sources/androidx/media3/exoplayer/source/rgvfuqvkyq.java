package androidx.media3.exoplayer.source;

import android.util.Pair;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class rgvfuqvkyq extends jpowsppfya {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private final v2.cdpycssgdh.ppxfxbqfkf f11281agtfadlqog;

    /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
    private boolean f11282kcexrzcfyt;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private final v2.cdpycssgdh.zoijcleaow f11283ojitshcjhn;

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    private boolean f11284oxmwwwfdhm;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private iobyxmoadg f11285rgvfuqvkyq;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    private ojitshcjhn f11286vdvldrhtss;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final boolean f11287wflxmlrfwp;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private boolean f11288zdlpuopuiu;

    private static final class iobyxmoadg extends wflxmlrfwp {

        /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
        public static final Object f11289nufgyqmvbu = new Object();

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private final Object f11290gxszxtbevo;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        private final Object f11291lqeggnwhkg;

        private iobyxmoadg(v2.cdpycssgdh cdpycssgdhVar, Object obj, Object obj2) {
            super(cdpycssgdhVar);
            this.f11290gxszxtbevo = obj;
            this.f11291lqeggnwhkg = obj2;
        }

        public static iobyxmoadg jyumaefscl(v2.cdpycssgdh cdpycssgdhVar, Object obj, Object obj2) {
            return new iobyxmoadg(cdpycssgdhVar, obj, obj2);
        }

        public static iobyxmoadg yggfygwlhe(v2.kcexrzcfyt kcexrzcfytVar) {
            return new iobyxmoadg(new zoijcleaow(kcexrzcfytVar), v2.cdpycssgdh.ppxfxbqfkf.f115274vdvldrhtss, f11289nufgyqmvbu);
        }

        @Override // androidx.media3.exoplayer.source.wflxmlrfwp, v2.cdpycssgdh
        public v2.cdpycssgdh.zoijcleaow lqeggnwhkg(int i13, v2.cdpycssgdh.zoijcleaow zoijcleaowVar, boolean z13) {
            this.f11293eablkybsjg.lqeggnwhkg(i13, zoijcleaowVar, z13);
            if (Objects.equals(zoijcleaowVar.f115306zoijcleaow, this.f11291lqeggnwhkg) && z13) {
                zoijcleaowVar.f115306zoijcleaow = f11289nufgyqmvbu;
            }
            return zoijcleaowVar;
        }

        @Override // androidx.media3.exoplayer.source.wflxmlrfwp, v2.cdpycssgdh
        public v2.cdpycssgdh.ppxfxbqfkf ojitshcjhn(int i13, v2.cdpycssgdh.ppxfxbqfkf ppxfxbqfkfVar, long j13) {
            this.f11293eablkybsjg.ojitshcjhn(i13, ppxfxbqfkfVar, j13);
            if (Objects.equals(ppxfxbqfkfVar.f115286iobyxmoadg, this.f11290gxszxtbevo)) {
                ppxfxbqfkfVar.f115286iobyxmoadg = v2.cdpycssgdh.ppxfxbqfkf.f115274vdvldrhtss;
            }
            return ppxfxbqfkfVar;
        }

        @Override // androidx.media3.exoplayer.source.wflxmlrfwp, v2.cdpycssgdh
        public Object wflxmlrfwp(int i13) {
            Object objWflxmlrfwp = this.f11293eablkybsjg.wflxmlrfwp(i13);
            return Objects.equals(objWflxmlrfwp, this.f11291lqeggnwhkg) ? f11289nufgyqmvbu : objWflxmlrfwp;
        }

        public iobyxmoadg zdlpuopuiu(v2.cdpycssgdh cdpycssgdhVar) {
            return new iobyxmoadg(cdpycssgdhVar, this.f11290gxszxtbevo, this.f11291lqeggnwhkg);
        }

        @Override // androidx.media3.exoplayer.source.wflxmlrfwp, v2.cdpycssgdh
        public int zoijcleaow(Object obj) {
            Object obj2;
            v2.cdpycssgdh cdpycssgdhVar = this.f11293eablkybsjg;
            if (f11289nufgyqmvbu.equals(obj) && (obj2 = this.f11291lqeggnwhkg) != null) {
                obj = obj2;
            }
            return cdpycssgdhVar.zoijcleaow(obj);
        }
    }

    public static final class zoijcleaow extends v2.cdpycssgdh {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private final v2.kcexrzcfyt f11292eablkybsjg;

        public zoijcleaow(v2.kcexrzcfyt kcexrzcfytVar) {
            this.f11292eablkybsjg = kcexrzcfytVar;
        }

        @Override // v2.cdpycssgdh
        public int dxjokdxxww() {
            return 1;
        }

        @Override // v2.cdpycssgdh
        public v2.cdpycssgdh.zoijcleaow lqeggnwhkg(int i13, v2.cdpycssgdh.zoijcleaow zoijcleaowVar, boolean z13) {
            zoijcleaowVar.zdlpuopuiu(z13 ? 0 : null, z13 ? iobyxmoadg.f11289nufgyqmvbu : null, 0, -9223372036854775807L, 0L, v2.zoijcleaow.f115819lqeggnwhkg, true);
            return zoijcleaowVar;
        }

        @Override // v2.cdpycssgdh
        public v2.cdpycssgdh.ppxfxbqfkf ojitshcjhn(int i13, v2.cdpycssgdh.ppxfxbqfkf ppxfxbqfkfVar, long j13) {
            ppxfxbqfkfVar.lqeggnwhkg(v2.cdpycssgdh.ppxfxbqfkf.f115274vdvldrhtss, this.f11292eablkybsjg, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, null, 0L, -9223372036854775807L, 0, 0, 0L);
            ppxfxbqfkfVar.f115284gtknphoqwx = true;
            return ppxfxbqfkfVar;
        }

        @Override // v2.cdpycssgdh
        public int rgvfuqvkyq() {
            return 1;
        }

        @Override // v2.cdpycssgdh
        public Object wflxmlrfwp(int i13) {
            return iobyxmoadg.f11289nufgyqmvbu;
        }

        @Override // v2.cdpycssgdh
        public int zoijcleaow(Object obj) {
            return obj == iobyxmoadg.f11289nufgyqmvbu ? 0 : -1;
        }
    }

    public rgvfuqvkyq(oxmwwwfdhm oxmwwwfdhmVar, boolean z13) {
        super(oxmwwwfdhmVar);
        this.f11287wflxmlrfwp = z13 && oxmwwwfdhmVar.agtfadlqog();
        this.f11281agtfadlqog = new v2.cdpycssgdh.ppxfxbqfkf();
        this.f11283ojitshcjhn = new v2.cdpycssgdh.zoijcleaow();
        v2.cdpycssgdh cdpycssgdhVarOjitshcjhn = oxmwwwfdhmVar.ojitshcjhn();
        if (cdpycssgdhVarOjitshcjhn == null) {
            this.f11285rgvfuqvkyq = iobyxmoadg.yggfygwlhe(oxmwwwfdhmVar.ppxfxbqfkf());
        } else {
            this.f11285rgvfuqvkyq = iobyxmoadg.jyumaefscl(cdpycssgdhVarOjitshcjhn, null, null);
            this.f11288zdlpuopuiu = true;
        }
    }

    private Object mbcevpiqjq(Object obj) {
        return (this.f11285rgvfuqvkyq.f11291lqeggnwhkg == null || !this.f11285rgvfuqvkyq.f11291lqeggnwhkg.equals(obj)) ? obj : iobyxmoadg.f11289nufgyqmvbu;
    }

    private Object ntlheqmsrt(Object obj) {
        return (this.f11285rgvfuqvkyq.f11291lqeggnwhkg == null || !obj.equals(iobyxmoadg.f11289nufgyqmvbu)) ? obj : this.f11285rgvfuqvkyq.f11291lqeggnwhkg;
    }

    private boolean sopmlzcsov(long j13) {
        ojitshcjhn ojitshcjhnVar = this.f11286vdvldrhtss;
        int iZoijcleaow = this.f11285rgvfuqvkyq.zoijcleaow(ojitshcjhnVar.f11258zdlpuopuiu.f11262iobyxmoadg);
        if (iZoijcleaow == -1) {
            return false;
        }
        long j14 = this.f11285rgvfuqvkyq.gxszxtbevo(iZoijcleaow, this.f11283ojitshcjhn).f115305wkgbmnqykc;
        if (j14 != -9223372036854775807L && j13 >= j14) {
            j13 = Math.max(0L, j14 - 1);
        }
        ojitshcjhnVar.kcexrzcfyt(j13);
        return true;
    }

    @Override // androidx.media3.exoplayer.source.jpowsppfya, androidx.media3.exoplayer.source.oxmwwwfdhm
    public void btonecajqb(v2.kcexrzcfyt kcexrzcfytVar) {
        if (this.f11288zdlpuopuiu) {
            this.f11285rgvfuqvkyq = this.f11285rgvfuqvkyq.zdlpuopuiu(new m3.yggfygwlhe(this.f11285rgvfuqvkyq.f11293eablkybsjg, kcexrzcfytVar));
        } else {
            this.f11285rgvfuqvkyq = iobyxmoadg.yggfygwlhe(kcexrzcfytVar);
        }
        this.f11229gtknphoqwx.btonecajqb(kcexrzcfytVar);
    }

    @Override // androidx.media3.exoplayer.source.jpowsppfya
    public void kegysxyocb() {
        if (this.f11287wflxmlrfwp) {
            return;
        }
        this.f11284oxmwwwfdhm = true;
        stevsuqkhv();
    }

    @Override // androidx.media3.exoplayer.source.oxmwwwfdhm
    public void lqeggnwhkg(vdvldrhtss vdvldrhtssVar) {
        ((ojitshcjhn) vdvldrhtssVar).jyumaefscl();
        if (vdvldrhtssVar == this.f11286vdvldrhtss) {
            this.f11286vdvldrhtss = null;
        }
    }

    @Override // androidx.media3.exoplayer.source.ppxfxbqfkf, androidx.media3.exoplayer.source.iobyxmoadg
    public void pmvmpeiblj() {
        this.f11282kcexrzcfyt = false;
        this.f11284oxmwwwfdhm = false;
        super.pmvmpeiblj();
    }

    @Override // androidx.media3.exoplayer.source.oxmwwwfdhm
    /* JADX INFO: renamed from: tzroggbefp, reason: merged with bridge method [inline-methods] */
    public ojitshcjhn rgvfuqvkyq(oxmwwwfdhm.zoijcleaow zoijcleaowVar, p3.zoijcleaow zoijcleaowVar2, long j13) {
        ojitshcjhn ojitshcjhnVar = new ojitshcjhn(zoijcleaowVar, zoijcleaowVar2, j13);
        ojitshcjhnVar.iwizpuwonk(this.f11229gtknphoqwx);
        if (this.f11282kcexrzcfyt) {
            ojitshcjhnVar.nufgyqmvbu(zoijcleaowVar.iobyxmoadg(ntlheqmsrt(zoijcleaowVar.f11262iobyxmoadg)));
        } else {
            this.f11286vdvldrhtss = ojitshcjhnVar;
            if (!this.f11284oxmwwwfdhm) {
                this.f11284oxmwwwfdhm = true;
                stevsuqkhv();
            }
        }
        return ojitshcjhnVar;
    }

    public v2.cdpycssgdh ulzqkzuiru() {
        return this.f11285rgvfuqvkyq;
    }

    @Override // androidx.media3.exoplayer.source.ppxfxbqfkf, androidx.media3.exoplayer.source.oxmwwwfdhm
    public void wflxmlrfwp() {
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0074  */
    /* JADX WARN: Code duplicated, block: B:32:0x00be  */
    /* JADX WARN: Code duplicated, block: B:34:? A[RETURN, SYNTHETIC] */
    @Override // androidx.media3.exoplayer.source.jpowsppfya
    protected void wypolnanlu(v2.cdpycssgdh cdpycssgdhVar) {
        long j13;
        oxmwwwfdhm.zoijcleaow zoijcleaowVarIobyxmoadg;
        if (this.f11282kcexrzcfyt) {
            this.f11285rgvfuqvkyq = this.f11285rgvfuqvkyq.zdlpuopuiu(cdpycssgdhVar);
            ojitshcjhn ojitshcjhnVar = this.f11286vdvldrhtss;
            if (ojitshcjhnVar != null) {
                sopmlzcsov(ojitshcjhnVar.gtknphoqwx());
            }
        } else {
            if (!cdpycssgdhVar.vdvldrhtss()) {
                cdpycssgdhVar.agtfadlqog(0, this.f11281agtfadlqog);
                long jPpxfxbqfkf = this.f11281agtfadlqog.ppxfxbqfkf();
                Object obj = this.f11281agtfadlqog.f115286iobyxmoadg;
                ojitshcjhn ojitshcjhnVar2 = this.f11286vdvldrhtss;
                if (ojitshcjhnVar2 != null) {
                    long jWflxmlrfwp = ojitshcjhnVar2.wflxmlrfwp();
                    this.f11285rgvfuqvkyq.nufgyqmvbu(this.f11286vdvldrhtss.f11258zdlpuopuiu.f11262iobyxmoadg, this.f11283ojitshcjhn);
                    long jAgtfadlqog = this.f11283ojitshcjhn.agtfadlqog() + jWflxmlrfwp;
                    if (jAgtfadlqog != this.f11285rgvfuqvkyq.agtfadlqog(0, this.f11281agtfadlqog).ppxfxbqfkf()) {
                        j13 = jAgtfadlqog;
                    } else {
                        j13 = jPpxfxbqfkf;
                    }
                } else {
                    j13 = jPpxfxbqfkf;
                }
                Pair pairBtonecajqb = cdpycssgdhVar.btonecajqb(this.f11281agtfadlqog, this.f11283ojitshcjhn, 0, j13);
                Object obj2 = pairBtonecajqb.first;
                long jLongValue = ((Long) pairBtonecajqb.second).longValue();
                this.f11285rgvfuqvkyq = this.f11288zdlpuopuiu ? this.f11285rgvfuqvkyq.zdlpuopuiu(cdpycssgdhVar) : iobyxmoadg.jyumaefscl(cdpycssgdhVar, obj, obj2);
                ojitshcjhn ojitshcjhnVar3 = this.f11286vdvldrhtss;
                if (ojitshcjhnVar3 != null && sopmlzcsov(jLongValue)) {
                    oxmwwwfdhm.zoijcleaow zoijcleaowVar = ojitshcjhnVar3.f11258zdlpuopuiu;
                    zoijcleaowVarIobyxmoadg = zoijcleaowVar.iobyxmoadg(ntlheqmsrt(zoijcleaowVar.f11262iobyxmoadg));
                }
                this.f11288zdlpuopuiu = true;
                this.f11282kcexrzcfyt = true;
                lereixgezr(this.f11285rgvfuqvkyq);
                if (zoijcleaowVarIobyxmoadg != null) {
                    ((ojitshcjhn) y2.iobyxmoadg.eablkybsjg(this.f11286vdvldrhtss)).nufgyqmvbu(zoijcleaowVarIobyxmoadg);
                }
            }
            this.f11285rgvfuqvkyq = this.f11288zdlpuopuiu ? this.f11285rgvfuqvkyq.zdlpuopuiu(cdpycssgdhVar) : iobyxmoadg.jyumaefscl(cdpycssgdhVar, v2.cdpycssgdh.ppxfxbqfkf.f115274vdvldrhtss, iobyxmoadg.f11289nufgyqmvbu);
        }
        zoijcleaowVarIobyxmoadg = null;
        this.f11288zdlpuopuiu = true;
        this.f11282kcexrzcfyt = true;
        lereixgezr(this.f11285rgvfuqvkyq);
        if (zoijcleaowVarIobyxmoadg != null) {
            ((ojitshcjhn) y2.iobyxmoadg.eablkybsjg(this.f11286vdvldrhtss)).nufgyqmvbu(zoijcleaowVarIobyxmoadg);
        }
    }

    @Override // androidx.media3.exoplayer.source.jpowsppfya
    protected oxmwwwfdhm.zoijcleaow ylkuphrtab(oxmwwwfdhm.zoijcleaow zoijcleaowVar) {
        return zoijcleaowVar.iobyxmoadg(mbcevpiqjq(zoijcleaowVar.f11262iobyxmoadg));
    }
}
