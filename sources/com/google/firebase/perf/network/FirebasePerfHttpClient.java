package com.google.firebase.perf.network;

import androidx.annotation.Keep;
import com.google.firebase.perf.util.Timer;
import hd.lqeggnwhkg;
import java.io.IOException;
import ld.gtknphoqwx;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.protocol.HttpContext;

/* JADX INFO: loaded from: classes2.dex */
public class FirebasePerfHttpClient {
    static HttpResponse eablkybsjg(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, Timer timer, gtknphoqwx gtknphoqwxVar) throws IOException {
        lqeggnwhkg lqeggnwhkgVarEablkybsjg = lqeggnwhkg.eablkybsjg(gtknphoqwxVar);
        try {
            lqeggnwhkgVarEablkybsjg.pkzmftpjix(httpHost.toURI() + httpRequest.getRequestLine().getUri()).wflxmlrfwp(httpRequest.getRequestLine().getMethod());
            Long lIobyxmoadg = jd.wkgbmnqykc.iobyxmoadg(httpRequest);
            if (lIobyxmoadg != null) {
                lqeggnwhkgVarEablkybsjg.iwizpuwonk(lIobyxmoadg.longValue());
            }
            timer.dxjokdxxww();
            lqeggnwhkgVarEablkybsjg.esjtqupxsv(timer.lqeggnwhkg());
            HttpResponse httpResponseExecute = httpClient.execute(httpHost, httpRequest);
            lqeggnwhkgVarEablkybsjg.wwaezpbzkn(timer.eablkybsjg());
            lqeggnwhkgVarEablkybsjg.oxmwwwfdhm(httpResponseExecute.getStatusLine().getStatusCode());
            Long lIobyxmoadg2 = jd.wkgbmnqykc.iobyxmoadg(httpResponseExecute);
            if (lIobyxmoadg2 != null) {
                lqeggnwhkgVarEablkybsjg.iozdgvuglv(lIobyxmoadg2.longValue());
            }
            String strZoijcleaow = jd.wkgbmnqykc.zoijcleaow(httpResponseExecute);
            if (strZoijcleaow != null) {
                lqeggnwhkgVarEablkybsjg.yadqdtsiqt(strZoijcleaow);
            }
            lqeggnwhkgVarEablkybsjg.ppxfxbqfkf();
            return httpResponseExecute;
        } catch (IOException e13) {
            lqeggnwhkgVarEablkybsjg.wwaezpbzkn(timer.eablkybsjg());
            jd.wkgbmnqykc.wkgbmnqykc(lqeggnwhkgVarEablkybsjg);
            throw e13;
        }
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpUriRequest httpUriRequest) throws IOException {
        return lqeggnwhkg(httpClient, httpUriRequest, new Timer(), gtknphoqwx.gtknphoqwx());
    }

    static HttpResponse gxszxtbevo(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext, Timer timer, gtknphoqwx gtknphoqwxVar) throws IOException {
        lqeggnwhkg lqeggnwhkgVarEablkybsjg = lqeggnwhkg.eablkybsjg(gtknphoqwxVar);
        try {
            lqeggnwhkgVarEablkybsjg.pkzmftpjix(httpHost.toURI() + httpRequest.getRequestLine().getUri()).wflxmlrfwp(httpRequest.getRequestLine().getMethod());
            Long lIobyxmoadg = jd.wkgbmnqykc.iobyxmoadg(httpRequest);
            if (lIobyxmoadg != null) {
                lqeggnwhkgVarEablkybsjg.iwizpuwonk(lIobyxmoadg.longValue());
            }
            timer.dxjokdxxww();
            lqeggnwhkgVarEablkybsjg.esjtqupxsv(timer.lqeggnwhkg());
            HttpResponse httpResponseExecute = httpClient.execute(httpHost, httpRequest, httpContext);
            lqeggnwhkgVarEablkybsjg.wwaezpbzkn(timer.eablkybsjg());
            lqeggnwhkgVarEablkybsjg.oxmwwwfdhm(httpResponseExecute.getStatusLine().getStatusCode());
            Long lIobyxmoadg2 = jd.wkgbmnqykc.iobyxmoadg(httpResponseExecute);
            if (lIobyxmoadg2 != null) {
                lqeggnwhkgVarEablkybsjg.iozdgvuglv(lIobyxmoadg2.longValue());
            }
            String strZoijcleaow = jd.wkgbmnqykc.zoijcleaow(httpResponseExecute);
            if (strZoijcleaow != null) {
                lqeggnwhkgVarEablkybsjg.yadqdtsiqt(strZoijcleaow);
            }
            lqeggnwhkgVarEablkybsjg.ppxfxbqfkf();
            return httpResponseExecute;
        } catch (IOException e13) {
            lqeggnwhkgVarEablkybsjg.wwaezpbzkn(timer.eablkybsjg());
            jd.wkgbmnqykc.wkgbmnqykc(lqeggnwhkgVarEablkybsjg);
            throw e13;
        }
    }

