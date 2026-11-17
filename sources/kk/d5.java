package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class d5 extends androidx.recyclerview.widget.nufgyqmvbu.zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final qq f56227iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final qq f56228zoijcleaow;

    public d5(qq oldState, qq newState) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(oldState, "oldState");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(newState, "newState");
        this.f56227iobyxmoadg = oldState;
        this.f56228zoijcleaow = newState;
    }

    @Override // androidx.recyclerview.widget.nufgyqmvbu.zoijcleaow
    public final boolean areContentsTheSame(int i13, int i14) {
        qq qqVar = this.f56227iobyxmoadg;
        ba0 ba0Var = (ba0) qqVar.f58225iobyxmoadg.get(qqVar.iobyxmoadg(i13));
        Object item = qqVar.f58227zoijcleaow.get(i13);
        ba0Var.getClass();
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(item, "item");
        qq qqVar2 = this.f56228zoijcleaow;
        ba0 ba0Var2 = (ba0) qqVar2.f58225iobyxmoadg.get(qqVar2.iobyxmoadg(i14));
        Object item2 = qqVar2.f58227zoijcleaow.get(i14);
        ba0Var2.getClass();
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(item2, "item");
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(item, item2);
    }

    @Override // androidx.recyclerview.widget.nufgyqmvbu.zoijcleaow
    public final boolean areItemsTheSame(int i13, int i14) {
        qq qqVar = this.f56227iobyxmoadg;
        ba0 ba0Var = (ba0) qqVar.f58225iobyxmoadg.get(qqVar.iobyxmoadg(i13));
        Object item = qqVar.f58227zoijcleaow.get(i13);
        ba0Var.getClass();
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(item, "item");
        Integer numIobyxmoadg = ba0Var.iobyxmoadg(item);
        qq qqVar2 = this.f56228zoijcleaow;
        ba0 ba0Var2 = (ba0) qqVar2.f58225iobyxmoadg.get(qqVar2.iobyxmoadg(i14));
        Object item2 = qqVar2.f58227zoijcleaow.get(i14);
        ba0Var2.getClass();
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(item2, "item");
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(numIobyxmoadg, ba0Var2.iobyxmoadg(item2));
    }

    @Override // androidx.recyclerview.widget.nufgyqmvbu.zoijcleaow
    public final int getNewListSize() {
        return this.f56228zoijcleaow.f58227zoijcleaow.size();
    }

    @Override // androidx.recyclerview.widget.nufgyqmvbu.zoijcleaow
    public final int getOldListSize() {
        return this.f56227iobyxmoadg.f58227zoijcleaow.size();
    }
}
