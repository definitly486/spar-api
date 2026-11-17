package kk;

import android.content.Context;
import androidx.appcompat.widget.AppCompatTextView;
import spay.sdk.R;

/* JADX INFO: loaded from: classes3.dex */
public final class tb implements sj.nufgyqmvbu {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final /* synthetic */ j40 f58643zdlpuopuiu;

    public tb(j40 j40Var) {
        this.f58643zdlpuopuiu = j40Var;
    }

    @Override // sj.nufgyqmvbu
    public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        jh0 jh0Var = (jh0) obj;
        AppCompatTextView spaySlobActvTotal = this.f58643zdlpuopuiu.f57143gtknphoqwx;
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(spaySlobActvTotal, "spaySlobActvTotal");
        long j13 = jh0Var.f57195iobyxmoadg;
        int i13 = R.string.spay_currency_pattern;
        String str = jh0Var.f57196zoijcleaow;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(spaySlobActvTotal, "<this>");
        Context context = spaySlobActvTotal.getContext();
        String strZoijcleaow = qa0.zoijcleaow(j13);
        if (str == null) {
            str = "";
        }
        spaySlobActvTotal.setText(context.getString(i13, strZoijcleaow, str));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}