    static Object iobyxmoadg(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler responseHandler, Timer timer, gtknphoqwx gtknphoqwxVar) throws IOException {
        lqeggnwhkg lqeggnwhkgVarEablkybsjg = lqeggnwhkg.eablkybsjg(gtknphoqwxVar);
        try {
            lqeggnwhkgVarEablkybsjg.pkzmftpjix(httpHost.toURI() + httpRequest.getRequestLine().getUri()).wflxmlrfwp(httpRequest.getRequestLine().getMethod());
            Long lIobyxmoadg = jd.wkgbmnqykc.iobyxmoadg(httpRequest);
            if (lIobyxmoadg != null) {
                lqeggnwhkgVarEablkybsjg.iwizpuwonk(lIobyxmoadg.longValue());
            }
            timer.dxjokdxxww();
            lqeggnwhkgVarEablkybsjg.esjtqupxsv(timer.lqeggnwhkg());
            return httpClient.execute(httpHost, httpRequest, new jd.ppxfxbqfkf(responseHandler, timer, lqeggnwhkgVarEablkybsjg));
        } catch (IOException e13) {
            lqeggnwhkgVarEablkybsjg.wwaezpbzkn(timer.eablkybsjg());
            jd.wkgbmnqykc.wkgbmnqykc(lqeggnwhkgVarEablkybsjg);
            throw e13;
        }
    }

    static HttpResponse lqeggnwhkg(HttpClient httpClient, HttpUriRequest httpUriRequest, Timer timer, gtknphoqwx gtknphoqwxVar) throws IOException {
        lqeggnwhkg lqeggnwhkgVarEablkybsjg = lqeggnwhkg.eablkybsjg(gtknphoqwxVar);
        try {
            lqeggnwhkgVarEablkybsjg.pkzmftpjix(httpUriRequest.getURI().toString()).wflxmlrfwp(httpUriRequest.getMethod());
            Long lIobyxmoadg = jd.wkgbmnqykc.iobyxmoadg(httpUriRequest);
            if (lIobyxmoadg != null) {
                lqeggnwhkgVarEablkybsjg.iwizpuwonk(lIobyxmoadg.longValue());
            }
            timer.dxjokdxxww();
            lqeggnwhkgVarEablkybsjg.esjtqupxsv(timer.lqeggnwhkg());
            HttpResponse httpResponseExecute = httpClient.execute(httpUriRequest);
            lqeggnwhkgVarEablkybsjg.wwaezpbzkn(timer.eablkybsjg());
            lqeggnwhkgVarEablkybsjg.oxmwwwfdhm(httpResponseExecute.getStatusLine().getStatusCode());
            Long lIobyxmoadg2 = jd.wkgbmnqykc.iobyxmoadg(httpResponseExecute);
            if (lIobyxmoadg2 != null) {
                lqeggnwhkgVarEablkybsjg.iozdgvuglv(lIobyxmoadg2.longValue());
            }
            String strZoijcleaow = jd.wkgbmnqykc.zoijcleaow(httpResponseExecute);
            if (strZoijcleaow != null) {
                lqeggnwhkgVarEablkybsjg.yadqdtsiqt(strZoijcleaow);
            }
            lqeggnwhkgVarEablkybsjg.ppxfxbqfkf();
            return httpResponseExecute;
        } catch (IOException e13) {
            lqeggnwhkgVarEablkybsjg.wwaezpbzkn(timer.eablkybsjg());
            jd.wkgbmnqykc.wkgbmnqykc(lqeggnwhkgVarEablkybsjg);
            throw e13;
        }
    }

