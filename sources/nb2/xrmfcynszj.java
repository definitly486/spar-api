package nb2;

import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class xrmfcynszj {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final String f69624iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final Map f69625ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final long f69626wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final String f69627zoijcleaow;

    public xrmfcynszj(String uuid, String eventName, Map eventData, long j13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(uuid, "uuid");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(eventName, "eventName");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(eventData, "eventData");
        this.f69624iobyxmoadg = uuid;
        this.f69627zoijcleaow = eventName;
        this.f69625ppxfxbqfkf = eventData;
        this.f69626wkgbmnqykc = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xrmfcynszj)) {
            return false;
        }
        xrmfcynszj xrmfcynszjVar = (xrmfcynszj) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f69624iobyxmoadg, xrmfcynszjVar.f69624iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f69627zoijcleaow, xrmfcynszjVar.f69627zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f69625ppxfxbqfkf, xrmfcynszjVar.f69625ppxfxbqfkf) && this.f69626wkgbmnqykc == xrmfcynszjVar.f69626wkgbmnqykc;
    }

    public final int hashCode() {
        return Long.hashCode(this.f69626wkgbmnqykc) + ((this.f69625ppxfxbqfkf.hashCode() + ((this.f69627zoijcleaow.hashCode() + (this.f69624iobyxmoadg.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("MigrationDtoVer2(uuid=");
        sb3.append((Object) ("MetricsEventUuid(value=" + this.f69624iobyxmoadg + ')'));
        sb3.append(", eventName=");
        sb3.append(this.f69627zoijcleaow);
        sb3.append(", eventData=");
        sb3.append(this.f69625ppxfxbqfkf);
        sb3.append(", eventTimeStamp=");
        sb3.append(this.f69626wkgbmnqykc);
        sb3.append(')');
        return sb3.toString();
    }
}
