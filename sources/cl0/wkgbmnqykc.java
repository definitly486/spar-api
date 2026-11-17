package cl0;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public interface wkgbmnqykc {

    public static final class iobyxmoadg implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f20006iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final boolean f20007ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final zoijcleaow f20008zoijcleaow;

        public iobyxmoadg(boolean z13, zoijcleaow addressType) {
            zdlpuopuiu.btonecajqb(addressType, "addressType");
            this.f20006iobyxmoadg = z13;
            this.f20008zoijcleaow = addressType;
            this.f20007ppxfxbqfkf = true;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return this.f20006iobyxmoadg == iobyxmoadgVar.f20006iobyxmoadg && this.f20008zoijcleaow == iobyxmoadgVar.f20008zoijcleaow;
        }

        public int hashCode() {
            return (Boolean.hashCode(this.f20006iobyxmoadg) * 31) + this.f20008zoijcleaow.hashCode();
        }

        @Override // cl0.wkgbmnqykc
        public boolean iobyxmoadg() {
            return this.f20006iobyxmoadg;
        }

        @Override // cl0.wkgbmnqykc
        public boolean ppxfxbqfkf() {
            return this.f20007ppxfxbqfkf;
        }

        public String toString() {
            return "Default(hasUserAnyAddress=" + this.f20006iobyxmoadg + ", addressType=" + this.f20008zoijcleaow + ")";
        }

        @Override // cl0.wkgbmnqykc
        public zoijcleaow zoijcleaow() {
            return this.f20008zoijcleaow;
        }
    }

    boolean iobyxmoadg();

    boolean ppxfxbqfkf();

    zoijcleaow zoijcleaow();
}
