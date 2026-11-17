package wp1;

import java.util.Arrays;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class rgvfuqvkyq {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int[] f120432iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final int f120433ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f120434zoijcleaow;

    public rgvfuqvkyq(int[] screenLocation, int i13, int i14) {
        zdlpuopuiu.btonecajqb(screenLocation, "screenLocation");
        this.f120432iobyxmoadg = screenLocation;
        this.f120434zoijcleaow = i13;
        this.f120433ppxfxbqfkf = i14;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!zdlpuopuiu.eablkybsjg(rgvfuqvkyq.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        zdlpuopuiu.nufgyqmvbu(obj, "null cannot be cast to non-null type ru.myspar.proloyalty.services.barcode_analyzer.api.ScanWindowArea");
        rgvfuqvkyq rgvfuqvkyqVar = (rgvfuqvkyq) obj;
        return Arrays.equals(this.f120432iobyxmoadg, rgvfuqvkyqVar.f120432iobyxmoadg) && this.f120434zoijcleaow == rgvfuqvkyqVar.f120434zoijcleaow && this.f120433ppxfxbqfkf == rgvfuqvkyqVar.f120433ppxfxbqfkf;
    }

    public int hashCode() {
        return (((Arrays.hashCode(this.f120432iobyxmoadg) * 31) + this.f120434zoijcleaow) * 31) + this.f120433ppxfxbqfkf;
    }

    public final int iobyxmoadg() {
        return this.f120433ppxfxbqfkf;
    }

    public String toString() {
        return "ScanWindowArea(screenLocation=" + Arrays.toString(this.f120432iobyxmoadg) + ", width=" + this.f120434zoijcleaow + ", height=" + this.f120433ppxfxbqfkf + ")";
    }

    public final int zoijcleaow() {
        return this.f120432iobyxmoadg[1];
    }
}
