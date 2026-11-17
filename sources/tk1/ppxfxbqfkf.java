package tk1;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class ppxfxbqfkf implements u41.iobyxmoadg {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public static final iobyxmoadg f111019ppxfxbqfkf = new iobyxmoadg(null);

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f111020iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final eablkybsjg f111021zoijcleaow;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    public ppxfxbqfkf(String qrcodeId, eablkybsjg status) {
        zdlpuopuiu.btonecajqb(qrcodeId, "qrcodeId");
        zdlpuopuiu.btonecajqb(status, "status");
        this.f111020iobyxmoadg = qrcodeId;
        this.f111021zoijcleaow = status;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ppxfxbqfkf)) {
            return false;
        }
        ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
        return zdlpuopuiu.eablkybsjg(this.f111020iobyxmoadg, ppxfxbqfkfVar.f111020iobyxmoadg) && this.f111021zoijcleaow == ppxfxbqfkfVar.f111021zoijcleaow;
    }

    public int hashCode() {
        return (this.f111020iobyxmoadg.hashCode() * 31) + this.f111021zoijcleaow.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f111020iobyxmoadg;
    }

    public String toString() {
        return "QrStatusActionEntity(qrcodeId=" + this.f111020iobyxmoadg + ", status=" + this.f111021zoijcleaow + ")";
    }

    public final eablkybsjg zoijcleaow() {
        return this.f111021zoijcleaow;
    }
}
