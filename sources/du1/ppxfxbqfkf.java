package du1;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f29626iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final float f29627ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f29628zoijcleaow;

    public ppxfxbqfkf(String title, String subtitle, float f13) {
        zdlpuopuiu.btonecajqb(title, "title");
        zdlpuopuiu.btonecajqb(subtitle, "subtitle");
        this.f29626iobyxmoadg = title;
        this.f29628zoijcleaow = subtitle;
        this.f29627ppxfxbqfkf = f13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ppxfxbqfkf)) {
            return false;
        }
        ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
        return zdlpuopuiu.eablkybsjg(this.f29626iobyxmoadg, ppxfxbqfkfVar.f29626iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f29628zoijcleaow, ppxfxbqfkfVar.f29628zoijcleaow) && Float.compare(this.f29627ppxfxbqfkf, ppxfxbqfkfVar.f29627ppxfxbqfkf) == 0;
    }

    public int hashCode() {
        return (((this.f29626iobyxmoadg.hashCode() * 31) + this.f29628zoijcleaow.hashCode()) * 31) + Float.hashCode(this.f29627ppxfxbqfkf);
    }

    public final float iobyxmoadg() {
        return this.f29627ppxfxbqfkf;
    }

    public final String ppxfxbqfkf() {
        return this.f29626iobyxmoadg;
    }

    public String toString() {
        return "SubscriptionProgressBarUiModel(title=" + this.f29626iobyxmoadg + ", subtitle=" + this.f29628zoijcleaow + ", progressPercent=" + this.f29627ppxfxbqfkf + ")";
    }

    public final String zoijcleaow() {
        return this.f29628zoijcleaow;
    }
}
