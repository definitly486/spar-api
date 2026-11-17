package mk;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.mbcevpiqjq;
import kotlin.jvm.internal.zdlpuopuiu;
import lk.istkbnxepw;
import lk.yggfygwlhe;
import lk.zynmafqrjb;
import mj.kcexrzcfyt;

/* JADX INFO: loaded from: classes3.dex */
public abstract class btonecajqb {
    public static final zynmafqrjb.iobyxmoadg btonecajqb(zynmafqrjb.iobyxmoadg iobyxmoadgVar, ah.wkgbmnqykc type, Object obj) {
        Map mapPpxfxbqfkf;
        zdlpuopuiu.btonecajqb(iobyxmoadgVar, "<this>");
        zdlpuopuiu.btonecajqb(type, "type");
        if (obj != null) {
            if (iobyxmoadgVar.lqeggnwhkg().isEmpty()) {
                mapPpxfxbqfkf = new LinkedHashMap();
                iobyxmoadgVar.vdvldrhtss(mapPpxfxbqfkf);
            } else {
                Map mapLqeggnwhkg = iobyxmoadgVar.lqeggnwhkg();
                zdlpuopuiu.nufgyqmvbu(mapLqeggnwhkg, "null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.reflect.KClass<*>, kotlin.Any>");
                mapPpxfxbqfkf = mbcevpiqjq.ppxfxbqfkf(mapLqeggnwhkg);
            }
            mapPpxfxbqfkf.put(type, obj);
        } else if (!iobyxmoadgVar.lqeggnwhkg().isEmpty()) {
            Map mapLqeggnwhkg2 = iobyxmoadgVar.lqeggnwhkg();
            zdlpuopuiu.nufgyqmvbu(mapLqeggnwhkg2, "null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.reflect.KClass<*>, kotlin.Any>");
            mbcevpiqjq.ppxfxbqfkf(mapLqeggnwhkg2).remove(type);
        }
        return iobyxmoadgVar;
    }

    public static final zynmafqrjb.iobyxmoadg dxjokdxxww(zynmafqrjb.iobyxmoadg iobyxmoadgVar, String name) {
        zdlpuopuiu.btonecajqb(iobyxmoadgVar, "<this>");
        zdlpuopuiu.btonecajqb(name, "name");
        iobyxmoadgVar.eablkybsjg().nufgyqmvbu(name);
        return iobyxmoadgVar;
    }

    public static final zynmafqrjb.iobyxmoadg eablkybsjg(zynmafqrjb.iobyxmoadg iobyxmoadgVar, String name, String value) {
        zdlpuopuiu.btonecajqb(iobyxmoadgVar, "<this>");
        zdlpuopuiu.btonecajqb(name, "name");
        zdlpuopuiu.btonecajqb(value, "value");
        iobyxmoadgVar.eablkybsjg().dxjokdxxww(name, value);
        return iobyxmoadgVar;
    }

    public static final zynmafqrjb.iobyxmoadg gxszxtbevo(zynmafqrjb.iobyxmoadg iobyxmoadgVar, yggfygwlhe headers) {
        zdlpuopuiu.btonecajqb(iobyxmoadgVar, "<this>");
        zdlpuopuiu.btonecajqb(headers, "headers");
        iobyxmoadgVar.ojitshcjhn(headers.eablkybsjg());
        return iobyxmoadgVar;
    }

    public static final String iobyxmoadg(String url) {
        zdlpuopuiu.btonecajqb(url, "url");
        if (kcexrzcfyt.dsvhmnatus(url, "ws:", true)) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("http:");
            String strSubstring = url.substring(3);
            zdlpuopuiu.dxjokdxxww(strSubstring, "this as java.lang.String).substring(startIndex)");
            sb3.append(strSubstring);
            return sb3.toString();
        }
        if (!kcexrzcfyt.dsvhmnatus(url, "wss:", true)) {
            return url;
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append("https:");
        String strSubstring2 = url.substring(4);
        zdlpuopuiu.dxjokdxxww(strSubstring2, "this as java.lang.String).substring(startIndex)");
        sb4.append(strSubstring2);
        return sb4.toString();
    }

    public static final zynmafqrjb.iobyxmoadg lqeggnwhkg(zynmafqrjb.iobyxmoadg iobyxmoadgVar, String method, istkbnxepw istkbnxepwVar) {
        zdlpuopuiu.btonecajqb(iobyxmoadgVar, "<this>");
        zdlpuopuiu.btonecajqb(method, "method");
        if (method.length() <= 0) {
            throw new IllegalArgumentException("method.isEmpty() == true");
        }
        if (istkbnxepwVar == null) {
            if (rk.gxszxtbevo.wkgbmnqykc(method)) {
                throw new IllegalArgumentException(("method " + method + " must have a request body.").toString());
            }
        } else if (!rk.gxszxtbevo.iobyxmoadg(method)) {
            throw new IllegalArgumentException(("method " + method + " must not have a request body.").toString());
        }
        iobyxmoadgVar.rgvfuqvkyq(method);
        iobyxmoadgVar.agtfadlqog(istkbnxepwVar);
        return iobyxmoadgVar;
    }

    public static final zynmafqrjb.iobyxmoadg nufgyqmvbu(zynmafqrjb.iobyxmoadg iobyxmoadgVar, istkbnxepw body) {
        zdlpuopuiu.btonecajqb(iobyxmoadgVar, "<this>");
        zdlpuopuiu.btonecajqb(body, "body");
        return iobyxmoadgVar.gtknphoqwx("POST", body);
    }

    public static final zynmafqrjb.iobyxmoadg ppxfxbqfkf(zynmafqrjb.iobyxmoadg iobyxmoadgVar, lk.wkgbmnqykc cacheControl) {
        zdlpuopuiu.btonecajqb(iobyxmoadgVar, "<this>");
        zdlpuopuiu.btonecajqb(cacheControl, "cacheControl");
        String string = cacheControl.toString();
        return string.length() == 0 ? iobyxmoadgVar.wflxmlrfwp("Cache-Control") : iobyxmoadgVar.dxjokdxxww("Cache-Control", string);
    }

    public static final String wkgbmnqykc(zynmafqrjb zynmafqrjbVar, String name) {
        zdlpuopuiu.btonecajqb(zynmafqrjbVar, "<this>");
        zdlpuopuiu.btonecajqb(name, "name");
        return zynmafqrjbVar.eablkybsjg().iobyxmoadg(name);
    }

    public static final zynmafqrjb.iobyxmoadg zoijcleaow(zynmafqrjb.iobyxmoadg iobyxmoadgVar, String name, String value) {
        zdlpuopuiu.btonecajqb(iobyxmoadgVar, "<this>");
        zdlpuopuiu.btonecajqb(name, "name");
        zdlpuopuiu.btonecajqb(value, "value");
        iobyxmoadgVar.eablkybsjg().iobyxmoadg(name, value);
        return iobyxmoadgVar;
    }
}
