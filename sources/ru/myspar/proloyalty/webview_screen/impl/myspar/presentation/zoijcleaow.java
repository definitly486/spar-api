package ru.myspar.proloyalty.webview_screen.impl.myspar.presentation;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.navigation.model.NavigationPayload;

/* JADX INFO: loaded from: classes6.dex */
public interface zoijcleaow {

    public static final class iobyxmoadg implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f102130iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return 1484595425;
        }

        public String toString() {
            return "OnBackClick";
        }
    }

    public static final class ppxfxbqfkf implements zoijcleaow {

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public static final int f102131zoijcleaow = NavigationPayload.f95326zynmafqrjb;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final NavigationPayload f102132iobyxmoadg;

        public ppxfxbqfkf(NavigationPayload payload) {
            zdlpuopuiu.btonecajqb(payload, "payload");
            this.f102132iobyxmoadg = payload;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f102132iobyxmoadg, ((ppxfxbqfkf) obj).f102132iobyxmoadg);
        }

        public int hashCode() {
            return this.f102132iobyxmoadg.hashCode();
        }

        public final NavigationPayload iobyxmoadg() {
            return this.f102132iobyxmoadg;
        }

        public String toString() {
            return "SendNavigationPayload(payload=" + this.f102132iobyxmoadg + ")";
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.webview_screen.impl.myspar.presentation.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    public static final class C2460zoijcleaow implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f102133iobyxmoadg;

        public C2460zoijcleaow(String url) {
            zdlpuopuiu.btonecajqb(url, "url");
            this.f102133iobyxmoadg = url;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2460zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f102133iobyxmoadg, ((C2460zoijcleaow) obj).f102133iobyxmoadg);
        }

        public int hashCode() {
            return this.f102133iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f102133iobyxmoadg;
        }

        public String toString() {
            return "OnPdfUrlClick(url=" + this.f102133iobyxmoadg + ")";
        }
    }
}
