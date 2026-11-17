package sf1;

import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import qf1.lqeggnwhkg;
import ru.myspar.proloyalty.options.impl.options.domain.store.State;
import ru.myspar.proloyalty.options.impl.options.presentation.models.UserSubscriptionUiModel;
import ru.myspar.proloyalty.user.domain.model.UserSubscriptionSetting;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg implements draadjrbmk {
    private final List zoijcleaow(List list) {
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            UserSubscriptionSetting userSubscriptionSetting = (UserSubscriptionSetting) it.next();
            arrayList.add(new UserSubscriptionUiModel(userSubscriptionSetting.getId(), userSubscriptionSetting.getName(), userSubscriptionSetting.getIsActive(), true));
        }
        return arrayList;
    }

    @Override // tg.draadjrbmk
    /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
    public lqeggnwhkg invoke(State state) {
        zdlpuopuiu.btonecajqb(state, "state");
        return new lqeggnwhkg(state.getIsEmailNotificationEnabled(), state.getIsSmsNotificationEnabled(), state.getIsPushNotificationEnabled(), state.getIsAutoBrightnessEnabled(), state.getIsShowQrEnabled(), zoijcleaow(state.getUserSubscriptions()), state.getIsDarkModeOptionVisible(), state.getDarkModeState(), state.getIsLoading());
    }
}
