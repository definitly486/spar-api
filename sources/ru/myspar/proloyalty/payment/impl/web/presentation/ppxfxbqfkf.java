package ru.myspar.proloyalty.payment.impl.web.presentation;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ppxfxbqfkf {

    public static final class iobyxmoadg extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f99227iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return 1003553852;
        }

        public String toString() {
            return "ShowConfirmExitPopup";
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.payment.impl.web.presentation.ppxfxbqfkf$ppxfxbqfkf, reason: collision with other inner class name */
    public static final class C2372ppxfxbqfkf extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final CharSequence f99228iobyxmoadg;

        public C2372ppxfxbqfkf(CharSequence charSequence) {
            super(null);
            this.f99228iobyxmoadg = charSequence;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2372ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f99228iobyxmoadg, ((C2372ppxfxbqfkf) obj).f99228iobyxmoadg);
        }

        public int hashCode() {
            CharSequence charSequence = this.f99228iobyxmoadg;
            if (charSequence == null) {
                return 0;
            }
            return charSequence.hashCode();
        }

        public final CharSequence iobyxmoadg() {
            return this.f99228iobyxmoadg;
        }

        public String toString() {
            return "ShowMessage(message=" + ((Object) this.f99228iobyxmoadg) + ")";
        }
    }

    public static final class zoijcleaow extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f99229iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(Throwable error) {
            super(null);
            zdlpuopuiu.btonecajqb(error, "error");
            this.f99229iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f99229iobyxmoadg, ((zoijcleaow) obj).f99229iobyxmoadg);
        }

        public int hashCode() {
            return this.f99229iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f99229iobyxmoadg;
        }

        public String toString() {
            return "ShowError(error=" + this.f99229iobyxmoadg + ")";
        }
    }

    public /* synthetic */ ppxfxbqfkf(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private ppxfxbqfkf() {
    }
}
