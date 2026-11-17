package si0;

import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import qi0.lqeggnwhkg;
import ru.myspar.options.impl.options.domain.store.State;
import ru.myspar.options.impl.options.presentation.models.UserSubscriptionUiModel;
import ru.myspar.user.models.UserSubscription;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg implements draadjrbmk {
    private final List zoijcleaow(List list, List list2) {
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            UserSubscription userSubscription = (UserSubscription) it.next();
            UserSubscriptionUiModel userSubscriptionUiModel = new UserSubscriptionUiModel(userSubscription.getSubscriptionId(), userSubscription.getSubscriptionName(), userSubscription.getExpirationDate(), userSubscription.getAutoRenewal(), userSubscription.getAutoRenewalEnabled(), false, 32, null);
            if (list2.contains(userSubscription.getSubscriptionId())) {
                userSubscriptionUiModel = UserSubscriptionUiModel.lqeggnwhkg(userSubscriptionUiModel, null, null, null, false, false, true, 31, null);
            }
            arrayList.add(userSubscriptionUiModel);
        }
        return arrayList;
    }

    @Override // tg.draadjrbmk
    /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
    public lqeggnwhkg invoke(State state) {
        zdlpuopuiu.btonecajqb(state, "state");
        return new lqeggnwhkg(state.getIsEmailNotificationEnabled(), state.getIsSmsNotificationEnabled(), state.getIsPushNotificationEnabled(), state.getIsAutoBrightnessEnabled(), state.getIsShowQrEnabled(), zoijcleaow(state.getUserSubscriptions(), state.getLoadingSubscriptions()), state.getIsDarkModeOptionVisible(), state.getDarkModeState(), state.getIsLoading());
    }
}
