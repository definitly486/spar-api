package da1;

import android.content.Context;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f27338iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f27339zoijcleaow;

    public iobyxmoadg(String str, String str2) {
        this.f27338iobyxmoadg = str;
        this.f27339zoijcleaow = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f27338iobyxmoadg, iobyxmoadgVar.f27338iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f27339zoijcleaow, iobyxmoadgVar.f27339zoijcleaow);
    }

    public int hashCode() {
        String str = this.f27338iobyxmoadg;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f27339zoijcleaow;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String iobyxmoadg(Context context) {
        zdlpuopuiu.btonecajqb(context, "context");
        return p41.ppxfxbqfkf.eablkybsjg(context) ? this.f27339zoijcleaow : this.f27338iobyxmoadg;
    }

    public String toString() {
        return "CouponColorsUiModel(light=" + this.f27338iobyxmoadg + ", dark=" + this.f27339zoijcleaow + ")";
    }
}
