package s62;

import java.util.List;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class zoijcleaow implements o00.iobyxmoadg {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final List f105617jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final int f105618yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f105619zdlpuopuiu;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    public static final iobyxmoadg f105616iwizpuwonk = new iobyxmoadg(null);

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    public static final int f105615cqumvgiudr = 8;

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
        this.f105619zdlpuopuiu = itemId;
        this.f105618yggfygwlhe = i13;
        this.f105617jyumaefscl = items;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zoijcleaow)) {
            return false;
        }
        zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
        return zdlpuopuiu.eablkybsjg(this.f105619zdlpuopuiu, zoijcleaowVar.f105619zdlpuopuiu) && this.f105618yggfygwlhe == zoijcleaowVar.f105618yggfygwlhe && zdlpuopuiu.eablkybsjg(this.f105617jyumaefscl, zoijcleaowVar.f105617jyumaefscl);
    }

    @Override // w30.ppxfxbqfkf
    public String getItemId() {
        return this.f105619zdlpuopuiu;
    }

    public int hashCode() {
        return (((this.f105619zdlpuopuiu.hashCode() * 31) + Integer.hashCode(this.f105618yggfygwlhe)) * 31) + this.f105617jyumaefscl.hashCode();
    }

    public final List iobyxmoadg() {
        return this.f105617jyumaefscl;
    }

    public String toString() {
        return "TableSpecialBannerUiModel(itemId=" + this.f105619zdlpuopuiu + ", spanCount=" + this.f105618yggfygwlhe + ", items=" + this.f105617jyumaefscl + ")";
    }

    public final int wkgbmnqykc() {
        return this.f105618yggfygwlhe;
    }

    public /* synthetic */ zoijcleaow(String str, int i13, List list, int i14, gtknphoqwx gtknphoqwxVar) {
        this((i14 & 1) != 0 ? "" : str, i13, list);
    }
}
