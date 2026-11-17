package ru.myspar.scango.impl.screens.weightproduct.dialog.presentation;

import androidx.lifecycle.pkzmftpjix;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import gg.wwaezpbzkn;
import k30.nufgyqmvbu;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.scango.impl.screens.weightproduct.dialog.domain.store.State;
import s32.eablkybsjg;
import s32.lqeggnwhkg;
import t32.gxszxtbevo;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg extends ws.zoijcleaow {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final d60.iobyxmoadg f103772btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final draadjrbmk f103773draadjrbmk;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final nufgyqmvbu f103774gtknphoqwx;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final draadjrbmk f103775wflxmlrfwp;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(lqeggnwhkg store, ns.iobyxmoadg dispatchersProvider, pkzmftpjix savedStateHandle, d60.iobyxmoadg resourcesManager, nufgyqmvbu measureTypeUtils) {
        super(store, dispatchersProvider, savedStateHandle);
        zdlpuopuiu.btonecajqb(store, "store");
        zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        zdlpuopuiu.btonecajqb(savedStateHandle, "savedStateHandle");
        zdlpuopuiu.btonecajqb(resourcesManager, "resourcesManager");
        zdlpuopuiu.btonecajqb(measureTypeUtils, "measureTypeUtils");
        this.f103772btonecajqb = resourcesManager;
        this.f103774gtknphoqwx = measureTypeUtils;
        this.f103773draadjrbmk = new draadjrbmk() { // from class: t32.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.scango.impl.screens.weightproduct.dialog.presentation.iobyxmoadg.sopmlzcsov(this.f109610zdlpuopuiu, (State) obj);
            }
        };
        this.f103775wflxmlrfwp = new draadjrbmk() { // from class: t32.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.scango.impl.screens.weightproduct.dialog.presentation.iobyxmoadg.ntlheqmsrt((ru.myspar.scango.impl.screens.weightproduct.dialog.presentation.zoijcleaow) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s32.wkgbmnqykc ntlheqmsrt(zoijcleaow zoijcleaowVar) {
        zdlpuopuiu.btonecajqb(zoijcleaowVar, "<this>");
        if (zdlpuopuiu.eablkybsjg(zoijcleaowVar, zoijcleaow.iobyxmoadg.f103782iobyxmoadg)) {
            return s32.wkgbmnqykc.iobyxmoadg.f105441iobyxmoadg;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gxszxtbevo sopmlzcsov(iobyxmoadg iobyxmoadgVar, State state) {
        zdlpuopuiu.btonecajqb(state, "<this>");
        return new gxszxtbevo(state.getId(), state.getArticle(), state.getName(), state.getPictureUrl(), v12.ppxfxbqfkf.iobyxmoadg(state.getQuantity(), state.getMeasureType(), iobyxmoadgVar.f103772btonecajqb, iobyxmoadgVar.f103774gtknphoqwx), state.getQuantity(), v12.ppxfxbqfkf.zoijcleaow(state.getPrice(), iobyxmoadgVar.f103772btonecajqb), v12.ppxfxbqfkf.zoijcleaow(state.getPrice() * state.getQuantity(), iobyxmoadgVar.f103772btonecajqb), state.getMeasureType(), state.getMarkCodes(), null, state.getPrice(), state.getIsLoading(), UserVerificationMethods.USER_VERIFY_ALL, null);
    }

    @Override // ws.zoijcleaow
    protected draadjrbmk esjtqupxsv() {
        return this.f103773draadjrbmk;
    }

    @Override // ws.zoijcleaow
    protected draadjrbmk iwizpuwonk() {
        return this.f103775wflxmlrfwp;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ws.zoijcleaow
    /* JADX INFO: renamed from: ulzqkzuiru, reason: merged with bridge method [inline-methods] */
    public Object lereixgezr(eablkybsjg eablkybsjgVar, lg.gxszxtbevo gxszxtbevoVar) {
        if (eablkybsjgVar instanceof eablkybsjg.zoijcleaow) {
            Object objCllcsxoeiz = cllcsxoeiz(new ppxfxbqfkf.zoijcleaow(((eablkybsjg.zoijcleaow) eablkybsjgVar).iobyxmoadg()), gxszxtbevoVar);
            return objCllcsxoeiz == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (!zdlpuopuiu.eablkybsjg(eablkybsjgVar, eablkybsjg.iobyxmoadg.f105404iobyxmoadg)) {
            throw new NoWhenBranchMatchedException();
        }
        Object objCllcsxoeiz2 = cllcsxoeiz(ppxfxbqfkf.iobyxmoadg.f103776iobyxmoadg, gxszxtbevoVar);
        return objCllcsxoeiz2 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz2 : wwaezpbzkn.f37140iobyxmoadg;
    }
}
