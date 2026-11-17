package jztzpxfvev;

/* JADX INFO: loaded from: classes.dex */
public final class hcddaimhww extends yadqdtsiqt {

    /* JADX INFO: renamed from: crxdokpmqz, reason: collision with root package name */
    private tg.vdvldrhtss f52679crxdokpmqz;

    /* JADX INFO: renamed from: jlmebxxoox, reason: collision with root package name */
    private tg.vdvldrhtss f52680jlmebxxoox;

    /* JADX INFO: renamed from: ntlheqmsrt, reason: collision with root package name */
    private jpowsppfya f52681ntlheqmsrt;

    /* JADX INFO: renamed from: ribwqtqdhb, reason: collision with root package name */
    private boolean f52682ribwqtqdhb;

    /* JADX INFO: renamed from: sopmlzcsov, reason: collision with root package name */
    private boolean f52683sopmlzcsov;

    /* JADX INFO: renamed from: ulzqkzuiru, reason: collision with root package name */
    private jlmebxxoox f52684ulzqkzuiru;

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ hcddaimhww f52685iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ tg.rgvfuqvkyq f52686jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private /* synthetic */ Object f52687yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f52688zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        iobyxmoadg(tg.rgvfuqvkyq rgvfuqvkyqVar, hcddaimhww hcddaimhwwVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f52686jyumaefscl = rgvfuqvkyqVar;
            this.f52685iwizpuwonk = hcddaimhwwVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final gg.wwaezpbzkn zdlpuopuiu(iozdgvuglv iozdgvuglvVar, hcddaimhww hcddaimhwwVar, ojitshcjhn.zoijcleaow zoijcleaowVar) {
            iozdgvuglvVar.iobyxmoadg(ylkuphrtab.draadjrbmk(hcddaimhwwVar.s1(zoijcleaowVar.iobyxmoadg()), hcddaimhwwVar.f52684ulzqkzuiru));
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            iobyxmoadg iobyxmoadgVar = new iobyxmoadg(this.f52686jyumaefscl, this.f52685iwizpuwonk, gxszxtbevoVar);
            iobyxmoadgVar.f52687yggfygwlhe = obj;
            return iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f52688zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                final iozdgvuglv iozdgvuglvVar = (iozdgvuglv) this.f52687yggfygwlhe;
                tg.rgvfuqvkyq rgvfuqvkyqVar = this.f52686jyumaefscl;
                final hcddaimhww hcddaimhwwVar = this.f52685iwizpuwonk;
                tg.draadjrbmk draadjrbmkVar = new tg.draadjrbmk() { // from class: jztzpxfvev.pkzmftpjix
                    @Override // tg.draadjrbmk
                    public final Object invoke(Object obj2) {
                        return hcddaimhww.iobyxmoadg.zdlpuopuiu(iozdgvuglvVar, hcddaimhwwVar, (ojitshcjhn.zoijcleaow) obj2);
                    }
                };
                this.f52688zdlpuopuiu = 1;
                if (rgvfuqvkyqVar.invoke(draadjrbmkVar, this) == objGxszxtbevo) {
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
        /* JADX INFO: renamed from: kcexrzcfyt, reason: merged with bridge method [inline-methods] */
        public final Object invoke(iozdgvuglv iozdgvuglvVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((iobyxmoadg) create(iozdgvuglvVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ long f52689iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private /* synthetic */ Object f52691yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f52692zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ppxfxbqfkf(long j13, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f52689iwizpuwonk = j13;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            ppxfxbqfkf ppxfxbqfkfVar = hcddaimhww.this.new ppxfxbqfkf(this.f52689iwizpuwonk, gxszxtbevoVar);
            ppxfxbqfkfVar.f52691yggfygwlhe = obj;
            return ppxfxbqfkfVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f52692zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                pj.cllcsxoeiz cllcsxoeizVar = (pj.cllcsxoeiz) this.f52691yggfygwlhe;
                tg.vdvldrhtss vdvldrhtssVar = hcddaimhww.this.f52680jlmebxxoox;
                Float fPpxfxbqfkf = kotlin.coroutines.jvm.internal.zoijcleaow.ppxfxbqfkf(ylkuphrtab.wflxmlrfwp(hcddaimhww.this.r1(this.f52689iwizpuwonk), hcddaimhww.this.f52684ulzqkzuiru));
                this.f52692zdlpuopuiu = 1;
                if (vdvldrhtssVar.invoke(cllcsxoeizVar, fPpxfxbqfkf, this) == objGxszxtbevo) {
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
        public final Object invoke(pj.cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((ppxfxbqfkf) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ long f52693iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private /* synthetic */ Object f52695yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f52696zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zoijcleaow(long j13, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f52693iwizpuwonk = j13;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            zoijcleaow zoijcleaowVar = hcddaimhww.this.new zoijcleaow(this.f52693iwizpuwonk, gxszxtbevoVar);
            zoijcleaowVar.f52695yggfygwlhe = obj;
            return zoijcleaowVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f52696zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                pj.cllcsxoeiz cllcsxoeizVar = (pj.cllcsxoeiz) this.f52695yggfygwlhe;
                tg.vdvldrhtss vdvldrhtssVar = hcddaimhww.this.f52679crxdokpmqz;
                g.eablkybsjg eablkybsjgVarWkgbmnqykc = g.eablkybsjg.wkgbmnqykc(this.f52693iwizpuwonk);
                this.f52696zdlpuopuiu = 1;
                if (vdvldrhtssVar.invoke(cllcsxoeizVar, eablkybsjgVarWkgbmnqykc, this) == objGxszxtbevo) {
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
        public final Object invoke(pj.cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((zoijcleaow) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public hcddaimhww(jpowsppfya jpowsppfyaVar, tg.draadjrbmk draadjrbmkVar, jlmebxxoox jlmebxxooxVar, boolean z13, metgxyhuhe.draadjrbmk draadjrbmkVar2, boolean z14, tg.vdvldrhtss vdvldrhtssVar, tg.vdvldrhtss vdvldrhtssVar2, boolean z15) {
        super(draadjrbmkVar, z13, draadjrbmkVar2, jlmebxxooxVar);
        this.f52681ntlheqmsrt = jpowsppfyaVar;
        this.f52684ulzqkzuiru = jlmebxxooxVar;
        this.f52683sopmlzcsov = z14;
        this.f52679crxdokpmqz = vdvldrhtssVar;
        this.f52680jlmebxxoox = vdvldrhtssVar2;
        this.f52682ribwqtqdhb = z15;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long r1(long j13) {
        return w0.esjtqupxsv.wflxmlrfwp(j13, this.f52682ribwqtqdhb ? -1.0f : 1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long s1(long j13) {
        return g.eablkybsjg.oxmwwwfdhm(j13, this.f52682ribwqtqdhb ? -1.0f : 1.0f);
    }

    @Override // jztzpxfvev.yadqdtsiqt
    public Object a1(tg.rgvfuqvkyq rgvfuqvkyqVar, lg.gxszxtbevo gxszxtbevoVar) {
        Object objZoijcleaow = this.f52681ntlheqmsrt.zoijcleaow(ikoacuggdj.ribwqtqdhb.UserInput, new iobyxmoadg(rgvfuqvkyqVar, this, null), gxszxtbevoVar);
        return objZoijcleaow == mg.zoijcleaow.gxszxtbevo() ? objZoijcleaow : gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // jztzpxfvev.yadqdtsiqt
    public void e1(long j13) {
        if (!n0() || kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f52679crxdokpmqz, ylkuphrtab.f53087iobyxmoadg)) {
            return;
        }
        pj.gtknphoqwx.wkgbmnqykc(g0(), null, pj.wypolnanlu.UNDISPATCHED, new zoijcleaow(j13, null), 1, null);
    }

    @Override // jztzpxfvev.yadqdtsiqt
    public void f1(long j13) {
        if (!n0() || kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f52680jlmebxxoox, ylkuphrtab.f53088zoijcleaow)) {
            return;
        }
        pj.gtknphoqwx.wkgbmnqykc(g0(), null, pj.wypolnanlu.UNDISPATCHED, new ppxfxbqfkf(j13, null), 1, null);
    }

    @Override // jztzpxfvev.yadqdtsiqt
    public boolean j1() {
        return this.f52683sopmlzcsov;
    }

    public final void t1(jpowsppfya jpowsppfyaVar, tg.draadjrbmk draadjrbmkVar, jlmebxxoox jlmebxxooxVar, boolean z13, metgxyhuhe.draadjrbmk draadjrbmkVar2, boolean z14, tg.vdvldrhtss vdvldrhtssVar, tg.vdvldrhtss vdvldrhtssVar2, boolean z15) {
        boolean z16;
        boolean z17;
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f52681ntlheqmsrt, jpowsppfyaVar)) {
            z16 = false;
        } else {
            this.f52681ntlheqmsrt = jpowsppfyaVar;
            z16 = true;
        }
        if (this.f52684ulzqkzuiru != jlmebxxooxVar) {
            this.f52684ulzqkzuiru = jlmebxxooxVar;
            z16 = true;
        }
        if (this.f52682ribwqtqdhb != z15) {
            this.f52682ribwqtqdhb = z15;
            z17 = true;
        } else {
            z17 = z16;
        }
        this.f52679crxdokpmqz = vdvldrhtssVar;
        this.f52680jlmebxxoox = vdvldrhtssVar2;
        this.f52683sopmlzcsov = z14;
        l1(draadjrbmkVar, z13, draadjrbmkVar2, jlmebxxooxVar, z17);
    }
}
