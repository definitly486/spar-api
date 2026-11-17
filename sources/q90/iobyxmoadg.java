package q90;

import androidx.fragment.app.FragmentManager;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.models.delivery.DeliveryCode;
import ru.myspar.evropolis.api.model.EvropolisGift;
import ru.myspar.evropolis.api.model.EvropolisGiftArgs;
import ru.myspar.evropolis.impl.gift.presentation.EvropolisDialogFragment;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg implements n90.iobyxmoadg {
    @Override // n90.iobyxmoadg
    public df.zoijcleaow iobyxmoadg(draadjrbmk onAnimationClicked, draadjrbmk onScratchFinished, draadjrbmk onButtonClicked) {
        zdlpuopuiu.btonecajqb(onAnimationClicked, "onAnimationClicked");
        zdlpuopuiu.btonecajqb(onScratchFinished, "onScratchFinished");
        zdlpuopuiu.btonecajqb(onButtonClicked, "onButtonClicked");
        return da0.gxszxtbevo.gxszxtbevo(onAnimationClicked, onScratchFinished, onButtonClicked);
    }

    @Override // n90.iobyxmoadg
    /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
    public EvropolisDialogFragment ppxfxbqfkf(EvropolisGift gift, DeliveryCode deliveryCode) {
        zdlpuopuiu.btonecajqb(gift, "gift");
        return EvropolisDialogFragment.INSTANCE.iobyxmoadg(new EvropolisGiftArgs(gift, deliveryCode));
    }

    @Override // n90.iobyxmoadg
    public void zoijcleaow(EvropolisGift gift, DeliveryCode deliveryCode, FragmentManager fragmentManager) {
        zdlpuopuiu.btonecajqb(gift, "gift");
        zdlpuopuiu.btonecajqb(fragmentManager, "fragmentManager");
        ppxfxbqfkf(gift, deliveryCode).ntlheqmsrt(fragmentManager);
    }
}
