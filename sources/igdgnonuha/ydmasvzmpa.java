package igdgnonuha;

/* JADX INFO: loaded from: classes.dex */
final class ydmasvzmpa extends z.wflxmlrfwp implements z.nufgyqmvbu, z.yfnezrywwk {

    /* JADX INFO: renamed from: cllcsxoeiz, reason: collision with root package name */
    private final h.opjhrmiecq f44167cllcsxoeiz;

    /* JADX INFO: renamed from: dsvhmnatus, reason: collision with root package name */
    private z.btonecajqb f44168dsvhmnatus;

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name */
    private final metgxyhuhe.btonecajqb f44169hcddaimhww;

    /* JADX INFO: renamed from: hkdspvbjdz, reason: collision with root package name */
    private final float f44170hkdspvbjdz;

    /* JADX INFO: renamed from: jpowsppfya, reason: collision with root package name */
    private final boolean f44171jpowsppfya;

    static final class iobyxmoadg implements h.opjhrmiecq {
        iobyxmoadg() {
        }

        @Override // h.opjhrmiecq
        public final long iobyxmoadg() {
            long jIobyxmoadg = ydmasvzmpa.this.f44167cllcsxoeiz.iobyxmoadg();
            if (jIobyxmoadg != 16) {
                return jIobyxmoadg;
            }
            h2 h2Var = (h2) z.dxjokdxxww.iobyxmoadg(ydmasvzmpa.this, k2.gxszxtbevo());
            return (h2Var == null || h2Var.iobyxmoadg() == 16) ? i2.f43059iobyxmoadg.zoijcleaow(((h.oipsdeybqn) z.dxjokdxxww.iobyxmoadg(ydmasvzmpa.this, jlmebxxoox.iobyxmoadg())).iwizpuwonk(), ((wypolnanlu) z.dxjokdxxww.iobyxmoadg(ydmasvzmpa.this, kegysxyocb.gxszxtbevo())).ojitshcjhn()) : h2Var.iobyxmoadg();
        }
    }

    public /* synthetic */ ydmasvzmpa(metgxyhuhe.btonecajqb btonecajqbVar, boolean z13, float f13, h.opjhrmiecq opjhrmiecqVar, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(btonecajqbVar, z13, f13, opjhrmiecqVar);
    }

    private final void Q0() {
        this.f44168dsvhmnatus = H0(ageimvtcrz.btonecajqb.ppxfxbqfkf(this.f44169hcddaimhww, this.f44171jpowsppfya, this.f44170hkdspvbjdz, new iobyxmoadg(), new tg.iobyxmoadg() { // from class: igdgnonuha.yfnezrywwk
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ydmasvzmpa.R0(this.f44173zdlpuopuiu);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ageimvtcrz.ppxfxbqfkf R0(ydmasvzmpa ydmasvzmpaVar) {
        ageimvtcrz.ppxfxbqfkf ppxfxbqfkfVarZoijcleaow;
        h2 h2Var = (h2) z.dxjokdxxww.iobyxmoadg(ydmasvzmpaVar, k2.gxszxtbevo());
        return (h2Var == null || (ppxfxbqfkfVarZoijcleaow = h2Var.zoijcleaow()) == null) ? i2.f43059iobyxmoadg.iobyxmoadg(((h.oipsdeybqn) z.dxjokdxxww.iobyxmoadg(ydmasvzmpaVar, jlmebxxoox.iobyxmoadg())).iwizpuwonk(), ((wypolnanlu) z.dxjokdxxww.iobyxmoadg(ydmasvzmpaVar, kegysxyocb.gxszxtbevo())).ojitshcjhn()) : ppxfxbqfkfVarZoijcleaow;
    }

    private final void S0() {
        z.btonecajqb btonecajqbVar = this.f44168dsvhmnatus;
        if (btonecajqbVar != null) {
            K0(btonecajqbVar);
        }
        this.f44168dsvhmnatus = null;
    }

    private final void T0() {
        z.ydmasvzmpa.iobyxmoadg(this, new tg.iobyxmoadg() { // from class: igdgnonuha.uwvvkdfqfp
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ydmasvzmpa.U0(this.f43942zdlpuopuiu);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn U0(ydmasvzmpa ydmasvzmpaVar) {
        if (((h2) z.dxjokdxxww.iobyxmoadg(ydmasvzmpaVar, k2.gxszxtbevo())) == null) {
            ydmasvzmpaVar.S0();
        } else if (ydmasvzmpaVar.f44168dsvhmnatus == null) {
            ydmasvzmpaVar.Q0();
        }
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // z.yfnezrywwk
    public void igdgnonuha() {
        T0();
    }

    @Override // androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf
    public void q0() {
        T0();
    }

    private ydmasvzmpa(metgxyhuhe.btonecajqb btonecajqbVar, boolean z13, float f13, h.opjhrmiecq opjhrmiecqVar) {
        this.f44169hcddaimhww = btonecajqbVar;
        this.f44171jpowsppfya = z13;
        this.f44170hkdspvbjdz = f13;
        this.f44167cllcsxoeiz = opjhrmiecqVar;
    }
}
