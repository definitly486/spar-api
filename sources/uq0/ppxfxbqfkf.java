package uq0;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class ppxfxbqfkf implements iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f114144iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f114145zoijcleaow;

    public ppxfxbqfkf(String title) {
        zdlpuopuiu.btonecajqb(title, "title");
        this.f114144iobyxmoadg = title;
        String name = ppxfxbqfkf.class.getName();
        zdlpuopuiu.dxjokdxxww(name, "getName(...)");
        this.f114145zoijcleaow = name;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f114144iobyxmoadg, ((ppxfxbqfkf) obj).f114144iobyxmoadg);
    }

    @Override // uq0.iobyxmoadg
    public String getId() {
        return this.f114145zoijcleaow;
    }

    public int hashCode() {
        return this.f114144iobyxmoadg.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f114144iobyxmoadg;
    }

    public String toString() {
        return "Title(title=" + this.f114144iobyxmoadg + ")";
    }
}
