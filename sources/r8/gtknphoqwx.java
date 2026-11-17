package r8;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class gtknphoqwx implements dxjokdxxww {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final Map f82043ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private volatile Map f82044wkgbmnqykc;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private static final Map f82045eablkybsjg;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private static final String f82046wkgbmnqykc;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private boolean f82047iobyxmoadg = true;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private Map f82049zoijcleaow = f82045eablkybsjg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private boolean f82048ppxfxbqfkf = true;

        static {
            String strZoijcleaow = zoijcleaow();
            f82046wkgbmnqykc = strZoijcleaow;
            HashMap map = new HashMap(2);
            if (!TextUtils.isEmpty(strZoijcleaow)) {
                map.put("User-Agent", Collections.singletonList(new zoijcleaow(strZoijcleaow)));
            }
            f82045eablkybsjg = Collections.unmodifiableMap(map);
        }

        static String zoijcleaow() {
            String property = System.getProperty("http.agent");
            if (TextUtils.isEmpty(property)) {
                return property;
            }
            int length = property.length();
            StringBuilder sb3 = new StringBuilder(property.length());
            for (int i13 = 0; i13 < length; i13++) {
                char cCharAt = property.charAt(i13);
                if ((cCharAt > 31 || cCharAt == '\t') && cCharAt < 127) {
                    sb3.append(cCharAt);
                } else {
                    sb3.append('?');
                }
            }
            return sb3.toString();
        }

        public gtknphoqwx iobyxmoadg() {
            this.f82047iobyxmoadg = true;
            return new gtknphoqwx(this.f82049zoijcleaow);
        }
    }

    static final class zoijcleaow implements btonecajqb {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f82050iobyxmoadg;

        zoijcleaow(String str) {
            this.f82050iobyxmoadg = str;
        }

        public boolean equals(Object obj) {
            if (obj instanceof zoijcleaow) {
                return this.f82050iobyxmoadg.equals(((zoijcleaow) obj).f82050iobyxmoadg);
            }
            return false;
        }

        public int hashCode() {
            return this.f82050iobyxmoadg.hashCode();
        }

        @Override // r8.btonecajqb
        public String iobyxmoadg() {
            return this.f82050iobyxmoadg;
        }

        public String toString() {
            return "StringHeaderFactory{value='" + this.f82050iobyxmoadg + "'}";
        }
    }

    gtknphoqwx(Map map) {
        this.f82043ppxfxbqfkf = Collections.unmodifiableMap(map);
    }

    private Map ppxfxbqfkf() {
        HashMap map = new HashMap();
        for (Map.Entry entry : this.f82043ppxfxbqfkf.entrySet()) {
            String strZoijcleaow = zoijcleaow((List) entry.getValue());
            if (!TextUtils.isEmpty(strZoijcleaow)) {
                map.put((String) entry.getKey(), strZoijcleaow);
            }
        }
        return map;
    }

    private String zoijcleaow(List list) {
        StringBuilder sb3 = new StringBuilder();
        int size = list.size();
        for (int i13 = 0; i13 < size; i13++) {
            String strIobyxmoadg = ((btonecajqb) list.get(i13)).iobyxmoadg();
            if (!TextUtils.isEmpty(strIobyxmoadg)) {
                sb3.append(strIobyxmoadg);
                if (i13 != list.size() - 1) {
                    sb3.append(',');
                }
            }
        }
        return sb3.toString();
    }

    public boolean equals(Object obj) {
        if (obj instanceof gtknphoqwx) {
            return this.f82043ppxfxbqfkf.equals(((gtknphoqwx) obj).f82043ppxfxbqfkf);
        }
        return false;
    }

    public int hashCode() {
        return this.f82043ppxfxbqfkf.hashCode();
    }

    @Override // r8.dxjokdxxww
    public Map iobyxmoadg() {
        if (this.f82044wkgbmnqykc == null) {
            synchronized (this) {
                try {
                    if (this.f82044wkgbmnqykc == null) {
                        this.f82044wkgbmnqykc = Collections.unmodifiableMap(ppxfxbqfkf());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f82044wkgbmnqykc;
    }

    public String toString() {
        return "LazyHeaders{headers=" + this.f82043ppxfxbqfkf + '}';
    }
}
