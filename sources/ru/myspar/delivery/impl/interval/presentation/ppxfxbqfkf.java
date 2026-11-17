package ru.myspar.delivery.impl.interval.presentation;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ppxfxbqfkf {

    public static final class iobyxmoadg extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f87651iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(Throwable error) {
            super(null);
            zdlpuopuiu.btonecajqb(error, "error");
            this.f87651iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f87651iobyxmoadg, ((iobyxmoadg) obj).f87651iobyxmoadg);
        }

        public int hashCode() {
            return this.f87651iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f87651iobyxmoadg;
        }

        public String toString() {
            return "ShowError(error=" + this.f87651iobyxmoadg + ")";
        }
    }

    /* JADX INFO: renamed from: ru.myspar.delivery.impl.interval.presentation.ppxfxbqfkf$ppxfxbqfkf, reason: collision with other inner class name */
    public static final class C1999ppxfxbqfkf extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final CharSequence f87652iobyxmoadg;

        public C1999ppxfxbqfkf(CharSequence charSequence) {
            super(null);
            this.f87652iobyxmoadg = charSequence;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1999ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f87652iobyxmoadg, ((C1999ppxfxbqfkf) obj).f87652iobyxmoadg);
        }

        public int hashCode() {
            CharSequence charSequence = this.f87652iobyxmoadg;
            if (charSequence == null) {
                return 0;
            }
            return charSequence.hashCode();
        }

        public final CharSequence iobyxmoadg() {
            return this.f87652iobyxmoadg;
        }

        public String toString() {
            return "ShowMessage(message=" + ((Object) this.f87652iobyxmoadg) + ")";
        }
    }

    public static final class zoijcleaow extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f87653iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(String message) {
            super(null);
            zdlpuopuiu.btonecajqb(message, "message");
            this.f87653iobyxmoadg = message;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f87653iobyxmoadg, ((zoijcleaow) obj).f87653iobyxmoadg);
        }

        public int hashCode() {
            return this.f87653iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f87653iobyxmoadg;
        }

        public String toString() {
            return "ShowLimitMessage(message=" + this.f87653iobyxmoadg + ")";
        }
    }

    public /* synthetic */ ppxfxbqfkf(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private ppxfxbqfkf() {
    }
}
