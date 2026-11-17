package u92;

import gg.wwaezpbzkn;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import pj.cllcsxoeiz;
import pj.dxjokdxxww;
import pj.gtknphoqwx;
import pj.ntlheqmsrt;
import pj.pkzmftpjix;
import ru.myspar.components.payment.api.models.SbpRecurringBankAppModel;
import ru.myspar.tipsorder.impl.domain.model.PaymentMethod;
import ru.myspar.tipsorder.impl.domain.model.SendTipsParams;
import tg.rgvfuqvkyq;
import w10.btonecajqb;

/* JADX INFO: loaded from: classes6.dex */
public final class zoijcleaow extends ft.ppxfxbqfkf {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final pkzmftpjix f113029eablkybsjg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final btonecajqb f113030ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final cw.iobyxmoadg f113031wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final t92.iobyxmoadg f113032zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f113033iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final SendTipsParams f113034zoijcleaow;

        public iobyxmoadg(String orderId, SendTipsParams sendParams) {
            zdlpuopuiu.btonecajqb(orderId, "orderId");
            zdlpuopuiu.btonecajqb(sendParams, "sendParams");
            this.f113033iobyxmoadg = orderId;
            this.f113034zoijcleaow = sendParams;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f113033iobyxmoadg, iobyxmoadgVar.f113033iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f113034zoijcleaow, iobyxmoadgVar.f113034zoijcleaow);
        }

        public int hashCode() {
            return (this.f113033iobyxmoadg.hashCode() * 31) + this.f113034zoijcleaow.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f113033iobyxmoadg;
        }

        public String toString() {
            return "Params(orderId=" + this.f113033iobyxmoadg + ", sendParams=" + this.f113034zoijcleaow + ")";
        }

        public final SendTipsParams zoijcleaow() {
            return this.f113034zoijcleaow;
        }
    }

    /* JADX INFO: renamed from: u92.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    static final class C2802zoijcleaow extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ zoijcleaow f113035iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ iobyxmoadg f113036jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private /* synthetic */ Object f113037yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f113038zdlpuopuiu;

        /* JADX INFO: renamed from: u92.zoijcleaow$zoijcleaow$iobyxmoadg */
        static final class iobyxmoadg extends draadjrbmk implements rgvfuqvkyq {

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            final /* synthetic */ iobyxmoadg f113039jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ zoijcleaow f113040yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f113041zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            iobyxmoadg(zoijcleaow zoijcleaowVar, iobyxmoadg iobyxmoadgVar, gxszxtbevo gxszxtbevoVar) {
                super(2, gxszxtbevoVar);
                this.f113040yggfygwlhe = zoijcleaowVar;
                this.f113039jyumaefscl = iobyxmoadgVar;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final gxszxtbevo create(Object obj, gxszxtbevo gxszxtbevoVar) {
                return new iobyxmoadg(this.f113040yggfygwlhe, this.f113039jyumaefscl, gxszxtbevoVar);
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i13 = this.f113041zdlpuopuiu;
                if (i13 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    t92.iobyxmoadg iobyxmoadgVar = this.f113040yggfygwlhe.f113032zoijcleaow;
                    String strIobyxmoadg = this.f113039jyumaefscl.iobyxmoadg();
                    SendTipsParams sendTipsParamsZoijcleaow = this.f113039jyumaefscl.zoijcleaow();
                    this.f113041zdlpuopuiu = 1;
                    obj = iobyxmoadgVar.zoijcleaow(strIobyxmoadg, sendTipsParamsZoijcleaow, this);
                    if (obj == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gg.zdlpuopuiu.zoijcleaow(obj);
                }
                return obj;
            }

            @Override // tg.rgvfuqvkyq
            public final Object invoke(cllcsxoeiz cllcsxoeizVar, gxszxtbevo gxszxtbevoVar) {
                return ((iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2802zoijcleaow(iobyxmoadg iobyxmoadgVar, zoijcleaow zoijcleaowVar, gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f113036jyumaefscl = iobyxmoadgVar;
            this.f113035iwizpuwonk = zoijcleaowVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final gxszxtbevo create(Object obj, gxszxtbevo gxszxtbevoVar) {
            C2802zoijcleaow c2802zoijcleaow = new C2802zoijcleaow(this.f113036jyumaefscl, this.f113035iwizpuwonk, gxszxtbevoVar);
            c2802zoijcleaow.f113037yggfygwlhe = obj;
            return c2802zoijcleaow;
        }

        /* JADX WARN: Code duplicated, block: B:24:0x007d A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:25:0x007e  */
        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            ntlheqmsrt ntlheqmsrtVarZoijcleaow;
            List list;
            Object objLqeggnwhkg;
            List<SbpRecurringBankAppModel> list2;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f113038zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                ntlheqmsrtVarZoijcleaow = gtknphoqwx.zoijcleaow((cllcsxoeiz) this.f113037yggfygwlhe, null, null, new iobyxmoadg(this.f113035iwizpuwonk, this.f113036jyumaefscl, null), 3, null);
                PaymentMethod chosenPayment = this.f113036jyumaefscl.zoijcleaow().getChosenPayment();
                if ((chosenPayment instanceof PaymentMethod.Online) || (chosenPayment instanceof PaymentMethod.UserCard)) {
                    this.f113038zdlpuopuiu = 1;
                    obj = ntlheqmsrtVarZoijcleaow.lqeggnwhkg(this);
                    if (obj == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                    return new s92.zoijcleaow.iobyxmoadg(((s92.iobyxmoadg) obj).iobyxmoadg());
                }
                if (!(chosenPayment instanceof PaymentMethod.SbpOnline)) {
                    throw new NoWhenBranchMatchedException();
                }
                btonecajqb btonecajqbVar = this.f113035iwizpuwonk.f113030ppxfxbqfkf;
                this.f113037yggfygwlhe = ntlheqmsrtVarZoijcleaow;
                this.f113038zdlpuopuiu = 2;
                obj = btonecajqbVar.iobyxmoadg(this);
                if (obj == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                list = (List) obj;
                this.f113037yggfygwlhe = list;
                this.f113038zdlpuopuiu = 3;
                objLqeggnwhkg = ntlheqmsrtVarZoijcleaow.lqeggnwhkg(this);
                if (objLqeggnwhkg == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                list2 = list;
                obj = objLqeggnwhkg;
            } else {
                if (i13 == 1) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    return new s92.zoijcleaow.iobyxmoadg(((s92.iobyxmoadg) obj).iobyxmoadg());
                }
                if (i13 == 2) {
                    ntlheqmsrtVarZoijcleaow = (ntlheqmsrt) this.f113037yggfygwlhe;
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    list = (List) obj;
                    this.f113037yggfygwlhe = list;
                    this.f113038zdlpuopuiu = 3;
                    objLqeggnwhkg = ntlheqmsrtVarZoijcleaow.lqeggnwhkg(this);
                    if (objLqeggnwhkg == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                    list2 = list;
                    obj = objLqeggnwhkg;
                } else {
                    if (i13 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    list2 = (List) this.f113037yggfygwlhe;
                    gg.zdlpuopuiu.zoijcleaow(obj);
                }
            }
            String strIobyxmoadg = ((s92.iobyxmoadg) obj).iobyxmoadg();
            zoijcleaow zoijcleaowVar = this.f113035iwizpuwonk;
            ArrayList arrayList = new ArrayList();
            for (SbpRecurringBankAppModel sbpRecurringBankAppModel : list2) {
                String strInvoke = zoijcleaowVar.f113031wkgbmnqykc.invoke(sbpRecurringBankAppModel.getSchema(), strIobyxmoadg);
                SbpRecurringBankAppModel sbpRecurringBankAppModelPpxfxbqfkf = strInvoke != null ? SbpRecurringBankAppModel.ppxfxbqfkf(sbpRecurringBankAppModel, null, null, strInvoke, null, 11, null) : null;
                if (sbpRecurringBankAppModelPpxfxbqfkf != null) {
                    arrayList.add(sbpRecurringBankAppModelPpxfxbqfkf);
                }
            }
            return new s92.zoijcleaow.C2589zoijcleaow(arrayList);
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, gxszxtbevo gxszxtbevoVar) {
            return ((C2802zoijcleaow) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zoijcleaow(t92.iobyxmoadg tipsOrderRepository, btonecajqb otherRemoteSource, cw.iobyxmoadg bankSchemeToSbpUri, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(tipsOrderRepository, "tipsOrderRepository");
        zdlpuopuiu.btonecajqb(otherRemoteSource, "otherRemoteSource");
        zdlpuopuiu.btonecajqb(bankSchemeToSbpUri, "bankSchemeToSbpUri");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f113032zoijcleaow = tipsOrderRepository;
        this.f113030ppxfxbqfkf = otherRemoteSource;
        this.f113031wkgbmnqykc = bankSchemeToSbpUri;
        this.f113029eablkybsjg = coroutineDispatcher;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ft.ppxfxbqfkf
    /* JADX INFO: renamed from: gxszxtbevo, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(iobyxmoadg iobyxmoadgVar, gxszxtbevo gxszxtbevoVar) {
        return dxjokdxxww.lqeggnwhkg(this.f113029eablkybsjg, new C2802zoijcleaow(iobyxmoadgVar, this, null), gxszxtbevoVar);
    }
}
