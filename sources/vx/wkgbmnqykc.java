package vx;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import androidx.fragment.app.Fragment;
import java.util.Iterator;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public abstract class wkgbmnqykc extends androidx.appcompat.app.wkgbmnqykc {
    @Override // androidx.appcompat.app.wkgbmnqykc, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    protected void attachBaseContext(Context base) {
        zdlpuopuiu.btonecajqb(base, "base");
        Configuration configuration = new Configuration(base.getResources().getConfiguration());
        if (Float.compare(configuration.fontScale, 1.0f) == 0) {
            super.attachBaseContext(base);
        } else {
            configuration.fontScale = 1.0f;
            super.attachBaseContext(base.createConfigurationContext(configuration));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        View currentFocus;
        if (!(qs.iobyxmoadg.zoijcleaow(this) instanceof ss.zoijcleaow) && motionEvent != null && motionEvent.getAction() == 1 && (currentFocus = getCurrentFocus()) != null) {
            int[] iArr = new int[2];
            currentFocus.getLocationOnScreen(iArr);
            if (!new Rect(currentFocus.getLeft(), currentFocus.getTop(), currentFocus.getRight(), currentFocus.getBottom()).contains((int) ((motionEvent.getRawX() + currentFocus.getLeft()) - iArr[0]), (int) ((motionEvent.getRawY() + currentFocus.getTop()) - iArr[1]))) {
                qs.iobyxmoadg.iobyxmoadg(this, currentFocus);
                return super.dispatchTouchEvent(motionEvent);
            }
            Rect rect = new Rect();
            currentFocus.getFocusedRect(rect);
            rect.offset(iArr[0], iArr[1]);
            if (!rect.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
                qs.iobyxmoadg.iobyxmoadg(this, currentFocus);
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // androidx.fragment.app.oxmwwwfdhm, androidx.activity.nufgyqmvbu, android.app.Activity
    protected void onActivityResult(int i13, int i14, Intent intent) {
        super.onActivityResult(i13, i14, intent);
        Iterator it = getSupportFragmentManager().igdgnonuha().iterator();
        while (it.hasNext()) {
            ((Fragment) it.next()).onActivityResult(i13, i14, intent);
        }
    }
}
