package com.google.firebase.perf.network;

import com.google.firebase.perf.util.Timer;
import hd.lqeggnwhkg;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.Permission;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
class ppxfxbqfkf {

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private static final gd.iobyxmoadg f24639gxszxtbevo = gd.iobyxmoadg.eablkybsjg();

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final Timer f24640eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final HttpURLConnection f24641iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private long f24642ppxfxbqfkf = -1;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private long f24643wkgbmnqykc = -1;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final lqeggnwhkg f24644zoijcleaow;

    public ppxfxbqfkf(HttpURLConnection httpURLConnection, Timer timer, lqeggnwhkg lqeggnwhkgVar) {
        this.f24641iobyxmoadg = httpURLConnection;
        this.f24644zoijcleaow = lqeggnwhkgVar;
        this.f24640eablkybsjg = timer;
        lqeggnwhkgVar.pkzmftpjix(httpURLConnection.getURL().toString());
    }

    private void vipkmwdibw() {
        if (this.f24642ppxfxbqfkf == -1) {
            this.f24640eablkybsjg.dxjokdxxww();
            long jLqeggnwhkg = this.f24640eablkybsjg.lqeggnwhkg();
            this.f24642ppxfxbqfkf = jLqeggnwhkg;
            this.f24644zoijcleaow.esjtqupxsv(jLqeggnwhkg);
        }
        String strIozdgvuglv = iozdgvuglv();
        if (strIozdgvuglv != null) {
            this.f24644zoijcleaow.wflxmlrfwp(strIozdgvuglv);
        } else if (ojitshcjhn()) {
            this.f24644zoijcleaow.wflxmlrfwp("POST");
        } else {
            this.f24644zoijcleaow.wflxmlrfwp("GET");
        }
    }

    public boolean agtfadlqog() {
        return this.f24641iobyxmoadg.getDoInput();
    }

    public long btonecajqb() {
        vipkmwdibw();
        return this.f24641iobyxmoadg.getContentLengthLong();
    }

    public Permission cdpycssgdh() throws IOException {
        try {
            return this.f24641iobyxmoadg.getPermission();
        } catch (IOException e13) {
            this.f24644zoijcleaow.wwaezpbzkn(this.f24640eablkybsjg.eablkybsjg());
            jd.wkgbmnqykc.wkgbmnqykc(this.f24644zoijcleaow);
            throw e13;
        }
    }

    public void cllcsxoeiz(int i13) {
        this.f24641iobyxmoadg.setChunkedStreamingMode(i13);
    }

    public Map cqumvgiudr() {
        vipkmwdibw();
        return this.f24641iobyxmoadg.getHeaderFields();
    }

    public void crxdokpmqz(String str) {
        this.f24641iobyxmoadg.setRequestMethod(str);
    }

    public long draadjrbmk() {
        vipkmwdibw();
        return this.f24641iobyxmoadg.getDate();
    }

    public void dsvhmnatus(int i13) {
        this.f24641iobyxmoadg.setConnectTimeout(i13);
    }

    public int dxjokdxxww() {
        vipkmwdibw();
        return this.f24641iobyxmoadg.getContentLength();
    }

    public int eablkybsjg() {
        return this.f24641iobyxmoadg.getConnectTimeout();
    }

    public boolean equals(Object obj) {
        return this.f24641iobyxmoadg.equals(obj);
    }

    public long esjtqupxsv() {
        return this.f24641iobyxmoadg.getIfModifiedSince();
    }

    public String gtknphoqwx() {
        vipkmwdibw();
        return this.f24641iobyxmoadg.getContentType();
    }

    public Object gxszxtbevo() throws IOException {
        vipkmwdibw();
        this.f24644zoijcleaow.oxmwwwfdhm(this.f24641iobyxmoadg.getResponseCode());
        try {
            Object content = this.f24641iobyxmoadg.getContent();
            if (content instanceof InputStream) {
                this.f24644zoijcleaow.yadqdtsiqt(this.f24641iobyxmoadg.getContentType());
                return new jd.iobyxmoadg((InputStream) content, this.f24644zoijcleaow, this.f24640eablkybsjg);
            }
            this.f24644zoijcleaow.yadqdtsiqt(this.f24641iobyxmoadg.getContentType());
            this.f24644zoijcleaow.iozdgvuglv(this.f24641iobyxmoadg.getContentLength());
            this.f24644zoijcleaow.wwaezpbzkn(this.f24640eablkybsjg.eablkybsjg());
            this.f24644zoijcleaow.ppxfxbqfkf();
            return content;
        } catch (IOException e13) {
            this.f24644zoijcleaow.wwaezpbzkn(this.f24640eablkybsjg.eablkybsjg());
            jd.wkgbmnqykc.wkgbmnqykc(this.f24644zoijcleaow);
            throw e13;
        }
    }

    public int hashCode() {
        return this.f24641iobyxmoadg.hashCode();
    }

    public URL hcddaimhww() {
        return this.f24641iobyxmoadg.getURL();
    }

    public void hkdspvbjdz(boolean z13) {
        this.f24641iobyxmoadg.setAllowUserInteraction(z13);
    }

