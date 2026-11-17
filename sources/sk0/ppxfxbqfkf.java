package sk0;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.profile.api.model.ProfileScreenPayload;

/* JADX INFO: loaded from: classes3.dex */
public interface ppxfxbqfkf {

    public static final class iobyxmoadg implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f107281iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return 394035133;
        }

        public String toString() {
            return "Init";
        }
    }

    /* JADX INFO: renamed from: sk0.ppxfxbqfkf$ppxfxbqfkf, reason: collision with other inner class name */
    public static final class C2638ppxfxbqfkf implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ProfileScreenPayload f107282iobyxmoadg;

        public C2638ppxfxbqfkf(ProfileScreenPayload payload) {
            zdlpuopuiu.btonecajqb(payload, "payload");
            this.f107282iobyxmoadg = payload;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2638ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f107282iobyxmoadg, ((C2638ppxfxbqfkf) obj).f107282iobyxmoadg);
        }

        public int hashCode() {
            return this.f107282iobyxmoadg.hashCode();
        }

        public final ProfileScreenPayload iobyxmoadg() {
            return this.f107282iobyxmoadg;
        }

        public String toString() {
            return "ProcessPayload(payload=" + this.f107282iobyxmoadg + ")";
        }
    }

    public static final class wkgbmnqykc implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final wkgbmnqykc f107283iobyxmoadg = new wkgbmnqykc();

        private wkgbmnqykc() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof wkgbmnqykc);
        }

        public int hashCode() {
            return -336128792;
        }

        public String toString() {
            return "SubscribeProfileController";
        }
    }

    public static final class zoijcleaow implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f107284iobyxmoadg = new zoijcleaow();

        private zoijcleaow() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof zoijcleaow);
        }

        public int hashCode() {
            return -1156195081;
        }

        public String toString() {
            return "ObserveUserState";
        }
    }
}
