package dt1;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final int f29615eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f29616iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f29617ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final Integer f29618wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f29619zoijcleaow;

    public iobyxmoadg(int i13, String fileUrl, String type, Integer num, int i14) {
        zdlpuopuiu.btonecajqb(fileUrl, "fileUrl");
        zdlpuopuiu.btonecajqb(type, "type");
        this.f29616iobyxmoadg = i13;
        this.f29619zoijcleaow = fileUrl;
        this.f29617ppxfxbqfkf = type;
        this.f29618wkgbmnqykc = num;
        this.f29615eablkybsjg = i14;
    }

    public static /* synthetic */ iobyxmoadg zoijcleaow(iobyxmoadg iobyxmoadgVar, int i13, String str, String str2, Integer num, int i14, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i13 = iobyxmoadgVar.f29616iobyxmoadg;
        }
        if ((i15 & 2) != 0) {
            str = iobyxmoadgVar.f29619zoijcleaow;
        }
        String str3 = str;
        if ((i15 & 4) != 0) {
            str2 = iobyxmoadgVar.f29617ppxfxbqfkf;
        }
        String str4 = str2;
        if ((i15 & 8) != 0) {
            num = iobyxmoadgVar.f29618wkgbmnqykc;
        }
        Integer num2 = num;
        if ((i15 & 16) != 0) {
            i14 = iobyxmoadgVar.f29615eablkybsjg;
        }
        return iobyxmoadgVar.iobyxmoadg(i13, str3, str4, num2, i14);
    }

    public final int eablkybsjg() {
        return this.f29616iobyxmoadg;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return this.f29616iobyxmoadg == iobyxmoadgVar.f29616iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f29619zoijcleaow, iobyxmoadgVar.f29619zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f29617ppxfxbqfkf, iobyxmoadgVar.f29617ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f29618wkgbmnqykc, iobyxmoadgVar.f29618wkgbmnqykc) && this.f29615eablkybsjg == iobyxmoadgVar.f29615eablkybsjg;
    }

    public final int gxszxtbevo() {
        return this.f29615eablkybsjg;
    }

    public int hashCode() {
        int iHashCode = ((((Integer.hashCode(this.f29616iobyxmoadg) * 31) + this.f29619zoijcleaow.hashCode()) * 31) + this.f29617ppxfxbqfkf.hashCode()) * 31;
        Integer num = this.f29618wkgbmnqykc;
        return ((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + Integer.hashCode(this.f29615eablkybsjg);
    }

    public final iobyxmoadg iobyxmoadg(int i13, String fileUrl, String type, Integer num, int i14) {
        zdlpuopuiu.btonecajqb(fileUrl, "fileUrl");
        zdlpuopuiu.btonecajqb(type, "type");
        return new iobyxmoadg(i13, fileUrl, type, num, i14);
    }

    public final String lqeggnwhkg() {
        return this.f29617ppxfxbqfkf;
    }

    public final Integer ppxfxbqfkf() {
        return this.f29618wkgbmnqykc;
    }

    public String toString() {
        return "SplashEntity(id=" + this.f29616iobyxmoadg + ", fileUrl=" + this.f29619zoijcleaow + ", type=" + this.f29617ppxfxbqfkf + ", endTime=" + this.f29618wkgbmnqykc + ", showCount=" + this.f29615eablkybsjg + ")";
    }

    public final String wkgbmnqykc() {
        return this.f29619zoijcleaow;
    }
}
