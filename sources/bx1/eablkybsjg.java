package bx1;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.navigation.model.NavigationPayload;

/* JADX INFO: loaded from: classes6.dex */
public interface eablkybsjg {

    public static final class iobyxmoadg implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f17333iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }
    }

    public static final class ppxfxbqfkf implements eablkybsjg {

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public static final int f17334zoijcleaow = NavigationPayload.f95326zynmafqrjb;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final NavigationPayload f17335iobyxmoadg;

        public ppxfxbqfkf(NavigationPayload payload) {
            zdlpuopuiu.btonecajqb(payload, "payload");
            this.f17335iobyxmoadg = payload;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f17335iobyxmoadg, ((ppxfxbqfkf) obj).f17335iobyxmoadg);
        }

        public int hashCode() {
            return this.f17335iobyxmoadg.hashCode();
        }

        public final NavigationPayload iobyxmoadg() {
            return this.f17335iobyxmoadg;
        }

        public String toString() {
            return "SendNavigationPayload(payload=" + this.f17335iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f17336iobyxmoadg;

        public zoijcleaow(String pdfUrl) {
            zdlpuopuiu.btonecajqb(pdfUrl, "pdfUrl");
            this.f17336iobyxmoadg = pdfUrl;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f17336iobyxmoadg, ((zoijcleaow) obj).f17336iobyxmoadg);
        }

        public int hashCode() {
            return this.f17336iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f17336iobyxmoadg;
        }

        public String toString() {
            return "OpenPdfViewer(pdfUrl=" + this.f17336iobyxmoadg + ")";
        }
    }
}
