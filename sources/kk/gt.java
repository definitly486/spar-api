package kk;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class gt extends hl {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final LinkedHashMap f56734iobyxmoadg;

    public gt(LinkedHashMap notPassedDeviceParams) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(notPassedDeviceParams, "notPassedDeviceParams");
        this.f56734iobyxmoadg = notPassedDeviceParams;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gt) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f56734iobyxmoadg, ((gt) obj).f56734iobyxmoadg);
    }

    public final int hashCode() {
        return this.f56734iobyxmoadg.hashCode();
    }

    public final String toString() {
        return "DeviceFailedCheck(notPassedDeviceParams=" + this.f56734iobyxmoadg + ")";
    }
}
