package androidx.compose.ui.focus;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import z.okpsazkaxt;
import z.pkzmftpjix;
import z.rlfsiqarku;

/* JADX INFO: loaded from: classes.dex */
public abstract class iobyxmoadg {
    public static final Object iobyxmoadg(FocusTargetNode focusTargetNode, int i13, tg.draadjrbmk draadjrbmkVar) {
        androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf ppxfxbqfkfVarDxjokdxxww;
        x.ppxfxbqfkf ppxfxbqfkfVarN0;
        int iPpxfxbqfkf;
        okpsazkaxt okpsazkaxtVarWeqkydbzbr;
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
                                int i14 = 0;
                                for (androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf ppxfxbqfkfVarI0 = ((z.wflxmlrfwp) ppxfxbqfkfVarDxjokdxxww).I0(); ppxfxbqfkfVarI0 != null; ppxfxbqfkfVarI0 = ppxfxbqfkfVarI0.e0()) {
                                    if ((ppxfxbqfkfVarI0.i0() & iIobyxmoadg) != 0) {
                                        i14++;
                                        if (i14 == 1) {
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
                                if (i14 == 1) {
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
        if ((focusTargetNode2 != null && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(focusTargetNode2.N0(), focusTargetNode.N0())) || (ppxfxbqfkfVarN0 = focusTargetNode.N0()) == null) {
            return null;
        }
        wkgbmnqykc.iobyxmoadg iobyxmoadgVar = wkgbmnqykc.f6266zoijcleaow;
        if (wkgbmnqykc.draadjrbmk(i13, iobyxmoadgVar.nufgyqmvbu())) {
            iPpxfxbqfkf = x.ppxfxbqfkf.zoijcleaow.f120854iobyxmoadg.iobyxmoadg();
        } else if (wkgbmnqykc.draadjrbmk(i13, iobyxmoadgVar.iobyxmoadg())) {
            iPpxfxbqfkf = x.ppxfxbqfkf.zoijcleaow.f120854iobyxmoadg.wkgbmnqykc();
        } else if (wkgbmnqykc.draadjrbmk(i13, iobyxmoadgVar.wkgbmnqykc())) {
            iPpxfxbqfkf = x.ppxfxbqfkf.zoijcleaow.f120854iobyxmoadg.eablkybsjg();
        } else if (wkgbmnqykc.draadjrbmk(i13, iobyxmoadgVar.lqeggnwhkg())) {
            iPpxfxbqfkf = x.ppxfxbqfkf.zoijcleaow.f120854iobyxmoadg.gxszxtbevo();
        } else if (wkgbmnqykc.draadjrbmk(i13, iobyxmoadgVar.eablkybsjg())) {
            iPpxfxbqfkf = x.ppxfxbqfkf.zoijcleaow.f120854iobyxmoadg.zoijcleaow();
        } else {
            if (!wkgbmnqykc.draadjrbmk(i13, iobyxmoadgVar.gxszxtbevo())) {
                throw new IllegalStateException("Unsupported direction for beyond bounds layout");
            }
            iPpxfxbqfkf = x.ppxfxbqfkf.zoijcleaow.f120854iobyxmoadg.ppxfxbqfkf();
        }
        return ppxfxbqfkfVarN0.T(iPpxfxbqfkf, draadjrbmkVar);
    }
}
