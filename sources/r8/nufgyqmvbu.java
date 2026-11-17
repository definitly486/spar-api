package r8;

import android.net.Uri;
import android.text.TextUtils;
import java.net.URL;
import java.security.MessageDigest;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class nufgyqmvbu implements l8.eablkybsjg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private String f82080eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private URL f82081gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private volatile byte[] f82082lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private int f82083nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final URL f82084ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final String f82085wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final dxjokdxxww f82086zoijcleaow;

    public nufgyqmvbu(URL url) {
        this(url, dxjokdxxww.f82034zoijcleaow);
    }

    private String gxszxtbevo() {
        if (TextUtils.isEmpty(this.f82080eablkybsjg)) {
            String string = this.f82085wkgbmnqykc;
            if (TextUtils.isEmpty(string)) {
                string = ((URL) g9.gtknphoqwx.eablkybsjg(this.f82084ppxfxbqfkf)).toString();
            }
            this.f82080eablkybsjg = Uri.encode(string, "@#&=*+-_.,:!?()/~'%;$");
        }
        return this.f82080eablkybsjg;
    }

    private URL lqeggnwhkg() {
        if (this.f82081gxszxtbevo == null) {
            this.f82081gxszxtbevo = new URL(gxszxtbevo());
        }
        return this.f82081gxszxtbevo;
    }

    private byte[] wkgbmnqykc() {
        if (this.f82082lqeggnwhkg == null) {
            this.f82082lqeggnwhkg = ppxfxbqfkf().getBytes(l8.eablkybsjg.f61829iobyxmoadg);
        }
        return this.f82082lqeggnwhkg;
    }

    public URL dxjokdxxww() {
        return lqeggnwhkg();
    }

    public Map eablkybsjg() {
        return this.f82086zoijcleaow.iobyxmoadg();
    }

    @Override // l8.eablkybsjg
    public boolean equals(Object obj) {
        if (!(obj instanceof nufgyqmvbu)) {
            return false;
        }
        nufgyqmvbu nufgyqmvbuVar = (nufgyqmvbu) obj;
        return ppxfxbqfkf().equals(nufgyqmvbuVar.ppxfxbqfkf()) && this.f82086zoijcleaow.equals(nufgyqmvbuVar.f82086zoijcleaow);
    }

    @Override // l8.eablkybsjg
    public int hashCode() {
        if (this.f82083nufgyqmvbu == 0) {
            int iHashCode = ppxfxbqfkf().hashCode();
            this.f82083nufgyqmvbu = iHashCode;
            this.f82083nufgyqmvbu = (iHashCode * 31) + this.f82086zoijcleaow.hashCode();
        }
        return this.f82083nufgyqmvbu;
    }

    public String nufgyqmvbu() {
        return gxszxtbevo();
    }

    public String ppxfxbqfkf() {
        String str = this.f82085wkgbmnqykc;
        return str != null ? str : ((URL) g9.gtknphoqwx.eablkybsjg(this.f82084ppxfxbqfkf)).toString();
    }

    public String toString() {
        return ppxfxbqfkf();
    }

    @Override // l8.eablkybsjg
    public void zoijcleaow(MessageDigest messageDigest) {
        messageDigest.update(wkgbmnqykc());
    }

    public nufgyqmvbu(String str) {
        this(str, dxjokdxxww.f82034zoijcleaow);
    }

    public nufgyqmvbu(URL url, dxjokdxxww dxjokdxxwwVar) {
        this.f82084ppxfxbqfkf = (URL) g9.gtknphoqwx.eablkybsjg(url);
        this.f82085wkgbmnqykc = null;
        this.f82086zoijcleaow = (dxjokdxxww) g9.gtknphoqwx.eablkybsjg(dxjokdxxwwVar);
    }

    public nufgyqmvbu(String str, dxjokdxxww dxjokdxxwwVar) {
        this.f82084ppxfxbqfkf = null;
        this.f82085wkgbmnqykc = g9.gtknphoqwx.ppxfxbqfkf(str);
        this.f82086zoijcleaow = (dxjokdxxww) g9.gtknphoqwx.eablkybsjg(dxjokdxxwwVar);
    }
}
