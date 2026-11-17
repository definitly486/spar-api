package ru.myspar.proloyalty.legacy.presentation.screen.promotiononboarding;

import androidx.lifecycle.pkzmftpjix;
import gg.wwaezpbzkn;
import hg.jyumaefscl;
import i61.lqeggnwhkg;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import ru.myspar.proloyalty.core.domain.models.promo.Promotion;
import ru.myspar.proloyalty.domain.feature.promotiononboarding.store.State;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg extends pr0.zoijcleaow {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final draadjrbmk f97158btonecajqb;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final draadjrbmk f97159gtknphoqwx;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(lqeggnwhkg store, dr0.iobyxmoadg dispatchersProvider, pkzmftpjix savedStateHandle) {
        super(store, dispatchersProvider, savedStateHandle);
        zdlpuopuiu.btonecajqb(store, "store");
        zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        zdlpuopuiu.btonecajqb(savedStateHandle, "savedStateHandle");
        this.f97158btonecajqb = new draadjrbmk() { // from class: ya1.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.legacy.presentation.screen.promotiononboarding.iobyxmoadg.sopmlzcsov((State) obj);
            }
        };
        this.f97159gtknphoqwx = new draadjrbmk() { // from class: ya1.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.legacy.presentation.screen.promotiononboarding.iobyxmoadg.ntlheqmsrt((ru.myspar.proloyalty.legacy.presentation.screen.promotiononboarding.ppxfxbqfkf) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i61.wkgbmnqykc ntlheqmsrt(ppxfxbqfkf ppxfxbqfkfVar) {
        zdlpuopuiu.btonecajqb(ppxfxbqfkfVar, "<this>");
        if (ppxfxbqfkfVar instanceof ppxfxbqfkf.iobyxmoadg) {
            return new i61.wkgbmnqykc.iobyxmoadg(((ppxfxbqfkf.iobyxmoadg) ppxfxbqfkfVar).iobyxmoadg());
        }
        if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ppxfxbqfkf.zoijcleaow.f97162iobyxmoadg)) {
            return i61.wkgbmnqykc.zoijcleaow.f42036iobyxmoadg;
        }
        if (ppxfxbqfkfVar instanceof ppxfxbqfkf.C2293ppxfxbqfkf) {
            return new i61.wkgbmnqykc.ppxfxbqfkf(((ppxfxbqfkf.C2293ppxfxbqfkf) ppxfxbqfkfVar).iobyxmoadg());
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ya1.lqeggnwhkg sopmlzcsov(State state) {
        zdlpuopuiu.btonecajqb(state, "<this>");
        List<Promotion.PromotionOnboarding> items = state.getItems();
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(items, 10));
        for (Promotion.PromotionOnboarding promotionOnboarding : items) {
            arrayList.add(new ab1.iobyxmoadg(promotionOnboarding.getTitle(), promotionOnboarding.getDescription(), promotionOnboarding.getImage(), promotionOnboarding.getOrder()));
        }
        return new ya1.lqeggnwhkg(arrayList, state.getCurrentItemPosition(), state.getIsLoading());
    }

    @Override // pr0.zoijcleaow
    protected draadjrbmk esjtqupxsv() {
        return this.f97158btonecajqb;
    }

    @Override // pr0.zoijcleaow
    protected draadjrbmk iwizpuwonk() {
        return this.f97159gtknphoqwx;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // pr0.zoijcleaow
    /* JADX INFO: renamed from: ulzqkzuiru, reason: merged with bridge method [inline-methods] */
    public Object lereixgezr(i61.eablkybsjg eablkybsjgVar, gxszxtbevo gxszxtbevoVar) {
        if (eablkybsjgVar instanceof i61.eablkybsjg.ppxfxbqfkf) {
            Object objCllcsxoeiz = cllcsxoeiz(new wkgbmnqykc.iobyxmoadg(((i61.eablkybsjg.ppxfxbqfkf) eablkybsjgVar).iobyxmoadg()), gxszxtbevoVar);
            return objCllcsxoeiz == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (zdlpuopuiu.eablkybsjg(eablkybsjgVar, i61.eablkybsjg.iobyxmoadg.f42015iobyxmoadg)) {
            i21.iobyxmoadg.f41720iobyxmoadg.gtknphoqwx();
        } else {
            if (!zdlpuopuiu.eablkybsjg(eablkybsjgVar, i61.eablkybsjg.zoijcleaow.f42017iobyxmoadg)) {
                throw new NoWhenBranchMatchedException();
            }
            i21.iobyxmoadg.f41720iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(ru.myspar.proloyalty.legacy.presentation.screen.promotion.zoijcleaow.zoijcleaow());
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
