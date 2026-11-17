package nb2;

import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class ikoacuggdj {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final String f69565iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final Map f69566ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final String f69567zoijcleaow;

    public ikoacuggdj(String uuid, String eventName, Map eventData) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(uuid, "uuid");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(eventName, "eventName");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(eventData, "eventData");
        this.f69565iobyxmoadg = uuid;
        this.f69567zoijcleaow = eventName;
        this.f69566ppxfxbqfkf = eventData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ikoacuggdj)) {
            return false;
        }
        ikoacuggdj ikoacuggdjVar = (ikoacuggdj) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f69565iobyxmoadg, ikoacuggdjVar.f69565iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f69567zoijcleaow, ikoacuggdjVar.f69567zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f69566ppxfxbqfkf, ikoacuggdjVar.f69566ppxfxbqfkf);
    }

    public final int hashCode() {
        return this.f69566ppxfxbqfkf.hashCode() + ((this.f69567zoijcleaow.hashCode() + (this.f69565iobyxmoadg.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("MigrationDtoVer1(uuid=");
        sb3.append((Object) ("MetricsEventUuid(value=" + this.f69565iobyxmoadg + ')'));
        sb3.append(", eventName=");
        sb3.append(this.f69567zoijcleaow);
        sb3.append(", eventData=");
        sb3.append(this.f69566ppxfxbqfkf);
        sb3.append(')');
        return sb3.toString();
    }
}
