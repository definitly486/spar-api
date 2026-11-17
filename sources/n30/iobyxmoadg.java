package n30;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private static final DecimalFormat f68489dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private static final DecimalFormat f68490eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private static final DecimalFormat f68491gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final iobyxmoadg f68492iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private static final DecimalFormat f68493lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private static final DecimalFormat f68494nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final DecimalFormat f68495ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final DecimalFormat f68496wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final DecimalFormat f68497zoijcleaow;

    static {
        iobyxmoadg iobyxmoadgVar = new iobyxmoadg();
        f68492iobyxmoadg = iobyxmoadgVar;
        f68497zoijcleaow = zoijcleaow(iobyxmoadgVar, "0.##", (char) 0, (char) 0, 6, null);
        f68495ppxfxbqfkf = zoijcleaow(iobyxmoadgVar, "0.00", (char) 0, (char) 0, 6, null);
        f68496wkgbmnqykc = zoijcleaow(iobyxmoadgVar, "0.0", (char) 0, (char) 0, 6, null);
        f68490eablkybsjg = zoijcleaow(iobyxmoadgVar, CommonUrlParts.Values.FALSE_INTEGER, (char) 0, (char) 0, 6, null);
        f68491gxszxtbevo = zoijcleaow(iobyxmoadgVar, "0.0", '.', (char) 0, 4, null);
        f68493lqeggnwhkg = zoijcleaow(iobyxmoadgVar, "0.##", (char) 0, (char) 0, 6, null);
        f68494nufgyqmvbu = zoijcleaow(iobyxmoadgVar, "#.###", (char) 0, (char) 0, 6, null);
        f68489dxjokdxxww = zoijcleaow(iobyxmoadgVar, "0.0", (char) 0, (char) 0, 6, null);
    }

    private iobyxmoadg() {
    }

    private final DecimalFormat iobyxmoadg(String str, char c13, char c14) {
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols();
        decimalFormatSymbols.setDecimalSeparator(c13);
        decimalFormatSymbols.setGroupingSeparator(c14);
        return new DecimalFormat(str, decimalFormatSymbols);
    }

    static /* synthetic */ DecimalFormat zoijcleaow(iobyxmoadg iobyxmoadgVar, String str, char c13, char c14, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            c13 = ',';
        }
        if ((i13 & 4) != 0) {
            c14 = ' ';
        }
        return iobyxmoadgVar.iobyxmoadg(str, c13, c14);
    }

    public final String btonecajqb(Object value) {
        zdlpuopuiu.btonecajqb(value, "value");
        String str = f68489dxjokdxxww.format(value);
        zdlpuopuiu.dxjokdxxww(str, "format(...)");
        return str;
    }

    public final String draadjrbmk(double d13) {
        String str = f68497zoijcleaow.format(vg.iobyxmoadg.eablkybsjg(d13 * ((double) 100)) / 100.0d);
        zdlpuopuiu.dxjokdxxww(str, "format(...)");
        return str;
    }

    public final String dxjokdxxww(Object value) {
        zdlpuopuiu.btonecajqb(value, "value");
        String str = f68494nufgyqmvbu.format(value);
        zdlpuopuiu.dxjokdxxww(str, "format(...)");
        return str;
    }

    public final String eablkybsjg(Object value) {
        zdlpuopuiu.btonecajqb(value, "value");
        String str = f68496wkgbmnqykc.format(value);
        zdlpuopuiu.dxjokdxxww(str, "format(...)");
        return str;
    }

    public final String gtknphoqwx(Object value) {
        zdlpuopuiu.btonecajqb(value, "value");
        String str = f68495ppxfxbqfkf.format(value);
        zdlpuopuiu.dxjokdxxww(str, "format(...)");
        return str;
    }

    public final String gxszxtbevo(Object value) {
        zdlpuopuiu.btonecajqb(value, "value");
        String str = f68491gxszxtbevo.format(value);
        zdlpuopuiu.dxjokdxxww(str, "format(...)");
        return str;
    }

    public final String lqeggnwhkg(Object value) {
        zdlpuopuiu.btonecajqb(value, "value");
        String str = f68495ppxfxbqfkf.format(value);
        zdlpuopuiu.dxjokdxxww(str, "format(...)");
        return str;
    }

    public final String nufgyqmvbu(Object value) {
        zdlpuopuiu.btonecajqb(value, "value");
        String str = f68491gxszxtbevo.format(value);
        zdlpuopuiu.dxjokdxxww(str, "format(...)");
        return str;
    }

    public final String ppxfxbqfkf(Object value) {
        zdlpuopuiu.btonecajqb(value, "value");
        String str = f68490eablkybsjg.format(value);
        zdlpuopuiu.dxjokdxxww(str, "format(...)");
        return str;
    }

    public final String wflxmlrfwp(Object value) {
        zdlpuopuiu.btonecajqb(value, "value");
        String str = f68490eablkybsjg.format(value);
        zdlpuopuiu.dxjokdxxww(str, "format(...)");
        return str;
    }

    public final String wkgbmnqykc(Object value) {
        zdlpuopuiu.btonecajqb(value, "value");
        String str = f68493lqeggnwhkg.format(value);
        zdlpuopuiu.dxjokdxxww(str, "format(...)");
        return str;
    }
}
