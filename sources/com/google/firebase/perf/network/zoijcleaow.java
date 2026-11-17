package com.google.firebase.perf.network;

import com.google.firebase.perf.util.Timer;
import hd.lqeggnwhkg;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.security.Permission;
import java.security.Principal;
import java.security.cert.Certificate;
import java.util.Map;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes2.dex */
public final class zoijcleaow extends HttpsURLConnection {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ppxfxbqfkf f24649iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final HttpsURLConnection f24650zoijcleaow;

    zoijcleaow(HttpsURLConnection httpsURLConnection, Timer timer, lqeggnwhkg lqeggnwhkgVar) {
        super(httpsURLConnection.getURL());
        this.f24650zoijcleaow = httpsURLConnection;
        this.f24649iobyxmoadg = new ppxfxbqfkf(httpsURLConnection, timer, lqeggnwhkgVar);
    }

    @Override // java.net.URLConnection
    public void addRequestProperty(String str, String str2) {
        this.f24649iobyxmoadg.iobyxmoadg(str, str2);
    }

    @Override // java.net.URLConnection
    public void connect() {
        this.f24649iobyxmoadg.zoijcleaow();
    }

    @Override // java.net.HttpURLConnection
    public void disconnect() {
        this.f24649iobyxmoadg.ppxfxbqfkf();
    }

    public boolean equals(Object obj) {
        return this.f24649iobyxmoadg.equals(obj);
    }

