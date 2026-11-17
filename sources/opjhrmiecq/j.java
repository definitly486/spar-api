package opjhrmiecq;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;

/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final String f73638iobyxmoadg = mj.kcexrzcfyt.lmojexxdyd("H", 10);

    public static final long iobyxmoadg(j0.n nVar, w0.wkgbmnqykc wkgbmnqykcVar, n0.wflxmlrfwp.zoijcleaow zoijcleaowVar, String str, int i13) {
        j0.istkbnxepw istkbnxepwVarIobyxmoadg = j0.wwaezpbzkn.iobyxmoadg(str, nVar, w0.ppxfxbqfkf.zoijcleaow(0, 0, 0, 0, 15, null), wkgbmnqykcVar, zoijcleaowVar, (64 & 32) != 0 ? hg.jyumaefscl.wflxmlrfwp() : hg.jyumaefscl.wflxmlrfwp(), (64 & 64) != 0 ? hg.jyumaefscl.wflxmlrfwp() : null, (64 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? Integer.MAX_VALUE : i13, (64 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? v0.jyumaefscl.f114986iobyxmoadg.iobyxmoadg() : v0.jyumaefscl.f114986iobyxmoadg.iobyxmoadg());
        return w0.oxmwwwfdhm.ppxfxbqfkf((((long) b.iobyxmoadg(istkbnxepwVarIobyxmoadg.zoijcleaow())) << 32) | (((long) b.iobyxmoadg(istkbnxepwVarIobyxmoadg.getHeight())) & 4294967295L));
    }

    public static final g.lqeggnwhkg ppxfxbqfkf(j0.f fVar, x.rgvfuqvkyq rgvfuqvkyqVar, int i13, tg.iobyxmoadg iobyxmoadgVar) {
        g.lqeggnwhkg lqeggnwhkgVarWkgbmnqykc;
        if (i13 < fVar.draadjrbmk().btonecajqb().length()) {
            lqeggnwhkgVarWkgbmnqykc = fVar.wkgbmnqykc(i13);
        } else {
            lqeggnwhkgVarWkgbmnqykc = i13 != 0 ? fVar.wkgbmnqykc(i13 - 1) : new g.lqeggnwhkg(0.0f, 0.0f, 1.0f, (int) (((w0.oxmwwwfdhm) iobyxmoadgVar.invoke()).btonecajqb() & 4294967295L));
        }
        long jOpjhrmiecq = rgvfuqvkyqVar.opjhrmiecq(g.eablkybsjg.eablkybsjg((((long) Float.floatToRawIntBits(lqeggnwhkgVarWkgbmnqykc.gtknphoqwx())) & 4294967295L) | (((long) Float.floatToRawIntBits(lqeggnwhkgVarWkgbmnqykc.nufgyqmvbu())) << 32)));
        return g.nufgyqmvbu.zoijcleaow(g.eablkybsjg.eablkybsjg((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jOpjhrmiecq >> 32)))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jOpjhrmiecq & 4294967295L)))) & 4294967295L)), g.gtknphoqwx.wkgbmnqykc((((long) Float.floatToRawIntBits(lqeggnwhkgVarWkgbmnqykc.eablkybsjg() - lqeggnwhkgVarWkgbmnqykc.gtknphoqwx())) & 4294967295L) | (((long) Float.floatToRawIntBits(lqeggnwhkgVarWkgbmnqykc.dxjokdxxww() - lqeggnwhkgVarWkgbmnqykc.nufgyqmvbu())) << 32)));
    }

    public static final String wkgbmnqykc() {
        return f73638iobyxmoadg;
    }

    public static /* synthetic */ long zoijcleaow(j0.n nVar, w0.wkgbmnqykc wkgbmnqykcVar, n0.wflxmlrfwp.zoijcleaow zoijcleaowVar, String str, int i13, int i14, Object obj) {
        if ((i14 & 8) != 0) {
            str = f73638iobyxmoadg;
        }
        if ((i14 & 16) != 0) {
            i13 = 1;
        }
        return iobyxmoadg(nVar, wkgbmnqykcVar, zoijcleaowVar, str, i13);
    }
}
