package kk;

import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public abstract class o7 extends androidx.recyclerview.widget.oxmwwwfdhm {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final kotlin.jvm.internal.jyumaefscl f57899ppxfxbqfkf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o7(tg.draadjrbmk draadjrbmkVar, og diffUtilCallback) {
        super(diffUtilCallback);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(diffUtilCallback, "diffUtilCallback");
        this.f57899ppxfxbqfkf = (kotlin.jvm.internal.jyumaefscl) draadjrbmkVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.jvm.internal.jyumaefscl, tg.draadjrbmk] */
    public static final void gxszxtbevo(o7 this$0, Object item, View view) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(this$0, "this$0");
        ?? r13 = this$0.f57899ppxfxbqfkf;
        if (r13 != 0) {
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(item, "item");
            r13.invoke(item);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.nufgyqmvbu
    /* JADX INFO: renamed from: lqeggnwhkg, reason: merged with bridge method [inline-methods] */
    public final void onBindViewHolder(en holder, int i13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(holder, "holder");
        final Object item = ppxfxbqfkf(i13);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(item, "item");
        holder.zoijcleaow(item);
        holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: kk.d7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                o7.gxszxtbevo(this.f56234zdlpuopuiu, item, view);
            }
        });
    }
}
