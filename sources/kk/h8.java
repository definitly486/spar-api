package kk;

import androidx.appcompat.widget.AppCompatTextView;
import spay.sdk.domain.model.response.PaymentPlanBnplResponseBody;
import spay.sdk.domain.model.response.bnpl.GraphBnpl;

/* JADX INFO: loaded from: classes3.dex */
public final class h8 implements sj.nufgyqmvbu {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final /* synthetic */ j40 f56848zdlpuopuiu;

    public h8(j40 j40Var) {
        this.f56848zdlpuopuiu = j40Var;
    }

    @Override // sj.nufgyqmvbu
    public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        AppCompatTextView appCompatTextView = this.f56848zdlpuopuiu.f57139btonecajqb;
        GraphBnpl graphBnpl = ((PaymentPlanBnplResponseBody) obj).getGraphBnpl();
        String header = graphBnpl != null ? graphBnpl.getHeader() : null;
        if (header == null) {
            header = "";
        }
        appCompatTextView.setText(header);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}
