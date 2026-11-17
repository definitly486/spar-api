package kk;

import androidx.appcompat.widget.AppCompatTextView;
import npi.spay.Ln;
import spay.sdk.domain.model.response.PaymentPlanBnplResponseBody;
import spay.sdk.domain.model.response.bnpl.ButtonBnpl;

/* JADX INFO: loaded from: classes3.dex */
public final class dp implements sj.nufgyqmvbu {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final /* synthetic */ npi.spay.x1 f56307zdlpuopuiu;

    public dp(npi.spay.x1 x1Var) {
        this.f56307zdlpuopuiu = x1Var;
    }

    @Override // sj.nufgyqmvbu
    public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        PaymentPlanBnplResponseBody paymentPlanBnplResponseBody = (PaymentPlanBnplResponseBody) obj;
        npi.spay.x1 x1Var = this.f56307zdlpuopuiu;
        int i13 = npi.spay.x1.f70592iwizpuwonk;
        a6.iobyxmoadg iobyxmoadgVar = x1Var.f70570yggfygwlhe;
        if (iobyxmoadgVar == null) {
            throw Ln.f70555zdlpuopuiu;
        }
        AppCompatTextView appCompatTextView = ((y10) iobyxmoadgVar).f59366gxszxtbevo;
        ButtonBnpl buttonBnpl = paymentPlanBnplResponseBody.getButtonBnpl();
        String header = buttonBnpl != null ? buttonBnpl.getHeader() : null;
        if (header == null) {
            header = "";
        }
        appCompatTextView.setText(header);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}
