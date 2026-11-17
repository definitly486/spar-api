package androidx.compose.ui.focus;

import android.os.Trace;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import gg.wwaezpbzkn;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.hkdspvbjdz;
import z.okpsazkaxt;
import z.pkzmftpjix;
import z.ribwqtqdhb;
import z.rlfsiqarku;
import z.ydmasvzmpa;
import z.yfnezrywwk;

/* JADX INFO: loaded from: classes.dex */
public final class FocusTargetNode extends androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf implements z.nufgyqmvbu, vdvldrhtss, yfnezrywwk, y.nufgyqmvbu {

    /* JADX INFO: renamed from: cllcsxoeiz, reason: collision with root package name */
    private final boolean f6202cllcsxoeiz;

    /* JADX INFO: renamed from: dsvhmnatus, reason: collision with root package name */
    private int f6203dsvhmnatus;

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name */
    private boolean f6204hcddaimhww;

    /* JADX INFO: renamed from: hkdspvbjdz, reason: collision with root package name */
    private f.rgvfuqvkyq f6205hkdspvbjdz;

    /* JADX INFO: renamed from: jpowsppfya, reason: collision with root package name */
    private boolean f6206jpowsppfya;

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
    private final tg.draadjrbmk f6207pkzmftpjix;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
    private final tg.rgvfuqvkyq f6208ylkuphrtab;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/focus/FocusTargetNode$FocusTargetElement;", "Lz/ribwqtqdhb;", "Landroidx/compose/ui/focus/FocusTargetNode;", "<init>", "()V", "wflxmlrfwp", "()Landroidx/compose/ui/focus/FocusTargetNode;", "node", "Lgg/wwaezpbzkn;", "ojitshcjhn", "(Landroidx/compose/ui/focus/FocusTargetNode;)V", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class FocusTargetElement extends ribwqtqdhb {

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public static final FocusTargetElement f6209zoijcleaow = new FocusTargetElement();

        private FocusTargetElement() {
        }

        public boolean equals(Object other) {
            return other == this;
        }

        public int hashCode() {
            return 1739042953;
        }

        @Override // z.ribwqtqdhb
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public void draadjrbmk(FocusTargetNode node) {
        }

