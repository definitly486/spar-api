package kq;

import ru.myspar.common.view.product.model.cart.CartProductUiModel;

/* JADX INFO: loaded from: classes4.dex */
public interface gxszxtbevo {
    CartProductUiModel iobyxmoadg();

    boolean isFirst();

    boolean isLast();

    default boolean zoijcleaow() {
        return isFirst() || isLast();
    }
}
