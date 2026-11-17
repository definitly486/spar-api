package iyctptxqzt;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import gg.wwaezpbzkn;
import j0.l;
import java.util.ArrayList;
import java.util.List;
import tg.draadjrbmk;
import tg.kcexrzcfyt;

/* JADX INFO: loaded from: classes.dex */
public final class ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final ppxfxbqfkf f50037iobyxmoadg = new ppxfxbqfkf();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static draadjrbmk f50040zoijcleaow = new draadjrbmk() { // from class: iyctptxqzt.iobyxmoadg
        @Override // tg.draadjrbmk
        public final Object invoke(Object obj) {
            return ppxfxbqfkf.dxjokdxxww((Context) obj);
        }
    };

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static kcexrzcfyt f50038ppxfxbqfkf = new kcexrzcfyt() { // from class: iyctptxqzt.zoijcleaow
        @Override // tg.kcexrzcfyt
        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
            return ppxfxbqfkf.nufgyqmvbu((Context) obj, (ResolveInfo) obj2, ((Boolean) obj3).booleanValue(), (CharSequence) obj4, (l) obj5);
        }
    };

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public static final int f50039wkgbmnqykc = 8;

    private ppxfxbqfkf() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List dxjokdxxww(Context context) {
        List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(f50037iobyxmoadg.ppxfxbqfkf(), 0);
        ArrayList arrayList = new ArrayList(listQueryIntentActivities.size());
        int size = listQueryIntentActivities.size();
        for (int i13 = 0; i13 < size; i13++) {
            ResolveInfo resolveInfo = listQueryIntentActivities.get(i13);
            if (f50037iobyxmoadg.lqeggnwhkg(resolveInfo, context)) {
                arrayList.add(resolveInfo);
            }
        }
        return arrayList;
    }

    private final boolean gxszxtbevo(ActivityInfo activityInfo, Context context) {
        String str;
        return activityInfo.exported && ((str = activityInfo.permission) == null || context.checkSelfPermission(str) == 0);
    }

    private final boolean lqeggnwhkg(ResolveInfo resolveInfo, Context context) {
        return context.getPackageName().equals(resolveInfo.activityInfo.packageName) || gxszxtbevo(resolveInfo.activityInfo, context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn nufgyqmvbu(Context context, ResolveInfo resolveInfo, boolean z13, CharSequence charSequence, l lVar) {
        String string = charSequence.subSequence(l.draadjrbmk(lVar.oxmwwwfdhm()), l.gtknphoqwx(lVar.oxmwwwfdhm())).toString();
        Intent intentWkgbmnqykc = f50037iobyxmoadg.wkgbmnqykc(resolveInfo, z13);
        intentWkgbmnqykc.putExtra("android.intent.extra.PROCESS_TEXT", string);
        context.startActivity(intentWkgbmnqykc);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final Intent ppxfxbqfkf() {
        return new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
    }

    public final List btonecajqb(Context context) {
        return (List) f50040zoijcleaow.invoke(context);
    }

    public final kcexrzcfyt eablkybsjg() {
        return f50038ppxfxbqfkf;
    }

    public final Intent wkgbmnqykc(ResolveInfo resolveInfo, boolean z13) {
        Intent intentPutExtra = ppxfxbqfkf().putExtra("android.intent.extra.PROCESS_TEXT_READONLY", z13);
        ActivityInfo activityInfo = resolveInfo.activityInfo;
        return intentPutExtra.setClassName(activityInfo.packageName, activityInfo.name);
    }
}
