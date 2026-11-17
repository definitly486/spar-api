package kk;

import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import npi.spay.Ln;

/* JADX INFO: loaded from: classes3.dex */
public final class rz implements sj.nufgyqmvbu {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final /* synthetic */ npi.spay.x1 f58486zdlpuopuiu;

    public rz(npi.spay.x1 x1Var) {
        this.f58486zdlpuopuiu = x1Var;
    }

    @Override // sj.nufgyqmvbu
    public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        ro roVar = (ro) obj;
        npi.spay.x1 x1Var = this.f58486zdlpuopuiu;
        int i13 = npi.spay.x1.f70592iwizpuwonk;
        x1Var.getClass();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(roVar.f58458iobyxmoadg);
        int i14 = 0;
        for (Object obj2 : roVar.f58460zoijcleaow) {
            int i15 = i14 + 1;
            if (i14 < 0) {
                hg.jyumaefscl.iwizpuwonk();
            }
            spannableStringBuilder.setSpan(new vd0(x1Var, i14, (String) obj2), ((mn) roVar.f58459ppxfxbqfkf.get(i14)).f57659iobyxmoadg, ((mn) roVar.f58459ppxfxbqfkf.get(i14)).f57660zoijcleaow, 34);
            i14 = i15;
        }
        a6.iobyxmoadg iobyxmoadgVar = x1Var.f70570yggfygwlhe;
        if (iobyxmoadgVar == null) {
            throw Ln.f70555zdlpuopuiu;
        }
        AppCompatTextView appCompatTextView = ((y10) iobyxmoadgVar).f59365eablkybsjg;
        appCompatTextView.setMovementMethod(LinkMovementMethod.getInstance());
        appCompatTextView.setText(spannableStringBuilder, TextView.BufferType.SPANNABLE);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}
