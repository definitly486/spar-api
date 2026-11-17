package ds1;

import com.yandex.mapkit.geometry.BoundingBox;
import java.util.List;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg implements gz0.iobyxmoadg {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final List f29435iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final boolean f29436jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final BoundingBox f29437yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f29438zdlpuopuiu;

    public iobyxmoadg(String itemId, BoundingBox boundingBox, boolean z13, List shops) {
        zdlpuopuiu.btonecajqb(itemId, "itemId");
        zdlpuopuiu.btonecajqb(shops, "shops");
        this.f29438zdlpuopuiu = itemId;
        this.f29437yggfygwlhe = boundingBox;
        this.f29436jyumaefscl = z13;
        this.f29435iwizpuwonk = shops;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f29438zdlpuopuiu, iobyxmoadgVar.f29438zdlpuopuiu) && zdlpuopuiu.eablkybsjg(this.f29437yggfygwlhe, iobyxmoadgVar.f29437yggfygwlhe) && this.f29436jyumaefscl == iobyxmoadgVar.f29436jyumaefscl && zdlpuopuiu.eablkybsjg(this.f29435iwizpuwonk, iobyxmoadgVar.f29435iwizpuwonk);
    }

    @Override // b21.ppxfxbqfkf
    public String getItemId() {
        return this.f29438zdlpuopuiu;
    }

    public int hashCode() {
        int iHashCode = this.f29438zdlpuopuiu.hashCode() * 31;
        BoundingBox boundingBox = this.f29437yggfygwlhe;
        return ((((iHashCode + (boundingBox == null ? 0 : boundingBox.hashCode())) * 31) + Boolean.hashCode(this.f29436jyumaefscl)) * 31) + this.f29435iwizpuwonk.hashCode();
    }

    public final BoundingBox iobyxmoadg() {
        return this.f29437yggfygwlhe;
    }

    public String toString() {
        return "MapSpecialBannerUiModel(itemId=" + this.f29438zdlpuopuiu + ", boundedBox=" + this.f29437yggfygwlhe + ", hasMore=" + this.f29436jyumaefscl + ", shops=" + this.f29435iwizpuwonk + ")";
    }

    public final List wkgbmnqykc() {
        return this.f29435iwizpuwonk;
    }

    public /* synthetic */ iobyxmoadg(String str, BoundingBox boundingBox, boolean z13, List list, int i13, gtknphoqwx gtknphoqwxVar) {
        this(str, (i13 & 2) != 0 ? null : boundingBox, (i13 & 4) != 0 ? false : z13, list);
    }
}
