package t10;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f109289iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f109290ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f109291zoijcleaow;

    public iobyxmoadg(String str, String dateEnd, String dateNow) {
        zdlpuopuiu.btonecajqb(dateEnd, "dateEnd");
        zdlpuopuiu.btonecajqb(dateNow, "dateNow");
        this.f109289iobyxmoadg = str;
        this.f109291zoijcleaow = dateEnd;
        this.f109290ppxfxbqfkf = dateNow;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f109289iobyxmoadg, iobyxmoadgVar.f109289iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f109291zoijcleaow, iobyxmoadgVar.f109291zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f109290ppxfxbqfkf, iobyxmoadgVar.f109290ppxfxbqfkf);
    }

    public int hashCode() {
        String str = this.f109289iobyxmoadg;
        return ((((str == null ? 0 : str.hashCode()) * 31) + this.f109291zoijcleaow.hashCode()) * 31) + this.f109290ppxfxbqfkf.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f109291zoijcleaow;
    }

    public final String ppxfxbqfkf() {
        return this.f109289iobyxmoadg;
    }

    public String toString() {
        return "AuthSmsModel(token=" + this.f109289iobyxmoadg + ", dateEnd=" + this.f109291zoijcleaow + ", dateNow=" + this.f109290ppxfxbqfkf + ")";
    }

    public final String zoijcleaow() {
        return this.f109290ppxfxbqfkf;
    }

    public /* synthetic */ iobyxmoadg(String str, String str2, String str3, int i13, gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? null : str, str2, str3);
    }
}
