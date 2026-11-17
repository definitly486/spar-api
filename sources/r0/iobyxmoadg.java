package r0;

import android.os.LocaleList;
import android.util.Log;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.jvm.internal.zdlpuopuiu;
import s0.yggfygwlhe;

/* JADX INFO: loaded from: classes.dex */
public final class iobyxmoadg implements gxszxtbevo {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private LocaleList f81330iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final yggfygwlhe f81331ppxfxbqfkf = new yggfygwlhe();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private eablkybsjg f81332zoijcleaow;

    @Override // r0.gxszxtbevo
    public eablkybsjg iobyxmoadg() {
        LocaleList localeList = LocaleList.getDefault();
        synchronized (this.f81331ppxfxbqfkf) {
            eablkybsjg eablkybsjgVar = this.f81332zoijcleaow;
            if (eablkybsjgVar != null && localeList == this.f81330iobyxmoadg) {
                return eablkybsjgVar;
            }
            int size = localeList.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i13 = 0; i13 < size; i13++) {
                arrayList.add(new wkgbmnqykc(localeList.get(i13)));
            }
            eablkybsjg eablkybsjgVar2 = new eablkybsjg(arrayList);
            this.f81330iobyxmoadg = localeList;
            this.f81332zoijcleaow = eablkybsjgVar2;
            return eablkybsjgVar2;
        }
    }

    @Override // r0.gxszxtbevo
    public Locale zoijcleaow(String str) {
        Locale localeForLanguageTag = Locale.forLanguageTag(str);
        if (zdlpuopuiu.eablkybsjg(localeForLanguageTag.toLanguageTag(), "und")) {
            Log.e(zoijcleaow.f81336iobyxmoadg, "The language tag " + str + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
        }
        return localeForLanguageTag;
    }
}
