package tj0;

import gg.kcexrzcfyt;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import java.io.IOException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import pj.cllcsxoeiz;
import pj.gtknphoqwx;
import ru.myspar.payment.api.model.PaymentType;
import ru.myspar.payment.impl.methods.domain.store.State;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes3.dex */
public final class lqeggnwhkg extends e8.iobyxmoadg {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final /* synthetic */ sx.ppxfxbqfkf f110729ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final cw.eablkybsjg f110730wkgbmnqykc;

    static final class iobyxmoadg extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ State f110731jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f110733zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        iobyxmoadg(State state, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f110731jyumaefscl = state;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return lqeggnwhkg.this.new iobyxmoadg(this.f110731jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objWkgbmnqykc;
            ew.wkgbmnqykc c0696wkgbmnqykc;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f110733zdlpuopuiu;
            try {
                if (i13 == 0) {
                    zdlpuopuiu.zoijcleaow(obj);
                    lqeggnwhkg.this.ulzqkzuiru(new eablkybsjg.iobyxmoadg(true));
                    PaymentType type = this.f110731jyumaefscl.getType();
                    if (type instanceof PaymentType.Cart) {
                        c0696wkgbmnqykc = new ew.wkgbmnqykc.iobyxmoadg(this.f110731jyumaefscl.getSelectedMethod().getCode(), this.f110731jyumaefscl.getNominal().draadjrbmk());
                    } else if (type instanceof PaymentType.Edit) {
                        c0696wkgbmnqykc = new ew.wkgbmnqykc.zoijcleaow(((PaymentType.Edit) this.f110731jyumaefscl.getType()).getId(), this.f110731jyumaefscl.getSelectedMethod().getCode(), this.f110731jyumaefscl.getNominal().draadjrbmk());
                    } else if (type instanceof PaymentType.Order) {
                        c0696wkgbmnqykc = new ew.wkgbmnqykc.ppxfxbqfkf(((PaymentType.Order) this.f110731jyumaefscl.getType()).getId(), this.f110731jyumaefscl.getSelectedMethod().getCode(), this.f110731jyumaefscl.getNominal().draadjrbmk());
                    } else if (type instanceof PaymentType.Subscription) {
                        c0696wkgbmnqykc = new ew.wkgbmnqykc.C0696wkgbmnqykc(((PaymentType.Subscription) this.f110731jyumaefscl.getType()).getId(), ((PaymentType.Subscription) this.f110731jyumaefscl.getType()).getPromoCode(), this.f110731jyumaefscl.getSelectedMethod().getCode());
                    } else {
                        if (!(type instanceof PaymentType.ScanGo)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        c0696wkgbmnqykc = null;
                    }
                    if (c0696wkgbmnqykc != null) {
                        lqeggnwhkg lqeggnwhkgVar = lqeggnwhkg.this;
                        kcexrzcfyt.iobyxmoadg iobyxmoadgVar = kcexrzcfyt.f37117yggfygwlhe;
                        cw.eablkybsjg eablkybsjgVar = lqeggnwhkgVar.f110730wkgbmnqykc;
                        this.f110733zdlpuopuiu = 1;
                        obj = eablkybsjgVar.iobyxmoadg(c0696wkgbmnqykc, this);
                        if (obj == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                    }
                    return wwaezpbzkn.f37140iobyxmoadg;
                }
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(obj);
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc((ew.eablkybsjg) obj);
            } catch (Throwable th2) {
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th2));
            }
            lqeggnwhkg lqeggnwhkgVar2 = lqeggnwhkg.this;
            if (kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
                lqeggnwhkgVar2.metgxyhuhe((ew.eablkybsjg) objWkgbmnqykc);
            }
            lqeggnwhkg lqeggnwhkgVar3 = lqeggnwhkg.this;
            Throwable thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
            if (thDxjokdxxww != null) {
                lqeggnwhkgVar3.rlfsiqarku(thDxjokdxxww);
            }
            kcexrzcfyt.iobyxmoadg(objWkgbmnqykc);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lqeggnwhkg(cw.eablkybsjg paymentInteractor, ns.iobyxmoadg dispatchersProvider) {
        super(dispatchersProvider.iobyxmoadg());
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(paymentInteractor, "paymentInteractor");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        this.f110729ppxfxbqfkf = new sx.ppxfxbqfkf();
        this.f110730wkgbmnqykc = paymentInteractor;
    }

    private final void jztzpxfvev() {
        State state = (State) jlmebxxoox();
        if (state.getSelectedMethod() == null) {
            return;
        }
        gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new iobyxmoadg(state, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void metgxyhuhe(ew.eablkybsjg eablkybsjgVar) {
        PaymentType type = ((State) jlmebxxoox()).getType();
        if ((type instanceof PaymentType.Cart) || (type instanceof PaymentType.Subscription)) {
            crxdokpmqz(new wkgbmnqykc.zoijcleaow(eablkybsjgVar.iobyxmoadg()));
        } else {
            if (!(type instanceof PaymentType.Edit) && !(type instanceof PaymentType.Order) && !(type instanceof PaymentType.ScanGo)) {
                throw new NoWhenBranchMatchedException();
            }
            crxdokpmqz(new wkgbmnqykc.iobyxmoadg(true));
        }
        ulzqkzuiru(new eablkybsjg.iobyxmoadg(false));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void rlfsiqarku(Throwable th2) {
        xrmfcynszj(th2);
        if (th2 instanceof IOException) {
            crxdokpmqz(new wkgbmnqykc.iobyxmoadg(false));
        } else {
            ulzqkzuiru(new eablkybsjg.iobyxmoadg(false));
        }
    }

    private final void xrmfcynszj(Throwable th2) {
        crxdokpmqz(new wkgbmnqykc.ppxfxbqfkf(th2));
    }

    @Override // a8.zoijcleaow
    /* JADX INFO: renamed from: okpsazkaxt, reason: merged with bridge method [inline-methods] */
    public void zynmafqrjb(ppxfxbqfkf intent) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(intent, "intent");
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(intent, ppxfxbqfkf.iobyxmoadg.f110734iobyxmoadg)) {
            crxdokpmqz(new wkgbmnqykc.iobyxmoadg(false));
            return;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(intent, ppxfxbqfkf.C2728ppxfxbqfkf.f110735iobyxmoadg)) {
            jztzpxfvev();
        } else if (intent instanceof ppxfxbqfkf.zoijcleaow) {
            ulzqkzuiru(new eablkybsjg.zoijcleaow(((ppxfxbqfkf.zoijcleaow) intent).iobyxmoadg()));
        } else {
            if (!(intent instanceof ppxfxbqfkf.wkgbmnqykc)) {
                throw new NoWhenBranchMatchedException();
            }
            ulzqkzuiru(new eablkybsjg.ppxfxbqfkf(((ppxfxbqfkf.wkgbmnqykc) intent).iobyxmoadg()));
        }
    }
}
