package ls1;

import java.util.List;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class zoijcleaow implements gz0.iobyxmoadg {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final List f63983jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final int f63984yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f63985zdlpuopuiu;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    public static final iobyxmoadg f63982iwizpuwonk = new iobyxmoadg(null);

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    public static final int f63981cqumvgiudr = 8;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    public zoijcleaow(String itemId, int i13, List items) {
        zdlpuopuiu.btonecajqb(itemId, "itemId");
        zdlpuopuiu.btonecajqb(items, "items");
        this.f63985zdlpuopuiu = itemId;
        this.f63984yggfygwlhe = i13;
        this.f63983jyumaefscl = items;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zoijcleaow)) {
            return false;
        }
        zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
        return zdlpuopuiu.eablkybsjg(this.f63985zdlpuopuiu, zoijcleaowVar.f63985zdlpuopuiu) && this.f63984yggfygwlhe == zoijcleaowVar.f63984yggfygwlhe && zdlpuopuiu.eablkybsjg(this.f63983jyumaefscl, zoijcleaowVar.f63983jyumaefscl);
    }

    @Override // b21.ppxfxbqfkf
    public String getItemId() {
        return this.f63985zdlpuopuiu;
    }

    public int hashCode() {
        return (((this.f63985zdlpuopuiu.hashCode() * 31) + Integer.hashCode(this.f63984yggfygwlhe)) * 31) + this.f63983jyumaefscl.hashCode();
    }

    public final List iobyxmoadg() {
        return this.f63983jyumaefscl;
    }

    public String toString() {
        return "TableSpecialBannerUiModel(itemId=" + this.f63985zdlpuopuiu + ", spanCount=" + this.f63984yggfygwlhe + ", items=" + this.f63983jyumaefscl + ")";
    }

    public final int wkgbmnqykc() {
        return this.f63984yggfygwlhe;
    }

    public /* synthetic */ zoijcleaow(String str, int i13, List list, int i14, gtknphoqwx gtknphoqwxVar) {
        this((i14 & 1) != 0 ? "" : str, i13, list);
    }
}