    static HttpResponse nufgyqmvbu(HttpClient httpClient, HttpUriRequest httpUriRequest, HttpContext httpContext, Timer timer, gtknphoqwx gtknphoqwxVar) throws IOException {
        lqeggnwhkg lqeggnwhkgVarEablkybsjg = lqeggnwhkg.eablkybsjg(gtknphoqwxVar);
        try {
            lqeggnwhkgVarEablkybsjg.pkzmftpjix(httpUriRequest.getURI().toString()).wflxmlrfwp(httpUriRequest.getMethod());
            Long lIobyxmoadg = jd.wkgbmnqykc.iobyxmoadg(httpUriRequest);
            if (lIobyxmoadg != null) {
                lqeggnwhkgVarEablkybsjg.iwizpuwonk(lIobyxmoadg.longValue());
            }
            timer.dxjokdxxww();
            lqeggnwhkgVarEablkybsjg.esjtqupxsv(timer.lqeggnwhkg());
            HttpResponse httpResponseExecute = httpClient.execute(httpUriRequest, httpContext);
            lqeggnwhkgVarEablkybsjg.wwaezpbzkn(timer.eablkybsjg());
            lqeggnwhkgVarEablkybsjg.oxmwwwfdhm(httpResponseExecute.getStatusLine().getStatusCode());
            Long lIobyxmoadg2 = jd.wkgbmnqykc.iobyxmoadg(httpResponseExecute);
            if (lIobyxmoadg2 != null) {
                lqeggnwhkgVarEablkybsjg.iozdgvuglv(lIobyxmoadg2.longValue());
            }
            String strZoijcleaow = jd.wkgbmnqykc.zoijcleaow(httpResponseExecute);
            if (strZoijcleaow != null) {
                lqeggnwhkgVarEablkybsjg.yadqdtsiqt(strZoijcleaow);
            }
            lqeggnwhkgVarEablkybsjg.ppxfxbqfkf();
            return httpResponseExecute;
        } catch (IOException e13) {
            lqeggnwhkgVarEablkybsjg.wwaezpbzkn(timer.eablkybsjg());
            jd.wkgbmnqykc.wkgbmnqykc(lqeggnwhkgVarEablkybsjg);
            throw e13;
        }
    }

    static Object ppxfxbqfkf(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler responseHandler, Timer timer, gtknphoqwx gtknphoqwxVar) throws IOException {
        lqeggnwhkg lqeggnwhkgVarEablkybsjg = lqeggnwhkg.eablkybsjg(gtknphoqwxVar);
        try {
            lqeggnwhkgVarEablkybsjg.pkzmftpjix(httpUriRequest.getURI().toString()).wflxmlrfwp(httpUriRequest.getMethod());
            Long lIobyxmoadg = jd.wkgbmnqykc.iobyxmoadg(httpUriRequest);
            if (lIobyxmoadg != null) {
                lqeggnwhkgVarEablkybsjg.iwizpuwonk(lIobyxmoadg.longValue());
            }
            timer.dxjokdxxww();
            lqeggnwhkgVarEablkybsjg.esjtqupxsv(timer.lqeggnwhkg());
            return httpClient.execute(httpUriRequest, new jd.ppxfxbqfkf(responseHandler, timer, lqeggnwhkgVarEablkybsjg));
        } catch (IOException e13) {
            lqeggnwhkgVarEablkybsjg.wwaezpbzkn(timer.eablkybsjg());
            jd.wkgbmnqykc.wkgbmnqykc(lqeggnwhkgVarEablkybsjg);
            throw e13;
        }
    }

