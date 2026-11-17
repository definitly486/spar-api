package ru.myspar.webview_screen.impl.myspar.presentation;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.navigation.model.NavigationPayload;

/* JADX INFO: loaded from: classes6.dex */
public interface zoijcleaow {

    public static final class iobyxmoadg implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f104770iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return 1413792100;
        }

        public String toString() {
            return "OnBackClick";
        }
    }

    public static final class ppxfxbqfkf implements zoijcleaow {

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public static final int f104771zoijcleaow = NavigationPayload.f87549istkbnxepw;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final NavigationPayload f104772iobyxmoadg;

        public ppxfxbqfkf(NavigationPayload payload) {
            zdlpuopuiu.btonecajqb(payload, "payload");
            this.f104772iobyxmoadg = payload;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f104772iobyxmoadg, ((ppxfxbqfkf) obj).f104772iobyxmoadg);
        }

        public int hashCode() {
            return this.f104772iobyxmoadg.hashCode();
        }

        public final NavigationPayload iobyxmoadg() {
            return this.f104772iobyxmoadg;
        }

        public String toString() {
            return "SendNavigationPayload(payload=" + this.f104772iobyxmoadg + ")";
        }
    }

    /* JADX INFO: renamed from: ru.myspar.webview_screen.impl.myspar.presentation.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    public static final class C2538zoijcleaow implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f104773iobyxmoadg;

        public C2538zoijcleaow(String url) {
            zdlpuopuiu.btonecajqb(url, "url");
            this.f104773iobyxmoadg = url;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2538zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f104773iobyxmoadg, ((C2538zoijcleaow) obj).f104773iobyxmoadg);
        }

        public int hashCode() {
            return this.f104773iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f104773iobyxmoadg;
        }

        public String toString() {
            return "OnPdfUrlClick(url=" + this.f104773iobyxmoadg + ")";
        }
    }
}
