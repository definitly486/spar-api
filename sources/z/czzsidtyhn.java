package z;

import androidx.compose.ui.focus.FocusTargetNode;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;

/* JADX INFO: loaded from: classes.dex */
public abstract class czzsidtyhn {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final androidx.collection.hcddaimhww f126965iobyxmoadg = androidx.collection.tzroggbefp.zoijcleaow();

    private static final boolean btonecajqb(f.gtknphoqwx gtknphoqwxVar) {
        eablkybsjg eablkybsjgVar = eablkybsjg.f126983iobyxmoadg;
        eablkybsjgVar.agtfadlqog();
        gtknphoqwxVar.m(eablkybsjgVar);
        return eablkybsjgVar.wflxmlrfwp();
    }

    public static final boolean dxjokdxxww(int i13) {
        return (i13 & rlfsiqarku.iobyxmoadg(UserVerificationMethods.USER_VERIFY_PATTERN)) != 0;
    }

    public static final void eablkybsjg(androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf ppxfxbqfkfVar) {
        if (!ppxfxbqfkfVar.n0()) {
            w.iobyxmoadg.zoijcleaow("autoInvalidateUpdatedNode called on unattached node");
        }
        zoijcleaow(ppxfxbqfkfVar, -1, 0);
    }

    public static final int gxszxtbevo(androidx.compose.ui.wkgbmnqykc.zoijcleaow zoijcleaowVar) {
        int iIobyxmoadg = rlfsiqarku.iobyxmoadg(1);
        if (zoijcleaowVar instanceof x.jyumaefscl) {
            iIobyxmoadg |= rlfsiqarku.iobyxmoadg(2);
        }
        if (zoijcleaowVar instanceof e.lqeggnwhkg) {
            iIobyxmoadg |= rlfsiqarku.iobyxmoadg(4);
        }
        if (zoijcleaowVar instanceof g0.oxmwwwfdhm) {
            iIobyxmoadg |= rlfsiqarku.iobyxmoadg(8);
        }
        if (zoijcleaowVar instanceof t.wwaezpbzkn) {
            iIobyxmoadg |= rlfsiqarku.iobyxmoadg(16);
        }
        if ((zoijcleaowVar instanceof y.wkgbmnqykc) || (zoijcleaowVar instanceof y.btonecajqb)) {
            iIobyxmoadg |= rlfsiqarku.iobyxmoadg(32);
        }
        if (zoijcleaowVar instanceof x.ylkuphrtab) {
            iIobyxmoadg |= rlfsiqarku.iobyxmoadg(UserVerificationMethods.USER_VERIFY_HANDPRINT);
        }
        if (zoijcleaowVar instanceof x.pkzmftpjix) {
            iIobyxmoadg |= rlfsiqarku.iobyxmoadg(64);
        }
        return zoijcleaowVar instanceof d0.iobyxmoadg ? iIobyxmoadg | rlfsiqarku.iobyxmoadg(524288) : iIobyxmoadg;
    }

    public static final void iobyxmoadg(androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf ppxfxbqfkfVar) {
        if (!ppxfxbqfkfVar.n0()) {
            w.iobyxmoadg.zoijcleaow("autoInvalidateInsertedNode called on unattached node");
        }
        zoijcleaow(ppxfxbqfkfVar, -1, 1);
    }

