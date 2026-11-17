package androidx.media3.ui;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.MotionEvent;
import android.webkit.WebView;
import android.widget.FrameLayout;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import y2.stevsuqkhv;

/* JADX INFO: loaded from: classes.dex */
final class wwaezpbzkn extends FrameLayout implements SubtitleView.iobyxmoadg {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private float f11999cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private int f12000esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private d5.iobyxmoadg f12001iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private List f12002jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private float f12003lereixgezr;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final WebView f12004yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final androidx.media3.ui.iobyxmoadg f12005zdlpuopuiu;

    class iobyxmoadg extends WebView {
        iobyxmoadg(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // android.webkit.WebView, android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            super.onTouchEvent(motionEvent);
            return false;
        }

        @Override // android.view.View
        public boolean performClick() {
            super.performClick();
            return false;
        }
    }

    static /* synthetic */ class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final /* synthetic */ int[] f12007iobyxmoadg;

        static {
            int[] iArr = new int[Layout.Alignment.values().length];
            f12007iobyxmoadg = iArr;
            try {
                iArr[Layout.Alignment.ALIGN_NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12007iobyxmoadg[Layout.Alignment.ALIGN_OPPOSITE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12007iobyxmoadg[Layout.Alignment.ALIGN_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public wwaezpbzkn(Context context) {
        this(context, null);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:28:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:31:0x0119  */
    /* JADX WARN: Code duplicated, block: B:32:0x011c  */
    /* JADX WARN: Code duplicated, block: B:35:0x0130 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x0132 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x0134  */
    /* JADX WARN: Code duplicated, block: B:39:0x013b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x013e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0144 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x0152  */
    /* JADX WARN: Code duplicated, block: B:54:0x017d  */
    /* JADX WARN: Code duplicated, block: B:60:0x019e  */
    /* JADX WARN: Code duplicated, block: B:64:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:65:0x01f1  */
    private void dxjokdxxww() {
        String strIozdgvuglv;
        int iZoijcleaow;
        String strIozdgvuglv2;
        boolean z13;
        float f13;
        String strIozdgvuglv3;
        int i13;
        int i14;
        String str;
        String str2;
        Object obj;
        Object obj2;
        lereixgezr.zoijcleaow zoijcleaowVarIobyxmoadg;
        Layout.Alignment alignment;
        String str3;
        boolean z14;
        StringBuilder sb3 = new StringBuilder();
        float f14 = 1.2f;
        sb3.append(stevsuqkhv.iozdgvuglv("<body><div style='-webkit-user-select:none;position:fixed;top:0;bottom:0;left:0;right:0;color:%s;font-size:%s;line-height:%.2f;text-shadow:%s;'>", ppxfxbqfkf.zoijcleaow(this.f12001iwizpuwonk.f27058iobyxmoadg), eablkybsjg(this.f12000esjtqupxsv, this.f11999cqumvgiudr), Float.valueOf(1.2f), wkgbmnqykc(this.f12001iwizpuwonk)));
        HashMap map = new HashMap();
        map.put(ppxfxbqfkf.iobyxmoadg("default_bg"), stevsuqkhv.iozdgvuglv("background-color:%s;", ppxfxbqfkf.zoijcleaow(this.f12001iwizpuwonk.f27061zoijcleaow)));
        int i15 = 0;
        while (i15 < this.f12002jyumaefscl.size()) {
            x2.iobyxmoadg iobyxmoadgVar = (x2.iobyxmoadg) this.f12002jyumaefscl.get(i15);
            float f15 = iobyxmoadgVar.f120964nufgyqmvbu;
            float f16 = f15 != -3.4028235E38f ? f15 * 100.0f : 50.0f;
            int iZoijcleaow2 = zoijcleaow(iobyxmoadgVar.f120958dxjokdxxww);
            float f17 = iobyxmoadgVar.f120959eablkybsjg;
            if (f17 != -3.4028235E38f) {
                if (iobyxmoadgVar.f120961gxszxtbevo != 1) {
                    strIozdgvuglv = stevsuqkhv.iozdgvuglv("%.2f%%", Float.valueOf(f17 * 100.0f));
                    iZoijcleaow = iobyxmoadgVar.f120967rgvfuqvkyq == 1 ? -zoijcleaow(iobyxmoadgVar.f120963lqeggnwhkg) : zoijcleaow(iobyxmoadgVar.f120963lqeggnwhkg);
                } else {
                    if (f17 >= 0.0f) {
                        strIozdgvuglv2 = stevsuqkhv.iozdgvuglv("%.2fem", Float.valueOf(f17 * f14));
                        z13 = false;
                    } else {
                        strIozdgvuglv2 = stevsuqkhv.iozdgvuglv("%.2fem", Float.valueOf(((-f17) - 1.0f) * f14));
                        z13 = true;
                    }
                    iZoijcleaow = 0;
                }
                f13 = iobyxmoadgVar.f120956btonecajqb;
                if (f13 != -3.4028235E38f) {
                    strIozdgvuglv3 = stevsuqkhv.iozdgvuglv("%.2f%%", Float.valueOf(f13 * 100.0f));
                } else {
                    strIozdgvuglv3 = "fit-content";
                }
                String str4 = strIozdgvuglv3;
                String strPpxfxbqfkf = ppxfxbqfkf(iobyxmoadgVar.f120971zoijcleaow);
                String strGxszxtbevo = gxszxtbevo(iobyxmoadgVar.f120967rgvfuqvkyq);
                String strEablkybsjg = eablkybsjg(iobyxmoadgVar.f120955agtfadlqog, iobyxmoadgVar.f120965ojitshcjhn);
                if (iobyxmoadgVar.f120957draadjrbmk) {
                    i13 = iobyxmoadgVar.f120969wflxmlrfwp;
                } else {
                    i13 = this.f12001iwizpuwonk.f27059ppxfxbqfkf;
                }
                String strZoijcleaow = ppxfxbqfkf.zoijcleaow(i13);
                i14 = iobyxmoadgVar.f120967rgvfuqvkyq;
                str = "right";
                if (i14 != 1) {
                    if (z13) {
                        str = "left";
                    }
                    str2 = str;
                    obj = "top";
                } else if (i14 != 2) {
                    str2 = z13 ? "bottom" : "top";
                    obj = "left";
                } else {
                    if (!z13) {
                        str = "left";
                    }
                    str2 = str;
                    obj = "top";
                }
                if (i14 != 2 || i14 == 1) {
                    obj2 = "height";
                    int i16 = iZoijcleaow;
                    iZoijcleaow = iZoijcleaow2;
                    iZoijcleaow2 = i16;
                } else {
                    obj2 = "width";
                }
                zoijcleaowVarIobyxmoadg = lereixgezr.iobyxmoadg(iobyxmoadgVar.f120962iobyxmoadg, getContext().getResources().getDisplayMetrics().density);
                for (String str5 : map.keySet()) {
                    str3 = (String) map.put(str5, (String) map.get(str5));
                    if (str3 != null || str3.equals(map.get(str5))) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    y2.iobyxmoadg.lqeggnwhkg(z14);
                }
                sb3.append(stevsuqkhv.iozdgvuglv("<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", Integer.valueOf(i15), obj, Float.valueOf(f16), str2, strIozdgvuglv2, obj2, str4, strPpxfxbqfkf, strGxszxtbevo, strEablkybsjg, strZoijcleaow, Integer.valueOf(iZoijcleaow2), Integer.valueOf(iZoijcleaow), nufgyqmvbu(iobyxmoadgVar)));
                sb3.append(stevsuqkhv.iozdgvuglv("<span class='%s'>", "default_bg"));
                alignment = iobyxmoadgVar.f120966ppxfxbqfkf;
                if (alignment != null) {
                    sb3.append(stevsuqkhv.iozdgvuglv("<span style='display:inline-block; text-align:%s;'>", ppxfxbqfkf(alignment)));
                    sb3.append(zoijcleaowVarIobyxmoadg.f11892iobyxmoadg);
                    sb3.append("</span>");
                } else {
                    sb3.append(zoijcleaowVarIobyxmoadg.f11892iobyxmoadg);
                }
                sb3.append("</span>");
                sb3.append("</div>");
                i15++;
                f14 = 1.2f;
            } else {
                strIozdgvuglv = stevsuqkhv.iozdgvuglv("%.2f%%", Float.valueOf((1.0f - this.f12003lereixgezr) * 100.0f));
                iZoijcleaow = -100;
            }
            strIozdgvuglv2 = strIozdgvuglv;
            z13 = false;
            f13 = iobyxmoadgVar.f120956btonecajqb;
            if (f13 != -3.4028235E38f) {
                strIozdgvuglv3 = stevsuqkhv.iozdgvuglv("%.2f%%", Float.valueOf(f13 * 100.0f));
            } else {
                strIozdgvuglv3 = "fit-content";
            }
            String str6 = strIozdgvuglv3;
            String strPpxfxbqfkf2 = ppxfxbqfkf(iobyxmoadgVar.f120971zoijcleaow);
            String strGxszxtbevo2 = gxszxtbevo(iobyxmoadgVar.f120967rgvfuqvkyq);
            String strEablkybsjg2 = eablkybsjg(iobyxmoadgVar.f120955agtfadlqog, iobyxmoadgVar.f120965ojitshcjhn);
            if (iobyxmoadgVar.f120957draadjrbmk) {
                i13 = iobyxmoadgVar.f120969wflxmlrfwp;
            } else {
                i13 = this.f12001iwizpuwonk.f27059ppxfxbqfkf;
            }
            String strZoijcleaow2 = ppxfxbqfkf.zoijcleaow(i13);
            i14 = iobyxmoadgVar.f120967rgvfuqvkyq;
            str = "right";
            if (i14 != 1) {
                if (z13) {
                    str = "left";
                }
                str2 = str;
                obj = "top";
            } else if (i14 != 2) {
                str2 = z13 ? "bottom" : "top";
                obj = "left";
            } else {
                if (!z13) {
                    str = "left";
                }
                str2 = str;
                obj = "top";
            }
            if (i14 != 2) {
                obj2 = "height";
                int i17 = iZoijcleaow;
                iZoijcleaow = iZoijcleaow2;
                iZoijcleaow2 = i17;
            } else {
                obj2 = "height";
                int i18 = iZoijcleaow;
                iZoijcleaow = iZoijcleaow2;
                iZoijcleaow2 = i18;
            }
            zoijcleaowVarIobyxmoadg = lereixgezr.iobyxmoadg(iobyxmoadgVar.f120962iobyxmoadg, getContext().getResources().getDisplayMetrics().density);
            while (r5.hasNext()) {
                str3 = (String) map.put(str5, (String) map.get(str5));
                if (str3 != null) {
                    z14 = true;
                } else {
                    z14 = true;
                }
                y2.iobyxmoadg.lqeggnwhkg(z14);
            }
            sb3.append(stevsuqkhv.iozdgvuglv("<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", Integer.valueOf(i15), obj, Float.valueOf(f16), str2, strIozdgvuglv2, obj2, str6, strPpxfxbqfkf2, strGxszxtbevo2, strEablkybsjg2, strZoijcleaow2, Integer.valueOf(iZoijcleaow2), Integer.valueOf(iZoijcleaow), nufgyqmvbu(iobyxmoadgVar)));
            sb3.append(stevsuqkhv.iozdgvuglv("<span class='%s'>", "default_bg"));
            alignment = iobyxmoadgVar.f120966ppxfxbqfkf;
            if (alignment != null) {
                sb3.append(stevsuqkhv.iozdgvuglv("<span style='display:inline-block; text-align:%s;'>", ppxfxbqfkf(alignment)));
                sb3.append(zoijcleaowVarIobyxmoadg.f11892iobyxmoadg);
                sb3.append("</span>");
            } else {
                sb3.append(zoijcleaowVarIobyxmoadg.f11892iobyxmoadg);
            }
            sb3.append("</span>");
            sb3.append("</div>");
            i15++;
            f14 = 1.2f;
        }
        sb3.append("</div></body></html>");
        StringBuilder sb4 = new StringBuilder();
        sb4.append("<html><head><style>");
        for (String str7 : map.keySet()) {
            sb4.append(str7);
            sb4.append("{");
            sb4.append((String) map.get(str7));
            sb4.append("}");
        }
        sb4.append("</style></head>");
        sb3.insert(0, sb4.toString());
        this.f12004yggfygwlhe.loadData(Base64.encodeToString(sb3.toString().getBytes(StandardCharsets.UTF_8), 1), "text/html", "base64");
    }

    private String eablkybsjg(int i13, float f13) {
        float fNufgyqmvbu = iozdgvuglv.nufgyqmvbu(i13, f13, getHeight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        return fNufgyqmvbu == -3.4028235E38f ? "unset" : stevsuqkhv.iozdgvuglv("%.2fpx", Float.valueOf(fNufgyqmvbu / getContext().getResources().getDisplayMetrics().density));
    }

    private static String gxszxtbevo(int i13) {
        if (i13 != 1) {
            return i13 != 2 ? "horizontal-tb" : "vertical-lr";
        }
        return "vertical-rl";
    }

    private static String nufgyqmvbu(x2.iobyxmoadg iobyxmoadgVar) {
        float f13 = iobyxmoadgVar.f120968vdvldrhtss;
        if (f13 == 0.0f) {
            return "";
        }
        int i13 = iobyxmoadgVar.f120967rgvfuqvkyq;
        return stevsuqkhv.iozdgvuglv("%s(%.2fdeg)", (i13 == 2 || i13 == 1) ? "skewY" : "skewX", Float.valueOf(f13));
    }

    private static String ppxfxbqfkf(Layout.Alignment alignment) {
        if (alignment == null) {
            return "center";
        }
        int i13 = zoijcleaow.f12007iobyxmoadg[alignment.ordinal()];
        if (i13 != 1) {
            return i13 != 2 ? "center" : "end";
        }
        return "start";
    }

    private static String wkgbmnqykc(d5.iobyxmoadg iobyxmoadgVar) {
        int i13 = iobyxmoadgVar.f27060wkgbmnqykc;
        if (i13 == 1) {
            return stevsuqkhv.iozdgvuglv("1px 1px 0 %1$s, 1px -1px 0 %1$s, -1px 1px 0 %1$s, -1px -1px 0 %1$s", ppxfxbqfkf.zoijcleaow(iobyxmoadgVar.f27056eablkybsjg));
        }
        if (i13 == 2) {
            return stevsuqkhv.iozdgvuglv("0.1em 0.12em 0.15em %s", ppxfxbqfkf.zoijcleaow(iobyxmoadgVar.f27056eablkybsjg));
        }
        if (i13 != 3) {
            return i13 != 4 ? "unset" : stevsuqkhv.iozdgvuglv("-0.05em -0.05em 0.15em %s", ppxfxbqfkf.zoijcleaow(iobyxmoadgVar.f27056eablkybsjg));
        }
        return stevsuqkhv.iozdgvuglv("0.06em 0.08em 0.15em %s", ppxfxbqfkf.zoijcleaow(iobyxmoadgVar.f27056eablkybsjg));
    }

    private static int zoijcleaow(int i13) {
        if (i13 != 1) {
            return i13 != 2 ? 0 : -100;
        }
        return -50;
    }

    @Override // androidx.media3.ui.SubtitleView.iobyxmoadg
    public void iobyxmoadg(List list, d5.iobyxmoadg iobyxmoadgVar, float f13, int i13, float f14) {
        this.f12001iwizpuwonk = iobyxmoadgVar;
        this.f11999cqumvgiudr = f13;
        this.f12000esjtqupxsv = i13;
        this.f12003lereixgezr = f14;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i14 = 0; i14 < list.size(); i14++) {
            x2.iobyxmoadg iobyxmoadgVar2 = (x2.iobyxmoadg) list.get(i14);
            if (iobyxmoadgVar2.f120970wkgbmnqykc != null) {
                arrayList.add(iobyxmoadgVar2);
            } else {
                arrayList2.add(iobyxmoadgVar2);
            }
        }
        if (!this.f12002jyumaefscl.isEmpty() || !arrayList2.isEmpty()) {
            this.f12002jyumaefscl = arrayList2;
            dxjokdxxww();
        }
        this.f12005zdlpuopuiu.iobyxmoadg(arrayList, iobyxmoadgVar, f13, i13, f14);
        invalidate();
    }

    public void lqeggnwhkg() {
        this.f12004yggfygwlhe.destroy();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z13, int i13, int i14, int i15, int i16) {
        super.onLayout(z13, i13, i14, i15, i16);
        if (!z13 || this.f12002jyumaefscl.isEmpty()) {
            return;
        }
        dxjokdxxww();
    }

    public wwaezpbzkn(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12002jyumaefscl = Collections.emptyList();
        this.f12001iwizpuwonk = d5.iobyxmoadg.f27055lqeggnwhkg;
        this.f11999cqumvgiudr = 0.0533f;
        this.f12000esjtqupxsv = 0;
        this.f12003lereixgezr = 0.08f;
        androidx.media3.ui.iobyxmoadg iobyxmoadgVar = new androidx.media3.ui.iobyxmoadg(context, attributeSet);
        this.f12005zdlpuopuiu = iobyxmoadgVar;
        iobyxmoadg iobyxmoadgVar2 = new iobyxmoadg(context, attributeSet);
        this.f12004yggfygwlhe = iobyxmoadgVar2;
        iobyxmoadgVar2.setBackgroundColor(0);
        addView(iobyxmoadgVar);
        addView(iobyxmoadgVar2);
    }
}
