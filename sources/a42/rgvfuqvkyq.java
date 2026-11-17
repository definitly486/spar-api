package a42;

import java.util.Arrays;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class rgvfuqvkyq {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int[] f386iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final int f387ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f388zoijcleaow;

    public rgvfuqvkyq(int[] screenLocation, int i13, int i14) {
        zdlpuopuiu.btonecajqb(screenLocation, "screenLocation");
        this.f386iobyxmoadg = screenLocation;
        this.f388zoijcleaow = i13;
        this.f387ppxfxbqfkf = i14;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!zdlpuopuiu.eablkybsjg(rgvfuqvkyq.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        zdlpuopuiu.nufgyqmvbu(obj, "null cannot be cast to non-null type ru.myspar.services.barcode_analyzer.api.ScanWindowArea");
        rgvfuqvkyq rgvfuqvkyqVar = (rgvfuqvkyq) obj;
        return Arrays.equals(this.f386iobyxmoadg, rgvfuqvkyqVar.f386iobyxmoadg) && this.f388zoijcleaow == rgvfuqvkyqVar.f388zoijcleaow && this.f387ppxfxbqfkf == rgvfuqvkyqVar.f387ppxfxbqfkf;
    }

    public int hashCode() {
        return (((Arrays.hashCode(this.f386iobyxmoadg) * 31) + this.f388zoijcleaow) * 31) + this.f387ppxfxbqfkf;
    }

    public final int iobyxmoadg() {
        return this.f387ppxfxbqfkf;
    }

    public String toString() {
        return "ScanWindowArea(screenLocation=" + Arrays.toString(this.f386iobyxmoadg) + ", width=" + this.f388zoijcleaow + ", height=" + this.f387ppxfxbqfkf + ")";
    }

    public final int zoijcleaow() {
        return this.f386iobyxmoadg[1];
    }
}
