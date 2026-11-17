package ru.myspar.legacy.presentation.dialogs.rateorder;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ppxfxbqfkf {

    public static final class iobyxmoadg extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f88698iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(String orderId) {
            super(null);
            zdlpuopuiu.btonecajqb(orderId, "orderId");
            this.f88698iobyxmoadg = orderId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f88698iobyxmoadg, ((iobyxmoadg) obj).f88698iobyxmoadg);
        }

        public int hashCode() {
            return this.f88698iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f88698iobyxmoadg;
        }

        public String toString() {
            return "RedirectToOrder(orderId=" + this.f88698iobyxmoadg + ")";
        }
    }

    /* JADX INFO: renamed from: ru.myspar.legacy.presentation.dialogs.rateorder.ppxfxbqfkf$ppxfxbqfkf, reason: collision with other inner class name */
    public static final class C2034ppxfxbqfkf extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final C2034ppxfxbqfkf f88699iobyxmoadg = new C2034ppxfxbqfkf();

        private C2034ppxfxbqfkf() {
            super(null);
        }
    }

    public static final class zoijcleaow extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f88700iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(Throwable error) {
            super(null);
            zdlpuopuiu.btonecajqb(error, "error");
            this.f88700iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f88700iobyxmoadg, ((zoijcleaow) obj).f88700iobyxmoadg);
        }

        public int hashCode() {
            return this.f88700iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f88700iobyxmoadg;
        }

        public String toString() {
            return "ShowError(error=" + this.f88700iobyxmoadg + ")";
        }
    }

    public /* synthetic */ ppxfxbqfkf(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private ppxfxbqfkf() {
    }
}
