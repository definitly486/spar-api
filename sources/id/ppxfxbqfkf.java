package id;

import android.content.Context;
import java.net.URI;
import md.draadjrbmk;
import modern.payments.ecomAndroid.util.interceptor.impl.HostSelectionInterceptorImpl;
import nd.nufgyqmvbu;

/* JADX INFO: loaded from: classes2.dex */
final class ppxfxbqfkf extends eablkybsjg {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final gd.iobyxmoadg f42408ppxfxbqfkf = gd.iobyxmoadg.eablkybsjg();

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final nufgyqmvbu f42409iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Context f42410zoijcleaow;

    ppxfxbqfkf(nufgyqmvbu nufgyqmvbuVar, Context context) {
        this.f42410zoijcleaow = context;
        this.f42409iobyxmoadg = nufgyqmvbuVar;
    }

    private boolean agtfadlqog(long j13) {
        return j13 >= 0;
    }

    private boolean btonecajqb(String str) {
        return dxjokdxxww(str);
    }

    private boolean dxjokdxxww(String str) {
        if (str == null) {
            return true;
        }
        return str.trim().isEmpty();
    }

    private boolean gtknphoqwx(String str) {
        return (str == null || dxjokdxxww(str) || str.length() > 255) ? false : true;
    }

    private URI lqeggnwhkg(String str) {
        if (str == null) {
            return null;
        }
        try {
            return URI.create(str);
        } catch (IllegalArgumentException | IllegalStateException e13) {
            f42408ppxfxbqfkf.gtknphoqwx("getResultUrl throws exception %s", e13.getMessage());
            return null;
        }
    }

    private boolean nufgyqmvbu(URI uri, Context context) {
        if (uri == null) {
            return false;
        }
        return draadjrbmk.iobyxmoadg(uri, context);
    }

    private boolean ojitshcjhn(int i13) {
        return i13 == -1 || i13 > 0;
    }

    private boolean oxmwwwfdhm(String str) {
        return str == null;
    }

    private boolean rgvfuqvkyq(String str) {
        if (str == null) {
            return false;
        }
        return HostSelectionInterceptorImpl.PROTOCOL_HTTP.equalsIgnoreCase(str) || HostSelectionInterceptorImpl.PROTOCOL_HTTPS.equalsIgnoreCase(str);
    }

    private boolean vdvldrhtss(long j13) {
        return j13 >= 0;
    }

    private boolean wflxmlrfwp(int i13) {
        return i13 > 0;
    }

    boolean draadjrbmk(nufgyqmvbu.wkgbmnqykc wkgbmnqykcVar) {
        return (wkgbmnqykcVar == null || wkgbmnqykcVar == nufgyqmvbu.wkgbmnqykc.HTTP_METHOD_UNKNOWN) ? false : true;
    }

    @Override // id.eablkybsjg
    public boolean ppxfxbqfkf() {
        if (btonecajqb(this.f42409iobyxmoadg.ylkuphrtab())) {
            f42408ppxfxbqfkf.btonecajqb("URL is missing:" + this.f42409iobyxmoadg.ylkuphrtab());
            return false;
        }
        URI uriLqeggnwhkg = lqeggnwhkg(this.f42409iobyxmoadg.ylkuphrtab());
        if (uriLqeggnwhkg == null) {
            f42408ppxfxbqfkf.btonecajqb("URL cannot be parsed");
            return false;
        }
        if (!nufgyqmvbu(uriLqeggnwhkg, this.f42410zoijcleaow)) {
            f42408ppxfxbqfkf.btonecajqb("URL fails allowlist rule: " + uriLqeggnwhkg);
            return false;
        }
        if (!gtknphoqwx(uriLqeggnwhkg.getHost())) {
            f42408ppxfxbqfkf.btonecajqb("URL host is null or invalid");
            return false;
        }
        if (!rgvfuqvkyq(uriLqeggnwhkg.getScheme())) {
            f42408ppxfxbqfkf.btonecajqb("URL scheme is null or invalid");
            return false;
        }
        if (!oxmwwwfdhm(uriLqeggnwhkg.getUserInfo())) {
            f42408ppxfxbqfkf.btonecajqb("URL user info is null");
            return false;
        }
        if (!ojitshcjhn(uriLqeggnwhkg.getPort())) {
            f42408ppxfxbqfkf.btonecajqb("URL port is less than or equal to 0");
            return false;
        }
        if (!draadjrbmk(this.f42409iobyxmoadg.hcddaimhww() ? this.f42409iobyxmoadg.lereixgezr() : null)) {
            f42408ppxfxbqfkf.btonecajqb("HTTP Method is null or invalid: " + this.f42409iobyxmoadg.lereixgezr());
            return false;
        }
        if (this.f42409iobyxmoadg.jpowsppfya() && !wflxmlrfwp(this.f42409iobyxmoadg.pmvmpeiblj())) {
            f42408ppxfxbqfkf.btonecajqb("HTTP ResponseCode is a negative value:" + this.f42409iobyxmoadg.pmvmpeiblj());
            return false;
        }
        if (this.f42409iobyxmoadg.hkdspvbjdz() && !agtfadlqog(this.f42409iobyxmoadg.istkbnxepw())) {
            f42408ppxfxbqfkf.btonecajqb("Request Payload is a negative value:" + this.f42409iobyxmoadg.istkbnxepw());
            return false;
        }
        if (this.f42409iobyxmoadg.cllcsxoeiz() && !agtfadlqog(this.f42409iobyxmoadg.yadqdtsiqt())) {
            f42408ppxfxbqfkf.btonecajqb("Response Payload is a negative value:" + this.f42409iobyxmoadg.yadqdtsiqt());
            return false;
        }
        if (!this.f42409iobyxmoadg.pkzmftpjix() || this.f42409iobyxmoadg.cqumvgiudr() <= 0) {
            f42408ppxfxbqfkf.btonecajqb("Start time of the request is null, or zero, or a negative value:" + this.f42409iobyxmoadg.cqumvgiudr());
            return false;
        }
        if (this.f42409iobyxmoadg.dsvhmnatus() && !vdvldrhtss(this.f42409iobyxmoadg.iozdgvuglv())) {
            f42408ppxfxbqfkf.btonecajqb("Time to complete the request is a negative value:" + this.f42409iobyxmoadg.iozdgvuglv());
            return false;
        }
        if (this.f42409iobyxmoadg.stevsuqkhv() && !vdvldrhtss(this.f42409iobyxmoadg.wwaezpbzkn())) {
            f42408ppxfxbqfkf.btonecajqb("Time from the start of the request to the start of the response is null or a negative value:" + this.f42409iobyxmoadg.wwaezpbzkn());
            return false;
        }
        if (this.f42409iobyxmoadg.wypolnanlu() && this.f42409iobyxmoadg.lmojexxdyd() > 0) {
            if (this.f42409iobyxmoadg.jpowsppfya()) {
                return true;
            }
            f42408ppxfxbqfkf.btonecajqb("Did not receive a HTTP Response Code");
            return false;
        }
        f42408ppxfxbqfkf.btonecajqb("Time from the start of the request to the end of the response is null, negative or zero:" + this.f42409iobyxmoadg.lmojexxdyd());
        return false;
    }
}
