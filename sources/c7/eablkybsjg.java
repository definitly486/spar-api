package c7;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import e7.draadjrbmk;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes2.dex */
public final class eablkybsjg implements wkgbmnqykc {
    private final boolean zoijcleaow(int i13, Context context) {
        try {
            return context.getResources().getResourceEntryName(i13) != null;
        } catch (Resources.NotFoundException unused) {
            return false;
        }
    }

    @Override // c7.wkgbmnqykc
    public /* bridge */ /* synthetic */ Object iobyxmoadg(Object obj, draadjrbmk draadjrbmkVar) {
        return ppxfxbqfkf(((Number) obj).intValue(), draadjrbmkVar);
    }

    public Uri ppxfxbqfkf(int i13, draadjrbmk draadjrbmkVar) {
        if (!zoijcleaow(i13, draadjrbmkVar.lqeggnwhkg())) {
            return null;
        }
        Uri uri = Uri.parse("android.resource://" + draadjrbmkVar.lqeggnwhkg().getPackageName() + '/' + i13);
        zdlpuopuiu.dxjokdxxww(uri, "parse(this)");
        return uri;
    }
}
