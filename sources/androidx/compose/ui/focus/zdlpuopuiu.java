package androidx.compose.ui.focus;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.NoWhenBranchMatchedException;
import z.okpsazkaxt;
import z.pkzmftpjix;
import z.rlfsiqarku;
import z.xrmfcynszj;

/* JADX INFO: loaded from: classes.dex */
public abstract class zdlpuopuiu {

    public /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f6272iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public static final /* synthetic */ int[] f6273zoijcleaow;

        static {
            int[] iArr = new int[w0.zdlpuopuiu.values().length];
            try {
                iArr[w0.zdlpuopuiu.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[w0.zdlpuopuiu.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f6272iobyxmoadg = iArr;
            int[] iArr2 = new int[f.rgvfuqvkyq.values().length];
            try {
                iArr2[f.rgvfuqvkyq.Active.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[f.rgvfuqvkyq.ActiveParent.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[f.rgvfuqvkyq.Captured.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[f.rgvfuqvkyq.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            f6273zoijcleaow = iArr2;
        }
    }

    public static final Boolean eablkybsjg(FocusTargetNode focusTargetNode, int i13, w0.zdlpuopuiu zdlpuopuiuVar, g.lqeggnwhkg lqeggnwhkgVar, tg.draadjrbmk draadjrbmkVar) {
        int iLqeggnwhkg;
        wkgbmnqykc.iobyxmoadg iobyxmoadgVar = wkgbmnqykc.f6266zoijcleaow;
        if (wkgbmnqykc.draadjrbmk(i13, iobyxmoadgVar.eablkybsjg()) || wkgbmnqykc.draadjrbmk(i13, iobyxmoadgVar.gxszxtbevo())) {
            return Boolean.valueOf(iwizpuwonk.gxszxtbevo(focusTargetNode, i13, draadjrbmkVar));
        }
        if (wkgbmnqykc.draadjrbmk(i13, iobyxmoadgVar.wkgbmnqykc()) || wkgbmnqykc.draadjrbmk(i13, iobyxmoadgVar.lqeggnwhkg()) || wkgbmnqykc.draadjrbmk(i13, iobyxmoadgVar.nufgyqmvbu()) || wkgbmnqykc.draadjrbmk(i13, iobyxmoadgVar.iobyxmoadg())) {
            return cqumvgiudr.zdlpuopuiu(focusTargetNode, i13, lqeggnwhkgVar, draadjrbmkVar);
        }
        if (!wkgbmnqykc.draadjrbmk(i13, iobyxmoadgVar.zoijcleaow())) {
            if (wkgbmnqykc.draadjrbmk(i13, iobyxmoadgVar.ppxfxbqfkf())) {
                FocusTargetNode focusTargetNodeZoijcleaow = zoijcleaow(focusTargetNode);
                FocusTargetNode focusTargetNodePpxfxbqfkf = focusTargetNodeZoijcleaow != null ? ppxfxbqfkf(focusTargetNodeZoijcleaow) : null;
                return Boolean.valueOf((focusTargetNodePpxfxbqfkf == null || kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(focusTargetNodePpxfxbqfkf, focusTargetNode)) ? false : ((Boolean) draadjrbmkVar.invoke(focusTargetNodePpxfxbqfkf)).booleanValue());
            }
            throw new IllegalStateException(("Focus search invoked with invalid FocusDirection " + ((Object) wkgbmnqykc.agtfadlqog(i13))).toString());
        }
        int i14 = iobyxmoadg.f6272iobyxmoadg[zdlpuopuiuVar.ordinal()];
        if (i14 == 1) {
            iLqeggnwhkg = iobyxmoadgVar.lqeggnwhkg();
        } else {
            if (i14 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            iLqeggnwhkg = iobyxmoadgVar.wkgbmnqykc();
        }
        FocusTargetNode focusTargetNodeZoijcleaow2 = zoijcleaow(focusTargetNode);
        if (focusTargetNodeZoijcleaow2 != null) {
            return cqumvgiudr.zdlpuopuiu(focusTargetNodeZoijcleaow2, iLqeggnwhkg, lqeggnwhkgVar, draadjrbmkVar);
        }
        return null;
    }

    public static final FocusTargetNode gxszxtbevo(FocusTargetNode focusTargetNode) {
        if (!focusTargetNode.wflxmlrfwp().n0()) {
            return null;
        }
        int iIobyxmoadg = rlfsiqarku.iobyxmoadg(UserVerificationMethods.USER_VERIFY_ALL);
        if (!focusTargetNode.wflxmlrfwp().n0()) {
            w.iobyxmoadg.zoijcleaow("visitChildren called on an unattached node");
        }
        ipoelvxyzq.ppxfxbqfkf ppxfxbqfkfVar = new ipoelvxyzq.ppxfxbqfkf(new androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf[16], 0);
        androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf ppxfxbqfkfVarE0 = focusTargetNode.wflxmlrfwp().e0();
        if (ppxfxbqfkfVarE0 == null) {
            z.gtknphoqwx.ppxfxbqfkf(ppxfxbqfkfVar, focusTargetNode.wflxmlrfwp(), false);
        } else {
            ppxfxbqfkfVar.zoijcleaow(ppxfxbqfkfVarE0);
        }
        while (ppxfxbqfkfVar.draadjrbmk() != 0) {
            androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf ppxfxbqfkfVarDxjokdxxww = (androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf) ppxfxbqfkfVar.oxmwwwfdhm(ppxfxbqfkfVar.draadjrbmk() - 1);
            if ((ppxfxbqfkfVarDxjokdxxww.d0() & iIobyxmoadg) == 0) {
                z.gtknphoqwx.ppxfxbqfkf(ppxfxbqfkfVar, ppxfxbqfkfVarDxjokdxxww, false);
            } else {
                while (ppxfxbqfkfVarDxjokdxxww != null) {
                    if ((ppxfxbqfkfVarDxjokdxxww.i0() & iIobyxmoadg) != 0) {
                        ipoelvxyzq.ppxfxbqfkf ppxfxbqfkfVar2 = null;
                        while (ppxfxbqfkfVarDxjokdxxww != null) {
                            if (ppxfxbqfkfVarDxjokdxxww instanceof FocusTargetNode) {
                                FocusTargetNode focusTargetNode2 = (FocusTargetNode) ppxfxbqfkfVarDxjokdxxww;
                                if (focusTargetNode2.wflxmlrfwp().n0()) {
                                    int i13 = iobyxmoadg.f6273zoijcleaow[focusTargetNode2.jlmebxxoox().ordinal()];
                                    if (i13 == 1 || i13 == 2 || i13 == 3) {
                                        return focusTargetNode2;
                                    }
                                    if (i13 != 4) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                }
                            } else if ((ppxfxbqfkfVarDxjokdxxww.i0() & iIobyxmoadg) != 0 && (ppxfxbqfkfVarDxjokdxxww instanceof z.wflxmlrfwp)) {
                                int i14 = 0;
                                for (androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf ppxfxbqfkfVarI0 = ((z.wflxmlrfwp) ppxfxbqfkfVarDxjokdxxww).I0(); ppxfxbqfkfVarI0 != null; ppxfxbqfkfVarI0 = ppxfxbqfkfVarI0.e0()) {
                                    if ((ppxfxbqfkfVarI0.i0() & iIobyxmoadg) != 0) {
                                        i14++;
                                        if (i14 == 1) {
                                            ppxfxbqfkfVarDxjokdxxww = ppxfxbqfkfVarI0;
                                        } else {
                                            if (ppxfxbqfkfVar2 == null) {
                                                ppxfxbqfkfVar2 = new ipoelvxyzq.ppxfxbqfkf(new androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf[16], 0);
                                            }
                                            if (ppxfxbqfkfVarDxjokdxxww != null) {
                                                ppxfxbqfkfVar2.zoijcleaow(ppxfxbqfkfVarDxjokdxxww);
                                                ppxfxbqfkfVarDxjokdxxww = null;
                                            }
                                            ppxfxbqfkfVar2.zoijcleaow(ppxfxbqfkfVarI0);
                                        }
                                    }
                                }
                                if (i14 == 1) {
                                }
                            }
                            ppxfxbqfkfVarDxjokdxxww = z.gtknphoqwx.dxjokdxxww(ppxfxbqfkfVar2);
                        }
                        break;
                    }
                    ppxfxbqfkfVarDxjokdxxww = ppxfxbqfkfVarDxjokdxxww.e0();
                }
            }
        }
        return null;
    }

    public static final wflxmlrfwp iobyxmoadg(FocusTargetNode focusTargetNode, int i13, w0.zdlpuopuiu zdlpuopuiuVar) {
        wflxmlrfwp end;
        wflxmlrfwp start;
        dxjokdxxww dxjokdxxwwVarM0 = focusTargetNode.M0();
        wkgbmnqykc.iobyxmoadg iobyxmoadgVar = wkgbmnqykc.f6266zoijcleaow;
        if (wkgbmnqykc.draadjrbmk(i13, iobyxmoadgVar.eablkybsjg())) {
            return dxjokdxxwwVarM0.gtknphoqwx();
        }
        if (wkgbmnqykc.draadjrbmk(i13, iobyxmoadgVar.gxszxtbevo())) {
            return dxjokdxxwwVarM0.dxjokdxxww();
        }
        if (wkgbmnqykc.draadjrbmk(i13, iobyxmoadgVar.nufgyqmvbu())) {
            return dxjokdxxwwVarM0.wkgbmnqykc();
        }
        if (wkgbmnqykc.draadjrbmk(i13, iobyxmoadgVar.iobyxmoadg())) {
            return dxjokdxxwwVarM0.eablkybsjg();
        }
        if (wkgbmnqykc.draadjrbmk(i13, iobyxmoadgVar.wkgbmnqykc())) {
            int i14 = iobyxmoadg.f6272iobyxmoadg[zdlpuopuiuVar.ordinal()];
            if (i14 == 1) {
                start = dxjokdxxwwVarM0.getStart();
            } else {
                if (i14 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                start = dxjokdxxwwVarM0.getEnd();
            }
            if (start == wflxmlrfwp.f6255zoijcleaow.zoijcleaow()) {
                start = null;
            }
            return start == null ? dxjokdxxwwVarM0.iobyxmoadg() : start;
        }
        if (wkgbmnqykc.draadjrbmk(i13, iobyxmoadgVar.lqeggnwhkg())) {
            int i15 = iobyxmoadg.f6272iobyxmoadg[zdlpuopuiuVar.ordinal()];
            if (i15 == 1) {
                end = dxjokdxxwwVarM0.getEnd();
            } else {
                if (i15 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                end = dxjokdxxwwVarM0.getStart();
            }
            if (end == wflxmlrfwp.f6255zoijcleaow.zoijcleaow()) {
                end = null;
            }
            return end == null ? dxjokdxxwwVarM0.zoijcleaow() : end;
        }
        if (!wkgbmnqykc.draadjrbmk(i13, iobyxmoadgVar.zoijcleaow()) && !wkgbmnqykc.draadjrbmk(i13, iobyxmoadgVar.ppxfxbqfkf())) {
            throw new IllegalStateException("invalid FocusDirection");
        }
        f.iobyxmoadg iobyxmoadgVar2 = new f.iobyxmoadg(i13, null);
        f.btonecajqb focusOwner = z.gtknphoqwx.vdvldrhtss(focusTargetNode).getFocusOwner();
        FocusTargetNode focusTargetNodeNufgyqmvbu = focusOwner.nufgyqmvbu();
        if (wkgbmnqykc.draadjrbmk(i13, iobyxmoadgVar.zoijcleaow())) {
            dxjokdxxwwVarM0.btonecajqb().invoke(iobyxmoadgVar2);
        } else {
            dxjokdxxwwVarM0.draadjrbmk().invoke(iobyxmoadgVar2);
        }
        if (iobyxmoadgVar2.ppxfxbqfkf()) {
            return wflxmlrfwp.f6255zoijcleaow.iobyxmoadg();
        }
        return focusTargetNodeNufgyqmvbu != focusOwner.nufgyqmvbu() ? wflxmlrfwp.f6255zoijcleaow.ppxfxbqfkf() : wflxmlrfwp.f6255zoijcleaow.zoijcleaow();
    }

    public static final boolean lqeggnwhkg(FocusTargetNode focusTargetNode) {
        pkzmftpjix pkzmftpjixVarS;
        xrmfcynszj xrmfcynszjVarF0;
        pkzmftpjix pkzmftpjixVarS2;
        xrmfcynszj xrmfcynszjVarF1 = focusTargetNode.f0();
        return (xrmfcynszjVarF1 == null || (pkzmftpjixVarS = xrmfcynszjVarF1.S()) == null || !pkzmftpjixVarS.gtknphoqwx() || (xrmfcynszjVarF0 = focusTargetNode.f0()) == null || (pkzmftpjixVarS2 = xrmfcynszjVarF0.S()) == null || !pkzmftpjixVarS2.gxszxtbevo()) ? false : true;
    }

    private static final FocusTargetNode ppxfxbqfkf(FocusTargetNode focusTargetNode) {
        okpsazkaxt okpsazkaxtVarWeqkydbzbr;
        int iIobyxmoadg = rlfsiqarku.iobyxmoadg(UserVerificationMethods.USER_VERIFY_ALL);
        if (!focusTargetNode.wflxmlrfwp().n0()) {
            w.iobyxmoadg.zoijcleaow("visitAncestors called on an unattached node");
        }
        androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf ppxfxbqfkfVarK0 = focusTargetNode.wflxmlrfwp().k0();
        pkzmftpjix pkzmftpjixVarRgvfuqvkyq = z.gtknphoqwx.rgvfuqvkyq(focusTargetNode);
        while (pkzmftpjixVarRgvfuqvkyq != null) {
            if ((pkzmftpjixVarRgvfuqvkyq.weqkydbzbr().gtknphoqwx().d0() & iIobyxmoadg) != 0) {
                while (ppxfxbqfkfVarK0 != null) {
                    if ((ppxfxbqfkfVarK0.i0() & iIobyxmoadg) != 0) {
                        androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf ppxfxbqfkfVarDxjokdxxww = ppxfxbqfkfVarK0;
                        ipoelvxyzq.ppxfxbqfkf ppxfxbqfkfVar = null;
                        while (ppxfxbqfkfVarDxjokdxxww != null) {
                            if (ppxfxbqfkfVarDxjokdxxww instanceof FocusTargetNode) {
                                FocusTargetNode focusTargetNode2 = (FocusTargetNode) ppxfxbqfkfVarDxjokdxxww;
                                if (focusTargetNode2.M0().lqeggnwhkg()) {
                                    return focusTargetNode2;
                                }
                            } else if ((ppxfxbqfkfVarDxjokdxxww.i0() & iIobyxmoadg) != 0 && (ppxfxbqfkfVarDxjokdxxww instanceof z.wflxmlrfwp)) {
                                int i13 = 0;
                                for (androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf ppxfxbqfkfVarI0 = ((z.wflxmlrfwp) ppxfxbqfkfVarDxjokdxxww).I0(); ppxfxbqfkfVarI0 != null; ppxfxbqfkfVarI0 = ppxfxbqfkfVarI0.e0()) {
                                    if ((ppxfxbqfkfVarI0.i0() & iIobyxmoadg) != 0) {
                                        i13++;
                                        if (i13 == 1) {
                                            ppxfxbqfkfVarDxjokdxxww = ppxfxbqfkfVarI0;
                                        } else {
                                            if (ppxfxbqfkfVar == null) {
                                                ppxfxbqfkfVar = new ipoelvxyzq.ppxfxbqfkf(new androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf[16], 0);
                                            }
                                            if (ppxfxbqfkfVarDxjokdxxww != null) {
                                                ppxfxbqfkfVar.zoijcleaow(ppxfxbqfkfVarDxjokdxxww);
                                                ppxfxbqfkfVarDxjokdxxww = null;
                                            }
                                            ppxfxbqfkfVar.zoijcleaow(ppxfxbqfkfVarI0);
                                        }
                                    }
                                }
                                if (i13 == 1) {
                                }
                            }
                            ppxfxbqfkfVarDxjokdxxww = z.gtknphoqwx.dxjokdxxww(ppxfxbqfkfVar);
                        }
                    }
                    ppxfxbqfkfVarK0 = ppxfxbqfkfVarK0.k0();
                }
            }
            pkzmftpjixVarRgvfuqvkyq = pkzmftpjixVarRgvfuqvkyq.auzgnhcxok();
            ppxfxbqfkfVarK0 = (pkzmftpjixVarRgvfuqvkyq == null || (okpsazkaxtVarWeqkydbzbr = pkzmftpjixVarRgvfuqvkyq.weqkydbzbr()) == null) ? null : okpsazkaxtVarWeqkydbzbr.ojitshcjhn();
        }
        return null;
    }

    public static final g.lqeggnwhkg wkgbmnqykc(FocusTargetNode focusTargetNode) {
        g.lqeggnwhkg lqeggnwhkgVarLrnfpwlwnk;
        xrmfcynszj xrmfcynszjVarF0 = focusTargetNode.f0();
        return (xrmfcynszjVarF0 == null || (lqeggnwhkgVarLrnfpwlwnk = x.vdvldrhtss.wkgbmnqykc(xrmfcynszjVarF0).lrnfpwlwnk(xrmfcynszjVarF0, false)) == null) ? g.lqeggnwhkg.f35592eablkybsjg.iobyxmoadg() : lqeggnwhkgVarLrnfpwlwnk;
    }

    public static final FocusTargetNode zoijcleaow(FocusTargetNode focusTargetNode) {
        FocusTargetNode focusTargetNodeNufgyqmvbu = z.gtknphoqwx.vdvldrhtss(focusTargetNode).getFocusOwner().nufgyqmvbu();
        if (focusTargetNodeNufgyqmvbu == null || !focusTargetNodeNufgyqmvbu.n0()) {
            return null;
        }
        return focusTargetNodeNufgyqmvbu;
    }
}
