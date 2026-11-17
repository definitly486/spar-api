package skhdrjzrfn;

import j0.m;

/* JADX INFO: loaded from: classes.dex */
public abstract class btonecajqb {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final h f107340eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private long f107341gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final j0.eablkybsjg f107342iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private j0.eablkybsjg f107343lqeggnwhkg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final j0.f f107344ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final p0.ylkuphrtab f107345wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final long f107346zoijcleaow;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    public static final iobyxmoadg f107339nufgyqmvbu = new iobyxmoadg(null);

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    public static final int f107338dxjokdxxww = 8;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    public /* synthetic */ btonecajqb(j0.eablkybsjg eablkybsjgVar, long j13, j0.f fVar, p0.ylkuphrtab ylkuphrtabVar, h hVar, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(eablkybsjgVar, j13, fVar, ylkuphrtabVar, hVar);
    }

    private final int agtfadlqog(j0.f fVar, int i13) {
        while (i13 < this.f107342iobyxmoadg.length()) {
            long jIstkbnxepw = fVar.istkbnxepw(iobyxmoadg(i13));
            if (j0.l.dxjokdxxww(jIstkbnxepw) > i13) {
                return this.f107345wkgbmnqykc.iobyxmoadg(j0.l.dxjokdxxww(jIstkbnxepw));
            }
            i13++;
        }
        return this.f107342iobyxmoadg.length();
    }

    private final int btonecajqb(j0.f fVar, int i13) {
        return this.f107345wkgbmnqykc.iobyxmoadg(fVar.yggfygwlhe(fVar.vdvldrhtss(i13)));
    }

    private final btonecajqb cdpycssgdh() {
        int iDraadjrbmk;
        iwizpuwonk().zoijcleaow();
        if (cqumvgiudr().length() > 0 && (iDraadjrbmk = draadjrbmk()) != -1) {
            ntlheqmsrt(iDraadjrbmk);
        }
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    private final int crxdokpmqz() {
        return this.f107345wkgbmnqykc.zoijcleaow(j0.l.gtknphoqwx(this.f107341gxszxtbevo));
    }

    private final boolean esjtqupxsv() {
        j0.f fVar = this.f107344ppxfxbqfkf;
        return (fVar != null ? fVar.esjtqupxsv(sopmlzcsov()) : null) != v0.dxjokdxxww.Rtl;
    }

    static /* synthetic */ int gtknphoqwx(btonecajqb btonecajqbVar, j0.f fVar, int i13, int i14, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLineStartByOffsetForLayout");
        }
        if ((i14 & 1) != 0) {
            i13 = btonecajqbVar.jlmebxxoox();
        }
        return btonecajqbVar.btonecajqb(fVar, i13);
    }

    private final int iobyxmoadg(int i13) {
        return zg.gtknphoqwx.btonecajqb(i13, cqumvgiudr().length() - 1);
    }

