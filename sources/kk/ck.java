package kk;

import android.content.Context;
import androidx.appcompat.widget.AppCompatTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class ck extends ba0 {
    public ck() {
        super(zi.f59588zdlpuopuiu);
    }

    @Override // kk.ba0
    public final Integer iobyxmoadg(Object obj) {
        ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(ppxfxbqfkfVar, "<this>");
        return Integer.valueOf(ppxfxbqfkfVar.hashCode());
    }

    @Override // kk.ba0
    public final boolean ppxfxbqfkf(Object item) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(item, "item");
        return item instanceof ppxfxbqfkf;
    }

    @Override // kk.ba0
    public final void zoijcleaow(a6.iobyxmoadg iobyxmoadgVar, Object obj) {
        j jVar = (j) iobyxmoadgVar;
        ppxfxbqfkf item = (ppxfxbqfkf) obj;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(jVar, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(item, "item");
        Context context = jVar.f57115iobyxmoadg.getContext();
        AppCompatTextView appCompatTextView = jVar.f57117zoijcleaow;
        ms msVar = item.f58110iobyxmoadg;
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(context, "context");
        appCompatTextView.setText(zv.iobyxmoadg(msVar, context));
        jVar.f57116ppxfxbqfkf.setText(zv.iobyxmoadg(item.f58111zoijcleaow, context));
    }
}
