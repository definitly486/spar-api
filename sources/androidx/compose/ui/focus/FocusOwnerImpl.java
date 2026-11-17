package androidx.compose.ui.focus;

import android.os.Trace;
import android.view.KeyEvent;
import androidx.collection.jpowsppfya;
import androidx.collection.pkzmftpjix;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import gg.wwaezpbzkn;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.hkdspvbjdz;
import z.okpsazkaxt;
import z.opjhrmiecq;
import z.ribwqtqdhb;
import z.rlfsiqarku;

/* JADX INFO: loaded from: classes.dex */
public final class FocusOwnerImpl implements f.btonecajqb {

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private boolean f6183dxjokdxxww;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private pkzmftpjix f6185gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final f.oxmwwwfdhm f6186iobyxmoadg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private FocusTargetNode f6188nufgyqmvbu;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final f.gxszxtbevo f6190wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final opjhrmiecq f6191zoijcleaow;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private FocusTargetNode f6189ppxfxbqfkf = new FocusTargetNode(yggfygwlhe.f6268iobyxmoadg.zoijcleaow(), null, null, 6, null);

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final androidx.compose.ui.wkgbmnqykc f6184eablkybsjg = new ribwqtqdhb() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$modifier$1
        public boolean equals(Object other) {
            return other == this;
        }

        public int hashCode() {
            return this.f6193zoijcleaow.esjtqupxsv().hashCode();
        }

        @Override // z.ribwqtqdhb
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public void draadjrbmk(FocusTargetNode node) {
        }

