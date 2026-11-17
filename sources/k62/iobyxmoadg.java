package k62;

import com.yandex.mapkit.geometry.BoundingBox;
import java.util.List;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg implements o00.iobyxmoadg {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final List f53935iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final boolean f53936jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final BoundingBox f53937yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f53938zdlpuopuiu;

    public iobyxmoadg(String itemId, BoundingBox boundingBox, boolean z13, List shops) {
        zdlpuopuiu.btonecajqb(itemId, "itemId");
        zdlpuopuiu.btonecajqb(shops, "shops");
        this.f53938zdlpuopuiu = itemId;
        this.f53937yggfygwlhe = boundingBox;
        this.f53936jyumaefscl = z13;
        this.f53935iwizpuwonk = shops;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f53938zdlpuopuiu, iobyxmoadgVar.f53938zdlpuopuiu) && zdlpuopuiu.eablkybsjg(this.f53937yggfygwlhe, iobyxmoadgVar.f53937yggfygwlhe) && this.f53936jyumaefscl == iobyxmoadgVar.f53936jyumaefscl && zdlpuopuiu.eablkybsjg(this.f53935iwizpuwonk, iobyxmoadgVar.f53935iwizpuwonk);
    }

    @Override // w30.ppxfxbqfkf
    public String getItemId() {
        return this.f53938zdlpuopuiu;
    }

    public int hashCode() {
        int iHashCode = this.f53938zdlpuopuiu.hashCode() * 31;
        BoundingBox boundingBox = this.f53937yggfygwlhe;
        return ((((iHashCode + (boundingBox == null ? 0 : boundingBox.hashCode())) * 31) + Boolean.hashCode(this.f53936jyumaefscl)) * 31) + this.f53935iwizpuwonk.hashCode();
    }

    public final BoundingBox iobyxmoadg() {
        return this.f53937yggfygwlhe;
    }

    public String toString() {
        return "MapSpecialBannerUiModel(itemId=" + this.f53938zdlpuopuiu + ", boundedBox=" + this.f53937yggfygwlhe + ", hasMore=" + this.f53936jyumaefscl + ", shops=" + this.f53935iwizpuwonk + ")";
    }

    public final List wkgbmnqykc() {
        return this.f53935iwizpuwonk;
    }

    public /* synthetic */ iobyxmoadg(String str, BoundingBox boundingBox, boolean z13, List list, int i13, gtknphoqwx gtknphoqwxVar) {
        this(str, (i13 & 2) != 0 ? null : boundingBox, (i13 & 4) != 0 ? false : z13, list);
    }
}
