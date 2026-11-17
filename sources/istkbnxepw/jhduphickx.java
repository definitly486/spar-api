package istkbnxepw;

import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class jhduphickx {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final boolean f49350iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final Set f49351ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Set f49352zoijcleaow;

    public static class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private boolean f49353iobyxmoadg = true;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private Set f49354ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private Set f49355zoijcleaow;

        public jhduphickx iobyxmoadg() {
            return new jhduphickx(this.f49353iobyxmoadg, this.f49355zoijcleaow, this.f49354ppxfxbqfkf);
        }

        public zoijcleaow ppxfxbqfkf(Set set) {
            this.f49355zoijcleaow = new HashSet(set);
            return this;
        }

        public zoijcleaow wkgbmnqykc(boolean z13) {
            this.f49353iobyxmoadg = z13;
            return this;
        }

        public zoijcleaow zoijcleaow(Set set) {
            this.f49354ppxfxbqfkf = new HashSet(set);
            return this;
        }
    }

    public static jhduphickx zoijcleaow() {
        return new zoijcleaow().wkgbmnqykc(true).iobyxmoadg();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof jhduphickx)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        jhduphickx jhduphickxVar = (jhduphickx) obj;
        return this.f49350iobyxmoadg == jhduphickxVar.f49350iobyxmoadg && Objects.equals(this.f49352zoijcleaow, jhduphickxVar.f49352zoijcleaow) && Objects.equals(this.f49351ppxfxbqfkf, jhduphickxVar.f49351ppxfxbqfkf);
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f49350iobyxmoadg), this.f49352zoijcleaow, this.f49351ppxfxbqfkf);
    }

    public boolean iobyxmoadg(Class cls, boolean z13) {
        if (this.f49352zoijcleaow.contains(cls)) {
            return true;
        }
        if (this.f49351ppxfxbqfkf.contains(cls)) {
            return false;
        }
        return this.f49350iobyxmoadg && z13;
    }

    public String toString() {
        return "QuirkSettings{enabledWhenDeviceHasQuirk=" + this.f49350iobyxmoadg + ", forceEnabledQuirks=" + this.f49352zoijcleaow + ", forceDisabledQuirks=" + this.f49351ppxfxbqfkf + '}';
    }

    private jhduphickx(boolean z13, Set set, Set set2) {
        this.f49350iobyxmoadg = z13;
        this.f49352zoijcleaow = set == null ? Collections.emptySet() : new HashSet(set);
        this.f49351ppxfxbqfkf = set2 == null ? Collections.emptySet() : new HashSet(set2);
    }
}