    static Object wkgbmnqykc(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler responseHandler, HttpContext httpContext, Timer timer, gtknphoqwx gtknphoqwxVar) throws IOException {
        lqeggnwhkg lqeggnwhkgVarEablkybsjg = lqeggnwhkg.eablkybsjg(gtknphoqwxVar);
        try {
            lqeggnwhkgVarEablkybsjg.pkzmftpjix(httpUriRequest.getURI().toString()).wflxmlrfwp(httpUriRequest.getMethod());
            Long lIobyxmoadg = jd.wkgbmnqykc.iobyxmoadg(httpUriRequest);
            if (lIobyxmoadg != null) {
                lqeggnwhkgVarEablkybsjg.iwizpuwonk(lIobyxmoadg.longValue());
            }
            timer.dxjokdxxww();
            lqeggnwhkgVarEablkybsjg.esjtqupxsv(timer.lqeggnwhkg());
            return httpClient.execute(httpUriRequest, new jd.ppxfxbqfkf(responseHandler, timer, lqeggnwhkgVarEablkybsjg), httpContext);
        } catch (IOException e13) {
            lqeggnwhkgVarEablkybsjg.wwaezpbzkn(timer.eablkybsjg());
            jd.wkgbmnqykc.wkgbmnqykc(lqeggnwhkgVarEablkybsjg);
            throw e13;
        }
    }

    static Object zoijcleaow(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler responseHandler, HttpContext httpContext, Timer timer, gtknphoqwx gtknphoqwxVar) throws IOException {
        lqeggnwhkg lqeggnwhkgVarEablkybsjg = lqeggnwhkg.eablkybsjg(gtknphoqwxVar);
        try {
            lqeggnwhkgVarEablkybsjg.pkzmftpjix(httpHost.toURI() + httpRequest.getRequestLine().getUri()).wflxmlrfwp(httpRequest.getRequestLine().getMethod());
            Long lIobyxmoadg = jd.wkgbmnqykc.iobyxmoadg(httpRequest);
            if (lIobyxmoadg != null) {
                lqeggnwhkgVarEablkybsjg.iwizpuwonk(lIobyxmoadg.longValue());
            }
            timer.dxjokdxxww();
            lqeggnwhkgVarEablkybsjg.esjtqupxsv(timer.lqeggnwhkg());
            return httpClient.execute(httpHost, httpRequest, new jd.ppxfxbqfkf(responseHandler, timer, lqeggnwhkgVarEablkybsjg), httpContext);
        } catch (IOException e13) {
            lqeggnwhkgVarEablkybsjg.wwaezpbzkn(timer.eablkybsjg());
            jd.wkgbmnqykc.wkgbmnqykc(lqeggnwhkgVarEablkybsjg);
            throw e13;
        }
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpUriRequest httpUriRequest, HttpContext httpContext) throws IOException {
        return nufgyqmvbu(httpClient, httpUriRequest, httpContext, new Timer(), gtknphoqwx.gtknphoqwx());
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler<T> responseHandler) throws IOException {
        return (T) ppxfxbqfkf(httpClient, httpUriRequest, responseHandler, new Timer(), gtknphoqwx.gtknphoqwx());
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler<T> responseHandler, HttpContext httpContext) throws IOException {
        return (T) wkgbmnqykc(httpClient, httpUriRequest, responseHandler, httpContext, new Timer(), gtknphoqwx.gtknphoqwx());
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest) throws IOException {
        return eablkybsjg(httpClient, httpHost, httpRequest, new Timer(), gtknphoqwx.gtknphoqwx());
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) throws IOException {
        return gxszxtbevo(httpClient, httpHost, httpRequest, httpContext, new Timer(), gtknphoqwx.gtknphoqwx());
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler) throws IOException {
        return (T) iobyxmoadg(httpClient, httpHost, httpRequest, responseHandler, new Timer(), gtknphoqwx.gtknphoqwx());
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler, HttpContext httpContext) throws IOException {
        return (T) zoijcleaow(httpClient, httpHost, httpRequest, responseHandler, httpContext, new Timer(), gtknphoqwx.gtknphoqwx());
    }
}
