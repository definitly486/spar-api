package ikoacuggdj;

/* JADX INFO: loaded from: classes.dex */
public final class uawqvzlxes extends androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf implements z.yadqdtsiqt, z.iwxlajgraz {

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name */
    private boolean f44915hcddaimhww;

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
    private boolean f44916pkzmftpjix;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
    private lxfrhoxuzk f44917ylkuphrtab;

    public uawqvzlxes(lxfrhoxuzk lxfrhoxuzkVar, boolean z13, boolean z14) {
        this.f44917ylkuphrtab = lxfrhoxuzkVar;
        this.f44916pkzmftpjix = z13;
        this.f44915hcddaimhww = z14;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float L0(uawqvzlxes uawqvzlxesVar) {
        return uawqvzlxesVar.f44917ylkuphrtab.kcexrzcfyt();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float M0(uawqvzlxes uawqvzlxesVar) {
        return uawqvzlxesVar.f44917ylkuphrtab.oxmwwwfdhm();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn N0(uawqvzlxes uawqvzlxesVar, int i13, final androidx.compose.ui.layout.kcexrzcfyt kcexrzcfytVar, androidx.compose.ui.layout.kcexrzcfyt.iobyxmoadg iobyxmoadgVar) {
        int iKcexrzcfyt = uawqvzlxesVar.f44917ylkuphrtab.kcexrzcfyt();
        if (iKcexrzcfyt < 0) {
            iKcexrzcfyt = 0;
        }
        if (iKcexrzcfyt > i13) {
            iKcexrzcfyt = i13;
        }
        int i14 = uawqvzlxesVar.f44916pkzmftpjix ? iKcexrzcfyt - i13 : -iKcexrzcfyt;
        boolean z13 = uawqvzlxesVar.f44915hcddaimhww;
        final int i15 = z13 ? 0 : i14;
        final int i16 = z13 ? i14 : 0;
        iobyxmoadgVar.iyctptxqzt(new tg.draadjrbmk() { // from class: ikoacuggdj.roivzttewh
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return uawqvzlxes.O0(kcexrzcfytVar, i15, i16, (androidx.compose.ui.layout.kcexrzcfyt.iobyxmoadg) obj);
            }
        });
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn O0(androidx.compose.ui.layout.kcexrzcfyt kcexrzcfytVar, int i13, int i14, androidx.compose.ui.layout.kcexrzcfyt.iobyxmoadg iobyxmoadgVar) {
        androidx.compose.ui.layout.kcexrzcfyt.iobyxmoadg.jlmebxxoox(iobyxmoadgVar, kcexrzcfytVar, i13, i14, 0.0f, null, 12, null);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    public final void P0(boolean z13) {
        this.f44916pkzmftpjix = z13;
    }

    public final void Q0(lxfrhoxuzk lxfrhoxuzkVar) {
        this.f44917ylkuphrtab = lxfrhoxuzkVar;
    }

    public final void R0(boolean z13) {
        this.f44915hcddaimhww = z13;
    }

    @Override // z.yadqdtsiqt
    public int cdpycssgdh(x.wflxmlrfwp wflxmlrfwpVar, x.draadjrbmk draadjrbmkVar, int i13) {
        if (this.f44915hcddaimhww) {
            i13 = Integer.MAX_VALUE;
        }
        return draadjrbmkVar.czzsidtyhn(i13);
    }

    @Override // z.yadqdtsiqt
    public x.istkbnxepw gxszxtbevo(androidx.compose.ui.layout.draadjrbmk draadjrbmkVar, x.pmvmpeiblj pmvmpeibljVar, long j13) {
        yggfygwlhe.iobyxmoadg(j13, this.f44915hcddaimhww ? jztzpxfvev.jlmebxxoox.Vertical : jztzpxfvev.jlmebxxoox.Horizontal);
        final androidx.compose.ui.layout.kcexrzcfyt kcexrzcfytVarSflfametgt = pmvmpeibljVar.sflfametgt(w0.zoijcleaow.wkgbmnqykc(j13, 0, this.f44915hcddaimhww ? w0.zoijcleaow.draadjrbmk(j13) : Integer.MAX_VALUE, 0, this.f44915hcddaimhww ? Integer.MAX_VALUE : w0.zoijcleaow.gtknphoqwx(j13), 5, null));
        int iBtonecajqb = zg.gtknphoqwx.btonecajqb(kcexrzcfytVarSflfametgt.eslsurpljm(), w0.zoijcleaow.draadjrbmk(j13));
        int iBtonecajqb2 = zg.gtknphoqwx.btonecajqb(kcexrzcfytVarSflfametgt.ipoelvxyzq(), w0.zoijcleaow.gtknphoqwx(j13));
        final int iIpoelvxyzq = kcexrzcfytVarSflfametgt.ipoelvxyzq() - iBtonecajqb2;
        int iEslsurpljm = kcexrzcfytVarSflfametgt.eslsurpljm() - iBtonecajqb;
        if (!this.f44915hcddaimhww) {
            iIpoelvxyzq = iEslsurpljm;
        }
        this.f44917ylkuphrtab.yggfygwlhe(iIpoelvxyzq);
        this.f44917ylkuphrtab.iwizpuwonk(this.f44915hcddaimhww ? iBtonecajqb2 : iBtonecajqb);
        return androidx.compose.ui.layout.draadjrbmk.ntlheqmsrt(draadjrbmkVar, iBtonecajqb, iBtonecajqb2, null, new tg.draadjrbmk() { // from class: ikoacuggdj.zeieaojujs
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return uawqvzlxes.N0(this.f44965zdlpuopuiu, iIpoelvxyzq, kcexrzcfytVarSflfametgt, (androidx.compose.ui.layout.kcexrzcfyt.iobyxmoadg) obj);
            }
        }, 4, null);
    }

    @Override // z.yadqdtsiqt
    public int lmojexxdyd(x.wflxmlrfwp wflxmlrfwpVar, x.draadjrbmk draadjrbmkVar, int i13) {
        if (this.f44915hcddaimhww) {
            i13 = Integer.MAX_VALUE;
        }
        return draadjrbmkVar.ydmasvzmpa(i13);
    }

    @Override // z.yadqdtsiqt
    public int lqeggnwhkg(x.wflxmlrfwp wflxmlrfwpVar, x.draadjrbmk draadjrbmkVar, int i13) {
        if (!this.f44915hcddaimhww) {
            i13 = Integer.MAX_VALUE;
        }
        return draadjrbmkVar.yggfygwlhe(i13);
    }

    @Override // z.yadqdtsiqt
    public int oxmwwwfdhm(x.wflxmlrfwp wflxmlrfwpVar, x.draadjrbmk draadjrbmkVar, int i13) {
        if (!this.f44915hcddaimhww) {
            i13 = Integer.MAX_VALUE;
        }
        return draadjrbmkVar.wypolnanlu(i13);
    }

    @Override // z.iwxlajgraz
    public void yfnezrywwk(g0.yadqdtsiqt yadqdtsiqtVar) {
        g0.zynmafqrjb.uawqvzlxes(yadqdtsiqtVar, true);
        g0.btonecajqb btonecajqbVar = new g0.btonecajqb(new tg.iobyxmoadg() { // from class: ikoacuggdj.nuxfzjnpeb
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return Float.valueOf(uawqvzlxes.L0(this.f44868zdlpuopuiu));
            }
        }, new tg.iobyxmoadg() { // from class: ikoacuggdj.tbqsvytpvh
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return Float.valueOf(uawqvzlxes.M0(this.f44914zdlpuopuiu));
            }
        }, this.f44916pkzmftpjix);
        if (this.f44915hcddaimhww) {
            g0.zynmafqrjb.auzgnhcxok(yadqdtsiqtVar, btonecajqbVar);
        } else {
            g0.zynmafqrjb.xrmfcynszj(yadqdtsiqtVar, btonecajqbVar);
        }
    }
}
