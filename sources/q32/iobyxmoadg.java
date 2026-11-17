package q32;

import java.util.List;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;
import ru.myspar.scango.impl.screens.scan.shop.domain.model.ShopQrPayload;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg extends ft.zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final C1739iobyxmoadg f77798iobyxmoadg = new C1739iobyxmoadg(null);

    /* JADX INFO: renamed from: q32.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C1739iobyxmoadg {
        public /* synthetic */ C1739iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private C1739iobyxmoadg() {
        }
    }

    public static final class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f77799iobyxmoadg;

        public zoijcleaow(String result) {
            zdlpuopuiu.btonecajqb(result, "result");
            this.f77799iobyxmoadg = result;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f77799iobyxmoadg, ((zoijcleaow) obj).f77799iobyxmoadg);
        }

        public int hashCode() {
            return this.f77799iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f77799iobyxmoadg;
        }

        public String toString() {
            return "Params(result=" + this.f77799iobyxmoadg + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ft.zoijcleaow
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
