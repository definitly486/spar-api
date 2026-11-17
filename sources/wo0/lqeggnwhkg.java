package wo0;

import ru.myspar.proloyalty.common.view.product.model.cart.CartProductUiModel;

/* JADX INFO: loaded from: classes5.dex */
public interface lqeggnwhkg {
    CartProductUiModel iobyxmoadg();

    boolean isFirst();

    boolean isLast();

    default boolean zoijcleaow() {
        return isFirst() || isLast();
    }
}
