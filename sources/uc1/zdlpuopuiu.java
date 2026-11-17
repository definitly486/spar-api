package uc1;

import android.content.Context;
import android.content.Intent;
import ru.myspar.proloyalty.core.navigation.model.NavigationPayload;
import ru.myspar.proloyalty.main_activity.impl.MainActivity;

/* JADX INFO: loaded from: classes5.dex */
public final class zdlpuopuiu implements sc1.zoijcleaow {
    @Override // sc1.zoijcleaow
    public Intent iobyxmoadg(Context context, NavigationPayload navigationPayload) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(context, "context");
        Intent intent = new Intent(context, (Class<?>) MainActivity.class);
        if (navigationPayload != null) {
            intent.putExtra("payload", navigationPayload);
        }
        return intent;
    }
}
