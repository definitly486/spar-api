package ru.myspar.legacy.presentation.screen.review;

import androidx.lifecycle.pkzmftpjix;
import fd0.btonecajqb;
import gg.wwaezpbzkn;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.domain.feature.review.store.State;
import ru.myspar.rate.rate_order.api.models.RateOrderPayload;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg extends ws.zoijcleaow {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final d02.iobyxmoadg f89573btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final draadjrbmk f89574draadjrbmk;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final draadjrbmk f89575gtknphoqwx;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(ru.myspar.domain.feature.review.store.gxszxtbevo store, ns.iobyxmoadg dispatchersProvider, pkzmftpjix savedStateHandle, d02.iobyxmoadg rateOrderFeatureApi) {
        super(store, dispatchersProvider, savedStateHandle);
        zdlpuopuiu.btonecajqb(store, "store");
        zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        zdlpuopuiu.btonecajqb(savedStateHandle, "savedStateHandle");
        zdlpuopuiu.btonecajqb(rateOrderFeatureApi, "rateOrderFeatureApi");
        this.f89573btonecajqb = rateOrderFeatureApi;
        this.f89575gtknphoqwx = new draadjrbmk() { // from class: fd0.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.legacy.presentation.screen.review.iobyxmoadg.sopmlzcsov((State) obj);
            }
        };
        this.f89574draadjrbmk = new draadjrbmk() { // from class: fd0.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.legacy.presentation.screen.review.iobyxmoadg.ntlheqmsrt((ru.myspar.legacy.presentation.screen.review.zoijcleaow) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ru.myspar.domain.feature.review.store.ppxfxbqfkf ntlheqmsrt(zoijcleaow zoijcleaowVar) {
        zdlpuopuiu.btonecajqb(zoijcleaowVar, "<this>");
        if (zoijcleaowVar instanceof zoijcleaow.eablkybsjg) {
            return new ru.myspar.domain.feature.review.store.ppxfxbqfkf.eablkybsjg(((zoijcleaow.eablkybsjg) zoijcleaowVar).iobyxmoadg());
        }
        if (zdlpuopuiu.eablkybsjg(zoijcleaowVar, zoijcleaow.C2052zoijcleaow.f89591iobyxmoadg)) {
            return ru.myspar.domain.feature.review.store.ppxfxbqfkf.zoijcleaow.f87862iobyxmoadg;
        }
        if (zdlpuopuiu.eablkybsjg(zoijcleaowVar, zoijcleaow.iobyxmoadg.f89588iobyxmoadg)) {
            return ru.myspar.domain.feature.review.store.ppxfxbqfkf.iobyxmoadg.f87859iobyxmoadg;
        }
        if (zdlpuopuiu.eablkybsjg(zoijcleaowVar, zoijcleaow.ppxfxbqfkf.f89589iobyxmoadg)) {
            return ru.myspar.domain.feature.review.store.ppxfxbqfkf.C2003ppxfxbqfkf.f87860iobyxmoadg;
        }
        if (zdlpuopuiu.eablkybsjg(zoijcleaowVar, zoijcleaow.wkgbmnqykc.f89590iobyxmoadg)) {
            return ru.myspar.domain.feature.review.store.ppxfxbqfkf.wkgbmnqykc.f87861iobyxmoadg;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final btonecajqb sopmlzcsov(State state) {
        zdlpuopuiu.btonecajqb(state, "<this>");
        return new btonecajqb(state.getIsSubmit());
    }

    @Override // ws.zoijcleaow
    protected draadjrbmk esjtqupxsv() {
        return this.f89575gtknphoqwx;
    }

    @Override // ws.zoijcleaow
    protected draadjrbmk iwizpuwonk() {
        return this.f89574draadjrbmk;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ws.zoijcleaow
    /* JADX INFO: renamed from: ulzqkzuiru, reason: merged with bridge method [inline-methods] */
    public Object lereixgezr(ru.myspar.domain.feature.review.store.wkgbmnqykc wkgbmnqykcVar, lg.gxszxtbevo gxszxtbevoVar) {
        if (wkgbmnqykcVar instanceof ru.myspar.domain.feature.review.store.wkgbmnqykc.zoijcleaow) {
            Object objCllcsxoeiz = cllcsxoeiz(new ppxfxbqfkf.iobyxmoadg(((ru.myspar.domain.feature.review.store.wkgbmnqykc.zoijcleaow) wkgbmnqykcVar).iobyxmoadg()), gxszxtbevoVar);
            return objCllcsxoeiz == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, ru.myspar.domain.feature.review.store.wkgbmnqykc.iobyxmoadg.f87863iobyxmoadg)) {
            d40.iobyxmoadg.f26931iobyxmoadg.gtknphoqwx();
        } else {
            if (!zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, ru.myspar.domain.feature.review.store.wkgbmnqykc.C2004wkgbmnqykc.f87865iobyxmoadg)) {
                if (!zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, ru.myspar.domain.feature.review.store.wkgbmnqykc.ppxfxbqfkf.f87864iobyxmoadg)) {
                    throw new NoWhenBranchMatchedException();
                }
                Object objCllcsxoeiz2 = cllcsxoeiz(ppxfxbqfkf.zoijcleaow.f89586iobyxmoadg, gxszxtbevoVar);
                return objCllcsxoeiz2 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz2 : wwaezpbzkn.f37140iobyxmoadg;
            }
            d40.iobyxmoadg.f26931iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(this.f89573btonecajqb.zoijcleaow(new RateOrderPayload(null, RateOrderPayload.ppxfxbqfkf.ACTUAL, null, null, 13, null)));
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
