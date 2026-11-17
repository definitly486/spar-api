package f20;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.domain.models.cart.Cart;
import ru.myspar.core.models.promocode.Promocode;

/* JADX INFO: loaded from: classes4.dex */
public final class eablkybsjg {
    public final boolean iobyxmoadg(Cart cachedCart) {
        zdlpuopuiu.btonecajqb(cachedCart, "cachedCart");
        if (cachedCart.getIsMappedValid()) {
            Promocode promocode = cachedCart.getPromocode();
            String value = promocode != null ? promocode.getValue() : null;
            if (value != null && value.length() != 0) {
                return true;
            }
        }
        return false;
    }
}
