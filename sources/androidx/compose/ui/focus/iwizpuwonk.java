package androidx.compose.ui.focus;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.NoWhenBranchMatchedException;
import z.okpsazkaxt;
import z.pkzmftpjix;
import z.rlfsiqarku;

/* JADX INFO: loaded from: classes.dex */
public abstract class iwizpuwonk {

    public /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f6239iobyxmoadg;

        static {
            int[] iArr = new int[f.rgvfuqvkyq.values().length];
            try {
                iArr[f.rgvfuqvkyq.ActiveParent.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[f.rgvfuqvkyq.Active.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[f.rgvfuqvkyq.Captured.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[f.rgvfuqvkyq.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f6239iobyxmoadg = iArr;
        }
    }

    static final class zoijcleaow extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        final /* synthetic */ tg.draadjrbmk f6240cqumvgiudr;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ int f6241iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ FocusTargetNode f6242jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ FocusTargetNode f6243yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ FocusTargetNode f6244zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zoijcleaow(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2, FocusTargetNode focusTargetNode3, int i13, tg.draadjrbmk draadjrbmkVar) {
            super(1);
            this.f6244zdlpuopuiu = focusTargetNode;
            this.f6243yggfygwlhe = focusTargetNode2;
            this.f6242jyumaefscl = focusTargetNode3;
            this.f6241iwizpuwonk = i13;
            this.f6240cqumvgiudr = draadjrbmkVar;
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(x.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar) {
            if (this.f6244zdlpuopuiu != z.gtknphoqwx.vdvldrhtss(this.f6243yggfygwlhe).getFocusOwner().nufgyqmvbu()) {
                return Boolean.TRUE;
            }
            boolean zDxjokdxxww = iwizpuwonk.dxjokdxxww(this.f6243yggfygwlhe, this.f6242jyumaefscl, this.f6241iwizpuwonk, this.f6240cqumvgiudr);
            Boolean boolValueOf = Boolean.valueOf(zDxjokdxxww);
            if (zDxjokdxxww || !iobyxmoadgVar.iobyxmoadg()) {
                return boolValueOf;
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean dxjokdxxww(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2, int i13, tg.draadjrbmk draadjrbmkVar) {
        if (focusTargetNode.jlmebxxoox() != f.rgvfuqvkyq.ActiveParent) {
            throw new IllegalStateException("This function should only be used within a parent that has focus.");
        }
        ipoelvxyzq.ppxfxbqfkf ppxfxbqfkfVar = new ipoelvxyzq.ppxfxbqfkf(new FocusTargetNode[16], 0);
        int iIobyxmoadg = rlfsiqarku.iobyxmoadg(UserVerificationMethods.USER_VERIFY_ALL);
        if (!focusTargetNode.wflxmlrfwp().n0()) {
            w.iobyxmoadg.zoijcleaow("visitChildren called on an unattached node");
        }
        ipoelvxyzq.ppxfxbqfkf ppxfxbqfkfVar2 = new ipoelvxyzq.ppxfxbqfkf(new androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf[16], 0);
        androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf ppxfxbqfkfVarE0 = focusTargetNode.wflxmlrfwp().e0();
        if (ppxfxbqfkfVarE0 == null) {
            z.gtknphoqwx.ppxfxbqfkf(ppxfxbqfkfVar2, focusTargetNode.wflxmlrfwp(), false);
        } else {
            ppxfxbqfkfVar2.zoijcleaow(ppxfxbqfkfVarE0);
        }
        while (ppxfxbqfkfVar2.draadjrbmk() != 0) {
            androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf ppxfxbqfkfVarDxjokdxxww = (androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf) ppxfxbqfkfVar2.oxmwwwfdhm(ppxfxbqfkfVar2.draadjrbmk() - 1);
            if ((ppxfxbqfkfVarDxjokdxxww.d0() & iIobyxmoadg) == 0) {
                z.gtknphoqwx.ppxfxbqfkf(ppxfxbqfkfVar2, ppxfxbqfkfVarDxjokdxxww, false);
            } else {
                while (ppxfxbqfkfVarDxjokdxxww != null) {
                    if ((ppxfxbqfkfVarDxjokdxxww.i0() & iIobyxmoadg) != 0) {
                        ipoelvxyzq.ppxfxbqfkf ppxfxbqfkfVar3 = null;
                        while (ppxfxbqfkfVarDxjokdxxww != null) {
                            if (ppxfxbqfkfVarDxjokdxxww instanceof FocusTargetNode) {
                                ppxfxbqfkfVar.zoijcleaow((FocusTargetNode) ppxfxbqfkfVarDxjokdxxww);
                            } else if ((ppxfxbqfkfVarDxjokdxxww.i0() & iIobyxmoadg) != 0 && (ppxfxbqfkfVarDxjokdxxww instanceof z.wflxmlrfwp)) {
                                int i14 = 0;
                                for (androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf ppxfxbqfkfVarI0 = ((z.wflxmlrfwp) ppxfxbqfkfVarDxjokdxxww).I0(); ppxfxbqfkfVarI0 != null; ppxfxbqfkfVarI0 = ppxfxbqfkfVarI0.e0()) {
                                    if ((ppxfxbqfkfVarI0.i0() & iIobyxmoadg) != 0) {
                                        i14++;
                                        if (i14 == 1) {
                                            ppxfxbqfkfVarDxjokdxxww = ppxfxbqfkfVarI0;
                                        } else {
                                            if (ppxfxbqfkfVar3 == null) {
                                                ppxfxbqfkfVar3 = new ipoelvxyzq.ppxfxbqfkf(new androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf[16], 0);
                                            }
                                            if (ppxfxbqfkfVarDxjokdxxww != null) {
                                                ppxfxbqfkfVar3.zoijcleaow(ppxfxbqfkfVarDxjokdxxww);
                                                ppxfxbqfkfVarDxjokdxxww = null;
                                            }
                                            ppxfxbqfkfVar3.zoijcleaow(ppxfxbqfkfVarI0);
                                        }
                                    }
                                }
                                if (i14 == 1) {
                                }
                            }
                            ppxfxbqfkfVarDxjokdxxww = z.gtknphoqwx.dxjokdxxww(ppxfxbqfkfVar3);
                        }
                        break;
                    }
                    ppxfxbqfkfVarDxjokdxxww = ppxfxbqfkfVarDxjokdxxww.e0();
                }
            }
        }
        ppxfxbqfkfVar.cqumvgiudr(jyumaefscl.f6245zdlpuopuiu);
        wkgbmnqykc.iobyxmoadg iobyxmoadgVar = wkgbmnqykc.f6266zoijcleaow;
        if (wkgbmnqykc.draadjrbmk(i13, iobyxmoadgVar.eablkybsjg())) {
            zg.btonecajqb btonecajqbVarJyumaefscl = zg.gtknphoqwx.jyumaefscl(0, ppxfxbqfkfVar.draadjrbmk());
            int iWkgbmnqykc = btonecajqbVarJyumaefscl.wkgbmnqykc();
            int iEablkybsjg = btonecajqbVarJyumaefscl.eablkybsjg();
            if (iWkgbmnqykc <= iEablkybsjg) {
                boolean z13 = false;
                while (true) {
                    if (z13) {
                        FocusTargetNode focusTargetNode3 = (FocusTargetNode) ppxfxbqfkfVar.f49169zdlpuopuiu[iWkgbmnqykc];
                        if (zdlpuopuiu.lqeggnwhkg(focusTargetNode3) && ppxfxbqfkf(focusTargetNode3, draadjrbmkVar)) {
                            return true;
                        }
                    }
                    if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar.f49169zdlpuopuiu[iWkgbmnqykc], focusTargetNode2)) {
                        z13 = true;
                    }
                    if (iWkgbmnqykc == iEablkybsjg) {
                        break;
                    }
                    iWkgbmnqykc++;
                }
            }
        } else {
            if (!wkgbmnqykc.draadjrbmk(i13, iobyxmoadgVar.gxszxtbevo())) {
                throw new IllegalStateException("This function should only be used for 1-D focus search");
            }
            zg.btonecajqb btonecajqbVarJyumaefscl2 = zg.gtknphoqwx.jyumaefscl(0, ppxfxbqfkfVar.draadjrbmk());
            int iWkgbmnqykc2 = btonecajqbVarJyumaefscl2.wkgbmnqykc();
            int iEablkybsjg2 = btonecajqbVarJyumaefscl2.eablkybsjg();
            if (iWkgbmnqykc2 <= iEablkybsjg2) {
                boolean z14 = false;
                while (true) {
                    if (z14) {
                        FocusTargetNode focusTargetNode4 = (FocusTargetNode) ppxfxbqfkfVar.f49169zdlpuopuiu[iEablkybsjg2];
                        if (zdlpuopuiu.lqeggnwhkg(focusTargetNode4) && zoijcleaow(focusTargetNode4, draadjrbmkVar)) {
                            return true;
                        }
                    }
                    if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar.f49169zdlpuopuiu[iEablkybsjg2], focusTargetNode2)) {
                        z14 = true;
                    }
                    if (iEablkybsjg2 == iWkgbmnqykc2) {
                        break;
                    }
                    iEablkybsjg2--;
                }
            }
        }
        if (wkgbmnqykc.draadjrbmk(i13, wkgbmnqykc.f6266zoijcleaow.eablkybsjg()) || !focusTargetNode.M0().lqeggnwhkg() || eablkybsjg(focusTargetNode)) {
            return false;
        }
        return ((Boolean) draadjrbmkVar.invoke(focusTargetNode)).booleanValue();
    }

    private static final boolean eablkybsjg(FocusTargetNode focusTargetNode) {
        androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf ppxfxbqfkfVar;
        okpsazkaxt okpsazkaxtVarWeqkydbzbr;
        int iIobyxmoadg = rlfsiqarku.iobyxmoadg(UserVerificationMethods.USER_VERIFY_ALL);
        if (!focusTargetNode.wflxmlrfwp().n0()) {
            w.iobyxmoadg.zoijcleaow("visitAncestors called on an unattached node");
        }
        androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf ppxfxbqfkfVarK0 = focusTargetNode.wflxmlrfwp().k0();
        pkzmftpjix pkzmftpjixVarRgvfuqvkyq = z.gtknphoqwx.rgvfuqvkyq(focusTargetNode);
        loop0: while (true) {
            ppxfxbqfkfVar = null;
            if (pkzmftpjixVarRgvfuqvkyq == null) {
                break;
            }
            if ((pkzmftpjixVarRgvfuqvkyq.weqkydbzbr().gtknphoqwx().d0() & iIobyxmoadg) != 0) {
                while (ppxfxbqfkfVarK0 != null) {
                    if ((ppxfxbqfkfVarK0.i0() & iIobyxmoadg) != 0) {
                        androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf ppxfxbqfkfVarDxjokdxxww = ppxfxbqfkfVarK0;
                        ipoelvxyzq.ppxfxbqfkf ppxfxbqfkfVar2 = null;
                        while (ppxfxbqfkfVarDxjokdxxww != null) {
                            if (ppxfxbqfkfVarDxjokdxxww instanceof FocusTargetNode) {
                                ppxfxbqfkfVar = ppxfxbqfkfVarDxjokdxxww;
                                break loop0;
                            }
                            if ((ppxfxbqfkfVarDxjokdxxww.i0() & iIobyxmoadg) != 0 && (ppxfxbqfkfVarDxjokdxxww instanceof z.wflxmlrfwp)) {
                                int i13 = 0;
                                for (androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf ppxfxbqfkfVarI0 = ((z.wflxmlrfwp) ppxfxbqfkfVarDxjokdxxww).I0(); ppxfxbqfkfVarI0 != null; ppxfxbqfkfVarI0 = ppxfxbqfkfVarI0.e0()) {
                                    if ((ppxfxbqfkfVarI0.i0() & iIobyxmoadg) != 0) {
                                        i13++;
                                        if (i13 == 1) {
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
                                if (i13 == 1) {
                                }
                            }
                            ppxfxbqfkfVarDxjokdxxww = z.gtknphoqwx.dxjokdxxww(ppxfxbqfkfVar2);
                        }
                    }
                    ppxfxbqfkfVarK0 = ppxfxbqfkfVarK0.k0();
                }
            }
            pkzmftpjixVarRgvfuqvkyq = pkzmftpjixVarRgvfuqvkyq.auzgnhcxok();
            ppxfxbqfkfVarK0 = (pkzmftpjixVarRgvfuqvkyq == null || (okpsazkaxtVarWeqkydbzbr = pkzmftpjixVarRgvfuqvkyq.weqkydbzbr()) == null) ? null : okpsazkaxtVarWeqkydbzbr.ojitshcjhn();
        }
        return ppxfxbqfkfVar == null;
    }

    public static final boolean gxszxtbevo(FocusTargetNode focusTargetNode, int i13, tg.draadjrbmk draadjrbmkVar) {
        wkgbmnqykc.iobyxmoadg iobyxmoadgVar = wkgbmnqykc.f6266zoijcleaow;
        if (wkgbmnqykc.draadjrbmk(i13, iobyxmoadgVar.eablkybsjg())) {
            return ppxfxbqfkf(focusTargetNode, draadjrbmkVar);
        }
        if (wkgbmnqykc.draadjrbmk(i13, iobyxmoadgVar.gxszxtbevo())) {
            return zoijcleaow(focusTargetNode, draadjrbmkVar);
        }
        throw new IllegalStateException("This function should only be used for 1-D focus search");
    }

    private static final boolean lqeggnwhkg(FocusTargetNode focusTargetNode, tg.draadjrbmk draadjrbmkVar) {
        ipoelvxyzq.ppxfxbqfkf ppxfxbqfkfVar = new ipoelvxyzq.ppxfxbqfkf(new FocusTargetNode[16], 0);
        int iIobyxmoadg = rlfsiqarku.iobyxmoadg(UserVerificationMethods.USER_VERIFY_ALL);
        if (!focusTargetNode.wflxmlrfwp().n0()) {
            w.iobyxmoadg.zoijcleaow("visitChildren called on an unattached node");
        }
        ipoelvxyzq.ppxfxbqfkf ppxfxbqfkfVar2 = new ipoelvxyzq.ppxfxbqfkf(new androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf[16], 0);
        androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf ppxfxbqfkfVarE0 = focusTargetNode.wflxmlrfwp().e0();
        if (ppxfxbqfkfVarE0 == null) {
            z.gtknphoqwx.ppxfxbqfkf(ppxfxbqfkfVar2, focusTargetNode.wflxmlrfwp(), false);
        } else {
            ppxfxbqfkfVar2.zoijcleaow(ppxfxbqfkfVarE0);
        }
        while (ppxfxbqfkfVar2.draadjrbmk() != 0) {
            androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf ppxfxbqfkfVarDxjokdxxww = (androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf) ppxfxbqfkfVar2.oxmwwwfdhm(ppxfxbqfkfVar2.draadjrbmk() - 1);
            if ((ppxfxbqfkfVarDxjokdxxww.d0() & iIobyxmoadg) == 0) {
                z.gtknphoqwx.ppxfxbqfkf(ppxfxbqfkfVar2, ppxfxbqfkfVarDxjokdxxww, false);
            } else {
                while (ppxfxbqfkfVarDxjokdxxww != null) {
                    if ((ppxfxbqfkfVarDxjokdxxww.i0() & iIobyxmoadg) != 0) {
                        ipoelvxyzq.ppxfxbqfkf ppxfxbqfkfVar3 = null;
                        while (ppxfxbqfkfVarDxjokdxxww != null) {
                            if (ppxfxbqfkfVarDxjokdxxww instanceof FocusTargetNode) {
                                ppxfxbqfkfVar.zoijcleaow((FocusTargetNode) ppxfxbqfkfVarDxjokdxxww);
                            } else if ((ppxfxbqfkfVarDxjokdxxww.i0() & iIobyxmoadg) != 0 && (ppxfxbqfkfVarDxjokdxxww instanceof z.wflxmlrfwp)) {
                                int i13 = 0;
                                for (androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf ppxfxbqfkfVarI0 = ((z.wflxmlrfwp) ppxfxbqfkfVarDxjokdxxww).I0(); ppxfxbqfkfVarI0 != null; ppxfxbqfkfVarI0 = ppxfxbqfkfVarI0.e0()) {
                                    if ((ppxfxbqfkfVarI0.i0() & iIobyxmoadg) != 0) {
                                        i13++;
                                        if (i13 == 1) {
                                            ppxfxbqfkfVarDxjokdxxww = ppxfxbqfkfVarI0;
                                        } else {
                                            if (ppxfxbqfkfVar3 == null) {
                                                ppxfxbqfkfVar3 = new ipoelvxyzq.ppxfxbqfkf(new androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf[16], 0);
                                            }
                                            if (ppxfxbqfkfVarDxjokdxxww != null) {
                                                ppxfxbqfkfVar3.zoijcleaow(ppxfxbqfkfVarDxjokdxxww);
                                                ppxfxbqfkfVarDxjokdxxww = null;
                                            }
                                            ppxfxbqfkfVar3.zoijcleaow(ppxfxbqfkfVarI0);
                                        }
                                    }
                                }
                                if (i13 == 1) {
                                }
                            }
                            ppxfxbqfkfVarDxjokdxxww = z.gtknphoqwx.dxjokdxxww(ppxfxbqfkfVar3);
                        }
                        break;
                    }
                    ppxfxbqfkfVarDxjokdxxww = ppxfxbqfkfVarDxjokdxxww.e0();
                }
            }
        }
        ppxfxbqfkfVar.cqumvgiudr(jyumaefscl.f6245zdlpuopuiu);
        int iDraadjrbmk = ppxfxbqfkfVar.draadjrbmk() - 1;
        Object[] objArr = ppxfxbqfkfVar.f49169zdlpuopuiu;
        if (iDraadjrbmk < objArr.length) {
            while (iDraadjrbmk >= 0) {
                FocusTargetNode focusTargetNode2 = (FocusTargetNode) objArr[iDraadjrbmk];
                if (zdlpuopuiu.lqeggnwhkg(focusTargetNode2) && zoijcleaow(focusTargetNode2, draadjrbmkVar)) {
                    return true;
                }
                iDraadjrbmk--;
            }
        }
        return false;
    }

    private static final boolean nufgyqmvbu(FocusTargetNode focusTargetNode, tg.draadjrbmk draadjrbmkVar) {
        ipoelvxyzq.ppxfxbqfkf ppxfxbqfkfVar = new ipoelvxyzq.ppxfxbqfkf(new FocusTargetNode[16], 0);
        int iIobyxmoadg = rlfsiqarku.iobyxmoadg(UserVerificationMethods.USER_VERIFY_ALL);
        if (!focusTargetNode.wflxmlrfwp().n0()) {
            w.iobyxmoadg.zoijcleaow("visitChildren called on an unattached node");
        }
        ipoelvxyzq.ppxfxbqfkf ppxfxbqfkfVar2 = new ipoelvxyzq.ppxfxbqfkf(new androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf[16], 0);
        androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf ppxfxbqfkfVarE0 = focusTargetNode.wflxmlrfwp().e0();
        if (ppxfxbqfkfVarE0 == null) {
            z.gtknphoqwx.ppxfxbqfkf(ppxfxbqfkfVar2, focusTargetNode.wflxmlrfwp(), false);
        } else {
            ppxfxbqfkfVar2.zoijcleaow(ppxfxbqfkfVarE0);
        }
        while (ppxfxbqfkfVar2.draadjrbmk() != 0) {
            androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf ppxfxbqfkfVarDxjokdxxww = (androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf) ppxfxbqfkfVar2.oxmwwwfdhm(ppxfxbqfkfVar2.draadjrbmk() - 1);
            if ((ppxfxbqfkfVarDxjokdxxww.d0() & iIobyxmoadg) == 0) {
                z.gtknphoqwx.ppxfxbqfkf(ppxfxbqfkfVar2, ppxfxbqfkfVarDxjokdxxww, false);
            } else {
                while (ppxfxbqfkfVarDxjokdxxww != null) {
                    if ((ppxfxbqfkfVarDxjokdxxww.i0() & iIobyxmoadg) != 0) {
                        ipoelvxyzq.ppxfxbqfkf ppxfxbqfkfVar3 = null;
                        while (ppxfxbqfkfVarDxjokdxxww != null) {
                            if (ppxfxbqfkfVarDxjokdxxww instanceof FocusTargetNode) {
                                ppxfxbqfkfVar.zoijcleaow((FocusTargetNode) ppxfxbqfkfVarDxjokdxxww);
                            } else if ((ppxfxbqfkfVarDxjokdxxww.i0() & iIobyxmoadg) != 0 && (ppxfxbqfkfVarDxjokdxxww instanceof z.wflxmlrfwp)) {
                                int i13 = 0;
                                for (androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf ppxfxbqfkfVarI0 = ((z.wflxmlrfwp) ppxfxbqfkfVarDxjokdxxww).I0(); ppxfxbqfkfVarI0 != null; ppxfxbqfkfVarI0 = ppxfxbqfkfVarI0.e0()) {
                                    if ((ppxfxbqfkfVarI0.i0() & iIobyxmoadg) != 0) {
                                        i13++;
                                        if (i13 == 1) {
                                            ppxfxbqfkfVarDxjokdxxww = ppxfxbqfkfVarI0;
                                        } else {
                                            if (ppxfxbqfkfVar3 == null) {
                                                ppxfxbqfkfVar3 = new ipoelvxyzq.ppxfxbqfkf(new androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf[16], 0);
                                            }
                                            if (ppxfxbqfkfVarDxjokdxxww != null) {
                                                ppxfxbqfkfVar3.zoijcleaow(ppxfxbqfkfVarDxjokdxxww);
                                                ppxfxbqfkfVarDxjokdxxww = null;
                                            }
                                            ppxfxbqfkfVar3.zoijcleaow(ppxfxbqfkfVarI0);
                                        }
                                    }
                                }
                                if (i13 == 1) {
                                }
                            }
                            ppxfxbqfkfVarDxjokdxxww = z.gtknphoqwx.dxjokdxxww(ppxfxbqfkfVar3);
                        }
                        break;
                    }
                    ppxfxbqfkfVarDxjokdxxww = ppxfxbqfkfVarDxjokdxxww.e0();
                }
            }
        }
        ppxfxbqfkfVar.cqumvgiudr(jyumaefscl.f6245zdlpuopuiu);
        Object[] objArr = ppxfxbqfkfVar.f49169zdlpuopuiu;
        int iDraadjrbmk = ppxfxbqfkfVar.draadjrbmk();
        for (int i14 = 0; i14 < iDraadjrbmk; i14++) {
            FocusTargetNode focusTargetNode2 = (FocusTargetNode) objArr[i14];
            if (zdlpuopuiu.lqeggnwhkg(focusTargetNode2) && ppxfxbqfkf(focusTargetNode2, draadjrbmkVar)) {
                return true;
            }
        }
        return false;
    }

    private static final boolean ppxfxbqfkf(FocusTargetNode focusTargetNode, tg.draadjrbmk draadjrbmkVar) {
        int i13 = iobyxmoadg.f6239iobyxmoadg[focusTargetNode.jlmebxxoox().ordinal()];
        if (i13 == 1) {
            FocusTargetNode focusTargetNodeGxszxtbevo = zdlpuopuiu.gxszxtbevo(focusTargetNode);
            if (focusTargetNodeGxszxtbevo != null) {
                return ppxfxbqfkf(focusTargetNodeGxszxtbevo, draadjrbmkVar) || wkgbmnqykc(focusTargetNode, focusTargetNodeGxszxtbevo, wkgbmnqykc.f6266zoijcleaow.eablkybsjg(), draadjrbmkVar);
            }
            throw new IllegalStateException("ActiveParent must have a focusedChild");
        }
        if (i13 == 2 || i13 == 3) {
            return nufgyqmvbu(focusTargetNode, draadjrbmkVar);
        }
        if (i13 == 4) {
            return focusTargetNode.M0().lqeggnwhkg() ? ((Boolean) draadjrbmkVar.invoke(focusTargetNode)).booleanValue() : nufgyqmvbu(focusTargetNode, draadjrbmkVar);
        }
        throw new NoWhenBranchMatchedException();
    }

    private static final boolean wkgbmnqykc(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2, int i13, tg.draadjrbmk draadjrbmkVar) {
        if (dxjokdxxww(focusTargetNode, focusTargetNode2, i13, draadjrbmkVar)) {
            return true;
        }
        Boolean bool = (Boolean) androidx.compose.ui.focus.iobyxmoadg.iobyxmoadg(focusTargetNode, i13, new zoijcleaow(z.gtknphoqwx.vdvldrhtss(focusTargetNode).getFocusOwner().nufgyqmvbu(), focusTargetNode, focusTargetNode2, i13, draadjrbmkVar));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    private static final boolean zoijcleaow(FocusTargetNode focusTargetNode, tg.draadjrbmk draadjrbmkVar) {
        f.rgvfuqvkyq rgvfuqvkyqVarJlmebxxoox = focusTargetNode.jlmebxxoox();
        int[] iArr = iobyxmoadg.f6239iobyxmoadg;
        int i13 = iArr[rgvfuqvkyqVarJlmebxxoox.ordinal()];
        if (i13 == 1) {
            FocusTargetNode focusTargetNodeGxszxtbevo = zdlpuopuiu.gxszxtbevo(focusTargetNode);
            if (focusTargetNodeGxszxtbevo == null) {
                throw new IllegalStateException("ActiveParent must have a focusedChild");
            }
            int i14 = iArr[focusTargetNodeGxszxtbevo.jlmebxxoox().ordinal()];
            if (i14 != 1) {
                if (i14 == 2 || i14 == 3) {
                    return wkgbmnqykc(focusTargetNode, focusTargetNodeGxszxtbevo, wkgbmnqykc.f6266zoijcleaow.gxszxtbevo(), draadjrbmkVar);
                }
                if (i14 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                throw new IllegalStateException("ActiveParent must have a focusedChild");
            }
            if (!zoijcleaow(focusTargetNodeGxszxtbevo, draadjrbmkVar) && !wkgbmnqykc(focusTargetNode, focusTargetNodeGxszxtbevo, wkgbmnqykc.f6266zoijcleaow.gxszxtbevo(), draadjrbmkVar) && (!focusTargetNodeGxszxtbevo.M0().lqeggnwhkg() || !((Boolean) draadjrbmkVar.invoke(focusTargetNodeGxszxtbevo)).booleanValue())) {
                return false;
            }
        } else {
            if (i13 == 2 || i13 == 3) {
                return lqeggnwhkg(focusTargetNode, draadjrbmkVar);
            }
            if (i13 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            if (!lqeggnwhkg(focusTargetNode, draadjrbmkVar)) {
                if (!(focusTargetNode.M0().lqeggnwhkg() ? ((Boolean) draadjrbmkVar.invoke(focusTargetNode)).booleanValue() : false)) {
                    return false;
                }
            }
        }
        return true;
    }
}
