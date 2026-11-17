package d1;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class nufgyqmvbu {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static zoijcleaow.iobyxmoadg f26622iobyxmoadg = new zoijcleaow.iobyxmoadg();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static int f26624zoijcleaow = 0;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static int f26623ppxfxbqfkf = 0;

    private static void dxjokdxxww(int i13, c1.eablkybsjg eablkybsjgVar, zoijcleaow.InterfaceC0476zoijcleaow interfaceC0476zoijcleaow) {
        c1.wkgbmnqykc wkgbmnqykcVar;
        c1.wkgbmnqykc wkgbmnqykcVar2;
        c1.wkgbmnqykc wkgbmnqykcVar3;
        c1.wkgbmnqykc wkgbmnqykcVar4;
        if (eablkybsjgVar.iyctptxqzt()) {
            return;
        }
        f26623ppxfxbqfkf++;
        if (!(eablkybsjgVar instanceof c1.gxszxtbevo) && eablkybsjgVar.oipsdeybqn()) {
            int i14 = i13 + 1;
            if (iobyxmoadg(i14, eablkybsjgVar)) {
                c1.gxszxtbevo.d0(i14, eablkybsjgVar, interfaceC0476zoijcleaow, new zoijcleaow.iobyxmoadg(), zoijcleaow.iobyxmoadg.f26669gtknphoqwx);
            }
        }
        c1.wkgbmnqykc wkgbmnqykcVarVdvldrhtss = eablkybsjgVar.vdvldrhtss(c1.wkgbmnqykc.iobyxmoadg.TOP);
        c1.wkgbmnqykc wkgbmnqykcVarVdvldrhtss2 = eablkybsjgVar.vdvldrhtss(c1.wkgbmnqykc.iobyxmoadg.BOTTOM);
        int iEablkybsjg = wkgbmnqykcVarVdvldrhtss.eablkybsjg();
        int iEablkybsjg2 = wkgbmnqykcVarVdvldrhtss2.eablkybsjg();
        if (wkgbmnqykcVarVdvldrhtss.wkgbmnqykc() != null && wkgbmnqykcVarVdvldrhtss.agtfadlqog()) {
            for (c1.wkgbmnqykc wkgbmnqykcVar5 : wkgbmnqykcVarVdvldrhtss.wkgbmnqykc()) {
                c1.eablkybsjg eablkybsjgVar2 = wkgbmnqykcVar5.f18445wkgbmnqykc;
                int i15 = i13 + 1;
                boolean zIobyxmoadg = iobyxmoadg(i15, eablkybsjgVar2);
                if (eablkybsjgVar2.oipsdeybqn() && zIobyxmoadg) {
                    c1.gxszxtbevo.d0(i15, eablkybsjgVar2, interfaceC0476zoijcleaow, new zoijcleaow.iobyxmoadg(), zoijcleaow.iobyxmoadg.f26669gtknphoqwx);
                }
                boolean z13 = (wkgbmnqykcVar5 == eablkybsjgVar2.f18275kegysxyocb && (wkgbmnqykcVar4 = eablkybsjgVar2.f18281mbcevpiqjq.f18440gxszxtbevo) != null && wkgbmnqykcVar4.agtfadlqog()) || (wkgbmnqykcVar5 == eablkybsjgVar2.f18281mbcevpiqjq && (wkgbmnqykcVar3 = eablkybsjgVar2.f18275kegysxyocb.f18440gxszxtbevo) != null && wkgbmnqykcVar3.agtfadlqog());
                c1.eablkybsjg.zoijcleaow zoijcleaowVarUlzqkzuiru = eablkybsjgVar2.ulzqkzuiru();
                c1.eablkybsjg.zoijcleaow zoijcleaowVar = c1.eablkybsjg.zoijcleaow.MATCH_CONSTRAINT;
                if (zoijcleaowVarUlzqkzuiru != zoijcleaowVar || zIobyxmoadg) {
                    if (!eablkybsjgVar2.oipsdeybqn()) {
                        c1.wkgbmnqykc wkgbmnqykcVar6 = eablkybsjgVar2.f18275kegysxyocb;
                        if (wkgbmnqykcVar5 == wkgbmnqykcVar6 && eablkybsjgVar2.f18281mbcevpiqjq.f18440gxszxtbevo == null) {
                            int iGxszxtbevo = wkgbmnqykcVar6.gxszxtbevo() + iEablkybsjg;
                            eablkybsjgVar2.ixidwrxhsl(iGxszxtbevo, eablkybsjgVar2.lereixgezr() + iGxszxtbevo);
                            dxjokdxxww(i15, eablkybsjgVar2, interfaceC0476zoijcleaow);
                        } else {
                            c1.wkgbmnqykc wkgbmnqykcVar7 = eablkybsjgVar2.f18281mbcevpiqjq;
                            if (wkgbmnqykcVar5 == wkgbmnqykcVar7 && wkgbmnqykcVar6.f18440gxszxtbevo == null) {
                                int iGxszxtbevo2 = iEablkybsjg - wkgbmnqykcVar7.gxszxtbevo();
                                eablkybsjgVar2.ixidwrxhsl(iGxszxtbevo2 - eablkybsjgVar2.lereixgezr(), iGxszxtbevo2);
                                dxjokdxxww(i15, eablkybsjgVar2, interfaceC0476zoijcleaow);
                            } else if (z13 && !eablkybsjgVar2.sflfametgt()) {
                                gxszxtbevo(i15, interfaceC0476zoijcleaow, eablkybsjgVar2);
                            }
                        }
                    }
                } else if (eablkybsjgVar2.ulzqkzuiru() == zoijcleaowVar && eablkybsjgVar2.f18236cdpycssgdh >= 0 && eablkybsjgVar2.f18263istkbnxepw >= 0 && (eablkybsjgVar2.crxdokpmqz() == 8 || (eablkybsjgVar2.f18238cqumvgiudr == 0 && eablkybsjgVar2.cqumvgiudr() == 0.0f))) {
                    if (!eablkybsjgVar2.sflfametgt() && !eablkybsjgVar2.zfvoamnweg() && z13 && !eablkybsjgVar2.sflfametgt()) {
                        lqeggnwhkg(i15, eablkybsjgVar, interfaceC0476zoijcleaow, eablkybsjgVar2);
                    }
                }
            }
        }
        if (eablkybsjgVar instanceof c1.nufgyqmvbu) {
            return;
        }
        if (wkgbmnqykcVarVdvldrhtss2.wkgbmnqykc() != null && wkgbmnqykcVarVdvldrhtss2.agtfadlqog()) {
            for (c1.wkgbmnqykc wkgbmnqykcVar8 : wkgbmnqykcVarVdvldrhtss2.wkgbmnqykc()) {
                c1.eablkybsjg eablkybsjgVar3 = wkgbmnqykcVar8.f18445wkgbmnqykc;
                int i16 = i13 + 1;
                boolean zIobyxmoadg2 = iobyxmoadg(i16, eablkybsjgVar3);
                if (eablkybsjgVar3.oipsdeybqn() && zIobyxmoadg2) {
                    c1.gxszxtbevo.d0(i16, eablkybsjgVar3, interfaceC0476zoijcleaow, new zoijcleaow.iobyxmoadg(), zoijcleaow.iobyxmoadg.f26669gtknphoqwx);
                }
                boolean z14 = (wkgbmnqykcVar8 == eablkybsjgVar3.f18275kegysxyocb && (wkgbmnqykcVar2 = eablkybsjgVar3.f18281mbcevpiqjq.f18440gxszxtbevo) != null && wkgbmnqykcVar2.agtfadlqog()) || (wkgbmnqykcVar8 == eablkybsjgVar3.f18281mbcevpiqjq && (wkgbmnqykcVar = eablkybsjgVar3.f18275kegysxyocb.f18440gxszxtbevo) != null && wkgbmnqykcVar.agtfadlqog());
                c1.eablkybsjg.zoijcleaow zoijcleaowVarUlzqkzuiru2 = eablkybsjgVar3.ulzqkzuiru();
                c1.eablkybsjg.zoijcleaow zoijcleaowVar2 = c1.eablkybsjg.zoijcleaow.MATCH_CONSTRAINT;
                if (zoijcleaowVarUlzqkzuiru2 != zoijcleaowVar2 || zIobyxmoadg2) {
                    if (!eablkybsjgVar3.oipsdeybqn()) {
                        c1.wkgbmnqykc wkgbmnqykcVar9 = eablkybsjgVar3.f18275kegysxyocb;
                        if (wkgbmnqykcVar8 == wkgbmnqykcVar9 && eablkybsjgVar3.f18281mbcevpiqjq.f18440gxszxtbevo == null) {
                            int iGxszxtbevo3 = wkgbmnqykcVar9.gxszxtbevo() + iEablkybsjg2;
                            eablkybsjgVar3.ixidwrxhsl(iGxszxtbevo3, eablkybsjgVar3.lereixgezr() + iGxszxtbevo3);
                            dxjokdxxww(i16, eablkybsjgVar3, interfaceC0476zoijcleaow);
                        } else {
                            c1.wkgbmnqykc wkgbmnqykcVar10 = eablkybsjgVar3.f18281mbcevpiqjq;
                            if (wkgbmnqykcVar8 == wkgbmnqykcVar10 && wkgbmnqykcVar9.f18440gxszxtbevo == null) {
                                int iGxszxtbevo4 = iEablkybsjg2 - wkgbmnqykcVar10.gxszxtbevo();
                                eablkybsjgVar3.ixidwrxhsl(iGxszxtbevo4 - eablkybsjgVar3.lereixgezr(), iGxszxtbevo4);
                                dxjokdxxww(i16, eablkybsjgVar3, interfaceC0476zoijcleaow);
                            } else if (z14 && !eablkybsjgVar3.sflfametgt()) {
                                gxszxtbevo(i16, interfaceC0476zoijcleaow, eablkybsjgVar3);
                            }
                        }
                    }
                } else if (eablkybsjgVar3.ulzqkzuiru() == zoijcleaowVar2 && eablkybsjgVar3.f18236cdpycssgdh >= 0 && eablkybsjgVar3.f18263istkbnxepw >= 0 && (eablkybsjgVar3.crxdokpmqz() == 8 || (eablkybsjgVar3.f18238cqumvgiudr == 0 && eablkybsjgVar3.cqumvgiudr() == 0.0f))) {
                    if (!eablkybsjgVar3.sflfametgt() && !eablkybsjgVar3.zfvoamnweg() && z14 && !eablkybsjgVar3.sflfametgt()) {
                        lqeggnwhkg(i16, eablkybsjgVar, interfaceC0476zoijcleaow, eablkybsjgVar3);
                    }
                }
            }
        }
        c1.wkgbmnqykc wkgbmnqykcVarVdvldrhtss3 = eablkybsjgVar.vdvldrhtss(c1.wkgbmnqykc.iobyxmoadg.BASELINE);
        if (wkgbmnqykcVarVdvldrhtss3.wkgbmnqykc() != null && wkgbmnqykcVarVdvldrhtss3.agtfadlqog()) {
            int iEablkybsjg3 = wkgbmnqykcVarVdvldrhtss3.eablkybsjg();
            for (c1.wkgbmnqykc wkgbmnqykcVar11 : wkgbmnqykcVarVdvldrhtss3.wkgbmnqykc()) {
                c1.eablkybsjg eablkybsjgVar4 = wkgbmnqykcVar11.f18445wkgbmnqykc;
                int i17 = i13 + 1;
                boolean zIobyxmoadg3 = iobyxmoadg(i17, eablkybsjgVar4);
                if (eablkybsjgVar4.oipsdeybqn() && zIobyxmoadg3) {
                    c1.gxszxtbevo.d0(i17, eablkybsjgVar4, interfaceC0476zoijcleaow, new zoijcleaow.iobyxmoadg(), zoijcleaow.iobyxmoadg.f26669gtknphoqwx);
                }
                if (eablkybsjgVar4.ulzqkzuiru() != c1.eablkybsjg.zoijcleaow.MATCH_CONSTRAINT || zIobyxmoadg3) {
                    if (!eablkybsjgVar4.oipsdeybqn() && wkgbmnqykcVar11 == eablkybsjgVar4.f18284ntlheqmsrt) {
                        eablkybsjgVar4.fyldjkxazc(wkgbmnqykcVar11.gxszxtbevo() + iEablkybsjg3);
                        dxjokdxxww(i17, eablkybsjgVar4, interfaceC0476zoijcleaow);
                    }
                }
            }
        }
        eablkybsjgVar.lrnfpwlwnk();
    }

    private static void eablkybsjg(int i13, c1.eablkybsjg eablkybsjgVar, zoijcleaow.InterfaceC0476zoijcleaow interfaceC0476zoijcleaow, c1.eablkybsjg eablkybsjgVar2, boolean z13) {
        float fPmvmpeiblj = eablkybsjgVar2.pmvmpeiblj();
        int iEablkybsjg = eablkybsjgVar2.f18303stevsuqkhv.f18440gxszxtbevo.eablkybsjg() + eablkybsjgVar2.f18303stevsuqkhv.gxszxtbevo();
        int iEablkybsjg2 = eablkybsjgVar2.f18305tzroggbefp.f18440gxszxtbevo.eablkybsjg() - eablkybsjgVar2.f18305tzroggbefp.gxszxtbevo();
        if (iEablkybsjg2 >= iEablkybsjg) {
            int iJlmebxxoox = eablkybsjgVar2.jlmebxxoox();
            if (eablkybsjgVar2.crxdokpmqz() != 8) {
                int i14 = eablkybsjgVar2.f18264iwizpuwonk;
                if (i14 == 2) {
                    iJlmebxxoox = (int) (eablkybsjgVar2.pmvmpeiblj() * 0.5f * (eablkybsjgVar instanceof c1.gxszxtbevo ? eablkybsjgVar.jlmebxxoox() : eablkybsjgVar.hkdspvbjdz().jlmebxxoox()));
                } else if (i14 == 0) {
                    iJlmebxxoox = iEablkybsjg2 - iEablkybsjg;
                }
                iJlmebxxoox = Math.max(eablkybsjgVar2.f18276lereixgezr, iJlmebxxoox);
                int i15 = eablkybsjgVar2.f18293pmvmpeiblj;
                if (i15 > 0) {
                    iJlmebxxoox = Math.min(i15, iJlmebxxoox);
                }
            }
            int i16 = iEablkybsjg + ((int) ((fPmvmpeiblj * ((iEablkybsjg2 - iEablkybsjg) - iJlmebxxoox)) + 0.5f));
            eablkybsjgVar2.ipoelvxyzq(i16, iJlmebxxoox + i16);
            zoijcleaow(i13 + 1, eablkybsjgVar2, interfaceC0476zoijcleaow, z13);
        }
    }

    private static void gxszxtbevo(int i13, zoijcleaow.InterfaceC0476zoijcleaow interfaceC0476zoijcleaow, c1.eablkybsjg eablkybsjgVar) {
        float fMbcevpiqjq = eablkybsjgVar.mbcevpiqjq();
        int iEablkybsjg = eablkybsjgVar.f18275kegysxyocb.f18440gxszxtbevo.eablkybsjg();
        int iEablkybsjg2 = eablkybsjgVar.f18281mbcevpiqjq.f18440gxszxtbevo.eablkybsjg();
        int iGxszxtbevo = eablkybsjgVar.f18275kegysxyocb.gxszxtbevo() + iEablkybsjg;
        int iGxszxtbevo2 = iEablkybsjg2 - eablkybsjgVar.f18281mbcevpiqjq.gxszxtbevo();
        if (iEablkybsjg == iEablkybsjg2) {
            fMbcevpiqjq = 0.5f;
        } else {
            iEablkybsjg = iGxszxtbevo;
            iEablkybsjg2 = iGxszxtbevo2;
        }
        int iLereixgezr = eablkybsjgVar.lereixgezr();
        int i14 = (iEablkybsjg2 - iEablkybsjg) - iLereixgezr;
        if (iEablkybsjg > iEablkybsjg2) {
            i14 = (iEablkybsjg - iEablkybsjg2) - iLereixgezr;
        }
        int i15 = (int) (i14 > 0 ? (fMbcevpiqjq * i14) + 0.5f : fMbcevpiqjq * i14);
        int i16 = iEablkybsjg + i15;
        int i17 = i16 + iLereixgezr;
        if (iEablkybsjg > iEablkybsjg2) {
            i16 = iEablkybsjg - i15;
            i17 = i16 - iLereixgezr;
        }
        eablkybsjgVar.ixidwrxhsl(i16, i17);
        dxjokdxxww(i13 + 1, eablkybsjgVar, interfaceC0476zoijcleaow);
    }

    private static boolean iobyxmoadg(int i13, c1.eablkybsjg eablkybsjgVar) {
        c1.eablkybsjg.zoijcleaow zoijcleaowVar;
        c1.eablkybsjg.zoijcleaow zoijcleaowVar2;
        c1.eablkybsjg.zoijcleaow zoijcleaowVarIstkbnxepw = eablkybsjgVar.istkbnxepw();
        c1.eablkybsjg.zoijcleaow zoijcleaowVarUlzqkzuiru = eablkybsjgVar.ulzqkzuiru();
        c1.gxszxtbevo gxszxtbevoVar = eablkybsjgVar.hkdspvbjdz() != null ? (c1.gxszxtbevo) eablkybsjgVar.hkdspvbjdz() : null;
        if (gxszxtbevoVar != null) {
            gxszxtbevoVar.istkbnxepw();
            c1.eablkybsjg.zoijcleaow zoijcleaowVar3 = c1.eablkybsjg.zoijcleaow.FIXED;
        }
        if (gxszxtbevoVar != null) {
            gxszxtbevoVar.ulzqkzuiru();
            c1.eablkybsjg.zoijcleaow zoijcleaowVar4 = c1.eablkybsjg.zoijcleaow.FIXED;
        }
        c1.eablkybsjg.zoijcleaow zoijcleaowVar5 = c1.eablkybsjg.zoijcleaow.FIXED;
        boolean z13 = zoijcleaowVarIstkbnxepw == zoijcleaowVar5 || eablkybsjgVar.bfopjjpdmp() || zoijcleaowVarIstkbnxepw == c1.eablkybsjg.zoijcleaow.WRAP_CONTENT || (zoijcleaowVarIstkbnxepw == (zoijcleaowVar2 = c1.eablkybsjg.zoijcleaow.MATCH_CONSTRAINT) && eablkybsjgVar.f18264iwizpuwonk == 0 && eablkybsjgVar.f18317xrmfcynszj == 0.0f && eablkybsjgVar.ikoacuggdj(0)) || (zoijcleaowVarIstkbnxepw == zoijcleaowVar2 && eablkybsjgVar.f18264iwizpuwonk == 1 && eablkybsjgVar.xrmfcynszj(0, eablkybsjgVar.jlmebxxoox()));
        boolean z14 = zoijcleaowVarUlzqkzuiru == zoijcleaowVar5 || eablkybsjgVar.opjhrmiecq() || zoijcleaowVarUlzqkzuiru == c1.eablkybsjg.zoijcleaow.WRAP_CONTENT || (zoijcleaowVarUlzqkzuiru == (zoijcleaowVar = c1.eablkybsjg.zoijcleaow.MATCH_CONSTRAINT) && eablkybsjgVar.f18238cqumvgiudr == 0 && eablkybsjgVar.f18317xrmfcynszj == 0.0f && eablkybsjgVar.ikoacuggdj(1)) || (zoijcleaowVarUlzqkzuiru == zoijcleaowVar && eablkybsjgVar.f18238cqumvgiudr == 1 && eablkybsjgVar.xrmfcynszj(1, eablkybsjgVar.lereixgezr()));
        if (eablkybsjgVar.f18317xrmfcynszj <= 0.0f || !(z13 || z14)) {
            return z13 && z14;
        }
        return true;
    }

    private static void lqeggnwhkg(int i13, c1.eablkybsjg eablkybsjgVar, zoijcleaow.InterfaceC0476zoijcleaow interfaceC0476zoijcleaow, c1.eablkybsjg eablkybsjgVar2) {
        float fMbcevpiqjq = eablkybsjgVar2.mbcevpiqjq();
        int iEablkybsjg = eablkybsjgVar2.f18275kegysxyocb.f18440gxszxtbevo.eablkybsjg() + eablkybsjgVar2.f18275kegysxyocb.gxszxtbevo();
        int iEablkybsjg2 = eablkybsjgVar2.f18281mbcevpiqjq.f18440gxszxtbevo.eablkybsjg() - eablkybsjgVar2.f18281mbcevpiqjq.gxszxtbevo();
        if (iEablkybsjg2 >= iEablkybsjg) {
            int iLereixgezr = eablkybsjgVar2.lereixgezr();
            if (eablkybsjgVar2.crxdokpmqz() != 8) {
                int i14 = eablkybsjgVar2.f18238cqumvgiudr;
                if (i14 == 2) {
                    iLereixgezr = (int) (fMbcevpiqjq * 0.5f * (eablkybsjgVar instanceof c1.gxszxtbevo ? eablkybsjgVar.lereixgezr() : eablkybsjgVar.hkdspvbjdz().lereixgezr()));
                } else if (i14 == 0) {
                    iLereixgezr = iEablkybsjg2 - iEablkybsjg;
                }
                iLereixgezr = Math.max(eablkybsjgVar2.f18263istkbnxepw, iLereixgezr);
                int i15 = eablkybsjgVar2.f18236cdpycssgdh;
                if (i15 > 0) {
                    iLereixgezr = Math.min(i15, iLereixgezr);
                }
            }
            int i16 = iEablkybsjg + ((int) ((fMbcevpiqjq * ((iEablkybsjg2 - iEablkybsjg) - iLereixgezr)) + 0.5f));
            eablkybsjgVar2.ixidwrxhsl(i16, iLereixgezr + i16);
            dxjokdxxww(i13 + 1, eablkybsjgVar2, interfaceC0476zoijcleaow);
        }
    }

    public static void nufgyqmvbu(c1.gxszxtbevo gxszxtbevoVar, zoijcleaow.InterfaceC0476zoijcleaow interfaceC0476zoijcleaow) {
        c1.eablkybsjg.zoijcleaow zoijcleaowVarIstkbnxepw = gxszxtbevoVar.istkbnxepw();
        c1.eablkybsjg.zoijcleaow zoijcleaowVarUlzqkzuiru = gxszxtbevoVar.ulzqkzuiru();
        f26624zoijcleaow = 0;
        f26623ppxfxbqfkf = 0;
        gxszxtbevoVar.uawqvzlxes();
        ArrayList arrayListB = gxszxtbevoVar.B();
        int size = arrayListB.size();
        for (int i13 = 0; i13 < size; i13++) {
            ((c1.eablkybsjg) arrayListB.get(i13)).uawqvzlxes();
        }
        boolean zA0 = gxszxtbevoVar.a0();
        if (zoijcleaowVarIstkbnxepw == c1.eablkybsjg.zoijcleaow.FIXED) {
            gxszxtbevoVar.ipoelvxyzq(0, gxszxtbevoVar.jlmebxxoox());
        } else {
            gxszxtbevoVar.grlcpdaxtj(0);
        }
        boolean z13 = false;
        boolean z14 = false;
        for (int i14 = 0; i14 < size; i14++) {
            c1.eablkybsjg eablkybsjgVar = (c1.eablkybsjg) arrayListB.get(i14);
            if (eablkybsjgVar instanceof c1.nufgyqmvbu) {
                c1.nufgyqmvbu nufgyqmvbuVar = (c1.nufgyqmvbu) eablkybsjgVar;
                if (nufgyqmvbuVar.C() == 1) {
                    if (nufgyqmvbuVar.D() != -1) {
                        nufgyqmvbuVar.G(nufgyqmvbuVar.D());
                    } else if (nufgyqmvbuVar.E() != -1 && gxszxtbevoVar.bfopjjpdmp()) {
                        nufgyqmvbuVar.G(gxszxtbevoVar.jlmebxxoox() - nufgyqmvbuVar.E());
                    } else if (gxszxtbevoVar.bfopjjpdmp()) {
                        nufgyqmvbuVar.G((int) ((nufgyqmvbuVar.F() * gxszxtbevoVar.jlmebxxoox()) + 0.5f));
                    }
                    z13 = true;
                }
            } else if ((eablkybsjgVar instanceof c1.iobyxmoadg) && ((c1.iobyxmoadg) eablkybsjgVar).H() == 0) {
                z14 = true;
            }
        }
        if (z13) {
            for (int i15 = 0; i15 < size; i15++) {
                c1.eablkybsjg eablkybsjgVar2 = (c1.eablkybsjg) arrayListB.get(i15);
                if (eablkybsjgVar2 instanceof c1.nufgyqmvbu) {
                    c1.nufgyqmvbu nufgyqmvbuVar2 = (c1.nufgyqmvbu) eablkybsjgVar2;
                    if (nufgyqmvbuVar2.C() == 1) {
                        zoijcleaow(0, nufgyqmvbuVar2, interfaceC0476zoijcleaow, zA0);
                    }
                }
            }
        }
        zoijcleaow(0, gxszxtbevoVar, interfaceC0476zoijcleaow, zA0);
        if (z14) {
            for (int i16 = 0; i16 < size; i16++) {
                c1.eablkybsjg eablkybsjgVar3 = (c1.eablkybsjg) arrayListB.get(i16);
                if (eablkybsjgVar3 instanceof c1.iobyxmoadg) {
                    c1.iobyxmoadg iobyxmoadgVar = (c1.iobyxmoadg) eablkybsjgVar3;
                    if (iobyxmoadgVar.H() == 0) {
                        ppxfxbqfkf(0, iobyxmoadgVar, interfaceC0476zoijcleaow, 0, zA0);
                    }
                }
            }
        }
        if (zoijcleaowVarUlzqkzuiru == c1.eablkybsjg.zoijcleaow.FIXED) {
            gxszxtbevoVar.ixidwrxhsl(0, gxszxtbevoVar.lereixgezr());
        } else {
            gxszxtbevoVar.mhtqkkgtqm(0);
        }
        boolean z15 = false;
        boolean z16 = false;
        for (int i17 = 0; i17 < size; i17++) {
            c1.eablkybsjg eablkybsjgVar4 = (c1.eablkybsjg) arrayListB.get(i17);
            if (eablkybsjgVar4 instanceof c1.nufgyqmvbu) {
                c1.nufgyqmvbu nufgyqmvbuVar3 = (c1.nufgyqmvbu) eablkybsjgVar4;
                if (nufgyqmvbuVar3.C() == 0) {
                    if (nufgyqmvbuVar3.D() != -1) {
                        nufgyqmvbuVar3.G(nufgyqmvbuVar3.D());
                    } else if (nufgyqmvbuVar3.E() != -1 && gxszxtbevoVar.opjhrmiecq()) {
                        nufgyqmvbuVar3.G(gxszxtbevoVar.lereixgezr() - nufgyqmvbuVar3.E());
                    } else if (gxszxtbevoVar.opjhrmiecq()) {
                        nufgyqmvbuVar3.G((int) ((nufgyqmvbuVar3.F() * gxszxtbevoVar.lereixgezr()) + 0.5f));
                    }
                    z15 = true;
                }
            } else if ((eablkybsjgVar4 instanceof c1.iobyxmoadg) && ((c1.iobyxmoadg) eablkybsjgVar4).H() == 1) {
                z16 = true;
            }
        }
        if (z15) {
            for (int i18 = 0; i18 < size; i18++) {
                c1.eablkybsjg eablkybsjgVar5 = (c1.eablkybsjg) arrayListB.get(i18);
                if (eablkybsjgVar5 instanceof c1.nufgyqmvbu) {
                    c1.nufgyqmvbu nufgyqmvbuVar4 = (c1.nufgyqmvbu) eablkybsjgVar5;
                    if (nufgyqmvbuVar4.C() == 0) {
                        dxjokdxxww(1, nufgyqmvbuVar4, interfaceC0476zoijcleaow);
                    }
                }
            }
        }
        dxjokdxxww(0, gxszxtbevoVar, interfaceC0476zoijcleaow);
        if (z16) {
            for (int i19 = 0; i19 < size; i19++) {
                c1.eablkybsjg eablkybsjgVar6 = (c1.eablkybsjg) arrayListB.get(i19);
                if (eablkybsjgVar6 instanceof c1.iobyxmoadg) {
                    c1.iobyxmoadg iobyxmoadgVar2 = (c1.iobyxmoadg) eablkybsjgVar6;
                    if (iobyxmoadgVar2.H() == 1) {
                        ppxfxbqfkf(0, iobyxmoadgVar2, interfaceC0476zoijcleaow, 1, zA0);
                    }
                }
            }
        }
        for (int i23 = 0; i23 < size; i23++) {
            c1.eablkybsjg eablkybsjgVar7 = (c1.eablkybsjg) arrayListB.get(i23);
            if (eablkybsjgVar7.oipsdeybqn() && iobyxmoadg(0, eablkybsjgVar7)) {
                c1.gxszxtbevo.d0(0, eablkybsjgVar7, interfaceC0476zoijcleaow, f26622iobyxmoadg, zoijcleaow.iobyxmoadg.f26669gtknphoqwx);
                if (!(eablkybsjgVar7 instanceof c1.nufgyqmvbu)) {
                    zoijcleaow(0, eablkybsjgVar7, interfaceC0476zoijcleaow, zA0);
                    dxjokdxxww(0, eablkybsjgVar7, interfaceC0476zoijcleaow);
                } else if (((c1.nufgyqmvbu) eablkybsjgVar7).C() == 0) {
                    dxjokdxxww(0, eablkybsjgVar7, interfaceC0476zoijcleaow);
                } else {
                    zoijcleaow(0, eablkybsjgVar7, interfaceC0476zoijcleaow, zA0);
                }
            }
        }
    }

    private static void ppxfxbqfkf(int i13, c1.iobyxmoadg iobyxmoadgVar, zoijcleaow.InterfaceC0476zoijcleaow interfaceC0476zoijcleaow, int i14, boolean z13) {
        if (iobyxmoadgVar.D()) {
            if (i14 == 0) {
                zoijcleaow(i13 + 1, iobyxmoadgVar, interfaceC0476zoijcleaow, z13);
            } else {
                dxjokdxxww(i13 + 1, iobyxmoadgVar, interfaceC0476zoijcleaow);
            }
        }
    }

    private static void wkgbmnqykc(int i13, zoijcleaow.InterfaceC0476zoijcleaow interfaceC0476zoijcleaow, c1.eablkybsjg eablkybsjgVar, boolean z13) {
        float fPmvmpeiblj = eablkybsjgVar.pmvmpeiblj();
        int iEablkybsjg = eablkybsjgVar.f18303stevsuqkhv.f18440gxszxtbevo.eablkybsjg();
        int iEablkybsjg2 = eablkybsjgVar.f18305tzroggbefp.f18440gxszxtbevo.eablkybsjg();
        int iGxszxtbevo = eablkybsjgVar.f18303stevsuqkhv.gxszxtbevo() + iEablkybsjg;
        int iGxszxtbevo2 = iEablkybsjg2 - eablkybsjgVar.f18305tzroggbefp.gxszxtbevo();
        if (iEablkybsjg == iEablkybsjg2) {
            fPmvmpeiblj = 0.5f;
        } else {
            iEablkybsjg = iGxszxtbevo;
            iEablkybsjg2 = iGxszxtbevo2;
        }
        int iJlmebxxoox = eablkybsjgVar.jlmebxxoox();
        int i14 = (iEablkybsjg2 - iEablkybsjg) - iJlmebxxoox;
        if (iEablkybsjg > iEablkybsjg2) {
            i14 = (iEablkybsjg - iEablkybsjg2) - iJlmebxxoox;
        }
        int i15 = ((int) (i14 > 0 ? (fPmvmpeiblj * i14) + 0.5f : fPmvmpeiblj * i14)) + iEablkybsjg;
        int i16 = i15 + iJlmebxxoox;
        if (iEablkybsjg > iEablkybsjg2) {
            i16 = i15 - iJlmebxxoox;
        }
        eablkybsjgVar.ipoelvxyzq(i15, i16);
        zoijcleaow(i13 + 1, eablkybsjgVar, interfaceC0476zoijcleaow, z13);
    }

    private static void zoijcleaow(int i13, c1.eablkybsjg eablkybsjgVar, zoijcleaow.InterfaceC0476zoijcleaow interfaceC0476zoijcleaow, boolean z13) {
        c1.wkgbmnqykc wkgbmnqykcVar;
        c1.wkgbmnqykc wkgbmnqykcVar2;
        c1.wkgbmnqykc wkgbmnqykcVar3;
        c1.wkgbmnqykc wkgbmnqykcVar4;
        if (eablkybsjgVar.czzsidtyhn()) {
            return;
        }
        boolean z14 = true;
        f26624zoijcleaow++;
        if (!(eablkybsjgVar instanceof c1.gxszxtbevo) && eablkybsjgVar.oipsdeybqn()) {
            int i14 = i13 + 1;
            if (iobyxmoadg(i14, eablkybsjgVar)) {
                c1.gxszxtbevo.d0(i14, eablkybsjgVar, interfaceC0476zoijcleaow, new zoijcleaow.iobyxmoadg(), zoijcleaow.iobyxmoadg.f26669gtknphoqwx);
            }
        }
        c1.wkgbmnqykc wkgbmnqykcVarVdvldrhtss = eablkybsjgVar.vdvldrhtss(c1.wkgbmnqykc.iobyxmoadg.LEFT);
        c1.wkgbmnqykc wkgbmnqykcVarVdvldrhtss2 = eablkybsjgVar.vdvldrhtss(c1.wkgbmnqykc.iobyxmoadg.RIGHT);
        int iEablkybsjg = wkgbmnqykcVarVdvldrhtss.eablkybsjg();
        int iEablkybsjg2 = wkgbmnqykcVarVdvldrhtss2.eablkybsjg();
        if (wkgbmnqykcVarVdvldrhtss.wkgbmnqykc() != null && wkgbmnqykcVarVdvldrhtss.agtfadlqog()) {
            for (c1.wkgbmnqykc wkgbmnqykcVar5 : wkgbmnqykcVarVdvldrhtss.wkgbmnqykc()) {
                c1.eablkybsjg eablkybsjgVar2 = wkgbmnqykcVar5.f18445wkgbmnqykc;
                int i15 = i13 + 1;
                boolean zIobyxmoadg = iobyxmoadg(i15, eablkybsjgVar2);
                if (eablkybsjgVar2.oipsdeybqn() && zIobyxmoadg) {
                    c1.gxszxtbevo.d0(i15, eablkybsjgVar2, interfaceC0476zoijcleaow, new zoijcleaow.iobyxmoadg(), zoijcleaow.iobyxmoadg.f26669gtknphoqwx);
                }
                boolean z15 = ((wkgbmnqykcVar5 == eablkybsjgVar2.f18303stevsuqkhv && (wkgbmnqykcVar4 = eablkybsjgVar2.f18305tzroggbefp.f18440gxszxtbevo) != null && wkgbmnqykcVar4.agtfadlqog()) || (wkgbmnqykcVar5 == eablkybsjgVar2.f18305tzroggbefp && (wkgbmnqykcVar3 = eablkybsjgVar2.f18303stevsuqkhv.f18440gxszxtbevo) != null && wkgbmnqykcVar3.agtfadlqog())) ? z14 : false;
                c1.eablkybsjg.zoijcleaow zoijcleaowVarIstkbnxepw = eablkybsjgVar2.istkbnxepw();
                c1.eablkybsjg.zoijcleaow zoijcleaowVar = c1.eablkybsjg.zoijcleaow.MATCH_CONSTRAINT;
                if (zoijcleaowVarIstkbnxepw != zoijcleaowVar || zIobyxmoadg) {
                    if (!eablkybsjgVar2.oipsdeybqn()) {
                        c1.wkgbmnqykc wkgbmnqykcVar6 = eablkybsjgVar2.f18303stevsuqkhv;
                        if (wkgbmnqykcVar5 == wkgbmnqykcVar6 && eablkybsjgVar2.f18305tzroggbefp.f18440gxszxtbevo == null) {
                            int iGxszxtbevo = wkgbmnqykcVar6.gxszxtbevo() + iEablkybsjg;
                            eablkybsjgVar2.ipoelvxyzq(iGxszxtbevo, eablkybsjgVar2.jlmebxxoox() + iGxszxtbevo);
                            zoijcleaow(i15, eablkybsjgVar2, interfaceC0476zoijcleaow, z13);
                        } else {
                            c1.wkgbmnqykc wkgbmnqykcVar7 = eablkybsjgVar2.f18305tzroggbefp;
                            if (wkgbmnqykcVar5 == wkgbmnqykcVar7 && wkgbmnqykcVar6.f18440gxszxtbevo == null) {
                                int iGxszxtbevo2 = iEablkybsjg - wkgbmnqykcVar7.gxszxtbevo();
                                eablkybsjgVar2.ipoelvxyzq(iGxszxtbevo2 - eablkybsjgVar2.jlmebxxoox(), iGxszxtbevo2);
                                zoijcleaow(i15, eablkybsjgVar2, interfaceC0476zoijcleaow, z13);
                            } else if (z15 && !eablkybsjgVar2.yfnezrywwk()) {
                                wkgbmnqykc(i15, interfaceC0476zoijcleaow, eablkybsjgVar2, z13);
                            }
                        }
                    }
                } else if (eablkybsjgVar2.istkbnxepw() == zoijcleaowVar && eablkybsjgVar2.f18293pmvmpeiblj >= 0 && eablkybsjgVar2.f18276lereixgezr >= 0 && ((eablkybsjgVar2.crxdokpmqz() == 8 || (eablkybsjgVar2.f18264iwizpuwonk == 0 && eablkybsjgVar2.cqumvgiudr() == 0.0f)) && !eablkybsjgVar2.yfnezrywwk() && !eablkybsjgVar2.zfvoamnweg() && z15 && !eablkybsjgVar2.yfnezrywwk())) {
                    eablkybsjg(i15, eablkybsjgVar, interfaceC0476zoijcleaow, eablkybsjgVar2, z13);
                }
                z14 = true;
            }
        }
        if (eablkybsjgVar instanceof c1.nufgyqmvbu) {
            return;
        }
        if (wkgbmnqykcVarVdvldrhtss2.wkgbmnqykc() != null && wkgbmnqykcVarVdvldrhtss2.agtfadlqog()) {
            for (c1.wkgbmnqykc wkgbmnqykcVar8 : wkgbmnqykcVarVdvldrhtss2.wkgbmnqykc()) {
                c1.eablkybsjg eablkybsjgVar3 = wkgbmnqykcVar8.f18445wkgbmnqykc;
                int i16 = i13 + 1;
                boolean zIobyxmoadg2 = iobyxmoadg(i16, eablkybsjgVar3);
                if (eablkybsjgVar3.oipsdeybqn() && zIobyxmoadg2) {
                    c1.gxszxtbevo.d0(i16, eablkybsjgVar3, interfaceC0476zoijcleaow, new zoijcleaow.iobyxmoadg(), zoijcleaow.iobyxmoadg.f26669gtknphoqwx);
                }
                boolean z16 = (wkgbmnqykcVar8 == eablkybsjgVar3.f18303stevsuqkhv && (wkgbmnqykcVar2 = eablkybsjgVar3.f18305tzroggbefp.f18440gxszxtbevo) != null && wkgbmnqykcVar2.agtfadlqog()) || (wkgbmnqykcVar8 == eablkybsjgVar3.f18305tzroggbefp && (wkgbmnqykcVar = eablkybsjgVar3.f18303stevsuqkhv.f18440gxszxtbevo) != null && wkgbmnqykcVar.agtfadlqog());
                c1.eablkybsjg.zoijcleaow zoijcleaowVarIstkbnxepw2 = eablkybsjgVar3.istkbnxepw();
                c1.eablkybsjg.zoijcleaow zoijcleaowVar2 = c1.eablkybsjg.zoijcleaow.MATCH_CONSTRAINT;
                if (zoijcleaowVarIstkbnxepw2 != zoijcleaowVar2 || zIobyxmoadg2) {
                    if (!eablkybsjgVar3.oipsdeybqn()) {
                        c1.wkgbmnqykc wkgbmnqykcVar9 = eablkybsjgVar3.f18303stevsuqkhv;
                        if (wkgbmnqykcVar8 == wkgbmnqykcVar9 && eablkybsjgVar3.f18305tzroggbefp.f18440gxszxtbevo == null) {
                            int iGxszxtbevo3 = wkgbmnqykcVar9.gxszxtbevo() + iEablkybsjg2;
                            eablkybsjgVar3.ipoelvxyzq(iGxszxtbevo3, eablkybsjgVar3.jlmebxxoox() + iGxszxtbevo3);
                            zoijcleaow(i16, eablkybsjgVar3, interfaceC0476zoijcleaow, z13);
                        } else {
                            c1.wkgbmnqykc wkgbmnqykcVar10 = eablkybsjgVar3.f18305tzroggbefp;
                            if (wkgbmnqykcVar8 == wkgbmnqykcVar10 && wkgbmnqykcVar9.f18440gxszxtbevo == null) {
                                int iGxszxtbevo4 = iEablkybsjg2 - wkgbmnqykcVar10.gxszxtbevo();
                                eablkybsjgVar3.ipoelvxyzq(iGxszxtbevo4 - eablkybsjgVar3.jlmebxxoox(), iGxszxtbevo4);
                                zoijcleaow(i16, eablkybsjgVar3, interfaceC0476zoijcleaow, z13);
                            } else if (z16 && !eablkybsjgVar3.yfnezrywwk()) {
                                wkgbmnqykc(i16, interfaceC0476zoijcleaow, eablkybsjgVar3, z13);
                            }
                        }
                    }
                } else if (eablkybsjgVar3.istkbnxepw() == zoijcleaowVar2 && eablkybsjgVar3.f18293pmvmpeiblj >= 0 && eablkybsjgVar3.f18276lereixgezr >= 0 && (eablkybsjgVar3.crxdokpmqz() == 8 || (eablkybsjgVar3.f18264iwizpuwonk == 0 && eablkybsjgVar3.cqumvgiudr() == 0.0f))) {
                    if (!eablkybsjgVar3.yfnezrywwk() && !eablkybsjgVar3.zfvoamnweg() && z16 && !eablkybsjgVar3.yfnezrywwk()) {
                        eablkybsjg(i16, eablkybsjgVar, interfaceC0476zoijcleaow, eablkybsjgVar3, z13);
                    }
                }
            }
        }
        eablkybsjgVar.weqkydbzbr();
    }
}
