package mb2;

import java.util.Map;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f66775iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final long f66776ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Map f66777zoijcleaow;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ppxfxbqfkf(String eventName, Map eventData) {
        this(eventName, eventData, System.currentTimeMillis());
        zdlpuopuiu.btonecajqb(eventName, "eventName");
        zdlpuopuiu.btonecajqb(eventData, "eventData");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ppxfxbqfkf)) {
            return false;
        }
        ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
        return zdlpuopuiu.eablkybsjg(this.f66775iobyxmoadg, ppxfxbqfkfVar.f66775iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f66777zoijcleaow, ppxfxbqfkfVar.f66777zoijcleaow);
    }

    public int hashCode() {
        return this.f66777zoijcleaow.hashCode() + (this.f66775iobyxmoadg.hashCode() * 31);
    }

    public final Map iobyxmoadg() {
        return this.f66777zoijcleaow;
    }

    public final long ppxfxbqfkf() {
        return this.f66776ppxfxbqfkf;
    }

    public final String zoijcleaow() {
        return this.f66775iobyxmoadg;
    }

    public ppxfxbqfkf(String eventName, Map eventData, long j13) {
        zdlpuopuiu.btonecajqb(eventName, "eventName");
        zdlpuopuiu.btonecajqb(eventData, "eventData");
        this.f66775iobyxmoadg = eventName;
        this.f66777zoijcleaow = eventData;
        this.f66776ppxfxbqfkf = j13;
    }
}
