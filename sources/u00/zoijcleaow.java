package u00;

import e10.eablkybsjg;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.domain.models.cart.CartProduct;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zoijcleaow {
    public static final iobyxmoadg iobyxmoadg(eablkybsjg eablkybsjgVar) {
        zdlpuopuiu.btonecajqb(eablkybsjgVar, "<this>");
        return new iobyxmoadg(eablkybsjgVar.nufgyqmvbu(), eablkybsjgVar.ppxfxbqfkf(), eablkybsjgVar.rgvfuqvkyq(), eablkybsjgVar.btonecajqb().getCurrentMeasure(), eablkybsjgVar.dxjokdxxww());
    }

    public static final iobyxmoadg zoijcleaow(CartProduct cartProduct) {
        zdlpuopuiu.btonecajqb(cartProduct, "<this>");
        return new iobyxmoadg(cartProduct.getId(), cartProduct.getArticle(), cartProduct.getQuantity(), cartProduct.getMeasureTypeModel().getCurrentMeasure(), cartProduct.getLimits());
    }
}