        @Override // z.ribwqtqdhb
        /* JADX INFO: renamed from: wflxmlrfwp, reason: merged with bridge method [inline-methods] */
        public FocusTargetNode btonecajqb() {
            return new FocusTargetNode(0, null, null, 7, null);
        }
    }

    public /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f6210iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public static final /* synthetic */ int[] f6211zoijcleaow;

        static {
            int[] iArr = new int[f.zoijcleaow.values().length];
            try {
                iArr[f.zoijcleaow.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[f.zoijcleaow.Redirected.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[f.zoijcleaow.Cancelled.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[f.zoijcleaow.RedirectCancelled.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f6210iobyxmoadg = iArr;
            int[] iArr2 = new int[f.rgvfuqvkyq.values().length];
            try {
                iArr2[f.rgvfuqvkyq.Active.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[f.rgvfuqvkyq.Captured.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[f.rgvfuqvkyq.ActiveParent.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[f.rgvfuqvkyq.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            f6211zoijcleaow = iArr2;
        }
    }

    static final class zoijcleaow extends kotlin.jvm.internal.jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ FocusTargetNode f6212yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ hkdspvbjdz f6213zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zoijcleaow(hkdspvbjdz hkdspvbjdzVar, FocusTargetNode focusTargetNode) {
            super(0);
            this.f6213zdlpuopuiu = hkdspvbjdzVar;
            this.f6212yggfygwlhe = focusTargetNode;
        }

        @Override // tg.iobyxmoadg
        public /* bridge */ /* synthetic */ Object invoke() {
            iobyxmoadg();
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg() {
            this.f6213zdlpuopuiu.f60015zdlpuopuiu = this.f6212yggfygwlhe.M0();
        }
    }

    public /* synthetic */ FocusTargetNode(int i13, tg.rgvfuqvkyq rgvfuqvkyqVar, tg.draadjrbmk draadjrbmkVar, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(i13, rgvfuqvkyqVar, draadjrbmkVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12, types: [androidx.compose.ui.wkgbmnqykc$ppxfxbqfkf] */
    /* JADX WARN: Type inference failed for: r10v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9, types: [androidx.compose.ui.wkgbmnqykc$ppxfxbqfkf] */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3, types: [ipoelvxyzq.ppxfxbqfkf] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6, types: [ipoelvxyzq.ppxfxbqfkf] */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r13v5 */
    public final void L0(f.ojitshcjhn ojitshcjhnVar, f.ojitshcjhn ojitshcjhnVar2) {
        okpsazkaxt okpsazkaxtVarWeqkydbzbr;
        tg.rgvfuqvkyq rgvfuqvkyqVar;
        f.btonecajqb focusOwner = z.gtknphoqwx.vdvldrhtss(this).getFocusOwner();
        FocusTargetNode focusTargetNodeNufgyqmvbu = focusOwner.nufgyqmvbu();
        if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(ojitshcjhnVar, ojitshcjhnVar2) && (rgvfuqvkyqVar = this.f6208ylkuphrtab) != null) {
            rgvfuqvkyqVar.invoke(ojitshcjhnVar, ojitshcjhnVar2);
        }
        int iIobyxmoadg = rlfsiqarku.iobyxmoadg(4096);
        int iIobyxmoadg2 = rlfsiqarku.iobyxmoadg(UserVerificationMethods.USER_VERIFY_ALL);
        androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf ppxfxbqfkfVarWflxmlrfwp = wflxmlrfwp();
        int i13 = iIobyxmoadg | iIobyxmoadg2;
        if (!wflxmlrfwp().n0()) {
            w.iobyxmoadg.zoijcleaow("visitAncestors called on an unattached node");
        }
        androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf ppxfxbqfkfVarWflxmlrfwp2 = wflxmlrfwp();
        pkzmftpjix pkzmftpjixVarRgvfuqvkyq = z.gtknphoqwx.rgvfuqvkyq(this);
        loop0: while (pkzmftpjixVarRgvfuqvkyq != null) {
            if ((pkzmftpjixVarRgvfuqvkyq.weqkydbzbr().gtknphoqwx().d0() & i13) != 0) {
                while (ppxfxbqfkfVarWflxmlrfwp2 != null) {
                    if ((ppxfxbqfkfVarWflxmlrfwp2.i0() & i13) != 0) {
                        if (ppxfxbqfkfVarWflxmlrfwp2 != ppxfxbqfkfVarWflxmlrfwp && (ppxfxbqfkfVarWflxmlrfwp2.i0() & iIobyxmoadg2) != 0) {
                            break loop0;
                        }
                        if ((ppxfxbqfkfVarWflxmlrfwp2.i0() & iIobyxmoadg) != 0) {
                            ?? Dxjokdxxww = ppxfxbqfkfVarWflxmlrfwp2;
                            ?? ppxfxbqfkfVar = 0;
                            while (Dxjokdxxww != 0) {
                                if (Dxjokdxxww instanceof f.wkgbmnqykc) {
                                    f.wkgbmnqykc wkgbmnqykcVar = (f.wkgbmnqykc) Dxjokdxxww;
                                    if (focusTargetNodeNufgyqmvbu == focusOwner.nufgyqmvbu()) {
                                        wkgbmnqykcVar.ipoelvxyzq(ojitshcjhnVar2);
                                    }
                                } else if ((Dxjokdxxww.i0() & iIobyxmoadg) != 0 && (Dxjokdxxww instanceof z.wflxmlrfwp)) {
                                    androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf ppxfxbqfkfVarI0 = ((z.wflxmlrfwp) Dxjokdxxww).I0();
                                    int i14 = 0;
                                    Dxjokdxxww = Dxjokdxxww;
                                    ppxfxbqfkfVar = ppxfxbqfkfVar;
                                    while (ppxfxbqfkfVarI0 != null) {
                                        if ((ppxfxbqfkfVarI0.i0() & iIobyxmoadg) != 0) {
                                            i14++;
                                            if (i14 == 1) {
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
                                        }
                                        ppxfxbqfkfVarI0 = ppxfxbqfkfVarI0.e0();
                                        Dxjokdxxww = Dxjokdxxww;
                                        ppxfxbqfkfVar = ppxfxbqfkfVar;
                                    }
                                    if (i14 == 1) {
                                    }
                                }
                                Dxjokdxxww = z.gtknphoqwx.dxjokdxxww(ppxfxbqfkfVar);
                            }
                        }
                    }
                    ppxfxbqfkfVarWflxmlrfwp2 = ppxfxbqfkfVarWflxmlrfwp2.k0();
                }
            }
            pkzmftpjixVarRgvfuqvkyq = pkzmftpjixVarRgvfuqvkyq.auzgnhcxok();
            ppxfxbqfkfVarWflxmlrfwp2 = (pkzmftpjixVarRgvfuqvkyq == null || (okpsazkaxtVarWeqkydbzbr = pkzmftpjixVarRgvfuqvkyq.weqkydbzbr()) == null) ? null : okpsazkaxtVarWeqkydbzbr.ojitshcjhn();
        }
        tg.draadjrbmk draadjrbmkVar = this.f6207pkzmftpjix;
        if (draadjrbmkVar != null) {
            draadjrbmkVar.invoke(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12, types: [androidx.compose.ui.wkgbmnqykc$ppxfxbqfkf] */
    /* JADX WARN: Type inference failed for: r7v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [androidx.compose.ui.wkgbmnqykc$ppxfxbqfkf] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [ipoelvxyzq.ppxfxbqfkf] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6, types: [ipoelvxyzq.ppxfxbqfkf] */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    public final dxjokdxxww M0() {
        okpsazkaxt okpsazkaxtVarWeqkydbzbr;
        btonecajqb btonecajqbVar = new btonecajqb();
        btonecajqbVar.gxszxtbevo(yggfygwlhe.wkgbmnqykc(P0(), this));
        int iIobyxmoadg = rlfsiqarku.iobyxmoadg(2048);
        int iIobyxmoadg2 = rlfsiqarku.iobyxmoadg(UserVerificationMethods.USER_VERIFY_ALL);
        androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf ppxfxbqfkfVarWflxmlrfwp = wflxmlrfwp();
        int i13 = iIobyxmoadg | iIobyxmoadg2;
        if (!wflxmlrfwp().n0()) {
            w.iobyxmoadg.zoijcleaow("visitAncestors called on an unattached node");
        }
        androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf ppxfxbqfkfVarWflxmlrfwp2 = wflxmlrfwp();
        pkzmftpjix pkzmftpjixVarRgvfuqvkyq = z.gtknphoqwx.rgvfuqvkyq(this);
        loop0: while (pkzmftpjixVarRgvfuqvkyq != null) {
            if ((pkzmftpjixVarRgvfuqvkyq.weqkydbzbr().gtknphoqwx().d0() & i13) != 0) {
                while (ppxfxbqfkfVarWflxmlrfwp2 != null) {
                    if ((ppxfxbqfkfVarWflxmlrfwp2.i0() & i13) != 0) {
                        if (ppxfxbqfkfVarWflxmlrfwp2 != ppxfxbqfkfVarWflxmlrfwp && (ppxfxbqfkfVarWflxmlrfwp2.i0() & iIobyxmoadg2) != 0) {
                            break loop0;
                        }
                        if ((ppxfxbqfkfVarWflxmlrfwp2.i0() & iIobyxmoadg) != 0) {
                            ?? Dxjokdxxww = ppxfxbqfkfVarWflxmlrfwp2;
                            ?? ppxfxbqfkfVar = 0;
                            while (Dxjokdxxww != 0) {
                                if (Dxjokdxxww instanceof f.gtknphoqwx) {
                                    ((f.gtknphoqwx) Dxjokdxxww).m(btonecajqbVar);
                                } else if ((Dxjokdxxww.i0() & iIobyxmoadg) != 0 && (Dxjokdxxww instanceof z.wflxmlrfwp)) {
                                    androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf ppxfxbqfkfVarI0 = ((z.wflxmlrfwp) Dxjokdxxww).I0();
                                    int i14 = 0;
                                    Dxjokdxxww = Dxjokdxxww;
                                    ppxfxbqfkfVar = ppxfxbqfkfVar;
                                    while (ppxfxbqfkfVarI0 != null) {
                                        if ((ppxfxbqfkfVarI0.i0() & iIobyxmoadg) != 0) {
                                            i14++;
                                            if (i14 == 1) {
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
                                        }
                                        ppxfxbqfkfVarI0 = ppxfxbqfkfVarI0.e0();
                                        Dxjokdxxww = Dxjokdxxww;
                                        ppxfxbqfkfVar = ppxfxbqfkfVar;
                                    }
                                    if (i14 == 1) {
                                    }
                                }
                                Dxjokdxxww = z.gtknphoqwx.dxjokdxxww(ppxfxbqfkfVar);
                            }
                        }
                    }
                    ppxfxbqfkfVarWflxmlrfwp2 = ppxfxbqfkfVarWflxmlrfwp2.k0();
                }
            }
            pkzmftpjixVarRgvfuqvkyq = pkzmftpjixVarRgvfuqvkyq.auzgnhcxok();
            ppxfxbqfkfVarWflxmlrfwp2 = (pkzmftpjixVarRgvfuqvkyq == null || (okpsazkaxtVarWeqkydbzbr = pkzmftpjixVarRgvfuqvkyq.weqkydbzbr()) == null) ? null : okpsazkaxtVarWeqkydbzbr.ojitshcjhn();
        }
        return btonecajqbVar;
    }

    public final x.ppxfxbqfkf N0() {
        return (x.ppxfxbqfkf) zynmafqrjb(x.wkgbmnqykc.iobyxmoadg());
    }

    @Override // androidx.compose.ui.focus.vdvldrhtss
    /* JADX INFO: renamed from: O0, reason: merged with bridge method [inline-methods] */
    public f.rgvfuqvkyq jlmebxxoox() {
        f.btonecajqb focusOwner;
        FocusTargetNode focusTargetNodeNufgyqmvbu;
        okpsazkaxt okpsazkaxtVarWeqkydbzbr;
        if (n0() && (focusTargetNodeNufgyqmvbu = (focusOwner = z.gtknphoqwx.vdvldrhtss(this).getFocusOwner()).nufgyqmvbu()) != null) {
            if (this == focusTargetNodeNufgyqmvbu) {
                return focusOwner.ojitshcjhn() ? f.rgvfuqvkyq.Captured : f.rgvfuqvkyq.Active;
            }
            if (focusTargetNodeNufgyqmvbu.n0()) {
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
                                androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf ppxfxbqfkfVarDxjokdxxww = ppxfxbqfkfVarK0;
                                ipoelvxyzq.ppxfxbqfkf ppxfxbqfkfVar = null;
                                while (ppxfxbqfkfVarDxjokdxxww != null) {
                                    if (ppxfxbqfkfVarDxjokdxxww instanceof FocusTargetNode) {
                                        if (this == ((FocusTargetNode) ppxfxbqfkfVarDxjokdxxww)) {
                                            return f.rgvfuqvkyq.ActiveParent;
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
            }
            return f.rgvfuqvkyq.Inactive;
        }
        return f.rgvfuqvkyq.Inactive;
    }

    public int P0() {
        return this.f6203dsvhmnatus;
    }

    public final void Q0() {
        dxjokdxxww dxjokdxxwwVar;
        int i13 = iobyxmoadg.f6211zoijcleaow[jlmebxxoox().ordinal()];
        if (i13 != 1 && i13 != 2) {
            if (i13 != 3 && i13 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            return;
        }
        hkdspvbjdz hkdspvbjdzVar = new hkdspvbjdz();
        ydmasvzmpa.iobyxmoadg(this, new zoijcleaow(hkdspvbjdzVar, this));
        Object obj = hkdspvbjdzVar.f60015zdlpuopuiu;
        if (obj == null) {
            kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("focusProperties");
            dxjokdxxwwVar = null;
        } else {
            dxjokdxxwwVar = (dxjokdxxww) obj;
        }
        if (dxjokdxxwwVar.lqeggnwhkg()) {
            return;
        }
        z.gtknphoqwx.vdvldrhtss(this).getFocusOwner().jyumaefscl(true);
    }

    @Override // androidx.compose.ui.focus.vdvldrhtss
    public boolean hkdspvbjdz(int i13) {
        Trace.beginSection("FocusTransactions:requestFocus");
        try {
            boolean zDxjokdxxww = false;
            if (!M0().lqeggnwhkg()) {
                Trace.endSection();
                return false;
            }
            int i14 = iobyxmoadg.f6210iobyxmoadg[kcexrzcfyt.nufgyqmvbu(this, i13).ordinal()];
            if (i14 == 1) {
                zDxjokdxxww = kcexrzcfyt.dxjokdxxww(this);
            } else if (i14 == 2) {
                zDxjokdxxww = true;
            } else if (i14 != 3 && i14 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            Trace.endSection();
            return zDxjokdxxww;
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    @Override // z.yfnezrywwk
    public void igdgnonuha() {
        Q0();
    }

    @Override // androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf
    public boolean l0() {
        return this.f6202cllcsxoeiz;
    }

    @Override // androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf
    public void r0() {
        int i13 = iobyxmoadg.f6211zoijcleaow[jlmebxxoox().ordinal()];
        if (i13 == 1 || i13 == 2) {
            f.btonecajqb focusOwner = z.gtknphoqwx.vdvldrhtss(this).getFocusOwner();
            focusOwner.rgvfuqvkyq(true, true, false, wkgbmnqykc.f6266zoijcleaow.ppxfxbqfkf());
            focusOwner.draadjrbmk();
        } else if (i13 != 3 && i13 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        this.f6205hkdspvbjdz = null;
    }

    @Override // androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf
    public void s0() {
        if (a.nufgyqmvbu.f56dxjokdxxww && jlmebxxoox().iobyxmoadg()) {
            z.gtknphoqwx.vdvldrhtss(this).getFocusOwner().rgvfuqvkyq(true, true, true, wkgbmnqykc.f6266zoijcleaow.ppxfxbqfkf());
        }
    }

    public /* synthetic */ FocusTargetNode(int i13, tg.rgvfuqvkyq rgvfuqvkyqVar, tg.draadjrbmk draadjrbmkVar, int i14, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this((i14 & 1) != 0 ? yggfygwlhe.f6268iobyxmoadg.iobyxmoadg() : i13, (i14 & 2) != 0 ? null : rgvfuqvkyqVar, (i14 & 4) != 0 ? null : draadjrbmkVar, null);
    }

    private FocusTargetNode(int i13, tg.rgvfuqvkyq rgvfuqvkyqVar, tg.draadjrbmk draadjrbmkVar) {
        this.f6208ylkuphrtab = rgvfuqvkyqVar;
        this.f6207pkzmftpjix = draadjrbmkVar;
        this.f6203dsvhmnatus = i13;
    }
}
