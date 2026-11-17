package tt0;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.common.models.LocationData;

/* JADX INFO: loaded from: classes5.dex */
public final class agtfadlqog {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final LocationData f111491iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final int f111492ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final boolean f111493wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Object f111494zoijcleaow;

    public agtfadlqog(LocationData location, Object obj, int i13, boolean z13) {
        zdlpuopuiu.btonecajqb(location, "location");
        this.f111491iobyxmoadg = location;
        this.f111494zoijcleaow = obj;
        this.f111492ppxfxbqfkf = i13;
        this.f111493wkgbmnqykc = z13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof agtfadlqog)) {
            return false;
        }
        agtfadlqog agtfadlqogVar = (agtfadlqog) obj;
        return zdlpuopuiu.eablkybsjg(this.f111491iobyxmoadg, agtfadlqogVar.f111491iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f111494zoijcleaow, agtfadlqogVar.f111494zoijcleaow) && this.f111492ppxfxbqfkf == agtfadlqogVar.f111492ppxfxbqfkf && this.f111493wkgbmnqykc == agtfadlqogVar.f111493wkgbmnqykc;
    }

    public int hashCode() {
        int iHashCode = this.f111491iobyxmoadg.hashCode() * 31;
        Object obj = this.f111494zoijcleaow;
        return ((((iHashCode + (obj == null ? 0 : obj.hashCode())) * 31) + Integer.hashCode(this.f111492ppxfxbqfkf)) * 31) + Boolean.hashCode(this.f111493wkgbmnqykc);
    }

    public final int iobyxmoadg() {
        return this.f111492ppxfxbqfkf;
    }

    public final Object ppxfxbqfkf() {
        return this.f111494zoijcleaow;
    }

    public String toString() {
        return "YandexMapKitComposeMarkerModel(location=" + this.f111491iobyxmoadg + ", userData=" + this.f111494zoijcleaow + ", iconRes=" + this.f111492ppxfxbqfkf + ", isVectorIcon=" + this.f111493wkgbmnqykc + ")";
    }

    public final boolean wkgbmnqykc() {
        return this.f111493wkgbmnqykc;
    }

    public final LocationData zoijcleaow() {
        return this.f111491iobyxmoadg;
    }
}
