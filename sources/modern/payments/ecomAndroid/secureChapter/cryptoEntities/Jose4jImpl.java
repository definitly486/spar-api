package modern.payments.ecomAndroid.secureChapter.cryptoEntities;

import com.google.android.gms.fido.u2f.api.common.ClientData;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import kl.ppxfxbqfkf;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import org.jose4j.lang.InvalidAlgorithmException;
import org.jose4j.lang.InvalidKeyException;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007J\u0016\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b¨\u0006\f"}, d2 = {"Lmodern/payments/ecomAndroid/secureChapter/cryptoEntities/Jose4jImpl;", "", "()V", "createJweEcdhAes", "", "message", "ecPublicKey", "Ljava/security/interfaces/ECPublicKey;", "decrypt", "encryptedMessage", "ecPrivateKey", "Ljava/security/interfaces/ECPrivateKey;", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class Jose4jImpl {
    public final String createJweEcdhAes(String message, ECPublicKey ecPublicKey) throws InvalidKeyException, InvalidAlgorithmException {
        zdlpuopuiu.btonecajqb(message, "message");
        zdlpuopuiu.btonecajqb(ecPublicKey, "ecPublicKey");
        ll.zdlpuopuiu zdlpuopuiuVar = new ll.zdlpuopuiu();
        zdlpuopuiuVar.wypolnanlu(message);
        zdlpuopuiuVar.kcexrzcfyt(ClientData.KEY_TYPE, "JWE");
        zdlpuopuiuVar.ojitshcjhn("ECDH-ES");
        zdlpuopuiuVar.cllcsxoeiz("A128CBC-HS256");
        zdlpuopuiuVar.yggfygwlhe(ecPublicKey);
        String strPmvmpeiblj = zdlpuopuiuVar.pmvmpeiblj();
        zdlpuopuiu.dxjokdxxww(strPmvmpeiblj, "getCompactSerialization(...)");
        return strPmvmpeiblj;
    }

    public final String decrypt(String encryptedMessage, ECPrivateKey ecPrivateKey) {
        zdlpuopuiu.btonecajqb(encryptedMessage, "encryptedMessage");
        zdlpuopuiu.btonecajqb(ecPrivateKey, "ecPrivateKey");
        ll.zdlpuopuiu zdlpuopuiuVar = new ll.zdlpuopuiu();
        ppxfxbqfkf.zoijcleaow zoijcleaowVar = ppxfxbqfkf.zoijcleaow.PERMIT;
        zdlpuopuiuVar.agtfadlqog(new ppxfxbqfkf(zoijcleaowVar, "ECDH-ES"));
        zdlpuopuiuVar.hcddaimhww(new ppxfxbqfkf(zoijcleaowVar, "A128CBC-HS256"));
        zdlpuopuiuVar.rgvfuqvkyq(encryptedMessage);
        zdlpuopuiuVar.yggfygwlhe(ecPrivateKey);
        String strPkzmftpjix = zdlpuopuiuVar.pkzmftpjix();
        zdlpuopuiu.dxjokdxxww(strPkzmftpjix, "getPlaintextString(...)");
        return strPkzmftpjix;
    }
}
