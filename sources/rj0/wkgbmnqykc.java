package rj0;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.jyumaefscl;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.payment.api.model.PaymentMethodsArgs;
import ru.myspar.payment.api.model.PaymentWebArgs;
import ru.myspar.payment.impl.methods.presentation.PaymentMethodsFragment;
import ru.myspar.payment.impl.web.presentation.PaymentFlowParams;
import ru.myspar.payment.impl.web.presentation.PaymentFragment;

/* JADX INFO: loaded from: classes3.dex */
public final class wkgbmnqykc implements qj0.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final x20.lqeggnwhkg f82935iobyxmoadg;

    public wkgbmnqykc(x20.lqeggnwhkg getPayByCardUrlUseCase) {
        zdlpuopuiu.btonecajqb(getPayByCardUrlUseCase, "getPayByCardUrlUseCase");
        this.f82935iobyxmoadg = getPayByCardUrlUseCase;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Fragment dxjokdxxww(PaymentMethodsArgs paymentMethodsArgs, jyumaefscl it) {
        zdlpuopuiu.btonecajqb(it, "it");
        return PaymentMethodsFragment.INSTANCE.iobyxmoadg(paymentMethodsArgs);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Fragment lqeggnwhkg(PaymentWebArgs paymentWebArgs, wkgbmnqykc wkgbmnqykcVar, jyumaefscl it) {
        zdlpuopuiu.btonecajqb(it, "it");
        return PaymentFragment.INSTANCE.iobyxmoadg(new PaymentFlowParams.OrderPaymentParams(paymentWebArgs, (String) wkgbmnqykcVar.f82935iobyxmoadg.zoijcleaow(new x20.lqeggnwhkg.iobyxmoadg(paymentWebArgs.getOrderId()))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Fragment nufgyqmvbu(String str, jyumaefscl it) {
        zdlpuopuiu.btonecajqb(it, "it");
        return PaymentFragment.INSTANCE.iobyxmoadg(new PaymentFlowParams.TipsPaymentParams(str));
    }

    @Override // qj0.iobyxmoadg
    public m9.wkgbmnqykc iobyxmoadg(final String url) {
        zdlpuopuiu.btonecajqb(url, "url");
        return m9.wkgbmnqykc.iobyxmoadg.zoijcleaow(m9.wkgbmnqykc.f66572zoijcleaow, null, false, new m9.ppxfxbqfkf() { // from class: rj0.zoijcleaow
            @Override // m9.ppxfxbqfkf
            public final Object iobyxmoadg(Object obj) {
                return wkgbmnqykc.nufgyqmvbu(url, (jyumaefscl) obj);
            }
        }, 3, null);
    }

    @Override // qj0.iobyxmoadg
    public m9.wkgbmnqykc ppxfxbqfkf(final PaymentMethodsArgs args) {
        zdlpuopuiu.btonecajqb(args, "args");
        return m9.wkgbmnqykc.iobyxmoadg.zoijcleaow(m9.wkgbmnqykc.f66572zoijcleaow, null, false, new m9.ppxfxbqfkf() { // from class: rj0.iobyxmoadg
            @Override // m9.ppxfxbqfkf
            public final Object iobyxmoadg(Object obj) {
                return wkgbmnqykc.dxjokdxxww(args, (jyumaefscl) obj);
            }
        }, 3, null);
    }

    @Override // qj0.iobyxmoadg
    public m9.wkgbmnqykc zoijcleaow(final PaymentWebArgs args) {
        zdlpuopuiu.btonecajqb(args, "args");
        return m9.wkgbmnqykc.iobyxmoadg.zoijcleaow(m9.wkgbmnqykc.f66572zoijcleaow, null, false, new m9.ppxfxbqfkf() { // from class: rj0.ppxfxbqfkf
            @Override // m9.ppxfxbqfkf
            public final Object iobyxmoadg(Object obj) {
                return wkgbmnqykc.lqeggnwhkg(args, this, (jyumaefscl) obj);
            }
        }, 3, null);
    }
}
