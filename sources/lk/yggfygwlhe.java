package lk;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import kotlin.jvm.internal.tzroggbefp;

/* JADX INFO: loaded from: classes3.dex */
public final class yggfygwlhe implements Iterable, ug.iobyxmoadg {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public static final zoijcleaow f63244yggfygwlhe = new zoijcleaow(null);

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String[] f63245zdlpuopuiu;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final List f63246iobyxmoadg = new ArrayList(20);

        public final iobyxmoadg dxjokdxxww(String name, String value) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(name, "name");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(value, "value");
            return mk.eablkybsjg.agtfadlqog(this, name, value);
        }

        public final iobyxmoadg eablkybsjg(String name, String value) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(name, "name");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(value, "value");
            mk.eablkybsjg.oxmwwwfdhm(name);
            wkgbmnqykc(name, value);
            return this;
        }

        public final yggfygwlhe gxszxtbevo() {
            return mk.eablkybsjg.eablkybsjg(this);
        }

        public final iobyxmoadg iobyxmoadg(String name, String value) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(name, "name");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(value, "value");
            return mk.eablkybsjg.zoijcleaow(this, name, value);
        }

        public final List lqeggnwhkg() {
            return this.f63246iobyxmoadg;
        }

        public final iobyxmoadg nufgyqmvbu(String name) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(name, "name");
            return mk.eablkybsjg.wflxmlrfwp(this, name);
        }

        public final iobyxmoadg ppxfxbqfkf(String line) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(line, "line");
            int iYfnezrywwk = mj.kcexrzcfyt.yfnezrywwk(line, ':', 1, false, 4, null);
            if (iYfnezrywwk != -1) {
                String strSubstring = line.substring(0, iYfnezrywwk);
                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                String strSubstring2 = line.substring(iYfnezrywwk + 1);
                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(strSubstring2, "this as java.lang.String).substring(startIndex)");
                wkgbmnqykc(strSubstring, strSubstring2);
            } else if (line.charAt(0) == ':') {
                String strSubstring3 = line.substring(1);
                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(strSubstring3, "this as java.lang.String).substring(startIndex)");
                wkgbmnqykc("", strSubstring3);
            } else {
                wkgbmnqykc("", line);
            }
            return this;
        }

        public final iobyxmoadg wkgbmnqykc(String name, String value) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(name, "name");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(value, "value");
            return mk.eablkybsjg.wkgbmnqykc(this, name, value);
        }

        public final iobyxmoadg zoijcleaow(yggfygwlhe headers) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(headers, "headers");
            return mk.eablkybsjg.ppxfxbqfkf(this, headers);
        }
    }

    public static final class zoijcleaow {
        public /* synthetic */ zoijcleaow(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final yggfygwlhe iobyxmoadg(String... namesAndValues) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(namesAndValues, "namesAndValues");
            return mk.eablkybsjg.dxjokdxxww((String[]) Arrays.copyOf(namesAndValues, namesAndValues.length));
        }

        private zoijcleaow() {
        }
    }

    public yggfygwlhe(String[] namesAndValues) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(namesAndValues, "namesAndValues");
        this.f63245zdlpuopuiu = namesAndValues;
    }

    public static final yggfygwlhe gxszxtbevo(String... strArr) {
        return f63244yggfygwlhe.iobyxmoadg(strArr);
    }

    public final String btonecajqb(int i13) {
        return mk.eablkybsjg.rgvfuqvkyq(this, i13);
    }

    public final Map dxjokdxxww() {
        TreeMap treeMap = new TreeMap(mj.kcexrzcfyt.yadqdtsiqt(tzroggbefp.f60034iobyxmoadg));
        int size = size();
        for (int i13 = 0; i13 < size; i13++) {
            String strWkgbmnqykc = wkgbmnqykc(i13);
            Locale US = Locale.US;
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(US, "US");
            String lowerCase = strWkgbmnqykc.toLowerCase(US);
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            List arrayList = (List) treeMap.get(lowerCase);
            if (arrayList == null) {
                arrayList = new ArrayList(2);
                treeMap.put(lowerCase, arrayList);
            }
            arrayList.add(btonecajqb(i13));
        }
        return treeMap;
    }

    public final iobyxmoadg eablkybsjg() {
        return mk.eablkybsjg.draadjrbmk(this);
    }

    public boolean equals(Object obj) {
        return mk.eablkybsjg.gxszxtbevo(this, obj);
    }

    public final List gtknphoqwx(String name) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(name, "name");
        return mk.eablkybsjg.vdvldrhtss(this, name);
    }

    public int hashCode() {
        return mk.eablkybsjg.lqeggnwhkg(this);
    }

    public final String iobyxmoadg(String name) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(name, "name");
        return mk.eablkybsjg.nufgyqmvbu(this.f63245zdlpuopuiu, name);
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return mk.eablkybsjg.btonecajqb(this);
    }

    public final String[] ppxfxbqfkf() {
        return this.f63245zdlpuopuiu;
    }

    public final int size() {
        return this.f63245zdlpuopuiu.length / 2;
    }

    public String toString() {
        return mk.eablkybsjg.ojitshcjhn(this);
    }

    public final String wkgbmnqykc(int i13) {
        return mk.eablkybsjg.gtknphoqwx(this, i13);
    }

    public final Date zoijcleaow(String name) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(name, "name");
        String strIobyxmoadg = iobyxmoadg(name);
        if (strIobyxmoadg != null) {
            return rk.ppxfxbqfkf.iobyxmoadg(strIobyxmoadg);
        }
        return null;
    }
}
