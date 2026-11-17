package pl;

import java.util.LinkedHashMap;
import java.util.Map;
import nl.gtknphoqwx;
import org.jose4j.lang.JoseException;

/* JADX INFO: loaded from: classes3.dex */
public class zoijcleaow {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private String f76898ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private String f76899wkgbmnqykc;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    protected el.zoijcleaow f76897iobyxmoadg = new el.zoijcleaow();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private Map f76900zoijcleaow = new LinkedHashMap();

    public void btonecajqb(String str, String str2) {
        dxjokdxxww(str, str2);
    }

    public void dxjokdxxww(String str, Object obj) {
        this.f76900zoijcleaow.put(str, obj);
        this.f76898ppxfxbqfkf = null;
        this.f76899wkgbmnqykc = null;
    }

    public gtknphoqwx eablkybsjg(String str, String str2) throws JoseException {
        Map map = (Map) wkgbmnqykc(str);
        if (map == null) {
            return null;
        }
        gtknphoqwx gtknphoqwxVarWkgbmnqykc = gtknphoqwx.iobyxmoadg.wkgbmnqykc(map, str2);
        if (gtknphoqwxVarWkgbmnqykc.istkbnxepw() == null) {
            return gtknphoqwxVarWkgbmnqykc;
        }
        throw new JoseException(str + " header contains a private key, which it most definitely should not.");
    }

    public String gxszxtbevo(String str) {
        return rl.wkgbmnqykc.zoijcleaow(this.f76900zoijcleaow, str);
    }

    public String iobyxmoadg() {
        if (this.f76899wkgbmnqykc == null) {
            this.f76899wkgbmnqykc = this.f76897iobyxmoadg.gxszxtbevo(zoijcleaow());
        }
        return this.f76899wkgbmnqykc;
    }

    void lqeggnwhkg(String str) {
        this.f76899wkgbmnqykc = str;
        String strPpxfxbqfkf = this.f76897iobyxmoadg.ppxfxbqfkf(str);
        this.f76898ppxfxbqfkf = strPpxfxbqfkf;
        this.f76900zoijcleaow = hl.iobyxmoadg.iobyxmoadg(strPpxfxbqfkf);
    }

    public void nufgyqmvbu(String str, nl.ppxfxbqfkf ppxfxbqfkfVar) {
        dxjokdxxww(str, ppxfxbqfkfVar.yggfygwlhe(nl.ppxfxbqfkf.zoijcleaow.PUBLIC_ONLY));
    }

    public Long ppxfxbqfkf(String str) {
        return rl.wkgbmnqykc.iobyxmoadg(this.f76900zoijcleaow, str);
    }

    public Object wkgbmnqykc(String str) {
        return this.f76900zoijcleaow.get(str);
    }

    public String zoijcleaow() {
        if (this.f76898ppxfxbqfkf == null) {
            this.f76898ppxfxbqfkf = hl.iobyxmoadg.zoijcleaow(this.f76900zoijcleaow);
        }
        return this.f76898ppxfxbqfkf;
    }
}
