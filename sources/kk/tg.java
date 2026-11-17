package kk;

import android.content.Context;
import androidx.appcompat.widget.AppCompatTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class tg extends ba0 {
    public tg() {
        super(of.f57940zdlpuopuiu);
    }

    @Override // kk.ba0
    public final Integer iobyxmoadg(Object obj) {
        qe qeVar = (qe) obj;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(qeVar, "<this>");
        return Integer.valueOf(qeVar.hashCode());
    }

    @Override // kk.ba0
    public final boolean ppxfxbqfkf(Object item) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(item, "item");
        return item instanceof qe;
    }

    @Override // kk.ba0
    public final void zoijcleaow(a6.iobyxmoadg iobyxmoadgVar, Object obj) {
        String strIobyxmoadg;
        w4 w4Var = (w4) iobyxmoadgVar;
        qe item = (qe) obj;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(w4Var, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(item, "item");
        AppCompatTextView appCompatTextView = w4Var.f59089zoijcleaow;
        vu vuVar = item.f58180iobyxmoadg;
        Context context = w4Var.f59087iobyxmoadg.getContext();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(context, "root.context");
        appCompatTextView.setText(zv.iobyxmoadg(vuVar, context));
        AppCompatTextView spaySloTvOldAmount = w4Var.f59088ppxfxbqfkf;
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(spaySloTvOldAmount, "spaySloTvOldAmount");
        vu vuVar2 = item.f58181ppxfxbqfkf;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(spaySloTvOldAmount, "<this>");
        if (vuVar2 != null) {
            Context context2 = spaySloTvOldAmount.getContext();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(context2, "context");
            strIobyxmoadg = zv.iobyxmoadg(vuVar2, context2);
        } else {
            strIobyxmoadg = null;
        }
        spaySloTvOldAmount.setVisibility(strIobyxmoadg != null ? 0 : 8);
        spaySloTvOldAmount.setText(strIobyxmoadg);
        spaySloTvOldAmount.setPaintFlags(16);
    }
}
