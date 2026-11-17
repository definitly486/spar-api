package mo;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public final class zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f67651iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f67652zoijcleaow;

    public zoijcleaow(String id2, String name) {
        zdlpuopuiu.btonecajqb(id2, "id");
        zdlpuopuiu.btonecajqb(name, "name");
        this.f67651iobyxmoadg = id2;
        this.f67652zoijcleaow = name;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zoijcleaow)) {
            return false;
        }
        zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
        return zdlpuopuiu.eablkybsjg(this.f67651iobyxmoadg, zoijcleaowVar.f67651iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f67652zoijcleaow, zoijcleaowVar.f67652zoijcleaow);
    }

    public int hashCode() {
        return (this.f67651iobyxmoadg.hashCode() * 31) + this.f67652zoijcleaow.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f67651iobyxmoadg;
    }

    public String toString() {
        return "ComboAnalyticsData(id=" + this.f67651iobyxmoadg + ", name=" + this.f67652zoijcleaow + ")";
    }

    public final String zoijcleaow() {
        return this.f67652zoijcleaow;
    }
}
