package ru.myspar.proloyalty.tipsorder.impl.presentation;

import androidx.lifecycle.pkzmftpjix;
import androidx.lifecycle.ulzqkzuiru;
import gg.wwaezpbzkn;
import hg.jyumaefscl;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import j0.l;
import j0.m;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.vdvldrhtss;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import m21.dxjokdxxww;
import p0.tzroggbefp;
import pj.cllcsxoeiz;
import pv1.nufgyqmvbu;
import ru.myspar.proloyalty.components.payment.api.models.SbpRecurringBankAppModel;
import ru.myspar.proloyalty.core.ui.model.MainTab;
import ru.myspar.proloyalty.payment.api.WebViewPaymentResultHelper;
import ru.myspar.proloyalty.sbp_recurring.api.model.BankModel;
import ru.myspar.proloyalty.tipsorder.impl.domain.store.State;
import ru.myspar.proloyalty.tipsorder.impl.domain.store.eablkybsjg;
import ru.myspar.proloyalty.tipsorder.impl.domain.store.lqeggnwhkg;
import ru.myspar.proloyalty.tipsorder.impl.domain.store.wkgbmnqykc;
import tg.draadjrbmk;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg extends pr0.zoijcleaow {

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    public static final C2457iobyxmoadg f101958ojitshcjhn = new C2457iobyxmoadg(null);

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    public static final int f101959rgvfuqvkyq = 8;

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private final draadjrbmk f101960agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final rg1.iobyxmoadg f101961btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final WebViewPaymentResultHelper f101962draadjrbmk;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final uv1.iobyxmoadg f101963gtknphoqwx;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final draadjrbmk f101964wflxmlrfwp;

    /* JADX INFO: renamed from: ru.myspar.proloyalty.tipsorder.impl.presentation.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C2457iobyxmoadg {
        public /* synthetic */ C2457iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private C2457iobyxmoadg() {
        }
    }

    /* synthetic */ class ppxfxbqfkf extends vdvldrhtss implements draadjrbmk {
        ppxfxbqfkf(Object obj) {
            super(1, obj, uv1.iobyxmoadg.class, "invoke", "invoke(Lru/myspar/proloyalty/tipsorder/impl/domain/store/TipsOrderStore$State;)Lru/myspar/proloyalty/tipsorder/impl/presentation/TipsOrderView$Model;", 0);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final nufgyqmvbu invoke(State p13) {
            zdlpuopuiu.btonecajqb(p13, "p0");
            return ((uv1.iobyxmoadg) this.receiver).iobyxmoadg(p13);
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f101966zdlpuopuiu;

        zoijcleaow(gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final gxszxtbevo create(Object obj, gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new zoijcleaow(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f101966zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
                wkgbmnqykc.lqeggnwhkg lqeggnwhkgVar = wkgbmnqykc.lqeggnwhkg.f101938iobyxmoadg;
                this.f101966zdlpuopuiu = 1;
                if (iobyxmoadgVar.jpowsppfya(lqeggnwhkgVar, this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, gxszxtbevo gxszxtbevoVar) {
            return ((zoijcleaow) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(lqeggnwhkg store, dr0.iobyxmoadg dispatchersProvider, pkzmftpjix savedStateHandle, rg1.iobyxmoadg paymentFeatureApi, uv1.iobyxmoadg stateToModelMapper, WebViewPaymentResultHelper webViewPaymentResultHelper) {
        super(store, dispatchersProvider, savedStateHandle);
        zdlpuopuiu.btonecajqb(store, "store");
        zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        zdlpuopuiu.btonecajqb(savedStateHandle, "savedStateHandle");
        zdlpuopuiu.btonecajqb(paymentFeatureApi, "paymentFeatureApi");
        zdlpuopuiu.btonecajqb(stateToModelMapper, "stateToModelMapper");
        zdlpuopuiu.btonecajqb(webViewPaymentResultHelper, "webViewPaymentResultHelper");
        this.f101961btonecajqb = paymentFeatureApi;
        this.f101963gtknphoqwx = stateToModelMapper;
        this.f101962draadjrbmk = webViewPaymentResultHelper;
        this.f101964wflxmlrfwp = new ppxfxbqfkf(stateToModelMapper);
        this.f101960agtfadlqog = new draadjrbmk() { // from class: pv1.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.tipsorder.impl.presentation.iobyxmoadg.ntlheqmsrt((ru.myspar.proloyalty.tipsorder.impl.presentation.zoijcleaow) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wkgbmnqykc ntlheqmsrt(ru.myspar.proloyalty.tipsorder.impl.presentation.zoijcleaow zoijcleaowVar) {
        zdlpuopuiu.btonecajqb(zoijcleaowVar, "<this>");
        if (zoijcleaowVar instanceof ru.myspar.proloyalty.tipsorder.impl.presentation.zoijcleaow.ppxfxbqfkf) {
            ru.myspar.proloyalty.tipsorder.impl.presentation.zoijcleaow.ppxfxbqfkf ppxfxbqfkfVar = (ru.myspar.proloyalty.tipsorder.impl.presentation.zoijcleaow.ppxfxbqfkf) zoijcleaowVar;
            return new wkgbmnqykc.iobyxmoadg.zoijcleaow(ppxfxbqfkfVar.iobyxmoadg(), ppxfxbqfkfVar.zoijcleaow());
        }
        if (zoijcleaowVar instanceof ru.myspar.proloyalty.tipsorder.impl.presentation.zoijcleaow.gxszxtbevo) {
            ru.myspar.proloyalty.tipsorder.impl.presentation.zoijcleaow.gxszxtbevo gxszxtbevoVar = (ru.myspar.proloyalty.tipsorder.impl.presentation.zoijcleaow.gxszxtbevo) zoijcleaowVar;
            String strValueOf = String.valueOf(gxszxtbevoVar.iobyxmoadg());
            return new wkgbmnqykc.iobyxmoadg.zoijcleaow(gxszxtbevoVar.zoijcleaow(), new tzroggbefp(strValueOf, m.iobyxmoadg(strValueOf.length()), (l) null, 4, (gtknphoqwx) null));
        }
        if (zoijcleaowVar instanceof ru.myspar.proloyalty.tipsorder.impl.presentation.zoijcleaow.wkgbmnqykc) {
            return new wkgbmnqykc.iobyxmoadg.zoijcleaow(((ru.myspar.proloyalty.tipsorder.impl.presentation.zoijcleaow.wkgbmnqykc) zoijcleaowVar).iobyxmoadg(), new tzroggbefp(CommonUrlParts.Values.FALSE_INTEGER, 0L, (l) null, 6, (gtknphoqwx) null));
        }
        if (zoijcleaowVar instanceof ru.myspar.proloyalty.tipsorder.impl.presentation.zoijcleaow.eablkybsjg) {
            return new wkgbmnqykc.iobyxmoadg.C2455iobyxmoadg(((ru.myspar.proloyalty.tipsorder.impl.presentation.zoijcleaow.eablkybsjg) zoijcleaowVar).iobyxmoadg());
        }
        if (zoijcleaowVar instanceof ru.myspar.proloyalty.tipsorder.impl.presentation.zoijcleaow.dxjokdxxww) {
            return new wkgbmnqykc.ppxfxbqfkf(((ru.myspar.proloyalty.tipsorder.impl.presentation.zoijcleaow.dxjokdxxww) zoijcleaowVar).iobyxmoadg());
        }
        if (zdlpuopuiu.eablkybsjg(zoijcleaowVar, ru.myspar.proloyalty.tipsorder.impl.presentation.zoijcleaow.nufgyqmvbu.f101975iobyxmoadg)) {
            return wkgbmnqykc.gxszxtbevo.f101934iobyxmoadg;
        }
        if (zdlpuopuiu.eablkybsjg(zoijcleaowVar, ru.myspar.proloyalty.tipsorder.impl.presentation.zoijcleaow.C2458zoijcleaow.f101979iobyxmoadg)) {
            return wkgbmnqykc.eablkybsjg.f101933iobyxmoadg;
        }
        if (zdlpuopuiu.eablkybsjg(zoijcleaowVar, ru.myspar.proloyalty.tipsorder.impl.presentation.zoijcleaow.lqeggnwhkg.f101974iobyxmoadg)) {
            return wkgbmnqykc.C2456wkgbmnqykc.f101940iobyxmoadg;
        }
        if (zdlpuopuiu.eablkybsjg(zoijcleaowVar, ru.myspar.proloyalty.tipsorder.impl.presentation.zoijcleaow.iobyxmoadg.f101973iobyxmoadg)) {
            return wkgbmnqykc.zoijcleaow.f101941iobyxmoadg;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void sopmlzcsov(iobyxmoadg iobyxmoadgVar, Object it) {
        zdlpuopuiu.btonecajqb(it, "it");
        if (iobyxmoadgVar.f101962draadjrbmk.ppxfxbqfkf(it)) {
            pj.gtknphoqwx.wkgbmnqykc(ulzqkzuiru.iobyxmoadg(iobyxmoadgVar), null, null, iobyxmoadgVar.new zoijcleaow(null), 3, null);
        }
    }

    @Override // pr0.zoijcleaow
    protected draadjrbmk esjtqupxsv() {
        return this.f101964wflxmlrfwp;
    }

    @Override // pr0.zoijcleaow
    protected draadjrbmk iwizpuwonk() {
        return this.f101960agtfadlqog;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // pr0.zoijcleaow
    /* JADX INFO: renamed from: ulzqkzuiru, reason: merged with bridge method [inline-methods] */
    public Object lereixgezr(eablkybsjg eablkybsjgVar, gxszxtbevo gxszxtbevoVar) {
        if (zdlpuopuiu.eablkybsjg(eablkybsjgVar, eablkybsjg.zoijcleaow.f101911iobyxmoadg)) {
            i21.iobyxmoadg.f41720iobyxmoadg.gtknphoqwx();
        } else {
            if (eablkybsjgVar instanceof eablkybsjg.iobyxmoadg) {
                Object objCllcsxoeiz = cllcsxoeiz(new ru.myspar.proloyalty.tipsorder.impl.presentation.ppxfxbqfkf.iobyxmoadg(((eablkybsjg.iobyxmoadg) eablkybsjgVar).iobyxmoadg()), gxszxtbevoVar);
                return objCllcsxoeiz == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz : wwaezpbzkn.f37140iobyxmoadg;
            }
            if (eablkybsjgVar instanceof eablkybsjg.wkgbmnqykc) {
                i21.iobyxmoadg iobyxmoadgVar = i21.iobyxmoadg.f41720iobyxmoadg;
                iobyxmoadgVar.oxmwwwfdhm().wkgbmnqykc(this.f101962draadjrbmk.zoijcleaow(), new l9.draadjrbmk() { // from class: pv1.zoijcleaow
                    @Override // l9.draadjrbmk
                    public final void iobyxmoadg(Object obj) {
                        ru.myspar.proloyalty.tipsorder.impl.presentation.iobyxmoadg.sopmlzcsov(this.f77383iobyxmoadg, obj);
                    }
                });
                iobyxmoadgVar.oxmwwwfdhm().lqeggnwhkg(this.f101961btonecajqb.iobyxmoadg(((eablkybsjg.wkgbmnqykc) eablkybsjgVar).iobyxmoadg()));
            } else {
                if (eablkybsjgVar instanceof eablkybsjg.gxszxtbevo) {
                    List<SbpRecurringBankAppModel> listIobyxmoadg = ((eablkybsjg.gxszxtbevo) eablkybsjgVar).iobyxmoadg();
                    ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(listIobyxmoadg, 10));
                    for (SbpRecurringBankAppModel sbpRecurringBankAppModel : listIobyxmoadg) {
                        arrayList.add(new BankModel(sbpRecurringBankAppModel.getBankName(), sbpRecurringBankAppModel.getLogoUrl(), sbpRecurringBankAppModel.getSchema(), sbpRecurringBankAppModel.getPackageName()));
                    }
                    Object objCllcsxoeiz2 = cllcsxoeiz(new ru.myspar.proloyalty.tipsorder.impl.presentation.ppxfxbqfkf.zoijcleaow(arrayList), gxszxtbevoVar);
                    return objCllcsxoeiz2 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz2 : wwaezpbzkn.f37140iobyxmoadg;
                }
                if (zdlpuopuiu.eablkybsjg(eablkybsjgVar, eablkybsjg.ppxfxbqfkf.f101909iobyxmoadg)) {
                    i21.iobyxmoadg iobyxmoadgVar2 = i21.iobyxmoadg.f41720iobyxmoadg;
                    iobyxmoadgVar2.gtknphoqwx();
                    iobyxmoadgVar2.yadqdtsiqt(MainTab.PROFILE, true);
                    i21.iobyxmoadg.iozdgvuglv(iobyxmoadgVar2, MainTab.MY_SPAR, false, 2, null);
                } else {
                    if (!(eablkybsjgVar instanceof eablkybsjg.C2452eablkybsjg)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i21.iobyxmoadg.f41720iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(dxjokdxxww.f64969iobyxmoadg.jyumaefscl(((eablkybsjg.C2452eablkybsjg) eablkybsjgVar).iobyxmoadg()));
                }
            }
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
