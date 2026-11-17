package kk;

import android.content.Context;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class vr extends en {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final kotlin.jvm.internal.jyumaefscl f59056ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final s3 f59057zoijcleaow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public vr(s3 viewBinding, tg.draadjrbmk hintCloseActionListener) {
        super(viewBinding);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(viewBinding, "viewBinding");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(hintCloseActionListener, "hintCloseActionListener");
        this.f59057zoijcleaow = viewBinding;
        this.f59056ppxfxbqfkf = (kotlin.jvm.internal.jyumaefscl) hintCloseActionListener;
    }

    @Override // kk.en
    public final void zoijcleaow(Object obj) {
        np item = (np) obj;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(item, "item");
        s3 s3Var = this.f59057zoijcleaow;
        AppCompatTextView appCompatTextView = s3Var.f58499ppxfxbqfkf;
        vu vuVar = item.f57838zoijcleaow;
        Context context = this.f56444iobyxmoadg.getRoot().getContext();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(context, "itemViewBinding.root.context");
        appCompatTextView.setText(zv.iobyxmoadg(vuVar, context));
        AppCompatImageView spaySrihhAcivDismissHint = s3Var.f58500zoijcleaow;
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(spaySrihhAcivDismissHint, "spaySrihhAcivDismissHint");
        spaySrihhAcivDismissHint.setOnClickListener(new rq(new kotlin.jvm.internal.jpowsppfya(), this, item));
    }
}