    @Override // java.net.URLConnection
    public boolean getAllowUserInteraction() {
        return this.f24649iobyxmoadg.wkgbmnqykc();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public String getCipherSuite() {
        return this.f24650zoijcleaow.getCipherSuite();
    }

    @Override // java.net.URLConnection
    public int getConnectTimeout() {
        return this.f24649iobyxmoadg.eablkybsjg();
    }

    @Override // java.net.URLConnection
    public Object getContent() {
        return this.f24649iobyxmoadg.gxszxtbevo();
    }

    @Override // java.net.URLConnection
    public String getContentEncoding() {
        return this.f24649iobyxmoadg.nufgyqmvbu();
    }

    @Override // java.net.URLConnection
    public int getContentLength() {
        return this.f24649iobyxmoadg.dxjokdxxww();
    }

    @Override // java.net.URLConnection
    public long getContentLengthLong() {
        return this.f24649iobyxmoadg.btonecajqb();
    }

    @Override // java.net.URLConnection
    public String getContentType() {
        return this.f24649iobyxmoadg.gtknphoqwx();
    }

    @Override // java.net.URLConnection
    public long getDate() {
        return this.f24649iobyxmoadg.draadjrbmk();
    }

    @Override // java.net.URLConnection
    public boolean getDefaultUseCaches() {
        return this.f24649iobyxmoadg.wflxmlrfwp();
    }

    @Override // java.net.URLConnection
    public boolean getDoInput() {
        return this.f24649iobyxmoadg.agtfadlqog();
    }

    @Override // java.net.URLConnection
    public boolean getDoOutput() {
        return this.f24649iobyxmoadg.ojitshcjhn();
    }

    @Override // java.net.HttpURLConnection
    public InputStream getErrorStream() {
        return this.f24649iobyxmoadg.rgvfuqvkyq();
    }

    @Override // java.net.URLConnection
    public long getExpiration() {
        return this.f24649iobyxmoadg.vdvldrhtss();
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public String getHeaderField(int i13) {
        return this.f24649iobyxmoadg.oxmwwwfdhm(i13);
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public long getHeaderFieldDate(String str, long j13) {
        return this.f24649iobyxmoadg.zdlpuopuiu(str, j13);
    }

    @Override // java.net.URLConnection
    public int getHeaderFieldInt(String str, int i13) {
        return this.f24649iobyxmoadg.yggfygwlhe(str, i13);
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public String getHeaderFieldKey(int i13) {
        return this.f24649iobyxmoadg.jyumaefscl(i13);
    }

    @Override // java.net.URLConnection
    public long getHeaderFieldLong(String str, long j13) {
        return this.f24649iobyxmoadg.iwizpuwonk(str, j13);
    }

    @Override // java.net.URLConnection
    public Map getHeaderFields() {
        return this.f24649iobyxmoadg.cqumvgiudr();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public HostnameVerifier getHostnameVerifier() {
        return this.f24650zoijcleaow.getHostnameVerifier();
    }

    @Override // java.net.URLConnection
    public long getIfModifiedSince() {
        return this.f24649iobyxmoadg.esjtqupxsv();
    }

    @Override // java.net.URLConnection
    public InputStream getInputStream() {
        return this.f24649iobyxmoadg.lereixgezr();
    }

    @Override // java.net.HttpURLConnection
    public boolean getInstanceFollowRedirects() {
        return this.f24649iobyxmoadg.pmvmpeiblj();
    }

    @Override // java.net.URLConnection
    public long getLastModified() {
        return this.f24649iobyxmoadg.zynmafqrjb();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public Certificate[] getLocalCertificates() {
        return this.f24650zoijcleaow.getLocalCertificates();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public Principal getLocalPrincipal() {
        return this.f24650zoijcleaow.getLocalPrincipal();
    }

    @Override // java.net.URLConnection
    public OutputStream getOutputStream() {
        return this.f24649iobyxmoadg.istkbnxepw();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public Principal getPeerPrincipal() {
        return this.f24650zoijcleaow.getPeerPrincipal();
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public Permission getPermission() {
        return this.f24649iobyxmoadg.cdpycssgdh();
    }

    @Override // java.net.URLConnection
    public int getReadTimeout() {
        return this.f24649iobyxmoadg.yadqdtsiqt();
    }

    @Override // java.net.HttpURLConnection
    public String getRequestMethod() {
        return this.f24649iobyxmoadg.iozdgvuglv();
    }

    @Override // java.net.URLConnection
    public Map getRequestProperties() {
        return this.f24649iobyxmoadg.lmojexxdyd();
    }

    @Override // java.net.URLConnection
    public String getRequestProperty(String str) {
        return this.f24649iobyxmoadg.wwaezpbzkn(str);
    }

    @Override // java.net.HttpURLConnection
    public int getResponseCode() {
        return this.f24649iobyxmoadg.ylkuphrtab();
    }

    @Override // java.net.HttpURLConnection
    public String getResponseMessage() {
        return this.f24649iobyxmoadg.pkzmftpjix();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public SSLSocketFactory getSSLSocketFactory() {
        return this.f24650zoijcleaow.getSSLSocketFactory();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public Certificate[] getServerCertificates() {
        return this.f24650zoijcleaow.getServerCertificates();
    }

    @Override // java.net.URLConnection
    public URL getURL() {
        return this.f24649iobyxmoadg.hcddaimhww();
    }

    @Override // java.net.URLConnection
    public boolean getUseCaches() {
        return this.f24649iobyxmoadg.jpowsppfya();
    }

    public int hashCode() {
        return this.f24649iobyxmoadg.hashCode();
    }

    @Override // java.net.URLConnection
    public void setAllowUserInteraction(boolean z13) {
        this.f24649iobyxmoadg.hkdspvbjdz(z13);
    }

    @Override // java.net.HttpURLConnection
    public void setChunkedStreamingMode(int i13) {
        this.f24649iobyxmoadg.cllcsxoeiz(i13);
    }

    @Override // java.net.URLConnection
    public void setConnectTimeout(int i13) {
        this.f24649iobyxmoadg.dsvhmnatus(i13);
    }

    @Override // java.net.URLConnection
    public void setDefaultUseCaches(boolean z13) {
        this.f24649iobyxmoadg.wypolnanlu(z13);
    }

    @Override // java.net.URLConnection
    public void setDoInput(boolean z13) {
        this.f24649iobyxmoadg.stevsuqkhv(z13);
    }

    @Override // java.net.URLConnection
    public void setDoOutput(boolean z13) {
        this.f24649iobyxmoadg.kegysxyocb(z13);
    }

    @Override // java.net.HttpURLConnection
    public void setFixedLengthStreamingMode(int i13) {
        this.f24649iobyxmoadg.tzroggbefp(i13);
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public void setHostnameVerifier(HostnameVerifier hostnameVerifier) {
        this.f24650zoijcleaow.setHostnameVerifier(hostnameVerifier);
    }

    @Override // java.net.URLConnection
    public void setIfModifiedSince(long j13) {
        this.f24649iobyxmoadg.ntlheqmsrt(j13);
    }

    @Override // java.net.HttpURLConnection
    public void setInstanceFollowRedirects(boolean z13) {
        this.f24649iobyxmoadg.ulzqkzuiru(z13);
    }

    @Override // java.net.URLConnection
    public void setReadTimeout(int i13) {
        this.f24649iobyxmoadg.sopmlzcsov(i13);
    }

    @Override // java.net.HttpURLConnection
    public void setRequestMethod(String str) {
        this.f24649iobyxmoadg.crxdokpmqz(str);
    }

    @Override // java.net.URLConnection
    public void setRequestProperty(String str, String str2) {
        this.f24649iobyxmoadg.jlmebxxoox(str, str2);
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public void setSSLSocketFactory(SSLSocketFactory sSLSocketFactory) {
        this.f24650zoijcleaow.setSSLSocketFactory(sSLSocketFactory);
    }

    @Override // java.net.URLConnection
    public void setUseCaches(boolean z13) {
        this.f24649iobyxmoadg.ribwqtqdhb(z13);
    }

    @Override // java.net.URLConnection
    public String toString() {
        return this.f24649iobyxmoadg.toString();
    }

    @Override // java.net.HttpURLConnection
    public boolean usingProxy() {
        return this.f24649iobyxmoadg.jhduphickx();
    }

    @Override // java.net.URLConnection
    public Object getContent(Class[] clsArr) {
        return this.f24649iobyxmoadg.lqeggnwhkg(clsArr);
    }

    @Override // java.net.URLConnection
    public String getHeaderField(String str) {
        return this.f24649iobyxmoadg.kcexrzcfyt(str);
    }

    @Override // java.net.HttpURLConnection
    public void setFixedLengthStreamingMode(long j13) {
        this.f24649iobyxmoadg.mbcevpiqjq(j13);
    }
}
