package ru.myspar.proloyalty.legacy.presentation.screen.coupons;

import a61.eablkybsjg;
import a61.lqeggnwhkg;
import androidx.lifecycle.pkzmftpjix;
import gg.wwaezpbzkn;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import ru.myspar.proloyalty.core.domain.models.coupons.CouponDomain;
import ru.myspar.proloyalty.domain.feature.coupons.store.State;
import s91.nufgyqmvbu;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg extends pr0.zoijcleaow {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final ca1.iobyxmoadg f96677btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final draadjrbmk f96678draadjrbmk;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final draadjrbmk f96679gtknphoqwx;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(lqeggnwhkg store, dr0.iobyxmoadg dispatchers, pkzmftpjix savedStateHandle, ca1.iobyxmoadg categoriesMapper) {
        super(store, dispatchers, savedStateHandle);
        zdlpuopuiu.btonecajqb(store, "store");
        zdlpuopuiu.btonecajqb(dispatchers, "dispatchers");
        zdlpuopuiu.btonecajqb(savedStateHandle, "savedStateHandle");
        zdlpuopuiu.btonecajqb(categoriesMapper, "categoriesMapper");
        this.f96677btonecajqb = categoriesMapper;
        this.f96679gtknphoqwx = new draadjrbmk() { // from class: s91.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.legacy.presentation.screen.coupons.iobyxmoadg.sopmlzcsov(this.f105838zdlpuopuiu, (State) obj);
            }
        };
        this.f96678draadjrbmk = new draadjrbmk() { // from class: s91.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.legacy.presentation.screen.coupons.iobyxmoadg.ntlheqmsrt((ru.myspar.proloyalty.legacy.presentation.screen.coupons.ppxfxbqfkf) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a61.wkgbmnqykc ntlheqmsrt(ppxfxbqfkf ppxfxbqfkfVar) {
        a61.wkgbmnqykc ppxfxbqfkfVar2;
        zdlpuopuiu.btonecajqb(ppxfxbqfkfVar, "<this>");
        if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ppxfxbqfkf.iobyxmoadg.f96682iobyxmoadg)) {
            return a61.wkgbmnqykc.iobyxmoadg.f944iobyxmoadg;
        }
        if (ppxfxbqfkfVar instanceof ppxfxbqfkf.gxszxtbevo) {
            ppxfxbqfkfVar2 = new a61.wkgbmnqykc.gxszxtbevo(((ppxfxbqfkf.gxszxtbevo) ppxfxbqfkfVar).iobyxmoadg());
        } else if (ppxfxbqfkfVar instanceof ppxfxbqfkf.wkgbmnqykc) {
            ppxfxbqfkfVar2 = new a61.wkgbmnqykc.C0011wkgbmnqykc(((ppxfxbqfkf.wkgbmnqykc) ppxfxbqfkfVar).iobyxmoadg().dxjokdxxww());
        } else {
            if (!(ppxfxbqfkfVar instanceof ppxfxbqfkf.C2284ppxfxbqfkf)) {
                if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ppxfxbqfkf.zoijcleaow.f96688iobyxmoadg)) {
                    return a61.wkgbmnqykc.zoijcleaow.f950iobyxmoadg;
                }
                if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ppxfxbqfkf.eablkybsjg.f96680iobyxmoadg)) {
                    return a61.wkgbmnqykc.eablkybsjg.f942iobyxmoadg;
                }
                throw new NoWhenBranchMatchedException();
            }
            ppxfxbqfkf.C2284ppxfxbqfkf c2284ppxfxbqfkf = (ppxfxbqfkf.C2284ppxfxbqfkf) ppxfxbqfkfVar;
            ppxfxbqfkfVar2 = new a61.wkgbmnqykc.ppxfxbqfkf(c2284ppxfxbqfkf.zoijcleaow(), c2284ppxfxbqfkf.ppxfxbqfkf(), c2284ppxfxbqfkf.iobyxmoadg(), c2284ppxfxbqfkf.wkgbmnqykc());
        }
        return ppxfxbqfkfVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final nufgyqmvbu sopmlzcsov(iobyxmoadg iobyxmoadgVar, State state) {
        zdlpuopuiu.btonecajqb(state, "<this>");
        boolean isLoading = state.getIsLoading();
        CouponDomain coupon = state.getCoupon();
        return new nufgyqmvbu(isLoading, iobyxmoadgVar.f96677btonecajqb.invoke(state.getItems()), coupon != null ? iobyxmoadgVar.f96677btonecajqb.iobyxmoadg(coupon) : null);
    }

    @Override // pr0.zoijcleaow
    protected draadjrbmk esjtqupxsv() {
        return this.f96679gtknphoqwx;
    }

    @Override // pr0.zoijcleaow
    protected draadjrbmk iwizpuwonk() {
        return this.f96678draadjrbmk;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // pr0.zoijcleaow
    /* JADX INFO: renamed from: ulzqkzuiru, reason: merged with bridge method [inline-methods] */
    public Object lereixgezr(eablkybsjg eablkybsjgVar, gxszxtbevo gxszxtbevoVar) {
        if (eablkybsjgVar instanceof eablkybsjg.ppxfxbqfkf) {
            Object objCllcsxoeiz = cllcsxoeiz(new wkgbmnqykc.iobyxmoadg(((eablkybsjg.ppxfxbqfkf) eablkybsjgVar).iobyxmoadg()), gxszxtbevoVar);
            return objCllcsxoeiz == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (zdlpuopuiu.eablkybsjg(eablkybsjgVar, eablkybsjg.iobyxmoadg.f918iobyxmoadg)) {
            i21.iobyxmoadg.f41720iobyxmoadg.gtknphoqwx();
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        if (eablkybsjgVar instanceof eablkybsjg.zoijcleaow) {
            Object objCllcsxoeiz2 = cllcsxoeiz(new wkgbmnqykc.zoijcleaow(((eablkybsjg.zoijcleaow) eablkybsjgVar).iobyxmoadg()), gxszxtbevoVar);
            return objCllcsxoeiz2 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz2 : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (!zdlpuopuiu.eablkybsjg(eablkybsjgVar, eablkybsjg.wkgbmnqykc.f920iobyxmoadg)) {
            throw new NoWhenBranchMatchedException();
        }
        Object objCllcsxoeiz3 = cllcsxoeiz(wkgbmnqykc.ppxfxbqfkf.f96690iobyxmoadg, gxszxtbevoVar);
        return objCllcsxoeiz3 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz3 : wwaezpbzkn.f37140iobyxmoadg;
    }
}
