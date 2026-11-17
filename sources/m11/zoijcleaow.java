package m11;

import k01.ojitshcjhn;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import pj.pkzmftpjix;

/* JADX INFO: loaded from: classes5.dex */
public final class zoijcleaow extends zr0.ppxfxbqfkf {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final ojitshcjhn f64949zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f64950iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f64951zoijcleaow;

        public iobyxmoadg(String partnerCode, String article) {
            zdlpuopuiu.btonecajqb(partnerCode, "partnerCode");
            zdlpuopuiu.btonecajqb(article, "article");
            this.f64950iobyxmoadg = partnerCode;
            this.f64951zoijcleaow = article;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f64950iobyxmoadg, iobyxmoadgVar.f64950iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f64951zoijcleaow, iobyxmoadgVar.f64951zoijcleaow);
        }

        public int hashCode() {
            return (this.f64950iobyxmoadg.hashCode() * 31) + this.f64951zoijcleaow.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f64951zoijcleaow;
        }

        public String toString() {
            return "Params(partnerCode=" + this.f64950iobyxmoadg + ", article=" + this.f64951zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f64950iobyxmoadg;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zoijcleaow(ojitshcjhn restaurantRemoteSource, pkzmftpjix dispatcher) {
        super(dispatcher);
        zdlpuopuiu.btonecajqb(restaurantRemoteSource, "restaurantRemoteSource");
        zdlpuopuiu.btonecajqb(dispatcher, "dispatcher");
        this.f64949zoijcleaow = restaurantRemoteSource;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // zr0.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(iobyxmoadg iobyxmoadgVar, gxszxtbevo gxszxtbevoVar) {
        return this.f64949zoijcleaow.iobyxmoadg(iobyxmoadgVar.zoijcleaow(), iobyxmoadgVar.iobyxmoadg(), gxszxtbevoVar);
    }
}
