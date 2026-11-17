package coil.memory;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.appcompat.app.yggfygwlhe;
import e7.draadjrbmk;
import e7.ojitshcjhn;
import e7.rgvfuqvkyq;
import f7.dxjokdxxww;
import hg.tzroggbefp;
import i7.kcexrzcfyt;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes2.dex */
public final class ppxfxbqfkf {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public static final iobyxmoadg f20289ppxfxbqfkf = new iobyxmoadg(null);

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final v6.wkgbmnqykc f20290iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final ojitshcjhn f20291zoijcleaow;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    public ppxfxbqfkf(v6.wkgbmnqykc wkgbmnqykcVar, ojitshcjhn ojitshcjhnVar, kcexrzcfyt kcexrzcfytVar) {
        this.f20290iobyxmoadg = wkgbmnqykcVar;
        this.f20291zoijcleaow = ojitshcjhnVar;
    }

    private final boolean eablkybsjg(e7.nufgyqmvbu nufgyqmvbuVar, MemoryCache.Key key, MemoryCache.zoijcleaow zoijcleaowVar, dxjokdxxww dxjokdxxwwVar, f7.nufgyqmvbu nufgyqmvbuVar2) {
        boolean zWkgbmnqykc = wkgbmnqykc(zoijcleaowVar);
        if (f7.zoijcleaow.iobyxmoadg(dxjokdxxwwVar)) {
            return !zWkgbmnqykc;
        }
        String str = (String) key.getExtras().get("coil#transformation_size");
        if (str != null) {
            return zdlpuopuiu.eablkybsjg(str, dxjokdxxwwVar.toString());
        }
        int width = zoijcleaowVar.iobyxmoadg().getWidth();
        int height = zoijcleaowVar.iobyxmoadg().getHeight();
        f7.ppxfxbqfkf ppxfxbqfkfVarWkgbmnqykc = dxjokdxxwwVar.wkgbmnqykc();
        int i13 = ppxfxbqfkfVarWkgbmnqykc instanceof f7.ppxfxbqfkf.iobyxmoadg ? ((f7.ppxfxbqfkf.iobyxmoadg) ppxfxbqfkfVarWkgbmnqykc).f33044iobyxmoadg : Integer.MAX_VALUE;
        f7.ppxfxbqfkf ppxfxbqfkfVarPpxfxbqfkf = dxjokdxxwwVar.ppxfxbqfkf();
        int i14 = ppxfxbqfkfVarPpxfxbqfkf instanceof f7.ppxfxbqfkf.iobyxmoadg ? ((f7.ppxfxbqfkf.iobyxmoadg) ppxfxbqfkfVarPpxfxbqfkf).f33044iobyxmoadg : Integer.MAX_VALUE;
        double dPpxfxbqfkf = x6.gxszxtbevo.ppxfxbqfkf(width, height, i13, i14, nufgyqmvbuVar2);
        boolean zIobyxmoadg = i7.dxjokdxxww.iobyxmoadg(nufgyqmvbuVar);
        if (zIobyxmoadg) {
            double dNufgyqmvbu = zg.gtknphoqwx.nufgyqmvbu(dPpxfxbqfkf, 1.0d);
            if (Math.abs(((double) i13) - (((double) width) * dNufgyqmvbu)) <= 1.0d || Math.abs(((double) i14) - (dNufgyqmvbu * ((double) height))) <= 1.0d) {
                return true;
            }
        } else if ((i7.gtknphoqwx.kcexrzcfyt(i13) || Math.abs(i13 - width) <= 1) && (i7.gtknphoqwx.kcexrzcfyt(i14) || Math.abs(i14 - height) <= 1)) {
            return true;
        }
        if (dPpxfxbqfkf == 1.0d || zIobyxmoadg) {
            return dPpxfxbqfkf <= 1.0d || !zWkgbmnqykc;
        }
        return false;
    }

