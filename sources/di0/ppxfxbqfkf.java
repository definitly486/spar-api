package di0;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final long f28997iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final List f28998ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f28999zoijcleaow;

    public ppxfxbqfkf(long j13, String payload, List headers) {
        zdlpuopuiu.btonecajqb(payload, "payload");
        zdlpuopuiu.btonecajqb(headers, "headers");
        this.f28997iobyxmoadg = j13;
        this.f28999zoijcleaow = payload;
        this.f28998ppxfxbqfkf = headers;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ppxfxbqfkf)) {
            return false;
        }
        ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
        return this.f28997iobyxmoadg == ppxfxbqfkfVar.f28997iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f28999zoijcleaow, ppxfxbqfkfVar.f28999zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f28998ppxfxbqfkf, ppxfxbqfkfVar.f28998ppxfxbqfkf);
    }

    public int hashCode() {
        return (((Long.hashCode(this.f28997iobyxmoadg) * 31) + this.f28999zoijcleaow.hashCode()) * 31) + this.f28998ppxfxbqfkf.hashCode();
    }

    public final List iobyxmoadg() {
        return this.f28998ppxfxbqfkf;
    }

    public final long ppxfxbqfkf() {
        return this.f28997iobyxmoadg;
    }

    public String toString() {
        return "NetworkPayloadEntity(time=" + this.f28997iobyxmoadg + ", payload=" + this.f28999zoijcleaow + ", headers=" + this.f28998ppxfxbqfkf + ")";
    }

    public final String zoijcleaow() {
        return this.f28999zoijcleaow;
    }
}
