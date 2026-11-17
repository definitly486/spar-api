package bx1;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.navigation.model.NavigationPayload;

/* JADX INFO: loaded from: classes6.dex */
public interface wkgbmnqykc {

    public static final class iobyxmoadg implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f17354iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }
    }

    public static final class ppxfxbqfkf implements wkgbmnqykc {

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public static final int f17355zoijcleaow = NavigationPayload.f95326zynmafqrjb;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final NavigationPayload f17356iobyxmoadg;

        public ppxfxbqfkf(NavigationPayload payload) {
            zdlpuopuiu.btonecajqb(payload, "payload");
            this.f17356iobyxmoadg = payload;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f17356iobyxmoadg, ((ppxfxbqfkf) obj).f17356iobyxmoadg);
        }

        public int hashCode() {
            return this.f17356iobyxmoadg.hashCode();
        }

        public final NavigationPayload iobyxmoadg() {
            return this.f17356iobyxmoadg;
        }

        public String toString() {
            return "SendNavigationPayload(payload=" + this.f17356iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f17357iobyxmoadg;

        public zoijcleaow(String url) {
            zdlpuopuiu.btonecajqb(url, "url");
            this.f17357iobyxmoadg = url;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f17357iobyxmoadg, ((zoijcleaow) obj).f17357iobyxmoadg);
        }

        public int hashCode() {
            return this.f17357iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f17357iobyxmoadg;
        }

        public String toString() {
            return "OnPdfUrlClick(url=" + this.f17357iobyxmoadg + ")";
        }
    }
}
