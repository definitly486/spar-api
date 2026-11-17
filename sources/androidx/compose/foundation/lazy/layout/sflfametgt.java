package androidx.compose.foundation.lazy.layout;

/* JADX INFO: loaded from: classes.dex */
final class sflfametgt extends androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf implements z.iwxlajgraz {

    /* JADX INFO: renamed from: cllcsxoeiz, reason: collision with root package name */
    private g0.btonecajqb f5115cllcsxoeiz;

    /* JADX INFO: renamed from: dsvhmnatus, reason: collision with root package name */
    private final tg.draadjrbmk f5116dsvhmnatus = new tg.draadjrbmk() { // from class: androidx.compose.foundation.lazy.layout.rlfsiqarku
        @Override // tg.draadjrbmk
        public final Object invoke(Object obj) {
            return Integer.valueOf(sflfametgt.P0(this.f5114zdlpuopuiu, obj));
        }
    };

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name */
    private jztzpxfvev.jlmebxxoox f5117hcddaimhww;

    /* JADX INFO: renamed from: hkdspvbjdz, reason: collision with root package name */
    private boolean f5118hkdspvbjdz;

    /* JADX INFO: renamed from: jpowsppfya, reason: collision with root package name */
    private boolean f5119jpowsppfya;

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
    private xrmfcynszj f5120pkzmftpjix;

