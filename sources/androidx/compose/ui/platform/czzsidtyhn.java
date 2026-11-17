package androidx.compose.ui.platform;

import android.app.Activity;
import android.content.res.Configuration;
import android.graphics.Rect;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
final class czzsidtyhn implements xrmfcynszj {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public static final czzsidtyhn f6845zoijcleaow = new czzsidtyhn();

    private czzsidtyhn() {
    }

    @Override // androidx.compose.ui.platform.xrmfcynszj
    public Rect iobyxmoadg(Activity activity) throws Exception {
        Configuration configuration = activity.getResources().getConfiguration();
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            Object objInvoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
            kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(objInvoke, "null cannot be cast to non-null type android.graphics.Rect");
            return new Rect((Rect) objInvoke);
        } catch (Exception e13) {
            if ((e13 instanceof NoSuchFieldException) || (e13 instanceof NoSuchMethodException) || (e13 instanceof IllegalAccessException) || (e13 instanceof InvocationTargetException)) {
                return rlfsiqarku.f7042zoijcleaow.iobyxmoadg(activity);
            }
            throw e13;
        }
    }
}
