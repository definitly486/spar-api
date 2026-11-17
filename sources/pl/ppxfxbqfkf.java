package pl;

import java.security.Key;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import org.jose4j.lang.JoseException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ppxfxbqfkf {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private static final gl.iobyxmoadg f76887btonecajqb = new gl.iobyxmoadg();

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    protected String f76890gxszxtbevo;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private byte[] f76894ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private Key f76895wkgbmnqykc;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    protected el.zoijcleaow f76891iobyxmoadg = new el.zoijcleaow();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    protected zoijcleaow f76896zoijcleaow = new zoijcleaow();

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    protected boolean f76889eablkybsjg = true;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private kl.ppxfxbqfkf f76892lqeggnwhkg = kl.ppxfxbqfkf.f59733ppxfxbqfkf;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private Set f76893nufgyqmvbu = Collections.emptySet();

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private gl.iobyxmoadg f76888dxjokdxxww = f76887btonecajqb;

    public void agtfadlqog(kl.ppxfxbqfkf ppxfxbqfkfVar) {
        this.f76892lqeggnwhkg = ppxfxbqfkfVar;
    }

    protected gl.iobyxmoadg btonecajqb() {
        return this.f76888dxjokdxxww;
    }

    protected boolean draadjrbmk(String str) {
        return false;
    }

    public Key dxjokdxxww() {
        return this.f76895wkgbmnqykc;
    }

    protected String eablkybsjg() {
        return this.f76896zoijcleaow.iobyxmoadg();
    }

    public boolean gtknphoqwx() {
        return this.f76889eablkybsjg;
    }

    public String gxszxtbevo(String str) {
        return this.f76896zoijcleaow.gxszxtbevo(str);
    }

    protected void iobyxmoadg() throws JoseException {
        List<String> listAsList;
        Object objWkgbmnqykc = this.f76896zoijcleaow.wkgbmnqykc("crit");
        if (objWkgbmnqykc != null) {
            if (objWkgbmnqykc instanceof List) {
                listAsList = (List) objWkgbmnqykc;
            } else {
                if (!(objWkgbmnqykc instanceof String[])) {
                    throw new JoseException("crit header value not an array (" + objWkgbmnqykc.getClass() + ").");
                }
                listAsList = Arrays.asList((String[]) objWkgbmnqykc);
            }
            for (String str : listAsList) {
                if (!this.f76893nufgyqmvbu.contains(str) && !draadjrbmk(str)) {
                    throw new JoseException("Unrecognized header '" + str + "' marked as critical.");
                }
            }
        }
    }

    public void kcexrzcfyt(String str, String str2) {
        this.f76896zoijcleaow.btonecajqb(str, str2);
    }

    public zoijcleaow lqeggnwhkg() {
        return this.f76896zoijcleaow;
    }

    protected byte[] nufgyqmvbu() {
        return this.f76894ppxfxbqfkf;
    }

    public void ojitshcjhn(String str) {
        kcexrzcfyt("alg", str);
    }

    protected void oxmwwwfdhm(String str) throws JoseException {
        zoijcleaow(str, "Encoded Header");
        this.f76896zoijcleaow.lqeggnwhkg(str);
    }

    protected kl.ppxfxbqfkf ppxfxbqfkf() {
        return this.f76892lqeggnwhkg;
    }

    public void rgvfuqvkyq(String str) {
        vdvldrhtss(iobyxmoadg.iobyxmoadg(str));
        this.f76890gxszxtbevo = str;
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(getClass().getSimpleName());
        sb3.append(lqeggnwhkg().zoijcleaow());
        if (this.f76890gxszxtbevo != null) {
            sb3.append("->");
            sb3.append(this.f76890gxszxtbevo);
        }
        return sb3.toString();
    }

    protected abstract void vdvldrhtss(String[] strArr);

    protected void wflxmlrfwp() {
    }

    public String wkgbmnqykc() {
        return gxszxtbevo("alg");
    }

    public void yggfygwlhe(Key key) {
        Key key2 = this.f76895wkgbmnqykc;
        if (key != null ? key2 == null || !key.equals(key2) : key2 != null) {
            wflxmlrfwp();
        }
        this.f76895wkgbmnqykc = key;
    }

    protected void zdlpuopuiu(byte[] bArr) {
        this.f76894ppxfxbqfkf = bArr;
    }

    protected void zoijcleaow(String str, String str2) throws JoseException {
        if (str == null || str.length() == 0) {
            throw new JoseException("The " + str2 + " cannot be empty.");
        }
    }
}
