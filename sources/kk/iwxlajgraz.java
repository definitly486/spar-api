package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class iwxlajgraz extends kz {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final b4 f57103iobyxmoadg;

    public iwxlajgraz(b4 deviceCheckStatus) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(deviceCheckStatus, "deviceCheckStatus");
        this.f57103iobyxmoadg = deviceCheckStatus;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iwxlajgraz) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f57103iobyxmoadg, ((iwxlajgraz) obj).f57103iobyxmoadg);
    }

    public final int hashCode() {
        return this.f57103iobyxmoadg.hashCode();
    }

    public final String toString() {
        return "HandleDeviceCheck(deviceCheckStatus=" + this.f57103iobyxmoadg + ")";
    }
}
