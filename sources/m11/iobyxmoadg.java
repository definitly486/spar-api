package m11;

import k01.ojitshcjhn;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import pj.pkzmftpjix;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg extends zr0.ppxfxbqfkf {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public static final C1354iobyxmoadg f64940ppxfxbqfkf = new C1354iobyxmoadg(null);

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final ojitshcjhn f64941zoijcleaow;

    /* JADX INFO: renamed from: m11.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C1354iobyxmoadg {
        public /* synthetic */ C1354iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private C1354iobyxmoadg() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(ojitshcjhn restaurantRemoteSource, pkzmftpjix dispatcher) {
        super(dispatcher);
        zdlpuopuiu.btonecajqb(restaurantRemoteSource, "restaurantRemoteSource");
        zdlpuopuiu.btonecajqb(dispatcher, "dispatcher");
        this.f64941zoijcleaow = restaurantRemoteSource;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // zr0.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(zoijcleaow zoijcleaowVar, gxszxtbevo gxszxtbevoVar) {
        return this.f64941zoijcleaow.zoijcleaow(zoijcleaowVar.iobyxmoadg(), zoijcleaowVar.ppxfxbqfkf(), zoijcleaowVar.zoijcleaow(), gxszxtbevoVar);
    }

    public static final class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f64942iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final int f64943ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f64944zoijcleaow;

        public zoijcleaow(String partnerCode, String str, int i13) {
            zdlpuopuiu.btonecajqb(partnerCode, "partnerCode");
            this.f64942iobyxmoadg = partnerCode;
            this.f64944zoijcleaow = str;
            this.f64943ppxfxbqfkf = i13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zoijcleaow)) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return zdlpuopuiu.eablkybsjg(this.f64942iobyxmoadg, zoijcleaowVar.f64942iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f64944zoijcleaow, zoijcleaowVar.f64944zoijcleaow) && this.f64943ppxfxbqfkf == zoijcleaowVar.f64943ppxfxbqfkf;
        }

        public int hashCode() {
            int iHashCode = this.f64942iobyxmoadg.hashCode() * 31;
            String str = this.f64944zoijcleaow;
            return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.f64943ppxfxbqfkf);
        }

        public final String iobyxmoadg() {
            return this.f64942iobyxmoadg;
        }

        public final String ppxfxbqfkf() {
            return this.f64944zoijcleaow;
        }

        public String toString() {
            return "Params(partnerCode=" + this.f64942iobyxmoadg + ", sectionCode=" + this.f64944zoijcleaow + ", productsPage=" + this.f64943ppxfxbqfkf + ")";
        }

        public final int zoijcleaow() {
            return this.f64943ppxfxbqfkf;
        }

        public /* synthetic */ zoijcleaow(String str, String str2, int i13, int i14, gtknphoqwx gtknphoqwxVar) {
            this(str, (i14 & 2) != 0 ? null : str2, (i14 & 4) != 0 ? 1 : i13);
        }
    }
}
