package ru.myspar.payment.impl.web.presentation;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ppxfxbqfkf {

    public static final class iobyxmoadg extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f91576iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return 169985881;
        }

        public String toString() {
            return "ShowConfirmExitPopup";
        }
    }

    /* JADX INFO: renamed from: ru.myspar.payment.impl.web.presentation.ppxfxbqfkf$ppxfxbqfkf, reason: collision with other inner class name */
    public static final class C2125ppxfxbqfkf extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final CharSequence f91577iobyxmoadg;

        public C2125ppxfxbqfkf(CharSequence charSequence) {
            super(null);
            this.f91577iobyxmoadg = charSequence;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2125ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f91577iobyxmoadg, ((C2125ppxfxbqfkf) obj).f91577iobyxmoadg);
        }

        public int hashCode() {
            CharSequence charSequence = this.f91577iobyxmoadg;
            if (charSequence == null) {
                return 0;
            }
            return charSequence.hashCode();
        }

        public final CharSequence iobyxmoadg() {
            return this.f91577iobyxmoadg;
        }

        public String toString() {
            return "ShowMessage(message=" + ((Object) this.f91577iobyxmoadg) + ")";
        }
    }

    public static final class zoijcleaow extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f91578iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(Throwable error) {
            super(null);
            zdlpuopuiu.btonecajqb(error, "error");
            this.f91578iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f91578iobyxmoadg, ((zoijcleaow) obj).f91578iobyxmoadg);
        }

        public int hashCode() {
            return this.f91578iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f91578iobyxmoadg;
        }

        public String toString() {
            return "ShowError(error=" + this.f91578iobyxmoadg + ")";
        }
    }

    public /* synthetic */ ppxfxbqfkf(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private ppxfxbqfkf() {
    }
}
