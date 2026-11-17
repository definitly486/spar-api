package sz0;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f109036iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final boolean f109037ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f109038zoijcleaow;

    public zoijcleaow(String code, String title, boolean z13) {
        zdlpuopuiu.btonecajqb(code, "code");
        zdlpuopuiu.btonecajqb(title, "title");
        this.f109036iobyxmoadg = code;
        this.f109038zoijcleaow = title;
        this.f109037ppxfxbqfkf = z13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zoijcleaow)) {
            return false;
        }
        zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
        return zdlpuopuiu.eablkybsjg(this.f109036iobyxmoadg, zoijcleaowVar.f109036iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f109038zoijcleaow, zoijcleaowVar.f109038zoijcleaow) && this.f109037ppxfxbqfkf == zoijcleaowVar.f109037ppxfxbqfkf;
    }

    public int hashCode() {
        return (((this.f109036iobyxmoadg.hashCode() * 31) + this.f109038zoijcleaow.hashCode()) * 31) + Boolean.hashCode(this.f109037ppxfxbqfkf);
    }

    public final String iobyxmoadg() {
        return this.f109036iobyxmoadg;
    }

    public final boolean ppxfxbqfkf() {
        return this.f109037ppxfxbqfkf;
    }

    public String toString() {
        return "OrderReason(code=" + this.f109036iobyxmoadg + ", title=" + this.f109038zoijcleaow + ", isOwn=" + this.f109037ppxfxbqfkf + ")";
    }

    public final String zoijcleaow() {
        return this.f109038zoijcleaow;
    }
}