    private final boolean wkgbmnqykc(MemoryCache.zoijcleaow zoijcleaowVar) {
        Object obj = zoijcleaowVar.zoijcleaow().get("coil#is_sampled");
        Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    private final String zoijcleaow(MemoryCache.zoijcleaow zoijcleaowVar) {
        Object obj = zoijcleaowVar.zoijcleaow().get("coil#disk_cache_key");
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public final MemoryCache.Key gxszxtbevo(e7.nufgyqmvbu nufgyqmvbuVar, Object obj, draadjrbmk draadjrbmkVar, v6.zoijcleaow zoijcleaowVar) {
        MemoryCache.Key keyZynmafqrjb = nufgyqmvbuVar.zynmafqrjb();
        if (keyZynmafqrjb != null) {
            return keyZynmafqrjb;
        }
        zoijcleaowVar.draadjrbmk(nufgyqmvbuVar, obj);
        String strGxszxtbevo = this.f20290iobyxmoadg.getComponents().gxszxtbevo(obj, draadjrbmkVar);
        zoijcleaowVar.wkgbmnqykc(nufgyqmvbuVar, strGxszxtbevo);
        if (strGxszxtbevo == null) {
            return null;
        }
        List listDsvhmnatus = nufgyqmvbuVar.dsvhmnatus();
        Map mapZoijcleaow = nufgyqmvbuVar.yadqdtsiqt().zoijcleaow();
        if (listDsvhmnatus.isEmpty() && mapZoijcleaow.isEmpty()) {
            return new MemoryCache.Key(strGxszxtbevo, null, 2, null);
        }
        Map mapIwizpuwonk = tzroggbefp.iwizpuwonk(mapZoijcleaow);
        if (!listDsvhmnatus.isEmpty()) {
            List listDsvhmnatus2 = nufgyqmvbuVar.dsvhmnatus();
            if (listDsvhmnatus2.size() > 0) {
                yggfygwlhe.iobyxmoadg(listDsvhmnatus2.get(0));
                StringBuilder sb3 = new StringBuilder();
                sb3.append("coil#transformation_");
                sb3.append(0);
                throw null;
            }
            mapIwizpuwonk.put("coil#transformation_size", draadjrbmkVar.ojitshcjhn().toString());
        }
        return new MemoryCache.Key(strGxszxtbevo, mapIwizpuwonk);
    }

    public final MemoryCache.zoijcleaow iobyxmoadg(e7.nufgyqmvbu nufgyqmvbuVar, MemoryCache.Key key, dxjokdxxww dxjokdxxwwVar, f7.nufgyqmvbu nufgyqmvbuVar2) {
        if (!nufgyqmvbuVar.istkbnxepw().wkgbmnqykc()) {
            return null;
        }
        MemoryCache memoryCacheZoijcleaow = this.f20290iobyxmoadg.zoijcleaow();
        MemoryCache.zoijcleaow zoijcleaowVarZoijcleaow = memoryCacheZoijcleaow != null ? memoryCacheZoijcleaow.zoijcleaow(key) : null;
        if (zoijcleaowVarZoijcleaow == null || !ppxfxbqfkf(nufgyqmvbuVar, key, zoijcleaowVarZoijcleaow, dxjokdxxwwVar, nufgyqmvbuVar2)) {
            return null;
        }
        return zoijcleaowVarZoijcleaow;
    }

    public final rgvfuqvkyq lqeggnwhkg(a7.zoijcleaow.iobyxmoadg iobyxmoadgVar, e7.nufgyqmvbu nufgyqmvbuVar, MemoryCache.Key key, MemoryCache.zoijcleaow zoijcleaowVar) {
        return new rgvfuqvkyq(new BitmapDrawable(nufgyqmvbuVar.draadjrbmk().getResources(), zoijcleaowVar.iobyxmoadg()), nufgyqmvbuVar, x6.wkgbmnqykc.MEMORY_CACHE, key, zoijcleaow(zoijcleaowVar), wkgbmnqykc(zoijcleaowVar), i7.gtknphoqwx.zdlpuopuiu(iobyxmoadgVar));
    }

    public final boolean nufgyqmvbu(MemoryCache.Key key, e7.nufgyqmvbu nufgyqmvbuVar, a7.iobyxmoadg.zoijcleaow zoijcleaowVar) {
        MemoryCache memoryCacheZoijcleaow;
        Bitmap bitmap;
        if (nufgyqmvbuVar.istkbnxepw().lqeggnwhkg() && (memoryCacheZoijcleaow = this.f20290iobyxmoadg.zoijcleaow()) != null && key != null) {
            Drawable drawableEablkybsjg = zoijcleaowVar.eablkybsjg();
            BitmapDrawable bitmapDrawable = drawableEablkybsjg instanceof BitmapDrawable ? (BitmapDrawable) drawableEablkybsjg : null;
            if (bitmapDrawable != null && (bitmap = bitmapDrawable.getBitmap()) != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("coil#is_sampled", Boolean.valueOf(zoijcleaowVar.gxszxtbevo()));
                String strWkgbmnqykc = zoijcleaowVar.wkgbmnqykc();
                if (strWkgbmnqykc != null) {
                    linkedHashMap.put("coil#disk_cache_key", strWkgbmnqykc);
                }
                memoryCacheZoijcleaow.ppxfxbqfkf(key, new MemoryCache.zoijcleaow(bitmap, linkedHashMap));
                return true;
            }
        }
        return false;
    }

    public final boolean ppxfxbqfkf(e7.nufgyqmvbu nufgyqmvbuVar, MemoryCache.Key key, MemoryCache.zoijcleaow zoijcleaowVar, dxjokdxxww dxjokdxxwwVar, f7.nufgyqmvbu nufgyqmvbuVar2) {
        if (this.f20291zoijcleaow.ppxfxbqfkf(nufgyqmvbuVar, i7.iobyxmoadg.ppxfxbqfkf(zoijcleaowVar.iobyxmoadg()))) {
            return eablkybsjg(nufgyqmvbuVar, key, zoijcleaowVar, dxjokdxxwwVar, nufgyqmvbuVar2);
        }
        return false;
    }
}
