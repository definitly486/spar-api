package ql;

import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;
import java.security.Security;
import java.util.Set;
import org.jose4j.lang.JoseException;

/* JADX INFO: loaded from: classes3.dex */
abstract class oxmwwwfdhm {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    protected String f79088iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    protected SecureRandom f79089zoijcleaow;

    protected oxmwwwfdhm(String str, SecureRandom secureRandom) {
        this.f79088iobyxmoadg = str;
        this.f79089zoijcleaow = secureRandom;
    }

    abstract String iobyxmoadg();

    protected KeyPairGenerator ppxfxbqfkf() throws JoseException {
        String strIobyxmoadg = iobyxmoadg();
        try {
            String str = this.f79088iobyxmoadg;
            return str == null ? KeyPairGenerator.getInstance(strIobyxmoadg) : KeyPairGenerator.getInstance(strIobyxmoadg, str);
        } catch (NoSuchAlgorithmException e13) {
            throw new JoseException("Couldn't find " + strIobyxmoadg + " KeyPairGenerator! " + e13, e13);
        } catch (NoSuchProviderException e14) {
            throw new JoseException("Cannot get KeyPairGenerator instance with provider " + this.f79088iobyxmoadg, e14);
        }
    }

    public boolean wkgbmnqykc() {
        Set<String> algorithms = Security.getAlgorithms("KeyFactory");
        Set<String> algorithms2 = Security.getAlgorithms("KeyPairGenerator");
        String strIobyxmoadg = iobyxmoadg();
        return algorithms2.contains(strIobyxmoadg) && algorithms.contains(strIobyxmoadg);
    }

    protected KeyFactory zoijcleaow() throws JoseException {
        String strIobyxmoadg = iobyxmoadg();
        try {
            String str = this.f79088iobyxmoadg;
            return str == null ? KeyFactory.getInstance(strIobyxmoadg) : KeyFactory.getInstance(strIobyxmoadg, str);
        } catch (NoSuchAlgorithmException e13) {
            throw new JoseException("Couldn't find " + strIobyxmoadg + " KeyFactory! " + e13, e13);
        } catch (NoSuchProviderException e14) {
            throw new JoseException("Cannot get KeyFactory instance with provider " + this.f79088iobyxmoadg, e14);
        }
    }
}
