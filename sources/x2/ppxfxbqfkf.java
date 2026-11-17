package x2;

import android.os.Bundle;
import android.text.Spannable;
import android.text.Spanned;
import java.util.ArrayList;
import y2.stevsuqkhv;

/* JADX INFO: loaded from: classes.dex */
abstract class ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final String f120996iobyxmoadg = stevsuqkhv.uawqvzlxes(0);

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final String f120999zoijcleaow = stevsuqkhv.uawqvzlxes(1);

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final String f120997ppxfxbqfkf = stevsuqkhv.uawqvzlxes(2);

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final String f120998wkgbmnqykc = stevsuqkhv.uawqvzlxes(3);

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private static final String f120995eablkybsjg = stevsuqkhv.uawqvzlxes(4);

    public static ArrayList iobyxmoadg(Spanned spanned) {
        ArrayList arrayList = new ArrayList();
        for (gxszxtbevo gxszxtbevoVar : (gxszxtbevo[]) spanned.getSpans(0, spanned.length(), gxszxtbevo.class)) {
            arrayList.add(zoijcleaow(spanned, gxszxtbevoVar, 1, gxszxtbevoVar.zoijcleaow()));
        }
        for (nufgyqmvbu nufgyqmvbuVar : (nufgyqmvbu[]) spanned.getSpans(0, spanned.length(), nufgyqmvbu.class)) {
            arrayList.add(zoijcleaow(spanned, nufgyqmvbuVar, 2, nufgyqmvbuVar.zoijcleaow()));
        }
        for (wkgbmnqykc wkgbmnqykcVar : (wkgbmnqykc[]) spanned.getSpans(0, spanned.length(), wkgbmnqykc.class)) {
            arrayList.add(zoijcleaow(spanned, wkgbmnqykcVar, 3, null));
        }
        for (dxjokdxxww dxjokdxxwwVar : (dxjokdxxww[]) spanned.getSpans(0, spanned.length(), dxjokdxxww.class)) {
            arrayList.add(zoijcleaow(spanned, dxjokdxxwwVar, 4, dxjokdxxwwVar.zoijcleaow()));
        }
        return arrayList;
    }

    public static void ppxfxbqfkf(Bundle bundle, Spannable spannable) {
        int i13 = bundle.getInt(f120996iobyxmoadg);
        int i14 = bundle.getInt(f120999zoijcleaow);
        int i15 = bundle.getInt(f120997ppxfxbqfkf);
        int i16 = bundle.getInt(f120998wkgbmnqykc, -1);
        Bundle bundle2 = bundle.getBundle(f120995eablkybsjg);
        if (i16 == 1) {
            spannable.setSpan(gxszxtbevo.iobyxmoadg((Bundle) y2.iobyxmoadg.eablkybsjg(bundle2)), i13, i14, i15);
            return;
        }
        if (i16 == 2) {
            spannable.setSpan(nufgyqmvbu.iobyxmoadg((Bundle) y2.iobyxmoadg.eablkybsjg(bundle2)), i13, i14, i15);
        } else if (i16 == 3) {
            spannable.setSpan(new wkgbmnqykc(), i13, i14, i15);
        } else {
            if (i16 != 4) {
                return;
            }
            spannable.setSpan(dxjokdxxww.iobyxmoadg((Bundle) y2.iobyxmoadg.eablkybsjg(bundle2)), i13, i14, i15);
        }
    }

    private static Bundle zoijcleaow(Spanned spanned, Object obj, int i13, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putInt(f120996iobyxmoadg, spanned.getSpanStart(obj));
        bundle2.putInt(f120999zoijcleaow, spanned.getSpanEnd(obj));
        bundle2.putInt(f120997ppxfxbqfkf, spanned.getSpanFlags(obj));
        bundle2.putInt(f120998wkgbmnqykc, i13);
        if (bundle != null) {
            bundle2.putBundle(f120995eablkybsjg, bundle);
        }
        return bundle2;
    }
}
