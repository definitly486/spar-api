package ru.myspar.echecks.impl.dialog.presentation;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ppxfxbqfkf {

    public static final class iobyxmoadg extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f88226iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return -1316146250;
        }

        public String toString() {
            return "Dismiss";
        }
    }

    /* JADX INFO: renamed from: ru.myspar.echecks.impl.dialog.presentation.ppxfxbqfkf$ppxfxbqfkf, reason: collision with other inner class name */
    public static final class C2021ppxfxbqfkf extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f88227iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2021ppxfxbqfkf(String email) {
            super(null);
            zdlpuopuiu.btonecajqb(email, "email");
            this.f88227iobyxmoadg = email;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2021ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f88227iobyxmoadg, ((C2021ppxfxbqfkf) obj).f88227iobyxmoadg);
        }

        public int hashCode() {
            return this.f88227iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f88227iobyxmoadg;
        }

        public String toString() {
            return "SuccessDialog(email=" + this.f88227iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f88228iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(Throwable throwable) {
            super(null);
            zdlpuopuiu.btonecajqb(throwable, "throwable");
            this.f88228iobyxmoadg = throwable;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f88228iobyxmoadg, ((zoijcleaow) obj).f88228iobyxmoadg);
        }

        public int hashCode() {
            return this.f88228iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f88228iobyxmoadg;
        }

        public String toString() {
            return "ShowError(throwable=" + this.f88228iobyxmoadg + ")";
        }
    }

    public /* synthetic */ ppxfxbqfkf(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private ppxfxbqfkf() {
    }
}
