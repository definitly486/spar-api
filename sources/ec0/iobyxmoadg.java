package ec0;

import android.content.Context;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f31101iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f31102zoijcleaow;

    public iobyxmoadg(String str, String str2) {
        this.f31101iobyxmoadg = str;
        this.f31102zoijcleaow = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f31101iobyxmoadg, iobyxmoadgVar.f31101iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f31102zoijcleaow, iobyxmoadgVar.f31102zoijcleaow);
    }

    public int hashCode() {
        String str = this.f31101iobyxmoadg;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f31102zoijcleaow;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String iobyxmoadg(Context context) {
        zdlpuopuiu.btonecajqb(context, "context");
        return c60.zoijcleaow.eablkybsjg(context) ? this.f31102zoijcleaow : this.f31101iobyxmoadg;
    }

    public String toString() {
        return "CouponColorsUiModel(light=" + this.f31101iobyxmoadg + ", dark=" + this.f31102zoijcleaow + ")";
    }
}
