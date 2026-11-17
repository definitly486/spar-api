package androidx.media3.datasource;

import android.net.Uri;
import b3.dxjokdxxww;
import b3.lqeggnwhkg;
import b3.nufgyqmvbu;
import com.google.common.collect.kegysxyocb;
import com.google.common.collect.ojitshcjhn;
import com.google.common.collect.yggfygwlhe;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import modern.payments.ecomAndroid.util.interceptor.impl.HostSelectionInterceptorImpl;
import xa.wflxmlrfwp;
import y2.kcexrzcfyt;
import y2.stevsuqkhv;

/* JADX INFO: loaded from: classes.dex */
public class ppxfxbqfkf extends b3.iobyxmoadg implements androidx.media3.datasource.iobyxmoadg {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private lqeggnwhkg f9979agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final nufgyqmvbu f9980btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final wflxmlrfwp f9981draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final String f9982dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final boolean f9983eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final nufgyqmvbu f9984gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final boolean f9985gxszxtbevo;

    /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
    private long f9986kcexrzcfyt;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final int f9987lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final int f9988nufgyqmvbu;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private HttpURLConnection f9989ojitshcjhn;

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    private int f9990oxmwwwfdhm;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private InputStream f9991rgvfuqvkyq;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    private boolean f9992vdvldrhtss;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final boolean f9993wflxmlrfwp;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private long f9994zdlpuopuiu;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: androidx.media3.datasource.ppxfxbqfkf$ppxfxbqfkf, reason: collision with other inner class name */
    static class C0163ppxfxbqfkf extends ojitshcjhn {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final Map f9995zdlpuopuiu;

