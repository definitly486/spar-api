package at;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public interface ppxfxbqfkf {

    public static final class iobyxmoadg implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f14463iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final List f14464zoijcleaow;

        public iobyxmoadg(String screenTag, List failurePermissions) {
            zdlpuopuiu.btonecajqb(screenTag, "screenTag");
            zdlpuopuiu.btonecajqb(failurePermissions, "failurePermissions");
            this.f14463iobyxmoadg = screenTag;
            this.f14464zoijcleaow = failurePermissions;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f14463iobyxmoadg, iobyxmoadgVar.f14463iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f14464zoijcleaow, iobyxmoadgVar.f14464zoijcleaow);
        }

        public int hashCode() {
            return (this.f14463iobyxmoadg.hashCode() * 31) + this.f14464zoijcleaow.hashCode();
        }

        @Override // at.ppxfxbqfkf
        public String iobyxmoadg() {
            return this.f14463iobyxmoadg;
        }

        public String toString() {
            return "Failure(screenTag=" + this.f14463iobyxmoadg + ", failurePermissions=" + this.f14464zoijcleaow + ")";
        }
    }

    public static final class zoijcleaow implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f14465iobyxmoadg;

        public zoijcleaow(String screenTag) {
            zdlpuopuiu.btonecajqb(screenTag, "screenTag");
            this.f14465iobyxmoadg = screenTag;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f14465iobyxmoadg, ((zoijcleaow) obj).f14465iobyxmoadg);
        }

        public int hashCode() {
            return this.f14465iobyxmoadg.hashCode();
        }

        @Override // at.ppxfxbqfkf
        public String iobyxmoadg() {
            return this.f14465iobyxmoadg;
        }

        public String toString() {
            return "Success(screenTag=" + this.f14465iobyxmoadg + ")";
        }
    }

    String iobyxmoadg();
}
