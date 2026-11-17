package xe;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class ojitshcjhn implements com.google.zxing.eablkybsjg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final btonecajqb f122214iobyxmoadg = new btonecajqb();

    @Override // com.google.zxing.eablkybsjg
    public te.zoijcleaow iobyxmoadg(String str, com.google.zxing.iobyxmoadg iobyxmoadgVar, int i13, int i14, Map map) {
        if (iobyxmoadgVar == com.google.zxing.iobyxmoadg.UPC_A) {
            return this.f122214iobyxmoadg.iobyxmoadg(CommonUrlParts.Values.FALSE_INTEGER.concat(String.valueOf(str)), com.google.zxing.iobyxmoadg.EAN_13, i13, i14, map);
        }
        throw new IllegalArgumentException("Can only encode UPC-A, but got ".concat(String.valueOf(iobyxmoadgVar)));
    }
}
