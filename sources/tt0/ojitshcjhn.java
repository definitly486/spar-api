package tt0;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.common.models.LocationData;

/* JADX INFO: loaded from: classes5.dex */
public final class ojitshcjhn {

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public static final int f111514gxszxtbevo = 8;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final List f111515eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final LocationData f111516iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final rgvfuqvkyq f111517ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final boolean f111518wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final float f111519zoijcleaow;

    public ojitshcjhn(LocationData cameraPosition, float f13, rgvfuqvkyq mapZoomPreference, boolean z13, List markers) {
        zdlpuopuiu.btonecajqb(cameraPosition, "cameraPosition");
        zdlpuopuiu.btonecajqb(mapZoomPreference, "mapZoomPreference");
        zdlpuopuiu.btonecajqb(markers, "markers");
        this.f111516iobyxmoadg = cameraPosition;
        this.f111519zoijcleaow = f13;
        this.f111517ppxfxbqfkf = mapZoomPreference;
        this.f111518wkgbmnqykc = z13;
        this.f111515eablkybsjg = markers;
    }

    public final boolean eablkybsjg() {
        return this.f111518wkgbmnqykc;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ojitshcjhn)) {
            return false;
        }
        ojitshcjhn ojitshcjhnVar = (ojitshcjhn) obj;
        return zdlpuopuiu.eablkybsjg(this.f111516iobyxmoadg, ojitshcjhnVar.f111516iobyxmoadg) && Float.compare(this.f111519zoijcleaow, ojitshcjhnVar.f111519zoijcleaow) == 0 && zdlpuopuiu.eablkybsjg(this.f111517ppxfxbqfkf, ojitshcjhnVar.f111517ppxfxbqfkf) && this.f111518wkgbmnqykc == ojitshcjhnVar.f111518wkgbmnqykc && zdlpuopuiu.eablkybsjg(this.f111515eablkybsjg, ojitshcjhnVar.f111515eablkybsjg);
    }

    public int hashCode() {
        return (((((((this.f111516iobyxmoadg.hashCode() * 31) + Float.hashCode(this.f111519zoijcleaow)) * 31) + this.f111517ppxfxbqfkf.hashCode()) * 31) + Boolean.hashCode(this.f111518wkgbmnqykc)) * 31) + this.f111515eablkybsjg.hashCode();
    }

    public final LocationData iobyxmoadg() {
        return this.f111516iobyxmoadg;
    }

    public final rgvfuqvkyq ppxfxbqfkf() {
        return this.f111517ppxfxbqfkf;
    }

    public String toString() {
        return "YandexMapKitComposeUiState(cameraPosition=" + this.f111516iobyxmoadg + ", mapZoom=" + this.f111519zoijcleaow + ", mapZoomPreference=" + this.f111517ppxfxbqfkf + ", isCenteredPinVisible=" + this.f111518wkgbmnqykc + ", markers=" + this.f111515eablkybsjg + ")";
    }

    public final List wkgbmnqykc() {
        return this.f111515eablkybsjg;
    }

    public final float zoijcleaow() {
        return this.f111519zoijcleaow;
    }
}
