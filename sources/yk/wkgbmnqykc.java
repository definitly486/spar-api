package yk;

import bl.pkzmftpjix;
import hg.jyumaefscl;
import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;
import mk.gxszxtbevo;
import mk.lqeggnwhkg;

/* JADX INFO: loaded from: classes3.dex */
public final class wkgbmnqykc implements HostnameVerifier {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final wkgbmnqykc f125538iobyxmoadg = new wkgbmnqykc();

    private wkgbmnqykc() {
    }

    private final boolean gxszxtbevo(String str, String str2) {
        if (str != null && str.length() != 0 && !kcexrzcfyt.stevsuqkhv(str, ".", false, 2, null) && !kcexrzcfyt.zynmafqrjb(str, "..", false, 2, null) && str2 != null && str2.length() != 0 && !kcexrzcfyt.stevsuqkhv(str2, ".", false, 2, null) && !kcexrzcfyt.zynmafqrjb(str2, "..", false, 2, null)) {
            if (!kcexrzcfyt.zynmafqrjb(str, ".", false, 2, null)) {
                str = str + '.';
            }
            String str3 = str;
            if (!kcexrzcfyt.zynmafqrjb(str2, ".", false, 2, null)) {
                str2 = str2 + '.';
            }
            String strZoijcleaow = zoijcleaow(str2);
            if (!kcexrzcfyt.sopmlzcsov(strZoijcleaow, "*", false, 2, null)) {
                return zdlpuopuiu.eablkybsjg(str3, strZoijcleaow);
            }
            if (!kcexrzcfyt.stevsuqkhv(strZoijcleaow, "*.", false, 2, null) || kcexrzcfyt.yfnezrywwk(strZoijcleaow, '*', 1, false, 4, null) != -1 || str3.length() < strZoijcleaow.length() || zdlpuopuiu.eablkybsjg("*.", strZoijcleaow)) {
                return false;
            }
            String strSubstring = strZoijcleaow.substring(1);
            zdlpuopuiu.dxjokdxxww(strSubstring, "this as java.lang.String).substring(startIndex)");
            if (!kcexrzcfyt.zynmafqrjb(str3, strSubstring, false, 2, null)) {
                return false;
            }
            int length = str3.length() - strSubstring.length();
            return length <= 0 || kcexrzcfyt.opjhrmiecq(str3, '.', length + (-1), false, 4, null) == -1;
        }
        return false;
    }

    private final boolean lqeggnwhkg(String str, X509Certificate x509Certificate) {
        String strZoijcleaow = zoijcleaow(str);
        List listPpxfxbqfkf = ppxfxbqfkf(x509Certificate, 2);
        if (listPpxfxbqfkf != null && listPpxfxbqfkf.isEmpty()) {
            return false;
        }
        Iterator it = listPpxfxbqfkf.iterator();
        while (it.hasNext()) {
            if (f125538iobyxmoadg.gxszxtbevo(strZoijcleaow, (String) it.next())) {
                return true;
            }
        }
        return false;
    }

    private final boolean nufgyqmvbu(String str, X509Certificate x509Certificate) {
        String strIobyxmoadg = lqeggnwhkg.iobyxmoadg(str);
        List listPpxfxbqfkf = ppxfxbqfkf(x509Certificate, 7);
        if (listPpxfxbqfkf != null && listPpxfxbqfkf.isEmpty()) {
            return false;
        }
        Iterator it = listPpxfxbqfkf.iterator();
        while (it.hasNext()) {
            if (zdlpuopuiu.eablkybsjg(strIobyxmoadg, lqeggnwhkg.iobyxmoadg((String) it.next()))) {
                return true;
            }
        }
        return false;
    }

    private final List ppxfxbqfkf(X509Certificate x509Certificate, int i13) {
        Object obj;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return jyumaefscl.wflxmlrfwp();
            }
            ArrayList arrayList = new ArrayList();
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && zdlpuopuiu.eablkybsjg(list.get(0), Integer.valueOf(i13)) && (obj = list.get(1)) != null) {
                    arrayList.add((String) obj);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return jyumaefscl.wflxmlrfwp();
        }
    }

    private final boolean wkgbmnqykc(String str) {
        return str.length() == ((int) pkzmftpjix.zoijcleaow(str, 0, 0, 3, null));
    }

    private final String zoijcleaow(String str) {
        if (!wkgbmnqykc(str)) {
            return str;
        }
        Locale US = Locale.US;
        zdlpuopuiu.dxjokdxxww(US, "US");
        String lowerCase = str.toLowerCase(US);
        zdlpuopuiu.dxjokdxxww(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }

    public final boolean eablkybsjg(String host, X509Certificate certificate) {
        zdlpuopuiu.btonecajqb(host, "host");
        zdlpuopuiu.btonecajqb(certificate, "certificate");
        return gxszxtbevo.iobyxmoadg(host) ? nufgyqmvbu(host, certificate) : lqeggnwhkg(host, certificate);
    }

    public final List iobyxmoadg(X509Certificate certificate) {
        zdlpuopuiu.btonecajqb(certificate, "certificate");
        return jyumaefscl.ixidwrxhsl(ppxfxbqfkf(certificate, 7), ppxfxbqfkf(certificate, 2));
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(String host, SSLSession session) {
        zdlpuopuiu.btonecajqb(host, "host");
        zdlpuopuiu.btonecajqb(session, "session");
        if (!wkgbmnqykc(host)) {
            return false;
        }
        try {
            Certificate certificate = session.getPeerCertificates()[0];
            zdlpuopuiu.nufgyqmvbu(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            return eablkybsjg(host, (X509Certificate) certificate);
        } catch (SSLException unused) {
            return false;
        }
    }
}
