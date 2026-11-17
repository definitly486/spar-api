package b7;

import android.net.Uri;
import e7.draadjrbmk;
import i7.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes2.dex */
public final class ppxfxbqfkf implements zoijcleaow {
    @Override // b7.zoijcleaow
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public String iobyxmoadg(Uri uri, draadjrbmk draadjrbmkVar) {
        if (!zdlpuopuiu.eablkybsjg(uri.getScheme(), "android.resource")) {
            return uri.toString();
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(uri);
        sb3.append('-');
        sb3.append(gtknphoqwx.gtknphoqwx(draadjrbmkVar.lqeggnwhkg().getResources().getConfiguration()));
        return sb3.toString();
    }
}
