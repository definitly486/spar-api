package nl;

import java.security.KeyPair;
import java.security.SecureRandom;
import org.jose4j.lang.JoseException;
import ql.jyumaefscl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class btonecajqb {
    public static nufgyqmvbu iobyxmoadg(String str, String str2, SecureRandom secureRandom) throws JoseException {
        jyumaefscl jyumaefsclVarLqeggnwhkg = jyumaefscl.lqeggnwhkg(str, str2, secureRandom);
        if (jyumaefsclVarLqeggnwhkg != null) {
            KeyPair keyPairEablkybsjg = jyumaefsclVarLqeggnwhkg.eablkybsjg(str);
            nufgyqmvbu nufgyqmvbuVar = (nufgyqmvbu) gtknphoqwx.iobyxmoadg.ppxfxbqfkf(keyPairEablkybsjg.getPublic());
            nufgyqmvbuVar.wwaezpbzkn(keyPairEablkybsjg.getPrivate());
            return nufgyqmvbuVar;
        }
        throw new IllegalArgumentException("Cannot create OKP JWK. The subtype/crv \"" + str + "\" is unknown or unsupported.");
    }
}
