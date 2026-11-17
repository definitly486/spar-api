package kt0;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.tzroggbefp;
import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;
import ru.myspar.proloyalty.core.domain.models.comboset.ComboHint;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private final ComboHint f60535agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final wkgbmnqykc f60536btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final ComboHint f60537draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final ComboHint f60538dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final String f60539eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final List f60540gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final boolean f60541gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f60542iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final String f60543lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final String f60544nufgyqmvbu;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private final double f60545ojitshcjhn;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final double f60546ppxfxbqfkf;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private final int f60547rgvfuqvkyq;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    private final ComboHint f60548vdvldrhtss;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final List f60549wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final String f60550wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f60551zoijcleaow;

    public iobyxmoadg(String id2, String title, double d13, String subtitle, String description, boolean z13, String backgroundColorHex, String str, ComboHint comboHint, wkgbmnqykc productsOnDisplay, List productsFirstList, ComboHint comboHint2, List productsSecondList, ComboHint comboHint3) {
        String discountHintColorHex = str;
        zdlpuopuiu.btonecajqb(id2, "id");
        zdlpuopuiu.btonecajqb(title, "title");
        zdlpuopuiu.btonecajqb(subtitle, "subtitle");
        zdlpuopuiu.btonecajqb(description, "description");
        zdlpuopuiu.btonecajqb(backgroundColorHex, "backgroundColorHex");
        zdlpuopuiu.btonecajqb(discountHintColorHex, "discountHintColorHex");
        zdlpuopuiu.btonecajqb(productsOnDisplay, "productsOnDisplay");
        zdlpuopuiu.btonecajqb(productsFirstList, "productsFirstList");
        zdlpuopuiu.btonecajqb(productsSecondList, "productsSecondList");
        this.f60542iobyxmoadg = id2;
        this.f60551zoijcleaow = title;
        this.f60546ppxfxbqfkf = d13;
        this.f60550wkgbmnqykc = subtitle;
        this.f60539eablkybsjg = description;
        this.f60541gxszxtbevo = z13;
        this.f60543lqeggnwhkg = backgroundColorHex;
        this.f60544nufgyqmvbu = discountHintColorHex;
        this.f60538dxjokdxxww = comboHint;
        this.f60536btonecajqb = productsOnDisplay;
        this.f60540gtknphoqwx = productsFirstList;
        this.f60537draadjrbmk = comboHint2;
        this.f60549wflxmlrfwp = productsSecondList;
        this.f60535agtfadlqog = comboHint3;
        double price = productsOnDisplay.iobyxmoadg().getPrice() + productsOnDisplay.zoijcleaow().getPrice();
        this.f60545ojitshcjhn = price;
        int i13 = (int) (((price - d13) * ((double) 100)) / price);
        this.f60547rgvfuqvkyq = i13;
        ComboHint comboHint4 = null;
        discountHintColorHex = kcexrzcfyt.zfvoamnweg(str) ? null : discountHintColorHex;
        if (discountHintColorHex != null) {
            tzroggbefp tzroggbefpVar = tzroggbefp.f60034iobyxmoadg;
            String str2 = String.format(Locale.getDefault(), "-%d%%", Arrays.copyOf(new Object[]{Integer.valueOf(i13)}, 1));
            zdlpuopuiu.dxjokdxxww(str2, "format(...)");
            comboHint4 = new ComboHint(discountHintColorHex, str2, discountHintColorHex);
        }
        this.f60548vdvldrhtss = comboHint4;
    }

    public final ComboHint agtfadlqog() {
        return this.f60535agtfadlqog;
    }

    public final double btonecajqb() {
        return this.f60546ppxfxbqfkf;
    }

    public final List draadjrbmk() {
        return this.f60540gtknphoqwx;
    }

    public final double dxjokdxxww() {
        return this.f60545ojitshcjhn;
    }

    public final ComboHint eablkybsjg() {
        return this.f60548vdvldrhtss;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f60542iobyxmoadg, iobyxmoadgVar.f60542iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f60551zoijcleaow, iobyxmoadgVar.f60551zoijcleaow) && Double.compare(this.f60546ppxfxbqfkf, iobyxmoadgVar.f60546ppxfxbqfkf) == 0 && zdlpuopuiu.eablkybsjg(this.f60550wkgbmnqykc, iobyxmoadgVar.f60550wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f60539eablkybsjg, iobyxmoadgVar.f60539eablkybsjg) && this.f60541gxszxtbevo == iobyxmoadgVar.f60541gxszxtbevo && zdlpuopuiu.eablkybsjg(this.f60543lqeggnwhkg, iobyxmoadgVar.f60543lqeggnwhkg) && zdlpuopuiu.eablkybsjg(this.f60544nufgyqmvbu, iobyxmoadgVar.f60544nufgyqmvbu) && zdlpuopuiu.eablkybsjg(this.f60538dxjokdxxww, iobyxmoadgVar.f60538dxjokdxxww) && zdlpuopuiu.eablkybsjg(this.f60536btonecajqb, iobyxmoadgVar.f60536btonecajqb) && zdlpuopuiu.eablkybsjg(this.f60540gtknphoqwx, iobyxmoadgVar.f60540gtknphoqwx) && zdlpuopuiu.eablkybsjg(this.f60537draadjrbmk, iobyxmoadgVar.f60537draadjrbmk) && zdlpuopuiu.eablkybsjg(this.f60549wflxmlrfwp, iobyxmoadgVar.f60549wflxmlrfwp) && zdlpuopuiu.eablkybsjg(this.f60535agtfadlqog, iobyxmoadgVar.f60535agtfadlqog);
    }

    public final ComboHint gtknphoqwx() {
        return this.f60537draadjrbmk;
    }

    public final String gxszxtbevo() {
        return this.f60544nufgyqmvbu;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((this.f60542iobyxmoadg.hashCode() * 31) + this.f60551zoijcleaow.hashCode()) * 31) + Double.hashCode(this.f60546ppxfxbqfkf)) * 31) + this.f60550wkgbmnqykc.hashCode()) * 31) + this.f60539eablkybsjg.hashCode()) * 31) + Boolean.hashCode(this.f60541gxszxtbevo)) * 31) + this.f60543lqeggnwhkg.hashCode()) * 31) + this.f60544nufgyqmvbu.hashCode()) * 31;
        ComboHint comboHint = this.f60538dxjokdxxww;
        int iHashCode2 = (((((iHashCode + (comboHint == null ? 0 : comboHint.hashCode())) * 31) + this.f60536btonecajqb.hashCode()) * 31) + this.f60540gtknphoqwx.hashCode()) * 31;
        ComboHint comboHint2 = this.f60537draadjrbmk;
        int iHashCode3 = (((iHashCode2 + (comboHint2 == null ? 0 : comboHint2.hashCode())) * 31) + this.f60549wflxmlrfwp.hashCode()) * 31;
        ComboHint comboHint3 = this.f60535agtfadlqog;
        return iHashCode3 + (comboHint3 != null ? comboHint3.hashCode() : 0);
    }

    public final iobyxmoadg iobyxmoadg(String id2, String title, double d13, String subtitle, String description, boolean z13, String backgroundColorHex, String discountHintColorHex, ComboHint comboHint, wkgbmnqykc productsOnDisplay, List productsFirstList, ComboHint comboHint2, List productsSecondList, ComboHint comboHint3) {
        zdlpuopuiu.btonecajqb(id2, "id");
        zdlpuopuiu.btonecajqb(title, "title");
        zdlpuopuiu.btonecajqb(subtitle, "subtitle");
        zdlpuopuiu.btonecajqb(description, "description");
        zdlpuopuiu.btonecajqb(backgroundColorHex, "backgroundColorHex");
        zdlpuopuiu.btonecajqb(discountHintColorHex, "discountHintColorHex");
        zdlpuopuiu.btonecajqb(productsOnDisplay, "productsOnDisplay");
        zdlpuopuiu.btonecajqb(productsFirstList, "productsFirstList");
        zdlpuopuiu.btonecajqb(productsSecondList, "productsSecondList");
        return new iobyxmoadg(id2, title, d13, subtitle, description, z13, backgroundColorHex, discountHintColorHex, comboHint, productsOnDisplay, productsFirstList, comboHint2, productsSecondList, comboHint3);
    }

    public final ComboHint lqeggnwhkg() {
        return this.f60538dxjokdxxww;
    }

    public final String nufgyqmvbu() {
        return this.f60542iobyxmoadg;
    }

    public final List ojitshcjhn() {
        return this.f60549wflxmlrfwp;
    }

    public final boolean oxmwwwfdhm() {
        return this.f60541gxszxtbevo;
    }

    public final String ppxfxbqfkf() {
        return this.f60543lqeggnwhkg;
    }

    public final String rgvfuqvkyq() {
        return this.f60550wkgbmnqykc;
    }

    public String toString() {
        return "ComboSetUiModel(id=" + this.f60542iobyxmoadg + ", title=" + this.f60551zoijcleaow + ", price=" + this.f60546ppxfxbqfkf + ", subtitle=" + this.f60550wkgbmnqykc + ", description=" + this.f60539eablkybsjg + ", isSelectable=" + this.f60541gxszxtbevo + ", backgroundColorHex=" + this.f60543lqeggnwhkg + ", discountHintColorHex=" + this.f60544nufgyqmvbu + ", hint=" + this.f60538dxjokdxxww + ", productsOnDisplay=" + this.f60536btonecajqb + ", productsFirstList=" + this.f60540gtknphoqwx + ", productsFirstHint=" + this.f60537draadjrbmk + ", productsSecondList=" + this.f60549wflxmlrfwp + ", productsSecondHint=" + this.f60535agtfadlqog + ")";
    }

    public final String vdvldrhtss() {
        return this.f60551zoijcleaow;
    }

    public final wkgbmnqykc wflxmlrfwp() {
        return this.f60536btonecajqb;
    }

    public final String wkgbmnqykc() {
        return this.f60539eablkybsjg;
    }
}
