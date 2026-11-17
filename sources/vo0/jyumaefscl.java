package vo0;

import ru.myspar.proloyalty.cart.impl.utils.BonusesEditorState;
import ru.myspar.proloyalty.common.view.counter.model.Price;
import ru.myspar.proloyalty.core.domain.models.cart.Cart;
import ru.myspar.proloyalty.core.domain.models.cart.CartUnavailableOrderReason;

/* JADX INFO: loaded from: classes5.dex */
public final class jyumaefscl implements tg.vdvldrhtss {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final int f117592zdlpuopuiu = 2;

    @Override // tg.vdvldrhtss
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return iobyxmoadg((Cart) obj, (BonusesEditorState) obj2, ((Boolean) obj3).booleanValue());
    }

    public st0.wkgbmnqykc iobyxmoadg(Cart cart, BonusesEditorState bonusesEditor, boolean z13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(cart, "cart");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(bonusesEditor, "bonusesEditor");
        Price priceWkgbmnqykc = ks0.ppxfxbqfkf.wkgbmnqykc(ks0.ppxfxbqfkf.f60512iobyxmoadg, cart.getOrderSum(), this.f117592zdlpuopuiu, false, 4, null);
        CartUnavailableOrderReason unavailableOrderReason = cart.getUnavailableOrderReason();
        return new st0.wkgbmnqykc(priceWkgbmnqykc.getPrice(), priceWkgbmnqykc.getPriceFractional(), cart.getOrderSumNoDiscounts(), unavailableOrderReason.getCanCreateOrder(), unavailableOrderReason.getReasonMessage(), z13);
    }
}
