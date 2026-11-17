package j72;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final int f50826eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f50827iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f50828ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final Integer f50829wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f50830zoijcleaow;

    public iobyxmoadg(int i13, String fileUrl, String type, Integer num, int i14) {
        zdlpuopuiu.btonecajqb(fileUrl, "fileUrl");
        zdlpuopuiu.btonecajqb(type, "type");
        this.f50827iobyxmoadg = i13;
        this.f50830zoijcleaow = fileUrl;
        this.f50828ppxfxbqfkf = type;
        this.f50829wkgbmnqykc = num;
        this.f50826eablkybsjg = i14;
    }

    public static /* synthetic */ iobyxmoadg zoijcleaow(iobyxmoadg iobyxmoadgVar, int i13, String str, String str2, Integer num, int i14, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i13 = iobyxmoadgVar.f50827iobyxmoadg;
        }
        if ((i15 & 2) != 0) {
            str = iobyxmoadgVar.f50830zoijcleaow;
        }
        String str3 = str;
        if ((i15 & 4) != 0) {
            str2 = iobyxmoadgVar.f50828ppxfxbqfkf;
        }
        String str4 = str2;
        if ((i15 & 8) != 0) {
            num = iobyxmoadgVar.f50829wkgbmnqykc;
        }
        Integer num2 = num;
        if ((i15 & 16) != 0) {
            i14 = iobyxmoadgVar.f50826eablkybsjg;
        }
        return iobyxmoadgVar.iobyxmoadg(i13, str3, str4, num2, i14);
    }

    public final int eablkybsjg() {
        return this.f50827iobyxmoadg;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return this.f50827iobyxmoadg == iobyxmoadgVar.f50827iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f50830zoijcleaow, iobyxmoadgVar.f50830zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f50828ppxfxbqfkf, iobyxmoadgVar.f50828ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f50829wkgbmnqykc, iobyxmoadgVar.f50829wkgbmnqykc) && this.f50826eablkybsjg == iobyxmoadgVar.f50826eablkybsjg;
    }

    public final int gxszxtbevo() {
        return this.f50826eablkybsjg;
    }

    public int hashCode() {
        int iHashCode = ((((Integer.hashCode(this.f50827iobyxmoadg) * 31) + this.f50830zoijcleaow.hashCode()) * 31) + this.f50828ppxfxbqfkf.hashCode()) * 31;
        Integer num = this.f50829wkgbmnqykc;
        return ((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + Integer.hashCode(this.f50826eablkybsjg);
    }

    public final iobyxmoadg iobyxmoadg(int i13, String fileUrl, String type, Integer num, int i14) {
        zdlpuopuiu.btonecajqb(fileUrl, "fileUrl");
        zdlpuopuiu.btonecajqb(type, "type");
        return new iobyxmoadg(i13, fileUrl, type, num, i14);
    }

    public final String lqeggnwhkg() {
        return this.f50828ppxfxbqfkf;
    }

    public final Integer ppxfxbqfkf() {
        return this.f50829wkgbmnqykc;
    }

    public String toString() {
        return "SplashEntity(id=" + this.f50827iobyxmoadg + ", fileUrl=" + this.f50830zoijcleaow + ", type=" + this.f50828ppxfxbqfkf + ", endTime=" + this.f50829wkgbmnqykc + ", showCount=" + this.f50826eablkybsjg + ")";
    }

    public final String wkgbmnqykc() {
        return this.f50830zoijcleaow;
    }
}
