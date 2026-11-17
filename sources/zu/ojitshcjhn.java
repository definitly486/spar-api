package zu;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.common.models.LocationData;

/* JADX INFO: loaded from: classes4.dex */
public final class ojitshcjhn {

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public static final int f131359gxszxtbevo = 8;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final List f131360eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final LocationData f131361iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final rgvfuqvkyq f131362ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final boolean f131363wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final float f131364zoijcleaow;

    public ojitshcjhn(LocationData cameraPosition, float f13, rgvfuqvkyq mapZoomPreference, boolean z13, List markers) {
        zdlpuopuiu.btonecajqb(cameraPosition, "cameraPosition");
        zdlpuopuiu.btonecajqb(mapZoomPreference, "mapZoomPreference");
        zdlpuopuiu.btonecajqb(markers, "markers");
        this.f131361iobyxmoadg = cameraPosition;
        this.f131364zoijcleaow = f13;
        this.f131362ppxfxbqfkf = mapZoomPreference;
        this.f131363wkgbmnqykc = z13;
        this.f131360eablkybsjg = markers;
    }

    public final boolean eablkybsjg() {
        return this.f131363wkgbmnqykc;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ojitshcjhn)) {
            return false;
        }
        ojitshcjhn ojitshcjhnVar = (ojitshcjhn) obj;
        return zdlpuopuiu.eablkybsjg(this.f131361iobyxmoadg, ojitshcjhnVar.f131361iobyxmoadg) && Float.compare(this.f131364zoijcleaow, ojitshcjhnVar.f131364zoijcleaow) == 0 && zdlpuopuiu.eablkybsjg(this.f131362ppxfxbqfkf, ojitshcjhnVar.f131362ppxfxbqfkf) && this.f131363wkgbmnqykc == ojitshcjhnVar.f131363wkgbmnqykc && zdlpuopuiu.eablkybsjg(this.f131360eablkybsjg, ojitshcjhnVar.f131360eablkybsjg);
    }

    public int hashCode() {
        return (((((((this.f131361iobyxmoadg.hashCode() * 31) + Float.hashCode(this.f131364zoijcleaow)) * 31) + this.f131362ppxfxbqfkf.hashCode()) * 31) + Boolean.hashCode(this.f131363wkgbmnqykc)) * 31) + this.f131360eablkybsjg.hashCode();
    }

    public final LocationData iobyxmoadg() {
        return this.f131361iobyxmoadg;
    }

    public final rgvfuqvkyq ppxfxbqfkf() {
        return this.f131362ppxfxbqfkf;
    }

    public String toString() {
        return "YandexMapKitComposeUiState(cameraPosition=" + this.f131361iobyxmoadg + ", mapZoom=" + this.f131364zoijcleaow + ", mapZoomPreference=" + this.f131362ppxfxbqfkf + ", isCenteredPinVisible=" + this.f131363wkgbmnqykc + ", markers=" + this.f131360eablkybsjg + ")";
    }

    public final List wkgbmnqykc() {
        return this.f131360eablkybsjg;
    }

    public final float zoijcleaow() {
        return this.f131364zoijcleaow;
    }
}
