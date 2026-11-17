package iwxlajgraz;

import android.os.LocaleList;
import android.view.inputmethod.EditorInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class mhtqkkgtqm {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final mhtqkkgtqm f49901iobyxmoadg = new mhtqkkgtqm();

    private mhtqkkgtqm() {
    }

    public final void iobyxmoadg(EditorInfo editorInfo, r0.eablkybsjg eablkybsjgVar) {
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(eablkybsjgVar, r0.eablkybsjg.f81327jyumaefscl.zoijcleaow())) {
            editorInfo.hintLocales = null;
            return;
        }
        ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(eablkybsjgVar, 10));
        Iterator<E> it = eablkybsjgVar.iterator();
        while (it.hasNext()) {
            arrayList.add(((r0.wkgbmnqykc) it.next()).iobyxmoadg());
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        editorInfo.hintLocales = new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length));
    }
}
