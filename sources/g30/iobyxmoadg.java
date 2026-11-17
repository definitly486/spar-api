package g30;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import pj.pkzmftpjix;
import w10.ojitshcjhn;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg extends ft.ppxfxbqfkf {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public static final C0814iobyxmoadg f36132ppxfxbqfkf = new C0814iobyxmoadg(null);

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final ojitshcjhn f36133zoijcleaow;

    /* JADX INFO: renamed from: g30.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C0814iobyxmoadg {
        public /* synthetic */ C0814iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private C0814iobyxmoadg() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(ojitshcjhn restaurantRemoteSource, pkzmftpjix dispatcher) {
        super(dispatcher);
        zdlpuopuiu.btonecajqb(restaurantRemoteSource, "restaurantRemoteSource");
        zdlpuopuiu.btonecajqb(dispatcher, "dispatcher");
        this.f36133zoijcleaow = restaurantRemoteSource;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ft.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(zoijcleaow zoijcleaowVar, gxszxtbevo gxszxtbevoVar) {
        return this.f36133zoijcleaow.zoijcleaow(zoijcleaowVar.iobyxmoadg(), zoijcleaowVar.ppxfxbqfkf(), zoijcleaowVar.zoijcleaow(), gxszxtbevoVar);
    }

    public static final class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f36134iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final int f36135ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f36136zoijcleaow;

        public zoijcleaow(String partnerCode, String str, int i13) {
            zdlpuopuiu.btonecajqb(partnerCode, "partnerCode");
            this.f36134iobyxmoadg = partnerCode;
            this.f36136zoijcleaow = str;
            this.f36135ppxfxbqfkf = i13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zoijcleaow)) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return zdlpuopuiu.eablkybsjg(this.f36134iobyxmoadg, zoijcleaowVar.f36134iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f36136zoijcleaow, zoijcleaowVar.f36136zoijcleaow) && this.f36135ppxfxbqfkf == zoijcleaowVar.f36135ppxfxbqfkf;
        }

        public int hashCode() {
            int iHashCode = this.f36134iobyxmoadg.hashCode() * 31;
            String str = this.f36136zoijcleaow;
            return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.f36135ppxfxbqfkf);
        }

        public final String iobyxmoadg() {
            return this.f36134iobyxmoadg;
        }

        public final String ppxfxbqfkf() {
            return this.f36136zoijcleaow;
        }

        public String toString() {
            return "Params(partnerCode=" + this.f36134iobyxmoadg + ", sectionCode=" + this.f36136zoijcleaow + ", productsPage=" + this.f36135ppxfxbqfkf + ")";
        }

        public final int zoijcleaow() {
            return this.f36135ppxfxbqfkf;
        }

        public /* synthetic */ zoijcleaow(String str, String str2, int i13, int i14, gtknphoqwx gtknphoqwxVar) {
            this(str, (i14 & 2) != 0 ? null : str2, (i14 & 4) != 0 ? 1 : i13);
        }
    }
}
