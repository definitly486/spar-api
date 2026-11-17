package ov1;

import gg.wwaezpbzkn;
import java.util.ArrayList;
import java.util.List;
import k01.btonecajqb;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import pj.cllcsxoeiz;
import pj.dxjokdxxww;
import pj.gtknphoqwx;
import pj.ntlheqmsrt;
import pj.pkzmftpjix;
import ru.myspar.proloyalty.components.payment.api.models.SbpRecurringBankAppModel;
import ru.myspar.proloyalty.tipsorder.impl.domain.model.PaymentMethod;
import ru.myspar.proloyalty.tipsorder.impl.domain.model.SendTipsParams;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes6.dex */
public final class zoijcleaow extends zr0.ppxfxbqfkf {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final pkzmftpjix f74807eablkybsjg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final btonecajqb f74808ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final wu0.iobyxmoadg f74809wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final nv1.iobyxmoadg f74810zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f74811iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final SendTipsParams f74812zoijcleaow;

        public iobyxmoadg(String orderId, SendTipsParams sendParams) {
            zdlpuopuiu.btonecajqb(orderId, "orderId");
            zdlpuopuiu.btonecajqb(sendParams, "sendParams");
            this.f74811iobyxmoadg = orderId;
            this.f74812zoijcleaow = sendParams;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f74811iobyxmoadg, iobyxmoadgVar.f74811iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f74812zoijcleaow, iobyxmoadgVar.f74812zoijcleaow);
        }

        public int hashCode() {
            return (this.f74811iobyxmoadg.hashCode() * 31) + this.f74812zoijcleaow.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f74811iobyxmoadg;
        }

        public String toString() {
            return "Params(orderId=" + this.f74811iobyxmoadg + ", sendParams=" + this.f74812zoijcleaow + ")";
        }

        public final SendTipsParams zoijcleaow() {
            return this.f74812zoijcleaow;
        }
    }

    /* JADX INFO: renamed from: ov1.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    static final class C1629zoijcleaow extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ zoijcleaow f74813iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ iobyxmoadg f74814jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private /* synthetic */ Object f74815yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f74816zdlpuopuiu;

        /* JADX INFO: renamed from: ov1.zoijcleaow$zoijcleaow$iobyxmoadg */
        static final class iobyxmoadg extends draadjrbmk implements rgvfuqvkyq {

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            final /* synthetic */ iobyxmoadg f74817jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ zoijcleaow f74818yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f74819zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            iobyxmoadg(zoijcleaow zoijcleaowVar, iobyxmoadg iobyxmoadgVar, gxszxtbevo gxszxtbevoVar) {
                super(2, gxszxtbevoVar);
                this.f74818yggfygwlhe = zoijcleaowVar;
                this.f74817jyumaefscl = iobyxmoadgVar;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final gxszxtbevo create(Object obj, gxszxtbevo gxszxtbevoVar) {
                return new iobyxmoadg(this.f74818yggfygwlhe, this.f74817jyumaefscl, gxszxtbevoVar);
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i13 = this.f74819zdlpuopuiu;
                if (i13 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    nv1.iobyxmoadg iobyxmoadgVar = this.f74818yggfygwlhe.f74810zoijcleaow;
                    String strIobyxmoadg = this.f74817jyumaefscl.iobyxmoadg();
                    SendTipsParams sendTipsParamsZoijcleaow = this.f74817jyumaefscl.zoijcleaow();
                    this.f74819zdlpuopuiu = 1;
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
        C1629zoijcleaow(iobyxmoadg iobyxmoadgVar, zoijcleaow zoijcleaowVar, gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f74814jyumaefscl = iobyxmoadgVar;
            this.f74813iwizpuwonk = zoijcleaowVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final gxszxtbevo create(Object obj, gxszxtbevo gxszxtbevoVar) {
            C1629zoijcleaow c1629zoijcleaow = new C1629zoijcleaow(this.f74814jyumaefscl, this.f74813iwizpuwonk, gxszxtbevoVar);
            c1629zoijcleaow.f74815yggfygwlhe = obj;
            return c1629zoijcleaow;
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
            int i13 = this.f74816zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                ntlheqmsrtVarZoijcleaow = gtknphoqwx.zoijcleaow((cllcsxoeiz) this.f74815yggfygwlhe, null, null, new iobyxmoadg(this.f74813iwizpuwonk, this.f74814jyumaefscl, null), 3, null);
                PaymentMethod chosenPayment = this.f74814jyumaefscl.zoijcleaow().getChosenPayment();
                if ((chosenPayment instanceof PaymentMethod.Online) || (chosenPayment instanceof PaymentMethod.UserCard)) {
                    this.f74816zdlpuopuiu = 1;
                    obj = ntlheqmsrtVarZoijcleaow.lqeggnwhkg(this);
                    if (obj == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                    return new mv1.zoijcleaow.iobyxmoadg(((mv1.iobyxmoadg) obj).iobyxmoadg());
                }
                if (!(chosenPayment instanceof PaymentMethod.SbpOnline)) {
                    throw new NoWhenBranchMatchedException();
                }
                btonecajqb btonecajqbVar = this.f74813iwizpuwonk.f74808ppxfxbqfkf;
                this.f74815yggfygwlhe = ntlheqmsrtVarZoijcleaow;
                this.f74816zdlpuopuiu = 2;
                obj = btonecajqbVar.iobyxmoadg(this);
                if (obj == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                list = (List) obj;
                this.f74815yggfygwlhe = list;
                this.f74816zdlpuopuiu = 3;
                objLqeggnwhkg = ntlheqmsrtVarZoijcleaow.lqeggnwhkg(this);
                if (objLqeggnwhkg == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                list2 = list;
                obj = objLqeggnwhkg;
            } else {
                if (i13 == 1) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    return new mv1.zoijcleaow.iobyxmoadg(((mv1.iobyxmoadg) obj).iobyxmoadg());
                }
                if (i13 == 2) {
                    ntlheqmsrtVarZoijcleaow = (ntlheqmsrt) this.f74815yggfygwlhe;
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    list = (List) obj;
                    this.f74815yggfygwlhe = list;
                    this.f74816zdlpuopuiu = 3;
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
                    list2 = (List) this.f74815yggfygwlhe;
                    gg.zdlpuopuiu.zoijcleaow(obj);
                }
            }
            String strIobyxmoadg = ((mv1.iobyxmoadg) obj).iobyxmoadg();
            zoijcleaow zoijcleaowVar = this.f74813iwizpuwonk;
            ArrayList arrayList = new ArrayList();
            for (SbpRecurringBankAppModel sbpRecurringBankAppModel : list2) {
                String strInvoke = zoijcleaowVar.f74809wkgbmnqykc.invoke(sbpRecurringBankAppModel.getSchema(), strIobyxmoadg);
                SbpRecurringBankAppModel sbpRecurringBankAppModelPpxfxbqfkf = strInvoke != null ? SbpRecurringBankAppModel.ppxfxbqfkf(sbpRecurringBankAppModel, null, null, strInvoke, null, 11, null) : null;
                if (sbpRecurringBankAppModelPpxfxbqfkf != null) {
                    arrayList.add(sbpRecurringBankAppModelPpxfxbqfkf);
                }
            }
            return new mv1.zoijcleaow.C1455zoijcleaow(arrayList);
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, gxszxtbevo gxszxtbevoVar) {
            return ((C1629zoijcleaow) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zoijcleaow(nv1.iobyxmoadg tipsOrderRepository, btonecajqb otherRemoteSource, wu0.iobyxmoadg bankSchemeToSbpUri, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(tipsOrderRepository, "tipsOrderRepository");
        zdlpuopuiu.btonecajqb(otherRemoteSource, "otherRemoteSource");
        zdlpuopuiu.btonecajqb(bankSchemeToSbpUri, "bankSchemeToSbpUri");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f74810zoijcleaow = tipsOrderRepository;
        this.f74808ppxfxbqfkf = otherRemoteSource;
        this.f74809wkgbmnqykc = bankSchemeToSbpUri;
        this.f74807eablkybsjg = coroutineDispatcher;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // zr0.ppxfxbqfkf
    /* JADX INFO: renamed from: gxszxtbevo, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(iobyxmoadg iobyxmoadgVar, gxszxtbevo gxszxtbevoVar) {
        return dxjokdxxww.lqeggnwhkg(this.f74807eablkybsjg, new C1629zoijcleaow(iobyxmoadgVar, this, null), gxszxtbevoVar);
    }
}
