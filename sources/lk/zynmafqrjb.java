package lk;

import hg.tzroggbefp;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zynmafqrjb {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final Map f63258eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private wkgbmnqykc f63259gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final jyumaefscl f63260iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final yggfygwlhe f63261ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final istkbnxepw f63262wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f63263zoijcleaow;

    public zynmafqrjb(iobyxmoadg builder) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(builder, "builder");
        jyumaefscl jyumaefsclVarNufgyqmvbu = builder.nufgyqmvbu();
        if (jyumaefsclVarNufgyqmvbu == null) {
            throw new IllegalStateException("url == null");
        }
        this.f63260iobyxmoadg = jyumaefsclVarNufgyqmvbu;
        this.f63263zoijcleaow = builder.gxszxtbevo();
        this.f63261ppxfxbqfkf = builder.eablkybsjg().gxszxtbevo();
        this.f63262wkgbmnqykc = builder.wkgbmnqykc();
        this.f63258eablkybsjg = tzroggbefp.yggfygwlhe(builder.lqeggnwhkg());
    }

    public final Object btonecajqb(Class type) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(type, "type");
        return dxjokdxxww(sg.iobyxmoadg.eablkybsjg(type));
    }

    public final Object dxjokdxxww(ah.wkgbmnqykc type) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(type, "type");
        return sg.iobyxmoadg.zoijcleaow(type).cast(this.f63258eablkybsjg.get(type));
    }

    public final yggfygwlhe eablkybsjg() {
        return this.f63261ppxfxbqfkf;
    }

    public final jyumaefscl gtknphoqwx() {
        return this.f63260iobyxmoadg;
    }

    public final boolean gxszxtbevo() {
        return this.f63260iobyxmoadg.btonecajqb();
    }

    public final istkbnxepw iobyxmoadg() {
        return this.f63262wkgbmnqykc;
    }

    public final String lqeggnwhkg() {
        return this.f63263zoijcleaow;
    }

    public final iobyxmoadg nufgyqmvbu() {
        return new iobyxmoadg(this);
    }

    public final Map ppxfxbqfkf() {
        return this.f63258eablkybsjg;
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Request{method=");
        sb3.append(this.f63263zoijcleaow);
        sb3.append(", url=");
        sb3.append(this.f63260iobyxmoadg);
        if (this.f63261ppxfxbqfkf.size() != 0) {
            sb3.append(", headers=[");
            int i13 = 0;
            for (Object obj : this.f63261ppxfxbqfkf) {
                int i14 = i13 + 1;
                if (i13 < 0) {
                    hg.jyumaefscl.iwizpuwonk();
                }
                gg.vdvldrhtss vdvldrhtssVar = (gg.vdvldrhtss) obj;
                String str = (String) vdvldrhtssVar.iobyxmoadg();
                String str2 = (String) vdvldrhtssVar.wkgbmnqykc();
                if (i13 > 0) {
                    sb3.append(", ");
                }
                sb3.append(str);
                sb3.append(':');
                if (mk.wflxmlrfwp.esjtqupxsv(str)) {
                    str2 = "██";
                }
                sb3.append(str2);
                i13 = i14;
            }
            sb3.append(']');
        }
        if (!this.f63258eablkybsjg.isEmpty()) {
            sb3.append(", tags=");
            sb3.append(this.f63258eablkybsjg);
        }
        sb3.append('}');
        String string = sb3.toString();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public final String wkgbmnqykc(String name) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(name, "name");
        return mk.btonecajqb.wkgbmnqykc(this, name);
    }

    public final wkgbmnqykc zoijcleaow() {
        wkgbmnqykc wkgbmnqykcVar = this.f63259gxszxtbevo;
        if (wkgbmnqykcVar != null) {
            return wkgbmnqykcVar;
        }
        wkgbmnqykc wkgbmnqykcVarIobyxmoadg = wkgbmnqykc.f63214agtfadlqog.iobyxmoadg(this.f63261ppxfxbqfkf);
        this.f63259gxszxtbevo = wkgbmnqykcVarIobyxmoadg;
        return wkgbmnqykcVarIobyxmoadg;
    }

    public static class iobyxmoadg {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private Map f63264eablkybsjg;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private jyumaefscl f63265iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private yggfygwlhe.iobyxmoadg f63266ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private istkbnxepw f63267wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private String f63268zoijcleaow;

        public iobyxmoadg() {
            this.f63264eablkybsjg = tzroggbefp.dxjokdxxww();
            this.f63268zoijcleaow = "GET";
            this.f63266ppxfxbqfkf = new yggfygwlhe.iobyxmoadg();
        }

        public final void agtfadlqog(istkbnxepw istkbnxepwVar) {
            this.f63267wkgbmnqykc = istkbnxepwVar;
        }

        public iobyxmoadg btonecajqb(yggfygwlhe headers) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(headers, "headers");
            return mk.btonecajqb.gxszxtbevo(this, headers);
        }

        public iobyxmoadg draadjrbmk(istkbnxepw body) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(body, "body");
            return mk.btonecajqb.nufgyqmvbu(this, body);
        }

        public iobyxmoadg dxjokdxxww(String name, String value) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(name, "name");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(value, "value");
            return mk.btonecajqb.eablkybsjg(this, name, value);
        }

        public final yggfygwlhe.iobyxmoadg eablkybsjg() {
            return this.f63266ppxfxbqfkf;
        }

        public iobyxmoadg gtknphoqwx(String method, istkbnxepw istkbnxepwVar) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(method, "method");
            return mk.btonecajqb.lqeggnwhkg(this, method, istkbnxepwVar);
        }

        public final String gxszxtbevo() {
            return this.f63268zoijcleaow;
        }

        public iobyxmoadg iobyxmoadg(String name, String value) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(name, "name");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(value, "value");
            return mk.btonecajqb.zoijcleaow(this, name, value);
        }

        public iobyxmoadg kcexrzcfyt(String url) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(url, "url");
            return zdlpuopuiu(jyumaefscl.f63067gtknphoqwx.wkgbmnqykc(mk.btonecajqb.iobyxmoadg(url)));
        }

        public final Map lqeggnwhkg() {
            return this.f63264eablkybsjg;
        }

        public final jyumaefscl nufgyqmvbu() {
            return this.f63265iobyxmoadg;
        }

        public final void ojitshcjhn(yggfygwlhe.iobyxmoadg iobyxmoadgVar) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(iobyxmoadgVar, "<set-?>");
            this.f63266ppxfxbqfkf = iobyxmoadgVar;
        }

        public iobyxmoadg oxmwwwfdhm(Class type, Object obj) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(type, "type");
            return mk.btonecajqb.btonecajqb(this, sg.iobyxmoadg.eablkybsjg(type), obj);
        }

        public iobyxmoadg ppxfxbqfkf(wkgbmnqykc cacheControl) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(cacheControl, "cacheControl");
            return mk.btonecajqb.ppxfxbqfkf(this, cacheControl);
        }

        public final void rgvfuqvkyq(String str) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(str, "<set-?>");
            this.f63268zoijcleaow = str;
        }

        public final void vdvldrhtss(Map map) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(map, "<set-?>");
            this.f63264eablkybsjg = map;
        }

        public iobyxmoadg wflxmlrfwp(String name) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(name, "name");
            return mk.btonecajqb.dxjokdxxww(this, name);
        }

        public final istkbnxepw wkgbmnqykc() {
            return this.f63267wkgbmnqykc;
        }

        public iobyxmoadg zdlpuopuiu(jyumaefscl url) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(url, "url");
            this.f63265iobyxmoadg = url;
            return this;
        }

        public zynmafqrjb zoijcleaow() {
            return new zynmafqrjb(this);
        }

        public iobyxmoadg(zynmafqrjb request) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(request, "request");
            this.f63264eablkybsjg = tzroggbefp.dxjokdxxww();
            this.f63265iobyxmoadg = request.gtknphoqwx();
            this.f63268zoijcleaow = request.lqeggnwhkg();
            this.f63267wkgbmnqykc = request.iobyxmoadg();
            this.f63264eablkybsjg = request.ppxfxbqfkf().isEmpty() ? tzroggbefp.dxjokdxxww() : tzroggbefp.iwizpuwonk(request.ppxfxbqfkf());
            this.f63266ppxfxbqfkf = request.eablkybsjg().eablkybsjg();
        }
    }
}
