package ub;

import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;

/* JADX INFO: loaded from: classes2.dex */
public final class vdvldrhtss {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final pmvmpeiblj f113169iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final int f113170ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f113171zoijcleaow;

    private vdvldrhtss(Class cls, int i13, int i14) {
        this(pmvmpeiblj.zoijcleaow(cls), i13, i14);
    }

    public static vdvldrhtss agtfadlqog(pmvmpeiblj pmvmpeibljVar) {
        return new vdvldrhtss(pmvmpeibljVar, 1, 1);
    }

    public static vdvldrhtss btonecajqb(pmvmpeiblj pmvmpeibljVar) {
        return new vdvldrhtss(pmvmpeibljVar, 0, 1);
    }

    public static vdvldrhtss draadjrbmk(pmvmpeiblj pmvmpeibljVar) {
        return new vdvldrhtss(pmvmpeibljVar, 1, 0);
    }

    public static vdvldrhtss dxjokdxxww(Class cls) {
        return new vdvldrhtss(cls, 0, 1);
    }

    public static vdvldrhtss gtknphoqwx(Class cls) {
        return new vdvldrhtss(cls, 1, 0);
    }

    public static vdvldrhtss iobyxmoadg(Class cls) {
        return new vdvldrhtss(cls, 0, 2);
    }

    public static vdvldrhtss nufgyqmvbu(Class cls) {
        return new vdvldrhtss(cls, 0, 0);
    }

    public static vdvldrhtss ojitshcjhn(Class cls) {
        return new vdvldrhtss(cls, 2, 0);
    }

    public static vdvldrhtss wflxmlrfwp(Class cls) {
        return new vdvldrhtss(cls, 1, 1);
    }

    private static String zoijcleaow(int i13) {
        if (i13 == 0) {
            return DevicePublicKeyStringDef.DIRECT;
        }
        if (i13 == 1) {
            return "provider";
        }
        if (i13 == 2) {
            return "deferred";
        }
        throw new AssertionError("Unsupported injection: " + i13);
    }

    public boolean eablkybsjg() {
        return this.f113170ppxfxbqfkf == 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof vdvldrhtss)) {
            return false;
        }
        vdvldrhtss vdvldrhtssVar = (vdvldrhtss) obj;
        return this.f113169iobyxmoadg.equals(vdvldrhtssVar.f113169iobyxmoadg) && this.f113171zoijcleaow == vdvldrhtssVar.f113171zoijcleaow && this.f113170ppxfxbqfkf == vdvldrhtssVar.f113170ppxfxbqfkf;
    }

    public boolean gxszxtbevo() {
        return this.f113171zoijcleaow == 1;
    }

    public int hashCode() {
        return ((((this.f113169iobyxmoadg.hashCode() ^ 1000003) * 1000003) ^ this.f113171zoijcleaow) * 1000003) ^ this.f113170ppxfxbqfkf;
    }

    public boolean lqeggnwhkg() {
        return this.f113171zoijcleaow == 2;
    }

    public pmvmpeiblj ppxfxbqfkf() {
        return this.f113169iobyxmoadg;
    }

    public String toString() {
        String str;
        StringBuilder sb3 = new StringBuilder("Dependency{anInterface=");
        sb3.append(this.f113169iobyxmoadg);
        sb3.append(", type=");
        int i13 = this.f113171zoijcleaow;
        if (i13 == 1) {
            str = "required";
        } else {
            str = i13 == 0 ? "optional" : "set";
        }
        sb3.append(str);
        sb3.append(", injection=");
        sb3.append(zoijcleaow(this.f113170ppxfxbqfkf));
        sb3.append("}");
        return sb3.toString();
    }

    public boolean wkgbmnqykc() {
        return this.f113170ppxfxbqfkf == 2;
    }

    private vdvldrhtss(pmvmpeiblj pmvmpeibljVar, int i13, int i14) {
        this.f113169iobyxmoadg = (pmvmpeiblj) lereixgezr.ppxfxbqfkf(pmvmpeibljVar, "Null dependency anInterface.");
        this.f113171zoijcleaow = i13;
        this.f113170ppxfxbqfkf = i14;
    }
}
