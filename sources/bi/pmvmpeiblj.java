package bi;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public final class pmvmpeiblj {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public static final iobyxmoadg f16327zoijcleaow = new iobyxmoadg(null);

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f16328iobyxmoadg;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final pmvmpeiblj eablkybsjg(pmvmpeiblj signature, int i13) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(signature, "signature");
            return new pmvmpeiblj(signature.iobyxmoadg() + '@' + i13, null);
        }

        public final pmvmpeiblj iobyxmoadg(String name, String desc) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(name, "name");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(desc, "desc");
            return new pmvmpeiblj(name + '#' + desc, null);
        }

        public final pmvmpeiblj ppxfxbqfkf(fi.ppxfxbqfkf nameResolver, gi.iobyxmoadg.ppxfxbqfkf signature) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(nameResolver, "nameResolver");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(signature, "signature");
            return wkgbmnqykc(nameResolver.getString(signature.pmvmpeiblj()), nameResolver.getString(signature.lereixgezr()));
        }

        public final pmvmpeiblj wkgbmnqykc(String name, String desc) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(name, "name");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(desc, "desc");
            return new pmvmpeiblj(name + desc, null);
        }

        public final pmvmpeiblj zoijcleaow(hi.wkgbmnqykc signature) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(signature, "signature");
            if (signature instanceof hi.wkgbmnqykc.zoijcleaow) {
                hi.wkgbmnqykc.zoijcleaow zoijcleaowVar = (hi.wkgbmnqykc.zoijcleaow) signature;
                return wkgbmnqykc(zoijcleaowVar.eablkybsjg(), zoijcleaowVar.wkgbmnqykc());
            }
            if (!(signature instanceof hi.wkgbmnqykc.iobyxmoadg)) {
                throw new NoWhenBranchMatchedException();
            }
            hi.wkgbmnqykc.iobyxmoadg iobyxmoadgVar = (hi.wkgbmnqykc.iobyxmoadg) signature;
            return iobyxmoadg(iobyxmoadgVar.eablkybsjg(), iobyxmoadgVar.wkgbmnqykc());
        }

        private iobyxmoadg() {
        }
    }

    public /* synthetic */ pmvmpeiblj(String str, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pmvmpeiblj) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f16328iobyxmoadg, ((pmvmpeiblj) obj).f16328iobyxmoadg);
    }

    public int hashCode() {
        return this.f16328iobyxmoadg.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f16328iobyxmoadg;
    }

    public String toString() {
        return "MemberSignature(signature=" + this.f16328iobyxmoadg + ')';
    }

    private pmvmpeiblj(String str) {
        this.f16328iobyxmoadg = str;
    }
}
