package w0;

/* JADX INFO: loaded from: classes.dex */
public interface wkgbmnqykc extends draadjrbmk {
    default float A(float f13) {
        return nufgyqmvbu.lqeggnwhkg(f13 / getDensity());
    }

    default float I(float f13) {
        return f13 * getDensity();
    }

    default long V(long j13) {
        if (j13 == 9205357640488583168L) {
            return g.gtknphoqwx.f35588zoijcleaow.iobyxmoadg();
        }
        float fI = I(gtknphoqwx.nufgyqmvbu(j13));
        return g.gtknphoqwx.wkgbmnqykc((((long) Float.floatToRawIntBits(I(gtknphoqwx.lqeggnwhkg(j13)))) & 4294967295L) | (Float.floatToRawIntBits(fI) << 32));
    }

    float getDensity();

    default int hszhottldk(float f13) {
        float fI = I(f13);
        if (Float.isInfinite(fI)) {
            return Integer.MAX_VALUE;
        }
        return Math.round(fI);
    }

    default long mbcevpiqjq(long j13) {
        return j13 != 9205357640488583168L ? dxjokdxxww.iobyxmoadg(A(Float.intBitsToFloat((int) (j13 >> 32))), A(Float.intBitsToFloat((int) (j13 & 4294967295L)))) : gtknphoqwx.f118255zoijcleaow.iobyxmoadg();
    }

    default float mhtqkkgtqm(long j13) {
        if (!cqumvgiudr.lqeggnwhkg(jyumaefscl.lqeggnwhkg(j13), cqumvgiudr.f118246zoijcleaow.zoijcleaow())) {
            wflxmlrfwp.zoijcleaow("Only Sp can convert to Px");
        }
        return I(vipkmwdibw(j13));
    }

    default long uwvvkdfqfp(float f13) {
        return tzroggbefp(A(f13));
    }

    default float x(int i13) {
        return nufgyqmvbu.lqeggnwhkg(i13 / getDensity());
    }
}
