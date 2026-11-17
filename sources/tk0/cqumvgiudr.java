package tk0;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import ru.myspar.profile.impl.profile_screen.domain.store.State;
import ru.myspar.user.models.UserState;

/* JADX INFO: loaded from: classes3.dex */
public final class cqumvgiudr implements tg.draadjrbmk {
    private final List iobyxmoadg(State state, int i13, int i14) {
        List listKcexrzcfyt = hg.jyumaefscl.kcexrzcfyt(uk0.zoijcleaow.iobyxmoadg.f113791zoijcleaow, uk0.zoijcleaow.C2820zoijcleaow.f113796zoijcleaow, uk0.zoijcleaow.ppxfxbqfkf.f113794zoijcleaow);
        if (state.getIsPurchasesListEnabled()) {
            listKcexrzcfyt.add(uk0.zoijcleaow.gxszxtbevo.f113790zoijcleaow);
        }
        listKcexrzcfyt.add(uk0.zoijcleaow.eablkybsjg.f113789zoijcleaow);
        listKcexrzcfyt.add(uk0.zoijcleaow.nufgyqmvbu.f113793zoijcleaow);
        if (state.getIsMyDiscountEnabled()) {
            listKcexrzcfyt.add(new uk0.zoijcleaow.wkgbmnqykc(i13));
        }
        if (state.getIsSavedCardsEnabled()) {
            listKcexrzcfyt.add(uk0.zoijcleaow.dxjokdxxww.f113788zoijcleaow);
        }
        listKcexrzcfyt.add(new uk0.zoijcleaow.lqeggnwhkg(i14));
        return listKcexrzcfyt;
    }

    @Override // tg.draadjrbmk
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public wkgbmnqykc invoke(State state) {
        wkgbmnqykc wkgbmnqykcVar;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(state, "state");
        UserState userState = state.getUserState();
        if (userState instanceof UserState.Authorized) {
            UserState.Authorized authorized = (UserState.Authorized) userState;
            int bonuses = (int) authorized.getUser().getUserCard().getBonuses();
            wkgbmnqykcVar = new wkgbmnqykc(false, uk0.iobyxmoadg.AUTH, false, authorized.getUser().getNotificationsNew(), authorized.getUser().getDiscountsNew(), Integer.valueOf(bonuses), false, false, false, iobyxmoadg(state, authorized.getUser().getDiscountsNew(), authorized.getUser().getNotificationsNew()), 453, null);
        } else {
            if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(userState, UserState.NotAuthorized.f104653zdlpuopuiu) && userState != null) {
                throw new NoWhenBranchMatchedException();
            }
            wkgbmnqykcVar = new wkgbmnqykc(false, userState == null ? uk0.iobyxmoadg.INIT : uk0.iobyxmoadg.NO_AUTH, false, 0, 0, null, false, false, false, hg.jyumaefscl.wflxmlrfwp(), 453, null);
        }
        wkgbmnqykc wkgbmnqykcVar2 = wkgbmnqykcVar;
        return wkgbmnqykcVar2.iobyxmoadg((574 & 1) != 0 ? wkgbmnqykcVar2.f110990iobyxmoadg : state.getIsLoading(), (574 & 2) != 0 ? wkgbmnqykcVar2.f110995zoijcleaow : null, (574 & 4) != 0 ? wkgbmnqykcVar2.f110993ppxfxbqfkf : false, (574 & 8) != 0 ? wkgbmnqykcVar2.f110994wkgbmnqykc : 0, (574 & 16) != 0 ? wkgbmnqykcVar2.f110988eablkybsjg : 0, (574 & 32) != 0 ? wkgbmnqykcVar2.f110989gxszxtbevo : null, (574 & 64) != 0 ? wkgbmnqykcVar2.f110991lqeggnwhkg : state.getIsMyDiscountEnabled(), (574 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? wkgbmnqykcVar2.f110992nufgyqmvbu : state.getIsSavedCardsEnabled(), (574 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? wkgbmnqykcVar2.f110987dxjokdxxww : state.getIsPurchasesListEnabled(), (574 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? wkgbmnqykcVar2.f110986btonecajqb : null);
    }
}
