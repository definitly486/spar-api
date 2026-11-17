package j0;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public abstract class o {

    public /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f50301iobyxmoadg;

        static {
            int[] iArr = new int[w0.zdlpuopuiu.values().length];
            try {
                iArr[w0.zdlpuopuiu.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[w0.zdlpuopuiu.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f50301iobyxmoadg = iArr;
        }
    }

    public static final int eablkybsjg(w0.zdlpuopuiu zdlpuopuiuVar, int i13) {
        v0.draadjrbmk.iobyxmoadg iobyxmoadgVar = v0.draadjrbmk.f114942zoijcleaow;
        if (v0.draadjrbmk.btonecajqb(i13, iobyxmoadgVar.iobyxmoadg())) {
            int i14 = iobyxmoadg.f50301iobyxmoadg[zdlpuopuiuVar.ordinal()];
            if (i14 == 1) {
                return iobyxmoadgVar.zoijcleaow();
            }
            if (i14 == 2) {
                return iobyxmoadgVar.ppxfxbqfkf();
            }
            throw new NoWhenBranchMatchedException();
        }
        if (!v0.draadjrbmk.btonecajqb(i13, iobyxmoadgVar.gxszxtbevo())) {
            return i13;
        }
        int i15 = iobyxmoadg.f50301iobyxmoadg[zdlpuopuiuVar.ordinal()];
        if (i15 == 1) {
            return iobyxmoadgVar.wkgbmnqykc();
        }
        if (i15 == 2) {
            return iobyxmoadgVar.eablkybsjg();
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final n ppxfxbqfkf(n nVar, n nVar2, float f13) {
        return new n(ezmngbhpjk.ppxfxbqfkf(nVar.cllcsxoeiz(), nVar2.cllcsxoeiz(), f13), pkzmftpjix.zoijcleaow(nVar.hkdspvbjdz(), nVar2.hkdspvbjdz(), f13));
    }

    public static final n wkgbmnqykc(n nVar, w0.zdlpuopuiu zdlpuopuiuVar) {
        return new n(ezmngbhpjk.nufgyqmvbu(nVar.esjtqupxsv()), pkzmftpjix.eablkybsjg(nVar.jyumaefscl(), zdlpuopuiuVar), nVar.iwizpuwonk());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final cllcsxoeiz zoijcleaow(hkdspvbjdz hkdspvbjdzVar, jpowsppfya jpowsppfyaVar) {
        if (hkdspvbjdzVar == null && jpowsppfyaVar == null) {
            return null;
        }
        return wkgbmnqykc.iobyxmoadg(hkdspvbjdzVar, jpowsppfyaVar);
    }
}
