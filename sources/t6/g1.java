package t6;

import android.content.Context;
import android.os.Build;

/* JADX INFO: loaded from: classes2.dex */
public abstract class g1 {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final lrnfpwlwnk f109813iobyxmoadg = new lrnfpwlwnk();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final opjhrmiecq f109814zoijcleaow = new g0();

    static tzroggbefp iobyxmoadg(Context context) {
        return new jlmebxxoox(context);
    }

    static n1 ppxfxbqfkf(Context context, int i13) {
        return Build.VERSION.SDK_INT >= 29 ? new eablkybsjg(context, i13, f109813iobyxmoadg, f109814zoijcleaow) : new nufgyqmvbu(context, i13, f109813iobyxmoadg, f109814zoijcleaow);
    }

    public static yadqdtsiqt zoijcleaow(Context context) {
        return new c1(context);
    }
}
