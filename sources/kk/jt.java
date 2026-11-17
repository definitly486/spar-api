package kk;

import android.content.Context;
import android.util.Base64;
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
import spay.sdk.R;

/* JADX INFO: loaded from: classes3.dex */
public abstract class jt {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final List f57222iobyxmoadg = hg.jyumaefscl.rgvfuqvkyq(gg.cqumvgiudr.iobyxmoadg(Integer.valueOf(R.raw.spay_ift_test_ext_g2_phone_auth), "ift_test_ext_g2"), gg.cqumvgiudr.iobyxmoadg(Integer.valueOf(R.raw.spay_r11), "r11"));

    public static final TrustManagerFactory iobyxmoadg(Context context) throws NoSuchAlgorithmException, IOException, CertificateException, KeyStoreException {
        CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(certificateFactory, "getInstance(\"X.509\")");
        List list = f57222iobyxmoadg;
        ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InputStream inputStreamOpenRawResource = context.getResources().openRawResource(((Number) ((gg.vdvldrhtss) it.next()).lqeggnwhkg()).intValue());
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(inputStreamOpenRawResource, "context.resources.openRawResource(certRes)");
            byte[] bArrPpxfxbqfkf = rg.iobyxmoadg.ppxfxbqfkf(inputStreamOpenRawResource);
            Charset ISO_8859_1 = StandardCharsets.ISO_8859_1;
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(ISO_8859_1, "ISO_8859_1");
            arrayList.add(new ByteArrayInputStream(Base64.decode(mj.kcexrzcfyt.hcddaimhww(mj.kcexrzcfyt.hcddaimhww(mj.kcexrzcfyt.hcddaimhww(mj.kcexrzcfyt.hcddaimhww(mj.kcexrzcfyt.hcddaimhww(mj.kcexrzcfyt.hcddaimhww(mj.kcexrzcfyt.btonecajqb(new String(bArrPpxfxbqfkf, ISO_8859_1)), "\\s+", "", false, 4, null), "\n", "", false, 4, null), "-----BEGIN PUBLIC KEY-----", "", false, 4, null), "-----END PUBLIC KEY-----", "", false, 4, null), "-----BEGIN CERTIFICATE-----", "", false, 4, null), "-----END CERTIFICATE-----", "", false, 4, null), 2)));
        }
        KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
        keyStore.load(null, null);
        int i13 = 0;
        for (Object obj : arrayList) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                hg.jyumaefscl.iwizpuwonk();
            }
            InputStream inputStream = (InputStream) obj;
            try {
                Certificate certificateGenerateCertificate = certificateFactory.generateCertificate(inputStream);
                rg.zoijcleaow.iobyxmoadg(inputStream, null);
                keyStore.setCertificateEntry((String) ((gg.vdvldrhtss) f57222iobyxmoadg.get(i13)).nufgyqmvbu(), certificateGenerateCertificate);
                i13 = i14;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    rg.zoijcleaow.iobyxmoadg(inputStream, th2);
                    throw th3;
                }
            }
        }
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(keyStore, "getInstance(KeyStore.get…nd, cert)\n        }\n    }");
        TrustManagerFactory tmFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        tmFactory.init(keyStore);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(tmFactory, "tmFactory");
        return tmFactory;
    }
}
