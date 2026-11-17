package ql;

import java.io.ByteArrayInputStream;
import java.security.NoSuchProviderException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import org.jose4j.lang.JoseException;

/* JADX INFO: loaded from: classes3.dex */
public class cqumvgiudr {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private CertificateFactory f79081iobyxmoadg;

    public cqumvgiudr() {
        try {
            this.f79081iobyxmoadg = CertificateFactory.getInstance("X.509");
        } catch (CertificateException e13) {
            throw new IllegalStateException("Couldn't find X.509 CertificateFactory!?!", e13);
        }
    }

    public static cqumvgiudr zoijcleaow(String str) throws JoseException {
        if (str == null) {
            return new cqumvgiudr();
        }
        try {
            return new cqumvgiudr(str);
        } catch (NoSuchProviderException e13) {
            throw new JoseException("Provider " + str + " not found when creating X509Util.", e13);
        }
    }

    public X509Certificate iobyxmoadg(String str) throws JoseException {
        try {
            return (X509Certificate) this.f79081iobyxmoadg.generateCertificate(new ByteArrayInputStream(el.iobyxmoadg.iobyxmoadg(str)));
        } catch (CertificateException e13) {
            throw new JoseException("Unable to convert " + str + " value to X509Certificate: " + e13, e13);
        }
    }

    public String ppxfxbqfkf(X509Certificate x509Certificate) {
        try {
            return el.iobyxmoadg.zoijcleaow(x509Certificate.getEncoded());
        } catch (CertificateEncodingException e13) {
            throw new IllegalStateException("Unexpected problem getting encoded certificate.", e13);
        }
    }

    public cqumvgiudr(String str) {
        try {
            this.f79081iobyxmoadg = CertificateFactory.getInstance("X.509", str);
        } catch (CertificateException e13) {
            throw new IllegalStateException("Couldn't find X.509 CertificateFactory!?!", e13);
        }
    }
}
