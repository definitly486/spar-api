package qf0;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import ru.myspar.core.navigation.model.NavigationPayload;
import ru.myspar.main_activity.impl.MainActivity;

/* JADX INFO: loaded from: classes4.dex */
public final class kcexrzcfyt implements of0.zoijcleaow {
    @Override // of0.zoijcleaow
    public Intent iobyxmoadg(Context context, NavigationPayload navigationPayload) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(context, "context");
        Intent intent = new Intent(context, (Class<?>) MainActivity.class);
        if (navigationPayload != null) {
            intent.putExtra("payload", navigationPayload);
        }
        return intent;
    }

    @Override // of0.zoijcleaow
    public boolean zoijcleaow(Activity activity) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(activity, "activity");
        return activity instanceof MainActivity;
    }
}
