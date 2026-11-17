package sg1;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.jyumaefscl;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.payment.api.model.PaymentMethodsArgs;
import ru.myspar.proloyalty.payment.api.model.PaymentWebArgs;
import ru.myspar.proloyalty.payment.impl.methods.presentation.PaymentMethodsFragment;
import ru.myspar.proloyalty.payment.impl.web.presentation.PaymentFlowParams;
import ru.myspar.proloyalty.payment.impl.web.presentation.PaymentFragment;

/* JADX INFO: loaded from: classes6.dex */
public final class wkgbmnqykc implements rg1.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final c11.lqeggnwhkg f106499iobyxmoadg;

    public wkgbmnqykc(c11.lqeggnwhkg getPayByCardUrlUseCase) {
        zdlpuopuiu.btonecajqb(getPayByCardUrlUseCase, "getPayByCardUrlUseCase");
        this.f106499iobyxmoadg = getPayByCardUrlUseCase;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Fragment dxjokdxxww(PaymentMethodsArgs paymentMethodsArgs, jyumaefscl it) {
        zdlpuopuiu.btonecajqb(it, "it");
        return PaymentMethodsFragment.INSTANCE.iobyxmoadg(paymentMethodsArgs);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Fragment lqeggnwhkg(PaymentWebArgs paymentWebArgs, wkgbmnqykc wkgbmnqykcVar, jyumaefscl it) {
        zdlpuopuiu.btonecajqb(it, "it");
        return PaymentFragment.INSTANCE.iobyxmoadg(new PaymentFlowParams.OrderPaymentParams(paymentWebArgs, (String) wkgbmnqykcVar.f106499iobyxmoadg.zoijcleaow(new c11.lqeggnwhkg.iobyxmoadg(paymentWebArgs.getOrderId()))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Fragment nufgyqmvbu(String str, jyumaefscl it) {
        zdlpuopuiu.btonecajqb(it, "it");
        return PaymentFragment.INSTANCE.iobyxmoadg(new PaymentFlowParams.TipsPaymentParams(str));
    }

    @Override // rg1.iobyxmoadg
    public m9.wkgbmnqykc iobyxmoadg(final String url) {
        zdlpuopuiu.btonecajqb(url, "url");
        return m9.wkgbmnqykc.iobyxmoadg.zoijcleaow(m9.wkgbmnqykc.f66572zoijcleaow, null, false, new m9.ppxfxbqfkf() { // from class: sg1.zoijcleaow
            @Override // m9.ppxfxbqfkf
            public final Object iobyxmoadg(Object obj) {
                return wkgbmnqykc.nufgyqmvbu(url, (jyumaefscl) obj);
            }
        }, 3, null);
    }

    @Override // rg1.iobyxmoadg
    public m9.wkgbmnqykc ppxfxbqfkf(final PaymentWebArgs args) {
        zdlpuopuiu.btonecajqb(args, "args");
        return m9.wkgbmnqykc.iobyxmoadg.zoijcleaow(m9.wkgbmnqykc.f66572zoijcleaow, null, false, new m9.ppxfxbqfkf() { // from class: sg1.ppxfxbqfkf
            @Override // m9.ppxfxbqfkf
            public final Object iobyxmoadg(Object obj) {
                return wkgbmnqykc.lqeggnwhkg(args, this, (jyumaefscl) obj);
            }
        }, 3, null);
    }

    @Override // rg1.iobyxmoadg
    public m9.wkgbmnqykc zoijcleaow(final PaymentMethodsArgs args) {
        zdlpuopuiu.btonecajqb(args, "args");
        return m9.wkgbmnqykc.iobyxmoadg.zoijcleaow(m9.wkgbmnqykc.f66572zoijcleaow, null, false, new m9.ppxfxbqfkf() { // from class: sg1.iobyxmoadg
            @Override // m9.ppxfxbqfkf
            public final Object iobyxmoadg(Object obj) {
                return wkgbmnqykc.dxjokdxxww(args, (jyumaefscl) obj);
            }
        }, 3, null);
    }
}
