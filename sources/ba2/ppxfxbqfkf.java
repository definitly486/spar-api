package ba2;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final long f15605iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final wkgbmnqykc f15606ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final boolean f15607zoijcleaow;

    public ppxfxbqfkf(long j13, boolean z13, wkgbmnqykc button) {
        zdlpuopuiu.btonecajqb(button, "button");
        this.f15605iobyxmoadg = j13;
        this.f15607zoijcleaow = z13;
        this.f15606ppxfxbqfkf = button;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ppxfxbqfkf)) {
            return false;
        }
        ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
        return this.f15605iobyxmoadg == ppxfxbqfkfVar.f15605iobyxmoadg && this.f15607zoijcleaow == ppxfxbqfkfVar.f15607zoijcleaow && this.f15606ppxfxbqfkf == ppxfxbqfkfVar.f15606ppxfxbqfkf;
    }

    public int hashCode() {
        return (((Long.hashCode(this.f15605iobyxmoadg) * 31) + Boolean.hashCode(this.f15607zoijcleaow)) * 31) + this.f15606ppxfxbqfkf.hashCode();
    }

    public final wkgbmnqykc iobyxmoadg() {
        return this.f15606ppxfxbqfkf;
    }

    public final long ppxfxbqfkf() {
        return this.f15605iobyxmoadg;
    }

    public String toString() {
        return "BottomBarInfo(totalSum=" + this.f15605iobyxmoadg + ", payIsEnabled=" + this.f15607zoijcleaow + ", button=" + this.f15606ppxfxbqfkf + ")";
    }

    public final boolean zoijcleaow() {
        return this.f15607zoijcleaow;
    }
}
