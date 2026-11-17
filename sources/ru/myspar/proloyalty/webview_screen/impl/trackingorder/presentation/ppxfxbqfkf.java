package ru.myspar.proloyalty.webview_screen.impl.trackingorder.presentation;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ppxfxbqfkf {

    public static final class iobyxmoadg extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f102159iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.webview_screen.impl.trackingorder.presentation.ppxfxbqfkf$ppxfxbqfkf, reason: collision with other inner class name */
    public static final class C2461ppxfxbqfkf extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f102160iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2461ppxfxbqfkf(String url) {
            super(null);
            zdlpuopuiu.btonecajqb(url, "url");
            this.f102160iobyxmoadg = url;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2461ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f102160iobyxmoadg, ((C2461ppxfxbqfkf) obj).f102160iobyxmoadg);
        }

        public int hashCode() {
            return this.f102160iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f102160iobyxmoadg;
        }

        public String toString() {
            return "OnTrackingAction(url=" + this.f102160iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f102161iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(String message) {
            super(null);
            zdlpuopuiu.btonecajqb(message, "message");
            this.f102161iobyxmoadg = message;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f102161iobyxmoadg, ((zoijcleaow) obj).f102161iobyxmoadg);
        }

        public int hashCode() {
            return this.f102161iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f102161iobyxmoadg;
        }

        public String toString() {
            return "OnReceivedError(message=" + this.f102161iobyxmoadg + ")";
        }
    }

    public /* synthetic */ ppxfxbqfkf(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private ppxfxbqfkf() {
    }
}
