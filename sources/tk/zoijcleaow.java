package tk;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public final class zoijcleaow {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    public static final bl.gxszxtbevo f110941btonecajqb;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    public static final bl.gxszxtbevo f110942dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public static final bl.gxszxtbevo f110943eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public static final bl.gxszxtbevo f110944gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public static final bl.gxszxtbevo f110945lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    public static final bl.gxszxtbevo f110946nufgyqmvbu;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public static final iobyxmoadg f110947wkgbmnqykc = new iobyxmoadg(null);

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final bl.gxszxtbevo f110948iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final int f110949ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final bl.gxszxtbevo f110950zoijcleaow;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    static {
        bl.gxszxtbevo.iobyxmoadg iobyxmoadgVar = bl.gxszxtbevo.f16674iwizpuwonk;
        f110943eablkybsjg = iobyxmoadgVar.wkgbmnqykc(StringUtils.PROCESS_POSTFIX_DELIMITER);
        f110944gxszxtbevo = iobyxmoadgVar.wkgbmnqykc(":status");
        f110945lqeggnwhkg = iobyxmoadgVar.wkgbmnqykc(":method");
        f110946nufgyqmvbu = iobyxmoadgVar.wkgbmnqykc(":path");
        f110942dxjokdxxww = iobyxmoadgVar.wkgbmnqykc(":scheme");
        f110941btonecajqb = iobyxmoadgVar.wkgbmnqykc(":authority");
    }

    public zoijcleaow(bl.gxszxtbevo name, bl.gxszxtbevo value) {
        zdlpuopuiu.btonecajqb(name, "name");
        zdlpuopuiu.btonecajqb(value, "value");
        this.f110948iobyxmoadg = name;
        this.f110950zoijcleaow = value;
        this.f110949ppxfxbqfkf = name.hcddaimhww() + 32 + value.hcddaimhww();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zoijcleaow)) {
            return false;
        }
        zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
        return zdlpuopuiu.eablkybsjg(this.f110948iobyxmoadg, zoijcleaowVar.f110948iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f110950zoijcleaow, zoijcleaowVar.f110950zoijcleaow);
    }

    public int hashCode() {
        return (this.f110948iobyxmoadg.hashCode() * 31) + this.f110950zoijcleaow.hashCode();
    }

    public final bl.gxszxtbevo iobyxmoadg() {
        return this.f110948iobyxmoadg;
    }

    public String toString() {
        return this.f110948iobyxmoadg.wypolnanlu() + ": " + this.f110950zoijcleaow.wypolnanlu();
    }

    public final bl.gxszxtbevo zoijcleaow() {
        return this.f110950zoijcleaow;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public zoijcleaow(String name, String value) {
        zdlpuopuiu.btonecajqb(name, "name");
        zdlpuopuiu.btonecajqb(value, "value");
        bl.gxszxtbevo.iobyxmoadg iobyxmoadgVar = bl.gxszxtbevo.f16674iwizpuwonk;
        this(iobyxmoadgVar.wkgbmnqykc(name), iobyxmoadgVar.wkgbmnqykc(value));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public zoijcleaow(bl.gxszxtbevo name, String value) {
        this(name, bl.gxszxtbevo.f16674iwizpuwonk.wkgbmnqykc(value));
        zdlpuopuiu.btonecajqb(name, "name");
        zdlpuopuiu.btonecajqb(value, "value");
    }
}
