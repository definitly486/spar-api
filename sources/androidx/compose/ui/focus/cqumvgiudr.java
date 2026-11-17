package androidx.compose.ui.focus;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.NoWhenBranchMatchedException;
import z.rlfsiqarku;

/* JADX INFO: loaded from: classes.dex */
public abstract class cqumvgiudr {

    public /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f6227iobyxmoadg;

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
            f6227iobyxmoadg = iArr;
        }
    }

    static final class zoijcleaow extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        final /* synthetic */ tg.draadjrbmk f6228cqumvgiudr;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ int f6229iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ g.lqeggnwhkg f6230jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ FocusTargetNode f6231yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ FocusTargetNode f6232zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zoijcleaow(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2, g.lqeggnwhkg lqeggnwhkgVar, int i13, tg.draadjrbmk draadjrbmkVar) {
            super(1);
            this.f6232zdlpuopuiu = focusTargetNode;
            this.f6231yggfygwlhe = focusTargetNode2;
            this.f6230jyumaefscl = lqeggnwhkgVar;
            this.f6229iwizpuwonk = i13;
            this.f6228cqumvgiudr = draadjrbmkVar;
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(x.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar) {
            if (this.f6232zdlpuopuiu != z.gtknphoqwx.vdvldrhtss(this.f6231yggfygwlhe).getFocusOwner().nufgyqmvbu()) {
                return Boolean.TRUE;
            }
            boolean zOxmwwwfdhm = cqumvgiudr.oxmwwwfdhm(this.f6231yggfygwlhe, this.f6230jyumaefscl, this.f6229iwizpuwonk, this.f6228cqumvgiudr);
            Boolean boolValueOf = Boolean.valueOf(zOxmwwwfdhm);
            if (zOxmwwwfdhm || !iobyxmoadgVar.iobyxmoadg()) {
                return boolValueOf;
            }
            return null;
        }
    }

    private static final boolean agtfadlqog(g.lqeggnwhkg lqeggnwhkgVar, int i13, g.lqeggnwhkg lqeggnwhkgVar2) {
        wkgbmnqykc.iobyxmoadg iobyxmoadgVar = wkgbmnqykc.f6266zoijcleaow;
        if (wkgbmnqykc.draadjrbmk(i13, iobyxmoadgVar.wkgbmnqykc())) {
            if ((lqeggnwhkgVar2.dxjokdxxww() <= lqeggnwhkgVar.dxjokdxxww() && lqeggnwhkgVar2.nufgyqmvbu() < lqeggnwhkgVar.dxjokdxxww()) || lqeggnwhkgVar2.nufgyqmvbu() <= lqeggnwhkgVar.nufgyqmvbu()) {
                return false;
            }
        } else if (wkgbmnqykc.draadjrbmk(i13, iobyxmoadgVar.lqeggnwhkg())) {
            if ((lqeggnwhkgVar2.nufgyqmvbu() >= lqeggnwhkgVar.nufgyqmvbu() && lqeggnwhkgVar2.dxjokdxxww() > lqeggnwhkgVar.nufgyqmvbu()) || lqeggnwhkgVar2.dxjokdxxww() >= lqeggnwhkgVar.dxjokdxxww()) {
                return false;
            }
        } else if (wkgbmnqykc.draadjrbmk(i13, iobyxmoadgVar.nufgyqmvbu())) {
            if ((lqeggnwhkgVar2.eablkybsjg() <= lqeggnwhkgVar.eablkybsjg() && lqeggnwhkgVar2.gtknphoqwx() < lqeggnwhkgVar.eablkybsjg()) || lqeggnwhkgVar2.gtknphoqwx() <= lqeggnwhkgVar.gtknphoqwx()) {
                return false;
            }
        } else {
            if (!wkgbmnqykc.draadjrbmk(i13, iobyxmoadgVar.iobyxmoadg())) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            if ((lqeggnwhkgVar2.gtknphoqwx() >= lqeggnwhkgVar.gtknphoqwx() && lqeggnwhkgVar2.eablkybsjg() > lqeggnwhkgVar.gtknphoqwx()) || lqeggnwhkgVar2.eablkybsjg() >= lqeggnwhkgVar.eablkybsjg()) {
                return false;
            }
        }
        return true;
    }

    private static final FocusTargetNode btonecajqb(ipoelvxyzq.ppxfxbqfkf ppxfxbqfkfVar, g.lqeggnwhkg lqeggnwhkgVar, int i13) {
        g.lqeggnwhkg lqeggnwhkgVarVdvldrhtss;
        wkgbmnqykc.iobyxmoadg iobyxmoadgVar = wkgbmnqykc.f6266zoijcleaow;
        if (wkgbmnqykc.draadjrbmk(i13, iobyxmoadgVar.wkgbmnqykc())) {
            lqeggnwhkgVarVdvldrhtss = lqeggnwhkgVar.vdvldrhtss((lqeggnwhkgVar.dxjokdxxww() - lqeggnwhkgVar.nufgyqmvbu()) + 1, 0.0f);
        } else if (wkgbmnqykc.draadjrbmk(i13, iobyxmoadgVar.lqeggnwhkg())) {
            lqeggnwhkgVarVdvldrhtss = lqeggnwhkgVar.vdvldrhtss(-((lqeggnwhkgVar.dxjokdxxww() - lqeggnwhkgVar.nufgyqmvbu()) + 1), 0.0f);
        } else if (wkgbmnqykc.draadjrbmk(i13, iobyxmoadgVar.nufgyqmvbu())) {
            lqeggnwhkgVarVdvldrhtss = lqeggnwhkgVar.vdvldrhtss(0.0f, (lqeggnwhkgVar.eablkybsjg() - lqeggnwhkgVar.gtknphoqwx()) + 1);
        } else {
            if (!wkgbmnqykc.draadjrbmk(i13, iobyxmoadgVar.iobyxmoadg())) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            lqeggnwhkgVarVdvldrhtss = lqeggnwhkgVar.vdvldrhtss(0.0f, -((lqeggnwhkgVar.eablkybsjg() - lqeggnwhkgVar.gtknphoqwx()) + 1));
        }
        Object[] objArr = ppxfxbqfkfVar.f49169zdlpuopuiu;
        int iDraadjrbmk = ppxfxbqfkfVar.draadjrbmk();
        FocusTargetNode focusTargetNode = null;
        for (int i14 = 0; i14 < iDraadjrbmk; i14++) {
            FocusTargetNode focusTargetNode2 = (FocusTargetNode) objArr[i14];
            if (zdlpuopuiu.lqeggnwhkg(focusTargetNode2)) {
                g.lqeggnwhkg lqeggnwhkgVarWkgbmnqykc = zdlpuopuiu.wkgbmnqykc(focusTargetNode2);
                if (wflxmlrfwp(lqeggnwhkgVarWkgbmnqykc, lqeggnwhkgVarVdvldrhtss, lqeggnwhkgVar, i13)) {
                    focusTargetNode = focusTargetNode2;
                    lqeggnwhkgVarVdvldrhtss = lqeggnwhkgVarWkgbmnqykc;
                }
            }
        }
        return focusTargetNode;
    }

    private static final boolean draadjrbmk(FocusTargetNode focusTargetNode, g.lqeggnwhkg lqeggnwhkgVar, int i13, tg.draadjrbmk draadjrbmkVar) {
        if (oxmwwwfdhm(focusTargetNode, lqeggnwhkgVar, i13, draadjrbmkVar)) {
            return true;
        }
        Boolean bool = (Boolean) androidx.compose.ui.focus.iobyxmoadg.iobyxmoadg(focusTargetNode, i13, new zoijcleaow(z.gtknphoqwx.vdvldrhtss(focusTargetNode).getFocusOwner().nufgyqmvbu(), focusTargetNode, lqeggnwhkgVar, i13, draadjrbmkVar));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    private static final void dxjokdxxww(z.btonecajqb btonecajqbVar, ipoelvxyzq.ppxfxbqfkf ppxfxbqfkfVar) {
        int iIobyxmoadg = rlfsiqarku.iobyxmoadg(UserVerificationMethods.USER_VERIFY_ALL);
        if (!btonecajqbVar.wflxmlrfwp().n0()) {
            w.iobyxmoadg.zoijcleaow("visitChildren called on an unattached node");
        }
        ipoelvxyzq.ppxfxbqfkf ppxfxbqfkfVar2 = new ipoelvxyzq.ppxfxbqfkf(new androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf[16], 0);
        androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf ppxfxbqfkfVarE0 = btonecajqbVar.wflxmlrfwp().e0();
        if (ppxfxbqfkfVarE0 == null) {
            z.gtknphoqwx.ppxfxbqfkf(ppxfxbqfkfVar2, btonecajqbVar.wflxmlrfwp(), false);
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
                                FocusTargetNode focusTargetNode = (FocusTargetNode) ppxfxbqfkfVarDxjokdxxww;
                                if (focusTargetNode.n0() && !z.gtknphoqwx.rgvfuqvkyq(focusTargetNode).istkbnxepw()) {
                                    if (focusTargetNode.M0().lqeggnwhkg()) {
                                        ppxfxbqfkfVar.zoijcleaow(focusTargetNode);
                                    } else {
                                        dxjokdxxww(focusTargetNode, ppxfxbqfkfVar);
                                    }
                                }
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
    }

    private static final boolean eablkybsjg(g.lqeggnwhkg lqeggnwhkgVar, int i13, g.lqeggnwhkg lqeggnwhkgVar2) {
        wkgbmnqykc.iobyxmoadg iobyxmoadgVar = wkgbmnqykc.f6266zoijcleaow;
        if (wkgbmnqykc.draadjrbmk(i13, iobyxmoadgVar.wkgbmnqykc())) {
            if (lqeggnwhkgVar2.nufgyqmvbu() < lqeggnwhkgVar.dxjokdxxww()) {
                return false;
            }
        } else if (wkgbmnqykc.draadjrbmk(i13, iobyxmoadgVar.lqeggnwhkg())) {
            if (lqeggnwhkgVar2.dxjokdxxww() > lqeggnwhkgVar.nufgyqmvbu()) {
                return false;
            }
        } else if (wkgbmnqykc.draadjrbmk(i13, iobyxmoadgVar.nufgyqmvbu())) {
            if (lqeggnwhkgVar2.gtknphoqwx() < lqeggnwhkgVar.eablkybsjg()) {
                return false;
            }
        } else {
            if (!wkgbmnqykc.draadjrbmk(i13, iobyxmoadgVar.iobyxmoadg())) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            if (lqeggnwhkgVar2.eablkybsjg() > lqeggnwhkgVar.gtknphoqwx()) {
                return false;
            }
        }
        return true;
    }

    public static final boolean gtknphoqwx(FocusTargetNode focusTargetNode, int i13, tg.draadjrbmk draadjrbmkVar) {
        g.lqeggnwhkg lqeggnwhkgVarKcexrzcfyt;
        ipoelvxyzq.ppxfxbqfkf ppxfxbqfkfVar = new ipoelvxyzq.ppxfxbqfkf(new FocusTargetNode[16], 0);
        dxjokdxxww(focusTargetNode, ppxfxbqfkfVar);
        if (ppxfxbqfkfVar.draadjrbmk() <= 1) {
            FocusTargetNode focusTargetNode2 = (FocusTargetNode) (ppxfxbqfkfVar.draadjrbmk() == 0 ? null : ppxfxbqfkfVar.f49169zdlpuopuiu[0]);
            if (focusTargetNode2 != null) {
                return ((Boolean) draadjrbmkVar.invoke(focusTargetNode2)).booleanValue();
            }
            return false;
        }
        wkgbmnqykc.iobyxmoadg iobyxmoadgVar = wkgbmnqykc.f6266zoijcleaow;
        if (wkgbmnqykc.draadjrbmk(i13, iobyxmoadgVar.zoijcleaow())) {
            i13 = iobyxmoadgVar.lqeggnwhkg();
        }
        if (wkgbmnqykc.draadjrbmk(i13, iobyxmoadgVar.lqeggnwhkg()) || wkgbmnqykc.draadjrbmk(i13, iobyxmoadgVar.iobyxmoadg())) {
            lqeggnwhkgVarKcexrzcfyt = kcexrzcfyt(zdlpuopuiu.wkgbmnqykc(focusTargetNode));
        } else {
            if (!wkgbmnqykc.draadjrbmk(i13, iobyxmoadgVar.wkgbmnqykc()) && !wkgbmnqykc.draadjrbmk(i13, iobyxmoadgVar.nufgyqmvbu())) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            lqeggnwhkgVarKcexrzcfyt = nufgyqmvbu(zdlpuopuiu.wkgbmnqykc(focusTargetNode));
        }
        FocusTargetNode focusTargetNodeBtonecajqb = btonecajqb(ppxfxbqfkfVar, lqeggnwhkgVarKcexrzcfyt, i13);
        if (focusTargetNodeBtonecajqb != null) {
            return ((Boolean) draadjrbmkVar.invoke(focusTargetNodeBtonecajqb)).booleanValue();
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0056  */
    /* JADX WARN: Code duplicated, block: B:22:? A[RETURN, SYNTHETIC] */
    private static final float gxszxtbevo(g.lqeggnwhkg lqeggnwhkgVar, int i13, g.lqeggnwhkg lqeggnwhkgVar2) {
        float fGtknphoqwx;
        float fEablkybsjg;
        float fGtknphoqwx2;
        float fEablkybsjg2;
        float f13;
        wkgbmnqykc.iobyxmoadg iobyxmoadgVar = wkgbmnqykc.f6266zoijcleaow;
        if (!wkgbmnqykc.draadjrbmk(i13, iobyxmoadgVar.wkgbmnqykc())) {
            if (wkgbmnqykc.draadjrbmk(i13, iobyxmoadgVar.lqeggnwhkg())) {
                fGtknphoqwx = lqeggnwhkgVar.nufgyqmvbu();
                fEablkybsjg = lqeggnwhkgVar2.dxjokdxxww();
            } else if (wkgbmnqykc.draadjrbmk(i13, iobyxmoadgVar.nufgyqmvbu())) {
                fGtknphoqwx2 = lqeggnwhkgVar2.gtknphoqwx();
                fEablkybsjg2 = lqeggnwhkgVar.eablkybsjg();
            } else {
                if (!wkgbmnqykc.draadjrbmk(i13, iobyxmoadgVar.iobyxmoadg())) {
                    throw new IllegalStateException("This function should only be used for 2-D focus search");
                }
                fGtknphoqwx = lqeggnwhkgVar.gtknphoqwx();
                fEablkybsjg = lqeggnwhkgVar2.eablkybsjg();
            }
            f13 = fGtknphoqwx - fEablkybsjg;
            if (f13 < 0.0f) {
                return 0.0f;
            }
            return f13;
        }
        fGtknphoqwx2 = lqeggnwhkgVar2.nufgyqmvbu();
        fEablkybsjg2 = lqeggnwhkgVar.dxjokdxxww();
        f13 = fGtknphoqwx2 - fEablkybsjg2;
        if (f13 < 0.0f) {
            return 0.0f;
        }
        return f13;
    }

    private static final g.lqeggnwhkg kcexrzcfyt(g.lqeggnwhkg lqeggnwhkgVar) {
        return new g.lqeggnwhkg(lqeggnwhkgVar.nufgyqmvbu(), lqeggnwhkgVar.gtknphoqwx(), lqeggnwhkgVar.nufgyqmvbu(), lqeggnwhkgVar.gtknphoqwx());
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0057  */
    /* JADX WARN: Code duplicated, block: B:22:? A[RETURN, SYNTHETIC] */
    private static final float lqeggnwhkg(g.lqeggnwhkg lqeggnwhkgVar, int i13, g.lqeggnwhkg lqeggnwhkgVar2) {
        float fEablkybsjg;
        float fEablkybsjg2;
        float fGtknphoqwx;
        float fGtknphoqwx2;
        float f13;
        wkgbmnqykc.iobyxmoadg iobyxmoadgVar = wkgbmnqykc.f6266zoijcleaow;
        if (!wkgbmnqykc.draadjrbmk(i13, iobyxmoadgVar.wkgbmnqykc())) {
            if (wkgbmnqykc.draadjrbmk(i13, iobyxmoadgVar.lqeggnwhkg())) {
                fEablkybsjg = lqeggnwhkgVar.dxjokdxxww();
                fEablkybsjg2 = lqeggnwhkgVar2.dxjokdxxww();
            } else if (wkgbmnqykc.draadjrbmk(i13, iobyxmoadgVar.nufgyqmvbu())) {
                fGtknphoqwx = lqeggnwhkgVar2.gtknphoqwx();
                fGtknphoqwx2 = lqeggnwhkgVar.gtknphoqwx();
            } else {
                if (!wkgbmnqykc.draadjrbmk(i13, iobyxmoadgVar.iobyxmoadg())) {
                    throw new IllegalStateException("This function should only be used for 2-D focus search");
                }
                fEablkybsjg = lqeggnwhkgVar.eablkybsjg();
                fEablkybsjg2 = lqeggnwhkgVar2.eablkybsjg();
            }
            f13 = fEablkybsjg - fEablkybsjg2;
            if (f13 < 1.0f) {
                return 1.0f;
            }
            return f13;
        }
        fGtknphoqwx = lqeggnwhkgVar2.nufgyqmvbu();
        fGtknphoqwx2 = lqeggnwhkgVar.nufgyqmvbu();
        f13 = fGtknphoqwx - fGtknphoqwx2;
        if (f13 < 1.0f) {
            return 1.0f;
        }
        return f13;
    }

    private static final g.lqeggnwhkg nufgyqmvbu(g.lqeggnwhkg lqeggnwhkgVar) {
        return new g.lqeggnwhkg(lqeggnwhkgVar.dxjokdxxww(), lqeggnwhkgVar.eablkybsjg(), lqeggnwhkgVar.dxjokdxxww(), lqeggnwhkgVar.eablkybsjg());
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0056  */
    /* JADX WARN: Code duplicated, block: B:22:? A[RETURN, SYNTHETIC] */
    private static final float ojitshcjhn(g.lqeggnwhkg lqeggnwhkgVar, int i13, g.lqeggnwhkg lqeggnwhkgVar2) {
        float fGtknphoqwx;
        float fEablkybsjg;
        float fGtknphoqwx2;
        float fEablkybsjg2;
        float f13;
        wkgbmnqykc.iobyxmoadg iobyxmoadgVar = wkgbmnqykc.f6266zoijcleaow;
        if (!wkgbmnqykc.draadjrbmk(i13, iobyxmoadgVar.wkgbmnqykc())) {
            if (wkgbmnqykc.draadjrbmk(i13, iobyxmoadgVar.lqeggnwhkg())) {
                fGtknphoqwx = lqeggnwhkgVar.nufgyqmvbu();
                fEablkybsjg = lqeggnwhkgVar2.dxjokdxxww();
            } else if (wkgbmnqykc.draadjrbmk(i13, iobyxmoadgVar.nufgyqmvbu())) {
                fGtknphoqwx2 = lqeggnwhkgVar2.gtknphoqwx();
                fEablkybsjg2 = lqeggnwhkgVar.eablkybsjg();
            } else {
                if (!wkgbmnqykc.draadjrbmk(i13, iobyxmoadgVar.iobyxmoadg())) {
                    throw new IllegalStateException("This function should only be used for 2-D focus search");
                }
                fGtknphoqwx = lqeggnwhkgVar.gtknphoqwx();
                fEablkybsjg = lqeggnwhkgVar2.eablkybsjg();
            }
            f13 = fGtknphoqwx - fEablkybsjg;
            if (f13 < 0.0f) {
                return 0.0f;
            }
            return f13;
        }
        fGtknphoqwx2 = lqeggnwhkgVar2.nufgyqmvbu();
        fEablkybsjg2 = lqeggnwhkgVar.dxjokdxxww();
        f13 = fGtknphoqwx2 - fEablkybsjg2;
        if (f13 < 0.0f) {
            return 0.0f;
        }
        return f13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean oxmwwwfdhm(FocusTargetNode focusTargetNode, g.lqeggnwhkg lqeggnwhkgVar, int i13, tg.draadjrbmk draadjrbmkVar) {
        FocusTargetNode focusTargetNodeBtonecajqb;
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
                                FocusTargetNode focusTargetNode2 = (FocusTargetNode) ppxfxbqfkfVarDxjokdxxww;
                                if (focusTargetNode2.n0()) {
                                    ppxfxbqfkfVar.zoijcleaow(focusTargetNode2);
                                }
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
        while (ppxfxbqfkfVar.draadjrbmk() != 0 && (focusTargetNodeBtonecajqb = btonecajqb(ppxfxbqfkfVar, lqeggnwhkgVar, i13)) != null) {
            if (focusTargetNodeBtonecajqb.M0().lqeggnwhkg()) {
                return ((Boolean) draadjrbmkVar.invoke(focusTargetNodeBtonecajqb)).booleanValue();
            }
            if (draadjrbmk(focusTargetNodeBtonecajqb, lqeggnwhkgVar, i13, draadjrbmkVar)) {
                return true;
            }
            ppxfxbqfkfVar.rgvfuqvkyq(focusTargetNodeBtonecajqb);
        }
        return false;
    }

    private static final boolean ppxfxbqfkf(g.lqeggnwhkg lqeggnwhkgVar, g.lqeggnwhkg lqeggnwhkgVar2, g.lqeggnwhkg lqeggnwhkgVar3, int i13) {
        if (wkgbmnqykc(lqeggnwhkgVar3, i13, lqeggnwhkgVar) || !wkgbmnqykc(lqeggnwhkgVar2, i13, lqeggnwhkgVar)) {
            return false;
        }
        if (eablkybsjg(lqeggnwhkgVar3, i13, lqeggnwhkgVar)) {
            wkgbmnqykc.iobyxmoadg iobyxmoadgVar = wkgbmnqykc.f6266zoijcleaow;
            if (!wkgbmnqykc.draadjrbmk(i13, iobyxmoadgVar.wkgbmnqykc()) && !wkgbmnqykc.draadjrbmk(i13, iobyxmoadgVar.lqeggnwhkg()) && gxszxtbevo(lqeggnwhkgVar2, i13, lqeggnwhkgVar) >= lqeggnwhkg(lqeggnwhkgVar3, i13, lqeggnwhkgVar)) {
                return false;
            }
        }
        return true;
    }

    private static final float rgvfuqvkyq(g.lqeggnwhkg lqeggnwhkgVar, int i13, g.lqeggnwhkg lqeggnwhkgVar2) {
        float f13;
        float f14;
        float fGtknphoqwx;
        float fEablkybsjg;
        float fGtknphoqwx2;
        wkgbmnqykc.iobyxmoadg iobyxmoadgVar = wkgbmnqykc.f6266zoijcleaow;
        if (wkgbmnqykc.draadjrbmk(i13, iobyxmoadgVar.wkgbmnqykc()) || wkgbmnqykc.draadjrbmk(i13, iobyxmoadgVar.lqeggnwhkg())) {
            float fGtknphoqwx3 = lqeggnwhkgVar2.gtknphoqwx();
            float fEablkybsjg2 = lqeggnwhkgVar2.eablkybsjg() - lqeggnwhkgVar2.gtknphoqwx();
            f13 = 2;
            f14 = fGtknphoqwx3 + (fEablkybsjg2 / f13);
            fGtknphoqwx = lqeggnwhkgVar.gtknphoqwx();
            fEablkybsjg = lqeggnwhkgVar.eablkybsjg();
            fGtknphoqwx2 = lqeggnwhkgVar.gtknphoqwx();
        } else {
            if (!wkgbmnqykc.draadjrbmk(i13, iobyxmoadgVar.nufgyqmvbu()) && !wkgbmnqykc.draadjrbmk(i13, iobyxmoadgVar.iobyxmoadg())) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            float fNufgyqmvbu = lqeggnwhkgVar2.nufgyqmvbu();
            float fDxjokdxxww = lqeggnwhkgVar2.dxjokdxxww() - lqeggnwhkgVar2.nufgyqmvbu();
            f13 = 2;
            f14 = fNufgyqmvbu + (fDxjokdxxww / f13);
            fGtknphoqwx = lqeggnwhkgVar.nufgyqmvbu();
            fEablkybsjg = lqeggnwhkgVar.dxjokdxxww();
            fGtknphoqwx2 = lqeggnwhkgVar.nufgyqmvbu();
        }
        return f14 - (fGtknphoqwx + ((fEablkybsjg - fGtknphoqwx2) / f13));
    }

    private static final long vdvldrhtss(int i13, g.lqeggnwhkg lqeggnwhkgVar, g.lqeggnwhkg lqeggnwhkgVar2) {
        long jOjitshcjhn = (long) ojitshcjhn(lqeggnwhkgVar2, i13, lqeggnwhkgVar);
        long jRgvfuqvkyq = (long) rgvfuqvkyq(lqeggnwhkgVar2, i13, lqeggnwhkgVar);
        return (((long) 13) * jOjitshcjhn * jOjitshcjhn) + (jRgvfuqvkyq * jRgvfuqvkyq);
    }

    public static final boolean wflxmlrfwp(g.lqeggnwhkg lqeggnwhkgVar, g.lqeggnwhkg lqeggnwhkgVar2, g.lqeggnwhkg lqeggnwhkgVar3, int i13) {
        if (agtfadlqog(lqeggnwhkgVar, i13, lqeggnwhkgVar3)) {
            return !agtfadlqog(lqeggnwhkgVar2, i13, lqeggnwhkgVar3) || ppxfxbqfkf(lqeggnwhkgVar3, lqeggnwhkgVar, lqeggnwhkgVar2, i13) || (!ppxfxbqfkf(lqeggnwhkgVar3, lqeggnwhkgVar2, lqeggnwhkgVar, i13) && vdvldrhtss(i13, lqeggnwhkgVar3, lqeggnwhkgVar) < vdvldrhtss(i13, lqeggnwhkgVar3, lqeggnwhkgVar2));
        }
        return false;
    }

    private static final boolean wkgbmnqykc(g.lqeggnwhkg lqeggnwhkgVar, int i13, g.lqeggnwhkg lqeggnwhkgVar2) {
        wkgbmnqykc.iobyxmoadg iobyxmoadgVar = wkgbmnqykc.f6266zoijcleaow;
        if (wkgbmnqykc.draadjrbmk(i13, iobyxmoadgVar.wkgbmnqykc()) || wkgbmnqykc.draadjrbmk(i13, iobyxmoadgVar.lqeggnwhkg())) {
            if (lqeggnwhkgVar.eablkybsjg() <= lqeggnwhkgVar2.gtknphoqwx() || lqeggnwhkgVar.gtknphoqwx() >= lqeggnwhkgVar2.eablkybsjg()) {
                return false;
            }
        } else {
            if (!wkgbmnqykc.draadjrbmk(i13, iobyxmoadgVar.nufgyqmvbu()) && !wkgbmnqykc.draadjrbmk(i13, iobyxmoadgVar.iobyxmoadg())) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            if (lqeggnwhkgVar.dxjokdxxww() <= lqeggnwhkgVar2.nufgyqmvbu() || lqeggnwhkgVar.nufgyqmvbu() >= lqeggnwhkgVar2.dxjokdxxww()) {
                return false;
            }
        }
        return true;
    }

    public static final Boolean zdlpuopuiu(FocusTargetNode focusTargetNode, int i13, g.lqeggnwhkg lqeggnwhkgVar, tg.draadjrbmk draadjrbmkVar) {
        f.rgvfuqvkyq rgvfuqvkyqVarJlmebxxoox = focusTargetNode.jlmebxxoox();
        int[] iArr = iobyxmoadg.f6227iobyxmoadg;
        int i14 = iArr[rgvfuqvkyqVarJlmebxxoox.ordinal()];
        if (i14 != 1) {
            if (i14 == 2 || i14 == 3) {
                return Boolean.valueOf(gtknphoqwx(focusTargetNode, i13, draadjrbmkVar));
            }
            if (i14 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            if (focusTargetNode.M0().lqeggnwhkg()) {
                return (Boolean) draadjrbmkVar.invoke(focusTargetNode);
            }
            return lqeggnwhkgVar == null ? Boolean.valueOf(gtknphoqwx(focusTargetNode, i13, draadjrbmkVar)) : Boolean.valueOf(oxmwwwfdhm(focusTargetNode, lqeggnwhkgVar, i13, draadjrbmkVar));
        }
        FocusTargetNode focusTargetNodeGxszxtbevo = zdlpuopuiu.gxszxtbevo(focusTargetNode);
        if (focusTargetNodeGxszxtbevo == null) {
            throw new IllegalStateException("ActiveParent must have a focusedChild");
        }
        int i15 = iArr[focusTargetNodeGxszxtbevo.jlmebxxoox().ordinal()];
        if (i15 == 1) {
            Boolean boolZdlpuopuiu = zdlpuopuiu(focusTargetNodeGxszxtbevo, i13, lqeggnwhkgVar, draadjrbmkVar);
            if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(boolZdlpuopuiu, Boolean.FALSE)) {
                return boolZdlpuopuiu;
            }
            if (lqeggnwhkgVar == null) {
                lqeggnwhkgVar = zdlpuopuiu.wkgbmnqykc(zoijcleaow(focusTargetNodeGxszxtbevo));
            }
            return Boolean.valueOf(draadjrbmk(focusTargetNode, lqeggnwhkgVar, i13, draadjrbmkVar));
        }
        if (i15 == 2 || i15 == 3) {
            if (lqeggnwhkgVar == null) {
                lqeggnwhkgVar = zdlpuopuiu.wkgbmnqykc(focusTargetNodeGxszxtbevo);
            }
            return Boolean.valueOf(draadjrbmk(focusTargetNode, lqeggnwhkgVar, i13, draadjrbmkVar));
        }
        if (i15 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalStateException("ActiveParent must have a focusedChild");
    }

    private static final FocusTargetNode zoijcleaow(FocusTargetNode focusTargetNode) {
        if (focusTargetNode.jlmebxxoox() != f.rgvfuqvkyq.ActiveParent) {
            throw new IllegalStateException("Searching for active node in inactive hierarchy");
        }
        FocusTargetNode focusTargetNodeZoijcleaow = zdlpuopuiu.zoijcleaow(focusTargetNode);
        if (focusTargetNodeZoijcleaow != null) {
            return focusTargetNodeZoijcleaow;
        }
        throw new IllegalStateException("ActiveParent must have a focusedChild");
    }
}
