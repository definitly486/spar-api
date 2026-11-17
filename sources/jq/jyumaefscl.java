package jq;

import ru.myspar.cart.impl.utils.BonusesEditorState;
import ru.myspar.common.view.counter.model.Price;
import ru.myspar.core.domain.models.cart.Cart;
import ru.myspar.core.domain.models.cart.CartUnavailableOrderReason;

/* JADX INFO: loaded from: classes4.dex */
public final class jyumaefscl implements tg.vdvldrhtss {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final int f52076zdlpuopuiu = 2;

    @Override // tg.vdvldrhtss
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return iobyxmoadg((Cart) obj, (BonusesEditorState) obj2, ((Boolean) obj3).booleanValue());
    }

    public yu.wkgbmnqykc iobyxmoadg(Cart cart, BonusesEditorState bonusesEditor, boolean z13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(cart, "cart");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(bonusesEditor, "bonusesEditor");
        Price priceWkgbmnqykc = rt.ppxfxbqfkf.wkgbmnqykc(rt.ppxfxbqfkf.f83717iobyxmoadg, cart.getOrderSum(), this.f52076zdlpuopuiu, false, 4, null);
        CartUnavailableOrderReason unavailableOrderReason = cart.getUnavailableOrderReason();
        return new yu.wkgbmnqykc(priceWkgbmnqykc.getPrice(), priceWkgbmnqykc.getPriceFractional(), cart.getOrderSumNoDiscounts(), unavailableOrderReason.getCanCreateOrder(), unavailableOrderReason.getReasonMessage(), z13);
    }
}
