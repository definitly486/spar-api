package ru.myspar.proloyalty.echecks.impl.screen.presentation;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public abstract class ppxfxbqfkf {

    public static final class iobyxmoadg extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f96079iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(String email) {
            super(null);
            zdlpuopuiu.btonecajqb(email, "email");
            this.f96079iobyxmoadg = email;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f96079iobyxmoadg, ((iobyxmoadg) obj).f96079iobyxmoadg);
        }

        public int hashCode() {
            return this.f96079iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f96079iobyxmoadg;
        }

        public String toString() {
            return "EchecksEnabled(email=" + this.f96079iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f96080iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(Throwable error) {
            super(null);
            zdlpuopuiu.btonecajqb(error, "error");
            this.f96080iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f96080iobyxmoadg, ((zoijcleaow) obj).f96080iobyxmoadg);
        }

        public int hashCode() {
            return this.f96080iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f96080iobyxmoadg;
        }

        public String toString() {
            return "ShowError(error=" + this.f96080iobyxmoadg + ")";
        }
    }

    public /* synthetic */ ppxfxbqfkf(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private ppxfxbqfkf() {
    }
}
