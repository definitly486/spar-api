package ow0;

import android.widget.ImageView;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class dxjokdxxww {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Integer f74820iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final ImageView.ScaleType f74821ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final Float f74822wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Integer f74823zoijcleaow;

    public dxjokdxxww(Integer num, Integer num2, ImageView.ScaleType scaleType, Float f13) {
        this.f74820iobyxmoadg = num;
        this.f74823zoijcleaow = num2;
        this.f74821ppxfxbqfkf = scaleType;
        this.f74822wkgbmnqykc = f13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dxjokdxxww)) {
            return false;
        }
        dxjokdxxww dxjokdxxwwVar = (dxjokdxxww) obj;
        return zdlpuopuiu.eablkybsjg(this.f74820iobyxmoadg, dxjokdxxwwVar.f74820iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f74823zoijcleaow, dxjokdxxwwVar.f74823zoijcleaow) && this.f74821ppxfxbqfkf == dxjokdxxwwVar.f74821ppxfxbqfkf && zdlpuopuiu.eablkybsjg(this.f74822wkgbmnqykc, dxjokdxxwwVar.f74822wkgbmnqykc);
    }

    public int hashCode() {
        Integer num = this.f74820iobyxmoadg;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f74823zoijcleaow;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        ImageView.ScaleType scaleType = this.f74821ppxfxbqfkf;
        int iHashCode3 = (iHashCode2 + (scaleType == null ? 0 : scaleType.hashCode())) * 31;
        Float f13 = this.f74822wkgbmnqykc;
        return iHashCode3 + (f13 != null ? f13.hashCode() : 0);
    }

    public final Float iobyxmoadg() {
        return this.f74822wkgbmnqykc;
    }

    public final ImageView.ScaleType ppxfxbqfkf() {
        return this.f74821ppxfxbqfkf;
    }

    public String toString() {
        return "ImageTransformer(widthDp=" + this.f74820iobyxmoadg + ", heightDp=" + this.f74823zoijcleaow + ", scaleType=" + this.f74821ppxfxbqfkf + ", cornerRadius=" + this.f74822wkgbmnqykc + ")";
    }

    public final Integer wkgbmnqykc() {
        return this.f74820iobyxmoadg;
    }

    public final Integer zoijcleaow() {
        return this.f74823zoijcleaow;
    }
}
