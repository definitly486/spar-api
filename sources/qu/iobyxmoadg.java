package qu;

import java.util.List;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private static final C1792iobyxmoadg f80650btonecajqb = new C1792iobyxmoadg(null);

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final int f80651dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final List f80652eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final List f80653gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f80654iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final double f80655lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final boolean f80656nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final double f80657ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final wkgbmnqykc f80658wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f80659zoijcleaow;

    /* JADX INFO: renamed from: qu.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    private static final class C1792iobyxmoadg {
        public /* synthetic */ C1792iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private C1792iobyxmoadg() {
        }
    }

    public iobyxmoadg(String id2, String name, double d13, wkgbmnqykc productsOnDisplay, List productsFirstList, List productsSecondList) {
        zdlpuopuiu.btonecajqb(id2, "id");
        zdlpuopuiu.btonecajqb(name, "name");
        zdlpuopuiu.btonecajqb(productsOnDisplay, "productsOnDisplay");
        zdlpuopuiu.btonecajqb(productsFirstList, "productsFirstList");
        zdlpuopuiu.btonecajqb(productsSecondList, "productsSecondList");
        this.f80654iobyxmoadg = id2;
        this.f80659zoijcleaow = name;
        this.f80657ppxfxbqfkf = d13;
        this.f80658wkgbmnqykc = productsOnDisplay;
        this.f80652eablkybsjg = productsFirstList;
        this.f80653gxszxtbevo = productsSecondList;
        double price = productsOnDisplay.iobyxmoadg().getPrice() + productsOnDisplay.zoijcleaow().getPrice();
        this.f80655lqeggnwhkg = price;
        int size = productsFirstList.size();
        boolean z13 = true;
        if (size <= 1 && productsSecondList.size() <= 1) {
            z13 = false;
        }
        this.f80656nufgyqmvbu = z13;
        this.f80651dxjokdxxww = vg.iobyxmoadg.ppxfxbqfkf(((price - d13) * ((double) 100)) / price);
    }

    public static /* synthetic */ iobyxmoadg zoijcleaow(iobyxmoadg iobyxmoadgVar, String str, String str2, double d13, wkgbmnqykc wkgbmnqykcVar, List list, List list2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = iobyxmoadgVar.f80654iobyxmoadg;
        }
        if ((i13 & 2) != 0) {
            str2 = iobyxmoadgVar.f80659zoijcleaow;
        }
        String str3 = str2;
        if ((i13 & 4) != 0) {
            d13 = iobyxmoadgVar.f80657ppxfxbqfkf;
        }
        double d14 = d13;
        if ((i13 & 8) != 0) {
            wkgbmnqykcVar = iobyxmoadgVar.f80658wkgbmnqykc;
        }
        wkgbmnqykc wkgbmnqykcVar2 = wkgbmnqykcVar;
        if ((i13 & 16) != 0) {
            list = iobyxmoadgVar.f80652eablkybsjg;
        }
        List list3 = list;
        if ((i13 & 32) != 0) {
            list2 = iobyxmoadgVar.f80653gxszxtbevo;
        }
        return iobyxmoadgVar.iobyxmoadg(str, str3, d14, wkgbmnqykcVar2, list3, list2);
    }

    public final List btonecajqb() {
        return this.f80653gxszxtbevo;
    }

    public final wkgbmnqykc dxjokdxxww() {
        return this.f80658wkgbmnqykc;
    }

    public final String eablkybsjg() {
        return this.f80659zoijcleaow;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f80654iobyxmoadg, iobyxmoadgVar.f80654iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f80659zoijcleaow, iobyxmoadgVar.f80659zoijcleaow) && Double.compare(this.f80657ppxfxbqfkf, iobyxmoadgVar.f80657ppxfxbqfkf) == 0 && zdlpuopuiu.eablkybsjg(this.f80658wkgbmnqykc, iobyxmoadgVar.f80658wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f80652eablkybsjg, iobyxmoadgVar.f80652eablkybsjg) && zdlpuopuiu.eablkybsjg(this.f80653gxszxtbevo, iobyxmoadgVar.f80653gxszxtbevo);
    }

    public final boolean gtknphoqwx() {
        return this.f80656nufgyqmvbu;
    }

    public final double gxszxtbevo() {
        return this.f80655lqeggnwhkg;
    }

    public int hashCode() {
        return (((((((((this.f80654iobyxmoadg.hashCode() * 31) + this.f80659zoijcleaow.hashCode()) * 31) + Double.hashCode(this.f80657ppxfxbqfkf)) * 31) + this.f80658wkgbmnqykc.hashCode()) * 31) + this.f80652eablkybsjg.hashCode()) * 31) + this.f80653gxszxtbevo.hashCode();
    }

    public final iobyxmoadg iobyxmoadg(String id2, String name, double d13, wkgbmnqykc productsOnDisplay, List productsFirstList, List productsSecondList) {
        zdlpuopuiu.btonecajqb(id2, "id");
        zdlpuopuiu.btonecajqb(name, "name");
        zdlpuopuiu.btonecajqb(productsOnDisplay, "productsOnDisplay");
        zdlpuopuiu.btonecajqb(productsFirstList, "productsFirstList");
        zdlpuopuiu.btonecajqb(productsSecondList, "productsSecondList");
        return new iobyxmoadg(id2, name, d13, productsOnDisplay, productsFirstList, productsSecondList);
    }

    public final double lqeggnwhkg() {
        return this.f80657ppxfxbqfkf;
    }

    public final List nufgyqmvbu() {
        return this.f80652eablkybsjg;
    }

    public final int ppxfxbqfkf() {
        return this.f80651dxjokdxxww;
    }

    public String toString() {
        return "ComboSetUiModel(id=" + this.f80654iobyxmoadg + ", name=" + this.f80659zoijcleaow + ", price=" + this.f80657ppxfxbqfkf + ", productsOnDisplay=" + this.f80658wkgbmnqykc + ", productsFirstList=" + this.f80652eablkybsjg + ", productsSecondList=" + this.f80653gxszxtbevo + ")";
    }

    public final String wkgbmnqykc() {
        return this.f80654iobyxmoadg;
    }
}
