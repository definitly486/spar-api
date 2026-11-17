package q7;

import android.graphics.Path;
import com.airbnb.lottie.hcddaimhww;

/* JADX INFO: loaded from: classes2.dex */
public class rgvfuqvkyq implements ppxfxbqfkf {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final p7.wkgbmnqykc f78141eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final boolean f78142gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final boolean f78143iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f78144ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final p7.iobyxmoadg f78145wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Path.FillType f78146zoijcleaow;

    public rgvfuqvkyq(String str, boolean z13, Path.FillType fillType, p7.iobyxmoadg iobyxmoadgVar, p7.wkgbmnqykc wkgbmnqykcVar, boolean z14) {
        this.f78144ppxfxbqfkf = str;
        this.f78143iobyxmoadg = z13;
        this.f78146zoijcleaow = fillType;
        this.f78145wkgbmnqykc = iobyxmoadgVar;
        this.f78141eablkybsjg = wkgbmnqykcVar;
        this.f78142gxszxtbevo = z14;
    }

    public p7.wkgbmnqykc eablkybsjg() {
        return this.f78141eablkybsjg;
    }

    public boolean gxszxtbevo() {
        return this.f78142gxszxtbevo;
    }

    @Override // q7.ppxfxbqfkf
    public k7.ppxfxbqfkf iobyxmoadg(hcddaimhww hcddaimhwwVar, com.airbnb.lottie.btonecajqb btonecajqbVar, r7.zoijcleaow zoijcleaowVar) {
        return new k7.lqeggnwhkg(hcddaimhwwVar, zoijcleaowVar, this);
    }

    public Path.FillType ppxfxbqfkf() {
        return this.f78146zoijcleaow;
    }

    public String toString() {
        return "ShapeFill{color=, fillEnabled=" + this.f78143iobyxmoadg + '}';
    }

    public String wkgbmnqykc() {
        return this.f78144ppxfxbqfkf;
    }

    public p7.iobyxmoadg zoijcleaow() {
        return this.f78145wkgbmnqykc;
    }
}
