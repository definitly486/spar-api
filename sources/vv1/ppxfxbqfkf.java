package vv1;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final long f118120iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final wkgbmnqykc f118121ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final boolean f118122zoijcleaow;

    public ppxfxbqfkf(long j13, boolean z13, wkgbmnqykc button) {
        zdlpuopuiu.btonecajqb(button, "button");
        this.f118120iobyxmoadg = j13;
        this.f118122zoijcleaow = z13;
        this.f118121ppxfxbqfkf = button;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ppxfxbqfkf)) {
            return false;
        }
        ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
        return this.f118120iobyxmoadg == ppxfxbqfkfVar.f118120iobyxmoadg && this.f118122zoijcleaow == ppxfxbqfkfVar.f118122zoijcleaow && this.f118121ppxfxbqfkf == ppxfxbqfkfVar.f118121ppxfxbqfkf;
    }

    public int hashCode() {
        return (((Long.hashCode(this.f118120iobyxmoadg) * 31) + Boolean.hashCode(this.f118122zoijcleaow)) * 31) + this.f118121ppxfxbqfkf.hashCode();
    }

    public final wkgbmnqykc iobyxmoadg() {
        return this.f118121ppxfxbqfkf;
    }

    public final long ppxfxbqfkf() {
        return this.f118120iobyxmoadg;
    }

    public String toString() {
        return "BottomBarInfo(totalSum=" + this.f118120iobyxmoadg + ", payIsEnabled=" + this.f118122zoijcleaow + ", button=" + this.f118121ppxfxbqfkf + ")";
    }

    public final boolean zoijcleaow() {
        return this.f118122zoijcleaow;
    }
}
