package kk;

import android.content.Context;
import androidx.appcompat.widget.AppCompatTextView;
import npi.spay.Ln;
import spay.sdk.R;

/* JADX INFO: loaded from: classes3.dex */
public final class ps implements sj.nufgyqmvbu {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final /* synthetic */ npi.spay.x1 f58116zdlpuopuiu;

    public ps(npi.spay.x1 x1Var) {
        this.f58116zdlpuopuiu = x1Var;
    }

    @Override // sj.nufgyqmvbu
    public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        jh0 jh0Var = (jh0) obj;
        npi.spay.x1 x1Var = this.f58116zdlpuopuiu;
        int i13 = npi.spay.x1.f70592iwizpuwonk;
        a6.iobyxmoadg iobyxmoadgVar = x1Var.f70570yggfygwlhe;
        if (iobyxmoadgVar == null) {
            throw Ln.f70555zdlpuopuiu;
        }
        AppCompatTextView appCompatTextView = ((y10) iobyxmoadgVar).f59368lqeggnwhkg;
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(appCompatTextView, "binding.spaySlobActvTotal");
        long j13 = jh0Var.f57195iobyxmoadg;
        int i14 = R.string.spay_currency_pattern;
        String str = jh0Var.f57196zoijcleaow;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(appCompatTextView, "<this>");
        Context context = appCompatTextView.getContext();
        String strZoijcleaow = qa0.zoijcleaow(j13);
        if (str == null) {
            str = "";
        }
        appCompatTextView.setText(context.getString(i14, strZoijcleaow, str));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}
