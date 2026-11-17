package ru.myspar.proloyalty.delivery.impl.interval.presentation;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public abstract class ppxfxbqfkf {

    public static final class iobyxmoadg extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f95433iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(Throwable error) {
            super(null);
            zdlpuopuiu.btonecajqb(error, "error");
            this.f95433iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f95433iobyxmoadg, ((iobyxmoadg) obj).f95433iobyxmoadg);
        }

        public int hashCode() {
            return this.f95433iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f95433iobyxmoadg;
        }

        public String toString() {
            return "ShowError(error=" + this.f95433iobyxmoadg + ")";
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.delivery.impl.interval.presentation.ppxfxbqfkf$ppxfxbqfkf, reason: collision with other inner class name */
    public static final class C2236ppxfxbqfkf extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final CharSequence f95434iobyxmoadg;

        public C2236ppxfxbqfkf(CharSequence charSequence) {
            super(null);
            this.f95434iobyxmoadg = charSequence;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2236ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f95434iobyxmoadg, ((C2236ppxfxbqfkf) obj).f95434iobyxmoadg);
        }

        public int hashCode() {
            CharSequence charSequence = this.f95434iobyxmoadg;
            if (charSequence == null) {
                return 0;
            }
            return charSequence.hashCode();
        }

        public final CharSequence iobyxmoadg() {
            return this.f95434iobyxmoadg;
        }

        public String toString() {
            return "ShowMessage(message=" + ((Object) this.f95434iobyxmoadg) + ")";
        }
    }

    public static final class zoijcleaow extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f95435iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(String message) {
            super(null);
            zdlpuopuiu.btonecajqb(message, "message");
            this.f95435iobyxmoadg = message;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f95435iobyxmoadg, ((zoijcleaow) obj).f95435iobyxmoadg);
        }

        public int hashCode() {
            return this.f95435iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f95435iobyxmoadg;
        }

        public String toString() {
            return "ShowLimitMessage(message=" + this.f95435iobyxmoadg + ")";
        }
    }

    public /* synthetic */ ppxfxbqfkf(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private ppxfxbqfkf() {
    }
}
