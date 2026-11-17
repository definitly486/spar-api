package tn0;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.auth.impl.domain.registration.store.State;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes5.dex */
public final class nufgyqmvbu implements draadjrbmk {
    @Override // tg.draadjrbmk
    /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
    public dxjokdxxww invoke(State state) {
        zdlpuopuiu.btonecajqb(state, "state");
        return new dxjokdxxww(state.getIsLoading(), state.getEmail(), state.getEmailError(), state.getFirstName(), state.getIsFirstNameError(), state.getLastName(), state.getIsLastNameError(), state.getBirthDate(), state.getGender(), state.getSharePromoChecked(), state.getIsPolicyAccepted(), state.getShowExitDialog(), state.getEmailError() == null && state.getEmail().draadjrbmk().length() > 0 && state.getIsFirstNameError() == null && state.getIsLastNameError() == null && state.getBirthDate() != null && state.getGender() != lr0.zoijcleaow.NONE && state.getIsPolicyAccepted());
    }
}
