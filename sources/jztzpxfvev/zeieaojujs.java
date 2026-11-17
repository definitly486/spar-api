package jztzpxfvev;

import androidx.compose.foundation.gestures.FlingCancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class zeieaojujs implements jztzpxfvev {

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private boolean f53094dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private boolean f53095eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private s.zoijcleaow f53097gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private opjhrmiecq f53098iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private crxdokpmqz f53099lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final tg.iobyxmoadg f53100nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private hkdspvbjdz f53101ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private jlmebxxoox f53103wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private ikoacuggdj.xrmfcynszj f53104zoijcleaow;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private int f53092btonecajqb = s.eablkybsjg.f105077iobyxmoadg.zoijcleaow();

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private xrmfcynszj f53096gtknphoqwx = androidx.compose.foundation.gestures.iobyxmoadg.f4649zoijcleaow;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final ppxfxbqfkf f53093draadjrbmk = new ppxfxbqfkf();

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final tg.draadjrbmk f53102wflxmlrfwp = new tg.draadjrbmk() { // from class: jztzpxfvev.lrnfpwlwnk
        @Override // tg.draadjrbmk
        public final Object invoke(Object obj) {
            return zeieaojujs.lereixgezr(this.f52803zdlpuopuiu, (g.eablkybsjg) obj);
        }
    };

    static final class eablkybsjg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ tg.rgvfuqvkyq f53105iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private /* synthetic */ Object f53107yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f53108zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        eablkybsjg(tg.rgvfuqvkyq rgvfuqvkyqVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f53105iwizpuwonk = rgvfuqvkyqVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            eablkybsjg eablkybsjgVar = zeieaojujs.this.new eablkybsjg(this.f53105iwizpuwonk, gxszxtbevoVar);
            eablkybsjgVar.f53107yggfygwlhe = obj;
            return eablkybsjgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f53108zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                zeieaojujs.this.f53096gtknphoqwx = (xrmfcynszj) this.f53107yggfygwlhe;
                tg.rgvfuqvkyq rgvfuqvkyqVar = this.f53105iwizpuwonk;
                ppxfxbqfkf ppxfxbqfkfVar = zeieaojujs.this.f53093draadjrbmk;
                this.f53108zdlpuopuiu = 1;
                if (rgvfuqvkyqVar.invoke(ppxfxbqfkfVar, this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
            }
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(xrmfcynszj xrmfcynszjVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((eablkybsjg) create(xrmfcynszjVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f53109iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f53111yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f53112zdlpuopuiu;

        iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f53111yggfygwlhe = obj;
            this.f53109iwizpuwonk |= Integer.MIN_VALUE;
            return zeieaojujs.this.ppxfxbqfkf(0L, this);
        }
    }

    public static final class ppxfxbqfkf implements sopmlzcsov {
        ppxfxbqfkf() {
        }

        @Override // jztzpxfvev.sopmlzcsov
        public long iobyxmoadg(long j13, int i13) {
            zeieaojujs.this.f53092btonecajqb = i13;
            ikoacuggdj.xrmfcynszj xrmfcynszjVar = zeieaojujs.this.f53104zoijcleaow;
            if (xrmfcynszjVar != null && zeieaojujs.this.jyumaefscl()) {
                return xrmfcynszjVar.ojitshcjhn(j13, zeieaojujs.this.f53092btonecajqb, zeieaojujs.this.f53102wflxmlrfwp);
            }
            return zeieaojujs.this.esjtqupxsv(zeieaojujs.this.f53096gtknphoqwx, j13, i13);
        }

        @Override // jztzpxfvev.sopmlzcsov
        public long zoijcleaow(long j13, int i13) {
            return zeieaojujs.this.esjtqupxsv(zeieaojujs.this.f53096gtknphoqwx, j13, i13);
        }
    }

    static final class wkgbmnqykc extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ long f53115jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        int f53116yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        long f53117zdlpuopuiu;

        wkgbmnqykc(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            wkgbmnqykc wkgbmnqykcVar = zeieaojujs.this.new wkgbmnqykc(gxszxtbevoVar);
            wkgbmnqykcVar.f53115jyumaefscl = ((w0.esjtqupxsv) obj).ojitshcjhn();
            return wkgbmnqykcVar;
        }

        @Override // tg.rgvfuqvkyq
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ojitshcjhn(((w0.esjtqupxsv) obj).ojitshcjhn(), (lg.gxszxtbevo) obj2);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0087 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:23:0x0088  */
        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objPpxfxbqfkf;
            long j13;
            Object objPpxfxbqfkf2;
            long j14;
            long j15;
            long jOjitshcjhn;
            Object objIobyxmoadg;
            long j16;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f53116yggfygwlhe;
            if (i13 != 0) {
                if (i13 == 1) {
                    j13 = this.f53115jyumaefscl;
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    objPpxfxbqfkf = obj;
                } else if (i13 == 2) {
                    j14 = this.f53117zdlpuopuiu;
                    long j17 = this.f53115jyumaefscl;
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    objPpxfxbqfkf2 = obj;
                    j15 = j17;
                    jOjitshcjhn = ((w0.esjtqupxsv) objPpxfxbqfkf2).ojitshcjhn();
                    s.zoijcleaow zoijcleaowVar = zeieaojujs.this.f53097gxszxtbevo;
                    long jGtknphoqwx = w0.esjtqupxsv.gtknphoqwx(j14, jOjitshcjhn);
                    this.f53115jyumaefscl = j15;
                    this.f53117zdlpuopuiu = jOjitshcjhn;
                    this.f53116yggfygwlhe = 3;
                    objIobyxmoadg = zoijcleaowVar.iobyxmoadg(jGtknphoqwx, jOjitshcjhn, this);
                    if (objIobyxmoadg == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                    j16 = j15;
                } else {
                    if (i13 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    long j18 = this.f53117zdlpuopuiu;
                    j16 = this.f53115jyumaefscl;
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    jOjitshcjhn = j18;
                    objIobyxmoadg = obj;
                }
                return w0.esjtqupxsv.zoijcleaow(w0.esjtqupxsv.gtknphoqwx(j16, w0.esjtqupxsv.gtknphoqwx(jOjitshcjhn, ((w0.esjtqupxsv) objIobyxmoadg).ojitshcjhn())));
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            long j19 = this.f53115jyumaefscl;
            s.zoijcleaow zoijcleaowVar2 = zeieaojujs.this.f53097gxszxtbevo;
            this.f53115jyumaefscl = j19;
            this.f53116yggfygwlhe = 1;
            objPpxfxbqfkf = zoijcleaowVar2.ppxfxbqfkf(j19, this);
            if (objPpxfxbqfkf == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            j13 = j19;
            long jGtknphoqwx2 = w0.esjtqupxsv.gtknphoqwx(j13, ((w0.esjtqupxsv) objPpxfxbqfkf).ojitshcjhn());
            zeieaojujs zeieaojujsVar = zeieaojujs.this;
            this.f53115jyumaefscl = j13;
            this.f53117zdlpuopuiu = jGtknphoqwx2;
            this.f53116yggfygwlhe = 2;
            objPpxfxbqfkf2 = zeieaojujsVar.ppxfxbqfkf(jGtknphoqwx2, this);
            if (objPpxfxbqfkf2 == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            j14 = jGtknphoqwx2;
            j15 = j13;
            jOjitshcjhn = ((w0.esjtqupxsv) objPpxfxbqfkf2).ojitshcjhn();
            s.zoijcleaow zoijcleaowVar3 = zeieaojujs.this.f53097gxszxtbevo;
            long jGtknphoqwx3 = w0.esjtqupxsv.gtknphoqwx(j14, jOjitshcjhn);
            this.f53115jyumaefscl = j15;
            this.f53117zdlpuopuiu = jOjitshcjhn;
            this.f53116yggfygwlhe = 3;
            objIobyxmoadg = zoijcleaowVar3.iobyxmoadg(jGtknphoqwx3, jOjitshcjhn, this);
            if (objIobyxmoadg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            j16 = j15;
            return w0.esjtqupxsv.zoijcleaow(w0.esjtqupxsv.gtknphoqwx(j16, w0.esjtqupxsv.gtknphoqwx(jOjitshcjhn, ((w0.esjtqupxsv) objIobyxmoadg).ojitshcjhn())));
        }

        public final Object ojitshcjhn(long j13, lg.gxszxtbevo gxszxtbevoVar) {
            return ((wkgbmnqykc) create(w0.esjtqupxsv.zoijcleaow(j13), gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        private /* synthetic */ Object f53118cqumvgiudr;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f53120iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        long f53121jyumaefscl;

        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.jpowsppfya f53122lereixgezr;

        /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
        final /* synthetic */ long f53123pmvmpeiblj;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f53124yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f53125zdlpuopuiu;

        public static final class iobyxmoadg implements xrmfcynszj {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            final /* synthetic */ zeieaojujs f53126iobyxmoadg;

            /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
            final /* synthetic */ sopmlzcsov f53127zoijcleaow;

            iobyxmoadg(zeieaojujs zeieaojujsVar, sopmlzcsov sopmlzcsovVar) {
                this.f53126iobyxmoadg = zeieaojujsVar;
                this.f53127zoijcleaow = sopmlzcsovVar;
            }

            @Override // jztzpxfvev.xrmfcynszj
            public float wkgbmnqykc(float f13) {
                boolean zCdpycssgdh;
                if (ikoacuggdj.esjtqupxsv.f44790gtknphoqwx) {
                    zCdpycssgdh = !((Boolean) this.f53126iobyxmoadg.f53100nufgyqmvbu.invoke()).booleanValue();
                } else {
                    zCdpycssgdh = this.f53126iobyxmoadg.cdpycssgdh(f13);
                }
                if (Math.abs(f13) != 0.0f && zCdpycssgdh) {
                    throw new FlingCancellationException();
                }
                zeieaojujs zeieaojujsVar = this.f53126iobyxmoadg;
                return zeieaojujsVar.pmvmpeiblj(zeieaojujsVar.ylkuphrtab(this.f53127zoijcleaow.iobyxmoadg(zeieaojujsVar.zynmafqrjb(zeieaojujsVar.pkzmftpjix(f13)), s.eablkybsjg.f105077iobyxmoadg.iobyxmoadg())));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zoijcleaow(kotlin.jvm.internal.jpowsppfya jpowsppfyaVar, long j13, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f53122lereixgezr = jpowsppfyaVar;
            this.f53123pmvmpeiblj = j13;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            zoijcleaow zoijcleaowVar = zeieaojujs.this.new zoijcleaow(this.f53122lereixgezr, this.f53123pmvmpeiblj, gxszxtbevoVar);
            zoijcleaowVar.f53118cqumvgiudr = obj;
            return zoijcleaowVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            zeieaojujs zeieaojujsVar;
            kotlin.jvm.internal.jpowsppfya jpowsppfyaVar;
            zeieaojujs zeieaojujsVar2;
            long j13;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f53120iwizpuwonk;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                iobyxmoadg iobyxmoadgVar = new iobyxmoadg(zeieaojujs.this, (sopmlzcsov) this.f53118cqumvgiudr);
                zeieaojujsVar = zeieaojujs.this;
                kotlin.jvm.internal.jpowsppfya jpowsppfyaVar2 = this.f53122lereixgezr;
                long j14 = this.f53123pmvmpeiblj;
                hkdspvbjdz hkdspvbjdzVar = zeieaojujsVar.f53101ppxfxbqfkf;
                long j15 = jpowsppfyaVar2.f60024zdlpuopuiu;
                float fPmvmpeiblj = zeieaojujsVar.pmvmpeiblj(zeieaojujsVar.wwaezpbzkn(j14));
                this.f53118cqumvgiudr = zeieaojujsVar;
                this.f53125zdlpuopuiu = zeieaojujsVar;
                this.f53124yggfygwlhe = jpowsppfyaVar2;
                this.f53121jyumaefscl = j15;
                this.f53120iwizpuwonk = 1;
                Object objIobyxmoadg = hkdspvbjdzVar.iobyxmoadg(iobyxmoadgVar, fPmvmpeiblj, this);
                if (objIobyxmoadg == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                jpowsppfyaVar = jpowsppfyaVar2;
                obj = objIobyxmoadg;
                zeieaojujsVar2 = zeieaojujsVar;
                j13 = j15;
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j13 = this.f53121jyumaefscl;
                jpowsppfyaVar = (kotlin.jvm.internal.jpowsppfya) this.f53124yggfygwlhe;
                zeieaojujsVar = (zeieaojujs) this.f53125zdlpuopuiu;
                zeieaojujsVar2 = (zeieaojujs) this.f53118cqumvgiudr;
                gg.zdlpuopuiu.zoijcleaow(obj);
            }
            jpowsppfyaVar.f60024zdlpuopuiu = zeieaojujsVar.hkdspvbjdz(j13, zeieaojujsVar2.pmvmpeiblj(((Number) obj).floatValue()));
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(sopmlzcsov sopmlzcsovVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((zoijcleaow) create(sopmlzcsovVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public zeieaojujs(opjhrmiecq opjhrmiecqVar, ikoacuggdj.xrmfcynszj xrmfcynszjVar, hkdspvbjdz hkdspvbjdzVar, jlmebxxoox jlmebxxooxVar, boolean z13, s.zoijcleaow zoijcleaowVar, crxdokpmqz crxdokpmqzVar, tg.iobyxmoadg iobyxmoadgVar) {
        this.f53098iobyxmoadg = opjhrmiecqVar;
        this.f53104zoijcleaow = xrmfcynszjVar;
        this.f53101ppxfxbqfkf = hkdspvbjdzVar;
        this.f53103wkgbmnqykc = jlmebxxooxVar;
        this.f53095eablkybsjg = z13;
        this.f53097gxszxtbevo = zoijcleaowVar;
        this.f53099lqeggnwhkg = crxdokpmqzVar;
        this.f53100nufgyqmvbu = iobyxmoadgVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean cdpycssgdh(float f13) {
        return (f13 > 0.0f && !this.f53098iobyxmoadg.eablkybsjg()) || (f13 < 0.0f && !this.f53098iobyxmoadg.ppxfxbqfkf()) || !((Boolean) this.f53100nufgyqmvbu.invoke()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long esjtqupxsv(xrmfcynszj xrmfcynszjVar, long j13, int i13) {
        long jWkgbmnqykc = this.f53097gxszxtbevo.wkgbmnqykc(j13, i13);
        long jRgvfuqvkyq = g.eablkybsjg.rgvfuqvkyq(j13, jWkgbmnqykc);
        long jZynmafqrjb = zynmafqrjb(pkzmftpjix(xrmfcynszjVar.wkgbmnqykc(ylkuphrtab(zynmafqrjb(iozdgvuglv(jRgvfuqvkyq))))));
        if (ikoacuggdj.esjtqupxsv.f44788dxjokdxxww) {
            this.f53099lqeggnwhkg.oipsdeybqn(jZynmafqrjb);
        }
        return g.eablkybsjg.vdvldrhtss(g.eablkybsjg.vdvldrhtss(jWkgbmnqykc, jZynmafqrjb), this.f53097gxszxtbevo.zoijcleaow(jZynmafqrjb, g.eablkybsjg.rgvfuqvkyq(jRgvfuqvkyq, jZynmafqrjb), i13));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long hkdspvbjdz(long j13, float f13) {
        return this.f53103wkgbmnqykc == jlmebxxoox.Horizontal ? w0.esjtqupxsv.eablkybsjg(j13, f13, 0.0f, 2, null) : w0.esjtqupxsv.eablkybsjg(j13, 0.0f, f13, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean jyumaefscl() {
        return this.f53098iobyxmoadg.eablkybsjg() || this.f53098iobyxmoadg.ppxfxbqfkf();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g.eablkybsjg lereixgezr(zeieaojujs zeieaojujsVar, g.eablkybsjg eablkybsjgVar) {
        return g.eablkybsjg.wkgbmnqykc(zeieaojujsVar.esjtqupxsv(zeieaojujsVar.f53096gtknphoqwx, eablkybsjgVar.zdlpuopuiu(), zeieaojujsVar.f53092btonecajqb));
    }

    private final long lmojexxdyd(long j13) {
        return this.f53103wkgbmnqykc == jlmebxxoox.Horizontal ? w0.esjtqupxsv.eablkybsjg(j13, 0.0f, 0.0f, 1, null) : w0.esjtqupxsv.eablkybsjg(j13, 0.0f, 0.0f, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float wwaezpbzkn(long j13) {
        return this.f53103wkgbmnqykc == jlmebxxoox.Horizontal ? w0.esjtqupxsv.nufgyqmvbu(j13) : w0.esjtqupxsv.dxjokdxxww(j13);
    }

    private final long zdlpuopuiu(long j13) {
        return pkzmftpjix(pmvmpeiblj(this.f53098iobyxmoadg.gxszxtbevo(pmvmpeiblj(ylkuphrtab(j13)))));
    }

    public final Object cqumvgiudr(long j13, boolean z13, lg.gxszxtbevo gxszxtbevoVar) {
        if (z13 && !androidx.compose.foundation.gestures.iobyxmoadg.nufgyqmvbu(this.f53101ppxfxbqfkf)) {
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }
        long jLmojexxdyd = lmojexxdyd(j13);
        wkgbmnqykc wkgbmnqykcVar = new wkgbmnqykc(null);
        ikoacuggdj.xrmfcynszj xrmfcynszjVar = this.f53104zoijcleaow;
        if (xrmfcynszjVar == null || !jyumaefscl()) {
            Object objInvoke = wkgbmnqykcVar.invoke(w0.esjtqupxsv.zoijcleaow(jLmojexxdyd), gxszxtbevoVar);
            return objInvoke == mg.zoijcleaow.gxszxtbevo() ? objInvoke : gg.wwaezpbzkn.f37140iobyxmoadg;
        }
        Object objRgvfuqvkyq = xrmfcynszjVar.rgvfuqvkyq(jLmojexxdyd, wkgbmnqykcVar, gxszxtbevoVar);
        return objRgvfuqvkyq == mg.zoijcleaow.gxszxtbevo() ? objRgvfuqvkyq : gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    public final long hcddaimhww(float f13) {
        if (f13 == 0.0f) {
            return w0.esjtqupxsv.f118251zoijcleaow.iobyxmoadg();
        }
        return this.f53103wkgbmnqykc == jlmebxxoox.Horizontal ? w0.lereixgezr.iobyxmoadg(f13, 0.0f) : w0.lereixgezr.iobyxmoadg(0.0f, f13);
    }

    @Override // jztzpxfvev.jztzpxfvev
    public boolean iobyxmoadg() {
        return this.f53094dxjokdxxww;
    }

    public final long iozdgvuglv(long j13) {
        return this.f53103wkgbmnqykc == jlmebxxoox.Horizontal ? g.eablkybsjg.lqeggnwhkg(j13, 0.0f, 0.0f, 1, null) : g.eablkybsjg.lqeggnwhkg(j13, 0.0f, 0.0f, 2, null);
    }

    public final Object istkbnxepw(ikoacuggdj.ribwqtqdhb ribwqtqdhbVar, tg.rgvfuqvkyq rgvfuqvkyqVar, lg.gxszxtbevo gxszxtbevoVar) {
        Object objZoijcleaow = this.f53098iobyxmoadg.zoijcleaow(ribwqtqdhbVar, new eablkybsjg(rgvfuqvkyqVar, null), gxszxtbevoVar);
        return objZoijcleaow == mg.zoijcleaow.gxszxtbevo() ? objZoijcleaow : gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    public final boolean iwizpuwonk() {
        return this.f53103wkgbmnqykc == jlmebxxoox.Vertical;
    }

    public final boolean jpowsppfya(opjhrmiecq opjhrmiecqVar, jlmebxxoox jlmebxxooxVar, ikoacuggdj.xrmfcynszj xrmfcynszjVar, boolean z13, hkdspvbjdz hkdspvbjdzVar, s.zoijcleaow zoijcleaowVar) {
        boolean z14;
        boolean z15 = true;
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f53098iobyxmoadg, opjhrmiecqVar)) {
            z14 = false;
        } else {
            this.f53098iobyxmoadg = opjhrmiecqVar;
            z14 = true;
        }
        this.f53104zoijcleaow = xrmfcynszjVar;
        if (this.f53103wkgbmnqykc != jlmebxxooxVar) {
            this.f53103wkgbmnqykc = jlmebxxooxVar;
            z14 = true;
        }
        if (this.f53095eablkybsjg != z13) {
            this.f53095eablkybsjg = z13;
        } else {
            z15 = z14;
        }
        this.f53101ppxfxbqfkf = hkdspvbjdzVar;
        this.f53097gxszxtbevo = zoijcleaowVar;
        return z15;
    }

    public final long pkzmftpjix(float f13) {
        if (f13 == 0.0f) {
            return g.eablkybsjg.f35584zoijcleaow.ppxfxbqfkf();
        }
        if (this.f53103wkgbmnqykc == jlmebxxoox.Horizontal) {
            return g.eablkybsjg.eablkybsjg((((long) Float.floatToRawIntBits(f13)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L));
        }
        return g.eablkybsjg.eablkybsjg((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f13)) & 4294967295L));
    }

    public final float pmvmpeiblj(float f13) {
        return this.f53095eablkybsjg ? f13 * (-1) : f13;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // jztzpxfvev.jztzpxfvev
    public Object ppxfxbqfkf(long j13, lg.gxszxtbevo gxszxtbevoVar) {
        iobyxmoadg iobyxmoadgVar;
        kotlin.jvm.internal.jpowsppfya jpowsppfyaVar;
        if (gxszxtbevoVar instanceof iobyxmoadg) {
            iobyxmoadgVar = (iobyxmoadg) gxszxtbevoVar;
            int i13 = iobyxmoadgVar.f53109iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iobyxmoadgVar.f53109iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
        }
        Object obj = iobyxmoadgVar.f53111yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = iobyxmoadgVar.f53109iwizpuwonk;
        try {
            if (i14 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                kotlin.jvm.internal.jpowsppfya jpowsppfyaVar2 = new kotlin.jvm.internal.jpowsppfya();
                jpowsppfyaVar2.f60024zdlpuopuiu = j13;
                this.f53094dxjokdxxww = true;
                ikoacuggdj.ribwqtqdhb ribwqtqdhbVar = ikoacuggdj.ribwqtqdhb.Default;
                tg.rgvfuqvkyq zoijcleaowVar = new zoijcleaow(jpowsppfyaVar2, j13, null);
                iobyxmoadgVar.f53112zdlpuopuiu = jpowsppfyaVar2;
                iobyxmoadgVar.f53109iwizpuwonk = 1;
                if (istkbnxepw(ribwqtqdhbVar, zoijcleaowVar, iobyxmoadgVar) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                jpowsppfyaVar = jpowsppfyaVar2;
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jpowsppfyaVar = (kotlin.jvm.internal.jpowsppfya) iobyxmoadgVar.f53112zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(obj);
            }
            this.f53094dxjokdxxww = false;
            return w0.esjtqupxsv.zoijcleaow(jpowsppfyaVar.f60024zdlpuopuiu);
        } catch (Throwable th2) {
            this.f53094dxjokdxxww = false;
            throw th2;
        }
    }

    public final boolean yadqdtsiqt() {
        if (!this.f53098iobyxmoadg.iobyxmoadg()) {
            ikoacuggdj.xrmfcynszj xrmfcynszjVar = this.f53104zoijcleaow;
            if (!(xrmfcynszjVar != null ? xrmfcynszjVar.agtfadlqog() : false)) {
                return false;
            }
        }
        return true;
    }

    public final opjhrmiecq yggfygwlhe() {
        return this.f53098iobyxmoadg;
    }

    public final float ylkuphrtab(long j13) {
        return Float.intBitsToFloat((int) (this.f53103wkgbmnqykc == jlmebxxoox.Horizontal ? j13 >> 32 : j13 & 4294967295L));
    }

    @Override // jztzpxfvev.jztzpxfvev
    public long zoijcleaow(long j13) {
        return this.f53098iobyxmoadg.iobyxmoadg() ? g.eablkybsjg.f35584zoijcleaow.ppxfxbqfkf() : zdlpuopuiu(j13);
    }

    public final long zynmafqrjb(long j13) {
        return this.f53095eablkybsjg ? g.eablkybsjg.oxmwwwfdhm(j13, -1.0f) : j13;
    }
}
