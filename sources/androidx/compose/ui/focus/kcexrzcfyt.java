package androidx.compose.ui.focus;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import gg.wwaezpbzkn;
import kotlin.NoWhenBranchMatchedException;
import z.okpsazkaxt;
import z.pkzmftpjix;
import z.rlfsiqarku;
import z.ydmasvzmpa;

/* JADX INFO: loaded from: classes.dex */
public abstract class kcexrzcfyt {

    public /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f6246iobyxmoadg;

        static {
            int[] iArr = new int[f.rgvfuqvkyq.values().length];
            try {
                iArr[f.rgvfuqvkyq.Active.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[f.rgvfuqvkyq.Captured.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[f.rgvfuqvkyq.ActiveParent.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[f.rgvfuqvkyq.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f6246iobyxmoadg = iArr;
        }
    }

    static final class zoijcleaow extends kotlin.jvm.internal.jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ FocusTargetNode f6247zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zoijcleaow(FocusTargetNode focusTargetNode) {
            super(0);
            this.f6247zdlpuopuiu = focusTargetNode;
        }

        @Override // tg.iobyxmoadg
        public /* bridge */ /* synthetic */ Object invoke() {
            iobyxmoadg();
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg() {
            this.f6247zdlpuopuiu.M0();
        }
    }

    private static final boolean btonecajqb(FocusTargetNode focusTargetNode, wkgbmnqykc wkgbmnqykcVar, g.lqeggnwhkg lqeggnwhkgVar) {
        return z.gtknphoqwx.vdvldrhtss(focusTargetNode).getFocusOwner().iobyxmoadg(wkgbmnqykcVar, lqeggnwhkgVar);
    }

    private static final FocusTargetNode draadjrbmk(FocusTargetNode focusTargetNode) {
        FocusTargetNode focusTargetNodeGxszxtbevo = zdlpuopuiu.gxszxtbevo(focusTargetNode);
        if (focusTargetNodeGxszxtbevo != null) {
            return focusTargetNodeGxszxtbevo;
        }
        throw new IllegalArgumentException("ActiveParent with no focused child");
    }

    public static final boolean dxjokdxxww(FocusTargetNode focusTargetNode) {
        ipoelvxyzq.ppxfxbqfkf ppxfxbqfkfVar;
        int i13;
        okpsazkaxt okpsazkaxtVarWeqkydbzbr;
        okpsazkaxt okpsazkaxtVarWeqkydbzbr2;
        f.btonecajqb focusOwner = z.gtknphoqwx.vdvldrhtss(focusTargetNode).getFocusOwner();
        FocusTargetNode focusTargetNodeNufgyqmvbu = focusOwner.nufgyqmvbu();
        f.rgvfuqvkyq rgvfuqvkyqVarJlmebxxoox = focusTargetNode.jlmebxxoox();
        int i14 = 1;
        if (focusTargetNodeNufgyqmvbu == focusTargetNode) {
            focusTargetNode.L0(rgvfuqvkyqVarJlmebxxoox, rgvfuqvkyqVarJlmebxxoox);
            return true;
        }
        ipoelvxyzq.ppxfxbqfkf ppxfxbqfkfVar2 = null;
        int i15 = 0;
        if (focusTargetNodeNufgyqmvbu == null && !gtknphoqwx(focusTargetNode, null, null, 3, null)) {
            return false;
        }
        int i16 = 16;
        if (focusTargetNodeNufgyqmvbu != null) {
            ppxfxbqfkfVar = new ipoelvxyzq.ppxfxbqfkf(new FocusTargetNode[16], 0);
            int iIobyxmoadg = rlfsiqarku.iobyxmoadg(UserVerificationMethods.USER_VERIFY_ALL);
            if (!focusTargetNodeNufgyqmvbu.wflxmlrfwp().n0()) {
                w.iobyxmoadg.zoijcleaow("visitAncestors called on an unattached node");
            }
            androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf ppxfxbqfkfVarK0 = focusTargetNodeNufgyqmvbu.wflxmlrfwp().k0();
            pkzmftpjix pkzmftpjixVarRgvfuqvkyq = z.gtknphoqwx.rgvfuqvkyq(focusTargetNodeNufgyqmvbu);
            while (pkzmftpjixVarRgvfuqvkyq != null) {
                if ((pkzmftpjixVarRgvfuqvkyq.weqkydbzbr().gtknphoqwx().d0() & iIobyxmoadg) != 0) {
                    while (ppxfxbqfkfVarK0 != null) {
                        if ((ppxfxbqfkfVarK0.i0() & iIobyxmoadg) != 0) {
                            ipoelvxyzq.ppxfxbqfkf ppxfxbqfkfVar3 = ppxfxbqfkfVar2;
                            androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf ppxfxbqfkfVarDxjokdxxww = ppxfxbqfkfVarK0;
                            while (ppxfxbqfkfVarDxjokdxxww != null) {
                                if (ppxfxbqfkfVarDxjokdxxww instanceof FocusTargetNode) {
                                    ppxfxbqfkfVar.zoijcleaow((FocusTargetNode) ppxfxbqfkfVarDxjokdxxww);
                                } else if ((ppxfxbqfkfVarDxjokdxxww.i0() & iIobyxmoadg) != 0 && (ppxfxbqfkfVarDxjokdxxww instanceof z.wflxmlrfwp)) {
                                    androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf ppxfxbqfkfVarI0 = ((z.wflxmlrfwp) ppxfxbqfkfVarDxjokdxxww).I0();
                                    int i17 = 0;
                                    while (ppxfxbqfkfVarI0 != null) {
                                        if ((ppxfxbqfkfVarI0.i0() & iIobyxmoadg) != 0) {
                                            i17++;
                                            if (i17 == i14) {
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
                                        ppxfxbqfkfVarI0 = ppxfxbqfkfVarI0.e0();
                                        i14 = 1;
                                    }
                                    if (i17 == i14) {
                                    }
                                }
                                ppxfxbqfkfVarDxjokdxxww = z.gtknphoqwx.dxjokdxxww(ppxfxbqfkfVar3);
                                i14 = 1;
                            }
                        }
                        ppxfxbqfkfVarK0 = ppxfxbqfkfVarK0.k0();
                        i14 = 1;
                        ppxfxbqfkfVar2 = null;
                    }
                }
                pkzmftpjixVarRgvfuqvkyq = pkzmftpjixVarRgvfuqvkyq.auzgnhcxok();
                ppxfxbqfkfVarK0 = (pkzmftpjixVarRgvfuqvkyq == null || (okpsazkaxtVarWeqkydbzbr2 = pkzmftpjixVarRgvfuqvkyq.weqkydbzbr()) == null) ? null : okpsazkaxtVarWeqkydbzbr2.ojitshcjhn();
                i14 = 1;
                ppxfxbqfkfVar2 = null;
            }
        } else {
            ppxfxbqfkfVar = null;
        }
        ipoelvxyzq.ppxfxbqfkf ppxfxbqfkfVar4 = new ipoelvxyzq.ppxfxbqfkf(new FocusTargetNode[16], 0);
        int iIobyxmoadg2 = rlfsiqarku.iobyxmoadg(UserVerificationMethods.USER_VERIFY_ALL);
        if (!focusTargetNode.wflxmlrfwp().n0()) {
            w.iobyxmoadg.zoijcleaow("visitAncestors called on an unattached node");
        }
        androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf ppxfxbqfkfVarK1 = focusTargetNode.wflxmlrfwp().k0();
        pkzmftpjix pkzmftpjixVarRgvfuqvkyq2 = z.gtknphoqwx.rgvfuqvkyq(focusTargetNode);
        int i18 = 1;
        while (pkzmftpjixVarRgvfuqvkyq2 != null) {
            if ((pkzmftpjixVarRgvfuqvkyq2.weqkydbzbr().gtknphoqwx().d0() & iIobyxmoadg2) != 0) {
                while (ppxfxbqfkfVarK1 != null) {
                    if ((ppxfxbqfkfVarK1.i0() & iIobyxmoadg2) != 0) {
                        androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf ppxfxbqfkfVarDxjokdxxww2 = ppxfxbqfkfVarK1;
                        ipoelvxyzq.ppxfxbqfkf ppxfxbqfkfVar5 = null;
                        while (ppxfxbqfkfVarDxjokdxxww2 != null) {
                            if (ppxfxbqfkfVarDxjokdxxww2 instanceof FocusTargetNode) {
                                FocusTargetNode focusTargetNode2 = (FocusTargetNode) ppxfxbqfkfVarDxjokdxxww2;
                                Boolean boolValueOf = ppxfxbqfkfVar != null ? Boolean.valueOf(ppxfxbqfkfVar.rgvfuqvkyq(focusTargetNode2)) : null;
                                if (boolValueOf == null || !boolValueOf.booleanValue()) {
                                    ppxfxbqfkfVar4.zoijcleaow(focusTargetNode2);
                                }
                                if (focusTargetNode2 == focusTargetNodeNufgyqmvbu) {
                                    i18 = i15;
                                }
                            } else {
                                if ((ppxfxbqfkfVarDxjokdxxww2.i0() & iIobyxmoadg2) != 0 && (ppxfxbqfkfVarDxjokdxxww2 instanceof z.wflxmlrfwp)) {
                                    androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf ppxfxbqfkfVarI1 = ((z.wflxmlrfwp) ppxfxbqfkfVarDxjokdxxww2).I0();
                                    int i19 = i15;
                                    while (ppxfxbqfkfVarI1 != null) {
                                        if ((ppxfxbqfkfVarI1.i0() & iIobyxmoadg2) != 0) {
                                            i19++;
                                            if (i19 == 1) {
                                                ppxfxbqfkfVarDxjokdxxww2 = ppxfxbqfkfVarI1;
                                            } else {
                                                if (ppxfxbqfkfVar5 == null) {
                                                    ppxfxbqfkfVar5 = new ipoelvxyzq.ppxfxbqfkf(new androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf[i16], 0);
                                                }
                                                if (ppxfxbqfkfVarDxjokdxxww2 != null) {
                                                    ppxfxbqfkfVar5.zoijcleaow(ppxfxbqfkfVarDxjokdxxww2);
                                                    ppxfxbqfkfVarDxjokdxxww2 = null;
                                                }
                                                ppxfxbqfkfVar5.zoijcleaow(ppxfxbqfkfVarI1);
                                            }
                                        }
                                        ppxfxbqfkfVarI1 = ppxfxbqfkfVarI1.e0();
                                        i16 = 16;
                                    }
                                    if (i19 == 1) {
                                    }
                                }
                                i15 = 0;
                                i16 = 16;
                            }
                            ppxfxbqfkfVarDxjokdxxww2 = z.gtknphoqwx.dxjokdxxww(ppxfxbqfkfVar5);
                            i15 = 0;
                            i16 = 16;
                        }
                    }
                    ppxfxbqfkfVarK1 = ppxfxbqfkfVarK1.k0();
                    i15 = 0;
                    i16 = 16;
                }
            }
            pkzmftpjixVarRgvfuqvkyq2 = pkzmftpjixVarRgvfuqvkyq2.auzgnhcxok();
            ppxfxbqfkfVarK1 = (pkzmftpjixVarRgvfuqvkyq2 == null || (okpsazkaxtVarWeqkydbzbr = pkzmftpjixVarRgvfuqvkyq2.weqkydbzbr()) == null) ? null : okpsazkaxtVarWeqkydbzbr.ojitshcjhn();
            i15 = 0;
            i16 = 16;
        }
        if (i18 == 0 || focusTargetNodeNufgyqmvbu == null) {
            i13 = 1;
        } else {
            i13 = 1;
            if (!ppxfxbqfkf(focusTargetNodeNufgyqmvbu, false, true, 1, null)) {
                return false;
            }
        }
        wkgbmnqykc(focusTargetNode);
        if (ppxfxbqfkfVar != null) {
            int iDraadjrbmk = ppxfxbqfkfVar.draadjrbmk() - i13;
            Object[] objArr = ppxfxbqfkfVar.f49169zdlpuopuiu;
            if (iDraadjrbmk < objArr.length) {
                while (iDraadjrbmk >= 0) {
                    FocusTargetNode focusTargetNode3 = (FocusTargetNode) objArr[iDraadjrbmk];
                    if (focusOwner.nufgyqmvbu() != focusTargetNode) {
                        return false;
                    }
                    focusTargetNode3.L0(f.rgvfuqvkyq.ActiveParent, f.rgvfuqvkyq.Inactive);
                    iDraadjrbmk--;
                }
            }
        }
        int iDraadjrbmk2 = ppxfxbqfkfVar4.draadjrbmk() - 1;
        Object[] objArr2 = ppxfxbqfkfVar4.f49169zdlpuopuiu;
        if (iDraadjrbmk2 < objArr2.length) {
            while (iDraadjrbmk2 >= 0) {
                FocusTargetNode focusTargetNode4 = (FocusTargetNode) objArr2[iDraadjrbmk2];
                if (focusOwner.nufgyqmvbu() != focusTargetNode) {
                    return false;
                }
                focusTargetNode4.L0(focusTargetNode4 == focusTargetNodeNufgyqmvbu ? f.rgvfuqvkyq.Active : f.rgvfuqvkyq.Inactive, f.rgvfuqvkyq.ActiveParent);
                iDraadjrbmk2--;
            }
        }
        if (focusOwner.nufgyqmvbu() != focusTargetNode) {
            return false;
        }
        focusTargetNode.L0(rgvfuqvkyqVarJlmebxxoox, f.rgvfuqvkyq.Active);
        if (focusOwner.nufgyqmvbu() != focusTargetNode) {
            return false;
        }
        if (!a.nufgyqmvbu.f65wkgbmnqykc || z.gtknphoqwx.rgvfuqvkyq(focusTargetNode).ribwqtqdhb() != null) {
            return true;
        }
        btonecajqb(focusTargetNode, wkgbmnqykc.dxjokdxxww(wkgbmnqykc.f6266zoijcleaow.eablkybsjg()), null);
        return true;
    }

    public static final f.zoijcleaow eablkybsjg(FocusTargetNode focusTargetNode, int i13) {
        int i14 = iobyxmoadg.f6246iobyxmoadg[focusTargetNode.jlmebxxoox().ordinal()];
        if (i14 != 1) {
            if (i14 == 2) {
                return f.zoijcleaow.Cancelled;
            }
            if (i14 == 3) {
                f.zoijcleaow zoijcleaowVarEablkybsjg = eablkybsjg(draadjrbmk(focusTargetNode), i13);
                if (zoijcleaowVarEablkybsjg == f.zoijcleaow.None) {
                    zoijcleaowVarEablkybsjg = null;
                }
                return zoijcleaowVarEablkybsjg == null ? lqeggnwhkg(focusTargetNode, i13) : zoijcleaowVarEablkybsjg;
            }
            if (i14 != 4) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return f.zoijcleaow.None;
    }

    static /* synthetic */ boolean gtknphoqwx(FocusTargetNode focusTargetNode, wkgbmnqykc wkgbmnqykcVar, g.lqeggnwhkg lqeggnwhkgVar, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            wkgbmnqykcVar = null;
        }
        if ((i13 & 2) != 0) {
            lqeggnwhkgVar = null;
        }
        return btonecajqb(focusTargetNode, wkgbmnqykcVar, lqeggnwhkgVar);
    }

    private static final f.zoijcleaow gxszxtbevo(FocusTargetNode focusTargetNode, int i13) {
        if (!focusTargetNode.f6206jpowsppfya) {
            focusTargetNode.f6206jpowsppfya = true;
            try {
                dxjokdxxww dxjokdxxwwVarM0 = focusTargetNode.M0();
                f.iobyxmoadg iobyxmoadgVar = new f.iobyxmoadg(i13, null);
                f.btonecajqb focusOwner = z.gtknphoqwx.vdvldrhtss(focusTargetNode).getFocusOwner();
                FocusTargetNode focusTargetNodeNufgyqmvbu = focusOwner.nufgyqmvbu();
                dxjokdxxwwVarM0.btonecajqb().invoke(iobyxmoadgVar);
                FocusTargetNode focusTargetNodeNufgyqmvbu2 = focusOwner.nufgyqmvbu();
                if (iobyxmoadgVar.ppxfxbqfkf()) {
                    wflxmlrfwp.iobyxmoadg iobyxmoadgVar2 = wflxmlrfwp.f6255zoijcleaow;
                    wflxmlrfwp wflxmlrfwpVarIobyxmoadg = iobyxmoadgVar2.iobyxmoadg();
                    if (wflxmlrfwpVarIobyxmoadg == iobyxmoadgVar2.iobyxmoadg()) {
                        return f.zoijcleaow.Cancelled;
                    }
                    if (wflxmlrfwpVarIobyxmoadg == iobyxmoadgVar2.ppxfxbqfkf()) {
                        return f.zoijcleaow.Redirected;
                    }
                    return wflxmlrfwp.lqeggnwhkg(wflxmlrfwpVarIobyxmoadg, 0, 1, null) ? f.zoijcleaow.Redirected : f.zoijcleaow.RedirectCancelled;
                }
                if (focusTargetNodeNufgyqmvbu != focusTargetNodeNufgyqmvbu2 && focusTargetNodeNufgyqmvbu2 != null) {
                    wflxmlrfwp.iobyxmoadg iobyxmoadgVar3 = wflxmlrfwp.f6255zoijcleaow;
                    wflxmlrfwp wflxmlrfwpVarPpxfxbqfkf = iobyxmoadgVar3.ppxfxbqfkf();
                    if (wflxmlrfwpVarPpxfxbqfkf == iobyxmoadgVar3.iobyxmoadg()) {
                        return f.zoijcleaow.Cancelled;
                    }
                    if (wflxmlrfwpVarPpxfxbqfkf == iobyxmoadgVar3.ppxfxbqfkf()) {
                        return f.zoijcleaow.Redirected;
                    }
                    return wflxmlrfwp.lqeggnwhkg(wflxmlrfwpVarPpxfxbqfkf, 0, 1, null) ? f.zoijcleaow.Redirected : f.zoijcleaow.RedirectCancelled;
                }
            } finally {
                focusTargetNode.f6206jpowsppfya = false;
            }
        }
        return f.zoijcleaow.None;
    }

    private static final boolean iobyxmoadg(FocusTargetNode focusTargetNode, boolean z13, boolean z14) {
        FocusTargetNode focusTargetNodeGxszxtbevo = zdlpuopuiu.gxszxtbevo(focusTargetNode);
        if (focusTargetNodeGxszxtbevo != null) {
            return zoijcleaow(focusTargetNodeGxszxtbevo, z13, z14);
        }
        return true;
    }

    private static final f.zoijcleaow lqeggnwhkg(FocusTargetNode focusTargetNode, int i13) {
        if (!focusTargetNode.f6204hcddaimhww) {
            focusTargetNode.f6204hcddaimhww = true;
            try {
                dxjokdxxww dxjokdxxwwVarM0 = focusTargetNode.M0();
                f.iobyxmoadg iobyxmoadgVar = new f.iobyxmoadg(i13, null);
                f.btonecajqb focusOwner = z.gtknphoqwx.vdvldrhtss(focusTargetNode).getFocusOwner();
                FocusTargetNode focusTargetNodeNufgyqmvbu = focusOwner.nufgyqmvbu();
                dxjokdxxwwVarM0.draadjrbmk().invoke(iobyxmoadgVar);
                FocusTargetNode focusTargetNodeNufgyqmvbu2 = focusOwner.nufgyqmvbu();
                if (iobyxmoadgVar.ppxfxbqfkf()) {
                    wflxmlrfwp.iobyxmoadg iobyxmoadgVar2 = wflxmlrfwp.f6255zoijcleaow;
                    wflxmlrfwp wflxmlrfwpVarIobyxmoadg = iobyxmoadgVar2.iobyxmoadg();
                    if (wflxmlrfwpVarIobyxmoadg == iobyxmoadgVar2.iobyxmoadg()) {
                        return f.zoijcleaow.Cancelled;
                    }
                    if (wflxmlrfwpVarIobyxmoadg == iobyxmoadgVar2.ppxfxbqfkf()) {
                        return f.zoijcleaow.Redirected;
                    }
                    return wflxmlrfwp.lqeggnwhkg(wflxmlrfwpVarIobyxmoadg, 0, 1, null) ? f.zoijcleaow.Redirected : f.zoijcleaow.RedirectCancelled;
                }
                if (focusTargetNodeNufgyqmvbu != focusTargetNodeNufgyqmvbu2 && focusTargetNodeNufgyqmvbu2 != null) {
                    wflxmlrfwp.iobyxmoadg iobyxmoadgVar3 = wflxmlrfwp.f6255zoijcleaow;
                    wflxmlrfwp wflxmlrfwpVarPpxfxbqfkf = iobyxmoadgVar3.ppxfxbqfkf();
                    if (wflxmlrfwpVarPpxfxbqfkf == iobyxmoadgVar3.iobyxmoadg()) {
                        return f.zoijcleaow.Cancelled;
                    }
                    if (wflxmlrfwpVarPpxfxbqfkf == iobyxmoadgVar3.ppxfxbqfkf()) {
                        return f.zoijcleaow.Redirected;
                    }
                    return wflxmlrfwp.lqeggnwhkg(wflxmlrfwpVarPpxfxbqfkf, 0, 1, null) ? f.zoijcleaow.Redirected : f.zoijcleaow.RedirectCancelled;
                }
            } finally {
                focusTargetNode.f6204hcddaimhww = false;
            }
        }
        return f.zoijcleaow.None;
    }

    public static final f.zoijcleaow nufgyqmvbu(FocusTargetNode focusTargetNode, int i13) {
        androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf ppxfxbqfkfVarDxjokdxxww;
        okpsazkaxt okpsazkaxtVarWeqkydbzbr;
        int i14 = iobyxmoadg.f6246iobyxmoadg[focusTargetNode.jlmebxxoox().ordinal()];
        if (i14 == 1 || i14 == 2) {
            return f.zoijcleaow.None;
        }
        if (i14 == 3) {
            return eablkybsjg(draadjrbmk(focusTargetNode), i13);
        }
        if (i14 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        int iIobyxmoadg = rlfsiqarku.iobyxmoadg(UserVerificationMethods.USER_VERIFY_ALL);
        if (!focusTargetNode.wflxmlrfwp().n0()) {
            w.iobyxmoadg.zoijcleaow("visitAncestors called on an unattached node");
        }
        androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf ppxfxbqfkfVarK0 = focusTargetNode.wflxmlrfwp().k0();
        pkzmftpjix pkzmftpjixVarRgvfuqvkyq = z.gtknphoqwx.rgvfuqvkyq(focusTargetNode);
        loop0: while (true) {
            if (pkzmftpjixVarRgvfuqvkyq == null) {
                ppxfxbqfkfVarDxjokdxxww = null;
                break;
            }
            if ((pkzmftpjixVarRgvfuqvkyq.weqkydbzbr().gtknphoqwx().d0() & iIobyxmoadg) != 0) {
                while (ppxfxbqfkfVarK0 != null) {
                    if ((ppxfxbqfkfVarK0.i0() & iIobyxmoadg) != 0) {
                        ppxfxbqfkfVarDxjokdxxww = ppxfxbqfkfVarK0;
                        ipoelvxyzq.ppxfxbqfkf ppxfxbqfkfVar = null;
                        while (ppxfxbqfkfVarDxjokdxxww != null) {
                            if (ppxfxbqfkfVarDxjokdxxww instanceof FocusTargetNode) {
                                break loop0;
                            }
                            if ((ppxfxbqfkfVarDxjokdxxww.i0() & iIobyxmoadg) != 0 && (ppxfxbqfkfVarDxjokdxxww instanceof z.wflxmlrfwp)) {
                                int i15 = 0;
                                for (androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf ppxfxbqfkfVarI0 = ((z.wflxmlrfwp) ppxfxbqfkfVarDxjokdxxww).I0(); ppxfxbqfkfVarI0 != null; ppxfxbqfkfVarI0 = ppxfxbqfkfVarI0.e0()) {
                                    if ((ppxfxbqfkfVarI0.i0() & iIobyxmoadg) != 0) {
                                        i15++;
                                        if (i15 == 1) {
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
                                if (i15 == 1) {
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
        FocusTargetNode focusTargetNode2 = (FocusTargetNode) ppxfxbqfkfVarDxjokdxxww;
        if (focusTargetNode2 == null) {
            return f.zoijcleaow.None;
        }
        int i16 = iobyxmoadg.f6246iobyxmoadg[focusTargetNode2.jlmebxxoox().ordinal()];
        if (i16 == 1) {
            return gxszxtbevo(focusTargetNode2, i13);
        }
        if (i16 == 2) {
            return f.zoijcleaow.Cancelled;
        }
        if (i16 == 3) {
            return nufgyqmvbu(focusTargetNode2, i13);
        }
        if (i16 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        f.zoijcleaow zoijcleaowVarNufgyqmvbu = nufgyqmvbu(focusTargetNode2, i13);
        f.zoijcleaow zoijcleaowVar = zoijcleaowVarNufgyqmvbu != f.zoijcleaow.None ? zoijcleaowVarNufgyqmvbu : null;
        return zoijcleaowVar == null ? gxszxtbevo(focusTargetNode2, i13) : zoijcleaowVar;
    }

    public static /* synthetic */ boolean ppxfxbqfkf(FocusTargetNode focusTargetNode, boolean z13, boolean z14, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z13 = false;
        }
        return zoijcleaow(focusTargetNode, z13, z14);
    }

    private static final boolean wkgbmnqykc(FocusTargetNode focusTargetNode) {
        ydmasvzmpa.iobyxmoadg(focusTargetNode, new zoijcleaow(focusTargetNode));
        int i13 = iobyxmoadg.f6246iobyxmoadg[focusTargetNode.jlmebxxoox().ordinal()];
        if (i13 != 1 && i13 != 2) {
            if (i13 != 3 && i13 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            z.gtknphoqwx.vdvldrhtss(focusTargetNode).getFocusOwner().oxmwwwfdhm(focusTargetNode);
        }
        return true;
    }

    public static final boolean zoijcleaow(FocusTargetNode focusTargetNode, boolean z13, boolean z14) {
        int i13 = iobyxmoadg.f6246iobyxmoadg[focusTargetNode.jlmebxxoox().ordinal()];
        if (i13 == 1) {
            z.gtknphoqwx.vdvldrhtss(focusTargetNode).getFocusOwner().oxmwwwfdhm(null);
            if (z14) {
                focusTargetNode.L0(f.rgvfuqvkyq.Active, f.rgvfuqvkyq.Inactive);
            }
        } else {
            if (i13 == 2) {
                if (!z13) {
                    return z13;
                }
                z.gtknphoqwx.vdvldrhtss(focusTargetNode).getFocusOwner().oxmwwwfdhm(null);
                if (!z14) {
                    return z13;
                }
                focusTargetNode.L0(f.rgvfuqvkyq.Captured, f.rgvfuqvkyq.Inactive);
                return z13;
            }
            if (i13 != 3) {
                if (i13 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                if (!iobyxmoadg(focusTargetNode, z13, z14)) {
                    return false;
                }
                if (z14) {
                    focusTargetNode.L0(f.rgvfuqvkyq.ActiveParent, f.rgvfuqvkyq.Inactive);
                }
            }
        }
        return true;
    }
}
