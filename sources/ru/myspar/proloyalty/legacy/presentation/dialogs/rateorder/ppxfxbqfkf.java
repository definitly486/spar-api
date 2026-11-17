package ru.myspar.proloyalty.legacy.presentation.dialogs.rateorder;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public abstract class ppxfxbqfkf {

    public static final class iobyxmoadg extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f96482iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(String orderId) {
            super(null);
            zdlpuopuiu.btonecajqb(orderId, "orderId");
            this.f96482iobyxmoadg = orderId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f96482iobyxmoadg, ((iobyxmoadg) obj).f96482iobyxmoadg);
        }

        public int hashCode() {
            return this.f96482iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f96482iobyxmoadg;
        }

        public String toString() {
            return "RedirectToOrder(orderId=" + this.f96482iobyxmoadg + ")";
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.legacy.presentation.dialogs.rateorder.ppxfxbqfkf$ppxfxbqfkf, reason: collision with other inner class name */
    public static final class C2279ppxfxbqfkf extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final C2279ppxfxbqfkf f96483iobyxmoadg = new C2279ppxfxbqfkf();

        private C2279ppxfxbqfkf() {
            super(null);
        }
    }

    public static final class zoijcleaow extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f96484iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(Throwable error) {
            super(null);
            zdlpuopuiu.btonecajqb(error, "error");
            this.f96484iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f96484iobyxmoadg, ((zoijcleaow) obj).f96484iobyxmoadg);
        }

        public int hashCode() {
            return this.f96484iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f96484iobyxmoadg;
        }

        public String toString() {
            return "ShowError(error=" + this.f96484iobyxmoadg + ")";
        }
    }

    public /* synthetic */ ppxfxbqfkf(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private ppxfxbqfkf() {
    }
}
