package t0;

import android.os.LocaleList;
import android.text.style.LocaleSpan;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import s0.dxjokdxxww;

/* JADX INFO: loaded from: classes.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final iobyxmoadg f109212iobyxmoadg = new iobyxmoadg();

    private iobyxmoadg() {
    }

    public final Object iobyxmoadg(r0.eablkybsjg eablkybsjgVar) {
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(eablkybsjgVar, 10));
        Iterator<E> it = eablkybsjgVar.iterator();
        while (it.hasNext()) {
            arrayList.add(((r0.wkgbmnqykc) it.next()).iobyxmoadg());
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        return new LocaleSpan(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
    }

    public final void zoijcleaow(dxjokdxxww dxjokdxxwwVar, r0.eablkybsjg eablkybsjgVar) {
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(eablkybsjgVar, 10));
        Iterator<E> it = eablkybsjgVar.iterator();
        while (it.hasNext()) {
            arrayList.add(((r0.wkgbmnqykc) it.next()).iobyxmoadg());
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        dxjokdxxwwVar.setTextLocales(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
    }
}
