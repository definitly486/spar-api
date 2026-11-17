package j;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import g.draadjrbmk;
import h.dvvnrvtcbc;
import h.ixidwrxhsl;
import h.jztzpxfvev;
import h.mhtqkkgtqm;
import h.roivzttewh;
import w0.agtfadlqog;
import w0.oxmwwwfdhm;
import w0.zdlpuopuiu;

/* JADX INFO: loaded from: classes.dex */
public interface gxszxtbevo extends w0.wkgbmnqykc {

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public static final iobyxmoadg f50103lqeggnwhkg = iobyxmoadg.f50104iobyxmoadg;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final /* synthetic */ iobyxmoadg f50104iobyxmoadg = new iobyxmoadg();

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private static final int f50106zoijcleaow = androidx.compose.ui.graphics.ppxfxbqfkf.f6357iobyxmoadg.zynmafqrjb();

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private static final int f50105ppxfxbqfkf = roivzttewh.f38955iobyxmoadg.iobyxmoadg();

        private iobyxmoadg() {
        }

        public final int iobyxmoadg() {
            return f50106zoijcleaow;
        }

        public final int zoijcleaow() {
            return f50105ppxfxbqfkf;
        }
    }

    private default long C(long j13, long j14) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j13 >> 32)) - Float.intBitsToFloat((int) (j14 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j13 & 4294967295L)) - Float.intBitsToFloat((int) (j14 & 4294967295L));
        return g.gtknphoqwx.wkgbmnqykc((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L));
    }

    static /* synthetic */ void a(gxszxtbevo gxszxtbevoVar, jztzpxfvev jztzpxfvevVar, long j13, long j14, float f13, lqeggnwhkg lqeggnwhkgVar, androidx.compose.ui.graphics.wkgbmnqykc wkgbmnqykcVar, int i13, int i14, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRect-AsUm42w");
        }
        long jPpxfxbqfkf = (i14 & 2) != 0 ? g.eablkybsjg.f35584zoijcleaow.ppxfxbqfkf() : j13;
        gxszxtbevoVar.fyldjkxazc(jztzpxfvevVar, jPpxfxbqfkf, (i14 & 4) != 0 ? gxszxtbevoVar.C(gxszxtbevoVar.zoijcleaow(), jPpxfxbqfkf) : j14, (i14 & 8) != 0 ? 1.0f : f13, (i14 & 16) != 0 ? btonecajqb.f50092iobyxmoadg : lqeggnwhkgVar, (i14 & 32) != 0 ? null : wkgbmnqykcVar, (i14 & 64) != 0 ? f50103lqeggnwhkg.iobyxmoadg() : i13);
    }

    static /* synthetic */ void auzgnhcxok(gxszxtbevo gxszxtbevoVar, mhtqkkgtqm mhtqkkgtqmVar, long j13, float f13, lqeggnwhkg lqeggnwhkgVar, androidx.compose.ui.graphics.wkgbmnqykc wkgbmnqykcVar, int i13, int i14, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawPath-LG529CI");
        }
        gxszxtbevoVar.g(mhtqkkgtqmVar, j13, (i14 & 4) != 0 ? 1.0f : f13, (i14 & 8) != 0 ? btonecajqb.f50092iobyxmoadg : lqeggnwhkgVar, (i14 & 16) != 0 ? null : wkgbmnqykcVar, (i14 & 32) != 0 ? f50103lqeggnwhkg.iobyxmoadg() : i13);
    }

    static /* synthetic */ void crxdokpmqz(gxszxtbevo gxszxtbevoVar, dvvnrvtcbc dvvnrvtcbcVar, long j13, long j14, long j15, long j16, float f13, lqeggnwhkg lqeggnwhkgVar, androidx.compose.ui.graphics.wkgbmnqykc wkgbmnqykcVar, int i13, int i14, int i15, Object obj) {
        long jPpxfxbqfkf;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawImage-AZ2fEMs");
        }
        long jZoijcleaow = (i15 & 2) != 0 ? agtfadlqog.f118237zoijcleaow.zoijcleaow() : j13;
        if ((i15 & 4) != 0) {
            jPpxfxbqfkf = oxmwwwfdhm.ppxfxbqfkf((((long) dvvnrvtcbcVar.getHeight()) & 4294967295L) | (((long) dvvnrvtcbcVar.getWidth()) << 32));
        } else {
            jPpxfxbqfkf = j14;
        }
        gxszxtbevoVar.G(dvvnrvtcbcVar, jZoijcleaow, jPpxfxbqfkf, (i15 & 8) != 0 ? agtfadlqog.f118237zoijcleaow.zoijcleaow() : j15, (i15 & 16) != 0 ? jPpxfxbqfkf : j16, (i15 & 32) != 0 ? 1.0f : f13, (i15 & 64) != 0 ? btonecajqb.f50092iobyxmoadg : lqeggnwhkgVar, (i15 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : wkgbmnqykcVar, (i15 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? f50103lqeggnwhkg.iobyxmoadg() : i13, (i15 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? f50103lqeggnwhkg.zoijcleaow() : i14);
    }

    static /* synthetic */ void jztzpxfvev(gxszxtbevo gxszxtbevoVar, long j13, float f13, long j14, float f14, lqeggnwhkg lqeggnwhkgVar, androidx.compose.ui.graphics.wkgbmnqykc wkgbmnqykcVar, int i13, int i14, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawCircle-VaOC9Bg");
        }
        gxszxtbevoVar.J(j13, (i14 & 2) != 0 ? g.gtknphoqwx.btonecajqb(gxszxtbevoVar.zoijcleaow()) / 2.0f : f13, (i14 & 4) != 0 ? gxszxtbevoVar.Q() : j14, (i14 & 8) != 0 ? 1.0f : f14, (i14 & 16) != 0 ? btonecajqb.f50092iobyxmoadg : lqeggnwhkgVar, (i14 & 32) != 0 ? null : wkgbmnqykcVar, (i14 & 64) != 0 ? f50103lqeggnwhkg.iobyxmoadg() : i13);
    }

    static /* synthetic */ void krqnebusok(gxszxtbevo gxszxtbevoVar, jztzpxfvev jztzpxfvevVar, long j13, long j14, long j15, float f13, lqeggnwhkg lqeggnwhkgVar, androidx.compose.ui.graphics.wkgbmnqykc wkgbmnqykcVar, int i13, int i14, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRoundRect-ZuiqVtQ");
        }
        long jPpxfxbqfkf = (i14 & 2) != 0 ? g.eablkybsjg.f35584zoijcleaow.ppxfxbqfkf() : j13;
        gxszxtbevoVar.D(jztzpxfvevVar, jPpxfxbqfkf, (i14 & 4) != 0 ? gxszxtbevoVar.C(gxszxtbevoVar.zoijcleaow(), jPpxfxbqfkf) : j14, (i14 & 8) != 0 ? g.iobyxmoadg.f35590iobyxmoadg.iobyxmoadg() : j15, (i14 & 16) != 0 ? 1.0f : f13, (i14 & 32) != 0 ? btonecajqb.f50092iobyxmoadg : lqeggnwhkgVar, (i14 & 64) != 0 ? null : wkgbmnqykcVar, (i14 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? f50103lqeggnwhkg.iobyxmoadg() : i13);
    }

    static /* synthetic */ void okpsazkaxt(gxszxtbevo gxszxtbevoVar, long j13, float f13, float f14, boolean z13, long j14, long j15, float f15, lqeggnwhkg lqeggnwhkgVar, androidx.compose.ui.graphics.wkgbmnqykc wkgbmnqykcVar, int i13, int i14, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawArc-yD3GUKo");
        }
        long jPpxfxbqfkf = (i14 & 16) != 0 ? g.eablkybsjg.f35584zoijcleaow.ppxfxbqfkf() : j14;
        gxszxtbevoVar.iwxlajgraz(j13, f13, f14, z13, jPpxfxbqfkf, (i14 & 32) != 0 ? gxszxtbevoVar.C(gxszxtbevoVar.zoijcleaow(), jPpxfxbqfkf) : j15, (i14 & 64) != 0 ? 1.0f : f15, (i14 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? btonecajqb.f50092iobyxmoadg : lqeggnwhkgVar, (i14 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? null : wkgbmnqykcVar, (i14 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? f50103lqeggnwhkg.iobyxmoadg() : i13);
    }

    static /* synthetic */ void q(gxszxtbevo gxszxtbevoVar, jztzpxfvev jztzpxfvevVar, long j13, long j14, float f13, int i13, ixidwrxhsl ixidwrxhslVar, float f14, androidx.compose.ui.graphics.wkgbmnqykc wkgbmnqykcVar, int i14, int i15, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawLine-1RTmtNc");
        }
        gxszxtbevoVar.jhduphickx(jztzpxfvevVar, j13, j14, (i15 & 8) != 0 ? 0.0f : f13, (i15 & 16) != 0 ? gtknphoqwx.f50095gxszxtbevo.iobyxmoadg() : i13, (i15 & 32) != 0 ? null : ixidwrxhslVar, (i15 & 64) != 0 ? 1.0f : f14, (i15 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : wkgbmnqykcVar, (i15 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? f50103lqeggnwhkg.iobyxmoadg() : i14);
    }

    static /* synthetic */ void ribwqtqdhb(gxszxtbevo gxszxtbevoVar, long j13, long j14, long j15, float f13, lqeggnwhkg lqeggnwhkgVar, androidx.compose.ui.graphics.wkgbmnqykc wkgbmnqykcVar, int i13, int i14, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRect-n-J9OG0");
        }
        long jPpxfxbqfkf = (i14 & 2) != 0 ? g.eablkybsjg.f35584zoijcleaow.ppxfxbqfkf() : j14;
        gxszxtbevoVar.O(j13, jPpxfxbqfkf, (i14 & 4) != 0 ? gxszxtbevoVar.C(gxszxtbevoVar.zoijcleaow(), jPpxfxbqfkf) : j15, (i14 & 8) != 0 ? 1.0f : f13, (i14 & 16) != 0 ? btonecajqb.f50092iobyxmoadg : lqeggnwhkgVar, (i14 & 32) != 0 ? null : wkgbmnqykcVar, (i14 & 64) != 0 ? f50103lqeggnwhkg.iobyxmoadg() : i13);
    }

    static /* synthetic */ void sopmlzcsov(gxszxtbevo gxszxtbevoVar, long j13, long j14, long j15, long j16, lqeggnwhkg lqeggnwhkgVar, float f13, androidx.compose.ui.graphics.wkgbmnqykc wkgbmnqykcVar, int i13, int i14, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRoundRect-u-Aw5IA");
        }
        long jPpxfxbqfkf = (i14 & 2) != 0 ? g.eablkybsjg.f35584zoijcleaow.ppxfxbqfkf() : j14;
        gxszxtbevoVar.roivzttewh(j13, jPpxfxbqfkf, (i14 & 4) != 0 ? gxszxtbevoVar.C(gxszxtbevoVar.zoijcleaow(), jPpxfxbqfkf) : j15, (i14 & 8) != 0 ? g.iobyxmoadg.f35590iobyxmoadg.iobyxmoadg() : j16, (i14 & 16) != 0 ? btonecajqb.f50092iobyxmoadg : lqeggnwhkgVar, (i14 & 32) != 0 ? 1.0f : f13, (i14 & 64) != 0 ? null : wkgbmnqykcVar, (i14 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? f50103lqeggnwhkg.iobyxmoadg() : i13);
    }

    static /* synthetic */ void u(gxszxtbevo gxszxtbevoVar, dvvnrvtcbc dvvnrvtcbcVar, long j13, float f13, lqeggnwhkg lqeggnwhkgVar, androidx.compose.ui.graphics.wkgbmnqykc wkgbmnqykcVar, int i13, int i14, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawImage-gbVJVH8");
        }
        gxszxtbevoVar.ageimvtcrz(dvvnrvtcbcVar, (i14 & 2) != 0 ? g.eablkybsjg.f35584zoijcleaow.ppxfxbqfkf() : j13, (i14 & 4) != 0 ? 1.0f : f13, (i14 & 8) != 0 ? btonecajqb.f50092iobyxmoadg : lqeggnwhkgVar, (i14 & 16) != 0 ? null : wkgbmnqykcVar, (i14 & 32) != 0 ? f50103lqeggnwhkg.iobyxmoadg() : i13);
    }

    static /* synthetic */ void uawqvzlxes(gxszxtbevo gxszxtbevoVar, long j13, long j14, long j15, float f13, int i13, ixidwrxhsl ixidwrxhslVar, float f14, androidx.compose.ui.graphics.wkgbmnqykc wkgbmnqykcVar, int i14, int i15, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawLine-NGM6Ib0");
        }
        gxszxtbevoVar.ulzqkzuiru(j13, j14, j15, (i15 & 8) != 0 ? 0.0f : f13, (i15 & 16) != 0 ? gtknphoqwx.f50095gxszxtbevo.iobyxmoadg() : i13, (i15 & 32) != 0 ? null : ixidwrxhslVar, (i15 & 64) != 0 ? 1.0f : f14, (i15 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : wkgbmnqykcVar, (i15 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? f50103lqeggnwhkg.iobyxmoadg() : i14);
    }

    static /* synthetic */ void y(gxszxtbevo gxszxtbevoVar, mhtqkkgtqm mhtqkkgtqmVar, jztzpxfvev jztzpxfvevVar, float f13, lqeggnwhkg lqeggnwhkgVar, androidx.compose.ui.graphics.wkgbmnqykc wkgbmnqykcVar, int i13, int i14, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawPath-GBMwjPU");
        }
        if ((i14 & 4) != 0) {
            f13 = 1.0f;
        }
        float f14 = f13;
        if ((i14 & 8) != 0) {
            lqeggnwhkgVar = btonecajqb.f50092iobyxmoadg;
        }
        lqeggnwhkg lqeggnwhkgVar2 = lqeggnwhkgVar;
        if ((i14 & 16) != 0) {
            wkgbmnqykcVar = null;
        }
        androidx.compose.ui.graphics.wkgbmnqykc wkgbmnqykcVar2 = wkgbmnqykcVar;
        if ((i14 & 32) != 0) {
            i13 = f50103lqeggnwhkg.iobyxmoadg();
        }
        gxszxtbevoVar.kegysxyocb(mhtqkkgtqmVar, jztzpxfvevVar, f14, lqeggnwhkgVar2, wkgbmnqykcVar2, i13);
    }

    void D(jztzpxfvev jztzpxfvevVar, long j13, long j14, long j15, float f13, lqeggnwhkg lqeggnwhkgVar, androidx.compose.ui.graphics.wkgbmnqykc wkgbmnqykcVar, int i13);

    void G(dvvnrvtcbc dvvnrvtcbcVar, long j13, long j14, long j15, long j16, float f13, lqeggnwhkg lqeggnwhkgVar, androidx.compose.ui.graphics.wkgbmnqykc wkgbmnqykcVar, int i13, int i14);

    void J(long j13, float f13, long j14, float f14, lqeggnwhkg lqeggnwhkgVar, androidx.compose.ui.graphics.wkgbmnqykc wkgbmnqykcVar, int i13);

    wkgbmnqykc K();

    void O(long j13, long j14, long j15, float f13, lqeggnwhkg lqeggnwhkgVar, androidx.compose.ui.graphics.wkgbmnqykc wkgbmnqykcVar, int i13);

    default long Q() {
        return draadjrbmk.zoijcleaow(K().zoijcleaow());
    }

    void ageimvtcrz(dvvnrvtcbc dvvnrvtcbcVar, long j13, float f13, lqeggnwhkg lqeggnwhkgVar, androidx.compose.ui.graphics.wkgbmnqykc wkgbmnqykcVar, int i13);

    void fyldjkxazc(jztzpxfvev jztzpxfvevVar, long j13, long j14, float f13, lqeggnwhkg lqeggnwhkgVar, androidx.compose.ui.graphics.wkgbmnqykc wkgbmnqykcVar, int i13);

    void g(mhtqkkgtqm mhtqkkgtqmVar, long j13, float f13, lqeggnwhkg lqeggnwhkgVar, androidx.compose.ui.graphics.wkgbmnqykc wkgbmnqykcVar, int i13);

    zdlpuopuiu getLayoutDirection();

    void iwxlajgraz(long j13, float f13, float f14, boolean z13, long j14, long j15, float f15, lqeggnwhkg lqeggnwhkgVar, androidx.compose.ui.graphics.wkgbmnqykc wkgbmnqykcVar, int i13);

    void jhduphickx(jztzpxfvev jztzpxfvevVar, long j13, long j14, float f13, int i13, ixidwrxhsl ixidwrxhslVar, float f14, androidx.compose.ui.graphics.wkgbmnqykc wkgbmnqykcVar, int i14);

    void kegysxyocb(mhtqkkgtqm mhtqkkgtqmVar, jztzpxfvev jztzpxfvevVar, float f13, lqeggnwhkg lqeggnwhkgVar, androidx.compose.ui.graphics.wkgbmnqykc wkgbmnqykcVar, int i13);

    void roivzttewh(long j13, long j14, long j15, long j16, lqeggnwhkg lqeggnwhkgVar, float f13, androidx.compose.ui.graphics.wkgbmnqykc wkgbmnqykcVar, int i13);

    void ulzqkzuiru(long j13, long j14, long j15, float f13, int i13, ixidwrxhsl ixidwrxhslVar, float f14, androidx.compose.ui.graphics.wkgbmnqykc wkgbmnqykcVar, int i14);

    default long zoijcleaow() {
        return K().zoijcleaow();
    }
}
