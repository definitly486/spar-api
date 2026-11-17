package k82;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f54193iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final float f54194ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f54195zoijcleaow;

    public ppxfxbqfkf(String title, String subtitle, float f13) {
        zdlpuopuiu.btonecajqb(title, "title");
        zdlpuopuiu.btonecajqb(subtitle, "subtitle");
        this.f54193iobyxmoadg = title;
        this.f54195zoijcleaow = subtitle;
        this.f54194ppxfxbqfkf = f13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ppxfxbqfkf)) {
            return false;
        }
        ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
        return zdlpuopuiu.eablkybsjg(this.f54193iobyxmoadg, ppxfxbqfkfVar.f54193iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f54195zoijcleaow, ppxfxbqfkfVar.f54195zoijcleaow) && Float.compare(this.f54194ppxfxbqfkf, ppxfxbqfkfVar.f54194ppxfxbqfkf) == 0;
    }

    public int hashCode() {
        return (((this.f54193iobyxmoadg.hashCode() * 31) + this.f54195zoijcleaow.hashCode()) * 31) + Float.hashCode(this.f54194ppxfxbqfkf);
    }

    public final float iobyxmoadg() {
        return this.f54194ppxfxbqfkf;
    }

    public final String ppxfxbqfkf() {
        return this.f54193iobyxmoadg;
    }

    public String toString() {
        return "SubscriptionProgressBarUiModel(title=" + this.f54193iobyxmoadg + ", subtitle=" + this.f54195zoijcleaow + ", progressPercent=" + this.f54194ppxfxbqfkf + ")";
    }

    public final String zoijcleaow() {
        return this.f54195zoijcleaow;
    }
}
