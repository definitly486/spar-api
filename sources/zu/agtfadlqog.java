package zu;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.common.models.LocationData;

/* JADX INFO: loaded from: classes4.dex */
public final class agtfadlqog {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final LocationData f131336iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final int f131337ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final boolean f131338wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Object f131339zoijcleaow;

    public agtfadlqog(LocationData location, Object obj, int i13, boolean z13) {
        zdlpuopuiu.btonecajqb(location, "location");
        this.f131336iobyxmoadg = location;
        this.f131339zoijcleaow = obj;
        this.f131337ppxfxbqfkf = i13;
        this.f131338wkgbmnqykc = z13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof agtfadlqog)) {
            return false;
        }
        agtfadlqog agtfadlqogVar = (agtfadlqog) obj;
        return zdlpuopuiu.eablkybsjg(this.f131336iobyxmoadg, agtfadlqogVar.f131336iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f131339zoijcleaow, agtfadlqogVar.f131339zoijcleaow) && this.f131337ppxfxbqfkf == agtfadlqogVar.f131337ppxfxbqfkf && this.f131338wkgbmnqykc == agtfadlqogVar.f131338wkgbmnqykc;
    }

    public int hashCode() {
        int iHashCode = this.f131336iobyxmoadg.hashCode() * 31;
        Object obj = this.f131339zoijcleaow;
        return ((((iHashCode + (obj == null ? 0 : obj.hashCode())) * 31) + Integer.hashCode(this.f131337ppxfxbqfkf)) * 31) + Boolean.hashCode(this.f131338wkgbmnqykc);
    }

    public final int iobyxmoadg() {
        return this.f131337ppxfxbqfkf;
    }

    public final Object ppxfxbqfkf() {
        return this.f131339zoijcleaow;
    }

    public String toString() {
        return "YandexMapKitComposeMarkerModel(location=" + this.f131336iobyxmoadg + ", userData=" + this.f131339zoijcleaow + ", iconRes=" + this.f131337ppxfxbqfkf + ", isVectorIcon=" + this.f131338wkgbmnqykc + ")";
    }

    public final boolean wkgbmnqykc() {
        return this.f131338wkgbmnqykc;
    }

    public final LocationData zoijcleaow() {
        return this.f131336iobyxmoadg;
    }
}
