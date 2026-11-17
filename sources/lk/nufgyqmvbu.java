package lk;

import java.nio.charset.Charset;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class nufgyqmvbu {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f63175iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Map f63176zoijcleaow;

    public nufgyqmvbu(String scheme, Map authParams) {
        String lowerCase;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(scheme, "scheme");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(authParams, "authParams");
        this.f63175iobyxmoadg = scheme;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : authParams.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            if (str != null) {
                Locale US = Locale.US;
                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(US, "US");
                lowerCase = str.toLowerCase(US);
                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            } else {
                lowerCase = null;
            }
            linkedHashMap.put(lowerCase, str2);
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(mapUnmodifiableMap, "unmodifiableMap<String?, String>(newAuthParams)");
        this.f63176zoijcleaow = mapUnmodifiableMap;
    }

    public boolean equals(Object obj) {
        return mk.wkgbmnqykc.iobyxmoadg(this, obj);
    }

    public int hashCode() {
        return mk.wkgbmnqykc.zoijcleaow(this);
    }

    public final Map iobyxmoadg() {
        return this.f63176zoijcleaow;
    }

    public final String ppxfxbqfkf() {
        return (String) this.f63176zoijcleaow.get("realm");
    }

    public String toString() {
        return mk.wkgbmnqykc.ppxfxbqfkf(this);
    }

    public final String wkgbmnqykc() {
        return this.f63175iobyxmoadg;
    }

    public final Charset zoijcleaow() {
        String str = (String) this.f63176zoijcleaow.get("charset");
        if (str != null) {
            try {
                Charset charsetForName = Charset.forName(str);
                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(charsetForName, "forName(charset)");
                return charsetForName;
            } catch (Exception unused) {
            }
        }
        return mj.wkgbmnqykc.f67322lqeggnwhkg;
    }
}
