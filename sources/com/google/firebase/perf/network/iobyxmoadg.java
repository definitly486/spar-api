package com.google.firebase.perf.network;

import com.google.firebase.perf.util.Timer;
import hd.lqeggnwhkg;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.Permission;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class iobyxmoadg extends HttpURLConnection {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ppxfxbqfkf f24638iobyxmoadg;

    iobyxmoadg(HttpURLConnection httpURLConnection, Timer timer, lqeggnwhkg lqeggnwhkgVar) {
        super(httpURLConnection.getURL());
        this.f24638iobyxmoadg = new ppxfxbqfkf(httpURLConnection, timer, lqeggnwhkgVar);
    }

    @Override // java.net.URLConnection
    public void addRequestProperty(String str, String str2) {
        this.f24638iobyxmoadg.iobyxmoadg(str, str2);
    }

    @Override // java.net.URLConnection
    public void connect() {
        this.f24638iobyxmoadg.zoijcleaow();
    }

    @Override // java.net.HttpURLConnection
    public void disconnect() {
        this.f24638iobyxmoadg.ppxfxbqfkf();
    }

    public boolean equals(Object obj) {
        return this.f24638iobyxmoadg.equals(obj);
    }

    @Override // java.net.URLConnection
    public boolean getAllowUserInteraction() {
        return this.f24638iobyxmoadg.wkgbmnqykc();
    }

    @Override // java.net.URLConnection
    public int getConnectTimeout() {
        return this.f24638iobyxmoadg.eablkybsjg();
    }

    @Override // java.net.URLConnection
    public Object getContent() {
        return this.f24638iobyxmoadg.gxszxtbevo();
    }

    @Override // java.net.URLConnection
    public String getContentEncoding() {
        return this.f24638iobyxmoadg.nufgyqmvbu();
    }

    @Override // java.net.URLConnection
    public int getContentLength() {
        return this.f24638iobyxmoadg.dxjokdxxww();
    }

    @Override // java.net.URLConnection
    public long getContentLengthLong() {
        return this.f24638iobyxmoadg.btonecajqb();
    }

    @Override // java.net.URLConnection
    public String getContentType() {
        return this.f24638iobyxmoadg.gtknphoqwx();
    }

    @Override // java.net.URLConnection
    public long getDate() {
        return this.f24638iobyxmoadg.draadjrbmk();
    }

    @Override // java.net.URLConnection
    public boolean getDefaultUseCaches() {
        return this.f24638iobyxmoadg.wflxmlrfwp();
    }

    @Override // java.net.URLConnection
    public boolean getDoInput() {
        return this.f24638iobyxmoadg.agtfadlqog();
    }

    @Override // java.net.URLConnection
    public boolean getDoOutput() {
        return this.f24638iobyxmoadg.ojitshcjhn();
    }

    @Override // java.net.HttpURLConnection
    public InputStream getErrorStream() {
        return this.f24638iobyxmoadg.rgvfuqvkyq();
    }

    @Override // java.net.URLConnection
    public long getExpiration() {
        return this.f24638iobyxmoadg.vdvldrhtss();
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public String getHeaderField(int i13) {
        return this.f24638iobyxmoadg.oxmwwwfdhm(i13);
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public long getHeaderFieldDate(String str, long j13) {
        return this.f24638iobyxmoadg.zdlpuopuiu(str, j13);
    }

    @Override // java.net.URLConnection
    public int getHeaderFieldInt(String str, int i13) {
        return this.f24638iobyxmoadg.yggfygwlhe(str, i13);
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public String getHeaderFieldKey(int i13) {
        return this.f24638iobyxmoadg.jyumaefscl(i13);
    }

    @Override // java.net.URLConnection
    public long getHeaderFieldLong(String str, long j13) {
        return this.f24638iobyxmoadg.iwizpuwonk(str, j13);
    }

    @Override // java.net.URLConnection
    public Map getHeaderFields() {
        return this.f24638iobyxmoadg.cqumvgiudr();
    }

    @Override // java.net.URLConnection
    public long getIfModifiedSince() {
        return this.f24638iobyxmoadg.esjtqupxsv();
    }

    @Override // java.net.URLConnection
    public InputStream getInputStream() {
        return this.f24638iobyxmoadg.lereixgezr();
    }

    @Override // java.net.HttpURLConnection
    public boolean getInstanceFollowRedirects() {
        return this.f24638iobyxmoadg.pmvmpeiblj();
    }

    @Override // java.net.URLConnection
    public long getLastModified() {
        return this.f24638iobyxmoadg.zynmafqrjb();
    }

    @Override // java.net.URLConnection
    public OutputStream getOutputStream() {
        return this.f24638iobyxmoadg.istkbnxepw();
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public Permission getPermission() {
        return this.f24638iobyxmoadg.cdpycssgdh();
    }

    @Override // java.net.URLConnection
    public int getReadTimeout() {
        return this.f24638iobyxmoadg.yadqdtsiqt();
    }

    @Override // java.net.HttpURLConnection
    public String getRequestMethod() {
        return this.f24638iobyxmoadg.iozdgvuglv();
    }

    @Override // java.net.URLConnection
    public Map getRequestProperties() {
        return this.f24638iobyxmoadg.lmojexxdyd();
    }

    @Override // java.net.URLConnection
    public String getRequestProperty(String str) {
        return this.f24638iobyxmoadg.wwaezpbzkn(str);
    }

    @Override // java.net.HttpURLConnection
    public int getResponseCode() {
        return this.f24638iobyxmoadg.ylkuphrtab();
    }

    @Override // java.net.HttpURLConnection
    public String getResponseMessage() {
        return this.f24638iobyxmoadg.pkzmftpjix();
    }

    @Override // java.net.URLConnection
    public URL getURL() {
        return this.f24638iobyxmoadg.hcddaimhww();
    }

    @Override // java.net.URLConnection
    public boolean getUseCaches() {
        return this.f24638iobyxmoadg.jpowsppfya();
    }

    public int hashCode() {
        return this.f24638iobyxmoadg.hashCode();
    }

    @Override // java.net.URLConnection
    public void setAllowUserInteraction(boolean z13) {
        this.f24638iobyxmoadg.hkdspvbjdz(z13);
    }

    @Override // java.net.HttpURLConnection
    public void setChunkedStreamingMode(int i13) {
        this.f24638iobyxmoadg.cllcsxoeiz(i13);
    }

    @Override // java.net.URLConnection
    public void setConnectTimeout(int i13) {
        this.f24638iobyxmoadg.dsvhmnatus(i13);
    }

    @Override // java.net.URLConnection
    public void setDefaultUseCaches(boolean z13) {
        this.f24638iobyxmoadg.wypolnanlu(z13);
    }

    @Override // java.net.URLConnection
    public void setDoInput(boolean z13) {
        this.f24638iobyxmoadg.stevsuqkhv(z13);
    }

    @Override // java.net.URLConnection
    public void setDoOutput(boolean z13) {
        this.f24638iobyxmoadg.kegysxyocb(z13);
    }

    @Override // java.net.HttpURLConnection
    public void setFixedLengthStreamingMode(int i13) {
        this.f24638iobyxmoadg.tzroggbefp(i13);
    }

    @Override // java.net.URLConnection
    public void setIfModifiedSince(long j13) {
        this.f24638iobyxmoadg.ntlheqmsrt(j13);
    }

    @Override // java.net.HttpURLConnection
    public void setInstanceFollowRedirects(boolean z13) {
        this.f24638iobyxmoadg.ulzqkzuiru(z13);
    }

    @Override // java.net.URLConnection
    public void setReadTimeout(int i13) {
        this.f24638iobyxmoadg.sopmlzcsov(i13);
    }

    @Override // java.net.HttpURLConnection
    public void setRequestMethod(String str) {
        this.f24638iobyxmoadg.crxdokpmqz(str);
    }

    @Override // java.net.URLConnection
    public void setRequestProperty(String str, String str2) {
        this.f24638iobyxmoadg.jlmebxxoox(str, str2);
    }

    @Override // java.net.URLConnection
    public void setUseCaches(boolean z13) {
        this.f24638iobyxmoadg.ribwqtqdhb(z13);
    }

    @Override // java.net.URLConnection
    public String toString() {
        return this.f24638iobyxmoadg.toString();
    }

    @Override // java.net.HttpURLConnection
    public boolean usingProxy() {
        return this.f24638iobyxmoadg.jhduphickx();
    }

    @Override // java.net.URLConnection
    public Object getContent(Class[] clsArr) {
        return this.f24638iobyxmoadg.lqeggnwhkg(clsArr);
    }

    @Override // java.net.URLConnection
    public String getHeaderField(String str) {
        return this.f24638iobyxmoadg.kcexrzcfyt(str);
    }

    @Override // java.net.HttpURLConnection
    public void setFixedLengthStreamingMode(long j13) {
        this.f24638iobyxmoadg.mbcevpiqjq(j13);
    }
}
