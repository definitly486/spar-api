package kk;

import java.util.List;
import spay.sdk.R;
import spay.sdk.domain.model.response.OrderScreenDataResponse;
import spay.sdk.domain.model.response.listOfCards.ListOfCardsResponseBody;

/* JADX INFO: loaded from: classes3.dex */
public final class yf0 extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public final /* synthetic */ jlmebxxoox f59437jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public final /* synthetic */ dvvnrvtcbc f59438yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public /* synthetic */ Object f59439zdlpuopuiu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yf0(dvvnrvtcbc dvvnrvtcbcVar, jlmebxxoox jlmebxxooxVar, lg.gxszxtbevo gxszxtbevoVar) {
        super(2, gxszxtbevoVar);
        this.f59438yggfygwlhe = dvvnrvtcbcVar;
        this.f59437jyumaefscl = jlmebxxooxVar;
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        yf0 yf0Var = new yf0(this.f59438yggfygwlhe, this.f59437jyumaefscl, gxszxtbevoVar);
        yf0Var.f59439zdlpuopuiu = obj;
        return yf0Var;
    }

    @Override // tg.rgvfuqvkyq
    public final Object invoke(Object obj, Object obj2) {
        return ((yf0) create((ln) obj, (lg.gxszxtbevo) obj2)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0066  */
    /* JADX WARN: Code duplicated, block: B:41:0x007c  */
    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final Object invokeSuspend(Object obj) {
        int i13;
        hl hlVar;
        ListOfCardsResponseBody listOfCardsResponseBody;
        ListOfCardsResponseBody.PaymentToolInfo paymentToolInfo;
        mg.zoijcleaow.gxszxtbevo();
        gg.zdlpuopuiu.zoijcleaow(obj);
        ln lnVar = (ln) this.f59439zdlpuopuiu;
        if (!lnVar.f57486ppxfxbqfkf) {
            i13 = R.drawable.spay_bg_sdk_successful;
        } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f59438yggfygwlhe.ojitshcjhn(), kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(false))) {
            hl hlVar2 = lnVar.f57485iobyxmoadg;
            if ((hlVar2 instanceof g60) || (hlVar2 instanceof d50) || (hlVar2 instanceof vg0) || (hlVar2 instanceof ay) || (hlVar2 instanceof j3)) {
                i13 = R.drawable.spay_bg_sdk_error;
            } else if (hlVar2 instanceof le0) {
                OrderScreenDataResponse orderScreenDataResponse = (OrderScreenDataResponse) ((auzgnhcxok) this.f59437jyumaefscl).f55843btonecajqb.getValue();
                List<ListOfCardsResponseBody.PaymentToolInfo.Tool> toolList = (orderScreenDataResponse == null || (listOfCardsResponseBody = orderScreenDataResponse.getListOfCardsResponseBody()) == null || (paymentToolInfo = listOfCardsResponseBody.getPaymentToolInfo()) == null) ? null : paymentToolInfo.getToolList();
                if (toolList == null || toolList.isEmpty()) {
                    i13 = R.drawable.spay_bg_sdk_error;
                } else {
                    hlVar = lnVar.f57485iobyxmoadg;
                    if (hlVar instanceof o4) {
                        i13 = R.drawable.spay_bg_sdk_error;
                    } else {
                        i13 = R.drawable.spay_bg_sdk_error;
                    }
                }
            } else {
                hlVar = lnVar.f57485iobyxmoadg;
                if ((hlVar instanceof o4) || (hlVar instanceof t6) || (hlVar instanceof lu) || (hlVar instanceof j70)) {
                    i13 = R.drawable.spay_bg_sdk_error;
                } else {
                    i13 = R.drawable.spay_bg_sdk_successful;
                }
            }
        } else {
            i13 = R.drawable.spay_bg_sdk_error;
        }
        return kotlin.coroutines.jvm.internal.zoijcleaow.wkgbmnqykc(i13);
    }
}
