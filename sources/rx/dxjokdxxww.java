package rx;

import android.widget.ImageView;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class dxjokdxxww {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Integer f104986iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final ImageView.ScaleType f104987ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final Float f104988wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Integer f104989zoijcleaow;

    public dxjokdxxww(Integer num, Integer num2, ImageView.ScaleType scaleType, Float f13) {
        this.f104986iobyxmoadg = num;
        this.f104989zoijcleaow = num2;
        this.f104987ppxfxbqfkf = scaleType;
        this.f104988wkgbmnqykc = f13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dxjokdxxww)) {
            return false;
        }
        dxjokdxxww dxjokdxxwwVar = (dxjokdxxww) obj;
        return zdlpuopuiu.eablkybsjg(this.f104986iobyxmoadg, dxjokdxxwwVar.f104986iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f104989zoijcleaow, dxjokdxxwwVar.f104989zoijcleaow) && this.f104987ppxfxbqfkf == dxjokdxxwwVar.f104987ppxfxbqfkf && zdlpuopuiu.eablkybsjg(this.f104988wkgbmnqykc, dxjokdxxwwVar.f104988wkgbmnqykc);
    }

    public int hashCode() {
        Integer num = this.f104986iobyxmoadg;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f104989zoijcleaow;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        ImageView.ScaleType scaleType = this.f104987ppxfxbqfkf;
        int iHashCode3 = (iHashCode2 + (scaleType == null ? 0 : scaleType.hashCode())) * 31;
        Float f13 = this.f104988wkgbmnqykc;
        return iHashCode3 + (f13 != null ? f13.hashCode() : 0);
    }

    public final Float iobyxmoadg() {
        return this.f104988wkgbmnqykc;
    }

    public final ImageView.ScaleType ppxfxbqfkf() {
        return this.f104987ppxfxbqfkf;
    }

    public String toString() {
        return "ImageTransformer(widthDp=" + this.f104986iobyxmoadg + ", heightDp=" + this.f104989zoijcleaow + ", scaleType=" + this.f104987ppxfxbqfkf + ", cornerRadius=" + this.f104988wkgbmnqykc + ")";
    }

    public final Integer wkgbmnqykc() {
        return this.f104986iobyxmoadg;
    }

    public final Integer zoijcleaow() {
        return this.f104989zoijcleaow;
    }
}
