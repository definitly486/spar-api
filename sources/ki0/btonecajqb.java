package ki0;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public interface btonecajqb {

    public static final class iobyxmoadg implements btonecajqb {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f55672iobyxmoadg;

        public iobyxmoadg(String value) {
            zdlpuopuiu.btonecajqb(value, "value");
            this.f55672iobyxmoadg = value;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f55672iobyxmoadg, ((iobyxmoadg) obj).f55672iobyxmoadg);
        }

        public int hashCode() {
            return this.f55672iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f55672iobyxmoadg;
        }

        public String toString() {
            return "Line(value=" + this.f55672iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow implements btonecajqb {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final iobyxmoadg f55673iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final boolean f55674zoijcleaow;

        public enum iobyxmoadg {
            HEADERS("HEADERS"),
            BODY("BODY");


            /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
            private static final /* synthetic */ ng.iobyxmoadg f55675cqumvgiudr = ng.zoijcleaow.iobyxmoadg(iobyxmoadg());

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            private final String f55679zdlpuopuiu;

            iobyxmoadg(String str) {
                this.f55679zdlpuopuiu = str;
            }

            public final String wkgbmnqykc() {
                return this.f55679zdlpuopuiu;
            }
        }

        public zoijcleaow(iobyxmoadg type, boolean z13) {
            zdlpuopuiu.btonecajqb(type, "type");
            this.f55673iobyxmoadg = type;
            this.f55674zoijcleaow = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zoijcleaow)) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return this.f55673iobyxmoadg == zoijcleaowVar.f55673iobyxmoadg && this.f55674zoijcleaow == zoijcleaowVar.f55674zoijcleaow;
        }

        public int hashCode() {
            return (this.f55673iobyxmoadg.hashCode() * 31) + Boolean.hashCode(this.f55674zoijcleaow);
        }

        public final iobyxmoadg iobyxmoadg() {
            return this.f55673iobyxmoadg;
        }

        public String toString() {
            return "Title(type=" + this.f55673iobyxmoadg + ", isOpen=" + this.f55674zoijcleaow + ")";
        }

        public final boolean zoijcleaow() {
            return this.f55674zoijcleaow;
        }
    }
}
