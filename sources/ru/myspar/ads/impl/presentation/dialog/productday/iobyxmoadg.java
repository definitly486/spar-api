package ru.myspar.ads.impl.presentation.dialog.productday;

import androidx.lifecycle.pkzmftpjix;
import bo.eablkybsjg;
import bo.lqeggnwhkg;
import gg.wwaezpbzkn;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.vdvldrhtss;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import ru.myspar.ads.impl.domain.productday.store.State;
import tg.draadjrbmk;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes3.dex */
public final class iobyxmoadg extends ws.zoijcleaow {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final ho.iobyxmoadg f84145btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final draadjrbmk f84146draadjrbmk;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final d60.iobyxmoadg f84147gtknphoqwx;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final draadjrbmk f84148wflxmlrfwp;

    /* JADX INFO: renamed from: ru.myspar.ads.impl.presentation.dialog.productday.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    /* synthetic */ class C1901iobyxmoadg extends vdvldrhtss implements rgvfuqvkyq {
        C1901iobyxmoadg(Object obj) {
            super(2, obj, d60.iobyxmoadg.class, "getStringWithArrayArgs", "getStringWithArrayArgs(I[Ljava/lang/Object;)Ljava/lang/String;", 0);
        }

        @Override // tg.rgvfuqvkyq
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return iobyxmoadg(((Number) obj).intValue(), (Object[]) obj2);
        }

        public final String iobyxmoadg(int i13, Object[] objArr) {
            return ((d60.iobyxmoadg) this.receiver).eablkybsjg(i13, objArr);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(lqeggnwhkg store, ns.iobyxmoadg dispatchersProvider, pkzmftpjix savedStateHandle, ho.iobyxmoadg productDayUiMapper, d60.iobyxmoadg resourcesManager) {
        super(store, dispatchersProvider, savedStateHandle);
        zdlpuopuiu.btonecajqb(store, "store");
        zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        zdlpuopuiu.btonecajqb(savedStateHandle, "savedStateHandle");
        zdlpuopuiu.btonecajqb(productDayUiMapper, "productDayUiMapper");
        zdlpuopuiu.btonecajqb(resourcesManager, "resourcesManager");
        this.f84145btonecajqb = productDayUiMapper;
        this.f84147gtknphoqwx = resourcesManager;
        this.f84146draadjrbmk = new draadjrbmk() { // from class: go.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.ads.impl.presentation.dialog.productday.iobyxmoadg.sopmlzcsov(this.f37984zdlpuopuiu, (State) obj);
            }
        };
        this.f84148wflxmlrfwp = new draadjrbmk() { // from class: go.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.ads.impl.presentation.dialog.productday.iobyxmoadg.ntlheqmsrt((ru.myspar.ads.impl.presentation.dialog.productday.zoijcleaow) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final bo.wkgbmnqykc ntlheqmsrt(zoijcleaow zoijcleaowVar) {
        zdlpuopuiu.btonecajqb(zoijcleaowVar, "<this>");
        if (zoijcleaowVar instanceof zoijcleaow.iobyxmoadg) {
            return bo.wkgbmnqykc.zoijcleaow.f16871iobyxmoadg;
        }
        if (zoijcleaowVar instanceof zoijcleaow.C1903zoijcleaow) {
            return new bo.wkgbmnqykc.ppxfxbqfkf(((zoijcleaow.C1903zoijcleaow) zoijcleaowVar).iobyxmoadg());
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final go.lqeggnwhkg sopmlzcsov(iobyxmoadg iobyxmoadgVar, State state) {
        zdlpuopuiu.btonecajqb(state, "<this>");
        return new go.lqeggnwhkg(state.getTitle(), state.getSubtitle(), state.getSubtitleText(), state.getText(), state.getButtonText(), iobyxmoadgVar.f84145btonecajqb.wkgbmnqykc(state.getProductDay(), state.getDeliveryCode(), new C1901iobyxmoadg(iobyxmoadgVar.f84147gtknphoqwx)), state.getIsCorrectData());
    }

    @Override // ws.zoijcleaow
    protected draadjrbmk esjtqupxsv() {
        return this.f84146draadjrbmk;
    }

    @Override // ws.zoijcleaow
    protected draadjrbmk iwizpuwonk() {
        return this.f84148wflxmlrfwp;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ws.zoijcleaow
    /* JADX INFO: renamed from: ulzqkzuiru, reason: merged with bridge method [inline-methods] */
    public Object lereixgezr(eablkybsjg eablkybsjgVar, gxszxtbevo gxszxtbevoVar) {
        if (eablkybsjgVar instanceof eablkybsjg.iobyxmoadg) {
            Object objCllcsxoeiz = cllcsxoeiz(new ppxfxbqfkf.iobyxmoadg(((eablkybsjg.iobyxmoadg) eablkybsjgVar).iobyxmoadg()), gxszxtbevoVar);
            return objCllcsxoeiz == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (eablkybsjgVar instanceof eablkybsjg.zoijcleaow) {
            eablkybsjg.zoijcleaow zoijcleaowVar = (eablkybsjg.zoijcleaow) eablkybsjgVar;
            Object objCllcsxoeiz2 = cllcsxoeiz(new ppxfxbqfkf.zoijcleaow(zoijcleaowVar.zoijcleaow(), zoijcleaowVar.iobyxmoadg()), gxszxtbevoVar);
            return objCllcsxoeiz2 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz2 : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (!(eablkybsjgVar instanceof eablkybsjg.ppxfxbqfkf)) {
            throw new NoWhenBranchMatchedException();
        }
        Object objCllcsxoeiz3 = cllcsxoeiz(new ppxfxbqfkf.C1902ppxfxbqfkf(((eablkybsjg.ppxfxbqfkf) eablkybsjgVar).iobyxmoadg()), gxszxtbevoVar);
        return objCllcsxoeiz3 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz3 : wwaezpbzkn.f37140iobyxmoadg;
    }
}
