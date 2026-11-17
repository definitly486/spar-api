package kk;

import android.content.Context;
import androidx.appcompat.widget.AppCompatTextView;
import npi.spay.Ln;
import spay.sdk.R;

/* JADX INFO: loaded from: classes3.dex */
public final class j30 implements sj.nufgyqmvbu {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final /* synthetic */ npi.spay.x1 f57136zdlpuopuiu;

    public j30(npi.spay.x1 x1Var) {
        this.f57136zdlpuopuiu = x1Var;
    }

    @Override // sj.nufgyqmvbu
    public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        int iIntValue = ((Number) obj).intValue();
        npi.spay.x1 x1Var = this.f57136zdlpuopuiu;
        int i13 = npi.spay.x1.f70592iwizpuwonk;
        if (iIntValue != 0) {
            a6.iobyxmoadg iobyxmoadgVar = x1Var.f70570yggfygwlhe;
            if (iobyxmoadgVar == null) {
                throw Ln.f70555zdlpuopuiu;
            }
            AppCompatTextView handleCommissionState$lambda$9 = ((y10) iobyxmoadgVar).f59372zoijcleaow;
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(handleCommissionState$lambda$9, "handleCommissionState$lambda$9");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(handleCommissionState$lambda$9, "<this>");
            handleCommissionState$lambda$9.setVisibility(0);
            int i14 = R.string.spay_bnpl_commission_message;
            Object[] args = {Integer.valueOf(iIntValue / 100)};
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(args, "args");
            ms msVar = new ms(i14, hg.agtfadlqog.i(args));
            Context contextRequireContext = x1Var.requireContext();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(contextRequireContext, "this@BnplOrderFragment.requireContext()");
            handleCommissionState$lambda$9.setText(zv.iobyxmoadg(msVar, contextRequireContext));
        } else {
            x1Var.getClass();
        }
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}