    private final btonecajqb iozdgvuglv() {
        Integer numWflxmlrfwp;
        iwizpuwonk().zoijcleaow();
        if (cqumvgiudr().length() > 0 && (numWflxmlrfwp = wflxmlrfwp()) != null) {
            ntlheqmsrt(numWflxmlrfwp.intValue());
        }
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    private final int jlmebxxoox() {
        return this.f107345wkgbmnqykc.zoijcleaow(j0.l.draadjrbmk(this.f107341gxszxtbevo));
    }

    private final int kcexrzcfyt(j0.f fVar, int i13) {
        while (i13 > 0) {
            long jIstkbnxepw = fVar.istkbnxepw(iobyxmoadg(i13));
            if (j0.l.agtfadlqog(jIstkbnxepw) < i13) {
                return this.f107345wkgbmnqykc.iobyxmoadg(j0.l.agtfadlqog(jIstkbnxepw));
            }
            i13--;
        }
        return 0;
    }

    private final int lereixgezr(j0.f fVar, int i13) {
        int iSopmlzcsov = sopmlzcsov();
        if (this.f107340eablkybsjg.iobyxmoadg() == null) {
            this.f107340eablkybsjg.ppxfxbqfkf(Float.valueOf(fVar.eablkybsjg(iSopmlzcsov).nufgyqmvbu()));
        }
        int iVdvldrhtss = fVar.vdvldrhtss(iSopmlzcsov) + i13;
        if (iVdvldrhtss < 0) {
            return 0;
        }
        if (iVdvldrhtss >= fVar.agtfadlqog()) {
            return cqumvgiudr().length();
        }
        float fWflxmlrfwp = fVar.wflxmlrfwp(iVdvldrhtss) - 1;
        Float fIobyxmoadg = this.f107340eablkybsjg.iobyxmoadg();
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(fIobyxmoadg);
        float fFloatValue = fIobyxmoadg.floatValue();
        if ((esjtqupxsv() && fFloatValue >= fVar.zdlpuopuiu(iVdvldrhtss)) || (!esjtqupxsv() && fFloatValue <= fVar.kcexrzcfyt(iVdvldrhtss))) {
            return fVar.ojitshcjhn(iVdvldrhtss, true);
        }
        return this.f107345wkgbmnqykc.iobyxmoadg(fVar.cqumvgiudr(g.eablkybsjg.eablkybsjg((((long) Float.floatToRawIntBits(fIobyxmoadg.floatValue())) << 32) | (((long) Float.floatToRawIntBits(fWflxmlrfwp)) & 4294967295L))));
    }

    private final btonecajqb lmojexxdyd() {
        int iVdvldrhtss;
        iwizpuwonk().zoijcleaow();
        if (cqumvgiudr().length() > 0 && (iVdvldrhtss = vdvldrhtss()) != -1) {
            ntlheqmsrt(iVdvldrhtss);
        }
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    private final int lqeggnwhkg(j0.f fVar, int i13) {
        return this.f107345wkgbmnqykc.iobyxmoadg(fVar.ojitshcjhn(fVar.vdvldrhtss(i13), true));
    }

    static /* synthetic */ int nufgyqmvbu(btonecajqb btonecajqbVar, j0.f fVar, int i13, int i14, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLineEndByOffsetForLayout");
        }
        if ((i14 & 1) != 0) {
            i13 = btonecajqbVar.crxdokpmqz();
        }
        return btonecajqbVar.lqeggnwhkg(fVar, i13);
    }

    static /* synthetic */ int ojitshcjhn(btonecajqb btonecajqbVar, j0.f fVar, int i13, int i14, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getNextWordOffsetForLayout");
        }
        if ((i14 & 1) != 0) {
            i13 = btonecajqbVar.sopmlzcsov();
        }
        return btonecajqbVar.agtfadlqog(fVar, i13);
    }

    private final int sopmlzcsov() {
        return this.f107345wkgbmnqykc.zoijcleaow(j0.l.dxjokdxxww(this.f107341gxszxtbevo));
    }

    private final btonecajqb ylkuphrtab() {
        Integer numYggfygwlhe;
        iwizpuwonk().zoijcleaow();
        if (cqumvgiudr().length() > 0 && (numYggfygwlhe = yggfygwlhe()) != null) {
            ntlheqmsrt(numYggfygwlhe.intValue());
        }
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    static /* synthetic */ int zdlpuopuiu(btonecajqb btonecajqbVar, j0.f fVar, int i13, int i14, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getPrevWordOffset");
        }
        if ((i14 & 1) != 0) {
            i13 = btonecajqbVar.sopmlzcsov();
        }
        return btonecajqbVar.kcexrzcfyt(fVar, i13);
    }

