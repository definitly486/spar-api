package ru.myspar.webview_screen.impl.trackingorder.presentation;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ppxfxbqfkf {

    public static final class iobyxmoadg extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f104798iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: ru.myspar.webview_screen.impl.trackingorder.presentation.ppxfxbqfkf$ppxfxbqfkf, reason: collision with other inner class name */
    public static final class C2539ppxfxbqfkf extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f104799iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2539ppxfxbqfkf(String url) {
            super(null);
            zdlpuopuiu.btonecajqb(url, "url");
            this.f104799iobyxmoadg = url;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2539ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f104799iobyxmoadg, ((C2539ppxfxbqfkf) obj).f104799iobyxmoadg);
        }

        public int hashCode() {
            return this.f104799iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f104799iobyxmoadg;
        }

        public String toString() {
            return "OnTrackingAction(url=" + this.f104799iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f104800iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(String message) {
            super(null);
            zdlpuopuiu.btonecajqb(message, "message");
            this.f104800iobyxmoadg = message;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f104800iobyxmoadg, ((zoijcleaow) obj).f104800iobyxmoadg);
        }

        public int hashCode() {
            return this.f104800iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f104800iobyxmoadg;
        }

        public String toString() {
            return "OnReceivedError(message=" + this.f104800iobyxmoadg + ")";
        }
    }

    public /* synthetic */ ppxfxbqfkf(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private ppxfxbqfkf() {
    }
}
