package zk0;

import kotlin.jvm.internal.zdlpuopuiu;
import p0.tzroggbefp;
import ru.myspar.proloyalty.activation_card.impl.domain.store.State;
import ru.myspar.proloyalty.card.domain.model.UserCardData;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes5.dex */
public final class lqeggnwhkg implements draadjrbmk {
    @Override // tg.draadjrbmk
    /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
    public nufgyqmvbu invoke(State state) {
        zdlpuopuiu.btonecajqb(state, "state");
        boolean isNeedActivateCard = state.getIsNeedActivateCard();
        UserCardData userCardData = state.getUserCardData();
        String phoneNumber = userCardData != null ? userCardData.getPhoneNumber() : null;
        tzroggbefp cardNumber = state.getCardNumber();
        UserCardData userCardData2 = state.getUserCardData();
        return new nufgyqmvbu(isNeedActivateCard, phoneNumber, cardNumber, userCardData2 != null ? userCardData2.getConditions() : null, state.getCardNumber().draadjrbmk().length() == 16 && !state.getIsLoading(), state.getIsShowConfirmDialog(), state.getIsLoading());
    }
}
