package yq0;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import p0.tzroggbefp;

/* JADX INFO: loaded from: classes5.dex */
public interface gxszxtbevo {

    public static final class iobyxmoadg implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final tzroggbefp f126260iobyxmoadg;

        public iobyxmoadg(tzroggbefp value) {
            zdlpuopuiu.btonecajqb(value, "value");
            this.f126260iobyxmoadg = value;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f126260iobyxmoadg, ((iobyxmoadg) obj).f126260iobyxmoadg);
        }

        public int hashCode() {
            return this.f126260iobyxmoadg.hashCode();
        }

        public final tzroggbefp iobyxmoadg() {
            return this.f126260iobyxmoadg;
        }

        public String toString() {
            return "ChangeSearchValue(value=" + this.f126260iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final List f126261iobyxmoadg;

        public ppxfxbqfkf(List cities) {
            zdlpuopuiu.btonecajqb(cities, "cities");
            this.f126261iobyxmoadg = cities;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f126261iobyxmoadg, ((ppxfxbqfkf) obj).f126261iobyxmoadg);
        }

        public int hashCode() {
            return this.f126261iobyxmoadg.hashCode();
        }

        public final List iobyxmoadg() {
            return this.f126261iobyxmoadg;
        }

        public String toString() {
            return "SetCitiesList(cities=" + this.f126261iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f126262iobyxmoadg;

        public zoijcleaow(boolean z13) {
            this.f126262iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && this.f126262iobyxmoadg == ((zoijcleaow) obj).f126262iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f126262iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f126262iobyxmoadg;
        }

        public String toString() {
            return "Loader(isVisible=" + this.f126262iobyxmoadg + ")";
        }
    }
}
