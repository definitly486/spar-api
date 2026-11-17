package lz0;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.domain.models.cart.CartProduct;
import uz0.eablkybsjg;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zoijcleaow {
    public static final iobyxmoadg iobyxmoadg(CartProduct cartProduct) {
        zdlpuopuiu.btonecajqb(cartProduct, "<this>");
        return new iobyxmoadg(cartProduct.getId(), cartProduct.getArticle(), cartProduct.getQuantity(), cartProduct.getMeasureTypeModel().getCurrentMeasure(), cartProduct.getLimits());
    }

    public static final iobyxmoadg zoijcleaow(eablkybsjg eablkybsjgVar) {
        zdlpuopuiu.btonecajqb(eablkybsjgVar, "<this>");
        return new iobyxmoadg(eablkybsjgVar.nufgyqmvbu(), eablkybsjgVar.ppxfxbqfkf(), eablkybsjgVar.rgvfuqvkyq(), eablkybsjgVar.btonecajqb().getCurrentMeasure(), eablkybsjgVar.dxjokdxxww());
    }
}
