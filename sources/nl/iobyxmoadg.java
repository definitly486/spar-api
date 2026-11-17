package nl;

import java.security.KeyPair;
import java.security.SecureRandom;
import java.security.spec.ECParameterSpec;
import org.jose4j.lang.JoseException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class iobyxmoadg {
    public static zoijcleaow iobyxmoadg(ECParameterSpec eCParameterSpec, String str, SecureRandom secureRandom) throws JoseException {
        KeyPair keyPairEablkybsjg = new ql.ppxfxbqfkf(str, secureRandom).eablkybsjg(eCParameterSpec);
        zoijcleaow zoijcleaowVar = (zoijcleaow) gtknphoqwx.iobyxmoadg.ppxfxbqfkf(keyPairEablkybsjg.getPublic());
        zoijcleaowVar.wwaezpbzkn(keyPairEablkybsjg.getPrivate());
        return zoijcleaowVar;
    }
}
