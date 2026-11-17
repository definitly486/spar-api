package vo0;

import java.util.ArrayList;
import java.util.List;
import ru.myspar.proloyalty.common.view.bottomsheet.additional_info.AdditionalInfoUiModel;
import ru.myspar.proloyalty.core.domain.models.cart.CartProgressBarDeliveryTerms;
import ru.myspar.proloyalty.core.models.progress_bar.CartProgressBarRapid;

/* JADX INFO: loaded from: classes5.dex */
public final class eablkybsjg implements tg.draadjrbmk {
    private final AdditionalInfoUiModel.Item zoijcleaow(int i13, CartProgressBarRapid cartProgressBarRapid) {
        return new AdditionalInfoUiModel.Item(String.valueOf(i13), cartProgressBarRapid.getImageUrl(), cartProgressBarRapid.getTitle(), cartProgressBarRapid.getMessageList());
    }

    @Override // tg.draadjrbmk
    /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
    public AdditionalInfoUiModel invoke(CartProgressBarDeliveryTerms domainModel) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(domainModel, "domainModel");
        String deliveryTypeTitle = domainModel.getDeliveryTypeTitle();
        String deliveryPriceTitle = domainModel.getDeliveryPriceTitle();
        String sumForFreeDeliveryText = domainModel.getSumForFreeDeliveryText();
        List rapids = domainModel.getRapids();
        ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(rapids, 10));
        int i13 = 0;
        for (Object obj : rapids) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                hg.jyumaefscl.iwizpuwonk();
            }
            arrayList.add(zoijcleaow(i13, (CartProgressBarRapid) obj));
            i13 = i14;
        }
        return new AdditionalInfoUiModel(deliveryTypeTitle, deliveryPriceTitle, sumForFreeDeliveryText, arrayList);
    }
}
