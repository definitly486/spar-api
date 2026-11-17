package ru.myspar.proloyalty.ads.impl.presentation.dialog.productday;

import androidx.lifecycle.pkzmftpjix;
import gg.wwaezpbzkn;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.vdvldrhtss;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import mm0.eablkybsjg;
import mm0.lqeggnwhkg;
import ru.myspar.proloyalty.ads.impl.domain.productday.store.State;
import tg.draadjrbmk;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg extends pr0.zoijcleaow {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final rm0.iobyxmoadg f92170btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final draadjrbmk f92171draadjrbmk;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final q41.iobyxmoadg f92172gtknphoqwx;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final draadjrbmk f92173wflxmlrfwp;

    /* JADX INFO: renamed from: ru.myspar.proloyalty.ads.impl.presentation.dialog.productday.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    /* synthetic */ class C2145iobyxmoadg extends vdvldrhtss implements rgvfuqvkyq {
        C2145iobyxmoadg(Object obj) {
            super(2, obj, q41.iobyxmoadg.class, "getStringWithArrayArgs", "getStringWithArrayArgs(I[Ljava/lang/Object;)Ljava/lang/String;", 0);
        }

        @Override // tg.rgvfuqvkyq
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return iobyxmoadg(((Number) obj).intValue(), (Object[]) obj2);
        }

        public final String iobyxmoadg(int i13, Object[] objArr) {
            return ((q41.iobyxmoadg) this.receiver).eablkybsjg(i13, objArr);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(lqeggnwhkg store, dr0.iobyxmoadg dispatchersProvider, pkzmftpjix savedStateHandle, rm0.iobyxmoadg productDayUiMapper, q41.iobyxmoadg resourcesManager) {
        super(store, dispatchersProvider, savedStateHandle);
        zdlpuopuiu.btonecajqb(store, "store");
        zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        zdlpuopuiu.btonecajqb(savedStateHandle, "savedStateHandle");
        zdlpuopuiu.btonecajqb(productDayUiMapper, "productDayUiMapper");
        zdlpuopuiu.btonecajqb(resourcesManager, "resourcesManager");
        this.f92170btonecajqb = productDayUiMapper;
        this.f92172gtknphoqwx = resourcesManager;
        this.f92171draadjrbmk = new draadjrbmk() { // from class: qm0.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.ads.impl.presentation.dialog.productday.iobyxmoadg.sopmlzcsov(this.f79179zdlpuopuiu, (State) obj);
            }
        };
        this.f92173wflxmlrfwp = new draadjrbmk() { // from class: qm0.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.ads.impl.presentation.dialog.productday.iobyxmoadg.ntlheqmsrt((ru.myspar.proloyalty.ads.impl.presentation.dialog.productday.zoijcleaow) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mm0.wkgbmnqykc ntlheqmsrt(zoijcleaow zoijcleaowVar) {
        zdlpuopuiu.btonecajqb(zoijcleaowVar, "<this>");
        if (zoijcleaowVar instanceof zoijcleaow.iobyxmoadg) {
            return mm0.wkgbmnqykc.zoijcleaow.f67503iobyxmoadg;
        }
        if (zoijcleaowVar instanceof zoijcleaow.C2147zoijcleaow) {
            return new mm0.wkgbmnqykc.ppxfxbqfkf(((zoijcleaow.C2147zoijcleaow) zoijcleaowVar).iobyxmoadg());
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final qm0.lqeggnwhkg sopmlzcsov(iobyxmoadg iobyxmoadgVar, State state) {
        zdlpuopuiu.btonecajqb(state, "<this>");
        return new qm0.lqeggnwhkg(state.getIsLoading(), state.getTitle(), state.getSubtitle(), state.getSubtitleText(), state.getText(), state.getButtonText(), iobyxmoadgVar.f92170btonecajqb.wkgbmnqykc(state.getProductDay(), state.getDeliveryCode(), new C2145iobyxmoadg(iobyxmoadgVar.f92172gtknphoqwx)), state.getIsCorrectData());
    }

    @Override // pr0.zoijcleaow
    protected draadjrbmk esjtqupxsv() {
        return this.f92171draadjrbmk;
    }

    @Override // pr0.zoijcleaow
    protected draadjrbmk iwizpuwonk() {
        return this.f92173wflxmlrfwp;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // pr0.zoijcleaow
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
        Object objCllcsxoeiz3 = cllcsxoeiz(new ppxfxbqfkf.C2146ppxfxbqfkf(((eablkybsjg.ppxfxbqfkf) eablkybsjgVar).iobyxmoadg()), gxszxtbevoVar);
        return objCllcsxoeiz3 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz3 : wwaezpbzkn.f37140iobyxmoadg;
    }
}
