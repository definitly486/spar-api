package ug1;

import hg.jyumaefscl;
import j0.l;
import java.util.List;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import p0.tzroggbefp;
import q11.dxjokdxxww;
import ru.myspar.proloyalty.components.payment.api.models.PaymentModel;
import ru.myspar.proloyalty.payment.api.model.PaymentMethodsArgs;
import ru.myspar.proloyalty.payment.api.model.PaymentType;
import ru.myspar.proloyalty.payment.impl.methods.domain.store.State;

/* JADX INFO: loaded from: classes6.dex */
public final class gxszxtbevo extends or0.zoijcleaow {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final a8.lqeggnwhkg f113545ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final lqeggnwhkg f113546wkgbmnqykc;

    public gxszxtbevo(a8.lqeggnwhkg storeFactory, lqeggnwhkg executor) {
        zdlpuopuiu.btonecajqb(storeFactory, "storeFactory");
        zdlpuopuiu.btonecajqb(executor, "executor");
        this.f113545ppxfxbqfkf = storeFactory;
        this.f113546wkgbmnqykc = executor;
    }

    @Override // or0.zoijcleaow
    /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
    public a8.eablkybsjg ppxfxbqfkf(State state) {
        zdlpuopuiu.btonecajqb(state, "state");
        return zoijcleaow(this.f113545ppxfxbqfkf, state, new a8.wkgbmnqykc(new zoijcleaow[0]), this.f113546wkgbmnqykc, new iobyxmoadg());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // or0.zoijcleaow
    /* JADX INFO: renamed from: wflxmlrfwp, reason: merged with bridge method [inline-methods] */
    public State btonecajqb() {
        PaymentType type = ((PaymentMethodsArgs) gxszxtbevo()).getType();
        Object obj = null;
        String strWkgbmnqykc = type instanceof PaymentType.Edit ? dxjokdxxww.wkgbmnqykc(((PaymentType.Edit) type).getPaymentCode()) : type instanceof PaymentType.Order ? dxjokdxxww.wkgbmnqykc(((PaymentType.Order) type).getPaymentCode()) : null;
        if (strWkgbmnqykc != null) {
            for (Object obj2 : ((PaymentMethodsArgs) gxszxtbevo()).getMethods()) {
                if (zdlpuopuiu.eablkybsjg(((PaymentModel) obj2).getCode(), strWkgbmnqykc)) {
                    obj = obj2;
                    break;
                }
            }
            obj = (PaymentModel) obj;
        }
        List methods = ((PaymentMethodsArgs) gxszxtbevo()).getMethods();
        Double price = ((PaymentMethodsArgs) gxszxtbevo()).getPrice();
        boolean isPaymentBonuses = ((PaymentMethodsArgs) gxszxtbevo()).getIsPaymentBonuses();
        PaymentModel paymentModel = obj == null ? (PaymentModel) jyumaefscl.weqkydbzbr(((PaymentMethodsArgs) gxszxtbevo()).getMethods()) : obj;
        String change = ((PaymentMethodsArgs) gxszxtbevo()).getChange();
        if (change == null) {
            change = "";
        }
        return new State(false, price, type, methods, isPaymentBonuses, paymentModel, new tzroggbefp(change, 0L, (l) null, 6, (gtknphoqwx) null));
    }
}
