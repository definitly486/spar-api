package ru.myspar.echecks.impl.screen.presentation;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ppxfxbqfkf {

    public static final class iobyxmoadg extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f88257iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(String email) {
            super(null);
            zdlpuopuiu.btonecajqb(email, "email");
            this.f88257iobyxmoadg = email;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f88257iobyxmoadg, ((iobyxmoadg) obj).f88257iobyxmoadg);
        }

        public int hashCode() {
            return this.f88257iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f88257iobyxmoadg;
        }

        public String toString() {
            return "EchecksEnabled(email=" + this.f88257iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f88258iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(Throwable error) {
            super(null);
            zdlpuopuiu.btonecajqb(error, "error");
            this.f88258iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f88258iobyxmoadg, ((zoijcleaow) obj).f88258iobyxmoadg);
        }

        public int hashCode() {
            return this.f88258iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f88258iobyxmoadg;
        }

        public String toString() {
            return "ShowError(error=" + this.f88258iobyxmoadg + ")";
        }
    }

    public /* synthetic */ ppxfxbqfkf(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private ppxfxbqfkf() {
    }
}
