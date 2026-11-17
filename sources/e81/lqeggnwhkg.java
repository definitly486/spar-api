package e81;

import hg.jyumaefscl;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.models.delivery.DeliveryCode;
import ru.myspar.proloyalty.evropolis.api.model.EvropolisGift;
import ru.myspar.proloyalty.evropolis.api.model.EvropolisGiftArgs;
import ru.myspar.proloyalty.evropolis.impl.gift.domain.mvi.State;

/* JADX INFO: loaded from: classes5.dex */
public final class lqeggnwhkg extends or0.zoijcleaow {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final a8.lqeggnwhkg f30950ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final iobyxmoadg f30951wkgbmnqykc;

    public lqeggnwhkg(a8.lqeggnwhkg storeFactory, iobyxmoadg executor) {
        zdlpuopuiu.btonecajqb(storeFactory, "storeFactory");
        zdlpuopuiu.btonecajqb(executor, "executor");
        this.f30950ppxfxbqfkf = storeFactory;
        this.f30951wkgbmnqykc = executor;
    }

    @Override // or0.zoijcleaow
    /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
    public a8.eablkybsjg ppxfxbqfkf(State state) {
        zdlpuopuiu.btonecajqb(state, "state");
        return zoijcleaow(this.f30950ppxfxbqfkf, state, new a8.wkgbmnqykc(ppxfxbqfkf.iobyxmoadg.f30952iobyxmoadg), this.f30951wkgbmnqykc, new zoijcleaow());
    }

    @Override // or0.zoijcleaow
    /* JADX INFO: renamed from: wflxmlrfwp, reason: merged with bridge method [inline-methods] */
    public State btonecajqb() {
        EvropolisGift.Tab tab;
        EvropolisGift gift = ((EvropolisGiftArgs) gxszxtbevo()).getGift();
        DeliveryCode deliveryCode = ((EvropolisGiftArgs) gxszxtbevo()).getDeliveryCode();
        List tabs = ((EvropolisGiftArgs) gxszxtbevo()).getGift().getTabs();
        return new State(gift, deliveryCode, (tabs == null || (tab = (EvropolisGift.Tab) jyumaefscl.weqkydbzbr(tabs)) == null) ? null : tab.getType(), false, 8, null);
    }
}
