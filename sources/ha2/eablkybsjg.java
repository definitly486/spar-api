package ha2;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class eablkybsjg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f39958iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f39959zoijcleaow;

    public eablkybsjg(String pushToken, String deviceId) {
        zdlpuopuiu.btonecajqb(pushToken, "pushToken");
        zdlpuopuiu.btonecajqb(deviceId, "deviceId");
        this.f39958iobyxmoadg = pushToken;
        this.f39959zoijcleaow = deviceId;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eablkybsjg)) {
            return false;
        }
        eablkybsjg eablkybsjgVar = (eablkybsjg) obj;
        return zdlpuopuiu.eablkybsjg(this.f39958iobyxmoadg, eablkybsjgVar.f39958iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f39959zoijcleaow, eablkybsjgVar.f39959zoijcleaow);
    }

    public int hashCode() {
        return (this.f39958iobyxmoadg.hashCode() * 31) + this.f39959zoijcleaow.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f39959zoijcleaow;
    }

    public String toString() {
        return "UserPushToken(pushToken=" + this.f39958iobyxmoadg + ", deviceId=" + this.f39959zoijcleaow + ")";
    }

    public final String zoijcleaow() {
        return this.f39958iobyxmoadg;
    }
}
