package mv0;

import java.util.Map;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import pj.pkzmftpjix;
import zr0.ppxfxbqfkf;

/* JADX INFO: loaded from: classes5.dex */
public final class zoijcleaow extends ppxfxbqfkf {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final lv0.iobyxmoadg f68018zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f68019iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final double f68020ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final double f68021zoijcleaow;

        public iobyxmoadg(String str, double d13, double d14) {
            this.f68019iobyxmoadg = str;
            this.f68021zoijcleaow = d13;
            this.f68020ppxfxbqfkf = d14;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f68019iobyxmoadg, iobyxmoadgVar.f68019iobyxmoadg) && Double.compare(this.f68021zoijcleaow, iobyxmoadgVar.f68021zoijcleaow) == 0 && Double.compare(this.f68020ppxfxbqfkf, iobyxmoadgVar.f68020ppxfxbqfkf) == 0;
        }

        public int hashCode() {
            String str = this.f68019iobyxmoadg;
            return ((((str == null ? 0 : str.hashCode()) * 31) + Double.hashCode(this.f68021zoijcleaow)) * 31) + Double.hashCode(this.f68020ppxfxbqfkf);
        }

        public final double iobyxmoadg() {
            return this.f68021zoijcleaow;
        }

        public final String ppxfxbqfkf() {
            return this.f68019iobyxmoadg;
        }

        public String toString() {
            return "Params(searchText=" + this.f68019iobyxmoadg + ", lat=" + this.f68021zoijcleaow + ", lon=" + this.f68020ppxfxbqfkf + ")";
        }

        public final double zoijcleaow() {
            return this.f68020ppxfxbqfkf;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zoijcleaow(lv0.iobyxmoadg searchAddressRemoteSource, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(searchAddressRemoteSource, "searchAddressRemoteSource");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f68018zoijcleaow = searchAddressRemoteSource;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // zr0.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(iobyxmoadg iobyxmoadgVar, gxszxtbevo gxszxtbevoVar) {
        Object objZoijcleaow = this.f68018zoijcleaow.zoijcleaow(iobyxmoadgVar.ppxfxbqfkf(), iobyxmoadgVar.iobyxmoadg(), iobyxmoadgVar.zoijcleaow(), gxszxtbevoVar);
        return objZoijcleaow == mg.zoijcleaow.gxszxtbevo() ? objZoijcleaow : (Map) objZoijcleaow;
    }
}
