package sw;

import ft.ppxfxbqfkf;
import java.util.Map;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import pj.pkzmftpjix;

/* JADX INFO: loaded from: classes4.dex */
public final class zoijcleaow extends ppxfxbqfkf {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final rw.iobyxmoadg f108581zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f108582iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final double f108583ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final double f108584zoijcleaow;

        public iobyxmoadg(String str, double d13, double d14) {
            this.f108582iobyxmoadg = str;
            this.f108584zoijcleaow = d13;
            this.f108583ppxfxbqfkf = d14;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f108582iobyxmoadg, iobyxmoadgVar.f108582iobyxmoadg) && Double.compare(this.f108584zoijcleaow, iobyxmoadgVar.f108584zoijcleaow) == 0 && Double.compare(this.f108583ppxfxbqfkf, iobyxmoadgVar.f108583ppxfxbqfkf) == 0;
        }

        public int hashCode() {
            String str = this.f108582iobyxmoadg;
            return ((((str == null ? 0 : str.hashCode()) * 31) + Double.hashCode(this.f108584zoijcleaow)) * 31) + Double.hashCode(this.f108583ppxfxbqfkf);
        }

        public final double iobyxmoadg() {
            return this.f108584zoijcleaow;
        }

        public final String ppxfxbqfkf() {
            return this.f108582iobyxmoadg;
        }

        public String toString() {
            return "Params(searchText=" + this.f108582iobyxmoadg + ", lat=" + this.f108584zoijcleaow + ", lon=" + this.f108583ppxfxbqfkf + ")";
        }

        public final double zoijcleaow() {
            return this.f108583ppxfxbqfkf;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zoijcleaow(rw.iobyxmoadg searchAddressRemoteSource, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(searchAddressRemoteSource, "searchAddressRemoteSource");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f108581zoijcleaow = searchAddressRemoteSource;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ft.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(iobyxmoadg iobyxmoadgVar, gxszxtbevo gxszxtbevoVar) {
        Object objZoijcleaow = this.f108581zoijcleaow.zoijcleaow(iobyxmoadgVar.ppxfxbqfkf(), iobyxmoadgVar.iobyxmoadg(), iobyxmoadgVar.zoijcleaow(), gxszxtbevoVar);
        return objZoijcleaow == mg.zoijcleaow.gxszxtbevo() ? objZoijcleaow : (Map) objZoijcleaow;
    }
}
