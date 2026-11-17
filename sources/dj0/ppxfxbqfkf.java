package dj0;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public final class ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f29026iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final zoijcleaow f29027zoijcleaow;

    public ppxfxbqfkf(String value, zoijcleaow title) {
        zdlpuopuiu.btonecajqb(value, "value");
        zdlpuopuiu.btonecajqb(title, "title");
        this.f29026iobyxmoadg = value;
        this.f29027zoijcleaow = title;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ppxfxbqfkf)) {
            return false;
        }
        ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
        return zdlpuopuiu.eablkybsjg(this.f29026iobyxmoadg, ppxfxbqfkfVar.f29026iobyxmoadg) && this.f29027zoijcleaow == ppxfxbqfkfVar.f29027zoijcleaow;
    }

    public int hashCode() {
        return (this.f29026iobyxmoadg.hashCode() * 31) + this.f29027zoijcleaow.hashCode();
    }

    public final zoijcleaow iobyxmoadg() {
        return this.f29027zoijcleaow;
    }

    public String toString() {
        return "OrderInfoUiModel(value=" + this.f29026iobyxmoadg + ", title=" + this.f29027zoijcleaow + ")";
    }

    public final String zoijcleaow() {
        return this.f29026iobyxmoadg;
    }
}
