package j0;

import android.graphics.Typeface;
import android.text.Editable;
import android.text.Html;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.AlignmentSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.SubscriptSpan;
import android.text.style.SuperscriptSpan;
import android.text.style.TypefaceSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import org.xml.sax.XMLReader;

/* JADX INFO: loaded from: classes.dex */
public abstract class rgvfuqvkyq {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final iobyxmoadg f50310iobyxmoadg = new iobyxmoadg();

    public static final class iobyxmoadg implements Html.TagHandler {
        iobyxmoadg() {
        }

        @Override // android.text.Html.TagHandler
        public void handleTag(boolean z13, String str, Editable editable, XMLReader xMLReader) {
            if (xMLReader == null || editable == null || !z13 || !kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(str, "ContentHandlerReplacementTag")) {
                return;
            }
            xMLReader.setContentHandler(new nufgyqmvbu(xMLReader.getContentHandler(), editable));
        }
    }

    public /* synthetic */ class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f50311iobyxmoadg;

        static {
            int[] iArr = new int[Layout.Alignment.values().length];
            try {
                iArr[Layout.Alignment.ALIGN_NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Layout.Alignment.ALIGN_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Layout.Alignment.ALIGN_OPPOSITE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f50311iobyxmoadg = iArr;
        }
    }

    private static final jrbgnlbqoe dxjokdxxww(TypefaceSpan typefaceSpan) {
        n0.wflxmlrfwp wflxmlrfwpVarEablkybsjg;
        String family = typefaceSpan.getFamily();
        n0.wflxmlrfwp.iobyxmoadg iobyxmoadgVar = n0.wflxmlrfwp.f68347yggfygwlhe;
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(family, iobyxmoadgVar.iobyxmoadg().gxszxtbevo())) {
            wflxmlrfwpVarEablkybsjg = iobyxmoadgVar.iobyxmoadg();
        } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(family, iobyxmoadgVar.ppxfxbqfkf().gxszxtbevo())) {
            wflxmlrfwpVarEablkybsjg = iobyxmoadgVar.ppxfxbqfkf();
        } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(family, iobyxmoadgVar.wkgbmnqykc().gxszxtbevo())) {
            wflxmlrfwpVarEablkybsjg = iobyxmoadgVar.wkgbmnqykc();
        } else {
            wflxmlrfwpVarEablkybsjg = kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(family, iobyxmoadgVar.eablkybsjg().gxszxtbevo()) ? iobyxmoadgVar.eablkybsjg() : eablkybsjg(typefaceSpan.getFamily());
        }
        return new jrbgnlbqoe(0L, 0L, null, null, null, wflxmlrfwpVarEablkybsjg, null, 0L, null, null, null, 0L, null, null, null, null, 65503, null);
    }

    private static final n0.wflxmlrfwp eablkybsjg(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        Typeface typefaceCreate = Typeface.create(str, 0);
        Typeface typeface = Typeface.DEFAULT;
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(typefaceCreate, typeface) || kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(typefaceCreate, Typeface.create(typeface, 0))) {
            typefaceCreate = null;
        }
        if (typefaceCreate != null) {
            return n0.lqeggnwhkg.iobyxmoadg(typefaceCreate);
        }
        return null;
    }

    public static final eablkybsjg gxszxtbevo(Spanned spanned, g gVar, oxmwwwfdhm oxmwwwfdhmVar) {
        eablkybsjg.zoijcleaow zoijcleaowVarAppend = new eablkybsjg.zoijcleaow(spanned.length()).append(spanned);
        zoijcleaow(zoijcleaowVarAppend, spanned, gVar, oxmwwwfdhmVar);
        return zoijcleaowVarAppend.yggfygwlhe();
    }

    private static final void iobyxmoadg(eablkybsjg.zoijcleaow zoijcleaowVar, Object obj, int i13, int i14, g gVar, oxmwwwfdhm oxmwwwfdhmVar) {
        String url;
        if (obj instanceof AbsoluteSizeSpan) {
            return;
        }
        if (obj instanceof AlignmentSpan) {
            zoijcleaowVar.wkgbmnqykc(lqeggnwhkg((AlignmentSpan) obj), i13, i14);
            return;
        }
        if (obj instanceof dxjokdxxww) {
            dxjokdxxww dxjokdxxwwVar = (dxjokdxxww) obj;
            zoijcleaowVar.ppxfxbqfkf(dxjokdxxwwVar.iobyxmoadg(), dxjokdxxwwVar.zoijcleaow(), i13, i14);
            return;
        }
        if (obj instanceof BackgroundColorSpan) {
            zoijcleaowVar.eablkybsjg(new jrbgnlbqoe(0L, 0L, null, null, null, null, null, 0L, null, null, null, h.bfopjjpdmp.zoijcleaow(((BackgroundColorSpan) obj).getBackgroundColor()), null, null, null, null, 63487, null), i13, i14);
            return;
        }
        if (obj instanceof draadjrbmk) {
            long jZoijcleaow = gtknphoqwx.f50211nufgyqmvbu.zoijcleaow();
            draadjrbmk draadjrbmkVar = (draadjrbmk) obj;
            int iZoijcleaow = draadjrbmkVar.zoijcleaow();
            w0.iwizpuwonk.zoijcleaow(jZoijcleaow);
            zoijcleaowVar.iobyxmoadg(draadjrbmkVar.iobyxmoadg(), w0.iwizpuwonk.gtknphoqwx(w0.jyumaefscl.gxszxtbevo(jZoijcleaow), w0.jyumaefscl.nufgyqmvbu(jZoijcleaow) * iZoijcleaow), i13, i14);
            return;
        }
        if (obj instanceof ForegroundColorSpan) {
            zoijcleaowVar.eablkybsjg(new jrbgnlbqoe(h.bfopjjpdmp.zoijcleaow(((ForegroundColorSpan) obj).getForegroundColor()), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65534, null), i13, i14);
            return;
        }
        if (obj instanceof RelativeSizeSpan) {
            zoijcleaowVar.eablkybsjg(new jrbgnlbqoe(0L, w0.iwizpuwonk.eablkybsjg(((RelativeSizeSpan) obj).getSizeChange()), null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65533, null), i13, i14);
            return;
        }
        if (obj instanceof StrikethroughSpan) {
            zoijcleaowVar.eablkybsjg(new jrbgnlbqoe(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, v0.gtknphoqwx.f114956zoijcleaow.zoijcleaow(), null, null, null, 61439, null), i13, i14);
            return;
        }
        if (obj instanceof StyleSpan) {
            jrbgnlbqoe jrbgnlbqoeVarNufgyqmvbu = nufgyqmvbu((StyleSpan) obj);
            if (jrbgnlbqoeVarNufgyqmvbu != null) {
                zoijcleaowVar.eablkybsjg(jrbgnlbqoeVarNufgyqmvbu, i13, i14);
                return;
            }
            return;
        }
        if (obj instanceof SubscriptSpan) {
            zoijcleaowVar.eablkybsjg(new jrbgnlbqoe(0L, 0L, null, null, null, null, null, 0L, v0.iobyxmoadg.wkgbmnqykc(v0.iobyxmoadg.f114982zoijcleaow.zoijcleaow()), null, null, 0L, null, null, null, null, 65279, null), i13, i14);
            return;
        }
        if (obj instanceof SuperscriptSpan) {
            zoijcleaowVar.eablkybsjg(new jrbgnlbqoe(0L, 0L, null, null, null, null, null, 0L, v0.iobyxmoadg.wkgbmnqykc(v0.iobyxmoadg.f114982zoijcleaow.ppxfxbqfkf()), null, null, 0L, null, null, null, null, 65279, null), i13, i14);
            return;
        }
        if (obj instanceof TypefaceSpan) {
            zoijcleaowVar.eablkybsjg(dxjokdxxww((TypefaceSpan) obj), i13, i14);
            return;
        }
        if (obj instanceof UnderlineSpan) {
            zoijcleaowVar.eablkybsjg(new jrbgnlbqoe(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, v0.gtknphoqwx.f114956zoijcleaow.wkgbmnqykc(), null, null, null, 61439, null), i13, i14);
        } else {
            if (!(obj instanceof URLSpan) || (url = ((URLSpan) obj).getURL()) == null) {
                return;
            }
            zoijcleaowVar.zoijcleaow(new vdvldrhtss.zoijcleaow(url, gVar, oxmwwwfdhmVar), i13, i14);
        }
    }

    private static final ylkuphrtab lqeggnwhkg(AlignmentSpan alignmentSpan) {
        int iGxszxtbevo;
        Layout.Alignment alignment = alignmentSpan.getAlignment();
        int i13 = alignment == null ? -1 : zoijcleaow.f50311iobyxmoadg[alignment.ordinal()];
        if (i13 == 1) {
            iGxszxtbevo = v0.btonecajqb.f114934zoijcleaow.gxszxtbevo();
        } else if (i13 != 2) {
            iGxszxtbevo = i13 != 3 ? v0.btonecajqb.f114934zoijcleaow.lqeggnwhkg() : v0.btonecajqb.f114934zoijcleaow.zoijcleaow();
        } else {
            iGxszxtbevo = v0.btonecajqb.f114934zoijcleaow.iobyxmoadg();
        }
        return new ylkuphrtab(iGxszxtbevo, 0, 0L, null, null, null, 0, 0, null, 510, null);
    }

    private static final jrbgnlbqoe nufgyqmvbu(StyleSpan styleSpan) {
        int style = styleSpan.getStyle();
        if (style == 1) {
            return new jrbgnlbqoe(0L, 0L, n0.yadqdtsiqt.f68367yggfygwlhe.iobyxmoadg(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65531, null);
        }
        if (style == 2) {
            return new jrbgnlbqoe(0L, 0L, null, n0.lereixgezr.ppxfxbqfkf(n0.lereixgezr.f68283zoijcleaow.iobyxmoadg()), null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65527, null);
        }
        if (style != 3) {
            return null;
        }
        return new jrbgnlbqoe(0L, 0L, n0.yadqdtsiqt.f68367yggfygwlhe.iobyxmoadg(), n0.lereixgezr.ppxfxbqfkf(n0.lereixgezr.f68283zoijcleaow.iobyxmoadg()), null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65523, null);
    }

    public static final eablkybsjg ppxfxbqfkf(eablkybsjg.ppxfxbqfkf ppxfxbqfkfVar, String str, g gVar, oxmwwwfdhm oxmwwwfdhmVar) {
        return gxszxtbevo(t1.zoijcleaow.iobyxmoadg("<ContentHandlerReplacementTag />" + str, 63, null, f50310iobyxmoadg), gVar, oxmwwwfdhmVar);
    }

    public static /* synthetic */ eablkybsjg wkgbmnqykc(eablkybsjg.ppxfxbqfkf ppxfxbqfkfVar, String str, g gVar, oxmwwwfdhm oxmwwwfdhmVar, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            gVar = null;
        }
        if ((i13 & 4) != 0) {
            oxmwwwfdhmVar = null;
        }
        return ppxfxbqfkf(ppxfxbqfkfVar, str, gVar, oxmwwwfdhmVar);
    }

    private static final void zoijcleaow(eablkybsjg.zoijcleaow zoijcleaowVar, Spanned spanned, g gVar, oxmwwwfdhm oxmwwwfdhmVar) {
        for (Object obj : spanned.getSpans(0, zoijcleaowVar.wflxmlrfwp(), Object.class)) {
            long jZoijcleaow = m.zoijcleaow(spanned.getSpanStart(obj), spanned.getSpanEnd(obj));
            iobyxmoadg(zoijcleaowVar, obj, l.agtfadlqog(jZoijcleaow), l.dxjokdxxww(jZoijcleaow), gVar, oxmwwwfdhmVar);
        }
    }
}
