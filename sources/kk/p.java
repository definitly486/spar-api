package kk;

import android.content.Context;
import androidx.appcompat.widget.AppCompatTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class p extends ba0 {
    public p() {
        super(ageimvtcrz.f55815zdlpuopuiu);
    }

    @Override // kk.ba0
    public final Integer iobyxmoadg(Object obj) {
        wt wtVar = (wt) obj;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(wtVar, "<this>");
        return Integer.valueOf(wtVar.f59195iobyxmoadg.hashCode());
    }

    @Override // kk.ba0
    public final boolean ppxfxbqfkf(Object item) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(item, "item");
        return item instanceof wt;
    }

    @Override // kk.ba0
    public final void zoijcleaow(a6.iobyxmoadg iobyxmoadgVar, Object obj) {
        o1 o1Var = (o1) iobyxmoadgVar;
        wt item = (wt) obj;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(o1Var, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(item, "item");
        Context context = o1Var.f57877ppxfxbqfkf.getContext();
        AppCompatTextView appCompatTextView = o1Var.f57878zoijcleaow;
        ms msVar = item.f59195iobyxmoadg;
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(context, "context");
        appCompatTextView.setText(zv.iobyxmoadg(msVar, context));
    }
}
