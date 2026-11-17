package yggfygwlhe;

import android.hardware.camera2.params.OutputConfiguration;
import android.os.Build;
import android.view.Surface;

/* JADX INFO: loaded from: classes.dex */
public final class gtknphoqwx {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final iobyxmoadg f124987iobyxmoadg;

    interface iobyxmoadg {
        void eablkybsjg(String str);

        String getPhysicalCameraId();

        void gxszxtbevo();

        Surface iobyxmoadg();

        void lqeggnwhkg(int i13);

        Object nufgyqmvbu();

        void ppxfxbqfkf(Surface surface);

        void wkgbmnqykc(long j13);

        void zoijcleaow(long j13);
    }

    public gtknphoqwx(int i13, Surface surface) {
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 33) {
            this.f124987iobyxmoadg = new ojitshcjhn(i13, surface);
        } else if (i14 >= 28) {
            this.f124987iobyxmoadg = new agtfadlqog(i13, surface);
        } else {
            this.f124987iobyxmoadg = new wflxmlrfwp(i13, surface);
        }
    }

    public static gtknphoqwx btonecajqb(Object obj) {
        iobyxmoadg iobyxmoadgVarBtonecajqb;
        if (obj == null) {
            return null;
        }
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 33) {
            iobyxmoadgVarBtonecajqb = ojitshcjhn.gtknphoqwx((OutputConfiguration) obj);
        } else {
            iobyxmoadgVarBtonecajqb = i13 >= 28 ? agtfadlqog.btonecajqb((OutputConfiguration) obj) : wflxmlrfwp.dxjokdxxww((OutputConfiguration) obj);
        }
        if (iobyxmoadgVarBtonecajqb == null) {
            return null;
        }
        return new gtknphoqwx(iobyxmoadgVarBtonecajqb);
    }

    public Object dxjokdxxww() {
        return this.f124987iobyxmoadg.nufgyqmvbu();
    }

    public void eablkybsjg(long j13) {
        this.f124987iobyxmoadg.wkgbmnqykc(j13);
    }

    public boolean equals(Object obj) {
        if (obj instanceof gtknphoqwx) {
            return this.f124987iobyxmoadg.equals(((gtknphoqwx) obj).f124987iobyxmoadg);
        }
        return false;
    }

    public void gxszxtbevo(int i13) {
        this.f124987iobyxmoadg.lqeggnwhkg(i13);
    }

    public int hashCode() {
        return this.f124987iobyxmoadg.hashCode();
    }

    public void iobyxmoadg(Surface surface) {
        this.f124987iobyxmoadg.ppxfxbqfkf(surface);
    }

    public void lqeggnwhkg(String str) {
        this.f124987iobyxmoadg.eablkybsjg(str);
    }

    public void nufgyqmvbu(long j13) {
        this.f124987iobyxmoadg.zoijcleaow(j13);
    }

    public String ppxfxbqfkf() {
        return this.f124987iobyxmoadg.getPhysicalCameraId();
    }

    public Surface wkgbmnqykc() {
        return this.f124987iobyxmoadg.iobyxmoadg();
    }

    public void zoijcleaow() {
        this.f124987iobyxmoadg.gxszxtbevo();
    }

    private gtknphoqwx(iobyxmoadg iobyxmoadgVar) {
        this.f124987iobyxmoadg = iobyxmoadgVar;
    }
}
