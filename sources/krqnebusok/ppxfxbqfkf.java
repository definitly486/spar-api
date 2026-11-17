package krqnebusok;

/* JADX INFO: loaded from: classes.dex */
public final class ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final jyumaefscl f60498iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Integer f60499zoijcleaow;

    public ppxfxbqfkf(jyumaefscl jyumaefsclVar, Integer num) {
        this.f60498iobyxmoadg = jyumaefsclVar;
        this.f60499zoijcleaow = num;
    }

    public static /* synthetic */ ppxfxbqfkf zoijcleaow(ppxfxbqfkf ppxfxbqfkfVar, jyumaefscl jyumaefsclVar, Integer num, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            jyumaefsclVar = ppxfxbqfkfVar.f60498iobyxmoadg;
        }
        if ((i13 & 2) != 0) {
            num = ppxfxbqfkfVar.f60499zoijcleaow;
        }
        return ppxfxbqfkfVar.iobyxmoadg(jyumaefsclVar, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ppxfxbqfkf)) {
            return false;
        }
        ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f60498iobyxmoadg, ppxfxbqfkfVar.f60498iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f60499zoijcleaow, ppxfxbqfkfVar.f60499zoijcleaow);
    }

    public int hashCode() {
        int iHashCode = this.f60498iobyxmoadg.hashCode() * 31;
        Integer num = this.f60499zoijcleaow;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final ppxfxbqfkf iobyxmoadg(jyumaefscl jyumaefsclVar, Integer num) {
        return new ppxfxbqfkf(jyumaefsclVar, num);
    }

    public final Integer ppxfxbqfkf() {
        return this.f60499zoijcleaow;
    }

    public String toString() {
        return "ComposeStackTraceFrame(sourceInfo=" + this.f60498iobyxmoadg + ", groupOffset=" + this.f60499zoijcleaow + ')';
    }

    public final jyumaefscl wkgbmnqykc() {
        return this.f60498iobyxmoadg;
    }
}
