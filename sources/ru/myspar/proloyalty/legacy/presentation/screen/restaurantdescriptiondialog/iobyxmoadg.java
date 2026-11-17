package ru.myspar.proloyalty.legacy.presentation.screen.restaurantdescriptiondialog;

import androidx.lifecycle.pkzmftpjix;
import bb1.gxszxtbevo;
import gg.wwaezpbzkn;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import l61.eablkybsjg;
import l61.lqeggnwhkg;
import l61.wkgbmnqykc;
import ru.myspar.proloyalty.domain.feature.restaurantdescriptiondialog.store.State;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg extends pr0.zoijcleaow {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final q41.iobyxmoadg f97183btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final draadjrbmk f97184draadjrbmk;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final draadjrbmk f97185gtknphoqwx;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(lqeggnwhkg store, dr0.iobyxmoadg dispatchersProvider, pkzmftpjix savedStateHandle, q41.iobyxmoadg resourcesManager) {
        super(store, dispatchersProvider, savedStateHandle);
        zdlpuopuiu.btonecajqb(store, "store");
        zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        zdlpuopuiu.btonecajqb(savedStateHandle, "savedStateHandle");
        zdlpuopuiu.btonecajqb(resourcesManager, "resourcesManager");
        this.f97183btonecajqb = resourcesManager;
        this.f97185gtknphoqwx = new draadjrbmk() { // from class: bb1.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.legacy.presentation.screen.restaurantdescriptiondialog.iobyxmoadg.sopmlzcsov(this.f15676zdlpuopuiu, (State) obj);
            }
        };
        this.f97184draadjrbmk = new draadjrbmk() { // from class: bb1.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.legacy.presentation.screen.restaurantdescriptiondialog.iobyxmoadg.ntlheqmsrt((ru.myspar.proloyalty.legacy.presentation.screen.restaurantdescriptiondialog.zoijcleaow) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wkgbmnqykc ntlheqmsrt(zoijcleaow zoijcleaowVar) {
        zdlpuopuiu.btonecajqb(zoijcleaowVar, "<this>");
        if (zdlpuopuiu.eablkybsjg(zoijcleaowVar, zoijcleaow.iobyxmoadg.f97187iobyxmoadg)) {
            return wkgbmnqykc.iobyxmoadg.f61705iobyxmoadg;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gxszxtbevo sopmlzcsov(iobyxmoadg iobyxmoadgVar, State state) {
        zdlpuopuiu.btonecajqb(state, "<this>");
        return new gxszxtbevo(iobyxmoadgVar.f97183btonecajqb.getString(vk0.lqeggnwhkg.proloyalty_price_format, String.valueOf(vg.iobyxmoadg.ppxfxbqfkf(state.getDeliveryPrice()))), state.getDeliveryTime(), state.getWorkingHours(), state.getAddress(), state.getIsLoading());
    }

    @Override // pr0.zoijcleaow
    protected draadjrbmk esjtqupxsv() {
        return this.f97185gtknphoqwx;
    }

    @Override // pr0.zoijcleaow
    protected draadjrbmk iwizpuwonk() {
        return this.f97184draadjrbmk;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // pr0.zoijcleaow
    /* JADX INFO: renamed from: ulzqkzuiru, reason: merged with bridge method [inline-methods] */
    public Object lereixgezr(eablkybsjg eablkybsjgVar, lg.gxszxtbevo gxszxtbevoVar) {
        if (zdlpuopuiu.eablkybsjg(eablkybsjgVar, eablkybsjg.iobyxmoadg.f61692iobyxmoadg)) {
            i21.iobyxmoadg.f41720iobyxmoadg.gtknphoqwx();
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        if (!(eablkybsjgVar instanceof eablkybsjg.zoijcleaow)) {
            throw new NoWhenBranchMatchedException();
        }
        Object objCllcsxoeiz = cllcsxoeiz(new ppxfxbqfkf.iobyxmoadg(((eablkybsjg.zoijcleaow) eablkybsjgVar).iobyxmoadg()), gxszxtbevoVar);
        return objCllcsxoeiz == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz : wwaezpbzkn.f37140iobyxmoadg;
    }
}
