package ru.myspar.proloyalty.scango.impl.screens.weightproduct.dialog.presentation;

import androidx.lifecycle.pkzmftpjix;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import gg.wwaezpbzkn;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import op1.eablkybsjg;
import op1.lqeggnwhkg;
import pp1.gxszxtbevo;
import q11.nufgyqmvbu;
import ru.myspar.proloyalty.scango.impl.screens.weightproduct.dialog.domain.store.State;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg extends pr0.zoijcleaow {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final q41.iobyxmoadg f101115btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final draadjrbmk f101116draadjrbmk;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final nufgyqmvbu f101117gtknphoqwx;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final draadjrbmk f101118wflxmlrfwp;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(lqeggnwhkg store, dr0.iobyxmoadg dispatchersProvider, pkzmftpjix savedStateHandle, q41.iobyxmoadg resourcesManager, nufgyqmvbu measureTypeUtils) {
        super(store, dispatchersProvider, savedStateHandle);
        zdlpuopuiu.btonecajqb(store, "store");
        zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        zdlpuopuiu.btonecajqb(savedStateHandle, "savedStateHandle");
        zdlpuopuiu.btonecajqb(resourcesManager, "resourcesManager");
        zdlpuopuiu.btonecajqb(measureTypeUtils, "measureTypeUtils");
        this.f101115btonecajqb = resourcesManager;
        this.f101117gtknphoqwx = measureTypeUtils;
        this.f101116draadjrbmk = new draadjrbmk() { // from class: pp1.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.scango.impl.screens.weightproduct.dialog.presentation.iobyxmoadg.sopmlzcsov(this.f77118zdlpuopuiu, (State) obj);
            }
        };
        this.f101118wflxmlrfwp = new draadjrbmk() { // from class: pp1.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.scango.impl.screens.weightproduct.dialog.presentation.iobyxmoadg.ntlheqmsrt((ru.myspar.proloyalty.scango.impl.screens.weightproduct.dialog.presentation.zoijcleaow) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final op1.wkgbmnqykc ntlheqmsrt(zoijcleaow zoijcleaowVar) {
        zdlpuopuiu.btonecajqb(zoijcleaowVar, "<this>");
        if (zdlpuopuiu.eablkybsjg(zoijcleaowVar, zoijcleaow.iobyxmoadg.f101125iobyxmoadg)) {
            return op1.wkgbmnqykc.iobyxmoadg.f73418iobyxmoadg;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gxszxtbevo sopmlzcsov(iobyxmoadg iobyxmoadgVar, State state) {
        zdlpuopuiu.btonecajqb(state, "<this>");
        return new gxszxtbevo(state.getId(), state.getArticle(), state.getName(), state.getPictureUrl(), rn1.ppxfxbqfkf.iobyxmoadg(state.getQuantity(), state.getMeasureType(), iobyxmoadgVar.f101115btonecajqb, iobyxmoadgVar.f101117gtknphoqwx), state.getQuantity(), rn1.ppxfxbqfkf.zoijcleaow(state.getPrice(), iobyxmoadgVar.f101115btonecajqb), rn1.ppxfxbqfkf.zoijcleaow(state.getPrice() * state.getQuantity(), iobyxmoadgVar.f101115btonecajqb), state.getMeasureType(), state.getMarkCodes(), null, state.getPrice(), state.getIsLoading(), UserVerificationMethods.USER_VERIFY_ALL, null);
    }

    @Override // pr0.zoijcleaow
    protected draadjrbmk esjtqupxsv() {
        return this.f101116draadjrbmk;
    }

    @Override // pr0.zoijcleaow
    protected draadjrbmk iwizpuwonk() {
        return this.f101118wflxmlrfwp;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // pr0.zoijcleaow
    /* JADX INFO: renamed from: ulzqkzuiru, reason: merged with bridge method [inline-methods] */
    public Object lereixgezr(eablkybsjg eablkybsjgVar, lg.gxszxtbevo gxszxtbevoVar) {
        if (eablkybsjgVar instanceof eablkybsjg.zoijcleaow) {
            Object objCllcsxoeiz = cllcsxoeiz(new ppxfxbqfkf.zoijcleaow(((eablkybsjg.zoijcleaow) eablkybsjgVar).iobyxmoadg()), gxszxtbevoVar);
            return objCllcsxoeiz == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (!zdlpuopuiu.eablkybsjg(eablkybsjgVar, eablkybsjg.iobyxmoadg.f73381iobyxmoadg)) {
            throw new NoWhenBranchMatchedException();
        }
        Object objCllcsxoeiz2 = cllcsxoeiz(ppxfxbqfkf.iobyxmoadg.f101119iobyxmoadg, gxszxtbevoVar);
        return objCllcsxoeiz2 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz2 : wwaezpbzkn.f37140iobyxmoadg;
    }
}