        public C0163ppxfxbqfkf(Map map) {
            this.f9995zdlpuopuiu = map;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean btonecajqb(Map.Entry entry) {
            return entry.getKey() != null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean gtknphoqwx(String str) {
            return str != null;
        }

        @Override // com.google.common.collect.ojitshcjhn, java.util.Map
        public boolean containsKey(Object obj) {
            return obj != null && super.containsKey(obj);
        }

        @Override // java.util.Map
        public boolean containsValue(Object obj) {
            return super.ppxfxbqfkf(obj);
        }

        @Override // com.google.common.collect.ojitshcjhn, java.util.Map
        /* JADX INFO: renamed from: dxjokdxxww, reason: merged with bridge method [inline-methods] */
        public List get(Object obj) {
            if (obj == null) {
                return null;
            }
            return (List) super.get(obj);
        }

        @Override // com.google.common.collect.ojitshcjhn, java.util.Map
        public Set entrySet() {
            return kegysxyocb.zoijcleaow(super.entrySet(), new wflxmlrfwp() { // from class: androidx.media3.datasource.wkgbmnqykc
                @Override // xa.wflxmlrfwp
                public final boolean apply(Object obj) {
                    return ppxfxbqfkf.C0163ppxfxbqfkf.btonecajqb((Map.Entry) obj);
                }
            });
        }

        @Override // java.util.Map
        public boolean equals(Object obj) {
            return obj != null && super.wkgbmnqykc(obj);
        }

        @Override // java.util.Map
        public int hashCode() {
            return super.eablkybsjg();
        }

        @Override // com.google.common.collect.ojitshcjhn, java.util.Map
        public boolean isEmpty() {
            if (super.isEmpty()) {
                return true;
            }
            return super.size() == 1 && super.containsKey(null);
        }

        @Override // com.google.common.collect.ojitshcjhn, java.util.Map
        public Set keySet() {
            return kegysxyocb.zoijcleaow(super.keySet(), new wflxmlrfwp() { // from class: androidx.media3.datasource.eablkybsjg
                @Override // xa.wflxmlrfwp
                public final boolean apply(Object obj) {
                    return ppxfxbqfkf.C0163ppxfxbqfkf.gtknphoqwx((String) obj);
                }
            });
        }

        @Override // com.google.common.collect.ojitshcjhn, java.util.Map
        public int size() {
            return super.size() - (super.containsKey(null) ? 1 : 0);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.rgvfuqvkyq
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public Map iobyxmoadg() {
            return this.f9995zdlpuopuiu;
        }
    }

    public static final class zoijcleaow implements androidx.media3.datasource.iobyxmoadg.InterfaceC0162iobyxmoadg {

        /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
        private boolean f9996dxjokdxxww;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        private boolean f10000lqeggnwhkg;

        /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
        private boolean f10001nufgyqmvbu;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private wflxmlrfwp f10002ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private String f10003wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private b3.wflxmlrfwp f10004zoijcleaow;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final nufgyqmvbu f9999iobyxmoadg = new nufgyqmvbu();

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private int f9997eablkybsjg = 8000;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private int f9998gxszxtbevo = 8000;

        public zoijcleaow ppxfxbqfkf(String str) {
            this.f10003wkgbmnqykc = str;
            return this;
        }

        @Override // androidx.media3.datasource.iobyxmoadg.InterfaceC0162iobyxmoadg
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public ppxfxbqfkf iobyxmoadg() {
            ppxfxbqfkf ppxfxbqfkfVar = new ppxfxbqfkf(this.f10003wkgbmnqykc, this.f9997eablkybsjg, this.f9998gxszxtbevo, this.f10000lqeggnwhkg, this.f10001nufgyqmvbu, this.f9999iobyxmoadg, this.f10002ppxfxbqfkf, this.f9996dxjokdxxww);
            b3.wflxmlrfwp wflxmlrfwpVar = this.f10004zoijcleaow;
            if (wflxmlrfwpVar != null) {
                ppxfxbqfkfVar.eablkybsjg(wflxmlrfwpVar);
            }
            return ppxfxbqfkfVar;
        }
    }

    private HttpURLConnection cqumvgiudr(URL url, int i13, byte[] bArr, long j13, long j14, boolean z13, boolean z14, Map map) throws IOException {
        HttpURLConnection httpURLConnectionEsjtqupxsv = esjtqupxsv(url);
        httpURLConnectionEsjtqupxsv.setConnectTimeout(this.f9987lqeggnwhkg);
        httpURLConnectionEsjtqupxsv.setReadTimeout(this.f9988nufgyqmvbu);
        HashMap map2 = new HashMap();
        nufgyqmvbu nufgyqmvbuVar = this.f9980btonecajqb;
        if (nufgyqmvbuVar != null) {
            map2.putAll(nufgyqmvbuVar.iobyxmoadg());
        }
        map2.putAll(this.f9984gtknphoqwx.iobyxmoadg());
        map2.putAll(map);
        for (Map.Entry entry : map2.entrySet()) {
            httpURLConnectionEsjtqupxsv.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        String strIobyxmoadg = dxjokdxxww.iobyxmoadg(j13, j14);
        if (strIobyxmoadg != null) {
            httpURLConnectionEsjtqupxsv.setRequestProperty("Range", strIobyxmoadg);
        }
        String str = this.f9982dxjokdxxww;
        if (str != null) {
            httpURLConnectionEsjtqupxsv.setRequestProperty("User-Agent", str);
        }
        httpURLConnectionEsjtqupxsv.setRequestProperty("Accept-Encoding", z13 ? "gzip" : "identity");
        httpURLConnectionEsjtqupxsv.setInstanceFollowRedirects(z14);
        httpURLConnectionEsjtqupxsv.setDoOutput(bArr != null);
        httpURLConnectionEsjtqupxsv.setRequestMethod(lqeggnwhkg.ppxfxbqfkf(i13));
        if (bArr != null) {
            httpURLConnectionEsjtqupxsv.setFixedLengthStreamingMode(bArr.length);
            httpURLConnectionEsjtqupxsv.connect();
            OutputStream outputStream = httpURLConnectionEsjtqupxsv.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
        } else {
            httpURLConnectionEsjtqupxsv.connect();
        }
        return httpURLConnectionEsjtqupxsv;
    }

    private HttpURLConnection iwizpuwonk(lqeggnwhkg lqeggnwhkgVar) throws IOException {
        URL url = new URL(lqeggnwhkgVar.f15057iobyxmoadg.toString());
        int i13 = lqeggnwhkgVar.f15060ppxfxbqfkf;
        byte[] bArr = lqeggnwhkgVar.f15061wkgbmnqykc;
        long j13 = lqeggnwhkgVar.f15058lqeggnwhkg;
        long j14 = lqeggnwhkgVar.f15059nufgyqmvbu;
        boolean zWkgbmnqykc = lqeggnwhkgVar.wkgbmnqykc(1);
        if (!this.f9983eablkybsjg && !this.f9985gxszxtbevo && !this.f9993wflxmlrfwp) {
            return cqumvgiudr(url, i13, bArr, j13, j14, zWkgbmnqykc, true, lqeggnwhkgVar.f15054eablkybsjg);
        }
        int i14 = 0;
        URL urlYggfygwlhe = url;
        int i15 = i13;
        byte[] bArr2 = bArr;
        while (true) {
            int i16 = i14 + 1;
            if (i14 > 20) {
                throw new HttpDataSource$HttpDataSourceException(new NoRouteToHostException("Too many redirects: " + i16), lqeggnwhkgVar, 2001, 1);
            }
            long j15 = j13;
            long j16 = j13;
            int i17 = i15;
            URL url2 = urlYggfygwlhe;
            long j17 = j14;
            HttpURLConnection httpURLConnectionCqumvgiudr = cqumvgiudr(urlYggfygwlhe, i15, bArr2, j15, j14, zWkgbmnqykc, false, lqeggnwhkgVar.f15054eablkybsjg);
            int responseCode = httpURLConnectionCqumvgiudr.getResponseCode();
            String headerField = httpURLConnectionCqumvgiudr.getHeaderField("Location");
            if ((i17 == 1 || i17 == 3) && (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || responseCode == 307 || responseCode == 308)) {
                httpURLConnectionCqumvgiudr.disconnect();
                urlYggfygwlhe = yggfygwlhe(url2, headerField, lqeggnwhkgVar);
                i15 = i17;
            } else {
                if (i17 != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                    return httpURLConnectionCqumvgiudr;
                }
                httpURLConnectionCqumvgiudr.disconnect();
                if (this.f9993wflxmlrfwp && responseCode == 302) {
                    i15 = i17;
                } else {
                    bArr2 = null;
                    i15 = 1;
                }
                urlYggfygwlhe = yggfygwlhe(url2, headerField, lqeggnwhkgVar);
            }
            i14 = i16;
            j13 = j16;
            j14 = j17;
        }
    }

    private static boolean jyumaefscl(HttpURLConnection httpURLConnection) {
        return "gzip".equalsIgnoreCase(httpURLConnection.getHeaderField("Content-Encoding"));
    }

    private int lereixgezr(byte[] bArr, int i13, int i14) throws IOException {
        if (i14 == 0) {
            return 0;
        }
        long j13 = this.f9986kcexrzcfyt;
        if (j13 != -1) {
            long j14 = j13 - this.f9994zdlpuopuiu;
            if (j14 == 0) {
                return -1;
            }
            i14 = (int) Math.min(i14, j14);
        }
        int i15 = ((InputStream) stevsuqkhv.nufgyqmvbu(this.f9991rgvfuqvkyq)).read(bArr, i13, i14);
        if (i15 == -1) {
            return -1;
        }
        this.f9994zdlpuopuiu += (long) i15;
        rgvfuqvkyq(i15);
        return i15;
    }

    private void pmvmpeiblj(long j13, lqeggnwhkg lqeggnwhkgVar) throws IOException {
        if (j13 == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j13 > 0) {
            int i13 = ((InputStream) stevsuqkhv.nufgyqmvbu(this.f9991rgvfuqvkyq)).read(bArr, 0, (int) Math.min(j13, 4096));
            if (Thread.currentThread().isInterrupted()) {
                throw new HttpDataSource$HttpDataSourceException(new InterruptedIOException(), lqeggnwhkgVar, 2000, 1);
            }
            if (i13 == -1) {
                throw new HttpDataSource$HttpDataSourceException(lqeggnwhkgVar, 2008, 1);
            }
            j13 -= (long) i13;
            rgvfuqvkyq(i13);
        }
    }

    private URL yggfygwlhe(URL url, String str, lqeggnwhkg lqeggnwhkgVar) throws HttpDataSource$HttpDataSourceException {
        if (str == null) {
            throw new HttpDataSource$HttpDataSourceException("Null location redirect", lqeggnwhkgVar, 2001, 1);
        }
        try {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!HostSelectionInterceptorImpl.PROTOCOL_HTTPS.equals(protocol) && !HostSelectionInterceptorImpl.PROTOCOL_HTTP.equals(protocol)) {
                throw new HttpDataSource$HttpDataSourceException("Unsupported protocol redirect: " + protocol, lqeggnwhkgVar, 2001, 1);
            }
            if (this.f9983eablkybsjg || protocol.equals(url.getProtocol())) {
                return url2;
            }
            if (this.f9985gxszxtbevo) {
                try {
                    return new URL(url2.toString().replaceFirst(protocol, url.getProtocol()));
                } catch (MalformedURLException e13) {
                    throw new HttpDataSource$HttpDataSourceException(e13, lqeggnwhkgVar, 2001, 1);
                }
            }
            throw new HttpDataSource$HttpDataSourceException("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + ")", lqeggnwhkgVar, 2001, 1);
        } catch (MalformedURLException e14) {
            throw new HttpDataSource$HttpDataSourceException(e14, lqeggnwhkgVar, 2001, 1);
        }
    }

    private void zdlpuopuiu() {
        HttpURLConnection httpURLConnection = this.f9989ojitshcjhn;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e13) {
                kcexrzcfyt.wkgbmnqykc("DefaultHttpDataSource", "Unexpected error while disconnecting", e13);
            }
        }
    }

