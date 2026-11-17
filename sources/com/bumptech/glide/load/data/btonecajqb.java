package com.bumptech.glide.load.data;

import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.load.HttpException;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class btonecajqb implements wkgbmnqykc {

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    static final zoijcleaow f20774lereixgezr = new iobyxmoadg();

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private InputStream f20775cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private volatile boolean f20776esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private HttpURLConnection f20777iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final zoijcleaow f20778jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final int f20779yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final r8.nufgyqmvbu f20780zdlpuopuiu;

    private static class iobyxmoadg implements zoijcleaow {
        iobyxmoadg() {
        }

        @Override // com.bumptech.glide.load.data.btonecajqb.zoijcleaow
        public HttpURLConnection iobyxmoadg(URL url) {
            return (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection()));
        }
    }

    interface zoijcleaow {
        HttpURLConnection iobyxmoadg(URL url);
    }

    public btonecajqb(r8.nufgyqmvbu nufgyqmvbuVar, int i13) {
        this(nufgyqmvbuVar, i13, f20774lereixgezr);
    }

    private InputStream btonecajqb(URL url, int i13, URL url2, Map map) throws HttpException {
        if (i13 >= 5) {
            throw new HttpException("Too many (> 5) redirects!", -1);
        }
        if (url2 != null) {
            try {
                if (url.toURI().equals(url2.toURI())) {
                    throw new HttpException("In re-direct loop", -1);
                }
            } catch (URISyntaxException unused) {
            }
        }
        HttpURLConnection httpURLConnectionPpxfxbqfkf = ppxfxbqfkf(url, map);
        this.f20777iwizpuwonk = httpURLConnectionPpxfxbqfkf;
        try {
            httpURLConnectionPpxfxbqfkf.connect();
            this.f20775cqumvgiudr = this.f20777iwizpuwonk.getInputStream();
            if (this.f20776esjtqupxsv) {
                return null;
            }
            int iGxszxtbevo = gxszxtbevo(this.f20777iwizpuwonk);
            if (nufgyqmvbu(iGxszxtbevo)) {
                return lqeggnwhkg(this.f20777iwizpuwonk);
            }
            if (!dxjokdxxww(iGxszxtbevo)) {
                if (iGxszxtbevo == -1) {
                    throw new HttpException(iGxszxtbevo);
                }
                try {
                    throw new HttpException(this.f20777iwizpuwonk.getResponseMessage(), iGxszxtbevo);
                } catch (IOException e13) {
                    throw new HttpException("Failed to get a response message", iGxszxtbevo, e13);
                }
            }
            String headerField = this.f20777iwizpuwonk.getHeaderField("Location");
            if (TextUtils.isEmpty(headerField)) {
                throw new HttpException("Received empty or null redirect url", iGxszxtbevo);
            }
            try {
                URL url3 = new URL(url, headerField);
                zoijcleaow();
                return btonecajqb(url3, i13 + 1, url, map);
            } catch (MalformedURLException e14) {
                throw new HttpException("Bad redirect url: " + headerField, iGxszxtbevo, e14);
            }
        } catch (IOException e15) {
            throw new HttpException("Failed to connect or obtain data", gxszxtbevo(this.f20777iwizpuwonk), e15);
        }
    }

    private static boolean dxjokdxxww(int i13) {
        return i13 / 100 == 3;
    }

    private static int gxszxtbevo(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getResponseCode();
        } catch (IOException e13) {
            if (!Log.isLoggable("HttpUrlFetcher", 3)) {
                return -1;
            }
            Log.d("HttpUrlFetcher", "Failed to get a response code", e13);
            return -1;
        }
    }

    private InputStream lqeggnwhkg(HttpURLConnection httpURLConnection) throws HttpException {
        try {
            if (TextUtils.isEmpty(httpURLConnection.getContentEncoding())) {
                this.f20775cqumvgiudr = g9.ppxfxbqfkf.wkgbmnqykc(httpURLConnection.getInputStream(), httpURLConnection.getContentLength());
            } else {
                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                    Log.d("HttpUrlFetcher", "Got non empty content encoding: " + httpURLConnection.getContentEncoding());
                }
                this.f20775cqumvgiudr = httpURLConnection.getInputStream();
            }
            return this.f20775cqumvgiudr;
        } catch (IOException e13) {
            throw new HttpException("Failed to obtain InputStream", gxszxtbevo(httpURLConnection), e13);
        }
    }

    private static boolean nufgyqmvbu(int i13) {
        return i13 / 100 == 2;
    }

    private HttpURLConnection ppxfxbqfkf(URL url, Map map) throws HttpException {
        try {
            HttpURLConnection httpURLConnectionIobyxmoadg = this.f20778jyumaefscl.iobyxmoadg(url);
            for (Map.Entry entry : map.entrySet()) {
                httpURLConnectionIobyxmoadg.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            httpURLConnectionIobyxmoadg.setConnectTimeout(this.f20779yggfygwlhe);
            httpURLConnectionIobyxmoadg.setReadTimeout(this.f20779yggfygwlhe);
            httpURLConnectionIobyxmoadg.setUseCaches(false);
            httpURLConnectionIobyxmoadg.setDoInput(true);
            httpURLConnectionIobyxmoadg.setInstanceFollowRedirects(false);
            return httpURLConnectionIobyxmoadg;
        } catch (IOException e13) {
            throw new HttpException("URL.openConnection threw", 0, e13);
        }
    }

    @Override // com.bumptech.glide.load.data.wkgbmnqykc
    public void cancel() {
        this.f20776esjtqupxsv = true;
    }

    @Override // com.bumptech.glide.load.data.wkgbmnqykc
    public void eablkybsjg(com.bumptech.glide.btonecajqb btonecajqbVar, wkgbmnqykc.iobyxmoadg iobyxmoadgVar) {
        StringBuilder sb3;
        long jZoijcleaow = g9.lqeggnwhkg.zoijcleaow();
        try {
            iobyxmoadgVar.gxszxtbevo(btonecajqb(this.f20780zdlpuopuiu.dxjokdxxww(), 0, null, this.f20780zdlpuopuiu.eablkybsjg()));
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                sb3 = new StringBuilder();
                sb3.append("Finished http url fetcher fetch in ");
                sb3.append(g9.lqeggnwhkg.iobyxmoadg(jZoijcleaow));
                String string = sb3.toString();
            }
        } catch (IOException e13) {
            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                Log.d("HttpUrlFetcher", "Failed to load data for url", e13);
            }
            iobyxmoadgVar.ppxfxbqfkf(e13);
            if (!Log.isLoggable("HttpUrlFetcher", 2)) {
            } else {
                sb3 = new StringBuilder();
            }
        } finally {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + g9.lqeggnwhkg.iobyxmoadg(jZoijcleaow));
            }
        }
    }

    @Override // com.bumptech.glide.load.data.wkgbmnqykc
    public Class iobyxmoadg() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.wkgbmnqykc
    public l8.iobyxmoadg wkgbmnqykc() {
        return l8.iobyxmoadg.REMOTE;
    }

    @Override // com.bumptech.glide.load.data.wkgbmnqykc
    public void zoijcleaow() {
        InputStream inputStream = this.f20775cqumvgiudr;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f20777iwizpuwonk;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f20777iwizpuwonk = null;
    }

    btonecajqb(r8.nufgyqmvbu nufgyqmvbuVar, int i13, zoijcleaow zoijcleaowVar) {
        this.f20780zdlpuopuiu = nufgyqmvbuVar;
        this.f20779yggfygwlhe = i13;
        this.f20778jyumaefscl = zoijcleaowVar;
    }
}
