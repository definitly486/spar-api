package bf1;

import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.common.view.product.model.product.ProductUiModel;
import ru.myspar.proloyalty.components.special_products.api.models.Action;
import ru.myspar.proloyalty.core.domain.models.cart.ProductUIData;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes5.dex */
public final class zoijcleaow {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final Action f16066eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final String f16067gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f16068iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final List f16069ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final iobyxmoadg f16070wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f16071zoijcleaow;

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
        private static final /* synthetic */ ng.iobyxmoadg f16080yadqdtsiqt = ng.zoijcleaow.iobyxmoadg(iobyxmoadg());
    }

    public zoijcleaow(String title, String reference, List products, iobyxmoadg type, Action action, String externalCode) {
        zdlpuopuiu.btonecajqb(title, "title");
        zdlpuopuiu.btonecajqb(reference, "reference");
        zdlpuopuiu.btonecajqb(products, "products");
        zdlpuopuiu.btonecajqb(type, "type");
        zdlpuopuiu.btonecajqb(action, "action");
        zdlpuopuiu.btonecajqb(externalCode, "externalCode");
        this.f16068iobyxmoadg = title;
        this.f16071zoijcleaow = reference;
        this.f16069ppxfxbqfkf = products;
        this.f16070wkgbmnqykc = type;
        this.f16066eablkybsjg = action;
        this.f16067gxszxtbevo = externalCode;
    }

    public static /* synthetic */ zoijcleaow zoijcleaow(zoijcleaow zoijcleaowVar, String str, String str2, List list, iobyxmoadg iobyxmoadgVar, Action action, String str3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = zoijcleaowVar.f16068iobyxmoadg;
        }
        if ((i13 & 2) != 0) {
            str2 = zoijcleaowVar.f16071zoijcleaow;
        }
        String str4 = str2;
        if ((i13 & 4) != 0) {
            list = zoijcleaowVar.f16069ppxfxbqfkf;
        }
        List list2 = list;
        if ((i13 & 8) != 0) {
            iobyxmoadgVar = zoijcleaowVar.f16070wkgbmnqykc;
        }
        iobyxmoadg iobyxmoadgVar2 = iobyxmoadgVar;
        if ((i13 & 16) != 0) {
            action = zoijcleaowVar.f16066eablkybsjg;
        }
        Action action2 = action;
        if ((i13 & 32) != 0) {
            str3 = zoijcleaowVar.f16067gxszxtbevo;
        }
        return zoijcleaowVar.iobyxmoadg(str, str4, list2, iobyxmoadgVar2, action2, str3);
    }

    public final zoijcleaow dxjokdxxww(List list, rgvfuqvkyq mapper) {
        zdlpuopuiu.btonecajqb(mapper, "mapper");
        List<ProductUiModel> list2 = this.f16069ppxfxbqfkf;
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
        return this.f16069ppxfxbqfkf;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zoijcleaow)) {
            return false;
        }
        zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
        return zdlpuopuiu.eablkybsjg(this.f16068iobyxmoadg, zoijcleaowVar.f16068iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f16071zoijcleaow, zoijcleaowVar.f16071zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f16069ppxfxbqfkf, zoijcleaowVar.f16069ppxfxbqfkf) && this.f16070wkgbmnqykc == zoijcleaowVar.f16070wkgbmnqykc && this.f16066eablkybsjg == zoijcleaowVar.f16066eablkybsjg && zdlpuopuiu.eablkybsjg(this.f16067gxszxtbevo, zoijcleaowVar.f16067gxszxtbevo);
    }

    public final String gxszxtbevo() {
        return this.f16071zoijcleaow;
    }

    public int hashCode() {
        return (((((((((this.f16068iobyxmoadg.hashCode() * 31) + this.f16071zoijcleaow.hashCode()) * 31) + this.f16069ppxfxbqfkf.hashCode()) * 31) + this.f16070wkgbmnqykc.hashCode()) * 31) + this.f16066eablkybsjg.hashCode()) * 31) + this.f16067gxszxtbevo.hashCode();
    }

    public final zoijcleaow iobyxmoadg(String title, String reference, List products, iobyxmoadg type, Action action, String externalCode) {
        zdlpuopuiu.btonecajqb(title, "title");
        zdlpuopuiu.btonecajqb(reference, "reference");
        zdlpuopuiu.btonecajqb(products, "products");
        zdlpuopuiu.btonecajqb(type, "type");
        zdlpuopuiu.btonecajqb(action, "action");
        zdlpuopuiu.btonecajqb(externalCode, "externalCode");
        return new zoijcleaow(title, reference, products, type, action, externalCode);
    }

    public final String lqeggnwhkg() {
        return this.f16068iobyxmoadg;
    }

    public final iobyxmoadg nufgyqmvbu() {
        return this.f16070wkgbmnqykc;
    }

    public final Action ppxfxbqfkf() {
        return this.f16066eablkybsjg;
    }

    public String toString() {
        return "SpecialProductsUiModel(title=" + this.f16068iobyxmoadg + ", reference=" + this.f16071zoijcleaow + ", products=" + this.f16069ppxfxbqfkf + ", type=" + this.f16070wkgbmnqykc + ", action=" + this.f16066eablkybsjg + ", externalCode=" + this.f16067gxszxtbevo + ")";
    }

    public final String wkgbmnqykc() {
        return this.f16067gxszxtbevo;
    }
}
