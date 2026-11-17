package zd0;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.domain.models.restaurants.RestaurantSection;
import ru.myspar.legacy.presentation.screen.specificrestaurant.models.RestaurantSectionUiModel;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg implements draadjrbmk {
    @Override // tg.draadjrbmk
    /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
    public RestaurantSection invoke(RestaurantSectionUiModel uiModel) {
        zdlpuopuiu.btonecajqb(uiModel, "uiModel");
        return new RestaurantSection(uiModel.getItemId(), uiModel.getName());
    }
}
