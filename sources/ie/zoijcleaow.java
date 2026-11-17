package ie;

import com.google.android.gms.common.internal.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public class zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f42453iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final Executor f42454ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final boolean f42455zoijcleaow;

    public static class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private int f42456iobyxmoadg = 0;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private Executor f42457ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private boolean f42458zoijcleaow;

        public zoijcleaow iobyxmoadg() {
            return new zoijcleaow(this.f42456iobyxmoadg, this.f42458zoijcleaow, this.f42457ppxfxbqfkf, null, null);
        }

        public iobyxmoadg zoijcleaow(int i13, int... iArr) {
            this.f42456iobyxmoadg = i13;
            if (iArr != null) {
                for (int i14 : iArr) {
                    this.f42456iobyxmoadg = i14 | this.f42456iobyxmoadg;
                }
            }
            return this;
        }
    }

    /* synthetic */ zoijcleaow(int i13, boolean z13, Executor executor, wkgbmnqykc wkgbmnqykcVar, eablkybsjg eablkybsjgVar) {
        this.f42453iobyxmoadg = i13;
        this.f42455zoijcleaow = z13;
        this.f42454ppxfxbqfkf = executor;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zoijcleaow)) {
            return false;
        }
        zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
        return this.f42453iobyxmoadg == zoijcleaowVar.f42453iobyxmoadg && this.f42455zoijcleaow == zoijcleaowVar.f42455zoijcleaow && Objects.equal(this.f42454ppxfxbqfkf, zoijcleaowVar.f42454ppxfxbqfkf) && Objects.equal(null, null);
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.f42453iobyxmoadg), Boolean.valueOf(this.f42455zoijcleaow), this.f42454ppxfxbqfkf, null);
    }

    public final int iobyxmoadg() {
        return this.f42453iobyxmoadg;
    }

    public final Executor ppxfxbqfkf() {
        return this.f42454ppxfxbqfkf;
    }

    public final boolean wkgbmnqykc() {
        return this.f42455zoijcleaow;
    }

    public final wkgbmnqykc zoijcleaow() {
        return null;
    }
}