    public static final int lqeggnwhkg(androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf ppxfxbqfkfVar) {
        if (ppxfxbqfkfVar.i0() != 0) {
            return ppxfxbqfkfVar.i0();
        }
        androidx.collection.hcddaimhww hcddaimhwwVar = f126965iobyxmoadg;
        Object objZoijcleaow = a.wkgbmnqykc.zoijcleaow(ppxfxbqfkfVar);
        int iZoijcleaow = hcddaimhwwVar.zoijcleaow(objZoijcleaow);
        if (iZoijcleaow >= 0) {
            return hcddaimhwwVar.f4327ppxfxbqfkf[iZoijcleaow];
        }
        int iIobyxmoadg = rlfsiqarku.iobyxmoadg(1);
        if (ppxfxbqfkfVar instanceof yadqdtsiqt) {
            iIobyxmoadg |= rlfsiqarku.iobyxmoadg(2);
        }
        if (ppxfxbqfkfVar instanceof zdlpuopuiu) {
            iIobyxmoadg |= rlfsiqarku.iobyxmoadg(4);
        }
        if (ppxfxbqfkfVar instanceof iwxlajgraz) {
            iIobyxmoadg |= rlfsiqarku.iobyxmoadg(8);
        }
        if (ppxfxbqfkfVar instanceof tbqsvytpvh) {
            iIobyxmoadg |= rlfsiqarku.iobyxmoadg(16);
        }
        if (ppxfxbqfkfVar instanceof y.nufgyqmvbu) {
            iIobyxmoadg |= rlfsiqarku.iobyxmoadg(32);
        }
        if (ppxfxbqfkfVar instanceof lrnfpwlwnk) {
            iIobyxmoadg |= rlfsiqarku.iobyxmoadg(64);
        }
        if (ppxfxbqfkfVar instanceof cdpycssgdh) {
            iIobyxmoadg |= rlfsiqarku.iobyxmoadg(UserVerificationMethods.USER_VERIFY_PATTERN);
        }
        if (ppxfxbqfkfVar instanceof jyumaefscl) {
            iIobyxmoadg |= rlfsiqarku.iobyxmoadg(UserVerificationMethods.USER_VERIFY_HANDPRINT);
        }
        if (ppxfxbqfkfVar instanceof FocusTargetNode) {
            iIobyxmoadg |= rlfsiqarku.iobyxmoadg(UserVerificationMethods.USER_VERIFY_ALL);
        }
        if (ppxfxbqfkfVar instanceof f.gtknphoqwx) {
            iIobyxmoadg |= rlfsiqarku.iobyxmoadg(2048);
        }
        if (ppxfxbqfkfVar instanceof f.wkgbmnqykc) {
            iIobyxmoadg |= rlfsiqarku.iobyxmoadg(4096);
        }
        if (ppxfxbqfkfVar instanceof r.eablkybsjg) {
            iIobyxmoadg |= rlfsiqarku.iobyxmoadg(8192);
        }
        if (ppxfxbqfkfVar instanceof v.iobyxmoadg) {
            iIobyxmoadg |= rlfsiqarku.iobyxmoadg(16384);
        }
        if (ppxfxbqfkfVar instanceof nufgyqmvbu) {
            iIobyxmoadg |= rlfsiqarku.iobyxmoadg(32768);
        }
        if (ppxfxbqfkfVar instanceof ageimvtcrz) {
            iIobyxmoadg |= rlfsiqarku.iobyxmoadg(262144);
        }
        int iIobyxmoadg2 = ppxfxbqfkfVar instanceof d0.iobyxmoadg ? rlfsiqarku.iobyxmoadg(524288) | iIobyxmoadg : iIobyxmoadg;
        hcddaimhwwVar.yggfygwlhe(objZoijcleaow, iIobyxmoadg2);
        return iIobyxmoadg2;
    }

