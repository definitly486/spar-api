package pk;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public abstract class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f76856iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private ppxfxbqfkf f76857ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private long f76858wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final boolean f76859zoijcleaow;

    public iobyxmoadg(String name, boolean z13) {
        zdlpuopuiu.btonecajqb(name, "name");
        this.f76856iobyxmoadg = name;
        this.f76859zoijcleaow = z13;
        this.f76858wkgbmnqykc = -1L;
    }

    public final void eablkybsjg(ppxfxbqfkf queue) {
        zdlpuopuiu.btonecajqb(queue, "queue");
        ppxfxbqfkf ppxfxbqfkfVar = this.f76857ppxfxbqfkf;
        if (ppxfxbqfkfVar == queue) {
            return;
        }
        if (ppxfxbqfkfVar != null) {
            throw new IllegalStateException("task is in multiple queues");
        }
        this.f76857ppxfxbqfkf = queue;
    }

    public abstract long gxszxtbevo();

    public final boolean iobyxmoadg() {
        return this.f76859zoijcleaow;
    }

    public final void lqeggnwhkg(long j13) {
        this.f76858wkgbmnqykc = j13;
    }

    public final long ppxfxbqfkf() {
        return this.f76858wkgbmnqykc;
    }

    public String toString() {
        return this.f76856iobyxmoadg;
    }

    public final ppxfxbqfkf wkgbmnqykc() {
        return this.f76857ppxfxbqfkf;
    }

    public final String zoijcleaow() {
        return this.f76856iobyxmoadg;
    }

    public /* synthetic */ iobyxmoadg(String str, boolean z13, int i13, gtknphoqwx gtknphoqwxVar) {
        this(str, (i13 & 2) != 0 ? true : z13);
    }
}
