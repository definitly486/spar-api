package cc;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
class wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Map f19624iobyxmoadg = new HashMap();

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final int f19625ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f19626zoijcleaow;

    public wkgbmnqykc(int i13, int i14) {
        this.f19626zoijcleaow = i13;
        this.f19625ppxfxbqfkf = i14;
    }

    public static String ppxfxbqfkf(String str, int i13) {
        if (str == null) {
            return str;
        }
        String strTrim = str.trim();
        return strTrim.length() > i13 ? strTrim.substring(0, i13) : strTrim;
    }

    private String zoijcleaow(String str) {
        if (str != null) {
            return ppxfxbqfkf(str, this.f19625ppxfxbqfkf);
        }
        throw new IllegalArgumentException("Custom attribute key must not be null.");
    }

    public synchronized void eablkybsjg(Map map) {
        try {
            int i13 = 0;
            for (Map.Entry entry : map.entrySet()) {
                String strZoijcleaow = zoijcleaow((String) entry.getKey());
                if (this.f19624iobyxmoadg.size() < this.f19626zoijcleaow || this.f19624iobyxmoadg.containsKey(strZoijcleaow)) {
                    String str = (String) entry.getValue();
                    this.f19624iobyxmoadg.put(strZoijcleaow, str == null ? "" : ppxfxbqfkf(str, this.f19625ppxfxbqfkf));
                } else {
                    i13++;
                }
            }
            if (i13 > 0) {
                xb.lqeggnwhkg.gxszxtbevo().gtknphoqwx("Ignored " + i13 + " entries when adding custom keys. Maximum allowable: " + this.f19626zoijcleaow);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized Map iobyxmoadg() {
        return Collections.unmodifiableMap(new HashMap(this.f19624iobyxmoadg));
    }

    public synchronized boolean wkgbmnqykc(String str, String str2) {
        String strZoijcleaow = zoijcleaow(str);
        if (this.f19624iobyxmoadg.size() >= this.f19626zoijcleaow && !this.f19624iobyxmoadg.containsKey(strZoijcleaow)) {
            xb.lqeggnwhkg.gxszxtbevo().gtknphoqwx("Ignored entry \"" + str + "\" when adding custom keys. Maximum allowable: " + this.f19626zoijcleaow);
            return false;
        }
        String strPpxfxbqfkf = ppxfxbqfkf(str2, this.f19625ppxfxbqfkf);
        if (ac.btonecajqb.esjtqupxsv((String) this.f19624iobyxmoadg.get(strZoijcleaow), strPpxfxbqfkf)) {
            return false;
        }
        Map map = this.f19624iobyxmoadg;
        if (str2 == null) {
            strPpxfxbqfkf = "";
        }
        map.put(strZoijcleaow, strPpxfxbqfkf);
        return true;
    }
}
