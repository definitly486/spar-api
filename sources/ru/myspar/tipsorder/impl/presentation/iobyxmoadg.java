package ru.myspar.tipsorder.impl.presentation;

import androidx.lifecycle.pkzmftpjix;
import androidx.lifecycle.ulzqkzuiru;
import gg.wwaezpbzkn;
import h40.dxjokdxxww;
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
import p0.tzroggbefp;
import pj.cllcsxoeiz;
import ru.myspar.components.payment.api.models.SbpRecurringBankAppModel;
import ru.myspar.core.ui.model.MainTab;
import ru.myspar.payment.api.WebViewPaymentResultHelper;
import ru.myspar.sbp_recurring.api.model.BankModel;
import ru.myspar.tipsorder.impl.domain.store.State;
import ru.myspar.tipsorder.impl.domain.store.eablkybsjg;
import ru.myspar.tipsorder.impl.domain.store.lqeggnwhkg;
import ru.myspar.tipsorder.impl.domain.store.wkgbmnqykc;
import tg.draadjrbmk;
import tg.rgvfuqvkyq;
import v92.nufgyqmvbu;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg extends ws.zoijcleaow {

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    public static final C2535iobyxmoadg f104595ojitshcjhn = new C2535iobyxmoadg(null);

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    public static final int f104596rgvfuqvkyq = 8;

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private final draadjrbmk f104597agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final qj0.iobyxmoadg f104598btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final WebViewPaymentResultHelper f104599draadjrbmk;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final aa2.iobyxmoadg f104600gtknphoqwx;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final draadjrbmk f104601wflxmlrfwp;

    /* JADX INFO: renamed from: ru.myspar.tipsorder.impl.presentation.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C2535iobyxmoadg {
        public /* synthetic */ C2535iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private C2535iobyxmoadg() {
        }
    }

    /* synthetic */ class ppxfxbqfkf extends vdvldrhtss implements draadjrbmk {
        ppxfxbqfkf(Object obj) {
            super(1, obj, aa2.iobyxmoadg.class, "invoke", "invoke(Lru/myspar/tipsorder/impl/domain/store/TipsOrderStore$State;)Lru/myspar/tipsorder/impl/presentation/TipsOrderView$Model;", 0);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final nufgyqmvbu invoke(State p13) {
            zdlpuopuiu.btonecajqb(p13, "p0");
            return ((aa2.iobyxmoadg) this.receiver).iobyxmoadg(p13);
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f104603zdlpuopuiu;

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
            int i13 = this.f104603zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
                wkgbmnqykc.lqeggnwhkg lqeggnwhkgVar = wkgbmnqykc.lqeggnwhkg.f104575iobyxmoadg;
                this.f104603zdlpuopuiu = 1;
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
    public iobyxmoadg(lqeggnwhkg store, ns.iobyxmoadg dispatchersProvider, pkzmftpjix savedStateHandle, qj0.iobyxmoadg paymentFeatureApi, aa2.iobyxmoadg stateToModelMapper, WebViewPaymentResultHelper webViewPaymentResultHelper) {
        super(store, dispatchersProvider, savedStateHandle);
        zdlpuopuiu.btonecajqb(store, "store");
        zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        zdlpuopuiu.btonecajqb(savedStateHandle, "savedStateHandle");
        zdlpuopuiu.btonecajqb(paymentFeatureApi, "paymentFeatureApi");
        zdlpuopuiu.btonecajqb(stateToModelMapper, "stateToModelMapper");
        zdlpuopuiu.btonecajqb(webViewPaymentResultHelper, "webViewPaymentResultHelper");
        this.f104598btonecajqb = paymentFeatureApi;
        this.f104600gtknphoqwx = stateToModelMapper;
        this.f104599draadjrbmk = webViewPaymentResultHelper;
        this.f104601wflxmlrfwp = new ppxfxbqfkf(stateToModelMapper);
        this.f104597agtfadlqog = new draadjrbmk() { // from class: v92.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.tipsorder.impl.presentation.iobyxmoadg.ntlheqmsrt((ru.myspar.tipsorder.impl.presentation.zoijcleaow) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wkgbmnqykc ntlheqmsrt(ru.myspar.tipsorder.impl.presentation.zoijcleaow zoijcleaowVar) {
        zdlpuopuiu.btonecajqb(zoijcleaowVar, "<this>");
        if (zoijcleaowVar instanceof ru.myspar.tipsorder.impl.presentation.zoijcleaow.ppxfxbqfkf) {
            ru.myspar.tipsorder.impl.presentation.zoijcleaow.ppxfxbqfkf ppxfxbqfkfVar = (ru.myspar.tipsorder.impl.presentation.zoijcleaow.ppxfxbqfkf) zoijcleaowVar;
            return new wkgbmnqykc.iobyxmoadg.zoijcleaow(ppxfxbqfkfVar.iobyxmoadg(), ppxfxbqfkfVar.zoijcleaow());
        }
        if (zoijcleaowVar instanceof ru.myspar.tipsorder.impl.presentation.zoijcleaow.gxszxtbevo) {
            ru.myspar.tipsorder.impl.presentation.zoijcleaow.gxszxtbevo gxszxtbevoVar = (ru.myspar.tipsorder.impl.presentation.zoijcleaow.gxszxtbevo) zoijcleaowVar;
            String strValueOf = String.valueOf(gxszxtbevoVar.iobyxmoadg());
            return new wkgbmnqykc.iobyxmoadg.zoijcleaow(gxszxtbevoVar.zoijcleaow(), new tzroggbefp(strValueOf, m.iobyxmoadg(strValueOf.length()), (l) null, 4, (gtknphoqwx) null));
        }
        if (zoijcleaowVar instanceof ru.myspar.tipsorder.impl.presentation.zoijcleaow.wkgbmnqykc) {
            return new wkgbmnqykc.iobyxmoadg.zoijcleaow(((ru.myspar.tipsorder.impl.presentation.zoijcleaow.wkgbmnqykc) zoijcleaowVar).iobyxmoadg(), new tzroggbefp(CommonUrlParts.Values.FALSE_INTEGER, 0L, (l) null, 6, (gtknphoqwx) null));
        }
        if (zoijcleaowVar instanceof ru.myspar.tipsorder.impl.presentation.zoijcleaow.eablkybsjg) {
            return new wkgbmnqykc.iobyxmoadg.C2533iobyxmoadg(((ru.myspar.tipsorder.impl.presentation.zoijcleaow.eablkybsjg) zoijcleaowVar).iobyxmoadg());
        }
        if (zoijcleaowVar instanceof ru.myspar.tipsorder.impl.presentation.zoijcleaow.dxjokdxxww) {
            return new wkgbmnqykc.ppxfxbqfkf(((ru.myspar.tipsorder.impl.presentation.zoijcleaow.dxjokdxxww) zoijcleaowVar).iobyxmoadg());
        }
        if (zdlpuopuiu.eablkybsjg(zoijcleaowVar, ru.myspar.tipsorder.impl.presentation.zoijcleaow.nufgyqmvbu.f104612iobyxmoadg)) {
            return wkgbmnqykc.gxszxtbevo.f104571iobyxmoadg;
        }
        if (zdlpuopuiu.eablkybsjg(zoijcleaowVar, ru.myspar.tipsorder.impl.presentation.zoijcleaow.C2536zoijcleaow.f104616iobyxmoadg)) {
            return wkgbmnqykc.eablkybsjg.f104570iobyxmoadg;
        }
        if (zdlpuopuiu.eablkybsjg(zoijcleaowVar, ru.myspar.tipsorder.impl.presentation.zoijcleaow.lqeggnwhkg.f104611iobyxmoadg)) {
            return wkgbmnqykc.C2534wkgbmnqykc.f104577iobyxmoadg;
        }
        if (zdlpuopuiu.eablkybsjg(zoijcleaowVar, ru.myspar.tipsorder.impl.presentation.zoijcleaow.iobyxmoadg.f104610iobyxmoadg)) {
            return wkgbmnqykc.zoijcleaow.f104578iobyxmoadg;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void sopmlzcsov(iobyxmoadg iobyxmoadgVar, Object it) {
        zdlpuopuiu.btonecajqb(it, "it");
        if (iobyxmoadgVar.f104599draadjrbmk.ppxfxbqfkf(it)) {
            pj.gtknphoqwx.wkgbmnqykc(ulzqkzuiru.iobyxmoadg(iobyxmoadgVar), null, null, iobyxmoadgVar.new zoijcleaow(null), 3, null);
        }
    }

    @Override // ws.zoijcleaow
    protected draadjrbmk esjtqupxsv() {
        return this.f104601wflxmlrfwp;
    }

    @Override // ws.zoijcleaow
    protected draadjrbmk iwizpuwonk() {
        return this.f104597agtfadlqog;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ws.zoijcleaow
    /* JADX INFO: renamed from: ulzqkzuiru, reason: merged with bridge method [inline-methods] */
    public Object lereixgezr(eablkybsjg eablkybsjgVar, gxszxtbevo gxszxtbevoVar) {
        if (zdlpuopuiu.eablkybsjg(eablkybsjgVar, eablkybsjg.zoijcleaow.f104548iobyxmoadg)) {
            d40.iobyxmoadg.f26931iobyxmoadg.gtknphoqwx();
        } else {
            if (eablkybsjgVar instanceof eablkybsjg.iobyxmoadg) {
                Object objCllcsxoeiz = cllcsxoeiz(new ru.myspar.tipsorder.impl.presentation.ppxfxbqfkf.iobyxmoadg(((eablkybsjg.iobyxmoadg) eablkybsjgVar).iobyxmoadg()), gxszxtbevoVar);
                return objCllcsxoeiz == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz : wwaezpbzkn.f37140iobyxmoadg;
            }
            if (eablkybsjgVar instanceof eablkybsjg.wkgbmnqykc) {
                d40.iobyxmoadg iobyxmoadgVar = d40.iobyxmoadg.f26931iobyxmoadg;
                iobyxmoadgVar.oxmwwwfdhm().wkgbmnqykc(this.f104599draadjrbmk.zoijcleaow(), new l9.draadjrbmk() { // from class: v92.zoijcleaow
                    @Override // l9.draadjrbmk
                    public final void iobyxmoadg(Object obj) {
                        ru.myspar.tipsorder.impl.presentation.iobyxmoadg.sopmlzcsov(this.f116419iobyxmoadg, obj);
                    }
                });
                iobyxmoadgVar.oxmwwwfdhm().lqeggnwhkg(this.f104598btonecajqb.iobyxmoadg(((eablkybsjg.wkgbmnqykc) eablkybsjgVar).iobyxmoadg()));
            } else {
                if (eablkybsjgVar instanceof eablkybsjg.gxszxtbevo) {
                    List<SbpRecurringBankAppModel> listIobyxmoadg = ((eablkybsjg.gxszxtbevo) eablkybsjgVar).iobyxmoadg();
                    ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(listIobyxmoadg, 10));
                    for (SbpRecurringBankAppModel sbpRecurringBankAppModel : listIobyxmoadg) {
                        arrayList.add(new BankModel(sbpRecurringBankAppModel.getBankName(), sbpRecurringBankAppModel.getLogoUrl(), sbpRecurringBankAppModel.getSchema(), sbpRecurringBankAppModel.getPackageName()));
                    }
                    Object objCllcsxoeiz2 = cllcsxoeiz(new ru.myspar.tipsorder.impl.presentation.ppxfxbqfkf.zoijcleaow(arrayList), gxszxtbevoVar);
                    return objCllcsxoeiz2 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz2 : wwaezpbzkn.f37140iobyxmoadg;
                }
                if (zdlpuopuiu.eablkybsjg(eablkybsjgVar, eablkybsjg.ppxfxbqfkf.f104546iobyxmoadg)) {
                    d40.iobyxmoadg iobyxmoadgVar2 = d40.iobyxmoadg.f26931iobyxmoadg;
                    iobyxmoadgVar2.gtknphoqwx();
                    iobyxmoadgVar2.yadqdtsiqt(MainTab.PROFILE, true);
                    d40.iobyxmoadg.iozdgvuglv(iobyxmoadgVar2, MainTab.MY_SPAR, false, 2, null);
                } else {
                    if (!(eablkybsjgVar instanceof eablkybsjg.C2530eablkybsjg)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    d40.iobyxmoadg.f26931iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(dxjokdxxww.f39382iobyxmoadg.jyumaefscl(((eablkybsjg.C2530eablkybsjg) eablkybsjgVar).iobyxmoadg()));
                }
            }
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
