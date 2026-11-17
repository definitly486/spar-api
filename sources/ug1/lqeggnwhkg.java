package ug1;

import gg.kcexrzcfyt;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import java.io.IOException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import pj.cllcsxoeiz;
import pj.gtknphoqwx;
import ru.myspar.proloyalty.payment.api.model.PaymentType;
import ru.myspar.proloyalty.payment.impl.methods.domain.store.State;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes6.dex */
public final class lqeggnwhkg extends e8.iobyxmoadg {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final /* synthetic */ pw0.ppxfxbqfkf f113547ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final wu0.eablkybsjg f113548wkgbmnqykc;

    static final class iobyxmoadg extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ State f113549jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f113551zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        iobyxmoadg(State state, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f113549jyumaefscl = state;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return lqeggnwhkg.this.new iobyxmoadg(this.f113549jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objWkgbmnqykc;
            yu0.wkgbmnqykc c3230wkgbmnqykc;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f113551zdlpuopuiu;
            try {
                if (i13 == 0) {
                    zdlpuopuiu.zoijcleaow(obj);
                    lqeggnwhkg.this.ulzqkzuiru(new eablkybsjg.iobyxmoadg(true));
                    PaymentType type = this.f113549jyumaefscl.getType();
                    if (type instanceof PaymentType.Cart) {
                        c3230wkgbmnqykc = new yu0.wkgbmnqykc.iobyxmoadg(this.f113549jyumaefscl.getSelectedMethod().getCode(), this.f113549jyumaefscl.getNominal().draadjrbmk());
                    } else if (type instanceof PaymentType.Edit) {
                        c3230wkgbmnqykc = new yu0.wkgbmnqykc.zoijcleaow(((PaymentType.Edit) this.f113549jyumaefscl.getType()).getId(), this.f113549jyumaefscl.getSelectedMethod().getCode(), this.f113549jyumaefscl.getNominal().draadjrbmk());
                    } else if (type instanceof PaymentType.Order) {
                        c3230wkgbmnqykc = new yu0.wkgbmnqykc.ppxfxbqfkf(((PaymentType.Order) this.f113549jyumaefscl.getType()).getId(), this.f113549jyumaefscl.getSelectedMethod().getCode(), this.f113549jyumaefscl.getNominal().draadjrbmk());
                    } else if (type instanceof PaymentType.Subscription) {
                        c3230wkgbmnqykc = new yu0.wkgbmnqykc.C3230wkgbmnqykc(((PaymentType.Subscription) this.f113549jyumaefscl.getType()).getId(), ((PaymentType.Subscription) this.f113549jyumaefscl.getType()).getPromoCode(), this.f113549jyumaefscl.getSelectedMethod().getCode());
                    } else {
                        if (!(type instanceof PaymentType.ScanGo)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        c3230wkgbmnqykc = null;
                    }
                    if (c3230wkgbmnqykc != null) {
                        lqeggnwhkg lqeggnwhkgVar = lqeggnwhkg.this;
                        kcexrzcfyt.iobyxmoadg iobyxmoadgVar = kcexrzcfyt.f37117yggfygwlhe;
                        wu0.eablkybsjg eablkybsjgVar = lqeggnwhkgVar.f113548wkgbmnqykc;
                        this.f113551zdlpuopuiu = 1;
                        obj = eablkybsjgVar.iobyxmoadg(c3230wkgbmnqykc, this);
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
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc((yu0.eablkybsjg) obj);
            } catch (Throwable th2) {
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th2));
            }
            lqeggnwhkg lqeggnwhkgVar2 = lqeggnwhkg.this;
            if (kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
                lqeggnwhkgVar2.metgxyhuhe((yu0.eablkybsjg) objWkgbmnqykc);
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
    public lqeggnwhkg(dr0.iobyxmoadg dispatchersProvider, wu0.eablkybsjg paymentInteractor) {
        super(dispatchersProvider.iobyxmoadg());
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(paymentInteractor, "paymentInteractor");
        this.f113547ppxfxbqfkf = new pw0.ppxfxbqfkf();
        this.f113548wkgbmnqykc = paymentInteractor;
    }

    private final void jztzpxfvev() {
        State state = (State) jlmebxxoox();
        if (state.getSelectedMethod() == null) {
            return;
        }
        gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new iobyxmoadg(state, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void metgxyhuhe(yu0.eablkybsjg eablkybsjgVar) {
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
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(intent, ppxfxbqfkf.iobyxmoadg.f113552iobyxmoadg)) {
            crxdokpmqz(new wkgbmnqykc.iobyxmoadg(false));
            return;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(intent, ppxfxbqfkf.C2815ppxfxbqfkf.f113553iobyxmoadg)) {
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
