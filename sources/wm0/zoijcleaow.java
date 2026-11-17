package wm0;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f120247iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f120248zoijcleaow;

    public zoijcleaow(String id2, String name) {
        zdlpuopuiu.btonecajqb(id2, "id");
        zdlpuopuiu.btonecajqb(name, "name");
        this.f120247iobyxmoadg = id2;
        this.f120248zoijcleaow = name;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zoijcleaow)) {
            return false;
        }
        zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
        return zdlpuopuiu.eablkybsjg(this.f120247iobyxmoadg, zoijcleaowVar.f120247iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f120248zoijcleaow, zoijcleaowVar.f120248zoijcleaow);
    }

    public int hashCode() {
        return (this.f120247iobyxmoadg.hashCode() * 31) + this.f120248zoijcleaow.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f120247iobyxmoadg;
    }

    public String toString() {
        return "ComboAnalyticsData(id=" + this.f120247iobyxmoadg + ", name=" + this.f120248zoijcleaow + ")";
    }

    public final String zoijcleaow() {
        return this.f120248zoijcleaow;
    }
}
