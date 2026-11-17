package kk;

import android.content.Context;
import android.net.http.SslCertificate;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.io.IOException;
import java.lang.reflect.Field;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class es extends WebViewClient {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final TrustManagerFactory f56449iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final wc0 f56450ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final bt f56451zoijcleaow;

    public es(Context context) throws NoSuchAlgorithmException, IOException, CertificateException, KeyStoreException {
        TrustManagerFactory tmFactory = jt.iobyxmoadg(context);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(context, "context");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(tmFactory, "tmFactory");
        this.f56449iobyxmoadg = tmFactory;
        rj rjVar = r80.f58286zoijcleaow;
        if (rjVar != null) {
            this.f56451zoijcleaow = rjVar.f58386iobyxmoadg.zoijcleaow();
            this.f56450ppxfxbqfkf = (wc0) rjVar.f58386iobyxmoadg.f58682btonecajqb.get();
        }
    }

    public final void iobyxmoadg(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        if (sslError.getPrimaryError() == 3) {
            SslCertificate certificate = sslError.getCertificate();
            try {
                Field declaredField = certificate.getClass().getDeclaredField("mX509Certificate");
                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(declaredField, "cert.javaClass.getDeclar…Field(\"mX509Certificate\")");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(certificate);
                kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                X509Certificate[] x509CertificateArr = {(X509Certificate) obj};
                TrustManager[] trustManagers = this.f56449iobyxmoadg.getTrustManagers();
                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(trustManagers, "tmFactory.trustManagers");
                for (TrustManager trustManager : trustManagers) {
                    if (trustManager instanceof X509TrustManager) {
                        X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
                        try {
                            ow owVar = new ow(gtknphoqwx.WV_CHECK_SERVER_TRUSTED, we0.WEB_VIEW, mp.SC, hg.tzroggbefp.gxszxtbevo(gg.cqumvgiudr.iobyxmoadg("Path", String.valueOf(webView.getUrl()))), null, null, null, 112);
                            bt btVar = this.f56451zoijcleaow;
                            if (btVar != null) {
                                btVar.iobyxmoadg(owVar);
                            }
                            x509TrustManager.checkServerTrusted(x509CertificateArr, "generic");
                            sslErrorHandler.proceed();
                            return;
                        } catch (Exception e13) {
                            ow owVar2 = new ow(gtknphoqwx.WV_SSL_EXCEPTION, we0.WEB_VIEW, mp.SC, hg.tzroggbefp.draadjrbmk(gg.cqumvgiudr.iobyxmoadg("Path", String.valueOf(webView.getUrl())), gg.cqumvgiudr.iobyxmoadg("Exception", e13.toString())), null, null, null, 112);
                            bt btVar2 = this.f56451zoijcleaow;
                            if (btVar2 != null) {
                                btVar2.iobyxmoadg(owVar2);
                            }
                        }
                    }
                }
            } catch (Exception e14) {
                jc2.iobyxmoadg.f51100iobyxmoadg.iobyxmoadg("WEB_VIEW: verify cert fail " + e14, new Object[0]);
            }
        }
        sslErrorHandler.cancel();
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(view, "view");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(handler, "handler");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(error, "error");
        wc0 wc0Var = this.f56450ppxfxbqfkf;
        if (wc0Var == null) {
            kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("featuresHandler");
            wc0Var = null;
        }
        boolean zIobyxmoadg = zd0.iobyxmoadg(wc0Var, uc0.PHONE_NUMBER_AUTH_SSL, null);
        if (zIobyxmoadg) {
            iobyxmoadg(view, handler, error);
        } else {
            if (zIobyxmoadg) {
                throw new NoWhenBranchMatchedException();
            }
            handler.proceed();
        }
    }
}
