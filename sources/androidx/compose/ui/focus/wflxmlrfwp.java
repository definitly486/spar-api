package androidx.compose.ui.focus;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import z.rlfsiqarku;

/* JADX INFO: loaded from: classes.dex */
public final class wflxmlrfwp {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ipoelvxyzq.ppxfxbqfkf f6256iobyxmoadg = new ipoelvxyzq.ppxfxbqfkf(new f.agtfadlqog[16], 0);

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public static final iobyxmoadg f6255zoijcleaow = new iobyxmoadg(null);

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final wflxmlrfwp f6253ppxfxbqfkf = new wflxmlrfwp();

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final wflxmlrfwp f6254wkgbmnqykc = new wflxmlrfwp();

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private static final wflxmlrfwp f6252eablkybsjg = new wflxmlrfwp();

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final wflxmlrfwp iobyxmoadg() {
            return wflxmlrfwp.f6254wkgbmnqykc;
        }

        public final wflxmlrfwp ppxfxbqfkf() {
            return wflxmlrfwp.f6252eablkybsjg;
        }

        public final wflxmlrfwp zoijcleaow() {
            return wflxmlrfwp.f6253ppxfxbqfkf;
        }

        private iobyxmoadg() {
        }
    }

    static final class zoijcleaow extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ int f6257zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zoijcleaow(int i13) {
            super(1);
            this.f6257zdlpuopuiu = i13;
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(FocusTargetNode focusTargetNode) {
            return Boolean.valueOf(focusTargetNode.hkdspvbjdz(this.f6257zdlpuopuiu));
        }
    }

    public static /* synthetic */ boolean lqeggnwhkg(wflxmlrfwp wflxmlrfwpVar, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i13 = wkgbmnqykc.f6266zoijcleaow.zoijcleaow();
        }
        return wflxmlrfwpVar.gxszxtbevo(i13);
    }

    public final ipoelvxyzq.ppxfxbqfkf eablkybsjg() {
        return this.f6256iobyxmoadg;
    }

    public final boolean gxszxtbevo(int i13) {
        return wkgbmnqykc(new zoijcleaow(i13));
    }

    public final boolean wkgbmnqykc(tg.draadjrbmk draadjrbmkVar) {
        iobyxmoadg iobyxmoadgVar = f6255zoijcleaow;
        if (this == iobyxmoadgVar.zoijcleaow()) {
            throw new IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
        }
        if (this == iobyxmoadgVar.iobyxmoadg()) {
            throw new IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
        }
        if (this.f6256iobyxmoadg.draadjrbmk() == 0) {
            System.out.println((Object) "FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
            return false;
        }
        ipoelvxyzq.ppxfxbqfkf ppxfxbqfkfVar = this.f6256iobyxmoadg;
        Object[] objArr = ppxfxbqfkfVar.f49169zdlpuopuiu;
        int iDraadjrbmk = ppxfxbqfkfVar.draadjrbmk();
        boolean z13 = false;
        for (int i13 = 0; i13 < iDraadjrbmk; i13++) {
            f.agtfadlqog agtfadlqogVar = (f.agtfadlqog) objArr[i13];
            int iIobyxmoadg = rlfsiqarku.iobyxmoadg(UserVerificationMethods.USER_VERIFY_ALL);
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
                                    FocusTargetNode focusTargetNode = (FocusTargetNode) ppxfxbqfkfVarDxjokdxxww;
                                    if (focusTargetNode.M0().lqeggnwhkg() ? ((Boolean) draadjrbmkVar.invoke(focusTargetNode)).booleanValue() : cqumvgiudr.gtknphoqwx(focusTargetNode, wkgbmnqykc.f6266zoijcleaow.zoijcleaow(), draadjrbmkVar)) {
                                        z13 = true;
                                        break;
                                    }
                                } else if (((ppxfxbqfkfVarDxjokdxxww.i0() & iIobyxmoadg) != 0) && (ppxfxbqfkfVarDxjokdxxww instanceof z.wflxmlrfwp)) {
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
        }
        return z13;
    }
}
