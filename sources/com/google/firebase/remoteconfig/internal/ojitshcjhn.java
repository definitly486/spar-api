package com.google.firebase.remoteconfig.internal;

import android.util.Log;
import com.google.android.gms.common.util.BiConsumer;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import org.json.JSONException;

/* JADX INFO: loaded from: classes2.dex */
public class ojitshcjhn {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public static final Charset f24768eablkybsjg = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    static final Pattern f24769gxszxtbevo = Pattern.compile("^(1|true|t|yes|y|on)$", 2);

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    static final Pattern f24770lqeggnwhkg = Pattern.compile("^(0|false|f|no|n|off|)$", 2);

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Set f24771iobyxmoadg = new HashSet();

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final gxszxtbevo f24772ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final gxszxtbevo f24773wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Executor f24774zoijcleaow;

    public ojitshcjhn(Executor executor, gxszxtbevo gxszxtbevoVar, gxszxtbevo gxszxtbevoVar2) {
        this.f24774zoijcleaow = executor;
        this.f24772ppxfxbqfkf = gxszxtbevoVar;
        this.f24773wkgbmnqykc = gxszxtbevoVar2;
    }

    private static lqeggnwhkg eablkybsjg(gxszxtbevo gxszxtbevoVar) {
        return gxszxtbevoVar.gxszxtbevo();
    }

    private static void gtknphoqwx(String str, String str2) {
        Log.w("FirebaseRemoteConfig", String.format("No value of type '%s' exists for parameter key '%s'.", str2, str));
    }

    private static Set gxszxtbevo(gxszxtbevo gxszxtbevoVar) {
        HashSet hashSet = new HashSet();
        lqeggnwhkg lqeggnwhkgVarEablkybsjg = eablkybsjg(gxszxtbevoVar);
        if (lqeggnwhkgVarEablkybsjg == null) {
            return hashSet;
        }
        Iterator<String> itKeys = lqeggnwhkgVarEablkybsjg.lqeggnwhkg().keys();
        while (itKeys.hasNext()) {
            hashSet.add(itKeys.next());
        }
        return hashSet;
    }

    private static String nufgyqmvbu(gxszxtbevo gxszxtbevoVar, String str) {
        lqeggnwhkg lqeggnwhkgVarEablkybsjg = eablkybsjg(gxszxtbevoVar);
        if (lqeggnwhkgVarEablkybsjg == null) {
            return null;
        }
        try {
            return lqeggnwhkgVarEablkybsjg.lqeggnwhkg().getString(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    private void ppxfxbqfkf(final String str, final lqeggnwhkg lqeggnwhkgVar) {
        if (lqeggnwhkgVar == null) {
            return;
        }
        synchronized (this.f24771iobyxmoadg) {
            try {
                for (final BiConsumer biConsumer : this.f24771iobyxmoadg) {
                    this.f24774zoijcleaow.execute(new Runnable() { // from class: com.google.firebase.remoteconfig.internal.agtfadlqog
                        @Override // java.lang.Runnable
                        public final void run() {
                            biConsumer.accept(str, lqeggnwhkgVar);
                        }
                    });
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public pd.draadjrbmk dxjokdxxww(String str) {
        String strNufgyqmvbu = nufgyqmvbu(this.f24772ppxfxbqfkf, str);
        if (strNufgyqmvbu != null) {
            ppxfxbqfkf(str, eablkybsjg(this.f24772ppxfxbqfkf));
            return new iwizpuwonk(strNufgyqmvbu, 2);
        }
        String strNufgyqmvbu2 = nufgyqmvbu(this.f24773wkgbmnqykc, str);
        if (strNufgyqmvbu2 != null) {
            return new iwizpuwonk(strNufgyqmvbu2, 1);
        }
        gtknphoqwx(str, "FirebaseRemoteConfigValue");
        return new iwizpuwonk("", 0);
    }

    public String lqeggnwhkg(String str) {
        String strNufgyqmvbu = nufgyqmvbu(this.f24772ppxfxbqfkf, str);
        if (strNufgyqmvbu != null) {
            ppxfxbqfkf(str, eablkybsjg(this.f24772ppxfxbqfkf));
            return strNufgyqmvbu;
        }
        String strNufgyqmvbu2 = nufgyqmvbu(this.f24773wkgbmnqykc, str);
        if (strNufgyqmvbu2 != null) {
            return strNufgyqmvbu2;
        }
        gtknphoqwx(str, "String");
        return "";
    }

    public Map wkgbmnqykc() {
        HashSet<String> hashSet = new HashSet();
        hashSet.addAll(gxszxtbevo(this.f24772ppxfxbqfkf));
        hashSet.addAll(gxszxtbevo(this.f24773wkgbmnqykc));
        HashMap map = new HashMap();
        for (String str : hashSet) {
            map.put(str, dxjokdxxww(str));
        }
        return map;
    }

    public void zoijcleaow(BiConsumer biConsumer) {
        synchronized (this.f24771iobyxmoadg) {
            this.f24771iobyxmoadg.add(biConsumer);
        }
    }
}
