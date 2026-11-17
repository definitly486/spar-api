package w0;

/* JADX INFO: loaded from: classes.dex */
public abstract class iwizpuwonk {
    public static final long btonecajqb(long j13, long j14, float f13) {
        ppxfxbqfkf(j13, j14);
        return gtknphoqwx(jyumaefscl.gxszxtbevo(j13), y0.wkgbmnqykc.zoijcleaow(jyumaefscl.nufgyqmvbu(j13), jyumaefscl.nufgyqmvbu(j14), f13));
    }

    public static final long dxjokdxxww(int i13) {
        return gtknphoqwx(4294967296L, i13);
    }

    public static final long eablkybsjg(float f13) {
        return gtknphoqwx(8589934592L, f13);
    }

    public static final long gtknphoqwx(long j13, float f13) {
        return jyumaefscl.ppxfxbqfkf(j13 | (((long) Float.floatToRawIntBits(f13)) & 4294967295L));
    }

    public static final long gxszxtbevo(int i13) {
        return gtknphoqwx(8589934592L, i13);
    }

    public static final long iobyxmoadg(float f13, long j13) {
        return gtknphoqwx(j13, f13);
    }

    public static final long lqeggnwhkg(double d13) {
        return gtknphoqwx(4294967296L, (float) d13);
    }

    public static final long nufgyqmvbu(float f13) {
        return gtknphoqwx(4294967296L, f13);
    }

    public static final void ppxfxbqfkf(long j13, long j14) {
        if (!((jyumaefscl.gxszxtbevo(j13) == 0 || jyumaefscl.gxszxtbevo(j14) == 0) ? false : true)) {
            wflxmlrfwp.iobyxmoadg("Cannot perform operation for Unspecified type.");
        }
        if (cqumvgiudr.lqeggnwhkg(jyumaefscl.lqeggnwhkg(j13), jyumaefscl.lqeggnwhkg(j14))) {
            return;
        }
        wflxmlrfwp.iobyxmoadg("Cannot perform operation for " + ((Object) cqumvgiudr.dxjokdxxww(jyumaefscl.lqeggnwhkg(j13))) + " and " + ((Object) cqumvgiudr.dxjokdxxww(jyumaefscl.lqeggnwhkg(j14))));
    }

    public static final long wkgbmnqykc(double d13) {
        return gtknphoqwx(8589934592L, (float) d13);
    }

    public static final void zoijcleaow(long j13) {
        if (jyumaefscl.gxszxtbevo(j13) == 0) {
            wflxmlrfwp.iobyxmoadg("Cannot perform operation for Unspecified type.");
        }
    }
}