    public void iobyxmoadg(String str, String str2) {
        this.f24641iobyxmoadg.addRequestProperty(str, str2);
    }

    public String iozdgvuglv() {
        return this.f24641iobyxmoadg.getRequestMethod();
    }

    public OutputStream istkbnxepw() throws IOException {
        try {
            OutputStream outputStream = this.f24641iobyxmoadg.getOutputStream();
            return outputStream != null ? new jd.zoijcleaow(outputStream, this.f24644zoijcleaow, this.f24640eablkybsjg) : outputStream;
        } catch (IOException e13) {
            this.f24644zoijcleaow.wwaezpbzkn(this.f24640eablkybsjg.eablkybsjg());
            jd.wkgbmnqykc.wkgbmnqykc(this.f24644zoijcleaow);
            throw e13;
        }
    }

    public long iwizpuwonk(String str, long j13) {
        vipkmwdibw();
        return this.f24641iobyxmoadg.getHeaderFieldLong(str, j13);
    }

    public boolean jhduphickx() {
        return this.f24641iobyxmoadg.usingProxy();
    }

    public void jlmebxxoox(String str, String str2) {
        if ("User-Agent".equalsIgnoreCase(str)) {
            this.f24644zoijcleaow.hcddaimhww(str2);
        }
        this.f24641iobyxmoadg.setRequestProperty(str, str2);
    }

    public boolean jpowsppfya() {
        return this.f24641iobyxmoadg.getUseCaches();
    }

    public String jyumaefscl(int i13) {
        vipkmwdibw();
        return this.f24641iobyxmoadg.getHeaderFieldKey(i13);
    }

    public String kcexrzcfyt(String str) {
        vipkmwdibw();
        return this.f24641iobyxmoadg.getHeaderField(str);
    }

    public void kegysxyocb(boolean z13) {
        this.f24641iobyxmoadg.setDoOutput(z13);
    }

    public InputStream lereixgezr() throws IOException {
        vipkmwdibw();
        this.f24644zoijcleaow.oxmwwwfdhm(this.f24641iobyxmoadg.getResponseCode());
        this.f24644zoijcleaow.yadqdtsiqt(this.f24641iobyxmoadg.getContentType());
        try {
            InputStream inputStream = this.f24641iobyxmoadg.getInputStream();
            return inputStream != null ? new jd.iobyxmoadg(inputStream, this.f24644zoijcleaow, this.f24640eablkybsjg) : inputStream;
        } catch (IOException e13) {
            this.f24644zoijcleaow.wwaezpbzkn(this.f24640eablkybsjg.eablkybsjg());
            jd.wkgbmnqykc.wkgbmnqykc(this.f24644zoijcleaow);
            throw e13;
        }
    }

    public Map lmojexxdyd() {
        return this.f24641iobyxmoadg.getRequestProperties();
    }

    public Object lqeggnwhkg(Class[] clsArr) throws IOException {
        vipkmwdibw();
        this.f24644zoijcleaow.oxmwwwfdhm(this.f24641iobyxmoadg.getResponseCode());
        try {
            Object content = this.f24641iobyxmoadg.getContent(clsArr);
            if (content instanceof InputStream) {
                this.f24644zoijcleaow.yadqdtsiqt(this.f24641iobyxmoadg.getContentType());
                return new jd.iobyxmoadg((InputStream) content, this.f24644zoijcleaow, this.f24640eablkybsjg);
            }
            this.f24644zoijcleaow.yadqdtsiqt(this.f24641iobyxmoadg.getContentType());
            this.f24644zoijcleaow.iozdgvuglv(this.f24641iobyxmoadg.getContentLength());
            this.f24644zoijcleaow.wwaezpbzkn(this.f24640eablkybsjg.eablkybsjg());
            this.f24644zoijcleaow.ppxfxbqfkf();
            return content;
        } catch (IOException e13) {
            this.f24644zoijcleaow.wwaezpbzkn(this.f24640eablkybsjg.eablkybsjg());
            jd.wkgbmnqykc.wkgbmnqykc(this.f24644zoijcleaow);
            throw e13;
        }
    }

    public void mbcevpiqjq(long j13) {
        this.f24641iobyxmoadg.setFixedLengthStreamingMode(j13);
    }

    public void ntlheqmsrt(long j13) {
        this.f24641iobyxmoadg.setIfModifiedSince(j13);
    }

    public String nufgyqmvbu() {
        vipkmwdibw();
        return this.f24641iobyxmoadg.getContentEncoding();
    }

    public boolean ojitshcjhn() {
        return this.f24641iobyxmoadg.getDoOutput();
    }

    public String oxmwwwfdhm(int i13) {
        vipkmwdibw();
        return this.f24641iobyxmoadg.getHeaderField(i13);
    }

