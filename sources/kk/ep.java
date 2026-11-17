package kk;

import android.content.Context;
import androidx.appcompat.widget.AppCompatTextView;
import npi.spay.Ln;
import spay.sdk.R;

/* JADX INFO: loaded from: classes3.dex */
public final class ep implements sj.nufgyqmvbu {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final /* synthetic */ npi.spay.i2 f56446zdlpuopuiu;

    public ep(npi.spay.i2 i2Var) {
        this.f56446zdlpuopuiu = i2Var;
    }

    @Override // sj.nufgyqmvbu
    public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        int iIntValue = ((Number) obj).intValue();
        npi.spay.i2 i2Var = this.f56446zdlpuopuiu;
        int i13 = npi.spay.i2.f70574iwizpuwonk;
        if (iIntValue != 0) {
            a6.iobyxmoadg iobyxmoadgVar = i2Var.f70570yggfygwlhe;
            if (iobyxmoadgVar == null) {
                throw Ln.f70555zdlpuopuiu;
            }
            AppCompatTextView handleCommissionState$lambda$16 = ((j40) iobyxmoadgVar).f57149wkgbmnqykc;
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(handleCommissionState$lambda$16, "handleCommissionState$lambda$16");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(handleCommissionState$lambda$16, "<this>");
            handleCommissionState$lambda$16.setVisibility(0);
            int i14 = R.string.spay_bnpl_commission_message;
            Object[] args = {Integer.valueOf(iIntValue / 100)};
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(args, "args");
            ms msVar = new ms(i14, hg.agtfadlqog.i(args));
            Context contextRequireContext = i2Var.requireContext();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(contextRequireContext, "this@BnplPartsOrderFragment.requireContext()");
            handleCommissionState$lambda$16.setText(zv.iobyxmoadg(msVar, contextRequireContext));
        } else {
            i2Var.getClass();
        }
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}
