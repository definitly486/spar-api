package db2;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.navigation.model.NavigationPayload;

/* JADX INFO: loaded from: classes6.dex */
public interface wkgbmnqykc {

    public static final class iobyxmoadg implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f27413iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }
    }

    public static final class ppxfxbqfkf implements wkgbmnqykc {

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public static final int f27414zoijcleaow = NavigationPayload.f87549istkbnxepw;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final NavigationPayload f27415iobyxmoadg;

        public ppxfxbqfkf(NavigationPayload payload) {
            zdlpuopuiu.btonecajqb(payload, "payload");
            this.f27415iobyxmoadg = payload;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f27415iobyxmoadg, ((ppxfxbqfkf) obj).f27415iobyxmoadg);
        }

        public int hashCode() {
            return this.f27415iobyxmoadg.hashCode();
        }

        public final NavigationPayload iobyxmoadg() {
            return this.f27415iobyxmoadg;
        }

        public String toString() {
            return "SendNavigationPayload(payload=" + this.f27415iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f27416iobyxmoadg;

        public zoijcleaow(String url) {
            zdlpuopuiu.btonecajqb(url, "url");
            this.f27416iobyxmoadg = url;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f27416iobyxmoadg, ((zoijcleaow) obj).f27416iobyxmoadg);
        }

        public int hashCode() {
            return this.f27416iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f27416iobyxmoadg;
        }

        public String toString() {
            return "OnPdfUrlClick(url=" + this.f27416iobyxmoadg + ")";
        }
    }
}
