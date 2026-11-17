package g30;

import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import pj.pkzmftpjix;
import w10.ojitshcjhn;

/* JADX INFO: loaded from: classes4.dex */
public final class zoijcleaow extends ft.ppxfxbqfkf {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final ojitshcjhn f36141zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f36142iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f36143zoijcleaow;

        public iobyxmoadg(String partnerCode, String article) {
            zdlpuopuiu.btonecajqb(partnerCode, "partnerCode");
            zdlpuopuiu.btonecajqb(article, "article");
            this.f36142iobyxmoadg = partnerCode;
            this.f36143zoijcleaow = article;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f36142iobyxmoadg, iobyxmoadgVar.f36142iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f36143zoijcleaow, iobyxmoadgVar.f36143zoijcleaow);
        }

        public int hashCode() {
            return (this.f36142iobyxmoadg.hashCode() * 31) + this.f36143zoijcleaow.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f36143zoijcleaow;
        }

        public String toString() {
            return "Params(partnerCode=" + this.f36142iobyxmoadg + ", article=" + this.f36143zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f36142iobyxmoadg;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zoijcleaow(ojitshcjhn restaurantRemoteSource, pkzmftpjix dispatcher) {
        super(dispatcher);
        zdlpuopuiu.btonecajqb(restaurantRemoteSource, "restaurantRemoteSource");
        zdlpuopuiu.btonecajqb(dispatcher, "dispatcher");
        this.f36141zoijcleaow = restaurantRemoteSource;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ft.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(iobyxmoadg iobyxmoadgVar, gxszxtbevo gxszxtbevoVar) {
        return this.f36141zoijcleaow.iobyxmoadg(iobyxmoadgVar.zoijcleaow(), iobyxmoadgVar.iobyxmoadg(), gxszxtbevoVar);
    }
}
