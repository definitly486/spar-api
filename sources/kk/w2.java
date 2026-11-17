package kk;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class w2 extends b4 {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final LinkedHashMap f59084iobyxmoadg;

    public w2(LinkedHashMap notPassedDeviceParams) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(notPassedDeviceParams, "notPassedDeviceParams");
        this.f59084iobyxmoadg = notPassedDeviceParams;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w2) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f59084iobyxmoadg, ((w2) obj).f59084iobyxmoadg);
    }

    public final int hashCode() {
        return this.f59084iobyxmoadg.hashCode();
    }

    public final String toString() {
        return "DeviceFailedCheck(notPassedDeviceParams=" + this.f59084iobyxmoadg + ")";
    }
}
