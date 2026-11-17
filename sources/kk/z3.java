package kk;

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
import spay.sdk.RedirectActivity;

/* JADX INFO: loaded from: classes3.dex */
public abstract class z3 extends WebViewClient {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final TrustManagerFactory f59517iobyxmoadg;

    public z3(RedirectActivity context) throws NoSuchAlgorithmException, IOException, CertificateException, KeyStoreException {
        TrustManagerFactory tmFactory = b5.iobyxmoadg(context);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(context, "context");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(tmFactory, "tmFactory");
        this.f59517iobyxmoadg = tmFactory;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
        String str = "Path";
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(view, "view");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(handler, "handler");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(error, "error");
        if (error.getPrimaryError() == 3) {
            SslCertificate certificate = error.getCertificate();
            try {
                Field declaredField = certificate.getClass().getDeclaredField("mX509Certificate");
                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(declaredField, "cert.javaClass.getDeclar…Field(\"mX509Certificate\")");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(certificate);
                kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                X509Certificate[] x509CertificateArr = {(X509Certificate) obj};
                try {
                    TrustManager[] trustManagers = this.f59517iobyxmoadg.getTrustManagers();
                    kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(trustManagers, "tmFactory.trustManagers");
                    int length = trustManagers.length;
                    int i13 = 0;
                    while (i13 < length) {
                        TrustManager trustManager = trustManagers[i13];
                        if (trustManager instanceof X509TrustManager) {
                            X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
                            try {
                                gtknphoqwx action = gtknphoqwx.WV_CHECK_SERVER_TRUSTED;
                                we0 view2 = we0.WEB_VIEW;
                                mp actionType = mp.SC;
                                hg.tzroggbefp.gxszxtbevo(gg.cqumvgiudr.iobyxmoadg(str, String.valueOf(view.getUrl())));
                                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(action, "action");
                                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(view2, "view");
                                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(actionType, "actionType");
                                x509TrustManager.checkServerTrusted(x509CertificateArr, "generic");
                                handler.proceed();
                                return;
                            } catch (Exception e13) {
                                gtknphoqwx action2 = gtknphoqwx.WV_SSL_EXCEPTION;
                                we0 view3 = we0.WEB_VIEW;
                                mp actionType2 = mp.SC;
                                hg.tzroggbefp.draadjrbmk(gg.cqumvgiudr.iobyxmoadg(str, String.valueOf(view.getUrl())), gg.cqumvgiudr.iobyxmoadg("Exception", e13.toString()));
                                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(action2, "action");
                                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(view3, "view");
                                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(actionType2, "actionType");
                                i13++;
                                str = str;
                            }
                        }
                        i13++;
                        str = str;
                    }
                } catch (Exception e14) {
                    e = e14;
                    jc2.iobyxmoadg.f51100iobyxmoadg.iobyxmoadg("WEB_VIEW: verify cert fail " + e, new Object[0]);
                    handler.cancel();
                }
            } catch (Exception e15) {
                e = e15;
            }
        }
        handler.cancel();
    }
}
