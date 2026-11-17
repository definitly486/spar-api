package u71;

import androidx.fragment.app.FragmentManager;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.models.delivery.DeliveryCode;
import ru.myspar.proloyalty.evropolis.api.model.EvropolisGift;
import ru.myspar.proloyalty.evropolis.api.model.EvropolisGiftArgs;
import ru.myspar.proloyalty.evropolis.impl.gift.presentation.EvropolisDialogFragment;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg implements r71.iobyxmoadg {
    @Override // r71.iobyxmoadg
    public df.zoijcleaow iobyxmoadg(draadjrbmk onAnimationClicked, draadjrbmk onScratchFinished, draadjrbmk onButtonClicked) {
        zdlpuopuiu.btonecajqb(onAnimationClicked, "onAnimationClicked");
        zdlpuopuiu.btonecajqb(onScratchFinished, "onScratchFinished");
        zdlpuopuiu.btonecajqb(onButtonClicked, "onButtonClicked");
        return h81.gxszxtbevo.gxszxtbevo(onAnimationClicked, onScratchFinished, onButtonClicked);
    }

    @Override // r71.iobyxmoadg
    public void ppxfxbqfkf(EvropolisGift gift, DeliveryCode deliveryCode, FragmentManager fragmentManager) {
        zdlpuopuiu.btonecajqb(gift, "gift");
        zdlpuopuiu.btonecajqb(fragmentManager, "fragmentManager");
        zoijcleaow(gift, deliveryCode).ntlheqmsrt(fragmentManager);
    }

    @Override // r71.iobyxmoadg
    /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
    public EvropolisDialogFragment zoijcleaow(EvropolisGift gift, DeliveryCode deliveryCode) {
        zdlpuopuiu.btonecajqb(gift, "gift");
        return EvropolisDialogFragment.INSTANCE.iobyxmoadg(new EvropolisGiftArgs(gift, deliveryCode));
    }
}
