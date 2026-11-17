package j0;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public static final iobyxmoadg f50220gxszxtbevo = new iobyxmoadg(null);

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final d f50221eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final n0.wflxmlrfwp.zoijcleaow f50222iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final w0.zdlpuopuiu f50223ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final int f50224wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final w0.wkgbmnqykc f50225zoijcleaow;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final f zoijcleaow(e eVar) {
            cqumvgiudr cqumvgiudrVar = new cqumvgiudr(eVar.btonecajqb(), o.wkgbmnqykc(eVar.dxjokdxxww(), eVar.wkgbmnqykc()), eVar.lqeggnwhkg(), eVar.zoijcleaow(), eVar.ppxfxbqfkf());
            int iAgtfadlqog = w0.zoijcleaow.agtfadlqog(eVar.iobyxmoadg());
            int iDraadjrbmk = ((eVar.nufgyqmvbu() || j.zoijcleaow(eVar.gxszxtbevo())) && w0.zoijcleaow.nufgyqmvbu(eVar.iobyxmoadg())) ? w0.zoijcleaow.draadjrbmk(eVar.iobyxmoadg()) : Integer.MAX_VALUE;
            int iEablkybsjg = (eVar.nufgyqmvbu() || !j.zoijcleaow(eVar.gxszxtbevo())) ? eVar.eablkybsjg() : 1;
            if (iAgtfadlqog != iDraadjrbmk) {
                iDraadjrbmk = zg.gtknphoqwx.agtfadlqog(wwaezpbzkn.wkgbmnqykc(cqumvgiudrVar.iobyxmoadg()), iAgtfadlqog, iDraadjrbmk);
            }
            yggfygwlhe yggfygwlheVar = new yggfygwlhe(cqumvgiudrVar, w0.zoijcleaow.f118283zoijcleaow.zoijcleaow(0, iDraadjrbmk, 0, w0.zoijcleaow.gtknphoqwx(eVar.iobyxmoadg())), iEablkybsjg, eVar.gxszxtbevo(), null);
            return new f(eVar, yggfygwlheVar, w0.ppxfxbqfkf.wkgbmnqykc(eVar.iobyxmoadg(), w0.oxmwwwfdhm.ppxfxbqfkf((((long) ((int) Math.ceil(yggfygwlheVar.gtknphoqwx()))) & 4294967295L) | (((long) ((int) Math.ceil(yggfygwlheVar.wwaezpbzkn()))) << 32))), null);
        }

        private iobyxmoadg() {
        }
    }

    public h(n0.wflxmlrfwp.zoijcleaow zoijcleaowVar, w0.wkgbmnqykc wkgbmnqykcVar, w0.zdlpuopuiu zdlpuopuiuVar, int i13) {
        this.f50222iobyxmoadg = zoijcleaowVar;
        this.f50225zoijcleaow = wkgbmnqykcVar;
        this.f50223ppxfxbqfkf = zdlpuopuiuVar;
        this.f50224wkgbmnqykc = i13;
        this.f50221eablkybsjg = i13 > 0 ? new d(i13) : null;
    }

    public static /* synthetic */ f wkgbmnqykc(h hVar, eablkybsjg eablkybsjgVar, n nVar, int i13, boolean z13, int i14, List list, long j13, w0.zdlpuopuiu zdlpuopuiuVar, w0.wkgbmnqykc wkgbmnqykcVar, n0.wflxmlrfwp.zoijcleaow zoijcleaowVar, boolean z14, int i15, Object obj) {
        return hVar.ppxfxbqfkf(eablkybsjgVar, (i15 & 2) != 0 ? n.f50293wkgbmnqykc.iobyxmoadg() : nVar, (i15 & 4) != 0 ? v0.jyumaefscl.f114986iobyxmoadg.iobyxmoadg() : i13, (i15 & 8) != 0 ? true : z13, (i15 & 16) != 0 ? Integer.MAX_VALUE : i14, (i15 & 32) != 0 ? hg.jyumaefscl.wflxmlrfwp() : list, (i15 & 64) != 0 ? w0.ppxfxbqfkf.zoijcleaow(0, 0, 0, 0, 15, null) : j13, (i15 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? hVar.f50223ppxfxbqfkf : zdlpuopuiuVar, (i15 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? hVar.f50225zoijcleaow : wkgbmnqykcVar, (i15 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? hVar.f50222iobyxmoadg : zoijcleaowVar, (i15 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? false : z14);
    }

    public final f iobyxmoadg(String str, n nVar, int i13, boolean z13, int i14, long j13, w0.zdlpuopuiu zdlpuopuiuVar, w0.wkgbmnqykc wkgbmnqykcVar, n0.wflxmlrfwp.zoijcleaow zoijcleaowVar, boolean z14) {
        return wkgbmnqykc(this, new eablkybsjg(str, null, 2, null), nVar, i13, z13, i14, null, j13, zdlpuopuiuVar, wkgbmnqykcVar, zoijcleaowVar, z14, 32, null);
    }

    public final f ppxfxbqfkf(eablkybsjg eablkybsjgVar, n nVar, int i13, boolean z13, int i14, List list, long j13, w0.zdlpuopuiu zdlpuopuiuVar, w0.wkgbmnqykc wkgbmnqykcVar, n0.wflxmlrfwp.zoijcleaow zoijcleaowVar, boolean z14) {
        d dVar;
        e eVar = new e(eablkybsjgVar, nVar, list, i14, z13, i13, wkgbmnqykcVar, zdlpuopuiuVar, zoijcleaowVar, j13, (kotlin.jvm.internal.gtknphoqwx) null);
        f fVarIobyxmoadg = (z14 || (dVar = this.f50221eablkybsjg) == null) ? null : dVar.iobyxmoadg(eVar);
        if (fVarIobyxmoadg != null) {
            return fVarIobyxmoadg.iobyxmoadg(eVar, w0.ppxfxbqfkf.wkgbmnqykc(j13, w0.oxmwwwfdhm.ppxfxbqfkf((((long) wwaezpbzkn.wkgbmnqykc(fVarIobyxmoadg.iwizpuwonk().gtknphoqwx())) & 4294967295L) | (((long) wwaezpbzkn.wkgbmnqykc(fVarIobyxmoadg.iwizpuwonk().wwaezpbzkn())) << 32))));
        }
        f fVarZoijcleaow = f50220gxszxtbevo.zoijcleaow(eVar);
        d dVar2 = this.f50221eablkybsjg;
        if (dVar2 == null) {
            return fVarZoijcleaow;
        }
        dVar2.zoijcleaow(eVar, fVarZoijcleaow);
        return fVarZoijcleaow;
    }
}
