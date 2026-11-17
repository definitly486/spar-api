package hi;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public abstract class wkgbmnqykc {

    public static final class iobyxmoadg extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f40434iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f40435zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(String name, String desc) {
            super(null);
            zdlpuopuiu.btonecajqb(name, "name");
            zdlpuopuiu.btonecajqb(desc, "desc");
            this.f40434iobyxmoadg = name;
            this.f40435zoijcleaow = desc;
        }

        public String eablkybsjg() {
            return this.f40434iobyxmoadg;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f40434iobyxmoadg, iobyxmoadgVar.f40434iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f40435zoijcleaow, iobyxmoadgVar.f40435zoijcleaow);
        }

        public int hashCode() {
            return (this.f40434iobyxmoadg.hashCode() * 31) + this.f40435zoijcleaow.hashCode();
        }

        @Override // hi.wkgbmnqykc
        public String iobyxmoadg() {
            return eablkybsjg() + ':' + wkgbmnqykc();
        }

        public final String ppxfxbqfkf() {
            return this.f40435zoijcleaow;
        }

        public String wkgbmnqykc() {
            return this.f40435zoijcleaow;
        }

        public final String zoijcleaow() {
            return this.f40434iobyxmoadg;
        }
    }

    public static final class zoijcleaow extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f40436iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f40437zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(String name, String desc) {
            super(null);
            zdlpuopuiu.btonecajqb(name, "name");
            zdlpuopuiu.btonecajqb(desc, "desc");
            this.f40436iobyxmoadg = name;
            this.f40437zoijcleaow = desc;
        }

        public static /* synthetic */ zoijcleaow ppxfxbqfkf(zoijcleaow zoijcleaowVar, String str, String str2, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = zoijcleaowVar.f40436iobyxmoadg;
            }
            if ((i13 & 2) != 0) {
                str2 = zoijcleaowVar.f40437zoijcleaow;
            }
            return zoijcleaowVar.zoijcleaow(str, str2);
        }

        public String eablkybsjg() {
            return this.f40436iobyxmoadg;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zoijcleaow)) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return zdlpuopuiu.eablkybsjg(this.f40436iobyxmoadg, zoijcleaowVar.f40436iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f40437zoijcleaow, zoijcleaowVar.f40437zoijcleaow);
        }

        public int hashCode() {
            return (this.f40436iobyxmoadg.hashCode() * 31) + this.f40437zoijcleaow.hashCode();
        }

        @Override // hi.wkgbmnqykc
        public String iobyxmoadg() {
            return eablkybsjg() + wkgbmnqykc();
        }

        public String wkgbmnqykc() {
            return this.f40437zoijcleaow;
        }

        public final zoijcleaow zoijcleaow(String name, String desc) {
            zdlpuopuiu.btonecajqb(name, "name");
            zdlpuopuiu.btonecajqb(desc, "desc");
            return new zoijcleaow(name, desc);
        }
    }

    public /* synthetic */ wkgbmnqykc(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    public abstract String iobyxmoadg();

    public final String toString() {
        return iobyxmoadg();
    }

    private wkgbmnqykc() {
    }
}
