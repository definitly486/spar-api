package f;

import androidx.compose.ui.focus.FocusTargetNode;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import z.rlfsiqarku;

/* JADX INFO: loaded from: classes.dex */
public abstract class draadjrbmk {
    public static final void iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
        int iIobyxmoadg = rlfsiqarku.iobyxmoadg(UserVerificationMethods.USER_VERIFY_ALL);
        if (!gtknphoqwxVar.wflxmlrfwp().n0()) {
            w.iobyxmoadg.zoijcleaow("visitChildren called on an unattached node");
        }
        ipoelvxyzq.ppxfxbqfkf ppxfxbqfkfVar = new ipoelvxyzq.ppxfxbqfkf(new androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf[16], 0);
        androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf ppxfxbqfkfVarE0 = gtknphoqwxVar.wflxmlrfwp().e0();
        if (ppxfxbqfkfVarE0 == null) {
            z.gtknphoqwx.ppxfxbqfkf(ppxfxbqfkfVar, gtknphoqwxVar.wflxmlrfwp(), false);
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
                                vdvldrhtss.iobyxmoadg((FocusTargetNode) ppxfxbqfkfVarDxjokdxxww);
                            } else if ((ppxfxbqfkfVarDxjokdxxww.i0() & iIobyxmoadg) != 0 && (ppxfxbqfkfVarDxjokdxxww instanceof z.wflxmlrfwp)) {
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
                        break;
                    }
                    ppxfxbqfkfVarDxjokdxxww = ppxfxbqfkfVarDxjokdxxww.e0();
                }
            }
        }
    }
}
