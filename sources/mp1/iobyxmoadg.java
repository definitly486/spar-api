package mp1;

import java.util.List;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;
import ru.myspar.proloyalty.scango.impl.screens.scan.shop.domain.model.ShopQrPayload;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg extends zr0.zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final C1440iobyxmoadg f67810iobyxmoadg = new C1440iobyxmoadg(null);

    /* JADX INFO: renamed from: mp1.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C1440iobyxmoadg {
        public /* synthetic */ C1440iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private C1440iobyxmoadg() {
        }
    }

    public static final class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f67811iobyxmoadg;

        public zoijcleaow(String result) {
            zdlpuopuiu.btonecajqb(result, "result");
            this.f67811iobyxmoadg = result;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f67811iobyxmoadg, ((zoijcleaow) obj).f67811iobyxmoadg);
        }

        public int hashCode() {
            return this.f67811iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f67811iobyxmoadg;
        }

        public String toString() {
            return "Params(result=" + this.f67811iobyxmoadg + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // zr0.zoijcleaow
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public ShopQrPayload iobyxmoadg(zoijcleaow parameters) {
        zdlpuopuiu.btonecajqb(parameters, "parameters");
        List listMhtqkkgtqm = kcexrzcfyt.mhtqkkgtqm(parameters.iobyxmoadg(), new char[]{'|'}, false, 0, 6, null);
        if (listMhtqkkgtqm.size() != 3) {
            return null;
        }
        try {
            return new ShopQrPayload(Long.parseLong(kcexrzcfyt.p((String) listMhtqkkgtqm.get(1)).toString()), kcexrzcfyt.p((String) listMhtqkkgtqm.get(2)).toString());
        } catch (NumberFormatException unused) {
            return null;
        }
    }
}
