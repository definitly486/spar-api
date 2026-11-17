package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class hg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final Object f56912iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public boolean f56913zoijcleaow;

    public hg(Object obj) {
        this.f56912iobyxmoadg = obj;
    }

    public final void iobyxmoadg(tg.draadjrbmk block) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(block, "block");
        if (this.f56913zoijcleaow) {
            return;
        }
        this.f56913zoijcleaow = true;
        block.invoke(this.f56912iobyxmoadg);
    }

    public final String toString() {
        return "Event(content=" + this.f56912iobyxmoadg + ", hasBeenHandled=" + this.f56913zoijcleaow + ")";
    }
}