    public final btonecajqb cllcsxoeiz() {
        Integer numGxszxtbevo;
        iwizpuwonk().zoijcleaow();
        if (cqumvgiudr().length() > 0 && (numGxszxtbevo = gxszxtbevo()) != null) {
            ntlheqmsrt(numGxszxtbevo.intValue());
        }
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final String cqumvgiudr() {
        return this.f107343lqeggnwhkg.btonecajqb();
    }

    public final int draadjrbmk() {
        return opjhrmiecq.fmlbqenlif.ppxfxbqfkf(this.f107343lqeggnwhkg.btonecajqb(), j0.l.dxjokdxxww(this.f107341gxszxtbevo));
    }

    public final btonecajqb dsvhmnatus() {
        iwizpuwonk().zoijcleaow();
        if (cqumvgiudr().length() > 0) {
            if (esjtqupxsv()) {
                stevsuqkhv();
            } else {
                cllcsxoeiz();
            }
        }
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final Integer dxjokdxxww() {
        j0.f fVar = this.f107344ppxfxbqfkf;
        if (fVar != null) {
            return Integer.valueOf(gtknphoqwx(this, fVar, 0, 1, null));
        }
        return null;
    }

    public final j0.eablkybsjg eablkybsjg() {
        return this.f107343lqeggnwhkg;
    }

    public final Integer gxszxtbevo() {
        j0.f fVar = this.f107344ppxfxbqfkf;
        if (fVar != null) {
            return Integer.valueOf(nufgyqmvbu(this, fVar, 0, 1, null));
        }
        return null;
    }

    public final btonecajqb hcddaimhww() {
        iwizpuwonk().zoijcleaow();
        if (cqumvgiudr().length() > 0) {
            if (esjtqupxsv()) {
                iozdgvuglv();
            } else {
                ylkuphrtab();
            }
        }
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final btonecajqb hkdspvbjdz() {
        iwizpuwonk().zoijcleaow();
        if (cqumvgiudr().length() > 0) {
            ntlheqmsrt(0);
        }
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final btonecajqb istkbnxepw() {
        iwizpuwonk().zoijcleaow();
        if (cqumvgiudr().length() > 0) {
            if (esjtqupxsv()) {
                ylkuphrtab();
            } else {
                iozdgvuglv();
            }
        }
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final h iwizpuwonk() {
        return this.f107340eablkybsjg;
    }

    public final btonecajqb jpowsppfya() {
        iwizpuwonk().zoijcleaow();
        if (cqumvgiudr().length() > 0) {
            ntlheqmsrt(cqumvgiudr().length());
        }
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final long jyumaefscl() {
        return this.f107341gxszxtbevo;
    }

    public final btonecajqb kegysxyocb() {
        j0.f fVar;
        if (cqumvgiudr().length() > 0 && (fVar = this.f107344ppxfxbqfkf) != null) {
            ntlheqmsrt(lereixgezr(fVar, -1));
        }
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final btonecajqb mbcevpiqjq() {
        if (cqumvgiudr().length() > 0) {
            this.f107341gxszxtbevo = m.zoijcleaow(j0.l.agtfadlqog(this.f107346zoijcleaow), j0.l.dxjokdxxww(this.f107341gxszxtbevo));
        }
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    protected final void ntlheqmsrt(int i13) {
        ulzqkzuiru(i13, i13);
    }

    public final int oxmwwwfdhm() {
        return opjhrmiecq.fmlbqenlif.zoijcleaow(this.f107343lqeggnwhkg.btonecajqb(), j0.l.dxjokdxxww(this.f107341gxszxtbevo), -1);
    }

    public final btonecajqb pkzmftpjix() {
        iwizpuwonk().zoijcleaow();
        if (cqumvgiudr().length() > 0) {
            if (esjtqupxsv()) {
                cdpycssgdh();
            } else {
                lmojexxdyd();
            }
        }
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final btonecajqb pmvmpeiblj() {
        j0.f fVar;
        if (cqumvgiudr().length() > 0 && (fVar = this.f107344ppxfxbqfkf) != null) {
            ntlheqmsrt(lereixgezr(fVar, 1));
        }
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final btonecajqb ppxfxbqfkf(tg.draadjrbmk draadjrbmkVar) {
        iwizpuwonk().zoijcleaow();
        if (cqumvgiudr().length() > 0) {
            if (j0.l.nufgyqmvbu(this.f107341gxszxtbevo)) {
                kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
                draadjrbmkVar.invoke(this);
            } else if (esjtqupxsv()) {
                ntlheqmsrt(j0.l.gtknphoqwx(this.f107341gxszxtbevo));
            } else {
                ntlheqmsrt(j0.l.draadjrbmk(this.f107341gxszxtbevo));
            }
        }
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final p0.ylkuphrtab rgvfuqvkyq() {
        return this.f107345wkgbmnqykc;
    }

    public final btonecajqb stevsuqkhv() {
        Integer numDxjokdxxww;
        iwizpuwonk().zoijcleaow();
        if (cqumvgiudr().length() > 0 && (numDxjokdxxww = dxjokdxxww()) != null) {
            ntlheqmsrt(numDxjokdxxww.intValue());
        }
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final btonecajqb tzroggbefp() {
        iwizpuwonk().zoijcleaow();
        if (cqumvgiudr().length() > 0) {
            ulzqkzuiru(0, cqumvgiudr().length());
        }
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    protected final void ulzqkzuiru(int i13, int i14) {
        this.f107341gxszxtbevo = m.zoijcleaow(i13, i14);
    }

    public final int vdvldrhtss() {
        return opjhrmiecq.fmlbqenlif.wkgbmnqykc(this.f107343lqeggnwhkg.btonecajqb(), j0.l.dxjokdxxww(this.f107341gxszxtbevo));
    }

    public final Integer wflxmlrfwp() {
        j0.f fVar = this.f107344ppxfxbqfkf;
        if (fVar != null) {
            return Integer.valueOf(ojitshcjhn(this, fVar, 0, 1, null));
        }
        return null;
    }

    public final btonecajqb wkgbmnqykc() {
        iwizpuwonk().zoijcleaow();
        if (cqumvgiudr().length() > 0) {
            ntlheqmsrt(j0.l.dxjokdxxww(this.f107341gxszxtbevo));
        }
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final btonecajqb wwaezpbzkn() {
        iwizpuwonk().zoijcleaow();
        if (cqumvgiudr().length() > 0) {
            int iZoijcleaow = opjhrmiecq.jrbgnlbqoe.zoijcleaow(cqumvgiudr(), j0.l.draadjrbmk(this.f107341gxszxtbevo));
            if (iZoijcleaow == j0.l.draadjrbmk(this.f107341gxszxtbevo) && iZoijcleaow != 0) {
                iZoijcleaow = opjhrmiecq.jrbgnlbqoe.zoijcleaow(cqumvgiudr(), iZoijcleaow - 1);
            }
            ntlheqmsrt(iZoijcleaow);
        }
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final btonecajqb wypolnanlu() {
        iwizpuwonk().zoijcleaow();
        if (cqumvgiudr().length() > 0) {
            if (esjtqupxsv()) {
                cllcsxoeiz();
            } else {
                stevsuqkhv();
            }
        }
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final btonecajqb yadqdtsiqt() {
        iwizpuwonk().zoijcleaow();
        if (cqumvgiudr().length() > 0) {
            int iIobyxmoadg = opjhrmiecq.jrbgnlbqoe.iobyxmoadg(cqumvgiudr(), j0.l.gtknphoqwx(this.f107341gxszxtbevo));
            if (iIobyxmoadg == j0.l.gtknphoqwx(this.f107341gxszxtbevo) && iIobyxmoadg != cqumvgiudr().length()) {
                iIobyxmoadg = opjhrmiecq.jrbgnlbqoe.iobyxmoadg(cqumvgiudr(), iIobyxmoadg + 1);
            }
            ntlheqmsrt(iIobyxmoadg);
        }
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final Integer yggfygwlhe() {
        j0.f fVar = this.f107344ppxfxbqfkf;
        if (fVar != null) {
            return Integer.valueOf(zdlpuopuiu(this, fVar, 0, 1, null));
        }
        return null;
    }

    public final btonecajqb zoijcleaow(tg.draadjrbmk draadjrbmkVar) {
        iwizpuwonk().zoijcleaow();
        if (cqumvgiudr().length() > 0) {
            if (j0.l.nufgyqmvbu(this.f107341gxszxtbevo)) {
                kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
                draadjrbmkVar.invoke(this);
            } else if (esjtqupxsv()) {
                ntlheqmsrt(j0.l.draadjrbmk(this.f107341gxszxtbevo));
            } else {
                ntlheqmsrt(j0.l.gtknphoqwx(this.f107341gxszxtbevo));
            }
        }
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final btonecajqb zynmafqrjb() {
        iwizpuwonk().zoijcleaow();
        if (cqumvgiudr().length() > 0) {
            if (esjtqupxsv()) {
                lmojexxdyd();
            } else {
                cdpycssgdh();
            }
        }
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    private btonecajqb(j0.eablkybsjg eablkybsjgVar, long j13, j0.f fVar, p0.ylkuphrtab ylkuphrtabVar, h hVar) {
        this.f107342iobyxmoadg = eablkybsjgVar;
        this.f107346zoijcleaow = j13;
        this.f107344ppxfxbqfkf = fVar;
        this.f107345wkgbmnqykc = ylkuphrtabVar;
        this.f107340eablkybsjg = hVar;
        this.f107341gxszxtbevo = j13;
        this.f107343lqeggnwhkg = eablkybsjgVar;
    }
}
