package sh;

import java.util.Arrays;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public interface yggfygwlhe {
    Set iobyxmoadg(ii.ppxfxbqfkf ppxfxbqfkfVar);

    zh.lqeggnwhkg ppxfxbqfkf(iobyxmoadg iobyxmoadgVar);

    zh.yggfygwlhe zoijcleaow(ii.ppxfxbqfkf ppxfxbqfkfVar, boolean z13);

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ii.zoijcleaow f106642iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final zh.lqeggnwhkg f106643ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final byte[] f106644zoijcleaow;

        public iobyxmoadg(ii.zoijcleaow classId, byte[] bArr, zh.lqeggnwhkg lqeggnwhkgVar) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(classId, "classId");
            this.f106642iobyxmoadg = classId;
            this.f106644zoijcleaow = bArr;
            this.f106643ppxfxbqfkf = lqeggnwhkgVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f106642iobyxmoadg, iobyxmoadgVar.f106642iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f106644zoijcleaow, iobyxmoadgVar.f106644zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f106643ppxfxbqfkf, iobyxmoadgVar.f106643ppxfxbqfkf);
        }

        public int hashCode() {
            int iHashCode = this.f106642iobyxmoadg.hashCode() * 31;
            byte[] bArr = this.f106644zoijcleaow;
            int iHashCode2 = (iHashCode + (bArr == null ? 0 : Arrays.hashCode(bArr))) * 31;
            zh.lqeggnwhkg lqeggnwhkgVar = this.f106643ppxfxbqfkf;
            return iHashCode2 + (lqeggnwhkgVar != null ? lqeggnwhkgVar.hashCode() : 0);
        }

        public final ii.zoijcleaow iobyxmoadg() {
            return this.f106642iobyxmoadg;
        }

        public String toString() {
            return "Request(classId=" + this.f106642iobyxmoadg + ", previouslyFoundClassFileContent=" + Arrays.toString(this.f106644zoijcleaow) + ", outerClass=" + this.f106643ppxfxbqfkf + ')';
        }

        public /* synthetic */ iobyxmoadg(ii.zoijcleaow zoijcleaowVar, byte[] bArr, zh.lqeggnwhkg lqeggnwhkgVar, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this(zoijcleaowVar, (i13 & 2) != 0 ? null : bArr, (i13 & 4) != 0 ? null : lqeggnwhkgVar);
        }
    }
}
