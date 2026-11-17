package aa0;

import hg.jyumaefscl;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.models.delivery.DeliveryCode;
import ru.myspar.evropolis.api.model.EvropolisGift;
import ru.myspar.evropolis.api.model.EvropolisGiftArgs;
import ru.myspar.evropolis.impl.gift.domain.mvi.State;

/* JADX INFO: loaded from: classes4.dex */
public final class lqeggnwhkg extends vs.zoijcleaow {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final iobyxmoadg f1238ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final a8.lqeggnwhkg f1239zoijcleaow;

    public lqeggnwhkg(a8.lqeggnwhkg storeFactory, iobyxmoadg executor) {
        zdlpuopuiu.btonecajqb(storeFactory, "storeFactory");
        zdlpuopuiu.btonecajqb(executor, "executor");
        this.f1239zoijcleaow = storeFactory;
        this.f1238ppxfxbqfkf = executor;
    }

    @Override // vs.zoijcleaow
    /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
    public State dxjokdxxww() {
        EvropolisGift.Tab tab;
        EvropolisGift gift = ((EvropolisGiftArgs) gxszxtbevo()).getGift();
        DeliveryCode deliveryCode = ((EvropolisGiftArgs) gxszxtbevo()).getDeliveryCode();
        List tabs = ((EvropolisGiftArgs) gxszxtbevo()).getGift().getTabs();
        return new State(gift, deliveryCode, (tabs == null || (tab = (EvropolisGift.Tab) jyumaefscl.weqkydbzbr(tabs)) == null) ? null : tab.getType(), false, 8, null);
    }

    @Override // vs.zoijcleaow
    /* JADX INFO: renamed from: gtknphoqwx, reason: merged with bridge method [inline-methods] */
    public a8.eablkybsjg ppxfxbqfkf(State state) {
        zdlpuopuiu.btonecajqb(state, "state");
        return zoijcleaow(this.f1239zoijcleaow, state, new a8.wkgbmnqykc(ppxfxbqfkf.iobyxmoadg.f1240iobyxmoadg), this.f1238ppxfxbqfkf, new zoijcleaow());
    }
}
