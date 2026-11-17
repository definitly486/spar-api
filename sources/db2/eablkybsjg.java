package db2;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.navigation.model.NavigationPayload;

/* JADX INFO: loaded from: classes6.dex */
public interface eablkybsjg {

    public static final class iobyxmoadg implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f27405iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }
    }

    public static final class ppxfxbqfkf implements eablkybsjg {

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public static final int f27406zoijcleaow = NavigationPayload.f87549istkbnxepw;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final NavigationPayload f27407iobyxmoadg;

        public ppxfxbqfkf(NavigationPayload payload) {
            zdlpuopuiu.btonecajqb(payload, "payload");
            this.f27407iobyxmoadg = payload;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f27407iobyxmoadg, ((ppxfxbqfkf) obj).f27407iobyxmoadg);
        }

        public int hashCode() {
            return this.f27407iobyxmoadg.hashCode();
        }

        public final NavigationPayload iobyxmoadg() {
            return this.f27407iobyxmoadg;
        }

        public String toString() {
            return "SendNavigationPayload(payload=" + this.f27407iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f27408iobyxmoadg;

        public zoijcleaow(String pdfUrl) {
            zdlpuopuiu.btonecajqb(pdfUrl, "pdfUrl");
            this.f27408iobyxmoadg = pdfUrl;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f27408iobyxmoadg, ((zoijcleaow) obj).f27408iobyxmoadg);
        }

        public int hashCode() {
            return this.f27408iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f27408iobyxmoadg;
        }

        public String toString() {
            return "OpenPdfViewer(pdfUrl=" + this.f27408iobyxmoadg + ")";
        }
    }
}
