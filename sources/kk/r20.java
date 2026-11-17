package kk;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class r20 {
    public static lk.iwizpuwonk iobyxmoadg(final xy httpHeadersHandler, final h90 globalExceptionHandler) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(httpHeadersHandler, "httpHeadersHandler");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(globalExceptionHandler, "globalExceptionHandler");
        return new lk.iwizpuwonk() { // from class: kk.q20
            @Override // lk.iwizpuwonk
            public final lk.cdpycssgdh intercept(lk.iwizpuwonk.iobyxmoadg iobyxmoadgVar) {
                return r20.zoijcleaow(httpHeadersHandler, globalExceptionHandler, iobyxmoadgVar);
            }
        };
    }

    public static final lk.cdpycssgdh zoijcleaow(xy httpHeadersHandler, h90 globalExceptionHandler, lk.iwizpuwonk.iobyxmoadg chain) {
        Object obj;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(httpHeadersHandler, "$httpHeadersHandler");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(globalExceptionHandler, "$globalExceptionHandler");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(chain, "chain");
        c00 c00Var = (c00) httpHeadersHandler;
        lk.zynmafqrjb request = c00Var.zoijcleaow(chain.dxjokdxxww());
        zy.iobyxmoadg(request);
        globalExceptionHandler.getClass();
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(chain, "chain");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(request, "request");
        lk.cdpycssgdh response = chain.zoijcleaow(request);
        zy.zoijcleaow(response);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(response, "response");
        u80 u80Var = c00Var.f56075zoijcleaow;
        u80Var.getClass();
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(response, "response");
        String strValueOf = String.valueOf((List) response.kcexrzcfyt().dxjokdxxww().get("set-cookie"));
        mj.rgvfuqvkyq regexPattern = u80Var.f58795ppxfxbqfkf;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(strValueOf, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(regexPattern, "regexPattern");
        for (mj.draadjrbmk draadjrbmkVar : lj.wflxmlrfwp.crxdokpmqz(mj.rgvfuqvkyq.btonecajqb(regexPattern, strValueOf, 0, 2, null))) {
            if (mj.kcexrzcfyt.sopmlzcsov(draadjrbmkVar.getValue(), "X-Sdk-Refresh-Data", false, 2, null)) {
                obj = m50.f57594iobyxmoadg;
            } else if (mj.kcexrzcfyt.sopmlzcsov(draadjrbmkVar.getValue(), "X-Sdk-Id-Key", false, 2, null)) {
                obj = i40.f56990iobyxmoadg;
            } else if (mj.kcexrzcfyt.sopmlzcsov(draadjrbmkVar.getValue(), "X-Geo-Sticky", false, 2, null)) {
                obj = e30.f56378iobyxmoadg;
            } else {
                obj = mj.kcexrzcfyt.sopmlzcsov(draadjrbmkVar.getValue(), "X-SP-D-M", false, 2, null) ? r70.f58279iobyxmoadg : null;
            }
            if (obj != null) {
                String value = draadjrbmkVar.getValue();
                if (obj instanceof r70) {
                    if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg((r70) obj, r70.f58279iobyxmoadg)) {
                        if (value == null || mj.kcexrzcfyt.zfvoamnweg(value)) {
                            value = null;
                        }
                        if (value == null) {
                            value = u80Var.f58793eablkybsjg;
                        }
                        u80Var.f58793eablkybsjg = value;
                    }
                } else if (obj instanceof e30) {
                    if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg((e30) obj, e30.f56378iobyxmoadg)) {
                        u80Var.f58796wkgbmnqykc = value;
                    }
                } else if (obj instanceof o60) {
                    o60 o60Var = (o60) obj;
                    if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(o60Var, m50.f57594iobyxmoadg)) {
                        u80Var.f58794iobyxmoadg.a("X-Sdk-Refresh-Data", value);
                    } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(o60Var, i40.f56990iobyxmoadg)) {
                        u80Var.f58794iobyxmoadg.a("X-Sdk-Id-Key", value);
                    }
                }
            }
        }
        li0 li0Var = c00Var.f56074wkgbmnqykc;
        li0Var.getClass();
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(response, "response");
        String strIobyxmoadg = response.kcexrzcfyt().iobyxmoadg("x-pod-sticky");
        if (strIobyxmoadg != null) {
            li0Var.f57479iobyxmoadg = strIobyxmoadg;
        }
        return response;
    }
}
