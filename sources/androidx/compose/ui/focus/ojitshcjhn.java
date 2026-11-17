package androidx.compose.ui.focus;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import z.rlfsiqarku;

/* JADX INFO: loaded from: classes.dex */
public abstract class ojitshcjhn {

    static final class iobyxmoadg extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final iobyxmoadg f6248zdlpuopuiu = new iobyxmoadg();

        iobyxmoadg() {
            super(1);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(FocusTargetNode focusTargetNode) {
            return Boolean.valueOf(vdvldrhtss.lrnfpwlwnk(focusTargetNode, 0, 1, null));
        }
    }

    public static final boolean iobyxmoadg(f.agtfadlqog agtfadlqogVar) {
        int iIobyxmoadg = rlfsiqarku.iobyxmoadg(UserVerificationMethods.USER_VERIFY_ALL);
        androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf ppxfxbqfkfVarWflxmlrfwp = agtfadlqogVar.wflxmlrfwp();
        ipoelvxyzq.ppxfxbqfkf ppxfxbqfkfVar = null;
        while (ppxfxbqfkfVarWflxmlrfwp != null) {
            if (ppxfxbqfkfVarWflxmlrfwp instanceof FocusTargetNode) {
                FocusTargetNode focusTargetNode = (FocusTargetNode) ppxfxbqfkfVarWflxmlrfwp;
                return focusTargetNode.M0().lqeggnwhkg() ? vdvldrhtss.lrnfpwlwnk(focusTargetNode, 0, 1, null) : cqumvgiudr.gtknphoqwx(focusTargetNode, wkgbmnqykc.f6266zoijcleaow.zoijcleaow(), iobyxmoadg.f6248zdlpuopuiu);
            }
            if ((ppxfxbqfkfVarWflxmlrfwp.i0() & iIobyxmoadg) != 0 && (ppxfxbqfkfVarWflxmlrfwp instanceof z.wflxmlrfwp)) {
                int i13 = 0;
                for (androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf ppxfxbqfkfVarI0 = ((z.wflxmlrfwp) ppxfxbqfkfVarWflxmlrfwp).I0(); ppxfxbqfkfVarI0 != null; ppxfxbqfkfVarI0 = ppxfxbqfkfVarI0.e0()) {
                    if ((ppxfxbqfkfVarI0.i0() & iIobyxmoadg) != 0) {
                        i13++;
                        if (i13 == 1) {
                            ppxfxbqfkfVarWflxmlrfwp = ppxfxbqfkfVarI0;
                        } else {
                            if (ppxfxbqfkfVar == null) {
                                ppxfxbqfkfVar = new ipoelvxyzq.ppxfxbqfkf(new androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf[16], 0);
                            }
                            if (ppxfxbqfkfVarWflxmlrfwp != null) {
                                ppxfxbqfkfVar.zoijcleaow(ppxfxbqfkfVarWflxmlrfwp);
                                ppxfxbqfkfVarWflxmlrfwp = null;
                            }
                            ppxfxbqfkfVar.zoijcleaow(ppxfxbqfkfVarI0);
                        }
                    }
                }
                if (i13 == 1) {
                }
            }
            ppxfxbqfkfVarWflxmlrfwp = z.gtknphoqwx.dxjokdxxww(ppxfxbqfkfVar);
        }
        if (!agtfadlqogVar.wflxmlrfwp().n0()) {
            w.iobyxmoadg.zoijcleaow("visitChildren called on an unattached node");
        }
        ipoelvxyzq.ppxfxbqfkf ppxfxbqfkfVar2 = new ipoelvxyzq.ppxfxbqfkf(new androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf[16], 0);
        androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf ppxfxbqfkfVarE0 = agtfadlqogVar.wflxmlrfwp().e0();
        if (ppxfxbqfkfVarE0 == null) {
            z.gtknphoqwx.ppxfxbqfkf(ppxfxbqfkfVar2, agtfadlqogVar.wflxmlrfwp(), false);
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
                                return focusTargetNode2.M0().lqeggnwhkg() ? vdvldrhtss.lrnfpwlwnk(focusTargetNode2, 0, 1, null) : cqumvgiudr.gtknphoqwx(focusTargetNode2, wkgbmnqykc.f6266zoijcleaow.zoijcleaow(), iobyxmoadg.f6248zdlpuopuiu);
                            }
                            if ((ppxfxbqfkfVarDxjokdxxww.i0() & iIobyxmoadg) != 0 && (ppxfxbqfkfVarDxjokdxxww instanceof z.wflxmlrfwp)) {
                                int i14 = 0;
                                for (androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf ppxfxbqfkfVarI1 = ((z.wflxmlrfwp) ppxfxbqfkfVarDxjokdxxww).I0(); ppxfxbqfkfVarI1 != null; ppxfxbqfkfVarI1 = ppxfxbqfkfVarI1.e0()) {
                                    if ((ppxfxbqfkfVarI1.i0() & iIobyxmoadg) != 0) {
                                        i14++;
                                        if (i14 == 1) {
                                            ppxfxbqfkfVarDxjokdxxww = ppxfxbqfkfVarI1;
                                        } else {
                                            if (ppxfxbqfkfVar3 == null) {
                                                ppxfxbqfkfVar3 = new ipoelvxyzq.ppxfxbqfkf(new androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf[16], 0);
                                            }
                                            if (ppxfxbqfkfVarDxjokdxxww != null) {
                                                ppxfxbqfkfVar3.zoijcleaow(ppxfxbqfkfVarDxjokdxxww);
                                                ppxfxbqfkfVarDxjokdxxww = null;
                                            }
                                            ppxfxbqfkfVar3.zoijcleaow(ppxfxbqfkfVarI1);
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
        return false;
    }
}
