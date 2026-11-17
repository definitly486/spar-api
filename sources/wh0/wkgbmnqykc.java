package wh0;

import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.common.view.product.model.product.ProductUiModel;
import ru.myspar.components.special_products.api.models.Action;
import ru.myspar.core.domain.models.cart.ProductUIData;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes4.dex */
public final class wkgbmnqykc {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final Action f119885eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final String f119886gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f119887iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final List f119888ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final iobyxmoadg f119889wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f119890zoijcleaow;

    public enum iobyxmoadg {
        NEW,
        WEEK,
        POPULAR,
        SEASONAL,
        FOR_HOME,
        BLOCK_07,
        BLOCK_08,
        BLOCK_09,
        BLOCK_10,
        BLOCK_11;


        /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
        private static final /* synthetic */ ng.iobyxmoadg f119899yadqdtsiqt = ng.zoijcleaow.iobyxmoadg(iobyxmoadg());
    }

    public wkgbmnqykc(String title, String reference, List products, iobyxmoadg type, Action action, String externalCode) {
        zdlpuopuiu.btonecajqb(title, "title");
        zdlpuopuiu.btonecajqb(reference, "reference");
        zdlpuopuiu.btonecajqb(products, "products");
        zdlpuopuiu.btonecajqb(type, "type");
        zdlpuopuiu.btonecajqb(action, "action");
        zdlpuopuiu.btonecajqb(externalCode, "externalCode");
        this.f119887iobyxmoadg = title;
        this.f119890zoijcleaow = reference;
        this.f119888ppxfxbqfkf = products;
        this.f119889wkgbmnqykc = type;
        this.f119885eablkybsjg = action;
        this.f119886gxszxtbevo = externalCode;
    }

    public static /* synthetic */ wkgbmnqykc zoijcleaow(wkgbmnqykc wkgbmnqykcVar, String str, String str2, List list, iobyxmoadg iobyxmoadgVar, Action action, String str3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = wkgbmnqykcVar.f119887iobyxmoadg;
        }
        if ((i13 & 2) != 0) {
            str2 = wkgbmnqykcVar.f119890zoijcleaow;
        }
        String str4 = str2;
        if ((i13 & 4) != 0) {
            list = wkgbmnqykcVar.f119888ppxfxbqfkf;
        }
        List list2 = list;
        if ((i13 & 8) != 0) {
            iobyxmoadgVar = wkgbmnqykcVar.f119889wkgbmnqykc;
        }
        iobyxmoadg iobyxmoadgVar2 = iobyxmoadgVar;
        if ((i13 & 16) != 0) {
            action = wkgbmnqykcVar.f119885eablkybsjg;
        }
        Action action2 = action;
        if ((i13 & 32) != 0) {
            str3 = wkgbmnqykcVar.f119886gxszxtbevo;
        }
        return wkgbmnqykcVar.iobyxmoadg(str, str4, list2, iobyxmoadgVar2, action2, str3);
    }

    public final wkgbmnqykc dxjokdxxww(List list, rgvfuqvkyq mapper) {
        zdlpuopuiu.btonecajqb(mapper, "mapper");
        List<ProductUiModel> list2 = this.f119888ppxfxbqfkf;
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(list2, 10));
        for (ProductUiModel productUiModel : list2) {
            Object obj = null;
            if (list != null) {
                for (Object obj2 : list) {
                    if (zdlpuopuiu.eablkybsjg(((ProductUIData) obj2).getId(), productUiModel.getId())) {
                        obj = obj2;
                        break;
                    }
                }
                obj = (ProductUIData) obj;
            }
            arrayList.add((ProductUiModel) mapper.invoke(productUiModel, obj));
        }
        return zoijcleaow(this, null, null, arrayList, null, null, null, 59, null);
    }

    public final List eablkybsjg() {
        return this.f119888ppxfxbqfkf;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wkgbmnqykc)) {
            return false;
        }
        wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) obj;
        return zdlpuopuiu.eablkybsjg(this.f119887iobyxmoadg, wkgbmnqykcVar.f119887iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f119890zoijcleaow, wkgbmnqykcVar.f119890zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f119888ppxfxbqfkf, wkgbmnqykcVar.f119888ppxfxbqfkf) && this.f119889wkgbmnqykc == wkgbmnqykcVar.f119889wkgbmnqykc && this.f119885eablkybsjg == wkgbmnqykcVar.f119885eablkybsjg && zdlpuopuiu.eablkybsjg(this.f119886gxszxtbevo, wkgbmnqykcVar.f119886gxszxtbevo);
    }

    public final String gxszxtbevo() {
        return this.f119890zoijcleaow;
    }

    public int hashCode() {
        return (((((((((this.f119887iobyxmoadg.hashCode() * 31) + this.f119890zoijcleaow.hashCode()) * 31) + this.f119888ppxfxbqfkf.hashCode()) * 31) + this.f119889wkgbmnqykc.hashCode()) * 31) + this.f119885eablkybsjg.hashCode()) * 31) + this.f119886gxszxtbevo.hashCode();
    }

    public final wkgbmnqykc iobyxmoadg(String title, String reference, List products, iobyxmoadg type, Action action, String externalCode) {
        zdlpuopuiu.btonecajqb(title, "title");
        zdlpuopuiu.btonecajqb(reference, "reference");
        zdlpuopuiu.btonecajqb(products, "products");
        zdlpuopuiu.btonecajqb(type, "type");
        zdlpuopuiu.btonecajqb(action, "action");
        zdlpuopuiu.btonecajqb(externalCode, "externalCode");
        return new wkgbmnqykc(title, reference, products, type, action, externalCode);
    }

    public final String lqeggnwhkg() {
        return this.f119887iobyxmoadg;
    }

    public final iobyxmoadg nufgyqmvbu() {
        return this.f119889wkgbmnqykc;
    }

    public final Action ppxfxbqfkf() {
        return this.f119885eablkybsjg;
    }

    public String toString() {
        return "SpecialProductsUiModel(title=" + this.f119887iobyxmoadg + ", reference=" + this.f119890zoijcleaow + ", products=" + this.f119888ppxfxbqfkf + ", type=" + this.f119889wkgbmnqykc + ", action=" + this.f119885eablkybsjg + ", externalCode=" + this.f119886gxszxtbevo + ")";
    }

    public final String wkgbmnqykc() {
        return this.f119886gxszxtbevo;
    }
}
