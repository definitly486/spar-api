package rm;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public interface wkgbmnqykc {

    public static final class iobyxmoadg implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f83128iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final boolean f83129ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final rm.zoijcleaow f83130zoijcleaow;

        public iobyxmoadg(boolean z13, rm.zoijcleaow addressType) {
            zdlpuopuiu.btonecajqb(addressType, "addressType");
            this.f83128iobyxmoadg = z13;
            this.f83130zoijcleaow = addressType;
            this.f83129ppxfxbqfkf = true;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return this.f83128iobyxmoadg == iobyxmoadgVar.f83128iobyxmoadg && this.f83130zoijcleaow == iobyxmoadgVar.f83130zoijcleaow;
        }

        public int hashCode() {
            return (Boolean.hashCode(this.f83128iobyxmoadg) * 31) + this.f83130zoijcleaow.hashCode();
        }

        @Override // rm.wkgbmnqykc
        public boolean iobyxmoadg() {
            return this.f83128iobyxmoadg;
        }

        @Override // rm.wkgbmnqykc
        public boolean ppxfxbqfkf() {
            return this.f83129ppxfxbqfkf;
        }

        public String toString() {
            return "Default(hasUserAnyAddress=" + this.f83128iobyxmoadg + ", addressType=" + this.f83130zoijcleaow + ")";
        }

        @Override // rm.wkgbmnqykc
        public rm.zoijcleaow zoijcleaow() {
            return this.f83130zoijcleaow;
        }
    }

    public static final class zoijcleaow implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f83131iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final rm.zoijcleaow f83132ppxfxbqfkf = rm.zoijcleaow.PickUp;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final boolean f83133zoijcleaow;

        public zoijcleaow(boolean z13) {
            this.f83131iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && this.f83131iobyxmoadg == ((zoijcleaow) obj).f83131iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f83131iobyxmoadg);
        }

        @Override // rm.wkgbmnqykc
        public boolean iobyxmoadg() {
            return this.f83131iobyxmoadg;
        }

        @Override // rm.wkgbmnqykc
        public boolean ppxfxbqfkf() {
            return this.f83133zoijcleaow;
        }

        public String toString() {
            return "OnlyPickUp(hasUserAnyAddress=" + this.f83131iobyxmoadg + ")";
        }

        @Override // rm.wkgbmnqykc
        public rm.zoijcleaow zoijcleaow() {
            return this.f83132ppxfxbqfkf;
        }
    }

    boolean iobyxmoadg();

    boolean ppxfxbqfkf();

    rm.zoijcleaow zoijcleaow();
}
