package kk;

import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import npi.spay.Ln;

/* JADX INFO: loaded from: classes3.dex */
public final class ki implements sj.nufgyqmvbu {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final /* synthetic */ npi.spay.i2 f57318zdlpuopuiu;

    public ki(npi.spay.i2 i2Var) {
        this.f57318zdlpuopuiu = i2Var;
    }

    @Override // sj.nufgyqmvbu
    public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        ro roVar = (ro) obj;
        npi.spay.i2 i2Var = this.f57318zdlpuopuiu;
        int i13 = npi.spay.i2.f70574iwizpuwonk;
        i2Var.getClass();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(roVar.f58458iobyxmoadg);
        int i14 = 0;
        for (Object obj2 : roVar.f58460zoijcleaow) {
            int i15 = i14 + 1;
            if (i14 < 0) {
                hg.jyumaefscl.iwizpuwonk();
            }
            spannableStringBuilder.setSpan(new dw(i2Var, i14, (String) obj2), ((mn) roVar.f58459ppxfxbqfkf.get(i14)).f57659iobyxmoadg, ((mn) roVar.f58459ppxfxbqfkf.get(i14)).f57660zoijcleaow, 34);
            i14 = i15;
        }
        a6.iobyxmoadg iobyxmoadgVar = i2Var.f70570yggfygwlhe;
        if (iobyxmoadgVar == null) {
            throw Ln.f70555zdlpuopuiu;
        }
        AppCompatTextView appCompatTextView = ((j40) iobyxmoadgVar).f57141dxjokdxxww;
        appCompatTextView.setMovementMethod(LinkMovementMethod.getInstance());
        appCompatTextView.setText(spannableStringBuilder, TextView.BufferType.SPANNABLE);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}
