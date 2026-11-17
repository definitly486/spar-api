package kk;

import java.util.ArrayList;
import java.util.List;
import spay.sdk.R;
import spay.sdk.domain.model.response.PaymentPlanBnplResponseBody;
import spay.sdk.domain.model.response.bnpl.BnplPayment;
import spay.sdk.domain.model.response.bnpl.GraphBnpl;

/* JADX INFO: loaded from: classes3.dex */
public final class s2 extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public /* synthetic */ Object f58494zdlpuopuiu;

    public s2(lg.gxszxtbevo gxszxtbevoVar) {
        super(2, gxszxtbevoVar);
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        s2 s2Var = new s2(gxszxtbevoVar);
        s2Var.f58494zdlpuopuiu = obj;
        return s2Var;
    }

    @Override // tg.rgvfuqvkyq
    public final Object invoke(Object obj, Object obj2) {
        s2 s2Var = new s2((lg.gxszxtbevo) obj2);
        s2Var.f58494zdlpuopuiu = (PaymentPlanBnplResponseBody) obj;
        return s2Var.invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final Object invokeSuspend(Object obj) {
        GraphBnpl graphBnpl;
        List<BnplPayment> payments;
        vu vuVarIobyxmoadg;
        mg.zoijcleaow.gxszxtbevo();
        gg.zdlpuopuiu.zoijcleaow(obj);
        PaymentPlanBnplResponseBody paymentPlanBnplResponseBody = (PaymentPlanBnplResponseBody) this.f58494zdlpuopuiu;
        if (paymentPlanBnplResponseBody == null || (graphBnpl = paymentPlanBnplResponseBody.getGraphBnpl()) == null || (payments = graphBnpl.getPayments()) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(payments, 10));
        int i13 = 0;
        for (Object obj2 : payments) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                hg.jyumaefscl.iwizpuwonk();
            }
            BnplPayment bnplPayment = (BnplPayment) obj2;
            if (i13 == 0) {
                vuVarIobyxmoadg = zv.zoijcleaow(R.string.spay_bnpl_graph_first_item_write_off);
            } else {
                String date = bnplPayment.getDate();
                vuVarIobyxmoadg = me.iobyxmoadg(date, "text", date);
            }
            arrayList.add(new eg0(vuVarIobyxmoadg, bnplPayment.getAmount(), bnplPayment.getCurrencyCode(), i13 == 0, i13 == paymentPlanBnplResponseBody.getGraphBnpl().getPayments().size() - 1));
            i13 = i14;
        }
        return arrayList;
    }
}
