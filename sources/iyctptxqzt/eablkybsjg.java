package iyctptxqzt;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import gg.wwaezpbzkn;
import ikoacuggdj.esjtqupxsv;
import j0.l;
import java.util.List;
import lrnfpwlwnk.lqeggnwhkg;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes.dex */
public abstract class eablkybsjg {
    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn ppxfxbqfkf(Context context, ResolveInfo resolveInfo, boolean z13, CharSequence charSequence, long j13, lqeggnwhkg lqeggnwhkgVar) {
        ppxfxbqfkf.f50037iobyxmoadg.eablkybsjg().invoke(context, resolveInfo, Boolean.valueOf(z13), charSequence, l.zoijcleaow(j13));
        lqeggnwhkgVar.close();
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final void zoijcleaow(weqkydbzbr.iobyxmoadg iobyxmoadgVar, final Context context, final boolean z13, final CharSequence charSequence, final long j13) {
        if (!esjtqupxsv.f44789eablkybsjg || l.nufgyqmvbu(j13) || charSequence.length() == 0) {
            return;
        }
        PackageManager packageManager = context.getPackageManager();
        List listBtonecajqb = ppxfxbqfkf.f50037iobyxmoadg.btonecajqb(context);
        if (listBtonecajqb.isEmpty()) {
            return;
        }
        iobyxmoadgVar.wkgbmnqykc();
        int size = listBtonecajqb.size();
        for (int i13 = 0; i13 < size; i13++) {
            final ResolveInfo resolveInfo = (ResolveInfo) listBtonecajqb.get(i13);
            weqkydbzbr.ppxfxbqfkf.zoijcleaow(iobyxmoadgVar, new lrnfpwlwnk.iobyxmoadg(i13), resolveInfo.loadLabel(packageManager).toString(), 0, new draadjrbmk() { // from class: iyctptxqzt.wkgbmnqykc
                @Override // tg.draadjrbmk
                public final Object invoke(Object obj) {
                    return eablkybsjg.ppxfxbqfkf(context, resolveInfo, z13, charSequence, j13, (lqeggnwhkg) obj);
                }
            }, 4, null);
        }
        iobyxmoadgVar.wkgbmnqykc();
    }
}
