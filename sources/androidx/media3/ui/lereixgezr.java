package androidx.media3.ui;

import android.text.Html;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.SparseArray;
import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import y2.stevsuqkhv;

/* JADX INFO: loaded from: classes.dex */
abstract class lereixgezr {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final Pattern f11883iobyxmoadg = Pattern.compile("(&#13;)?&#10;");

    /* JADX INFO: Access modifiers changed from: private */
    static final class ppxfxbqfkf {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private static final Comparator f11884eablkybsjg = new Comparator() { // from class: androidx.media3.ui.pmvmpeiblj
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return lereixgezr.ppxfxbqfkf.eablkybsjg((lereixgezr.ppxfxbqfkf) obj, (lereixgezr.ppxfxbqfkf) obj2);
            }
        };

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private static final Comparator f11885gxszxtbevo = new Comparator() { // from class: androidx.media3.ui.zynmafqrjb
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return lereixgezr.ppxfxbqfkf.gxszxtbevo((lereixgezr.ppxfxbqfkf) obj, (lereixgezr.ppxfxbqfkf) obj2);
            }
        };

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public final int f11886iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public final String f11887ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        public final String f11888wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public final int f11889zoijcleaow;

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ int eablkybsjg(ppxfxbqfkf ppxfxbqfkfVar, ppxfxbqfkf ppxfxbqfkfVar2) {
            int iCompare = Integer.compare(ppxfxbqfkfVar2.f11889zoijcleaow, ppxfxbqfkfVar.f11889zoijcleaow);
            if (iCompare != 0) {
                return iCompare;
            }
            int iCompareTo = ppxfxbqfkfVar.f11887ppxfxbqfkf.compareTo(ppxfxbqfkfVar2.f11887ppxfxbqfkf);
            return iCompareTo != 0 ? iCompareTo : ppxfxbqfkfVar.f11888wkgbmnqykc.compareTo(ppxfxbqfkfVar2.f11888wkgbmnqykc);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ int gxszxtbevo(ppxfxbqfkf ppxfxbqfkfVar, ppxfxbqfkf ppxfxbqfkfVar2) {
            int iCompare = Integer.compare(ppxfxbqfkfVar2.f11886iobyxmoadg, ppxfxbqfkfVar.f11886iobyxmoadg);
            if (iCompare != 0) {
                return iCompare;
            }
            int iCompareTo = ppxfxbqfkfVar2.f11887ppxfxbqfkf.compareTo(ppxfxbqfkfVar.f11887ppxfxbqfkf);
            return iCompareTo != 0 ? iCompareTo : ppxfxbqfkfVar2.f11888wkgbmnqykc.compareTo(ppxfxbqfkfVar.f11888wkgbmnqykc);
        }

        private ppxfxbqfkf(int i13, int i14, String str, String str2) {
            this.f11886iobyxmoadg = i13;
            this.f11889zoijcleaow = i14;
            this.f11887ppxfxbqfkf = str;
            this.f11888wkgbmnqykc = str2;
        }
    }

    private static final class wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final List f11890iobyxmoadg = new ArrayList();

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final List f11891zoijcleaow = new ArrayList();
    }

    public static class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public final String f11892iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public final Map f11893zoijcleaow;

        private zoijcleaow(String str, Map map) {
            this.f11892iobyxmoadg = str;
            this.f11893zoijcleaow = map;
        }
    }

    private static String eablkybsjg(Object obj, float f13) {
        if (obj instanceof StrikethroughSpan) {
            return "<span style='text-decoration:line-through;'>";
        }
        if (obj instanceof ForegroundColorSpan) {
            return stevsuqkhv.iozdgvuglv("<span style='color:%s;'>", androidx.media3.ui.ppxfxbqfkf.zoijcleaow(((ForegroundColorSpan) obj).getForegroundColor()));
        }
        if (obj instanceof BackgroundColorSpan) {
            return stevsuqkhv.iozdgvuglv("<span class='bg_%s'>", Integer.valueOf(((BackgroundColorSpan) obj).getBackgroundColor()));
        }
        if (obj instanceof x2.wkgbmnqykc) {
            return "<span style='text-combine-upright:all;'>";
        }
        if (obj instanceof AbsoluteSizeSpan) {
            AbsoluteSizeSpan absoluteSizeSpan = (AbsoluteSizeSpan) obj;
            return stevsuqkhv.iozdgvuglv("<span style='font-size:%.2fpx;'>", Float.valueOf(absoluteSizeSpan.getDip() ? absoluteSizeSpan.getSize() : absoluteSizeSpan.getSize() / f13));
        }
        if (obj instanceof RelativeSizeSpan) {
            return stevsuqkhv.iozdgvuglv("<span style='font-size:%.2f%%;'>", Float.valueOf(((RelativeSizeSpan) obj).getSizeChange() * 100.0f));
        }
        if (obj instanceof TypefaceSpan) {
            String family = ((TypefaceSpan) obj).getFamily();
            if (family != null) {
                return stevsuqkhv.iozdgvuglv("<span style='font-family:\"%s\";'>", family);
            }
            return null;
        }
        if (obj instanceof StyleSpan) {
            int style = ((StyleSpan) obj).getStyle();
            if (style == 1) {
                return "<b>";
            }
            if (style == 2) {
                return "<i>";
            }
            if (style != 3) {
                return null;
            }
            return "<b><i>";
        }
        if (!(obj instanceof x2.gxszxtbevo)) {
            if (obj instanceof UnderlineSpan) {
                return "<u>";
            }
            if (!(obj instanceof x2.nufgyqmvbu)) {
                return null;
            }
            x2.nufgyqmvbu nufgyqmvbuVar = (x2.nufgyqmvbu) obj;
            return stevsuqkhv.iozdgvuglv("<span style='-webkit-text-emphasis-style:%1$s;text-emphasis-style:%1$s;-webkit-text-emphasis-position:%2$s;text-emphasis-position:%2$s;display:inline-block;'>", nufgyqmvbu(nufgyqmvbuVar.f120992iobyxmoadg, nufgyqmvbuVar.f120994zoijcleaow), lqeggnwhkg(nufgyqmvbuVar.f120993ppxfxbqfkf));
        }
        int i13 = ((x2.gxszxtbevo) obj).f120934zoijcleaow;
        if (i13 == -1) {
            return "<ruby style='ruby-position:unset;'>";
        }
        if (i13 == 1) {
            return "<ruby style='ruby-position:over;'>";
        }
        if (i13 != 2) {
            return null;
        }
        return "<ruby style='ruby-position:under;'>";
    }

    private static wkgbmnqykc gxszxtbevo(SparseArray sparseArray, int i13) {
        wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) sparseArray.get(i13);
        if (wkgbmnqykcVar != null) {
            return wkgbmnqykcVar;
        }
        wkgbmnqykc wkgbmnqykcVar2 = new wkgbmnqykc();
        sparseArray.put(i13, wkgbmnqykcVar2);
        return wkgbmnqykcVar2;
    }

    public static zoijcleaow iobyxmoadg(CharSequence charSequence, float f13) {
        if (charSequence == null) {
            return new zoijcleaow("", com.google.common.collect.yggfygwlhe.kcexrzcfyt());
        }
        if (!(charSequence instanceof Spanned)) {
            return new zoijcleaow(zoijcleaow(charSequence), com.google.common.collect.yggfygwlhe.kcexrzcfyt());
        }
        Spanned spanned = (Spanned) charSequence;
        HashSet hashSet = new HashSet();
        int i13 = 0;
        for (BackgroundColorSpan backgroundColorSpan : (BackgroundColorSpan[]) spanned.getSpans(0, spanned.length(), BackgroundColorSpan.class)) {
            hashSet.add(Integer.valueOf(backgroundColorSpan.getBackgroundColor()));
        }
        HashMap map = new HashMap();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Integer) it.next()).intValue();
            map.put(androidx.media3.ui.ppxfxbqfkf.iobyxmoadg("bg_" + iIntValue), stevsuqkhv.iozdgvuglv("background-color:%s;", androidx.media3.ui.ppxfxbqfkf.zoijcleaow(iIntValue)));
        }
        SparseArray sparseArrayPpxfxbqfkf = ppxfxbqfkf(spanned, f13);
        StringBuilder sb3 = new StringBuilder(spanned.length());
        int i14 = 0;
        while (i13 < sparseArrayPpxfxbqfkf.size()) {
            int iKeyAt = sparseArrayPpxfxbqfkf.keyAt(i13);
            sb3.append(zoijcleaow(spanned.subSequence(i14, iKeyAt)));
            wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) sparseArrayPpxfxbqfkf.get(iKeyAt);
            Collections.sort(wkgbmnqykcVar.f11891zoijcleaow, ppxfxbqfkf.f11885gxszxtbevo);
            Iterator it2 = wkgbmnqykcVar.f11891zoijcleaow.iterator();
            while (it2.hasNext()) {
                sb3.append(((ppxfxbqfkf) it2.next()).f11888wkgbmnqykc);
            }
            Collections.sort(wkgbmnqykcVar.f11890iobyxmoadg, ppxfxbqfkf.f11884eablkybsjg);
            Iterator it3 = wkgbmnqykcVar.f11890iobyxmoadg.iterator();
            while (it3.hasNext()) {
                sb3.append(((ppxfxbqfkf) it3.next()).f11887ppxfxbqfkf);
            }
            i13++;
            i14 = iKeyAt;
        }
        sb3.append(zoijcleaow(spanned.subSequence(i14, spanned.length())));
        return new zoijcleaow(sb3.toString(), map);
    }

    private static String lqeggnwhkg(int i13) {
        return i13 != 2 ? "over right" : "under left";
    }

    private static String nufgyqmvbu(int i13, int i14) {
        StringBuilder sb3 = new StringBuilder();
        if (i14 == 1) {
            sb3.append("filled ");
        } else if (i14 == 2) {
            sb3.append("open ");
        }
        if (i13 == 0) {
            sb3.append(DevicePublicKeyStringDef.NONE);
        } else if (i13 == 1) {
            sb3.append("circle");
        } else if (i13 == 2) {
            sb3.append("dot");
        } else if (i13 != 3) {
            sb3.append("unset");
        } else {
            sb3.append("sesame");
        }
        return sb3.toString();
    }

    private static SparseArray ppxfxbqfkf(Spanned spanned, float f13) {
        SparseArray sparseArray = new SparseArray();
        for (Object obj : spanned.getSpans(0, spanned.length(), Object.class)) {
            String strEablkybsjg = eablkybsjg(obj, f13);
            String strWkgbmnqykc = wkgbmnqykc(obj);
            int spanStart = spanned.getSpanStart(obj);
            int spanEnd = spanned.getSpanEnd(obj);
            if (strEablkybsjg != null) {
                y2.iobyxmoadg.eablkybsjg(strWkgbmnqykc);
                ppxfxbqfkf ppxfxbqfkfVar = new ppxfxbqfkf(spanStart, spanEnd, strEablkybsjg, strWkgbmnqykc);
                gxszxtbevo(sparseArray, spanStart).f11890iobyxmoadg.add(ppxfxbqfkfVar);
                gxszxtbevo(sparseArray, spanEnd).f11891zoijcleaow.add(ppxfxbqfkfVar);
            }
        }
        return sparseArray;
    }

    private static String wkgbmnqykc(Object obj) {
        if ((obj instanceof StrikethroughSpan) || (obj instanceof ForegroundColorSpan) || (obj instanceof BackgroundColorSpan) || (obj instanceof x2.wkgbmnqykc) || (obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan) || (obj instanceof x2.nufgyqmvbu)) {
            return "</span>";
        }
        if (obj instanceof TypefaceSpan) {
            if (((TypefaceSpan) obj).getFamily() != null) {
                return "</span>";
            }
            return null;
        }
        if (obj instanceof StyleSpan) {
            int style = ((StyleSpan) obj).getStyle();
            if (style == 1) {
                return "</b>";
            }
            if (style == 2) {
                return "</i>";
            }
            if (style == 3) {
                return "</i></b>";
            }
        } else {
            if (obj instanceof x2.gxszxtbevo) {
                return "<rt>" + zoijcleaow(((x2.gxszxtbevo) obj).f120933iobyxmoadg) + "</rt></ruby>";
            }
            if (obj instanceof UnderlineSpan) {
                return "</u>";
            }
        }
        return null;
    }

    private static String zoijcleaow(CharSequence charSequence) {
        return f11883iobyxmoadg.matcher(Html.escapeHtml(charSequence)).replaceAll("<br>");
    }
}
