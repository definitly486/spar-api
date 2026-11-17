package ur0;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public interface ppxfxbqfkf {

    public static final class iobyxmoadg implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f114258iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final List f114259zoijcleaow;

        public iobyxmoadg(String screenTag, List failurePermissions) {
            zdlpuopuiu.btonecajqb(screenTag, "screenTag");
            zdlpuopuiu.btonecajqb(failurePermissions, "failurePermissions");
            this.f114258iobyxmoadg = screenTag;
            this.f114259zoijcleaow = failurePermissions;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f114258iobyxmoadg, iobyxmoadgVar.f114258iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f114259zoijcleaow, iobyxmoadgVar.f114259zoijcleaow);
        }

        public int hashCode() {
            return (this.f114258iobyxmoadg.hashCode() * 31) + this.f114259zoijcleaow.hashCode();
        }

        @Override // ur0.ppxfxbqfkf
        public String iobyxmoadg() {
            return this.f114258iobyxmoadg;
        }

        public String toString() {
            return "Failure(screenTag=" + this.f114258iobyxmoadg + ", failurePermissions=" + this.f114259zoijcleaow + ")";
        }
    }

    public static final class zoijcleaow implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f114260iobyxmoadg;

        public zoijcleaow(String screenTag) {
            zdlpuopuiu.btonecajqb(screenTag, "screenTag");
            this.f114260iobyxmoadg = screenTag;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f114260iobyxmoadg, ((zoijcleaow) obj).f114260iobyxmoadg);
        }

        public int hashCode() {
            return this.f114260iobyxmoadg.hashCode();
        }

        @Override // ur0.ppxfxbqfkf
        public String iobyxmoadg() {
            return this.f114260iobyxmoadg;
        }

        public String toString() {
            return "Success(screenTag=" + this.f114260iobyxmoadg + ")";
        }
    }

    String iobyxmoadg();
}
