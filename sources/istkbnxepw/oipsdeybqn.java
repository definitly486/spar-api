package istkbnxepw;

import android.util.Size;

/* JADX INFO: loaded from: classes.dex */
public abstract class oipsdeybqn {

    public enum iobyxmoadg {
        VGA(0),
        s720p(1),
        PREVIEW(2),
        s1440p(3),
        RECORD(4),
        MAXIMUM(5),
        ULTRA_MAXIMUM(6),
        NOT_SUPPORT(7);


        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final int f49391zdlpuopuiu;

        iobyxmoadg(int i13) {
            this.f49391zdlpuopuiu = i13;
        }

        int wkgbmnqykc() {
            return this.f49391zdlpuopuiu;
        }
    }

    public enum zoijcleaow {
        PRIV,
        YUV,
        JPEG,
        JPEG_R,
        RAW
    }

    oipsdeybqn() {
    }

    public static zoijcleaow eablkybsjg(int i13) {
        if (i13 == 35) {
            return zoijcleaow.YUV;
        }
        if (i13 == 256) {
            return zoijcleaow.JPEG;
        }
        if (i13 == 4101) {
            return zoijcleaow.JPEG_R;
        }
        return i13 == 32 ? zoijcleaow.RAW : zoijcleaow.PRIV;
    }

    public static oipsdeybqn iobyxmoadg(zoijcleaow zoijcleaowVar, iobyxmoadg iobyxmoadgVar) {
        return new gxszxtbevo(zoijcleaowVar, iobyxmoadgVar, 0L);
    }

    public static oipsdeybqn nufgyqmvbu(int i13, int i14, Size size, bfopjjpdmp bfopjjpdmpVar) {
        zoijcleaow zoijcleaowVarEablkybsjg = eablkybsjg(i14);
        iobyxmoadg iobyxmoadgVar = iobyxmoadg.NOT_SUPPORT;
        int iZoijcleaow = hcddaimhww.ppxfxbqfkf.zoijcleaow(size);
        if (i13 == 1) {
            if (iZoijcleaow <= hcddaimhww.ppxfxbqfkf.zoijcleaow(bfopjjpdmpVar.dxjokdxxww(i14))) {
                iobyxmoadgVar = iobyxmoadg.s720p;
            } else if (iZoijcleaow <= hcddaimhww.ppxfxbqfkf.zoijcleaow(bfopjjpdmpVar.lqeggnwhkg(i14))) {
                iobyxmoadgVar = iobyxmoadg.s1440p;
            }
        } else if (iZoijcleaow <= hcddaimhww.ppxfxbqfkf.zoijcleaow(bfopjjpdmpVar.zoijcleaow())) {
            iobyxmoadgVar = iobyxmoadg.VGA;
        } else if (iZoijcleaow <= hcddaimhww.ppxfxbqfkf.zoijcleaow(bfopjjpdmpVar.eablkybsjg())) {
            iobyxmoadgVar = iobyxmoadg.PREVIEW;
        } else if (iZoijcleaow <= hcddaimhww.ppxfxbqfkf.zoijcleaow(bfopjjpdmpVar.gxszxtbevo())) {
            iobyxmoadgVar = iobyxmoadg.RECORD;
        } else if (iZoijcleaow <= hcddaimhww.ppxfxbqfkf.zoijcleaow(bfopjjpdmpVar.ppxfxbqfkf(i14))) {
            iobyxmoadgVar = iobyxmoadg.MAXIMUM;
        } else {
            Size sizeGtknphoqwx = bfopjjpdmpVar.gtknphoqwx(i14);
            if (sizeGtknphoqwx != null && iZoijcleaow <= hcddaimhww.ppxfxbqfkf.zoijcleaow(sizeGtknphoqwx)) {
                iobyxmoadgVar = iobyxmoadg.ULTRA_MAXIMUM;
            }
        }
        return iobyxmoadg(zoijcleaowVarEablkybsjg, iobyxmoadgVar);
    }

    public static oipsdeybqn zoijcleaow(zoijcleaow zoijcleaowVar, iobyxmoadg iobyxmoadgVar, long j13) {
        return new gxszxtbevo(zoijcleaowVar, iobyxmoadgVar, j13);
    }

    public abstract long gxszxtbevo();

    public final boolean lqeggnwhkg(oipsdeybqn oipsdeybqnVar) {
        return oipsdeybqnVar.ppxfxbqfkf().wkgbmnqykc() <= ppxfxbqfkf().wkgbmnqykc() && oipsdeybqnVar.wkgbmnqykc() == wkgbmnqykc();
    }

    public abstract iobyxmoadg ppxfxbqfkf();

    public abstract zoijcleaow wkgbmnqykc();
}
