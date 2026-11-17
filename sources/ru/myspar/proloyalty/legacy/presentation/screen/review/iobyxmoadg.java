package ru.myspar.proloyalty.legacy.presentation.screen.review;

import androidx.lifecycle.pkzmftpjix;
import cb1.btonecajqb;
import gg.wwaezpbzkn;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.domain.feature.review.store.State;
import ru.myspar.proloyalty.rate.rate_order.api.models.RateOrderPayload;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg extends pr0.zoijcleaow {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final ul1.iobyxmoadg f97252btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final draadjrbmk f97253draadjrbmk;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final draadjrbmk f97254gtknphoqwx;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(ru.myspar.proloyalty.domain.feature.review.store.gxszxtbevo store, dr0.iobyxmoadg dispatchersProvider, pkzmftpjix savedStateHandle, ul1.iobyxmoadg rateOrderFeatureApi) {
        super(store, dispatchersProvider, savedStateHandle);
        zdlpuopuiu.btonecajqb(store, "store");
        zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        zdlpuopuiu.btonecajqb(savedStateHandle, "savedStateHandle");
        zdlpuopuiu.btonecajqb(rateOrderFeatureApi, "rateOrderFeatureApi");
        this.f97252btonecajqb = rateOrderFeatureApi;
        this.f97254gtknphoqwx = new draadjrbmk() { // from class: cb1.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.legacy.presentation.screen.review.iobyxmoadg.sopmlzcsov((State) obj);
            }
        };
        this.f97253draadjrbmk = new draadjrbmk() { // from class: cb1.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.legacy.presentation.screen.review.iobyxmoadg.ntlheqmsrt((ru.myspar.proloyalty.legacy.presentation.screen.review.zoijcleaow) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ru.myspar.proloyalty.domain.feature.review.store.ppxfxbqfkf ntlheqmsrt(zoijcleaow zoijcleaowVar) {
        zdlpuopuiu.btonecajqb(zoijcleaowVar, "<this>");
        if (zoijcleaowVar instanceof zoijcleaow.eablkybsjg) {
            return new ru.myspar.proloyalty.domain.feature.review.store.ppxfxbqfkf.eablkybsjg(((zoijcleaow.eablkybsjg) zoijcleaowVar).iobyxmoadg());
        }
        if (zdlpuopuiu.eablkybsjg(zoijcleaowVar, zoijcleaow.C2295zoijcleaow.f97270iobyxmoadg)) {
            return ru.myspar.proloyalty.domain.feature.review.store.ppxfxbqfkf.zoijcleaow.f95641iobyxmoadg;
        }
        if (zdlpuopuiu.eablkybsjg(zoijcleaowVar, zoijcleaow.iobyxmoadg.f97267iobyxmoadg)) {
            return ru.myspar.proloyalty.domain.feature.review.store.ppxfxbqfkf.iobyxmoadg.f95638iobyxmoadg;
        }
        if (zdlpuopuiu.eablkybsjg(zoijcleaowVar, zoijcleaow.ppxfxbqfkf.f97268iobyxmoadg)) {
            return ru.myspar.proloyalty.domain.feature.review.store.ppxfxbqfkf.C2240ppxfxbqfkf.f95639iobyxmoadg;
        }
        if (zdlpuopuiu.eablkybsjg(zoijcleaowVar, zoijcleaow.wkgbmnqykc.f97269iobyxmoadg)) {
            return ru.myspar.proloyalty.domain.feature.review.store.ppxfxbqfkf.wkgbmnqykc.f95640iobyxmoadg;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final btonecajqb sopmlzcsov(State state) {
        zdlpuopuiu.btonecajqb(state, "<this>");
        return new btonecajqb(state.getIsSubmit());
    }

    @Override // pr0.zoijcleaow
    protected draadjrbmk esjtqupxsv() {
        return this.f97254gtknphoqwx;
    }

    @Override // pr0.zoijcleaow
    protected draadjrbmk iwizpuwonk() {
        return this.f97253draadjrbmk;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // pr0.zoijcleaow
    /* JADX INFO: renamed from: ulzqkzuiru, reason: merged with bridge method [inline-methods] */
    public Object lereixgezr(ru.myspar.proloyalty.domain.feature.review.store.wkgbmnqykc wkgbmnqykcVar, lg.gxszxtbevo gxszxtbevoVar) {
        if (wkgbmnqykcVar instanceof ru.myspar.proloyalty.domain.feature.review.store.wkgbmnqykc.zoijcleaow) {
            Object objCllcsxoeiz = cllcsxoeiz(new ppxfxbqfkf.iobyxmoadg(((ru.myspar.proloyalty.domain.feature.review.store.wkgbmnqykc.zoijcleaow) wkgbmnqykcVar).iobyxmoadg()), gxszxtbevoVar);
            return objCllcsxoeiz == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, ru.myspar.proloyalty.domain.feature.review.store.wkgbmnqykc.iobyxmoadg.f95642iobyxmoadg)) {
            i21.iobyxmoadg.f41720iobyxmoadg.gtknphoqwx();
        } else {
            if (!zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, ru.myspar.proloyalty.domain.feature.review.store.wkgbmnqykc.C2241wkgbmnqykc.f95644iobyxmoadg)) {
                if (!zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, ru.myspar.proloyalty.domain.feature.review.store.wkgbmnqykc.ppxfxbqfkf.f95643iobyxmoadg)) {
                    throw new NoWhenBranchMatchedException();
                }
                Object objCllcsxoeiz2 = cllcsxoeiz(ppxfxbqfkf.zoijcleaow.f97265iobyxmoadg, gxszxtbevoVar);
                return objCllcsxoeiz2 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz2 : wwaezpbzkn.f37140iobyxmoadg;
            }
            i21.iobyxmoadg.f41720iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(this.f97252btonecajqb.iobyxmoadg(new RateOrderPayload(null, RateOrderPayload.ppxfxbqfkf.ACTUAL, null, null, 13, null)));
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
