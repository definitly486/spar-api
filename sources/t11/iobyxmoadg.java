package t11;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private static final DecimalFormat f109300dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private static final DecimalFormat f109301eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private static final DecimalFormat f109302gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final iobyxmoadg f109303iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private static final DecimalFormat f109304lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private static final DecimalFormat f109305nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final DecimalFormat f109306ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final DecimalFormat f109307wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final DecimalFormat f109308zoijcleaow;

    static {
        iobyxmoadg iobyxmoadgVar = new iobyxmoadg();
        f109303iobyxmoadg = iobyxmoadgVar;
        f109308zoijcleaow = zoijcleaow(iobyxmoadgVar, "0.##", (char) 0, (char) 0, 6, null);
        f109306ppxfxbqfkf = zoijcleaow(iobyxmoadgVar, "0.00", (char) 0, (char) 0, 6, null);
        f109307wkgbmnqykc = zoijcleaow(iobyxmoadgVar, "0.0", (char) 0, (char) 0, 6, null);
        f109301eablkybsjg = zoijcleaow(iobyxmoadgVar, CommonUrlParts.Values.FALSE_INTEGER, (char) 0, (char) 0, 6, null);
        f109302gxszxtbevo = zoijcleaow(iobyxmoadgVar, "0.0", '.', (char) 0, 4, null);
        f109304lqeggnwhkg = zoijcleaow(iobyxmoadgVar, "0.##", (char) 0, (char) 0, 6, null);
        f109305nufgyqmvbu = zoijcleaow(iobyxmoadgVar, "#.###", (char) 0, (char) 0, 6, null);
        f109300dxjokdxxww = zoijcleaow(iobyxmoadgVar, "0.0", (char) 0, (char) 0, 6, null);
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
        String str = f109300dxjokdxxww.format(value);
        zdlpuopuiu.dxjokdxxww(str, "format(...)");
        return str;
    }

    public final String draadjrbmk(double d13) {
        String str = f109308zoijcleaow.format(vg.iobyxmoadg.eablkybsjg(d13 * ((double) 100)) / 100.0d);
        zdlpuopuiu.dxjokdxxww(str, "format(...)");
        return str;
    }

    public final String dxjokdxxww(Object value) {
        zdlpuopuiu.btonecajqb(value, "value");
        String str = f109305nufgyqmvbu.format(value);
        zdlpuopuiu.dxjokdxxww(str, "format(...)");
        return str;
    }

    public final String eablkybsjg(Object value) {
        zdlpuopuiu.btonecajqb(value, "value");
        String str = f109307wkgbmnqykc.format(value);
        zdlpuopuiu.dxjokdxxww(str, "format(...)");
        return str;
    }

    public final String gtknphoqwx(Object value) {
        zdlpuopuiu.btonecajqb(value, "value");
        String str = f109306ppxfxbqfkf.format(value);
        zdlpuopuiu.dxjokdxxww(str, "format(...)");
        return str;
    }

    public final String gxszxtbevo(Object value) {
        zdlpuopuiu.btonecajqb(value, "value");
        String str = f109302gxszxtbevo.format(value);
        zdlpuopuiu.dxjokdxxww(str, "format(...)");
        return str;
    }

    public final String lqeggnwhkg(Object value) {
        zdlpuopuiu.btonecajqb(value, "value");
        String str = f109306ppxfxbqfkf.format(value);
        zdlpuopuiu.dxjokdxxww(str, "format(...)");
        return str;
    }

    public final String nufgyqmvbu(Object value) {
        zdlpuopuiu.btonecajqb(value, "value");
        String str = f109302gxszxtbevo.format(value);
        zdlpuopuiu.dxjokdxxww(str, "format(...)");
        return str;
    }

    public final String ppxfxbqfkf(Object value) {
        zdlpuopuiu.btonecajqb(value, "value");
        String str = f109304lqeggnwhkg.format(value);
        zdlpuopuiu.dxjokdxxww(str, "format(...)");
        return str;
    }

    public final String wflxmlrfwp(Object value) {
        zdlpuopuiu.btonecajqb(value, "value");
        String str = f109301eablkybsjg.format(value);
        zdlpuopuiu.dxjokdxxww(str, "format(...)");
        return str;
    }

    public final String wkgbmnqykc(Object value) {
        zdlpuopuiu.btonecajqb(value, "value");
        if (!(value instanceof Number)) {
            return value.toString();
        }
        double dDoubleValue = ((Number) value).doubleValue();
        String str = dDoubleValue % 1.0d == 0.0d ? f109301eablkybsjg.format(dDoubleValue) : f109306ppxfxbqfkf.format(dDoubleValue);
        zdlpuopuiu.lqeggnwhkg(str);
        return str;
    }
}
