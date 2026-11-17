package com.google.firebase.perf.network;

import androidx.annotation.Keep;
import com.google.firebase.perf.util.Timer;
import hd.lqeggnwhkg;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import ld.gtknphoqwx;
import md.wflxmlrfwp;

/* JADX INFO: loaded from: classes2.dex */
public class FirebasePerfUrlConnection {
    @Keep
    public static Object getContent(URL url) throws IOException {
        return iobyxmoadg(new wflxmlrfwp(url), gtknphoqwx.gtknphoqwx(), new Timer());
    }

    @Keep
    public static Object instrument(Object obj) throws IOException {
        if (obj instanceof HttpsURLConnection) {
            return new zoijcleaow((HttpsURLConnection) obj, new Timer(), lqeggnwhkg.eablkybsjg(gtknphoqwx.gtknphoqwx()));
        }
        return obj instanceof HttpURLConnection ? new iobyxmoadg((HttpURLConnection) obj, new Timer(), lqeggnwhkg.eablkybsjg(gtknphoqwx.gtknphoqwx())) : obj;
    }

    static Object iobyxmoadg(wflxmlrfwp wflxmlrfwpVar, gtknphoqwx gtknphoqwxVar, Timer timer) throws IOException {
        timer.dxjokdxxww();
        long jLqeggnwhkg = timer.lqeggnwhkg();
        lqeggnwhkg lqeggnwhkgVarEablkybsjg = lqeggnwhkg.eablkybsjg(gtknphoqwxVar);
        try {
            URLConnection uRLConnectionIobyxmoadg = wflxmlrfwpVar.iobyxmoadg();
            if (uRLConnectionIobyxmoadg instanceof HttpsURLConnection) {
                return new zoijcleaow((HttpsURLConnection) uRLConnectionIobyxmoadg, timer, lqeggnwhkgVarEablkybsjg).getContent();
            }
            return uRLConnectionIobyxmoadg instanceof HttpURLConnection ? new iobyxmoadg((HttpURLConnection) uRLConnectionIobyxmoadg, timer, lqeggnwhkgVarEablkybsjg).getContent() : uRLConnectionIobyxmoadg.getContent();
        } catch (IOException e13) {
            lqeggnwhkgVarEablkybsjg.esjtqupxsv(jLqeggnwhkg);
            lqeggnwhkgVarEablkybsjg.wwaezpbzkn(timer.eablkybsjg());
            lqeggnwhkgVarEablkybsjg.pkzmftpjix(wflxmlrfwpVar.toString());
            jd.wkgbmnqykc.wkgbmnqykc(lqeggnwhkgVarEablkybsjg);
            throw e13;
        }
    }

    @Keep
    public static InputStream openStream(URL url) throws IOException {
        return ppxfxbqfkf(new wflxmlrfwp(url), gtknphoqwx.gtknphoqwx(), new Timer());
    }

    static InputStream ppxfxbqfkf(wflxmlrfwp wflxmlrfwpVar, gtknphoqwx gtknphoqwxVar, Timer timer) throws IOException {
        if (!gtknphoqwx.gtknphoqwx().yggfygwlhe()) {
            return wflxmlrfwpVar.iobyxmoadg().getInputStream();
        }
        timer.dxjokdxxww();
        long jLqeggnwhkg = timer.lqeggnwhkg();
        lqeggnwhkg lqeggnwhkgVarEablkybsjg = lqeggnwhkg.eablkybsjg(gtknphoqwxVar);
        try {
            URLConnection uRLConnectionIobyxmoadg = wflxmlrfwpVar.iobyxmoadg();
            if (uRLConnectionIobyxmoadg instanceof HttpsURLConnection) {
                return new zoijcleaow((HttpsURLConnection) uRLConnectionIobyxmoadg, timer, lqeggnwhkgVarEablkybsjg).getInputStream();
            }
            return uRLConnectionIobyxmoadg instanceof HttpURLConnection ? new iobyxmoadg((HttpURLConnection) uRLConnectionIobyxmoadg, timer, lqeggnwhkgVarEablkybsjg).getInputStream() : uRLConnectionIobyxmoadg.getInputStream();
        } catch (IOException e13) {
            lqeggnwhkgVarEablkybsjg.esjtqupxsv(jLqeggnwhkg);
            lqeggnwhkgVarEablkybsjg.wwaezpbzkn(timer.eablkybsjg());
            lqeggnwhkgVarEablkybsjg.pkzmftpjix(wflxmlrfwpVar.toString());
            jd.wkgbmnqykc.wkgbmnqykc(lqeggnwhkgVarEablkybsjg);
            throw e13;
        }
    }

    static Object zoijcleaow(wflxmlrfwp wflxmlrfwpVar, Class[] clsArr, gtknphoqwx gtknphoqwxVar, Timer timer) throws IOException {
        timer.dxjokdxxww();
        long jLqeggnwhkg = timer.lqeggnwhkg();
        lqeggnwhkg lqeggnwhkgVarEablkybsjg = lqeggnwhkg.eablkybsjg(gtknphoqwxVar);
        try {
            URLConnection uRLConnectionIobyxmoadg = wflxmlrfwpVar.iobyxmoadg();
            if (uRLConnectionIobyxmoadg instanceof HttpsURLConnection) {
                return new zoijcleaow((HttpsURLConnection) uRLConnectionIobyxmoadg, timer, lqeggnwhkgVarEablkybsjg).getContent(clsArr);
            }
            return uRLConnectionIobyxmoadg instanceof HttpURLConnection ? new iobyxmoadg((HttpURLConnection) uRLConnectionIobyxmoadg, timer, lqeggnwhkgVarEablkybsjg).getContent(clsArr) : uRLConnectionIobyxmoadg.getContent(clsArr);
        } catch (IOException e13) {
            lqeggnwhkgVarEablkybsjg.esjtqupxsv(jLqeggnwhkg);
            lqeggnwhkgVarEablkybsjg.wwaezpbzkn(timer.eablkybsjg());
            lqeggnwhkgVarEablkybsjg.pkzmftpjix(wflxmlrfwpVar.toString());
            jd.wkgbmnqykc.wkgbmnqykc(lqeggnwhkgVarEablkybsjg);
            throw e13;
        }
    }

    @Keep
    public static Object getContent(URL url, Class[] clsArr) throws IOException {
        return zoijcleaow(new wflxmlrfwp(url), clsArr, gtknphoqwx.gtknphoqwx(), new Timer());
    }
}
