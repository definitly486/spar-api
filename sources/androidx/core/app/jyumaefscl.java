package androidx.core.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class jyumaefscl implements Iterable {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final Context f8360yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final ArrayList f8361zdlpuopuiu = new ArrayList();

    public interface iobyxmoadg {
        Intent getSupportParentActivityIntent();
    }

    private jyumaefscl(Context context) {
        this.f8360yggfygwlhe = context;
    }

    public static jyumaefscl eablkybsjg(Context context) {
        return new jyumaefscl(context);
    }

    public void dxjokdxxww(Bundle bundle) {
        if (this.f8361zdlpuopuiu.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) this.f8361zdlpuopuiu.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        if (androidx.core.content.iobyxmoadg.startActivities(this.f8360yggfygwlhe, intentArr, bundle)) {
            return;
        }
        Intent intent = new Intent(intentArr[intentArr.length - 1]);
        intent.addFlags(268435456);
        this.f8360yggfygwlhe.startActivity(intent);
    }

    public void gxszxtbevo() {
        dxjokdxxww(null);
    }

    public jyumaefscl iobyxmoadg(Intent intent) {
        this.f8361zdlpuopuiu.add(intent);
        return this;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return this.f8361zdlpuopuiu.iterator();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public jyumaefscl ppxfxbqfkf(Activity activity) {
        Intent supportParentActivityIntent = activity instanceof iobyxmoadg ? ((iobyxmoadg) activity).getSupportParentActivityIntent() : null;
        if (supportParentActivityIntent == null) {
            supportParentActivityIntent = gtknphoqwx.iobyxmoadg(activity);
        }
        if (supportParentActivityIntent != null) {
            ComponentName component = supportParentActivityIntent.getComponent();
            if (component == null) {
                component = supportParentActivityIntent.resolveActivity(this.f8360yggfygwlhe.getPackageManager());
            }
            wkgbmnqykc(component);
            iobyxmoadg(supportParentActivityIntent);
        }
        return this;
    }

    public jyumaefscl wkgbmnqykc(ComponentName componentName) {
        int size = this.f8361zdlpuopuiu.size();
        try {
            Intent intentZoijcleaow = gtknphoqwx.zoijcleaow(this.f8360yggfygwlhe, componentName);
            while (intentZoijcleaow != null) {
                this.f8361zdlpuopuiu.add(size, intentZoijcleaow);
                intentZoijcleaow = gtknphoqwx.zoijcleaow(this.f8360yggfygwlhe, intentZoijcleaow.getComponent());
            }
            return this;
        } catch (PackageManager.NameNotFoundException e13) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e13);
        }
    }

    public jyumaefscl zoijcleaow(Intent intent) {
        ComponentName component = intent.getComponent();
        if (component == null) {
            component = intent.resolveActivity(this.f8360yggfygwlhe.getPackageManager());
        }
        if (component != null) {
            wkgbmnqykc(component);
        }
        iobyxmoadg(intent);
        return this;
    }
}