    /* JADX INFO: renamed from: wypolnanlu, reason: collision with root package name */
    private tg.draadjrbmk f5121wypolnanlu;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
    private tg.iobyxmoadg f5122ylkuphrtab;

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ int f5123jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f5125zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        iobyxmoadg(int i13, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f5123jyumaefscl = i13;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return sflfametgt.this.new iobyxmoadg(this.f5123jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f5125zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                xrmfcynszj xrmfcynszjVar = sflfametgt.this.f5120pkzmftpjix;
                int i14 = this.f5123jyumaefscl;
                this.f5125zdlpuopuiu = 1;
                if (xrmfcynszjVar.zoijcleaow(i14, this) == objGxszxtbevo) {
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
            return ((iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public sflfametgt(tg.iobyxmoadg iobyxmoadgVar, xrmfcynszj xrmfcynszjVar, jztzpxfvev.jlmebxxoox jlmebxxooxVar, boolean z13, boolean z14) {
        this.f5122ylkuphrtab = iobyxmoadgVar;
        this.f5120pkzmftpjix = xrmfcynszjVar;
        this.f5117hcddaimhww = jlmebxxooxVar;
        this.f5119jpowsppfya = z13;
        this.f5118hkdspvbjdz = z14;
        S0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Float N0(sflfametgt sflfametgtVar) {
        return Float.valueOf(sflfametgtVar.f5120pkzmftpjix.eablkybsjg() - sflfametgtVar.f5120pkzmftpjix.iobyxmoadg());
    }

    private final g0.zoijcleaow O0() {
        return this.f5120pkzmftpjix.wkgbmnqykc();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int P0(sflfametgt sflfametgtVar, Object obj) {
        zynmafqrjb zynmafqrjbVar = (zynmafqrjb) sflfametgtVar.f5122ylkuphrtab.invoke();
        int iIobyxmoadg = zynmafqrjbVar.iobyxmoadg();
        for (int i13 = 0; i13 < iIobyxmoadg; i13++) {
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(zynmafqrjbVar.wkgbmnqykc(i13), obj)) {
                return i13;
            }
        }
        return -1;
    }

    private final boolean Q0() {
        return this.f5117hcddaimhww == jztzpxfvev.jlmebxxoox.Vertical;
    }

    private final void S0() {
        this.f5115cllcsxoeiz = new g0.btonecajqb(new tg.iobyxmoadg() { // from class: androidx.compose.foundation.lazy.layout.czzsidtyhn
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return Float.valueOf(sflfametgt.T0(this.f4974zdlpuopuiu));
            }
        }, new tg.iobyxmoadg() { // from class: androidx.compose.foundation.lazy.layout.uwvvkdfqfp
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return Float.valueOf(sflfametgt.U0(this.f5141zdlpuopuiu));
            }
        }, this.f5118hkdspvbjdz);
        this.f5121wypolnanlu = this.f5119jpowsppfya ? new tg.draadjrbmk() { // from class: androidx.compose.foundation.lazy.layout.yfnezrywwk
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return Boolean.valueOf(sflfametgt.V0(this.f5244zdlpuopuiu, ((Integer) obj).intValue()));
            }
        } : null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float T0(sflfametgt sflfametgtVar) {
        return sflfametgtVar.f5120pkzmftpjix.gxszxtbevo();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float U0(sflfametgt sflfametgtVar) {
        return sflfametgtVar.f5120pkzmftpjix.ppxfxbqfkf();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean V0(sflfametgt sflfametgtVar, int i13) {
        zynmafqrjb zynmafqrjbVar = (zynmafqrjb) sflfametgtVar.f5122ylkuphrtab.invoke();
        if (!(i13 >= 0 && i13 < zynmafqrjbVar.iobyxmoadg())) {
            rlfsiqarku.eablkybsjg.iobyxmoadg("Can't scroll to index " + i13 + ", it is out of bounds [0, " + zynmafqrjbVar.iobyxmoadg() + ')');
        }
        pj.gtknphoqwx.wkgbmnqykc(sflfametgtVar.g0(), null, null, sflfametgtVar.new iobyxmoadg(i13, null), 3, null);
        return true;
    }

    public final void R0(tg.iobyxmoadg iobyxmoadgVar, xrmfcynszj xrmfcynszjVar, jztzpxfvev.jlmebxxoox jlmebxxooxVar, boolean z13, boolean z14) {
        this.f5122ylkuphrtab = iobyxmoadgVar;
        this.f5120pkzmftpjix = xrmfcynszjVar;
        if (this.f5117hcddaimhww != jlmebxxooxVar) {
            this.f5117hcddaimhww = jlmebxxooxVar;
            z.dvvnrvtcbc.zoijcleaow(this);
        }
        if (this.f5119jpowsppfya == z13 && this.f5118hkdspvbjdz == z14) {
            return;
        }
        this.f5119jpowsppfya = z13;
        this.f5118hkdspvbjdz = z14;
        S0();
        z.dvvnrvtcbc.zoijcleaow(this);
    }

    @Override // androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf
    public boolean l0() {
        return false;
    }

    @Override // z.iwxlajgraz
    public void yfnezrywwk(g0.yadqdtsiqt yadqdtsiqtVar) {
        g0.zynmafqrjb.uawqvzlxes(yadqdtsiqtVar, true);
        g0.zynmafqrjb.zdlpuopuiu(yadqdtsiqtVar, this.f5116dsvhmnatus);
        if (Q0()) {
            g0.btonecajqb btonecajqbVar = this.f5115cllcsxoeiz;
            if (btonecajqbVar == null) {
                kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("scrollAxisRange");
                btonecajqbVar = null;
            }
            g0.zynmafqrjb.auzgnhcxok(yadqdtsiqtVar, btonecajqbVar);
        } else {
            g0.btonecajqb btonecajqbVar2 = this.f5115cllcsxoeiz;
            if (btonecajqbVar2 == null) {
                kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("scrollAxisRange");
                btonecajqbVar2 = null;
            }
            g0.zynmafqrjb.xrmfcynszj(yadqdtsiqtVar, btonecajqbVar2);
        }
        tg.draadjrbmk draadjrbmkVar = this.f5121wypolnanlu;
        if (draadjrbmkVar != null) {
            g0.zynmafqrjb.sopmlzcsov(yadqdtsiqtVar, null, draadjrbmkVar, 1, null);
        }
        g0.zynmafqrjb.vdvldrhtss(yadqdtsiqtVar, null, new tg.iobyxmoadg() { // from class: androidx.compose.foundation.lazy.layout.ydmasvzmpa
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return sflfametgt.N0(this.f5243zdlpuopuiu);
            }
        }, 1, null);
        g0.zynmafqrjb.jlmebxxoox(yadqdtsiqtVar, O0());
    }
}
