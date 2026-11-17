package v2;

import y2.stevsuqkhv;

/* JADX INFO: loaded from: classes.dex */
public final class jpowsppfya {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public static final jpowsppfya f115374eablkybsjg = new jpowsppfya(0, 0);

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private static final String f115375gxszxtbevo = stevsuqkhv.uawqvzlxes(0);

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private static final String f115376lqeggnwhkg = stevsuqkhv.uawqvzlxes(1);

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private static final String f115377nufgyqmvbu = stevsuqkhv.uawqvzlxes(3);

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final int f115378iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final int f115379ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final float f115380wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final int f115381zoijcleaow;

    public jpowsppfya(int i13, int i14) {
        this(i13, i14, 1.0f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jpowsppfya)) {
            return false;
        }
        jpowsppfya jpowsppfyaVar = (jpowsppfya) obj;
        return this.f115378iobyxmoadg == jpowsppfyaVar.f115378iobyxmoadg && this.f115381zoijcleaow == jpowsppfyaVar.f115381zoijcleaow && this.f115380wkgbmnqykc == jpowsppfyaVar.f115380wkgbmnqykc;
    }

    public int hashCode() {
        return ((((217 + this.f115378iobyxmoadg) * 31) + this.f115381zoijcleaow) * 31) + Float.floatToRawIntBits(this.f115380wkgbmnqykc);
    }

    public jpowsppfya(int i13, int i14, float f13) {
        this.f115378iobyxmoadg = i13;
        this.f115381zoijcleaow = i14;
        this.f115379ppxfxbqfkf = 0;
        this.f115380wkgbmnqykc = f13;
    }
}
