package ru.myspar.proloyalty.rate.rate_bonus_product.impl.presentation;

import androidx.lifecycle.pkzmftpjix;
import gg.wwaezpbzkn;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import pl1.gxszxtbevo;
import rl1.eablkybsjg;
import rl1.lqeggnwhkg;
import rl1.wkgbmnqykc;
import ru.myspar.proloyalty.catalog.api.model.ProductPayload;
import ru.myspar.proloyalty.rate.rate_bonus_product.impl.store.State;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg extends pr0.zoijcleaow {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final xo0.iobyxmoadg f100054btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final draadjrbmk f100055draadjrbmk;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final draadjrbmk f100056gtknphoqwx;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(lqeggnwhkg store, dr0.iobyxmoadg dispatchersProvider, pkzmftpjix savedStateHandle, xo0.iobyxmoadg catalogFeatureApi) {
        super(store, dispatchersProvider, savedStateHandle);
        zdlpuopuiu.btonecajqb(store, "store");
        zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        zdlpuopuiu.btonecajqb(savedStateHandle, "savedStateHandle");
        zdlpuopuiu.btonecajqb(catalogFeatureApi, "catalogFeatureApi");
        this.f100054btonecajqb = catalogFeatureApi;
        this.f100056gtknphoqwx = new draadjrbmk() { // from class: pl1.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.rate.rate_bonus_product.impl.presentation.iobyxmoadg.sopmlzcsov((State) obj);
            }
        };
        this.f100055draadjrbmk = new draadjrbmk() { // from class: pl1.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.rate.rate_bonus_product.impl.presentation.iobyxmoadg.ntlheqmsrt((ru.myspar.proloyalty.rate.rate_bonus_product.impl.presentation.zoijcleaow) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wkgbmnqykc ntlheqmsrt(zoijcleaow zoijcleaowVar) {
        zdlpuopuiu.btonecajqb(zoijcleaowVar, "<this>");
        if (zoijcleaowVar instanceof zoijcleaow.iobyxmoadg) {
            return new wkgbmnqykc.iobyxmoadg(((zoijcleaow.iobyxmoadg) zoijcleaowVar).iobyxmoadg());
        }
        if (zoijcleaowVar instanceof zoijcleaow.C2403zoijcleaow) {
            return new wkgbmnqykc.zoijcleaow(((zoijcleaow.C2403zoijcleaow) zoijcleaowVar).iobyxmoadg());
        }
        if (zoijcleaowVar instanceof zoijcleaow.ppxfxbqfkf) {
            return new wkgbmnqykc.ppxfxbqfkf(((zoijcleaow.ppxfxbqfkf) zoijcleaowVar).iobyxmoadg());
        }
        if (zoijcleaowVar instanceof zoijcleaow.wkgbmnqykc) {
            return wkgbmnqykc.C1866wkgbmnqykc.f83103iobyxmoadg;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gxszxtbevo sopmlzcsov(State state) {
        zdlpuopuiu.btonecajqb(state, "<this>");
        String article = state.getArticle();
        String productName = state.getProductName();
        return new gxszxtbevo(article, state.getImageUrl(), productName, state.getBonusQuantity(), state.getStarsQuantity(), state.getReview(), state.getIsSendButtonEnabled(), state.getIsLoading());
    }

    @Override // pr0.zoijcleaow
    protected draadjrbmk esjtqupxsv() {
        return this.f100056gtknphoqwx;
    }

    @Override // pr0.zoijcleaow
    protected draadjrbmk iwizpuwonk() {
        return this.f100055draadjrbmk;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // pr0.zoijcleaow
    /* JADX INFO: renamed from: ulzqkzuiru, reason: merged with bridge method [inline-methods] */
    public Object lereixgezr(eablkybsjg eablkybsjgVar, lg.gxszxtbevo gxszxtbevoVar) {
        if (eablkybsjgVar instanceof eablkybsjg.zoijcleaow) {
            i21.iobyxmoadg.f41720iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(this.f100054btonecajqb.gxszxtbevo(new ProductPayload(new ProductPayload.Type.Article(((eablkybsjg.zoijcleaow) eablkybsjgVar).iobyxmoadg()), null, 2, null)));
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        if (eablkybsjgVar instanceof eablkybsjg.ppxfxbqfkf) {
            Object objCllcsxoeiz = cllcsxoeiz(new ppxfxbqfkf.zoijcleaow(((eablkybsjg.ppxfxbqfkf) eablkybsjgVar).iobyxmoadg()), gxszxtbevoVar);
            return objCllcsxoeiz == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (!(eablkybsjgVar instanceof eablkybsjg.iobyxmoadg)) {
            throw new NoWhenBranchMatchedException();
        }
        Object objCllcsxoeiz2 = cllcsxoeiz(new ppxfxbqfkf.iobyxmoadg(((eablkybsjg.iobyxmoadg) eablkybsjgVar).iobyxmoadg()), gxszxtbevoVar);
        return objCllcsxoeiz2 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz2 : wwaezpbzkn.f37140iobyxmoadg;
    }
}