    public String pkzmftpjix() throws IOException {
        vipkmwdibw();
        if (this.f24643wkgbmnqykc == -1) {
            long jEablkybsjg = this.f24640eablkybsjg.eablkybsjg();
            this.f24643wkgbmnqykc = jEablkybsjg;
            this.f24644zoijcleaow.ylkuphrtab(jEablkybsjg);
        }
        try {
            String responseMessage = this.f24641iobyxmoadg.getResponseMessage();
            this.f24644zoijcleaow.oxmwwwfdhm(this.f24641iobyxmoadg.getResponseCode());
            return responseMessage;
        } catch (IOException e13) {
            this.f24644zoijcleaow.wwaezpbzkn(this.f24640eablkybsjg.eablkybsjg());
            jd.wkgbmnqykc.wkgbmnqykc(this.f24644zoijcleaow);
            throw e13;
        }
    }

    public boolean pmvmpeiblj() {
        return this.f24641iobyxmoadg.getInstanceFollowRedirects();
    }

    public void ppxfxbqfkf() {
        this.f24644zoijcleaow.wwaezpbzkn(this.f24640eablkybsjg.eablkybsjg());
        this.f24644zoijcleaow.ppxfxbqfkf();
        this.f24641iobyxmoadg.disconnect();
    }

    public InputStream rgvfuqvkyq() {
        vipkmwdibw();
        try {
            this.f24644zoijcleaow.oxmwwwfdhm(this.f24641iobyxmoadg.getResponseCode());
        } catch (IOException unused) {
            f24639gxszxtbevo.iobyxmoadg("IOException thrown trying to obtain the response code");
        }
        InputStream errorStream = this.f24641iobyxmoadg.getErrorStream();
        return errorStream != null ? new jd.iobyxmoadg(errorStream, this.f24644zoijcleaow, this.f24640eablkybsjg) : errorStream;
    }

    public void ribwqtqdhb(boolean z13) {
        this.f24641iobyxmoadg.setUseCaches(z13);
    }

    public void sopmlzcsov(int i13) {
        this.f24641iobyxmoadg.setReadTimeout(i13);
    }

    public void stevsuqkhv(boolean z13) {
        this.f24641iobyxmoadg.setDoInput(z13);
    }

    public String toString() {
        return this.f24641iobyxmoadg.toString();
    }

    public void tzroggbefp(int i13) {
        this.f24641iobyxmoadg.setFixedLengthStreamingMode(i13);
    }

    public void ulzqkzuiru(boolean z13) {
        this.f24641iobyxmoadg.setInstanceFollowRedirects(z13);
    }

    public long vdvldrhtss() {
        vipkmwdibw();
        return this.f24641iobyxmoadg.getExpiration();
    }

    public boolean wflxmlrfwp() {
        return this.f24641iobyxmoadg.getDefaultUseCaches();
    }

    public boolean wkgbmnqykc() {
        return this.f24641iobyxmoadg.getAllowUserInteraction();
    }

    public String wwaezpbzkn(String str) {
        return this.f24641iobyxmoadg.getRequestProperty(str);
    }

    public void wypolnanlu(boolean z13) {
        this.f24641iobyxmoadg.setDefaultUseCaches(z13);
    }

    public int yadqdtsiqt() {
        return this.f24641iobyxmoadg.getReadTimeout();
    }

    public int yggfygwlhe(String str, int i13) {
        vipkmwdibw();
        return this.f24641iobyxmoadg.getHeaderFieldInt(str, i13);
    }

    public int ylkuphrtab() throws IOException {
        vipkmwdibw();
        if (this.f24643wkgbmnqykc == -1) {
            long jEablkybsjg = this.f24640eablkybsjg.eablkybsjg();
            this.f24643wkgbmnqykc = jEablkybsjg;
            this.f24644zoijcleaow.ylkuphrtab(jEablkybsjg);
        }
        try {
            int responseCode = this.f24641iobyxmoadg.getResponseCode();
            this.f24644zoijcleaow.oxmwwwfdhm(responseCode);
            return responseCode;
        } catch (IOException e13) {
            this.f24644zoijcleaow.wwaezpbzkn(this.f24640eablkybsjg.eablkybsjg());
            jd.wkgbmnqykc.wkgbmnqykc(this.f24644zoijcleaow);
            throw e13;
        }
    }

    public long zdlpuopuiu(String str, long j13) {
        vipkmwdibw();
        return this.f24641iobyxmoadg.getHeaderFieldDate(str, j13);
    }

    public void zoijcleaow() {
        if (this.f24642ppxfxbqfkf == -1) {
            this.f24640eablkybsjg.dxjokdxxww();
            long jLqeggnwhkg = this.f24640eablkybsjg.lqeggnwhkg();
            this.f24642ppxfxbqfkf = jLqeggnwhkg;
            this.f24644zoijcleaow.esjtqupxsv(jLqeggnwhkg);
        }
        try {
            this.f24641iobyxmoadg.connect();
        } catch (IOException e13) {
            this.f24644zoijcleaow.wwaezpbzkn(this.f24640eablkybsjg.eablkybsjg());
            jd.wkgbmnqykc.wkgbmnqykc(this.f24644zoijcleaow);
            throw e13;
        }
    }

    public long zynmafqrjb() {
        vipkmwdibw();
        return this.f24641iobyxmoadg.getLastModified();
    }
}
