package modern.payments.ecomAndroid.secureChapter;

import android.util.Base64;
import java.security.PublicKey;
import java.security.interfaces.ECPublicKey;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import mj.wkgbmnqykc;
import nl.gtknphoqwx;
import nl.zoijcleaow;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0007\u001a\u00020\u0006*\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lmodern/payments/ecomAndroid/secureChapter/EncryptedDataHandler;", "", "", "ecomPublicKey", "getJwe", "(Ljava/lang/String;Llg/gxszxtbevo;)Ljava/lang/Object;", "Lnl/zoijcleaow;", "decodeEcomPublicKey", "(Ljava/lang/String;)Lnl/zoijcleaow;", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface EncryptedDataHandler {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static zoijcleaow decodeEcomPublicKey(EncryptedDataHandler encryptedDataHandler, String receiver) {
            zdlpuopuiu.btonecajqb(receiver, "$receiver");
            byte[] bArrDecode = Base64.decode(receiver, 0);
            zdlpuopuiu.dxjokdxxww(bArrDecode, "decode(...)");
            gtknphoqwx gtknphoqwxVarIobyxmoadg = gtknphoqwx.iobyxmoadg.iobyxmoadg(new String(bArrDecode, wkgbmnqykc.f67326zoijcleaow));
            PublicKey publicKeyCdpycssgdh = gtknphoqwxVarIobyxmoadg.cdpycssgdh();
            zdlpuopuiu.nufgyqmvbu(publicKeyCdpycssgdh, "null cannot be cast to non-null type java.security.interfaces.ECPublicKey");
            zoijcleaow zoijcleaowVar = new zoijcleaow((ECPublicKey) publicKeyCdpycssgdh);
            zoijcleaowVar.kcexrzcfyt(gtknphoqwxVarIobyxmoadg.lqeggnwhkg());
            return zoijcleaowVar;
        }
    }

    zoijcleaow decodeEcomPublicKey(String str);

    Object getJwe(String str, gxszxtbevo<? super String> gxszxtbevoVar);
}