    @Override // androidx.media3.datasource.iobyxmoadg
    public Uri agtfadlqog() {
        HttpURLConnection httpURLConnection = this.f9989ojitshcjhn;
        if (httpURLConnection != null) {
            return Uri.parse(httpURLConnection.getURL().toString());
        }
        lqeggnwhkg lqeggnwhkgVar = this.f9979agtfadlqog;
        if (lqeggnwhkgVar != null) {
            return lqeggnwhkgVar.f15057iobyxmoadg;
        }
        return null;
    }

    @Override // androidx.media3.datasource.iobyxmoadg
    public void close() {
        try {
            InputStream inputStream = this.f9991rgvfuqvkyq;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e13) {
                    throw new HttpDataSource$HttpDataSourceException(e13, (lqeggnwhkg) stevsuqkhv.nufgyqmvbu(this.f9979agtfadlqog), 2000, 3);
                }
            }
            this.f9991rgvfuqvkyq = null;
            zdlpuopuiu();
            if (this.f9992vdvldrhtss) {
                this.f9992vdvldrhtss = false;
                vdvldrhtss();
            }
            this.f9989ojitshcjhn = null;
            this.f9979agtfadlqog = null;
        } catch (Throwable th2) {
            this.f9991rgvfuqvkyq = null;
            zdlpuopuiu();
            if (this.f9992vdvldrhtss) {
                this.f9992vdvldrhtss = false;
                vdvldrhtss();
            }
            this.f9989ojitshcjhn = null;
            this.f9979agtfadlqog = null;
            throw th2;
        }
    }

    HttpURLConnection esjtqupxsv(URL url) {
        return (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection()));
    }

    @Override // androidx.media3.datasource.iobyxmoadg
    public long iobyxmoadg(lqeggnwhkg lqeggnwhkgVar) throws HttpDataSource$HttpDataSourceException {
        byte[] bArrZoijcleaow;
        this.f9979agtfadlqog = lqeggnwhkgVar;
        long j13 = 0;
        this.f9994zdlpuopuiu = 0L;
        this.f9986kcexrzcfyt = 0L;
        oxmwwwfdhm(lqeggnwhkgVar);
        try {
            HttpURLConnection httpURLConnectionIwizpuwonk = iwizpuwonk(lqeggnwhkgVar);
            this.f9989ojitshcjhn = httpURLConnectionIwizpuwonk;
            this.f9990oxmwwwfdhm = httpURLConnectionIwizpuwonk.getResponseCode();
            String responseMessage = httpURLConnectionIwizpuwonk.getResponseMessage();
            int i13 = this.f9990oxmwwwfdhm;
            if (i13 < 200 || i13 > 299) {
                Map<String, List<String>> headerFields = httpURLConnectionIwizpuwonk.getHeaderFields();
                if (this.f9990oxmwwwfdhm == 416) {
                    if (lqeggnwhkgVar.f15058lqeggnwhkg == dxjokdxxww.ppxfxbqfkf(httpURLConnectionIwizpuwonk.getHeaderField("Content-Range"))) {
                        this.f9992vdvldrhtss = true;
                        kcexrzcfyt(lqeggnwhkgVar);
                        long j14 = lqeggnwhkgVar.f15059nufgyqmvbu;
                        if (j14 != -1) {
                            return j14;
                        }
                        return 0L;
                    }
                }
                InputStream errorStream = httpURLConnectionIwizpuwonk.getErrorStream();
                try {
                    bArrZoijcleaow = errorStream != null ? ya.iobyxmoadg.zoijcleaow(errorStream) : stevsuqkhv.f123601gxszxtbevo;
                } catch (IOException unused) {
                    bArrZoijcleaow = stevsuqkhv.f123601gxszxtbevo;
                }
                byte[] bArr = bArrZoijcleaow;
                zdlpuopuiu();
                throw new HttpDataSource$InvalidResponseCodeException(this.f9990oxmwwwfdhm, responseMessage, this.f9990oxmwwwfdhm == 416 ? new DataSourceException(2008) : null, headerFields, lqeggnwhkgVar, bArr);
            }
            String contentType = httpURLConnectionIwizpuwonk.getContentType();
            wflxmlrfwp wflxmlrfwpVar = this.f9981draadjrbmk;
            if (wflxmlrfwpVar != null && !wflxmlrfwpVar.apply(contentType)) {
                zdlpuopuiu();
                throw new HttpDataSource$InvalidContentTypeException(contentType, lqeggnwhkgVar);
            }
            if (this.f9990oxmwwwfdhm == 200) {
                long j15 = lqeggnwhkgVar.f15058lqeggnwhkg;
                if (j15 != 0) {
                    j13 = j15;
                }
            }
            boolean zJyumaefscl = jyumaefscl(httpURLConnectionIwizpuwonk);
            if (zJyumaefscl) {
                this.f9986kcexrzcfyt = lqeggnwhkgVar.f15059nufgyqmvbu;
            } else {
                long j16 = lqeggnwhkgVar.f15059nufgyqmvbu;
                if (j16 != -1) {
                    this.f9986kcexrzcfyt = j16;
                } else {
                    long jZoijcleaow = dxjokdxxww.zoijcleaow(httpURLConnectionIwizpuwonk.getHeaderField("Content-Length"), httpURLConnectionIwizpuwonk.getHeaderField("Content-Range"));
                    this.f9986kcexrzcfyt = jZoijcleaow != -1 ? jZoijcleaow - j13 : -1L;
                }
            }
            try {
                this.f9991rgvfuqvkyq = httpURLConnectionIwizpuwonk.getInputStream();
                if (zJyumaefscl) {
                    this.f9991rgvfuqvkyq = new GZIPInputStream(this.f9991rgvfuqvkyq);
                }
                this.f9992vdvldrhtss = true;
                kcexrzcfyt(lqeggnwhkgVar);
                try {
                    pmvmpeiblj(j13, lqeggnwhkgVar);
                    return this.f9986kcexrzcfyt;
                } catch (IOException e13) {
                    zdlpuopuiu();
                    if (e13 instanceof HttpDataSource$HttpDataSourceException) {
                        throw ((HttpDataSource$HttpDataSourceException) e13);
                    }
                    throw new HttpDataSource$HttpDataSourceException(e13, lqeggnwhkgVar, 2000, 1);
                }
            } catch (IOException e14) {
                zdlpuopuiu();
                throw new HttpDataSource$HttpDataSourceException(e14, lqeggnwhkgVar, 2000, 1);
            }
        } catch (IOException e15) {
            zdlpuopuiu();
            throw HttpDataSource$HttpDataSourceException.lqeggnwhkg(e15, lqeggnwhkgVar, 1);
        }
    }

    @Override // androidx.media3.datasource.iobyxmoadg
    public Map wkgbmnqykc() {
        HttpURLConnection httpURLConnection = this.f9989ojitshcjhn;
        return httpURLConnection == null ? yggfygwlhe.kcexrzcfyt() : new C0163ppxfxbqfkf(httpURLConnection.getHeaderFields());
    }

    @Override // v2.btonecajqb
    public int zoijcleaow(byte[] bArr, int i13, int i14) throws HttpDataSource$HttpDataSourceException {
        try {
            return lereixgezr(bArr, i13, i14);
        } catch (IOException e13) {
            throw HttpDataSource$HttpDataSourceException.lqeggnwhkg(e13, (lqeggnwhkg) stevsuqkhv.nufgyqmvbu(this.f9979agtfadlqog), 2);
        }
    }

    private ppxfxbqfkf(String str, int i13, int i14, boolean z13, boolean z14, nufgyqmvbu nufgyqmvbuVar, wflxmlrfwp wflxmlrfwpVar, boolean z15) {
        super(true);
        this.f9982dxjokdxxww = str;
        this.f9987lqeggnwhkg = i13;
        this.f9988nufgyqmvbu = i14;
        this.f9983eablkybsjg = z13;
        this.f9985gxszxtbevo = z14;
        if (z13 && z14) {
            throw new IllegalArgumentException("crossProtocolRedirectsForceOriginal should not be set if allowCrossProtocolRedirects is true");
        }
        this.f9980btonecajqb = nufgyqmvbuVar;
        this.f9981draadjrbmk = wflxmlrfwpVar;
        this.f9984gtknphoqwx = new nufgyqmvbu();
        this.f9993wflxmlrfwp = z15;
    }
}