        @Override // z.ribwqtqdhb
        /* JADX INFO: renamed from: wflxmlrfwp, reason: merged with bridge method [inline-methods] */
        public FocusTargetNode getNode() {
            return this.f6193zoijcleaow.esjtqupxsv();
        }
    };

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final jpowsppfya f6187lqeggnwhkg = new jpowsppfya(1);

    public /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f6192iobyxmoadg;

        static {
            int[] iArr = new int[f.zoijcleaow.values().length];
            try {
                iArr[f.zoijcleaow.Redirected.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[f.zoijcleaow.Cancelled.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[f.zoijcleaow.RedirectCancelled.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[f.zoijcleaow.None.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f6192iobyxmoadg = iArr;
        }
    }

    static final class ppxfxbqfkf extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ int f6194yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ hkdspvbjdz f6195zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ppxfxbqfkf(hkdspvbjdz hkdspvbjdzVar, int i13) {
            super(1);
            this.f6195zdlpuopuiu = hkdspvbjdzVar;
            this.f6194yggfygwlhe = i13;
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(FocusTargetNode focusTargetNode) {
            this.f6195zdlpuopuiu.f60015zdlpuopuiu = Boolean.valueOf(focusTargetNode.hkdspvbjdz(this.f6194yggfygwlhe));
            return (Boolean) this.f6195zdlpuopuiu.f60015zdlpuopuiu;
        }
    }

    static final class wkgbmnqykc extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ int f6196zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        wkgbmnqykc(int i13) {
            super(1);
            this.f6196zdlpuopuiu = i13;
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(FocusTargetNode focusTargetNode) {
            return Boolean.valueOf(focusTargetNode.hkdspvbjdz(this.f6196zdlpuopuiu));
        }
    }

    static final class zoijcleaow extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ tg.draadjrbmk f6197jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ FocusOwnerImpl f6198yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ FocusTargetNode f6199zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zoijcleaow(FocusTargetNode focusTargetNode, FocusOwnerImpl focusOwnerImpl, tg.draadjrbmk draadjrbmkVar) {
            super(1);
            this.f6199zdlpuopuiu = focusTargetNode;
            this.f6198yggfygwlhe = focusOwnerImpl;
            this.f6197jyumaefscl = draadjrbmkVar;
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(FocusTargetNode focusTargetNode) {
            boolean zBooleanValue;
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(focusTargetNode, this.f6199zdlpuopuiu)) {
                zBooleanValue = false;
            } else {
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(focusTargetNode, this.f6198yggfygwlhe.esjtqupxsv())) {
                    throw new IllegalStateException("Focus search landed at the root.");
                }
                zBooleanValue = ((Boolean) this.f6197jyumaefscl.invoke(focusTargetNode)).booleanValue();
            }
            return Boolean.valueOf(zBooleanValue);
        }
    }

    public FocusOwnerImpl(f.oxmwwwfdhm oxmwwwfdhmVar, opjhrmiecq opjhrmiecqVar) {
        this.f6186iobyxmoadg = oxmwwwfdhmVar;
        this.f6191zoijcleaow = opjhrmiecqVar;
        this.f6190wkgbmnqykc = new f.gxszxtbevo(this, opjhrmiecqVar);
    }

    private final FocusTargetNode cqumvgiudr() {
        return zdlpuopuiu.zoijcleaow(this.f6189ppxfxbqfkf);
    }

    private final boolean istkbnxepw(KeyEvent keyEvent) {
        long jIobyxmoadg = r.wkgbmnqykc.iobyxmoadg(keyEvent);
        int iZoijcleaow = r.wkgbmnqykc.zoijcleaow(keyEvent);
        r.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar = r.ppxfxbqfkf.f81321iobyxmoadg;
        if (r.ppxfxbqfkf.eablkybsjg(iZoijcleaow, iobyxmoadgVar.iobyxmoadg())) {
            pkzmftpjix pkzmftpjixVar = this.f6185gxszxtbevo;
            if (pkzmftpjixVar == null) {
                pkzmftpjixVar = new pkzmftpjix(3);
                this.f6185gxszxtbevo = pkzmftpjixVar;
            }
            pkzmftpjixVar.draadjrbmk(jIobyxmoadg);
        } else if (r.ppxfxbqfkf.eablkybsjg(iZoijcleaow, iobyxmoadgVar.zoijcleaow())) {
            pkzmftpjix pkzmftpjixVar2 = this.f6185gxszxtbevo;
            if (pkzmftpjixVar2 == null || !pkzmftpjixVar2.iobyxmoadg(jIobyxmoadg)) {
                return false;
            }
            pkzmftpjix pkzmftpjixVar3 = this.f6185gxszxtbevo;
            if (pkzmftpjixVar3 != null) {
                pkzmftpjixVar3.wflxmlrfwp(jIobyxmoadg);
            }
        }
        return true;
    }

    private final boolean iwizpuwonk(boolean z13, boolean z14) {
        okpsazkaxt okpsazkaxtVarWeqkydbzbr;
        if (nufgyqmvbu() == null) {
            return true;
        }
        if (ojitshcjhn() && !z13) {
            return false;
        }
        FocusTargetNode focusTargetNodeNufgyqmvbu = nufgyqmvbu();
        oxmwwwfdhm(null);
        if (z14 && focusTargetNodeNufgyqmvbu != null) {
            focusTargetNodeNufgyqmvbu.L0(ojitshcjhn() ? f.rgvfuqvkyq.Captured : f.rgvfuqvkyq.Active, f.rgvfuqvkyq.Inactive);
            int iIobyxmoadg = rlfsiqarku.iobyxmoadg(UserVerificationMethods.USER_VERIFY_ALL);
            if (!focusTargetNodeNufgyqmvbu.wflxmlrfwp().n0()) {
                w.iobyxmoadg.zoijcleaow("visitAncestors called on an unattached node");
            }
            androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf ppxfxbqfkfVarK0 = focusTargetNodeNufgyqmvbu.wflxmlrfwp().k0();
            z.pkzmftpjix pkzmftpjixVarRgvfuqvkyq = z.gtknphoqwx.rgvfuqvkyq(focusTargetNodeNufgyqmvbu);
            while (pkzmftpjixVarRgvfuqvkyq != null) {
                if ((pkzmftpjixVarRgvfuqvkyq.weqkydbzbr().gtknphoqwx().d0() & iIobyxmoadg) != 0) {
                    while (ppxfxbqfkfVarK0 != null) {
                        if ((ppxfxbqfkfVarK0.i0() & iIobyxmoadg) != 0) {
                            ipoelvxyzq.ppxfxbqfkf ppxfxbqfkfVar = null;
                            androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf ppxfxbqfkfVarDxjokdxxww = ppxfxbqfkfVarK0;
                            while (ppxfxbqfkfVarDxjokdxxww != null) {
                                if (ppxfxbqfkfVarDxjokdxxww instanceof FocusTargetNode) {
                                    ((FocusTargetNode) ppxfxbqfkfVarDxjokdxxww).L0(f.rgvfuqvkyq.ActiveParent, f.rgvfuqvkyq.Inactive);
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
        }
        return true;
    }

    private final androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf lereixgezr(z.btonecajqb btonecajqbVar) {
        int iIobyxmoadg = rlfsiqarku.iobyxmoadg(UserVerificationMethods.USER_VERIFY_ALL) | rlfsiqarku.iobyxmoadg(8192);
        if (!btonecajqbVar.wflxmlrfwp().n0()) {
            w.iobyxmoadg.zoijcleaow("visitLocalDescendants called on an unattached node");
        }
        androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf ppxfxbqfkfVarWflxmlrfwp = btonecajqbVar.wflxmlrfwp();
        androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf ppxfxbqfkfVar = null;
        if ((ppxfxbqfkfVarWflxmlrfwp.d0() & iIobyxmoadg) != 0) {
            for (androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf ppxfxbqfkfVarE0 = ppxfxbqfkfVarWflxmlrfwp.e0(); ppxfxbqfkfVarE0 != null; ppxfxbqfkfVarE0 = ppxfxbqfkfVarE0.e0()) {
                if ((ppxfxbqfkfVarE0.i0() & iIobyxmoadg) != 0) {
                    if ((rlfsiqarku.iobyxmoadg(UserVerificationMethods.USER_VERIFY_ALL) & ppxfxbqfkfVarE0.i0()) != 0) {
                        return ppxfxbqfkfVar;
                    }
                    ppxfxbqfkfVar = ppxfxbqfkfVarE0;
                }
            }
        }
        return ppxfxbqfkfVar;
    }

    @Override // f.btonecajqb
    public Boolean btonecajqb(int i13, g.lqeggnwhkg lqeggnwhkgVar, tg.draadjrbmk draadjrbmkVar) {
        FocusTargetNode focusTargetNodeCqumvgiudr = cqumvgiudr();
        if (focusTargetNodeCqumvgiudr != null) {
            wflxmlrfwp wflxmlrfwpVarIobyxmoadg = zdlpuopuiu.iobyxmoadg(focusTargetNodeCqumvgiudr, i13, this.f6191zoijcleaow.getLayoutDirection());
            wflxmlrfwp.iobyxmoadg iobyxmoadgVar = wflxmlrfwp.f6255zoijcleaow;
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wflxmlrfwpVarIobyxmoadg, iobyxmoadgVar.iobyxmoadg())) {
                return null;
            }
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wflxmlrfwpVarIobyxmoadg, iobyxmoadgVar.ppxfxbqfkf())) {
                FocusTargetNode focusTargetNodeCqumvgiudr2 = cqumvgiudr();
                if (focusTargetNodeCqumvgiudr2 != null) {
                    return (Boolean) draadjrbmkVar.invoke(focusTargetNodeCqumvgiudr2);
                }
                return null;
            }
            if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wflxmlrfwpVarIobyxmoadg, iobyxmoadgVar.zoijcleaow())) {
                return Boolean.valueOf(wflxmlrfwpVarIobyxmoadg.wkgbmnqykc(draadjrbmkVar));
            }
        } else {
            focusTargetNodeCqumvgiudr = null;
        }
        return zdlpuopuiu.eablkybsjg(this.f6189ppxfxbqfkf, i13, this.f6191zoijcleaow.getLayoutDirection(), lqeggnwhkgVar, new zoijcleaow(focusTargetNodeCqumvgiudr, this, draadjrbmkVar));
    }

    @Override // f.btonecajqb
    public void draadjrbmk() {
        this.f6190wkgbmnqykc.eablkybsjg();
    }

    @Override // f.btonecajqb
    public void dxjokdxxww(f.wkgbmnqykc wkgbmnqykcVar) {
        this.f6190wkgbmnqykc.lqeggnwhkg(wkgbmnqykcVar);
    }

    @Override // f.nufgyqmvbu
    public boolean eablkybsjg(int i13) {
        if (a.nufgyqmvbu.f65wkgbmnqykc && this.f6186iobyxmoadg.wkgbmnqykc(i13)) {
            return true;
        }
        hkdspvbjdz hkdspvbjdzVar = new hkdspvbjdz();
        hkdspvbjdzVar.f60015zdlpuopuiu = Boolean.FALSE;
        FocusTargetNode focusTargetNodeNufgyqmvbu = nufgyqmvbu();
        Boolean boolBtonecajqb = btonecajqb(i13, this.f6186iobyxmoadg.getEmbeddedViewFocusRect(), new ppxfxbqfkf(hkdspvbjdzVar, i13));
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(boolBtonecajqb, Boolean.TRUE) && focusTargetNodeNufgyqmvbu != nufgyqmvbu()) {
            return true;
        }
        if (boolBtonecajqb == null || hkdspvbjdzVar.f60015zdlpuopuiu == null) {
            return false;
        }
        if (boolBtonecajqb.booleanValue() && ((Boolean) hkdspvbjdzVar.f60015zdlpuopuiu).booleanValue()) {
            return true;
        }
        if (nufgyqmvbu.iobyxmoadg(i13)) {
            return rgvfuqvkyq(false, true, false, i13) && zynmafqrjb(i13, null);
        }
        return !a.nufgyqmvbu.f65wkgbmnqykc && this.f6186iobyxmoadg.wkgbmnqykc(i13);
    }

    public final FocusTargetNode esjtqupxsv() {
        return this.f6189ppxfxbqfkf;
    }

    @Override // f.btonecajqb
    public g.lqeggnwhkg getFocusRect() {
        FocusTargetNode focusTargetNodeCqumvgiudr = cqumvgiudr();
        if (focusTargetNodeCqumvgiudr != null) {
            return zdlpuopuiu.wkgbmnqykc(focusTargetNodeCqumvgiudr);
        }
        return null;
    }

    @Override // f.btonecajqb
    public void gtknphoqwx(FocusTargetNode focusTargetNode) {
        this.f6190wkgbmnqykc.gxszxtbevo(focusTargetNode);
    }

    @Override // f.btonecajqb
    public boolean gxszxtbevo(KeyEvent keyEvent) {
        okpsazkaxt okpsazkaxtVarWeqkydbzbr;
        if (this.f6190wkgbmnqykc.zoijcleaow()) {
            System.out.println((Object) "FocusRelatedWarning: Dispatching intercepted soft keyboard event while the focus system is invalidated.");
            return false;
        }
        FocusTargetNode focusTargetNodeZoijcleaow = zdlpuopuiu.zoijcleaow(this.f6189ppxfxbqfkf);
        if (focusTargetNodeZoijcleaow != null) {
            int iIobyxmoadg = rlfsiqarku.iobyxmoadg(131072);
            if (!focusTargetNodeZoijcleaow.wflxmlrfwp().n0()) {
                w.iobyxmoadg.zoijcleaow("visitAncestors called on an unattached node");
            }
            androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf ppxfxbqfkfVarWflxmlrfwp = focusTargetNodeZoijcleaow.wflxmlrfwp();
            z.pkzmftpjix pkzmftpjixVarRgvfuqvkyq = z.gtknphoqwx.rgvfuqvkyq(focusTargetNodeZoijcleaow);
            while (pkzmftpjixVarRgvfuqvkyq != null) {
                if ((pkzmftpjixVarRgvfuqvkyq.weqkydbzbr().gtknphoqwx().d0() & iIobyxmoadg) != 0) {
                    while (ppxfxbqfkfVarWflxmlrfwp != null) {
                        if ((ppxfxbqfkfVarWflxmlrfwp.i0() & iIobyxmoadg) != 0) {
                            androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf ppxfxbqfkfVarDxjokdxxww = ppxfxbqfkfVarWflxmlrfwp;
                            ipoelvxyzq.ppxfxbqfkf ppxfxbqfkfVar = null;
                            while (ppxfxbqfkfVarDxjokdxxww != null) {
                                if ((ppxfxbqfkfVarDxjokdxxww.i0() & iIobyxmoadg) != 0 && (ppxfxbqfkfVarDxjokdxxww instanceof z.wflxmlrfwp)) {
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
                        ppxfxbqfkfVarWflxmlrfwp = ppxfxbqfkfVarWflxmlrfwp.k0();
                    }
                }
                pkzmftpjixVarRgvfuqvkyq = pkzmftpjixVarRgvfuqvkyq.auzgnhcxok();
                ppxfxbqfkfVarWflxmlrfwp = (pkzmftpjixVarRgvfuqvkyq == null || (okpsazkaxtVarWeqkydbzbr = pkzmftpjixVarRgvfuqvkyq.weqkydbzbr()) == null) ? null : okpsazkaxtVarWeqkydbzbr.ojitshcjhn();
            }
            androidx.appcompat.app.yggfygwlhe.iobyxmoadg(null);
        }
        return false;
    }

    @Override // f.btonecajqb
    public boolean iobyxmoadg(androidx.compose.ui.focus.wkgbmnqykc wkgbmnqykcVar, g.lqeggnwhkg lqeggnwhkgVar) {
        return this.f6186iobyxmoadg.iobyxmoadg(wkgbmnqykcVar, lqeggnwhkgVar);
    }

    @Override // f.nufgyqmvbu
    public void jyumaefscl(boolean z13) {
        rgvfuqvkyq(z13, true, true, androidx.compose.ui.focus.wkgbmnqykc.f6266zoijcleaow.ppxfxbqfkf());
    }

    @Override // f.btonecajqb
    public void kcexrzcfyt() {
        kcexrzcfyt.zoijcleaow(this.f6189ppxfxbqfkf, true, true);
    }

    @Override // f.btonecajqb
    public FocusTargetNode nufgyqmvbu() {
        return this.f6188nufgyqmvbu;
    }

    @Override // f.btonecajqb
    public boolean ojitshcjhn() {
        return this.f6183dxjokdxxww;
    }

    @Override // f.btonecajqb
    public void oxmwwwfdhm(FocusTargetNode focusTargetNode) {
        FocusTargetNode focusTargetNode2 = this.f6188nufgyqmvbu;
        this.f6188nufgyqmvbu = focusTargetNode;
        if (focusTargetNode == null || focusTargetNode2 != focusTargetNode) {
            pmvmpeiblj(false);
        }
        if (a.nufgyqmvbu.f63ppxfxbqfkf) {
            jpowsppfya jpowsppfyaVarZdlpuopuiu = zdlpuopuiu();
            Object[] objArr = jpowsppfyaVarZdlpuopuiu.f4343iobyxmoadg;
            int i13 = jpowsppfyaVarZdlpuopuiu.f4344zoijcleaow;
            for (int i14 = 0; i14 < i13; i14++) {
                ((f.lqeggnwhkg) objArr[i14]).zoijcleaow(focusTargetNode2, focusTargetNode);
            }
        }
    }

    public void pmvmpeiblj(boolean z13) {
        if (!((z13 && nufgyqmvbu() == null) ? false : true)) {
            w.iobyxmoadg.iobyxmoadg("Cannot capture focus when the active focus target node is unset");
        }
        this.f6183dxjokdxxww = z13;
    }

    @Override // f.btonecajqb
    public boolean ppxfxbqfkf(q.ppxfxbqfkf ppxfxbqfkfVar, tg.iobyxmoadg iobyxmoadgVar) {
        okpsazkaxt okpsazkaxtVarWeqkydbzbr;
        if (this.f6190wkgbmnqykc.zoijcleaow()) {
            System.out.println((Object) "FocusRelatedWarning: Dispatching indirect touch event while the focus system is invalidated.");
            return false;
        }
        FocusTargetNode focusTargetNodeCqumvgiudr = cqumvgiudr();
        if (focusTargetNodeCqumvgiudr != null) {
            int iIobyxmoadg = rlfsiqarku.iobyxmoadg(2097152);
            if (!focusTargetNodeCqumvgiudr.wflxmlrfwp().n0()) {
                w.iobyxmoadg.zoijcleaow("visitAncestors called on an unattached node");
            }
            androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf ppxfxbqfkfVarWflxmlrfwp = focusTargetNodeCqumvgiudr.wflxmlrfwp();
            z.pkzmftpjix pkzmftpjixVarRgvfuqvkyq = z.gtknphoqwx.rgvfuqvkyq(focusTargetNodeCqumvgiudr);
            while (pkzmftpjixVarRgvfuqvkyq != null) {
                if ((pkzmftpjixVarRgvfuqvkyq.weqkydbzbr().gtknphoqwx().d0() & iIobyxmoadg) != 0) {
                    while (ppxfxbqfkfVarWflxmlrfwp != null) {
                        if ((ppxfxbqfkfVarWflxmlrfwp.i0() & iIobyxmoadg) != 0) {
                            androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf ppxfxbqfkfVarDxjokdxxww = ppxfxbqfkfVarWflxmlrfwp;
                            ipoelvxyzq.ppxfxbqfkf ppxfxbqfkfVar2 = null;
                            while (ppxfxbqfkfVarDxjokdxxww != null) {
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
                        ppxfxbqfkfVarWflxmlrfwp = ppxfxbqfkfVarWflxmlrfwp.k0();
                    }
                }
                pkzmftpjixVarRgvfuqvkyq = pkzmftpjixVarRgvfuqvkyq.auzgnhcxok();
                ppxfxbqfkfVarWflxmlrfwp = (pkzmftpjixVarRgvfuqvkyq == null || (okpsazkaxtVarWeqkydbzbr = pkzmftpjixVarRgvfuqvkyq.weqkydbzbr()) == null) ? null : okpsazkaxtVarWeqkydbzbr.ojitshcjhn();
            }
            androidx.appcompat.app.yggfygwlhe.iobyxmoadg(null);
        }
        return false;
    }

    @Override // f.btonecajqb
    public boolean rgvfuqvkyq(boolean z13, boolean z14, boolean z15, int i13) {
        boolean zIwizpuwonk;
        if (z13) {
            zIwizpuwonk = iwizpuwonk(z13, z14);
        } else {
            int i14 = iobyxmoadg.f6192iobyxmoadg[kcexrzcfyt.eablkybsjg(this.f6189ppxfxbqfkf, i13).ordinal()];
            if (i14 == 1 || i14 == 2 || i14 == 3) {
                zIwizpuwonk = false;
            } else {
                if (i14 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                zIwizpuwonk = iwizpuwonk(z13, z14);
            }
        }
        if (zIwizpuwonk && z15) {
            zoijcleaow();
        }
        return zIwizpuwonk;
    }

    @Override // f.btonecajqb
    public f.ojitshcjhn vdvldrhtss() {
        return this.f6189ppxfxbqfkf.jlmebxxoox();
    }

    @Override // f.btonecajqb
    public androidx.compose.ui.wkgbmnqykc wflxmlrfwp() {
        return this.f6184eablkybsjg;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16, types: [androidx.compose.ui.wkgbmnqykc$ppxfxbqfkf] */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v18, types: [androidx.compose.ui.wkgbmnqykc$ppxfxbqfkf] */
    /* JADX WARN: Type inference failed for: r11v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r11v25 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v18, types: [ipoelvxyzq.ppxfxbqfkf] */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r12v21, types: [ipoelvxyzq.ppxfxbqfkf] */
    /* JADX WARN: Type inference failed for: r12v23 */
    /* JADX WARN: Type inference failed for: r12v24 */
    /* JADX WARN: Type inference failed for: r12v25 */
    /* JADX WARN: Type inference failed for: r12v26 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r4v10, types: [androidx.compose.ui.wkgbmnqykc$ppxfxbqfkf] */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17, types: [androidx.compose.ui.wkgbmnqykc$ppxfxbqfkf] */
    /* JADX WARN: Type inference failed for: r4v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26, types: [androidx.compose.ui.wkgbmnqykc$ppxfxbqfkf] */
    /* JADX WARN: Type inference failed for: r4v27, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v4, types: [androidx.compose.ui.wkgbmnqykc$ppxfxbqfkf] */
    /* JADX WARN: Type inference failed for: r4v45 */
    /* JADX WARN: Type inference failed for: r4v46 */
    /* JADX WARN: Type inference failed for: r4v47 */
    /* JADX WARN: Type inference failed for: r4v48 */
    /* JADX WARN: Type inference failed for: r4v5, types: [androidx.compose.ui.wkgbmnqykc$ppxfxbqfkf] */
    /* JADX WARN: Type inference failed for: r4v9, types: [androidx.compose.ui.wkgbmnqykc$ppxfxbqfkf] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13, types: [ipoelvxyzq.ppxfxbqfkf] */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16, types: [ipoelvxyzq.ppxfxbqfkf] */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19, types: [ipoelvxyzq.ppxfxbqfkf] */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22, types: [ipoelvxyzq.ppxfxbqfkf] */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    @Override // f.btonecajqb
    public boolean wkgbmnqykc(v.zoijcleaow zoijcleaowVar, tg.iobyxmoadg iobyxmoadgVar) {
        v.iobyxmoadg iobyxmoadgVar2;
        int size;
        okpsazkaxt okpsazkaxtVarWeqkydbzbr;
        ?? Dxjokdxxww;
        okpsazkaxt okpsazkaxtVarWeqkydbzbr2;
        if (this.f6190wkgbmnqykc.zoijcleaow()) {
            System.out.println((Object) "FocusRelatedWarning: Dispatching rotary event while the focus system is invalidated.");
            return false;
        }
        FocusTargetNode focusTargetNodeCqumvgiudr = cqumvgiudr();
        if (focusTargetNodeCqumvgiudr != null) {
            int iIobyxmoadg = rlfsiqarku.iobyxmoadg(16384);
            if (!focusTargetNodeCqumvgiudr.wflxmlrfwp().n0()) {
                w.iobyxmoadg.zoijcleaow("visitAncestors called on an unattached node");
            }
            androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf ppxfxbqfkfVarWflxmlrfwp = focusTargetNodeCqumvgiudr.wflxmlrfwp();
            z.pkzmftpjix pkzmftpjixVarRgvfuqvkyq = z.gtknphoqwx.rgvfuqvkyq(focusTargetNodeCqumvgiudr);
            loop0: while (true) {
                if (pkzmftpjixVarRgvfuqvkyq == null) {
                    Dxjokdxxww = 0;
                    break;
                }
                if ((pkzmftpjixVarRgvfuqvkyq.weqkydbzbr().gtknphoqwx().d0() & iIobyxmoadg) != 0) {
                    while (ppxfxbqfkfVarWflxmlrfwp != null) {
                        if ((ppxfxbqfkfVarWflxmlrfwp.i0() & iIobyxmoadg) != 0) {
                            ?? ppxfxbqfkfVar = 0;
                            Dxjokdxxww = ppxfxbqfkfVarWflxmlrfwp;
                            while (Dxjokdxxww != 0) {
                                if (Dxjokdxxww instanceof v.iobyxmoadg) {
                                    break loop0;
                                }
                                if ((Dxjokdxxww.i0() & iIobyxmoadg) != 0 && (Dxjokdxxww instanceof z.wflxmlrfwp)) {
                                    androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf ppxfxbqfkfVarI0 = ((z.wflxmlrfwp) Dxjokdxxww).I0();
                                    int i13 = 0;
                                    while (ppxfxbqfkfVarI0 != null) {
                                        if ((ppxfxbqfkfVarI0.i0() & iIobyxmoadg) != 0) {
                                            i13++;
                                            if (i13 == 1) {
                                                Dxjokdxxww = Dxjokdxxww;
                                                ppxfxbqfkfVar = ppxfxbqfkfVar;
                                                ppxfxbqfkfVar = ppxfxbqfkfVar;
                                                Dxjokdxxww = ppxfxbqfkfVarI0;
                                            } else {
                                                if (ppxfxbqfkfVar == 0) {
                                                    ppxfxbqfkfVar = new ipoelvxyzq.ppxfxbqfkf(new androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf[16], 0);
                                                }
                                                if (Dxjokdxxww != 0) {
                                                    ppxfxbqfkfVar.zoijcleaow(Dxjokdxxww);
                                                    Dxjokdxxww = 0;
                                                }
                                                ppxfxbqfkfVar.zoijcleaow(ppxfxbqfkfVarI0);
                                            }
                                        } else {
                                            Dxjokdxxww = Dxjokdxxww;
                                            ppxfxbqfkfVar = ppxfxbqfkfVar;
                                        }
                                        ppxfxbqfkfVarI0 = ppxfxbqfkfVarI0.e0();
                                        Dxjokdxxww = Dxjokdxxww;
                                        ppxfxbqfkfVar = ppxfxbqfkfVar;
                                    }
                                    if (i13 == 1) {
                                        Dxjokdxxww = Dxjokdxxww;
                                        ppxfxbqfkfVar = ppxfxbqfkfVar;
                                    } else {
                                        Dxjokdxxww = Dxjokdxxww;
                                        ppxfxbqfkfVar = ppxfxbqfkfVar;
                                    }
                                }
                                Dxjokdxxww = z.gtknphoqwx.dxjokdxxww(ppxfxbqfkfVar);
                            }
                        }
                        ppxfxbqfkfVarWflxmlrfwp = ppxfxbqfkfVarWflxmlrfwp.k0();
                    }
                }
                pkzmftpjixVarRgvfuqvkyq = pkzmftpjixVarRgvfuqvkyq.auzgnhcxok();
                ppxfxbqfkfVarWflxmlrfwp = (pkzmftpjixVarRgvfuqvkyq == null || (okpsazkaxtVarWeqkydbzbr2 = pkzmftpjixVarRgvfuqvkyq.weqkydbzbr()) == null) ? null : okpsazkaxtVarWeqkydbzbr2.ojitshcjhn();
            }
            iobyxmoadgVar2 = (v.iobyxmoadg) Dxjokdxxww;
        } else {
            iobyxmoadgVar2 = null;
        }
        if (iobyxmoadgVar2 != null) {
            int iIobyxmoadg2 = rlfsiqarku.iobyxmoadg(16384);
            if (!iobyxmoadgVar2.wflxmlrfwp().n0()) {
                w.iobyxmoadg.zoijcleaow("visitAncestors called on an unattached node");
            }
            androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf ppxfxbqfkfVarK0 = iobyxmoadgVar2.wflxmlrfwp().k0();
            z.pkzmftpjix pkzmftpjixVarRgvfuqvkyq2 = z.gtknphoqwx.rgvfuqvkyq(iobyxmoadgVar2);
            ArrayList arrayList = null;
            while (pkzmftpjixVarRgvfuqvkyq2 != null) {
                if ((pkzmftpjixVarRgvfuqvkyq2.weqkydbzbr().gtknphoqwx().d0() & iIobyxmoadg2) != 0) {
                    while (ppxfxbqfkfVarK0 != null) {
                        if ((ppxfxbqfkfVarK0.i0() & iIobyxmoadg2) != 0) {
                            androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf ppxfxbqfkfVarDxjokdxxww = ppxfxbqfkfVarK0;
                            ipoelvxyzq.ppxfxbqfkf ppxfxbqfkfVar2 = null;
                            while (ppxfxbqfkfVarDxjokdxxww != null) {
                                if (ppxfxbqfkfVarDxjokdxxww instanceof v.iobyxmoadg) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(ppxfxbqfkfVarDxjokdxxww);
                                } else if ((ppxfxbqfkfVarDxjokdxxww.i0() & iIobyxmoadg2) != 0 && (ppxfxbqfkfVarDxjokdxxww instanceof z.wflxmlrfwp)) {
                                    int i14 = 0;
                                    for (androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf ppxfxbqfkfVarI1 = ((z.wflxmlrfwp) ppxfxbqfkfVarDxjokdxxww).I0(); ppxfxbqfkfVarI1 != null; ppxfxbqfkfVarI1 = ppxfxbqfkfVarI1.e0()) {
                                        if ((ppxfxbqfkfVarI1.i0() & iIobyxmoadg2) != 0) {
                                            i14++;
                                            if (i14 == 1) {
                                                ppxfxbqfkfVarDxjokdxxww = ppxfxbqfkfVarI1;
                                            } else {
                                                if (ppxfxbqfkfVar2 == null) {
                                                    ppxfxbqfkfVar2 = new ipoelvxyzq.ppxfxbqfkf(new androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf[16], 0);
                                                }
                                                if (ppxfxbqfkfVarDxjokdxxww != null) {
                                                    ppxfxbqfkfVar2.zoijcleaow(ppxfxbqfkfVarDxjokdxxww);
                                                    ppxfxbqfkfVarDxjokdxxww = null;
                                                }
                                                ppxfxbqfkfVar2.zoijcleaow(ppxfxbqfkfVarI1);
                                            }
                                        }
                                    }
                                    if (i14 == 1) {
                                    }
                                }
                                ppxfxbqfkfVarDxjokdxxww = z.gtknphoqwx.dxjokdxxww(ppxfxbqfkfVar2);
                            }
                        }
                        ppxfxbqfkfVarK0 = ppxfxbqfkfVarK0.k0();
                    }
                }
                pkzmftpjixVarRgvfuqvkyq2 = pkzmftpjixVarRgvfuqvkyq2.auzgnhcxok();
                ppxfxbqfkfVarK0 = (pkzmftpjixVarRgvfuqvkyq2 == null || (okpsazkaxtVarWeqkydbzbr = pkzmftpjixVarRgvfuqvkyq2.weqkydbzbr()) == null) ? null : okpsazkaxtVarWeqkydbzbr.ojitshcjhn();
            }
            if (arrayList != null && (size = arrayList.size() - 1) >= 0) {
                while (true) {
                    int i15 = size - 1;
                    if (((v.iobyxmoadg) arrayList.get(size)).c0(zoijcleaowVar)) {
                        return true;
                    }
                    if (i15 < 0) {
                        break;
                    }
                    size = i15;
                }
            }
            ?? Wflxmlrfwp = iobyxmoadgVar2.wflxmlrfwp();
            ?? ppxfxbqfkfVar3 = 0;
            while (Wflxmlrfwp != 0) {
                if (Wflxmlrfwp instanceof v.iobyxmoadg) {
                    if (((v.iobyxmoadg) Wflxmlrfwp).c0(zoijcleaowVar)) {
                        return true;
                    }
                } else if ((Wflxmlrfwp.i0() & iIobyxmoadg2) != 0 && (Wflxmlrfwp instanceof z.wflxmlrfwp)) {
                    androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf ppxfxbqfkfVarI2 = ((z.wflxmlrfwp) Wflxmlrfwp).I0();
                    int i16 = 0;
                    while (ppxfxbqfkfVarI2 != null) {
                        if ((ppxfxbqfkfVarI2.i0() & iIobyxmoadg2) != 0) {
                            i16++;
                            if (i16 == 1) {
                                Wflxmlrfwp = Wflxmlrfwp;
                                ppxfxbqfkfVar3 = ppxfxbqfkfVar3;
                                ppxfxbqfkfVar3 = ppxfxbqfkfVar3;
                                Wflxmlrfwp = ppxfxbqfkfVarI2;
                            } else {
                                if (ppxfxbqfkfVar3 == 0) {
                                    ppxfxbqfkfVar3 = new ipoelvxyzq.ppxfxbqfkf(new androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf[16], 0);
                                }
                                if (Wflxmlrfwp != 0) {
                                    ppxfxbqfkfVar3.zoijcleaow(Wflxmlrfwp);
                                    Wflxmlrfwp = 0;
                                }
                                ppxfxbqfkfVar3.zoijcleaow(ppxfxbqfkfVarI2);
                            }
                        } else {
                            Wflxmlrfwp = Wflxmlrfwp;
                            ppxfxbqfkfVar3 = ppxfxbqfkfVar3;
                        }
                        ppxfxbqfkfVarI2 = ppxfxbqfkfVarI2.e0();
                        Wflxmlrfwp = Wflxmlrfwp;
                        ppxfxbqfkfVar3 = ppxfxbqfkfVar3;
                    }
                    if (i16 == 1) {
                        Wflxmlrfwp = Wflxmlrfwp;
                        ppxfxbqfkfVar3 = ppxfxbqfkfVar3;
                    } else {
                        Wflxmlrfwp = Wflxmlrfwp;
                        ppxfxbqfkfVar3 = ppxfxbqfkfVar3;
                    }
                }
                Wflxmlrfwp = z.gtknphoqwx.dxjokdxxww(ppxfxbqfkfVar3);
            }
            if (((Boolean) iobyxmoadgVar.invoke()).booleanValue()) {
                return true;
            }
            ?? Wflxmlrfwp2 = iobyxmoadgVar2.wflxmlrfwp();
            ?? ppxfxbqfkfVar4 = 0;
            while (Wflxmlrfwp2 != 0) {
                if (Wflxmlrfwp2 instanceof v.iobyxmoadg) {
                    if (((v.iobyxmoadg) Wflxmlrfwp2).n(zoijcleaowVar)) {
                        return true;
                    }
                } else if ((Wflxmlrfwp2.i0() & iIobyxmoadg2) != 0 && (Wflxmlrfwp2 instanceof z.wflxmlrfwp)) {
                    androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf ppxfxbqfkfVarI3 = ((z.wflxmlrfwp) Wflxmlrfwp2).I0();
                    int i17 = 0;
                    while (ppxfxbqfkfVarI3 != null) {
                        if ((ppxfxbqfkfVarI3.i0() & iIobyxmoadg2) != 0) {
                            i17++;
                            if (i17 == 1) {
                                Wflxmlrfwp2 = Wflxmlrfwp2;
                                ppxfxbqfkfVar4 = ppxfxbqfkfVar4;
                                ppxfxbqfkfVar4 = ppxfxbqfkfVar4;
                                Wflxmlrfwp2 = ppxfxbqfkfVarI3;
                            } else {
                                if (ppxfxbqfkfVar4 == 0) {
                                    ppxfxbqfkfVar4 = new ipoelvxyzq.ppxfxbqfkf(new androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf[16], 0);
                                }
                                if (Wflxmlrfwp2 != 0) {
                                    ppxfxbqfkfVar4.zoijcleaow(Wflxmlrfwp2);
                                    Wflxmlrfwp2 = 0;
                                }
                                ppxfxbqfkfVar4.zoijcleaow(ppxfxbqfkfVarI3);
                            }
                        } else {
                            Wflxmlrfwp2 = Wflxmlrfwp2;
                            ppxfxbqfkfVar4 = ppxfxbqfkfVar4;
                        }
                        ppxfxbqfkfVarI3 = ppxfxbqfkfVarI3.e0();
                        Wflxmlrfwp2 = Wflxmlrfwp2;
                        ppxfxbqfkfVar4 = ppxfxbqfkfVar4;
                    }
                    if (i17 == 1) {
                        Wflxmlrfwp2 = Wflxmlrfwp2;
                        ppxfxbqfkfVar4 = ppxfxbqfkfVar4;
                    } else {
                        Wflxmlrfwp2 = Wflxmlrfwp2;
                        ppxfxbqfkfVar4 = ppxfxbqfkfVar4;
                    }
                }
                Wflxmlrfwp2 = z.gtknphoqwx.dxjokdxxww(ppxfxbqfkfVar4);
            }
            if (arrayList != null) {
                int size2 = arrayList.size();
                for (int i18 = 0; i18 < size2; i18++) {
                    if (((v.iobyxmoadg) arrayList.get(i18)).n(zoijcleaowVar)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:111:0x0184 A[Catch: all -> 0x001e, TryCatch #0 {all -> 0x001e, blocks: (B:3:0x000a, B:5:0x0013, B:10:0x0021, B:14:0x002b, B:17:0x0038, B:114:0x018c, B:116:0x019a, B:117:0x019d, B:119:0x01ac, B:122:0x01bd, B:126:0x01c8, B:129:0x01ce, B:130:0x01d3, B:150:0x0214, B:131:0x01d7, B:133:0x01de, B:135:0x01e2, B:137:0x01ec, B:139:0x01f3, B:141:0x01f6, B:143:0x01fc, B:145:0x0205, B:146:0x0209, B:147:0x020c, B:151:0x0219, B:152:0x021e, B:154:0x0224, B:156:0x022a, B:159:0x0235, B:161:0x023d, B:168:0x0254, B:169:0x0256, B:170:0x0266, B:172:0x026a, B:174:0x026e, B:201:0x02cc, B:178:0x027a, B:180:0x0283, B:182:0x0289, B:184:0x0292, B:186:0x0299, B:188:0x029c, B:189:0x02a1, B:191:0x02a7, B:192:0x02ae, B:194:0x02b6, B:195:0x02bb, B:197:0x02c1, B:198:0x02c4, B:202:0x02d7, B:206:0x02e7, B:207:0x02f7, B:209:0x02fb, B:211:0x02ff, B:238:0x035d, B:215:0x030b, B:217:0x0314, B:219:0x031a, B:221:0x0323, B:223:0x032a, B:225:0x032d, B:226:0x0332, B:228:0x0338, B:229:0x033f, B:231:0x0347, B:232:0x034c, B:234:0x0352, B:235:0x0355, B:240:0x036a, B:242:0x0371, B:247:0x0383, B:248:0x0385, B:20:0x0040, B:22:0x004e, B:23:0x0051, B:25:0x005b, B:28:0x006c, B:32:0x0077, B:63:0x00d8, B:65:0x00dc, B:35:0x007d, B:37:0x0084, B:39:0x0088, B:41:0x0092, B:43:0x0099, B:45:0x009c, B:47:0x00a2, B:49:0x00ab, B:50:0x00af, B:51:0x00b2, B:54:0x00ba, B:55:0x00bf, B:56:0x00c4, B:58:0x00ca, B:60:0x00d0, B:66:0x00e2, B:68:0x00f2, B:69:0x00f5, B:71:0x0103, B:74:0x0114, B:78:0x011f, B:109:0x0180, B:111:0x0184, B:81:0x0125, B:83:0x012c, B:85:0x0130, B:87:0x013a, B:89:0x0141, B:91:0x0144, B:93:0x014a, B:95:0x0153, B:96:0x0157, B:97:0x015a, B:100:0x0162, B:101:0x0167, B:102:0x016c, B:104:0x0172, B:106:0x0178), top: B:253:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:112:0x0189  */
    /* JADX WARN: Code duplicated, block: B:332:0x017f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:333:0x0123 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:341:0x0167 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x00e2 A[Catch: all -> 0x001e, TryCatch #0 {all -> 0x001e, blocks: (B:3:0x000a, B:5:0x0013, B:10:0x0021, B:14:0x002b, B:17:0x0038, B:114:0x018c, B:116:0x019a, B:117:0x019d, B:119:0x01ac, B:122:0x01bd, B:126:0x01c8, B:129:0x01ce, B:130:0x01d3, B:150:0x0214, B:131:0x01d7, B:133:0x01de, B:135:0x01e2, B:137:0x01ec, B:139:0x01f3, B:141:0x01f6, B:143:0x01fc, B:145:0x0205, B:146:0x0209, B:147:0x020c, B:151:0x0219, B:152:0x021e, B:154:0x0224, B:156:0x022a, B:159:0x0235, B:161:0x023d, B:168:0x0254, B:169:0x0256, B:170:0x0266, B:172:0x026a, B:174:0x026e, B:201:0x02cc, B:178:0x027a, B:180:0x0283, B:182:0x0289, B:184:0x0292, B:186:0x0299, B:188:0x029c, B:189:0x02a1, B:191:0x02a7, B:192:0x02ae, B:194:0x02b6, B:195:0x02bb, B:197:0x02c1, B:198:0x02c4, B:202:0x02d7, B:206:0x02e7, B:207:0x02f7, B:209:0x02fb, B:211:0x02ff, B:238:0x035d, B:215:0x030b, B:217:0x0314, B:219:0x031a, B:221:0x0323, B:223:0x032a, B:225:0x032d, B:226:0x0332, B:228:0x0338, B:229:0x033f, B:231:0x0347, B:232:0x034c, B:234:0x0352, B:235:0x0355, B:240:0x036a, B:242:0x0371, B:247:0x0383, B:248:0x0385, B:20:0x0040, B:22:0x004e, B:23:0x0051, B:25:0x005b, B:28:0x006c, B:32:0x0077, B:63:0x00d8, B:65:0x00dc, B:35:0x007d, B:37:0x0084, B:39:0x0088, B:41:0x0092, B:43:0x0099, B:45:0x009c, B:47:0x00a2, B:49:0x00ab, B:50:0x00af, B:51:0x00b2, B:54:0x00ba, B:55:0x00bf, B:56:0x00c4, B:58:0x00ca, B:60:0x00d0, B:66:0x00e2, B:68:0x00f2, B:69:0x00f5, B:71:0x0103, B:74:0x0114, B:78:0x011f, B:109:0x0180, B:111:0x0184, B:81:0x0125, B:83:0x012c, B:85:0x0130, B:87:0x013a, B:89:0x0141, B:91:0x0144, B:93:0x014a, B:95:0x0153, B:96:0x0157, B:97:0x015a, B:100:0x0162, B:101:0x0167, B:102:0x016c, B:104:0x0172, B:106:0x0178), top: B:253:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:68:0x00f2 A[Catch: all -> 0x001e, TryCatch #0 {all -> 0x001e, blocks: (B:3:0x000a, B:5:0x0013, B:10:0x0021, B:14:0x002b, B:17:0x0038, B:114:0x018c, B:116:0x019a, B:117:0x019d, B:119:0x01ac, B:122:0x01bd, B:126:0x01c8, B:129:0x01ce, B:130:0x01d3, B:150:0x0214, B:131:0x01d7, B:133:0x01de, B:135:0x01e2, B:137:0x01ec, B:139:0x01f3, B:141:0x01f6, B:143:0x01fc, B:145:0x0205, B:146:0x0209, B:147:0x020c, B:151:0x0219, B:152:0x021e, B:154:0x0224, B:156:0x022a, B:159:0x0235, B:161:0x023d, B:168:0x0254, B:169:0x0256, B:170:0x0266, B:172:0x026a, B:174:0x026e, B:201:0x02cc, B:178:0x027a, B:180:0x0283, B:182:0x0289, B:184:0x0292, B:186:0x0299, B:188:0x029c, B:189:0x02a1, B:191:0x02a7, B:192:0x02ae, B:194:0x02b6, B:195:0x02bb, B:197:0x02c1, B:198:0x02c4, B:202:0x02d7, B:206:0x02e7, B:207:0x02f7, B:209:0x02fb, B:211:0x02ff, B:238:0x035d, B:215:0x030b, B:217:0x0314, B:219:0x031a, B:221:0x0323, B:223:0x032a, B:225:0x032d, B:226:0x0332, B:228:0x0338, B:229:0x033f, B:231:0x0347, B:232:0x034c, B:234:0x0352, B:235:0x0355, B:240:0x036a, B:242:0x0371, B:247:0x0383, B:248:0x0385, B:20:0x0040, B:22:0x004e, B:23:0x0051, B:25:0x005b, B:28:0x006c, B:32:0x0077, B:63:0x00d8, B:65:0x00dc, B:35:0x007d, B:37:0x0084, B:39:0x0088, B:41:0x0092, B:43:0x0099, B:45:0x009c, B:47:0x00a2, B:49:0x00ab, B:50:0x00af, B:51:0x00b2, B:54:0x00ba, B:55:0x00bf, B:56:0x00c4, B:58:0x00ca, B:60:0x00d0, B:66:0x00e2, B:68:0x00f2, B:69:0x00f5, B:71:0x0103, B:74:0x0114, B:78:0x011f, B:109:0x0180, B:111:0x0184, B:81:0x0125, B:83:0x012c, B:85:0x0130, B:87:0x013a, B:89:0x0141, B:91:0x0144, B:93:0x014a, B:95:0x0153, B:96:0x0157, B:97:0x015a, B:100:0x0162, B:101:0x0167, B:102:0x016c, B:104:0x0172, B:106:0x0178), top: B:253:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:71:0x0103 A[Catch: all -> 0x001e, TryCatch #0 {all -> 0x001e, blocks: (B:3:0x000a, B:5:0x0013, B:10:0x0021, B:14:0x002b, B:17:0x0038, B:114:0x018c, B:116:0x019a, B:117:0x019d, B:119:0x01ac, B:122:0x01bd, B:126:0x01c8, B:129:0x01ce, B:130:0x01d3, B:150:0x0214, B:131:0x01d7, B:133:0x01de, B:135:0x01e2, B:137:0x01ec, B:139:0x01f3, B:141:0x01f6, B:143:0x01fc, B:145:0x0205, B:146:0x0209, B:147:0x020c, B:151:0x0219, B:152:0x021e, B:154:0x0224, B:156:0x022a, B:159:0x0235, B:161:0x023d, B:168:0x0254, B:169:0x0256, B:170:0x0266, B:172:0x026a, B:174:0x026e, B:201:0x02cc, B:178:0x027a, B:180:0x0283, B:182:0x0289, B:184:0x0292, B:186:0x0299, B:188:0x029c, B:189:0x02a1, B:191:0x02a7, B:192:0x02ae, B:194:0x02b6, B:195:0x02bb, B:197:0x02c1, B:198:0x02c4, B:202:0x02d7, B:206:0x02e7, B:207:0x02f7, B:209:0x02fb, B:211:0x02ff, B:238:0x035d, B:215:0x030b, B:217:0x0314, B:219:0x031a, B:221:0x0323, B:223:0x032a, B:225:0x032d, B:226:0x0332, B:228:0x0338, B:229:0x033f, B:231:0x0347, B:232:0x034c, B:234:0x0352, B:235:0x0355, B:240:0x036a, B:242:0x0371, B:247:0x0383, B:248:0x0385, B:20:0x0040, B:22:0x004e, B:23:0x0051, B:25:0x005b, B:28:0x006c, B:32:0x0077, B:63:0x00d8, B:65:0x00dc, B:35:0x007d, B:37:0x0084, B:39:0x0088, B:41:0x0092, B:43:0x0099, B:45:0x009c, B:47:0x00a2, B:49:0x00ab, B:50:0x00af, B:51:0x00b2, B:54:0x00ba, B:55:0x00bf, B:56:0x00c4, B:58:0x00ca, B:60:0x00d0, B:66:0x00e2, B:68:0x00f2, B:69:0x00f5, B:71:0x0103, B:74:0x0114, B:78:0x011f, B:109:0x0180, B:111:0x0184, B:81:0x0125, B:83:0x012c, B:85:0x0130, B:87:0x013a, B:89:0x0141, B:91:0x0144, B:93:0x014a, B:95:0x0153, B:96:0x0157, B:97:0x015a, B:100:0x0162, B:101:0x0167, B:102:0x016c, B:104:0x0172, B:106:0x0178), top: B:253:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:73:0x0112 A[ADDED_TO_REGION, LOOP:15: B:73:0x0112->B:101:0x0167, LOOP_START, PHI: r10
      0x0112: PHI (r10v9 androidx.compose.ui.wkgbmnqykc$ppxfxbqfkf) = (r10v4 androidx.compose.ui.wkgbmnqykc$ppxfxbqfkf), (r10v10 androidx.compose.ui.wkgbmnqykc$ppxfxbqfkf) binds: [B:72:0x0110, B:101:0x0167] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:74:0x0114 A[Catch: all -> 0x001e, TryCatch #0 {all -> 0x001e, blocks: (B:3:0x000a, B:5:0x0013, B:10:0x0021, B:14:0x002b, B:17:0x0038, B:114:0x018c, B:116:0x019a, B:117:0x019d, B:119:0x01ac, B:122:0x01bd, B:126:0x01c8, B:129:0x01ce, B:130:0x01d3, B:150:0x0214, B:131:0x01d7, B:133:0x01de, B:135:0x01e2, B:137:0x01ec, B:139:0x01f3, B:141:0x01f6, B:143:0x01fc, B:145:0x0205, B:146:0x0209, B:147:0x020c, B:151:0x0219, B:152:0x021e, B:154:0x0224, B:156:0x022a, B:159:0x0235, B:161:0x023d, B:168:0x0254, B:169:0x0256, B:170:0x0266, B:172:0x026a, B:174:0x026e, B:201:0x02cc, B:178:0x027a, B:180:0x0283, B:182:0x0289, B:184:0x0292, B:186:0x0299, B:188:0x029c, B:189:0x02a1, B:191:0x02a7, B:192:0x02ae, B:194:0x02b6, B:195:0x02bb, B:197:0x02c1, B:198:0x02c4, B:202:0x02d7, B:206:0x02e7, B:207:0x02f7, B:209:0x02fb, B:211:0x02ff, B:238:0x035d, B:215:0x030b, B:217:0x0314, B:219:0x031a, B:221:0x0323, B:223:0x032a, B:225:0x032d, B:226:0x0332, B:228:0x0338, B:229:0x033f, B:231:0x0347, B:232:0x034c, B:234:0x0352, B:235:0x0355, B:240:0x036a, B:242:0x0371, B:247:0x0383, B:248:0x0385, B:20:0x0040, B:22:0x004e, B:23:0x0051, B:25:0x005b, B:28:0x006c, B:32:0x0077, B:63:0x00d8, B:65:0x00dc, B:35:0x007d, B:37:0x0084, B:39:0x0088, B:41:0x0092, B:43:0x0099, B:45:0x009c, B:47:0x00a2, B:49:0x00ab, B:50:0x00af, B:51:0x00b2, B:54:0x00ba, B:55:0x00bf, B:56:0x00c4, B:58:0x00ca, B:60:0x00d0, B:66:0x00e2, B:68:0x00f2, B:69:0x00f5, B:71:0x0103, B:74:0x0114, B:78:0x011f, B:109:0x0180, B:111:0x0184, B:81:0x0125, B:83:0x012c, B:85:0x0130, B:87:0x013a, B:89:0x0141, B:91:0x0144, B:93:0x014a, B:95:0x0153, B:96:0x0157, B:97:0x015a, B:100:0x0162, B:101:0x0167, B:102:0x016c, B:104:0x0172, B:106:0x0178), top: B:253:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:76:0x011b  */
    /* JADX WARN: Code duplicated, block: B:78:0x011f A[Catch: all -> 0x001e, TryCatch #0 {all -> 0x001e, blocks: (B:3:0x000a, B:5:0x0013, B:10:0x0021, B:14:0x002b, B:17:0x0038, B:114:0x018c, B:116:0x019a, B:117:0x019d, B:119:0x01ac, B:122:0x01bd, B:126:0x01c8, B:129:0x01ce, B:130:0x01d3, B:150:0x0214, B:131:0x01d7, B:133:0x01de, B:135:0x01e2, B:137:0x01ec, B:139:0x01f3, B:141:0x01f6, B:143:0x01fc, B:145:0x0205, B:146:0x0209, B:147:0x020c, B:151:0x0219, B:152:0x021e, B:154:0x0224, B:156:0x022a, B:159:0x0235, B:161:0x023d, B:168:0x0254, B:169:0x0256, B:170:0x0266, B:172:0x026a, B:174:0x026e, B:201:0x02cc, B:178:0x027a, B:180:0x0283, B:182:0x0289, B:184:0x0292, B:186:0x0299, B:188:0x029c, B:189:0x02a1, B:191:0x02a7, B:192:0x02ae, B:194:0x02b6, B:195:0x02bb, B:197:0x02c1, B:198:0x02c4, B:202:0x02d7, B:206:0x02e7, B:207:0x02f7, B:209:0x02fb, B:211:0x02ff, B:238:0x035d, B:215:0x030b, B:217:0x0314, B:219:0x031a, B:221:0x0323, B:223:0x032a, B:225:0x032d, B:226:0x0332, B:228:0x0338, B:229:0x033f, B:231:0x0347, B:232:0x034c, B:234:0x0352, B:235:0x0355, B:240:0x036a, B:242:0x0371, B:247:0x0383, B:248:0x0385, B:20:0x0040, B:22:0x004e, B:23:0x0051, B:25:0x005b, B:28:0x006c, B:32:0x0077, B:63:0x00d8, B:65:0x00dc, B:35:0x007d, B:37:0x0084, B:39:0x0088, B:41:0x0092, B:43:0x0099, B:45:0x009c, B:47:0x00a2, B:49:0x00ab, B:50:0x00af, B:51:0x00b2, B:54:0x00ba, B:55:0x00bf, B:56:0x00c4, B:58:0x00ca, B:60:0x00d0, B:66:0x00e2, B:68:0x00f2, B:69:0x00f5, B:71:0x0103, B:74:0x0114, B:78:0x011f, B:109:0x0180, B:111:0x0184, B:81:0x0125, B:83:0x012c, B:85:0x0130, B:87:0x013a, B:89:0x0141, B:91:0x0144, B:93:0x014a, B:95:0x0153, B:96:0x0157, B:97:0x015a, B:100:0x0162, B:101:0x0167, B:102:0x016c, B:104:0x0172, B:106:0x0178), top: B:253:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:81:0x0125 A[Catch: all -> 0x001e, TryCatch #0 {all -> 0x001e, blocks: (B:3:0x000a, B:5:0x0013, B:10:0x0021, B:14:0x002b, B:17:0x0038, B:114:0x018c, B:116:0x019a, B:117:0x019d, B:119:0x01ac, B:122:0x01bd, B:126:0x01c8, B:129:0x01ce, B:130:0x01d3, B:150:0x0214, B:131:0x01d7, B:133:0x01de, B:135:0x01e2, B:137:0x01ec, B:139:0x01f3, B:141:0x01f6, B:143:0x01fc, B:145:0x0205, B:146:0x0209, B:147:0x020c, B:151:0x0219, B:152:0x021e, B:154:0x0224, B:156:0x022a, B:159:0x0235, B:161:0x023d, B:168:0x0254, B:169:0x0256, B:170:0x0266, B:172:0x026a, B:174:0x026e, B:201:0x02cc, B:178:0x027a, B:180:0x0283, B:182:0x0289, B:184:0x0292, B:186:0x0299, B:188:0x029c, B:189:0x02a1, B:191:0x02a7, B:192:0x02ae, B:194:0x02b6, B:195:0x02bb, B:197:0x02c1, B:198:0x02c4, B:202:0x02d7, B:206:0x02e7, B:207:0x02f7, B:209:0x02fb, B:211:0x02ff, B:238:0x035d, B:215:0x030b, B:217:0x0314, B:219:0x031a, B:221:0x0323, B:223:0x032a, B:225:0x032d, B:226:0x0332, B:228:0x0338, B:229:0x033f, B:231:0x0347, B:232:0x034c, B:234:0x0352, B:235:0x0355, B:240:0x036a, B:242:0x0371, B:247:0x0383, B:248:0x0385, B:20:0x0040, B:22:0x004e, B:23:0x0051, B:25:0x005b, B:28:0x006c, B:32:0x0077, B:63:0x00d8, B:65:0x00dc, B:35:0x007d, B:37:0x0084, B:39:0x0088, B:41:0x0092, B:43:0x0099, B:45:0x009c, B:47:0x00a2, B:49:0x00ab, B:50:0x00af, B:51:0x00b2, B:54:0x00ba, B:55:0x00bf, B:56:0x00c4, B:58:0x00ca, B:60:0x00d0, B:66:0x00e2, B:68:0x00f2, B:69:0x00f5, B:71:0x0103, B:74:0x0114, B:78:0x011f, B:109:0x0180, B:111:0x0184, B:81:0x0125, B:83:0x012c, B:85:0x0130, B:87:0x013a, B:89:0x0141, B:91:0x0144, B:93:0x014a, B:95:0x0153, B:96:0x0157, B:97:0x015a, B:100:0x0162, B:101:0x0167, B:102:0x016c, B:104:0x0172, B:106:0x0178), top: B:253:0x000a }] */
    @Override // f.btonecajqb
    public boolean yggfygwlhe(KeyEvent keyEvent, tg.iobyxmoadg iobyxmoadgVar) {
        FocusTargetNode focusTargetNode;
        int iIobyxmoadg;
        androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf ppxfxbqfkfVarK0;
        z.pkzmftpjix pkzmftpjixVarRgvfuqvkyq;
        Object obj;
        r.eablkybsjg eablkybsjgVar;
        androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf ppxfxbqfkfVarWflxmlrfwp;
        okpsazkaxt okpsazkaxtVarWeqkydbzbr;
        ipoelvxyzq.ppxfxbqfkf ppxfxbqfkfVar;
        androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf ppxfxbqfkfVarDxjokdxxww;
        Object obj2;
        okpsazkaxt okpsazkaxtVarWeqkydbzbr2;
        okpsazkaxt okpsazkaxtVarWeqkydbzbr3;
        Trace.beginSection("FocusOwnerImpl:dispatchKeyEvent");
        try {
            if (this.f6190wkgbmnqykc.zoijcleaow()) {
                System.out.println((Object) "FocusRelatedWarning: Dispatching key event while focus system is invalidated.");
                Trace.endSection();
                return false;
            }
            if (!istkbnxepw(keyEvent)) {
                Trace.endSection();
                return false;
            }
            FocusTargetNode focusTargetNodeCqumvgiudr = cqumvgiudr();
            if (focusTargetNodeCqumvgiudr == null || (ppxfxbqfkfVarWflxmlrfwp = lereixgezr(focusTargetNodeCqumvgiudr)) == null) {
                if (focusTargetNodeCqumvgiudr != null) {
                    int iIobyxmoadg2 = rlfsiqarku.iobyxmoadg(8192);
                    if (!focusTargetNodeCqumvgiudr.wflxmlrfwp().n0()) {
                        w.iobyxmoadg.zoijcleaow("visitAncestors called on an unattached node");
                    }
                    androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf ppxfxbqfkfVarWflxmlrfwp2 = focusTargetNodeCqumvgiudr.wflxmlrfwp();
                    z.pkzmftpjix pkzmftpjixVarRgvfuqvkyq2 = z.gtknphoqwx.rgvfuqvkyq(focusTargetNodeCqumvgiudr);
                    loop10: while (true) {
                        if (pkzmftpjixVarRgvfuqvkyq2 == null) {
                            obj2 = null;
                            break;
                        }
                        if ((pkzmftpjixVarRgvfuqvkyq2.weqkydbzbr().gtknphoqwx().d0() & iIobyxmoadg2) != 0) {
                            while (ppxfxbqfkfVarWflxmlrfwp2 != null) {
                                if ((ppxfxbqfkfVarWflxmlrfwp2.i0() & iIobyxmoadg2) != 0) {
                                    ipoelvxyzq.ppxfxbqfkf ppxfxbqfkfVar2 = null;
                                    androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf ppxfxbqfkfVarDxjokdxxww2 = ppxfxbqfkfVarWflxmlrfwp2;
                                    while (ppxfxbqfkfVarDxjokdxxww2 != null) {
                                        if (ppxfxbqfkfVarDxjokdxxww2 instanceof r.eablkybsjg) {
                                            obj2 = ppxfxbqfkfVarDxjokdxxww2;
                                            break loop10;
                                        }
                                        if ((ppxfxbqfkfVarDxjokdxxww2.i0() & iIobyxmoadg2) != 0 && (ppxfxbqfkfVarDxjokdxxww2 instanceof z.wflxmlrfwp)) {
                                            androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf ppxfxbqfkfVarI0 = ((z.wflxmlrfwp) ppxfxbqfkfVarDxjokdxxww2).I0();
                                            int i13 = 0;
                                            while (ppxfxbqfkfVarI0 != null) {
                                                if ((ppxfxbqfkfVarI0.i0() & iIobyxmoadg2) != 0) {
                                                    i13++;
                                                    if (i13 == 1) {
                                                        ppxfxbqfkfVarDxjokdxxww2 = ppxfxbqfkfVarDxjokdxxww2;
                                                        ppxfxbqfkfVar2 = ppxfxbqfkfVar2;
                                                        ppxfxbqfkfVar2 = ppxfxbqfkfVar2;
                                                        wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
                                                        ppxfxbqfkfVarDxjokdxxww2 = ppxfxbqfkfVarI0;
                                                    } else {
                                                        if (ppxfxbqfkfVar2 == null) {
                                                            ppxfxbqfkfVar2 = new ipoelvxyzq.ppxfxbqfkf(new androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf[16], 0);
                                                        }
                                                        if (ppxfxbqfkfVarDxjokdxxww2 != null) {
                                                            ppxfxbqfkfVar2.zoijcleaow(ppxfxbqfkfVarDxjokdxxww2);
                                                            ppxfxbqfkfVarDxjokdxxww2 = null;
                                                        }
                                                        ppxfxbqfkfVar2.zoijcleaow(ppxfxbqfkfVarI0);
                                                    }
                                                } else {
                                                    ppxfxbqfkfVarDxjokdxxww2 = ppxfxbqfkfVarDxjokdxxww2;
                                                    ppxfxbqfkfVar2 = ppxfxbqfkfVar2;
                                                }
                                                ppxfxbqfkfVarI0 = ppxfxbqfkfVarI0.e0();
                                                ppxfxbqfkfVarDxjokdxxww2 = ppxfxbqfkfVarDxjokdxxww2;
                                                ppxfxbqfkfVar2 = ppxfxbqfkfVar2;
                                            }
                                            if (i13 == 1) {
                                                ppxfxbqfkfVarDxjokdxxww2 = ppxfxbqfkfVarDxjokdxxww2;
                                                ppxfxbqfkfVar2 = ppxfxbqfkfVar2;
                                            } else {
                                                ppxfxbqfkfVarDxjokdxxww2 = ppxfxbqfkfVarDxjokdxxww2;
                                                ppxfxbqfkfVar2 = ppxfxbqfkfVar2;
                                            }
                                        }
                                        ppxfxbqfkfVarDxjokdxxww2 = z.gtknphoqwx.dxjokdxxww(ppxfxbqfkfVar2);
                                    }
                                }
                                ppxfxbqfkfVarWflxmlrfwp2 = ppxfxbqfkfVarWflxmlrfwp2.k0();
                            }
                        }
                        pkzmftpjixVarRgvfuqvkyq2 = pkzmftpjixVarRgvfuqvkyq2.auzgnhcxok();
                        ppxfxbqfkfVarWflxmlrfwp2 = (pkzmftpjixVarRgvfuqvkyq2 == null || (okpsazkaxtVarWeqkydbzbr2 = pkzmftpjixVarRgvfuqvkyq2.weqkydbzbr()) == null) ? null : okpsazkaxtVarWeqkydbzbr2.ojitshcjhn();
                    }
                    r.eablkybsjg eablkybsjgVar2 = (r.eablkybsjg) obj2;
                    if (eablkybsjgVar2 != null) {
                        ppxfxbqfkfVarWflxmlrfwp = eablkybsjgVar2.wflxmlrfwp();
                    } else {
                        focusTargetNode = this.f6189ppxfxbqfkf;
                        iIobyxmoadg = rlfsiqarku.iobyxmoadg(8192);
                        if (!focusTargetNode.wflxmlrfwp().n0()) {
                            w.iobyxmoadg.zoijcleaow("visitAncestors called on an unattached node");
                        }
                        ppxfxbqfkfVarK0 = focusTargetNode.wflxmlrfwp().k0();
                        pkzmftpjixVarRgvfuqvkyq = z.gtknphoqwx.rgvfuqvkyq(focusTargetNode);
                        loop14: while (true) {
                            if (pkzmftpjixVarRgvfuqvkyq != null) {
                                obj = null;
                                break;
                            }
                            if ((pkzmftpjixVarRgvfuqvkyq.weqkydbzbr().gtknphoqwx().d0() & iIobyxmoadg) != 0) {
                                while (ppxfxbqfkfVarK0 != null) {
                                    if ((ppxfxbqfkfVarK0.i0() & iIobyxmoadg) != 0) {
                                        ppxfxbqfkfVar = null;
                                        ppxfxbqfkfVarDxjokdxxww = ppxfxbqfkfVarK0;
                                        while (ppxfxbqfkfVarDxjokdxxww != null) {
                                            if (ppxfxbqfkfVarDxjokdxxww instanceof r.eablkybsjg) {
                                                obj = ppxfxbqfkfVarDxjokdxxww;
                                                break loop14;
                                            }
                                            if ((ppxfxbqfkfVarDxjokdxxww.i0() & iIobyxmoadg) == 0 && (ppxfxbqfkfVarDxjokdxxww instanceof z.wflxmlrfwp)) {
                                                androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf ppxfxbqfkfVarI1 = ((z.wflxmlrfwp) ppxfxbqfkfVarDxjokdxxww).I0();
                                                int i14 = 0;
                                                while (ppxfxbqfkfVarI1 != null) {
                                                    if ((ppxfxbqfkfVarI1.i0() & iIobyxmoadg) != 0) {
                                                        i14++;
                                                        if (i14 == 1) {
                                                            ppxfxbqfkfVarDxjokdxxww = ppxfxbqfkfVarDxjokdxxww;
                                                            ppxfxbqfkfVar = ppxfxbqfkfVar;
                                                            ppxfxbqfkfVar = ppxfxbqfkfVar;
                                                            wwaezpbzkn wwaezpbzknVar2 = wwaezpbzkn.f37140iobyxmoadg;
                                                            ppxfxbqfkfVarDxjokdxxww = ppxfxbqfkfVarI1;
                                                        } else {
                                                            if (ppxfxbqfkfVar == null) {
                                                                ppxfxbqfkfVar = new ipoelvxyzq.ppxfxbqfkf(new androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf[16], 0);
                                                            }
                                                            if (ppxfxbqfkfVarDxjokdxxww != null) {
                                                                ppxfxbqfkfVar.zoijcleaow(ppxfxbqfkfVarDxjokdxxww);
                                                                ppxfxbqfkfVarDxjokdxxww = null;
                                                            }
                                                            ppxfxbqfkfVar.zoijcleaow(ppxfxbqfkfVarI1);
                                                        }
                                                    } else {
                                                        ppxfxbqfkfVarDxjokdxxww = ppxfxbqfkfVarDxjokdxxww;
                                                        ppxfxbqfkfVar = ppxfxbqfkfVar;
                                                    }
                                                    ppxfxbqfkfVarI1 = ppxfxbqfkfVarI1.e0();
                                                    ppxfxbqfkfVarDxjokdxxww = ppxfxbqfkfVarDxjokdxxww;
                                                    ppxfxbqfkfVar = ppxfxbqfkfVar;
                                                }
                                                if (i14 == 1) {
                                                    ppxfxbqfkfVarDxjokdxxww = ppxfxbqfkfVarDxjokdxxww;
                                                    ppxfxbqfkfVar = ppxfxbqfkfVar;
                                                } else {
                                                    ppxfxbqfkfVarDxjokdxxww = ppxfxbqfkfVarDxjokdxxww;
                                                    ppxfxbqfkfVar = ppxfxbqfkfVar;
                                                }
                                            }
                                            ppxfxbqfkfVarDxjokdxxww = z.gtknphoqwx.dxjokdxxww(ppxfxbqfkfVar);
                                        }
                                    }
                                    ppxfxbqfkfVarK0 = ppxfxbqfkfVarK0.k0();
                                }
                            }
                            pkzmftpjixVarRgvfuqvkyq = pkzmftpjixVarRgvfuqvkyq.auzgnhcxok();
                            ppxfxbqfkfVarK0 = (pkzmftpjixVarRgvfuqvkyq != null || (okpsazkaxtVarWeqkydbzbr = pkzmftpjixVarRgvfuqvkyq.weqkydbzbr()) == null) ? null : okpsazkaxtVarWeqkydbzbr.ojitshcjhn();
                        }
                        eablkybsjgVar = (r.eablkybsjg) obj;
                        if (eablkybsjgVar != null) {
                            ppxfxbqfkfVarWflxmlrfwp = eablkybsjgVar.wflxmlrfwp();
                        } else {
                            ppxfxbqfkfVarWflxmlrfwp = null;
                        }
                    }
                } else {
                    focusTargetNode = this.f6189ppxfxbqfkf;
                    iIobyxmoadg = rlfsiqarku.iobyxmoadg(8192);
                    if (!focusTargetNode.wflxmlrfwp().n0()) {
                        w.iobyxmoadg.zoijcleaow("visitAncestors called on an unattached node");
                    }
                    ppxfxbqfkfVarK0 = focusTargetNode.wflxmlrfwp().k0();
                    pkzmftpjixVarRgvfuqvkyq = z.gtknphoqwx.rgvfuqvkyq(focusTargetNode);
                    loop14: while (true) {
                        if (pkzmftpjixVarRgvfuqvkyq != null) {
                            obj = null;
                            break;
                        }
                        if ((pkzmftpjixVarRgvfuqvkyq.weqkydbzbr().gtknphoqwx().d0() & iIobyxmoadg) != 0) {
                            while (ppxfxbqfkfVarK0 != null) {
                                if ((ppxfxbqfkfVarK0.i0() & iIobyxmoadg) != 0) {
                                    ppxfxbqfkfVar = null;
                                    ppxfxbqfkfVarDxjokdxxww = ppxfxbqfkfVarK0;
                                    while (ppxfxbqfkfVarDxjokdxxww != null) {
                                        if (ppxfxbqfkfVarDxjokdxxww instanceof r.eablkybsjg) {
                                            obj = ppxfxbqfkfVarDxjokdxxww;
                                            break loop14;
                                        }
                                        if ((ppxfxbqfkfVarDxjokdxxww.i0() & iIobyxmoadg) == 0) {
                                        }
                                        ppxfxbqfkfVarDxjokdxxww = z.gtknphoqwx.dxjokdxxww(ppxfxbqfkfVar);
                                    }
                                }
                                ppxfxbqfkfVarK0 = ppxfxbqfkfVarK0.k0();
                            }
                        }
                        pkzmftpjixVarRgvfuqvkyq = pkzmftpjixVarRgvfuqvkyq.auzgnhcxok();
                        if (pkzmftpjixVarRgvfuqvkyq != null) {
                        }
                    }
                    eablkybsjgVar = (r.eablkybsjg) obj;
                    if (eablkybsjgVar != null) {
                        ppxfxbqfkfVarWflxmlrfwp = eablkybsjgVar.wflxmlrfwp();
                    } else {
                        ppxfxbqfkfVarWflxmlrfwp = null;
                    }
                }
            }
            if (ppxfxbqfkfVarWflxmlrfwp != null) {
                int iIobyxmoadg3 = rlfsiqarku.iobyxmoadg(8192);
                if (!ppxfxbqfkfVarWflxmlrfwp.wflxmlrfwp().n0()) {
                    w.iobyxmoadg.zoijcleaow("visitAncestors called on an unattached node");
                }
                androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf ppxfxbqfkfVarK1 = ppxfxbqfkfVarWflxmlrfwp.wflxmlrfwp().k0();
                z.pkzmftpjix pkzmftpjixVarRgvfuqvkyq3 = z.gtknphoqwx.rgvfuqvkyq(ppxfxbqfkfVarWflxmlrfwp);
                ArrayList arrayList = null;
                while (pkzmftpjixVarRgvfuqvkyq3 != null) {
                    if ((pkzmftpjixVarRgvfuqvkyq3.weqkydbzbr().gtknphoqwx().d0() & iIobyxmoadg3) != 0) {
                        while (ppxfxbqfkfVarK1 != null) {
                            if ((ppxfxbqfkfVarK1.i0() & iIobyxmoadg3) != 0) {
                                androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf ppxfxbqfkfVarDxjokdxxww3 = ppxfxbqfkfVarK1;
                                ipoelvxyzq.ppxfxbqfkf ppxfxbqfkfVar3 = null;
                                while (ppxfxbqfkfVarDxjokdxxww3 != null) {
                                    if (ppxfxbqfkfVarDxjokdxxww3 instanceof r.eablkybsjg) {
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                        }
                                        arrayList.add(ppxfxbqfkfVarDxjokdxxww3);
                                    } else if ((ppxfxbqfkfVarDxjokdxxww3.i0() & iIobyxmoadg3) != 0 && (ppxfxbqfkfVarDxjokdxxww3 instanceof z.wflxmlrfwp)) {
                                        int i15 = 0;
                                        for (androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf ppxfxbqfkfVarI2 = ((z.wflxmlrfwp) ppxfxbqfkfVarDxjokdxxww3).I0(); ppxfxbqfkfVarI2 != null; ppxfxbqfkfVarI2 = ppxfxbqfkfVarI2.e0()) {
                                            if ((ppxfxbqfkfVarI2.i0() & iIobyxmoadg3) != 0) {
                                                i15++;
                                                if (i15 == 1) {
                                                    wwaezpbzkn wwaezpbzknVar3 = wwaezpbzkn.f37140iobyxmoadg;
                                                    ppxfxbqfkfVarDxjokdxxww3 = ppxfxbqfkfVarI2;
                                                } else {
                                                    if (ppxfxbqfkfVar3 == null) {
                                                        ppxfxbqfkfVar3 = new ipoelvxyzq.ppxfxbqfkf(new androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf[16], 0);
                                                    }
                                                    if (ppxfxbqfkfVarDxjokdxxww3 != null) {
                                                        ppxfxbqfkfVar3.zoijcleaow(ppxfxbqfkfVarDxjokdxxww3);
                                                        ppxfxbqfkfVarDxjokdxxww3 = null;
                                                    }
                                                    ppxfxbqfkfVar3.zoijcleaow(ppxfxbqfkfVarI2);
                                                }
                                            }
                                        }
                                        if (i15 == 1) {
                                        }
                                    }
                                    ppxfxbqfkfVarDxjokdxxww3 = z.gtknphoqwx.dxjokdxxww(ppxfxbqfkfVar3);
                                }
                            }
                            ppxfxbqfkfVarK1 = ppxfxbqfkfVarK1.k0();
                        }
                    }
                    pkzmftpjixVarRgvfuqvkyq3 = pkzmftpjixVarRgvfuqvkyq3.auzgnhcxok();
                    ppxfxbqfkfVarK1 = (pkzmftpjixVarRgvfuqvkyq3 == null || (okpsazkaxtVarWeqkydbzbr3 = pkzmftpjixVarRgvfuqvkyq3.weqkydbzbr()) == null) ? null : okpsazkaxtVarWeqkydbzbr3.ojitshcjhn();
                }
                if (arrayList != null) {
                    int size = arrayList.size() - 1;
                    if (size >= 0) {
                        while (true) {
                            int i16 = size - 1;
                            if (((r.eablkybsjg) arrayList.get(size)).rhgxfdycjh(keyEvent)) {
                                Trace.endSection();
                                return true;
                            }
                            if (i16 < 0) {
                                break;
                            }
                            size = i16;
                        }
                    }
                    wwaezpbzkn wwaezpbzknVar4 = wwaezpbzkn.f37140iobyxmoadg;
                }
                androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf ppxfxbqfkfVarWflxmlrfwp3 = ppxfxbqfkfVarWflxmlrfwp.wflxmlrfwp();
                hkdspvbjdz hkdspvbjdzVar = new hkdspvbjdz();
                hkdspvbjdz hkdspvbjdzVar2 = new hkdspvbjdz();
                hkdspvbjdzVar2.f60015zdlpuopuiu = ppxfxbqfkfVarWflxmlrfwp3;
                while (true) {
                    Object obj3 = hkdspvbjdzVar2.f60015zdlpuopuiu;
                    if (obj3 != null) {
                        if (obj3 instanceof r.eablkybsjg) {
                            if (((r.eablkybsjg) obj3).rhgxfdycjh(keyEvent)) {
                                Trace.endSection();
                                return true;
                            }
                        } else if ((((androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf) obj3).i0() & iIobyxmoadg3) != 0) {
                            Object obj4 = hkdspvbjdzVar2.f60015zdlpuopuiu;
                            if (obj4 instanceof z.wflxmlrfwp) {
                                int i17 = 0;
                                for (androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf ppxfxbqfkfVarI3 = ((z.wflxmlrfwp) obj4).I0(); ppxfxbqfkfVarI3 != null; ppxfxbqfkfVarI3 = ppxfxbqfkfVarI3.e0()) {
                                    if ((ppxfxbqfkfVarI3.i0() & iIobyxmoadg3) != 0) {
                                        i17++;
                                        if (i17 == 1) {
                                            hkdspvbjdzVar2.f60015zdlpuopuiu = ppxfxbqfkfVarI3;
                                            wwaezpbzkn wwaezpbzknVar5 = wwaezpbzkn.f37140iobyxmoadg;
                                        } else {
                                            ipoelvxyzq.ppxfxbqfkf ppxfxbqfkfVar4 = (ipoelvxyzq.ppxfxbqfkf) hkdspvbjdzVar.f60015zdlpuopuiu;
                                            if (ppxfxbqfkfVar4 == null) {
                                                ppxfxbqfkfVar4 = new ipoelvxyzq.ppxfxbqfkf(new androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf[16], 0);
                                            }
                                            hkdspvbjdzVar.f60015zdlpuopuiu = ppxfxbqfkfVar4;
                                            androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf ppxfxbqfkfVar5 = (androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf) hkdspvbjdzVar2.f60015zdlpuopuiu;
                                            if (ppxfxbqfkfVar5 != null) {
                                                ppxfxbqfkfVar4.zoijcleaow(ppxfxbqfkfVar5);
                                                hkdspvbjdzVar2.f60015zdlpuopuiu = null;
                                            }
                                            ipoelvxyzq.ppxfxbqfkf ppxfxbqfkfVar6 = (ipoelvxyzq.ppxfxbqfkf) hkdspvbjdzVar.f60015zdlpuopuiu;
                                            if (ppxfxbqfkfVar6 != null) {
                                                ppxfxbqfkfVar6.zoijcleaow(ppxfxbqfkfVarI3);
                                            }
                                        }
                                    }
                                }
                                if (i17 == 1) {
                                }
                            }
                        }
                        hkdspvbjdzVar2.f60015zdlpuopuiu = z.gtknphoqwx.dxjokdxxww((ipoelvxyzq.ppxfxbqfkf) hkdspvbjdzVar.f60015zdlpuopuiu);
                    } else {
                        if (((Boolean) iobyxmoadgVar.invoke()).booleanValue()) {
                            Trace.endSection();
                            return true;
                        }
                        androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf ppxfxbqfkfVarWflxmlrfwp4 = ppxfxbqfkfVarWflxmlrfwp.wflxmlrfwp();
                        hkdspvbjdz hkdspvbjdzVar3 = new hkdspvbjdz();
                        hkdspvbjdz hkdspvbjdzVar4 = new hkdspvbjdz();
                        hkdspvbjdzVar4.f60015zdlpuopuiu = ppxfxbqfkfVarWflxmlrfwp4;
                        while (true) {
                            Object obj5 = hkdspvbjdzVar4.f60015zdlpuopuiu;
                            if (obj5 == null) {
                                if (arrayList != null) {
                                    int size2 = arrayList.size();
                                    for (int i18 = 0; i18 < size2; i18++) {
                                        if (((r.eablkybsjg) arrayList.get(i18)).p(keyEvent)) {
                                            Trace.endSection();
                                            return true;
                                        }
                                    }
                                    wwaezpbzkn wwaezpbzknVar6 = wwaezpbzkn.f37140iobyxmoadg;
                                }
                                wwaezpbzkn wwaezpbzknVar7 = wwaezpbzkn.f37140iobyxmoadg;
                                break;
                            }
                            if (obj5 instanceof r.eablkybsjg) {
                                if (((r.eablkybsjg) obj5).p(keyEvent)) {
                                    Trace.endSection();
                                    return true;
                                }
                            } else if ((((androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf) obj5).i0() & iIobyxmoadg3) != 0) {
                                Object obj6 = hkdspvbjdzVar4.f60015zdlpuopuiu;
                                if (obj6 instanceof z.wflxmlrfwp) {
                                    int i19 = 0;
                                    for (androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf ppxfxbqfkfVarI4 = ((z.wflxmlrfwp) obj6).I0(); ppxfxbqfkfVarI4 != null; ppxfxbqfkfVarI4 = ppxfxbqfkfVarI4.e0()) {
                                        if ((ppxfxbqfkfVarI4.i0() & iIobyxmoadg3) != 0) {
                                            i19++;
                                            if (i19 == 1) {
                                                hkdspvbjdzVar4.f60015zdlpuopuiu = ppxfxbqfkfVarI4;
                                                wwaezpbzkn wwaezpbzknVar8 = wwaezpbzkn.f37140iobyxmoadg;
                                            } else {
                                                ipoelvxyzq.ppxfxbqfkf ppxfxbqfkfVar7 = (ipoelvxyzq.ppxfxbqfkf) hkdspvbjdzVar3.f60015zdlpuopuiu;
                                                if (ppxfxbqfkfVar7 == null) {
                                                    ppxfxbqfkfVar7 = new ipoelvxyzq.ppxfxbqfkf(new androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf[16], 0);
                                                }
                                                hkdspvbjdzVar3.f60015zdlpuopuiu = ppxfxbqfkfVar7;
                                                androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf ppxfxbqfkfVar8 = (androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf) hkdspvbjdzVar4.f60015zdlpuopuiu;
                                                if (ppxfxbqfkfVar8 != null) {
                                                    ppxfxbqfkfVar7.zoijcleaow(ppxfxbqfkfVar8);
                                                    hkdspvbjdzVar4.f60015zdlpuopuiu = null;
                                                }
                                                ipoelvxyzq.ppxfxbqfkf ppxfxbqfkfVar9 = (ipoelvxyzq.ppxfxbqfkf) hkdspvbjdzVar3.f60015zdlpuopuiu;
                                                if (ppxfxbqfkfVar9 != null) {
                                                    ppxfxbqfkfVar9.zoijcleaow(ppxfxbqfkfVarI4);
                                                }
                                            }
                                        }
                                    }
                                    if (i19 == 1) {
                                    }
                                }
                            }
                            hkdspvbjdzVar4.f60015zdlpuopuiu = z.gtknphoqwx.dxjokdxxww((ipoelvxyzq.ppxfxbqfkf) hkdspvbjdzVar3.f60015zdlpuopuiu);
                        }
                    }
                }
            }
            Trace.endSection();
            return false;
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    @Override // f.btonecajqb
    public jpowsppfya zdlpuopuiu() {
        return this.f6187lqeggnwhkg;
    }

    @Override // f.btonecajqb
    public void zoijcleaow() {
        this.f6186iobyxmoadg.zoijcleaow();
    }

    public boolean zynmafqrjb(int i13, g.lqeggnwhkg lqeggnwhkgVar) {
        Boolean boolBtonecajqb = btonecajqb(i13, lqeggnwhkgVar, new wkgbmnqykc(i13));
        if (boolBtonecajqb != null) {
            return boolBtonecajqb.booleanValue();
        }
        return false;
    }
}
