package modern.payments.ecomAndroid.presentation.fragment.webview;

import android.content.Context;
import android.util.Base64;
import gg.cqumvgiudr;
import gg.vdvldrhtss;
import hg.jyumaefscl;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.TrustManagerFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;
import modern.payments.p003ecomandroid.R;
import rg.iobyxmoadg;
import rg.zoijcleaow;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a\u0017\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0017\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\u000f\u001a\u0013\u0010\u0012\u001a\u00020\n*\u00020\nH\u0002¢\u0006\u0004\b\u0012\u0010\u0013\"\u0014\u0010\u0014\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015\"\u0014\u0010\u0016\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015\"\u0014\u0010\u0017\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015\"\u0014\u0010\u0018\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0015\"\u0014\u0010\u0019\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0015\"\u0014\u0010\u001a\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0015\"&\u0010\u001d\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\u001c0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Landroid/content/Context;", "context", "Ljavax/net/ssl/TrustManagerFactory;", "initTrustStore", "(Landroid/content/Context;)Ljavax/net/ssl/TrustManagerFactory;", "", "certRes", "Ljava/io/InputStream;", "readPemCert", "(ILandroid/content/Context;)Ljava/io/InputStream;", "", "getPemAsString", "(ILandroid/content/Context;)Ljava/lang/String;", "pem", "fromPem", "(Ljava/lang/String;)Ljava/io/InputStream;", "base64cert", "fromBase64String", "pemKeyContent", "(Ljava/lang/String;)Ljava/lang/String;", "ROOT_CERTIFICATE", "Ljava/lang/String;", "SUB_CERTIFICATE", "BANK_CERT", "R11", "S_CA_TEST_ROOT", "S_CA_TEST_G2", "", "Lgg/vdvldrhtss;", "certsRes", "Ljava/util/List;", "ecomAndroid_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class CheckServerTrustedWebViewClientKt {
    private static final String SUB_CERTIFICATE = "russian_trusted_sub_ca";
    private static final String ROOT_CERTIFICATE = "russian_trusted_root_ca";
    private static final String BANK_CERT = "bank_cert";
    private static final String R11 = "r11";
    private static final String S_CA_TEST_ROOT = "s_ca_test_root";
    private static final String S_CA_TEST_G2 = "s_ca_test_g2";
    private static final List<vdvldrhtss> certsRes = jyumaefscl.rgvfuqvkyq(cqumvgiudr.iobyxmoadg(Integer.valueOf(R.raw.russian_trusted_sub_ca), SUB_CERTIFICATE), cqumvgiudr.iobyxmoadg(Integer.valueOf(R.raw.russian_trusted_root_ca), ROOT_CERTIFICATE), cqumvgiudr.iobyxmoadg(Integer.valueOf(R.raw.bank_cert), BANK_CERT), cqumvgiudr.iobyxmoadg(Integer.valueOf(R.raw.f67726r11), R11), cqumvgiudr.iobyxmoadg(Integer.valueOf(R.raw.s_ca_test_root), S_CA_TEST_ROOT), cqumvgiudr.iobyxmoadg(Integer.valueOf(R.raw.s_ca_test_g2), S_CA_TEST_G2));

    private static final InputStream fromBase64String(String str) {
        return new ByteArrayInputStream(Base64.decode(str, 2));
    }

    private static final InputStream fromPem(String str) {
        return fromBase64String(pemKeyContent(str));
    }

    private static final String getPemAsString(int i13, Context context) {
        InputStream inputStreamOpenRawResource = context.getResources().openRawResource(i13);
        zdlpuopuiu.dxjokdxxww(inputStreamOpenRawResource, "openRawResource(...)");
        byte[] bArrPpxfxbqfkf = iobyxmoadg.ppxfxbqfkf(inputStreamOpenRawResource);
        Charset ISO_8859_1 = StandardCharsets.ISO_8859_1;
        zdlpuopuiu.dxjokdxxww(ISO_8859_1, "ISO_8859_1");
        return new String(bArrPpxfxbqfkf, ISO_8859_1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TrustManagerFactory initTrustStore(Context context) throws NoSuchAlgorithmException, IOException, CertificateException, KeyStoreException {
        CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
        zdlpuopuiu.dxjokdxxww(certificateFactory, "getInstance(...)");
        List<vdvldrhtss> list = certsRes;
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(readPemCert(((Number) ((vdvldrhtss) it.next()).lqeggnwhkg()).intValue(), context));
        }
        KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
        keyStore.load(null, null);
        int i13 = 0;
        for (Object obj : arrayList) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                jyumaefscl.iwizpuwonk();
            }
            InputStream inputStream = (InputStream) obj;
            try {
                Certificate certificateGenerateCertificate = certificateFactory.generateCertificate(inputStream);
                zoijcleaow.iobyxmoadg(inputStream, null);
                keyStore.setCertificateEntry((String) certsRes.get(i13).nufgyqmvbu(), certificateGenerateCertificate);
                i13 = i14;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    zoijcleaow.iobyxmoadg(inputStream, th2);
                    throw th3;
                }
            }
        }
        zdlpuopuiu.dxjokdxxww(keyStore, "apply(...)");
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init(keyStore);
        zdlpuopuiu.lqeggnwhkg(trustManagerFactory);
        return trustManagerFactory;
    }

    private static final String pemKeyContent(String str) {
        return kcexrzcfyt.hcddaimhww(kcexrzcfyt.hcddaimhww(kcexrzcfyt.hcddaimhww(kcexrzcfyt.hcddaimhww(kcexrzcfyt.hcddaimhww(kcexrzcfyt.hcddaimhww(str, "\\s+", "", false, 4, null), "\n", "", false, 4, null), "-----BEGIN PUBLIC KEY-----", "", false, 4, null), "-----END PUBLIC KEY-----", "", false, 4, null), "-----BEGIN CERTIFICATE-----", "", false, 4, null), "-----END CERTIFICATE-----", "", false, 4, null);
    }

    private static final InputStream readPemCert(int i13, Context context) {
        return fromPem(kcexrzcfyt.btonecajqb(getPemAsString(i13, context)));
    }
}
