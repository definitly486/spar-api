package kk;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class gp extends RecyclerView.nufgyqmvbu {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public qq f56728iobyxmoadg;

    public gp(ba0... adapters) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(adapters, "adapters");
        this.f56728iobyxmoadg = new qq(hg.agtfadlqog.i(adapters), hg.jyumaefscl.wflxmlrfwp());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.nufgyqmvbu
    public final int getItemCount() {
        return this.f56728iobyxmoadg.f58227zoijcleaow.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.nufgyqmvbu
    public final int getItemViewType(int i13) {
        return this.f56728iobyxmoadg.iobyxmoadg(i13);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.nufgyqmvbu
    public final void onBindViewHolder(RecyclerView.iozdgvuglv holder, int i13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(holder, "holder");
        qq qqVar = this.f56728iobyxmoadg;
        ba0 ba0Var = (ba0) qqVar.f58225iobyxmoadg.get(qqVar.iobyxmoadg(i13));
        List items = this.f56728iobyxmoadg.f58227zoijcleaow;
        ba0Var.getClass();
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(holder, "holder");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(items, "items");
        a6.iobyxmoadg iobyxmoadgVar = ((x80) holder).f59273iobyxmoadg;
        Object obj = items.get(i13);
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(obj, "null cannot be cast to non-null type T of spay.sdk.presentation.base.ViewBindingDelegateAdapter");
        ba0Var.zoijcleaow(iobyxmoadgVar, obj);
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [kotlin.jvm.internal.vdvldrhtss, tg.vdvldrhtss] */
    @Override // androidx.recyclerview.widget.RecyclerView.nufgyqmvbu
    public final RecyclerView.iozdgvuglv onCreateViewHolder(ViewGroup parent, int i13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(parent, "parent");
        ba0 ba0Var = (ba0) this.f56728iobyxmoadg.f58225iobyxmoadg.get(i13);
        ba0Var.getClass();
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(parent, "parent");
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        ?? r13 = ba0Var.f55962iobyxmoadg;
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(layoutInflater, "layoutInflater");
        a6.iobyxmoadg iobyxmoadgVar = (a6.iobyxmoadg) r13.invoke(layoutInflater, parent, Boolean.FALSE);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(iobyxmoadgVar, "<this>");
        return new x80(iobyxmoadgVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.nufgyqmvbu
    public final void onViewAttachedToWindow(RecyclerView.iozdgvuglv holder) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(holder, "holder");
        qq qqVar = this.f56728iobyxmoadg;
        ((ba0) qqVar.f58225iobyxmoadg.get(holder.getItemViewType())).getClass();
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(holder, "holder");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(((x80) holder).f59273iobyxmoadg, "<this>");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.nufgyqmvbu
    public final void onViewDetachedFromWindow(RecyclerView.iozdgvuglv holder) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(holder, "holder");
        qq qqVar = this.f56728iobyxmoadg;
        ((ba0) qqVar.f58225iobyxmoadg.get(holder.getItemViewType())).getClass();
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(holder, "holder");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(((x80) holder).f59273iobyxmoadg, "<this>");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.nufgyqmvbu
    public final void onViewRecycled(RecyclerView.iozdgvuglv holder) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(holder, "holder");
        qq qqVar = this.f56728iobyxmoadg;
        ((ba0) qqVar.f58225iobyxmoadg.get(holder.getItemViewType())).getClass();
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(holder, "holder");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(((x80) holder).f59273iobyxmoadg, "<this>");
    }

    public final void ppxfxbqfkf(List data) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(data, "data");
        List adapters = this.f56728iobyxmoadg.f58225iobyxmoadg;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(adapters, "adapters");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(data, "data");
        qq qqVar = new qq(adapters, data);
        androidx.recyclerview.widget.nufgyqmvbu.eablkybsjg eablkybsjgVarZoijcleaow = androidx.recyclerview.widget.nufgyqmvbu.zoijcleaow(new d5(this.f56728iobyxmoadg, qqVar));
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(eablkybsjgVarZoijcleaow, "calculateDiff(diffCallback)");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(qqVar, "<set-?>");
        this.f56728iobyxmoadg = qqVar;
        eablkybsjgVarZoijcleaow.ppxfxbqfkf(this);
    }
}
