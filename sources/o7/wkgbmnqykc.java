package o7;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class wkgbmnqykc {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final String f72205eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final String f72206gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final List f72207iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final double f72208ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final double f72209wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final char f72210zoijcleaow;

    public wkgbmnqykc(List list, char c13, double d13, double d14, String str, String str2) {
        this.f72207iobyxmoadg = list;
        this.f72210zoijcleaow = c13;
        this.f72208ppxfxbqfkf = d13;
        this.f72209wkgbmnqykc = d14;
        this.f72205eablkybsjg = str;
        this.f72206gxszxtbevo = str2;
    }

    public static int ppxfxbqfkf(char c13, String str, String str2) {
        return (((c13 * 31) + str.hashCode()) * 31) + str2.hashCode();
    }

    public int hashCode() {
        return ppxfxbqfkf(this.f72210zoijcleaow, this.f72206gxszxtbevo, this.f72205eablkybsjg);
    }

    public List iobyxmoadg() {
        return this.f72207iobyxmoadg;
    }

    public double zoijcleaow() {
        return this.f72209wkgbmnqykc;
    }
}
