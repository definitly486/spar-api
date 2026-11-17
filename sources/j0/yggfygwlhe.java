package j0;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class yggfygwlhe {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final float f50321eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final int f50322gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final cqumvgiudr f50323iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final List f50324lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final List f50325nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final boolean f50326ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final float f50327wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f50328zoijcleaow;

    public /* synthetic */ yggfygwlhe(cqumvgiudr cqumvgiudrVar, long j13, int i13, int i14, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(cqumvgiudrVar, j13, i13, i14);
    }

    private final void cllcsxoeiz(int i13) {
        boolean z13 = false;
        if (i13 >= 0 && i13 < eablkybsjg().btonecajqb().length()) {
            z13 = true;
        }
        if (z13) {
            return;
        }
        q0.iobyxmoadg.iobyxmoadg("offset(" + i13 + ") is out of bounds [0, " + eablkybsjg().length() + ')');
    }

    private final void dsvhmnatus(int i13) {
        boolean z13 = false;
        if (i13 >= 0 && i13 <= eablkybsjg().btonecajqb().length()) {
            z13 = true;
        }
        if (z13) {
            return;
        }
        q0.iobyxmoadg.iobyxmoadg("offset(" + i13 + ") is out of bounds [0, " + eablkybsjg().length() + ']');
    }

    private final eablkybsjg eablkybsjg() {
        return this.f50323iobyxmoadg.lqeggnwhkg();
    }

    public static /* synthetic */ int oxmwwwfdhm(yggfygwlhe yggfygwlheVar, int i13, boolean z13, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            z13 = false;
        }
        return yggfygwlheVar.vdvldrhtss(i13, z13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn wkgbmnqykc(long j13, float[] fArr, kotlin.jvm.internal.hcddaimhww hcddaimhwwVar, kotlin.jvm.internal.pkzmftpjix pkzmftpjixVar, cdpycssgdh cdpycssgdhVar) {
        long jZoijcleaow = m.zoijcleaow(cdpycssgdhVar.oxmwwwfdhm(cdpycssgdhVar.gxszxtbevo() > l.draadjrbmk(j13) ? cdpycssgdhVar.gxszxtbevo() : l.draadjrbmk(j13)), cdpycssgdhVar.oxmwwwfdhm(cdpycssgdhVar.zoijcleaow() < l.gtknphoqwx(j13) ? cdpycssgdhVar.zoijcleaow() : l.gtknphoqwx(j13)));
        cdpycssgdhVar.eablkybsjg().jyumaefscl(jZoijcleaow, fArr, hcddaimhwwVar.f60014zdlpuopuiu);
        int iBtonecajqb = hcddaimhwwVar.f60014zdlpuopuiu + (l.btonecajqb(jZoijcleaow) * 4);
        for (int i13 = hcddaimhwwVar.f60014zdlpuopuiu; i13 < iBtonecajqb; i13 += 4) {
            int i14 = i13 + 1;
            float f13 = fArr[i14];
            float f14 = pkzmftpjixVar.f60030zdlpuopuiu;
            fArr[i14] = f13 + f14;
            int i15 = i13 + 3;
            fArr[i15] = fArr[i15] + f14;
        }
        hcddaimhwwVar.f60014zdlpuopuiu = iBtonecajqb;
        pkzmftpjixVar.f60030zdlpuopuiu += cdpycssgdhVar.eablkybsjg().getHeight();
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void wypolnanlu(int i13) {
        boolean z13 = false;
        if (i13 >= 0 && i13 < this.f50322gxszxtbevo) {
            z13 = true;
        }
        if (z13) {
            return;
        }
        q0.iobyxmoadg.iobyxmoadg("lineIndex(" + i13 + ") is out of bounds [0, " + this.f50322gxszxtbevo + ')');
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn yadqdtsiqt(h.mhtqkkgtqm mhtqkkgtqmVar, int i13, int i14, cdpycssgdh cdpycssgdhVar) {
        h.mhtqkkgtqm.eablkybsjg(mhtqkkgtqmVar, cdpycssgdhVar.btonecajqb(cdpycssgdhVar.eablkybsjg().oxmwwwfdhm(cdpycssgdhVar.oxmwwwfdhm(i13), cdpycssgdhVar.oxmwwwfdhm(i14))), 0L, 2, null);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    public final float agtfadlqog() {
        if (this.f50325nufgyqmvbu.isEmpty()) {
            return 0.0f;
        }
        cdpycssgdh cdpycssgdhVar = (cdpycssgdh) hg.jyumaefscl.skhdrjzrfn(this.f50325nufgyqmvbu);
        return cdpycssgdhVar.ojitshcjhn(cdpycssgdhVar.eablkybsjg().iwizpuwonk());
    }

    public final float btonecajqb() {
        if (this.f50325nufgyqmvbu.isEmpty()) {
            return 0.0f;
        }
        return ((cdpycssgdh) this.f50325nufgyqmvbu.get(0)).eablkybsjg().lqeggnwhkg();
    }

    public final h.mhtqkkgtqm cdpycssgdh(final int i13, final int i14) {
        if (!(i13 >= 0 && i13 <= i14 && i14 <= eablkybsjg().btonecajqb().length())) {
            q0.iobyxmoadg.iobyxmoadg("Start(" + i13 + ") or End(" + i14 + ") is out of range [0.." + eablkybsjg().btonecajqb().length() + "), or start > end!");
        }
        if (i13 == i14) {
            return h.ntlheqmsrt.iobyxmoadg();
        }
        final h.mhtqkkgtqm mhtqkkgtqmVarIobyxmoadg = h.ntlheqmsrt.iobyxmoadg();
        pmvmpeiblj.gxszxtbevo(this.f50325nufgyqmvbu, m.zoijcleaow(i13, i14), new tg.draadjrbmk() { // from class: j0.zdlpuopuiu
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return yggfygwlhe.yadqdtsiqt(mhtqkkgtqmVarIobyxmoadg, i13, i14, (cdpycssgdh) obj);
            }
        });
        return mhtqkkgtqmVarIobyxmoadg;
    }

    public final int cqumvgiudr(int i13) {
        wypolnanlu(i13);
        cdpycssgdh cdpycssgdhVar = (cdpycssgdh) this.f50325nufgyqmvbu.get(pmvmpeiblj.wkgbmnqykc(this.f50325nufgyqmvbu, i13));
        return cdpycssgdhVar.wflxmlrfwp(cdpycssgdhVar.eablkybsjg().btonecajqb(cdpycssgdhVar.kcexrzcfyt(i13)));
    }

    public final float draadjrbmk(int i13, boolean z13) {
        dsvhmnatus(i13);
        cdpycssgdh cdpycssgdhVar = (cdpycssgdh) this.f50325nufgyqmvbu.get(i13 == eablkybsjg().length() ? hg.jyumaefscl.ojitshcjhn(this.f50325nufgyqmvbu) : pmvmpeiblj.zoijcleaow(this.f50325nufgyqmvbu, i13));
        return cdpycssgdhVar.eablkybsjg().kcexrzcfyt(cdpycssgdhVar.oxmwwwfdhm(i13), z13);
    }

    public final boolean dxjokdxxww() {
        return this.f50326ppxfxbqfkf;
    }

    public final float esjtqupxsv(int i13) {
        wypolnanlu(i13);
        cdpycssgdh cdpycssgdhVar = (cdpycssgdh) this.f50325nufgyqmvbu.get(pmvmpeiblj.wkgbmnqykc(this.f50325nufgyqmvbu, i13));
        return cdpycssgdhVar.ojitshcjhn(cdpycssgdhVar.eablkybsjg().wkgbmnqykc(cdpycssgdhVar.kcexrzcfyt(i13)));
    }

    public final float gtknphoqwx() {
        return this.f50321eablkybsjg;
    }

    public final v0.dxjokdxxww gxszxtbevo(int i13) {
        dsvhmnatus(i13);
        cdpycssgdh cdpycssgdhVar = (cdpycssgdh) this.f50325nufgyqmvbu.get(i13 == eablkybsjg().length() ? hg.jyumaefscl.ojitshcjhn(this.f50325nufgyqmvbu) : pmvmpeiblj.zoijcleaow(this.f50325nufgyqmvbu, i13));
        return cdpycssgdhVar.eablkybsjg().esjtqupxsv(cdpycssgdhVar.oxmwwwfdhm(i13));
    }

    public final List iozdgvuglv() {
        return this.f50324lqeggnwhkg;
    }

    public final List istkbnxepw() {
        return this.f50325nufgyqmvbu;
    }

    public final float iwizpuwonk(int i13) {
        wypolnanlu(i13);
        cdpycssgdh cdpycssgdhVar = (cdpycssgdh) this.f50325nufgyqmvbu.get(pmvmpeiblj.wkgbmnqykc(this.f50325nufgyqmvbu, i13));
        return cdpycssgdhVar.eablkybsjg().agtfadlqog(cdpycssgdhVar.kcexrzcfyt(i13));
    }

    public final void jpowsppfya(h.metgxyhuhe metgxyhuheVar, h.jztzpxfvev jztzpxfvevVar, float f13, h.c cVar, v0.gtknphoqwx gtknphoqwxVar, j.lqeggnwhkg lqeggnwhkgVar, int i13) {
        s0.zoijcleaow.iobyxmoadg(this, metgxyhuheVar, jztzpxfvevVar, f13, cVar, gtknphoqwxVar, lqeggnwhkgVar, i13);
    }

    public final float jyumaefscl(int i13) {
        wypolnanlu(i13);
        cdpycssgdh cdpycssgdhVar = (cdpycssgdh) this.f50325nufgyqmvbu.get(pmvmpeiblj.wkgbmnqykc(this.f50325nufgyqmvbu, i13));
        return cdpycssgdhVar.eablkybsjg().zdlpuopuiu(cdpycssgdhVar.kcexrzcfyt(i13));
    }

    public final int kcexrzcfyt(int i13) {
        int iZoijcleaow;
        if (i13 >= eablkybsjg().length()) {
            iZoijcleaow = hg.jyumaefscl.ojitshcjhn(this.f50325nufgyqmvbu);
        } else {
            iZoijcleaow = i13 < 0 ? 0 : pmvmpeiblj.zoijcleaow(this.f50325nufgyqmvbu, i13);
        }
        cdpycssgdh cdpycssgdhVar = (cdpycssgdh) this.f50325nufgyqmvbu.get(iZoijcleaow);
        return cdpycssgdhVar.agtfadlqog(cdpycssgdhVar.eablkybsjg().cqumvgiudr(cdpycssgdhVar.oxmwwwfdhm(i13)));
    }

    public final int lereixgezr() {
        return this.f50328zoijcleaow;
    }

    public final long lmojexxdyd(g.lqeggnwhkg lqeggnwhkgVar, int i13, c cVar) {
        l.iobyxmoadg iobyxmoadgVar;
        l.iobyxmoadg iobyxmoadgVar2;
        int iEablkybsjg = pmvmpeiblj.eablkybsjg(this.f50325nufgyqmvbu, lqeggnwhkgVar.gtknphoqwx());
        if (((cdpycssgdh) this.f50325nufgyqmvbu.get(iEablkybsjg)).iobyxmoadg() >= lqeggnwhkgVar.eablkybsjg() || iEablkybsjg == hg.jyumaefscl.ojitshcjhn(this.f50325nufgyqmvbu)) {
            cdpycssgdh cdpycssgdhVar = (cdpycssgdh) this.f50325nufgyqmvbu.get(iEablkybsjg);
            return cdpycssgdh.draadjrbmk(cdpycssgdhVar, cdpycssgdhVar.eablkybsjg().draadjrbmk(cdpycssgdhVar.rgvfuqvkyq(lqeggnwhkgVar), i13, cVar), false, 1, null);
        }
        int iEablkybsjg2 = pmvmpeiblj.eablkybsjg(this.f50325nufgyqmvbu, lqeggnwhkgVar.eablkybsjg());
        long jIobyxmoadg = l.f50289zoijcleaow.iobyxmoadg();
        while (true) {
            iobyxmoadgVar = l.f50289zoijcleaow;
            if (!l.lqeggnwhkg(jIobyxmoadg, iobyxmoadgVar.iobyxmoadg()) || iEablkybsjg > iEablkybsjg2) {
                break;
            }
            cdpycssgdh cdpycssgdhVar2 = (cdpycssgdh) this.f50325nufgyqmvbu.get(iEablkybsjg);
            jIobyxmoadg = cdpycssgdh.draadjrbmk(cdpycssgdhVar2, cdpycssgdhVar2.eablkybsjg().draadjrbmk(cdpycssgdhVar2.rgvfuqvkyq(lqeggnwhkgVar), i13, cVar), false, 1, null);
            iEablkybsjg++;
        }
        if (l.lqeggnwhkg(jIobyxmoadg, iobyxmoadgVar.iobyxmoadg())) {
            return iobyxmoadgVar.iobyxmoadg();
        }
        long jIobyxmoadg2 = iobyxmoadgVar.iobyxmoadg();
        while (true) {
            iobyxmoadgVar2 = l.f50289zoijcleaow;
            if (!l.lqeggnwhkg(jIobyxmoadg2, iobyxmoadgVar2.iobyxmoadg()) || iEablkybsjg > iEablkybsjg2) {
                break;
            }
            cdpycssgdh cdpycssgdhVar3 = (cdpycssgdh) this.f50325nufgyqmvbu.get(iEablkybsjg2);
            jIobyxmoadg2 = cdpycssgdh.draadjrbmk(cdpycssgdhVar3, cdpycssgdhVar3.eablkybsjg().draadjrbmk(cdpycssgdhVar3.rgvfuqvkyq(lqeggnwhkgVar), i13, cVar), false, 1, null);
            iEablkybsjg2--;
        }
        return l.lqeggnwhkg(jIobyxmoadg2, iobyxmoadgVar2.iobyxmoadg()) ? jIobyxmoadg : m.zoijcleaow(l.agtfadlqog(jIobyxmoadg), l.dxjokdxxww(jIobyxmoadg2));
    }

    public final g.lqeggnwhkg lqeggnwhkg(int i13) {
        cllcsxoeiz(i13);
        cdpycssgdh cdpycssgdhVar = (cdpycssgdh) this.f50325nufgyqmvbu.get(pmvmpeiblj.zoijcleaow(this.f50325nufgyqmvbu, i13));
        return cdpycssgdhVar.dxjokdxxww(cdpycssgdhVar.eablkybsjg().pmvmpeiblj(cdpycssgdhVar.oxmwwwfdhm(i13)));
    }

    public final g.lqeggnwhkg nufgyqmvbu(int i13) {
        dsvhmnatus(i13);
        cdpycssgdh cdpycssgdhVar = (cdpycssgdh) this.f50325nufgyqmvbu.get(i13 == eablkybsjg().length() ? hg.jyumaefscl.ojitshcjhn(this.f50325nufgyqmvbu) : pmvmpeiblj.zoijcleaow(this.f50325nufgyqmvbu, i13));
        return cdpycssgdhVar.dxjokdxxww(cdpycssgdhVar.eablkybsjg().eablkybsjg(cdpycssgdhVar.oxmwwwfdhm(i13)));
    }

    public final float ojitshcjhn(int i13) {
        wypolnanlu(i13);
        cdpycssgdh cdpycssgdhVar = (cdpycssgdh) this.f50325nufgyqmvbu.get(pmvmpeiblj.wkgbmnqykc(this.f50325nufgyqmvbu, i13));
        return cdpycssgdhVar.ojitshcjhn(cdpycssgdhVar.eablkybsjg().lereixgezr(cdpycssgdhVar.kcexrzcfyt(i13)));
    }

    public final void pkzmftpjix(h.metgxyhuhe metgxyhuheVar, long j13, h.c cVar, v0.gtknphoqwx gtknphoqwxVar, j.lqeggnwhkg lqeggnwhkgVar, int i13) {
        metgxyhuheVar.jyumaefscl();
        List list = this.f50325nufgyqmvbu;
        int size = list.size();
        for (int i14 = 0; i14 < size; i14++) {
            cdpycssgdh cdpycssgdhVar = (cdpycssgdh) list.get(i14);
            cdpycssgdhVar.eablkybsjg().yggfygwlhe(metgxyhuheVar, j13, cVar, gtknphoqwxVar, lqeggnwhkgVar, i13);
            metgxyhuheVar.wkgbmnqykc(0.0f, cdpycssgdhVar.eablkybsjg().getHeight());
        }
        metgxyhuheVar.agtfadlqog();
    }

    public final int pmvmpeiblj(long j13) {
        cdpycssgdh cdpycssgdhVar = (cdpycssgdh) this.f50325nufgyqmvbu.get(pmvmpeiblj.eablkybsjg(this.f50325nufgyqmvbu, Float.intBitsToFloat((int) (4294967295L & j13))));
        return cdpycssgdhVar.wkgbmnqykc() == 0 ? cdpycssgdhVar.gxszxtbevo() : cdpycssgdhVar.wflxmlrfwp(cdpycssgdhVar.eablkybsjg().dxjokdxxww(cdpycssgdhVar.vdvldrhtss(j13)));
    }

    public final float[] ppxfxbqfkf(final long j13, final float[] fArr, int i13) {
        cllcsxoeiz(l.draadjrbmk(j13));
        dsvhmnatus(l.gtknphoqwx(j13));
        final kotlin.jvm.internal.hcddaimhww hcddaimhwwVar = new kotlin.jvm.internal.hcddaimhww();
        hcddaimhwwVar.f60014zdlpuopuiu = i13;
        final kotlin.jvm.internal.pkzmftpjix pkzmftpjixVar = new kotlin.jvm.internal.pkzmftpjix();
        pmvmpeiblj.gxszxtbevo(this.f50325nufgyqmvbu, j13, new tg.draadjrbmk() { // from class: j0.kcexrzcfyt
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return yggfygwlhe.wkgbmnqykc(j13, fArr, hcddaimhwwVar, pkzmftpjixVar, (cdpycssgdh) obj);
            }
        });
        return fArr;
    }

    public final int rgvfuqvkyq() {
        return this.f50322gxszxtbevo;
    }

    public final int vdvldrhtss(int i13, boolean z13) {
        wypolnanlu(i13);
        cdpycssgdh cdpycssgdhVar = (cdpycssgdh) this.f50325nufgyqmvbu.get(pmvmpeiblj.wkgbmnqykc(this.f50325nufgyqmvbu, i13));
        return cdpycssgdhVar.wflxmlrfwp(cdpycssgdhVar.eablkybsjg().gtknphoqwx(cdpycssgdhVar.kcexrzcfyt(i13), z13));
    }

    public final cqumvgiudr wflxmlrfwp() {
        return this.f50323iobyxmoadg;
    }

    public final float wwaezpbzkn() {
        return this.f50327wkgbmnqykc;
    }

    public final float yggfygwlhe(int i13) {
        wypolnanlu(i13);
        cdpycssgdh cdpycssgdhVar = (cdpycssgdh) this.f50325nufgyqmvbu.get(pmvmpeiblj.wkgbmnqykc(this.f50325nufgyqmvbu, i13));
        return cdpycssgdhVar.eablkybsjg().ojitshcjhn(cdpycssgdhVar.kcexrzcfyt(i13));
    }

    public final long ylkuphrtab(int i13) {
        dsvhmnatus(i13);
        cdpycssgdh cdpycssgdhVar = (cdpycssgdh) this.f50325nufgyqmvbu.get(i13 == eablkybsjg().length() ? hg.jyumaefscl.ojitshcjhn(this.f50325nufgyqmvbu) : pmvmpeiblj.zoijcleaow(this.f50325nufgyqmvbu, i13));
        return cdpycssgdhVar.gtknphoqwx(cdpycssgdhVar.eablkybsjg().gxszxtbevo(cdpycssgdhVar.oxmwwwfdhm(i13)), false);
    }

    public final int zdlpuopuiu(float f13) {
        cdpycssgdh cdpycssgdhVar = (cdpycssgdh) this.f50325nufgyqmvbu.get(pmvmpeiblj.eablkybsjg(this.f50325nufgyqmvbu, f13));
        return cdpycssgdhVar.wkgbmnqykc() == 0 ? cdpycssgdhVar.lqeggnwhkg() : cdpycssgdhVar.agtfadlqog(cdpycssgdhVar.eablkybsjg().vdvldrhtss(cdpycssgdhVar.zdlpuopuiu(f13)));
    }

    public final v0.dxjokdxxww zynmafqrjb(int i13) {
        dsvhmnatus(i13);
        cdpycssgdh cdpycssgdhVar = (cdpycssgdh) this.f50325nufgyqmvbu.get(i13 == eablkybsjg().length() ? hg.jyumaefscl.ojitshcjhn(this.f50325nufgyqmvbu) : pmvmpeiblj.zoijcleaow(this.f50325nufgyqmvbu, i13));
        return cdpycssgdhVar.eablkybsjg().ppxfxbqfkf(cdpycssgdhVar.oxmwwwfdhm(i13));
    }

    private yggfygwlhe(cqumvgiudr cqumvgiudrVar, long j13, int i13, int i14) {
        boolean z13;
        this.f50323iobyxmoadg = cqumvgiudrVar;
        this.f50328zoijcleaow = i13;
        int i15 = 0;
        if (!(w0.zoijcleaow.agtfadlqog(j13) == 0 && w0.zoijcleaow.wflxmlrfwp(j13) == 0)) {
            q0.iobyxmoadg.iobyxmoadg("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        ArrayList arrayList = new ArrayList();
        List listNufgyqmvbu = cqumvgiudrVar.nufgyqmvbu();
        int size = listNufgyqmvbu.size();
        int i16 = 0;
        float f13 = 0.0f;
        int i17 = 0;
        while (true) {
            if (i17 >= size) {
                z13 = false;
                break;
            }
            yadqdtsiqt yadqdtsiqtVar = (yadqdtsiqt) listNufgyqmvbu.get(i17);
            istkbnxepw istkbnxepwVarPpxfxbqfkf = wwaezpbzkn.ppxfxbqfkf(yadqdtsiqtVar.zoijcleaow(), w0.ppxfxbqfkf.zoijcleaow(0, w0.zoijcleaow.draadjrbmk(j13), 0, w0.zoijcleaow.lqeggnwhkg(j13) ? zg.gtknphoqwx.gxszxtbevo(w0.zoijcleaow.gtknphoqwx(j13) - wwaezpbzkn.wkgbmnqykc(f13), i15) : w0.zoijcleaow.gtknphoqwx(j13), 5, null), this.f50328zoijcleaow - i16, i14);
            float height = f13 + istkbnxepwVarPpxfxbqfkf.getHeight();
            int iWflxmlrfwp = i16 + istkbnxepwVarPpxfxbqfkf.wflxmlrfwp();
            arrayList.add(new cdpycssgdh(istkbnxepwVarPpxfxbqfkf, yadqdtsiqtVar.ppxfxbqfkf(), yadqdtsiqtVar.iobyxmoadg(), i16, iWflxmlrfwp, f13, height));
            if (istkbnxepwVarPpxfxbqfkf.rgvfuqvkyq() || (iWflxmlrfwp == this.f50328zoijcleaow && i17 != hg.jyumaefscl.ojitshcjhn(this.f50323iobyxmoadg.nufgyqmvbu()))) {
                i16 = iWflxmlrfwp;
                f13 = height;
                z13 = true;
                break;
            } else {
                i17++;
                i16 = iWflxmlrfwp;
                f13 = height;
                i15 = 0;
            }
        }
        this.f50321eablkybsjg = f13;
        this.f50322gxszxtbevo = i16;
        this.f50326ppxfxbqfkf = z13;
        this.f50325nufgyqmvbu = arrayList;
        this.f50327wkgbmnqykc = w0.zoijcleaow.draadjrbmk(j13);
        List arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i18 = 0; i18 < size2; i18++) {
            cdpycssgdh cdpycssgdhVar = (cdpycssgdh) arrayList.get(i18);
            List listZynmafqrjb = cdpycssgdhVar.eablkybsjg().zynmafqrjb();
            ArrayList arrayList3 = new ArrayList(listZynmafqrjb.size());
            int size3 = listZynmafqrjb.size();
            for (int i19 = 0; i19 < size3; i19++) {
                g.lqeggnwhkg lqeggnwhkgVar = (g.lqeggnwhkg) listZynmafqrjb.get(i19);
                arrayList3.add(lqeggnwhkgVar != null ? cdpycssgdhVar.dxjokdxxww(lqeggnwhkgVar) : null);
            }
            hg.jyumaefscl.istkbnxepw(arrayList2, arrayList3);
        }
        if (arrayList2.size() < this.f50323iobyxmoadg.dxjokdxxww().size()) {
            int size4 = this.f50323iobyxmoadg.dxjokdxxww().size() - arrayList2.size();
            ArrayList arrayList4 = new ArrayList(size4);
            for (int i23 = 0; i23 < size4; i23++) {
                arrayList4.add(null);
            }
            arrayList2 = hg.jyumaefscl.ixidwrxhsl(arrayList2, arrayList4);
        }
        this.f50324lqeggnwhkg = arrayList2;
    }
}