    public static final int nufgyqmvbu(androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf ppxfxbqfkfVar) {
        if (!(ppxfxbqfkfVar instanceof wflxmlrfwp)) {
            return lqeggnwhkg(ppxfxbqfkfVar);
        }
        wflxmlrfwp wflxmlrfwpVar = (wflxmlrfwp) ppxfxbqfkfVar;
        int iJ0 = wflxmlrfwpVar.J0();
        for (androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf ppxfxbqfkfVarI0 = wflxmlrfwpVar.I0(); ppxfxbqfkfVarI0 != null; ppxfxbqfkfVarI0 = ppxfxbqfkfVarI0.e0()) {
            iJ0 |= nufgyqmvbu(ppxfxbqfkfVarI0);
        }
        return iJ0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void ppxfxbqfkf(androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf ppxfxbqfkfVar, int i13, int i14) {
        if (i14 != 0 || ppxfxbqfkfVar.l0()) {
            if ((rlfsiqarku.iobyxmoadg(2) & i13) != 0 && (ppxfxbqfkfVar instanceof yadqdtsiqt)) {
                wwaezpbzkn.zoijcleaow((yadqdtsiqt) ppxfxbqfkfVar);
                if (i14 == 2) {
                    gtknphoqwx.gtknphoqwx(ppxfxbqfkfVar, rlfsiqarku.iobyxmoadg(2)).r1();
                }
            }
            if ((rlfsiqarku.iobyxmoadg(UserVerificationMethods.USER_VERIFY_PATTERN) & i13) != 0 && (ppxfxbqfkfVar instanceof cdpycssgdh) && i14 != 2) {
                gtknphoqwx.rgvfuqvkyq(ppxfxbqfkfVar).fmlbqenlif();
            }
            if ((rlfsiqarku.iobyxmoadg(UserVerificationMethods.USER_VERIFY_HANDPRINT) & i13) != 0 && (ppxfxbqfkfVar instanceof jyumaefscl)) {
                if (i14 == 1) {
                    pkzmftpjix pkzmftpjixVarRgvfuqvkyq = gtknphoqwx.rgvfuqvkyq(ppxfxbqfkfVar);
                    pkzmftpjixVarRgvfuqvkyq.U(pkzmftpjixVarRgvfuqvkyq.ntlheqmsrt() + 1);
                } else if (i14 == 2) {
                    pkzmftpjix pkzmftpjixVarRgvfuqvkyq2 = gtknphoqwx.rgvfuqvkyq(ppxfxbqfkfVar);
                    pkzmftpjixVarRgvfuqvkyq2.U(pkzmftpjixVarRgvfuqvkyq2.ntlheqmsrt() - 1);
                }
                if (i14 != 2) {
                    gtknphoqwx.rgvfuqvkyq(ppxfxbqfkfVar).rhgxfdycjh();
                }
            }
            if ((rlfsiqarku.iobyxmoadg(4) & i13) != 0 && (ppxfxbqfkfVar instanceof zdlpuopuiu)) {
                yggfygwlhe.iobyxmoadg((zdlpuopuiu) ppxfxbqfkfVar);
            }
            if ((rlfsiqarku.iobyxmoadg(8) & i13) != 0 && (ppxfxbqfkfVar instanceof iwxlajgraz)) {
                gtknphoqwx.rgvfuqvkyq(ppxfxbqfkfVar).h0(true);
            }
            if ((rlfsiqarku.iobyxmoadg(64) & i13) != 0 && (ppxfxbqfkfVar instanceof lrnfpwlwnk)) {
                zeieaojujs.iobyxmoadg((lrnfpwlwnk) ppxfxbqfkfVar);
            }
            if ((rlfsiqarku.iobyxmoadg(2048) & i13) != 0 && (ppxfxbqfkfVar instanceof f.gtknphoqwx)) {
                f.gtknphoqwx gtknphoqwxVar = (f.gtknphoqwx) ppxfxbqfkfVar;
                if (btonecajqb(gtknphoqwxVar)) {
                    f.draadjrbmk.iobyxmoadg(gtknphoqwxVar);
                }
            }
            if ((i13 & rlfsiqarku.iobyxmoadg(4096)) == 0 || !(ppxfxbqfkfVar instanceof f.wkgbmnqykc)) {
                return;
            }
            f.eablkybsjg.iobyxmoadg((f.wkgbmnqykc) ppxfxbqfkfVar);
        }
    }

    public static final void wkgbmnqykc(androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf ppxfxbqfkfVar) {
        if (!ppxfxbqfkfVar.n0()) {
            w.iobyxmoadg.zoijcleaow("autoInvalidateRemovedNode called on unattached node");
        }
        zoijcleaow(ppxfxbqfkfVar, -1, 2);
    }

    public static final void zoijcleaow(androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf ppxfxbqfkfVar, int i13, int i14) {
        if (!(ppxfxbqfkfVar instanceof wflxmlrfwp)) {
            ppxfxbqfkf(ppxfxbqfkfVar, i13 & ppxfxbqfkfVar.i0(), i14);
            return;
        }
        wflxmlrfwp wflxmlrfwpVar = (wflxmlrfwp) ppxfxbqfkfVar;
        ppxfxbqfkf(ppxfxbqfkfVar, wflxmlrfwpVar.J0() & i13, i14);
        int i15 = (~wflxmlrfwpVar.J0()) & i13;
        for (androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf ppxfxbqfkfVarI0 = wflxmlrfwpVar.I0(); ppxfxbqfkfVarI0 != null; ppxfxbqfkfVarI0 = ppxfxbqfkfVarI0.e0()) {
            zoijcleaow(ppxfxbqfkfVarI0, i15, i14);
        }
    }
}
