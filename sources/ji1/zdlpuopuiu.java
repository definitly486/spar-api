package ji1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.tzroggbefp;
import ru.myspar.proloyalty.card.domain.model.UserBalance;
import ru.myspar.proloyalty.profile.impl.profile_screen.domain.store.State;
import ru.myspar.proloyalty.user.domain.model.UserNews;

/* JADX INFO: loaded from: classes6.dex */
public final class zdlpuopuiu implements tg.draadjrbmk {
    private final String iobyxmoadg(UserBalance userBalance) {
        String str;
        String strWkgbmnqykc = q11.dxjokdxxww.wkgbmnqykc(userBalance.getBonuses());
        if (strWkgbmnqykc != null) {
            tzroggbefp tzroggbefpVar = tzroggbefp.f60034iobyxmoadg;
            str = String.format("%s %s", Arrays.copyOf(new Object[]{strWkgbmnqykc, userBalance.getForm()}, 2));
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(str, "format(...)");
        } else {
            str = null;
        }
        return str == null ? "" : str;
    }

    private final List zoijcleaow(State state, int i13, int i14) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(ki1.iobyxmoadg.C1185iobyxmoadg.f55716zoijcleaow);
        arrayList.add(ki1.iobyxmoadg.zoijcleaow.f55721zoijcleaow);
        arrayList.add(ki1.iobyxmoadg.ppxfxbqfkf.f55719zoijcleaow);
        arrayList.add(ki1.iobyxmoadg.wkgbmnqykc.f55720zoijcleaow);
        if (state.getIsPurchasesListEnabled()) {
            arrayList.add(ki1.iobyxmoadg.lqeggnwhkg.f55717zoijcleaow);
        }
        arrayList.add(ki1.iobyxmoadg.gxszxtbevo.f55715zoijcleaow);
        arrayList.add(ki1.iobyxmoadg.dxjokdxxww.f55713zoijcleaow);
        if (state.getIsMyDiscountEnabled()) {
            arrayList.add(new ki1.iobyxmoadg.eablkybsjg(i13));
        }
        if (state.getIsSavedCardsEnabled()) {
            arrayList.add(ki1.iobyxmoadg.btonecajqb.f55712zoijcleaow);
        }
        arrayList.add(new ki1.iobyxmoadg.nufgyqmvbu(i14));
        return arrayList;
    }

    @Override // tg.draadjrbmk
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public wkgbmnqykc invoke(State state) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(state, "state");
        boolean isLoading = state.getIsLoading();
        boolean isMyDiscountEnabled = state.getIsMyDiscountEnabled();
        boolean isSavedCardsEnabled = state.getIsSavedCardsEnabled();
        boolean isPurchasesListEnabled = state.getIsPurchasesListEnabled();
        UserBalance balance = state.getBalance();
        String strIobyxmoadg = balance != null ? iobyxmoadg(balance) : null;
        if (strIobyxmoadg == null) {
            strIobyxmoadg = "";
        }
        String str = strIobyxmoadg;
        UserNews news = state.getNews();
        int discounts = news != null ? news.getDiscounts() : 0;
        UserNews news2 = state.getNews();
        return new wkgbmnqykc(isLoading, str, isMyDiscountEnabled, isSavedCardsEnabled, isPurchasesListEnabled, zoijcleaow(state, discounts, news2 != null ? news2.getNotifications() : 0));
    }
}
