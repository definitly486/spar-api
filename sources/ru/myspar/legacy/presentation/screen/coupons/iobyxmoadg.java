package ru.myspar.legacy.presentation.screen.coupons;

import androidx.lifecycle.pkzmftpjix;
import gg.wwaezpbzkn;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import l70.eablkybsjg;
import l70.lqeggnwhkg;
import lg.gxszxtbevo;
import ru.myspar.core.domain.models.coupons.CouponDomain;
import ru.myspar.domain.feature.coupons.store.State;
import tb0.nufgyqmvbu;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg extends ws.zoijcleaow {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final dc0.iobyxmoadg f88893btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final draadjrbmk f88894draadjrbmk;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final draadjrbmk f88895gtknphoqwx;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(lqeggnwhkg store, ns.iobyxmoadg dispatchers, pkzmftpjix savedStateHandle, dc0.iobyxmoadg categoriesMapper) {
        super(store, dispatchers, savedStateHandle);
        zdlpuopuiu.btonecajqb(store, "store");
        zdlpuopuiu.btonecajqb(dispatchers, "dispatchers");
        zdlpuopuiu.btonecajqb(savedStateHandle, "savedStateHandle");
        zdlpuopuiu.btonecajqb(categoriesMapper, "categoriesMapper");
        this.f88893btonecajqb = categoriesMapper;
        this.f88895gtknphoqwx = new draadjrbmk() { // from class: tb0.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.legacy.presentation.screen.coupons.iobyxmoadg.sopmlzcsov(this.f110194zdlpuopuiu, (State) obj);
            }
        };
        this.f88894draadjrbmk = new draadjrbmk() { // from class: tb0.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.legacy.presentation.screen.coupons.iobyxmoadg.ntlheqmsrt((ru.myspar.legacy.presentation.screen.coupons.ppxfxbqfkf) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final l70.wkgbmnqykc ntlheqmsrt(ppxfxbqfkf ppxfxbqfkfVar) {
        l70.wkgbmnqykc ppxfxbqfkfVar2;
        zdlpuopuiu.btonecajqb(ppxfxbqfkfVar, "<this>");
        if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ppxfxbqfkf.iobyxmoadg.f88898iobyxmoadg)) {
            return l70.wkgbmnqykc.iobyxmoadg.f61801iobyxmoadg;
        }
        if (ppxfxbqfkfVar instanceof ppxfxbqfkf.gxszxtbevo) {
            ppxfxbqfkfVar2 = new l70.wkgbmnqykc.gxszxtbevo(((ppxfxbqfkf.gxszxtbevo) ppxfxbqfkfVar).iobyxmoadg());
        } else if (ppxfxbqfkfVar instanceof ppxfxbqfkf.wkgbmnqykc) {
            ppxfxbqfkfVar2 = new l70.wkgbmnqykc.C1252wkgbmnqykc(((ppxfxbqfkf.wkgbmnqykc) ppxfxbqfkfVar).iobyxmoadg().dxjokdxxww());
        } else {
            if (!(ppxfxbqfkfVar instanceof ppxfxbqfkf.C2039ppxfxbqfkf)) {
                if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ppxfxbqfkf.zoijcleaow.f88904iobyxmoadg)) {
                    return l70.wkgbmnqykc.zoijcleaow.f61807iobyxmoadg;
                }
                if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ppxfxbqfkf.eablkybsjg.f88896iobyxmoadg)) {
                    return l70.wkgbmnqykc.eablkybsjg.f61799iobyxmoadg;
                }
                throw new NoWhenBranchMatchedException();
            }
            ppxfxbqfkf.C2039ppxfxbqfkf c2039ppxfxbqfkf = (ppxfxbqfkf.C2039ppxfxbqfkf) ppxfxbqfkfVar;
            ppxfxbqfkfVar2 = new l70.wkgbmnqykc.ppxfxbqfkf(c2039ppxfxbqfkf.zoijcleaow(), c2039ppxfxbqfkf.ppxfxbqfkf(), c2039ppxfxbqfkf.iobyxmoadg(), c2039ppxfxbqfkf.wkgbmnqykc());
        }
        return ppxfxbqfkfVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final nufgyqmvbu sopmlzcsov(iobyxmoadg iobyxmoadgVar, State state) {
        zdlpuopuiu.btonecajqb(state, "<this>");
        boolean isLoading = state.getIsLoading();
        CouponDomain coupon = state.getCoupon();
        return new nufgyqmvbu(isLoading, iobyxmoadgVar.f88893btonecajqb.invoke(state.getItems()), coupon != null ? iobyxmoadgVar.f88893btonecajqb.iobyxmoadg(coupon) : null);
    }

    @Override // ws.zoijcleaow
    protected draadjrbmk esjtqupxsv() {
        return this.f88895gtknphoqwx;
    }

    @Override // ws.zoijcleaow
    protected draadjrbmk iwizpuwonk() {
        return this.f88894draadjrbmk;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ws.zoijcleaow
    /* JADX INFO: renamed from: ulzqkzuiru, reason: merged with bridge method [inline-methods] */
    public Object lereixgezr(eablkybsjg eablkybsjgVar, gxszxtbevo gxszxtbevoVar) {
        if (eablkybsjgVar instanceof eablkybsjg.ppxfxbqfkf) {
            Object objCllcsxoeiz = cllcsxoeiz(new wkgbmnqykc.iobyxmoadg(((eablkybsjg.ppxfxbqfkf) eablkybsjgVar).iobyxmoadg()), gxszxtbevoVar);
            return objCllcsxoeiz == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (zdlpuopuiu.eablkybsjg(eablkybsjgVar, eablkybsjg.iobyxmoadg.f61773iobyxmoadg)) {
            d40.iobyxmoadg.f26931iobyxmoadg.gtknphoqwx();
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        if (eablkybsjgVar instanceof eablkybsjg.zoijcleaow) {
            Object objCllcsxoeiz2 = cllcsxoeiz(new wkgbmnqykc.zoijcleaow(((eablkybsjg.zoijcleaow) eablkybsjgVar).iobyxmoadg()), gxszxtbevoVar);
            return objCllcsxoeiz2 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz2 : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (!zdlpuopuiu.eablkybsjg(eablkybsjgVar, eablkybsjg.wkgbmnqykc.f61775iobyxmoadg)) {
            throw new NoWhenBranchMatchedException();
        }
        Object objCllcsxoeiz3 = cllcsxoeiz(wkgbmnqykc.ppxfxbqfkf.f88906iobyxmoadg, gxszxtbevoVar);
        return objCllcsxoeiz3 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz3 : wwaezpbzkn.f37140iobyxmoadg;
    }
}
