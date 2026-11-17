package ru.myspar.proloyalty.dynamic_qr.impl.presentation;

import androidx.lifecycle.pkzmftpjix;
import b71.gxszxtbevo;
import gg.wwaezpbzkn;
import k21.ojitshcjhn;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.analytics.api.model.AnalyticsPage;
import ru.myspar.proloyalty.card.domain.model.UserBalance;
import ru.myspar.proloyalty.core.navigation.model.AnalyticsPayload;
import ru.myspar.proloyalty.core.navigation.model.NavigationPayload;
import ru.myspar.proloyalty.dynamic_qr.impl.domain.store.DynamicQrCodeStore$QrType;
import ru.myspar.proloyalty.dynamic_qr.impl.domain.store.State;
import ru.myspar.proloyalty.dynamic_qr.impl.domain.store.eablkybsjg;
import ru.myspar.proloyalty.dynamic_qr.impl.domain.store.lqeggnwhkg;
import ru.myspar.proloyalty.qr.domain.model.QrModel;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg extends pr0.zoijcleaow {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final q41.iobyxmoadg f96001btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final draadjrbmk f96002draadjrbmk;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final draadjrbmk f96003gtknphoqwx;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(lqeggnwhkg store, dr0.iobyxmoadg dispatchersProvider, pkzmftpjix savedStateHandle, q41.iobyxmoadg resourcesManager) {
        super(store, dispatchersProvider, savedStateHandle);
        zdlpuopuiu.btonecajqb(store, "store");
        zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        zdlpuopuiu.btonecajqb(savedStateHandle, "savedStateHandle");
        zdlpuopuiu.btonecajqb(resourcesManager, "resourcesManager");
        this.f96001btonecajqb = resourcesManager;
        this.f96003gtknphoqwx = new draadjrbmk() { // from class: b71.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.dynamic_qr.impl.presentation.iobyxmoadg.sopmlzcsov(this.f15440zdlpuopuiu, (State) obj);
            }
        };
        this.f96002draadjrbmk = new draadjrbmk() { // from class: b71.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.dynamic_qr.impl.presentation.iobyxmoadg.ntlheqmsrt((ru.myspar.proloyalty.dynamic_qr.impl.presentation.ppxfxbqfkf) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ru.myspar.proloyalty.dynamic_qr.impl.domain.store.wkgbmnqykc ntlheqmsrt(ppxfxbqfkf ppxfxbqfkfVar) {
        zdlpuopuiu.btonecajqb(ppxfxbqfkfVar, "<this>");
        if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ppxfxbqfkf.zoijcleaow.f96007iobyxmoadg)) {
            return ru.myspar.proloyalty.dynamic_qr.impl.domain.store.wkgbmnqykc.ppxfxbqfkf.f95983iobyxmoadg;
        }
        if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ppxfxbqfkf.iobyxmoadg.f96004iobyxmoadg)) {
            return ru.myspar.proloyalty.dynamic_qr.impl.domain.store.wkgbmnqykc.C2260wkgbmnqykc.f95984iobyxmoadg;
        }
        if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ppxfxbqfkf.wkgbmnqykc.f96006iobyxmoadg)) {
            return ru.myspar.proloyalty.dynamic_qr.impl.domain.store.wkgbmnqykc.zoijcleaow.f95985iobyxmoadg;
        }
        if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ppxfxbqfkf.C2261ppxfxbqfkf.f96005iobyxmoadg)) {
            return ru.myspar.proloyalty.dynamic_qr.impl.domain.store.wkgbmnqykc.iobyxmoadg.f95982iobyxmoadg;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gxszxtbevo sopmlzcsov(iobyxmoadg iobyxmoadgVar, State state) {
        zoijcleaow c2262iobyxmoadg;
        zdlpuopuiu.btonecajqb(state, "<this>");
        DynamicQrCodeStore$QrType qrType = state.getQrType();
        if (qrType instanceof DynamicQrCodeStore$QrType.Card) {
            String qrcode = ((DynamicQrCodeStore$QrType.Card) qrType).getQrcode();
            boolean isLoading = state.getIsLoading();
            String string = iobyxmoadgVar.f96001btonecajqb.getString(z61.ppxfxbqfkf.proloyalty_error_info_for_static_qr);
            String string2 = iobyxmoadgVar.f96001btonecajqb.getString(z61.ppxfxbqfkf.proloyalty_error_default_message);
            UserBalance userBalance = state.getUserBalance();
            c2262iobyxmoadg = new zoijcleaow.iobyxmoadg.C2263zoijcleaow(qrcode, string, isLoading, string2, userBalance != null ? userBalance.getBreakdown() : null);
        } else if (qrType instanceof DynamicQrCodeStore$QrType.Code) {
            QrModel qrModel = ((DynamicQrCodeStore$QrType.Code) qrType).getQrModel();
            if ((qrModel instanceof QrModel.Static) || ((qrModel instanceof QrModel.Dynamic) && ((QrModel.Dynamic) qrModel).lqeggnwhkg())) {
                String value = qrModel.getValue();
                UserBalance userBalance2 = state.getUserBalance();
                String desc = userBalance2 != null ? userBalance2.getDesc() : null;
                String str = desc == null ? "" : desc;
                UserBalance userBalance3 = state.getUserBalance();
                String bonuses = userBalance3 != null ? userBalance3.getBonuses() : null;
                String str2 = bonuses == null ? "" : bonuses;
                UserBalance userBalance4 = state.getUserBalance();
                String form = userBalance4 != null ? userBalance4.getForm() : null;
                String str3 = form == null ? "" : form;
                UserBalance userBalance5 = state.getUserBalance();
                String rules = userBalance5 != null ? userBalance5.getRules() : null;
                String str4 = rules == null ? "" : rules;
                UserBalance userBalance6 = state.getUserBalance();
                c2262iobyxmoadg = new zoijcleaow.iobyxmoadg.C2262iobyxmoadg(value, str4, str2, str3, str, userBalance6 != null ? userBalance6.getBreakdown() : null);
            } else {
                String value2 = qrModel.getValue();
                boolean isLoading2 = state.getIsLoading();
                String string3 = iobyxmoadgVar.f96001btonecajqb.getString(z61.ppxfxbqfkf.proloyalty_error_info_for_static_qr);
                String string4 = iobyxmoadgVar.f96001btonecajqb.getString(z61.ppxfxbqfkf.proloyalty_error_default_message);
                UserBalance userBalance7 = state.getUserBalance();
                c2262iobyxmoadg = new zoijcleaow.iobyxmoadg.C2263zoijcleaow(value2, string3, isLoading2, string4, userBalance7 != null ? userBalance7.getBreakdown() : null);
            }
        } else {
            if (qrType != null) {
                throw new NoWhenBranchMatchedException();
            }
            c2262iobyxmoadg = zoijcleaow.C2264zoijcleaow.f96024iobyxmoadg;
        }
        return new gxszxtbevo(c2262iobyxmoadg, state.getHasActiveDiscount());
    }

    @Override // pr0.zoijcleaow
    protected draadjrbmk esjtqupxsv() {
        return this.f96003gtknphoqwx;
    }

    @Override // pr0.zoijcleaow
    protected draadjrbmk iwizpuwonk() {
        return this.f96002draadjrbmk;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // pr0.zoijcleaow
    /* JADX INFO: renamed from: ulzqkzuiru, reason: merged with bridge method [inline-methods] */
    public Object lereixgezr(eablkybsjg eablkybsjgVar, lg.gxszxtbevo gxszxtbevoVar) {
        if (eablkybsjgVar instanceof eablkybsjg.ppxfxbqfkf) {
            Object objCllcsxoeiz = cllcsxoeiz(new wkgbmnqykc.ppxfxbqfkf(((eablkybsjg.ppxfxbqfkf) eablkybsjgVar).iobyxmoadg()), gxszxtbevoVar);
            return objCllcsxoeiz == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (eablkybsjgVar instanceof eablkybsjg.wkgbmnqykc) {
            Object objCllcsxoeiz2 = cllcsxoeiz(wkgbmnqykc.zoijcleaow.f96010iobyxmoadg, gxszxtbevoVar);
            return objCllcsxoeiz2 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz2 : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (zdlpuopuiu.eablkybsjg(eablkybsjgVar, eablkybsjg.iobyxmoadg.f95917iobyxmoadg)) {
            Object objCllcsxoeiz3 = cllcsxoeiz(wkgbmnqykc.iobyxmoadg.f96008iobyxmoadg, gxszxtbevoVar);
            return objCllcsxoeiz3 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz3 : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (!zdlpuopuiu.eablkybsjg(eablkybsjgVar, eablkybsjg.zoijcleaow.f95920iobyxmoadg)) {
            throw new NoWhenBranchMatchedException();
        }
        i21.iobyxmoadg.f41720iobyxmoadg.pkzmftpjix(new NavigationPayload(ojitshcjhn.MY_COUPONS, null, null, null, false, null, new AnalyticsPayload(AnalyticsPage.QrCode.f92367iwizpuwonk, null, null, 6, null), false, 190, null));
        Object objCllcsxoeiz4 = cllcsxoeiz(wkgbmnqykc.iobyxmoadg.f96008iobyxmoadg, gxszxtbevoVar);
        return objCllcsxoeiz4 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz4 : wwaezpbzkn.f37140iobyxmoadg;
    }
}
