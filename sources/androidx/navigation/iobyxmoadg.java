package androidx.navigation;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import h5.rgvfuqvkyq;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;

/* JADX INFO: loaded from: classes2.dex */
@agtfadlqog.zoijcleaow("activity")
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0017\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001f B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ7\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006!"}, d2 = {"Landroidx/navigation/iobyxmoadg;", "Landroidx/navigation/agtfadlqog;", "Landroidx/navigation/iobyxmoadg$zoijcleaow;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "draadjrbmk", "()Landroidx/navigation/iobyxmoadg$zoijcleaow;", "", "gtknphoqwx", "()Z", "destination", "Landroid/os/Bundle;", "args", "Landroidx/navigation/gtknphoqwx;", "navOptions", "Landroidx/navigation/agtfadlqog$iobyxmoadg;", "navigatorExtras", "Landroidx/navigation/lqeggnwhkg;", "wflxmlrfwp", "(Landroidx/navigation/iobyxmoadg$zoijcleaow;Landroid/os/Bundle;Landroidx/navigation/gtknphoqwx;Landroidx/navigation/agtfadlqog$iobyxmoadg;)Landroidx/navigation/lqeggnwhkg;", "ppxfxbqfkf", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Landroid/app/Activity;", "wkgbmnqykc", "Landroid/app/Activity;", "hostActivity", "eablkybsjg", "iobyxmoadg", "zoijcleaow", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class iobyxmoadg extends agtfadlqog {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name and from kotlin metadata */
    private final Activity hostActivity;

    static final class ppxfxbqfkf extends jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final ppxfxbqfkf f12182zdlpuopuiu = new ppxfxbqfkf();

        ppxfxbqfkf() {
            super(1);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Context invoke(Context it) {
            zdlpuopuiu.btonecajqb(it, "it");
            if (it instanceof ContextWrapper) {
                return ((ContextWrapper) it).getBaseContext();
            }
            return null;
        }
    }

    public static class zoijcleaow extends lqeggnwhkg {

        /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
        private Intent f12183iozdgvuglv;

        /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
        private String f12184lmojexxdyd;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(agtfadlqog activityNavigator) {
            super(activityNavigator);
            zdlpuopuiu.btonecajqb(activityNavigator, "activityNavigator");
        }

        private final String cdpycssgdh(Context context, String str) {
            if (str == null) {
                return null;
            }
            String packageName = context.getPackageName();
            zdlpuopuiu.dxjokdxxww(packageName, "context.packageName");
            return kcexrzcfyt.hcddaimhww(str, "${applicationId}", packageName, false, 4, null);
        }

        @Override // androidx.navigation.lqeggnwhkg
        public boolean equals(Object obj) {
            boolean zFilterEquals;
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof zoijcleaow)) {
                return false;
            }
            if (super.equals(obj)) {
                Intent intent = this.f12183iozdgvuglv;
                if (intent != null) {
                    zFilterEquals = intent.filterEquals(((zoijcleaow) obj).f12183iozdgvuglv);
                } else {
                    zFilterEquals = ((zoijcleaow) obj).f12183iozdgvuglv == null;
                }
                if (zFilterEquals && zdlpuopuiu.eablkybsjg(this.f12184lmojexxdyd, ((zoijcleaow) obj).f12184lmojexxdyd)) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.navigation.lqeggnwhkg
        public boolean esjtqupxsv() {
            return false;
        }

        @Override // androidx.navigation.lqeggnwhkg
        public int hashCode() {
            int iHashCode = super.hashCode() * 31;
            Intent intent = this.f12183iozdgvuglv;
            int iFilterHashCode = (iHashCode + (intent != null ? intent.filterHashCode() : 0)) * 31;
            String str = this.f12184lmojexxdyd;
            return iFilterHashCode + (str != null ? str.hashCode() : 0);
        }

        public final zoijcleaow hcddaimhww(String str) {
            if (this.f12183iozdgvuglv == null) {
                this.f12183iozdgvuglv = new Intent();
            }
            Intent intent = this.f12183iozdgvuglv;
            zdlpuopuiu.lqeggnwhkg(intent);
            intent.setPackage(str);
            return this;
        }

        public final zoijcleaow iozdgvuglv(String str) {
            if (this.f12183iozdgvuglv == null) {
                this.f12183iozdgvuglv = new Intent();
            }
            Intent intent = this.f12183iozdgvuglv;
            zdlpuopuiu.lqeggnwhkg(intent);
            intent.setAction(str);
            return this;
        }

        public final Intent istkbnxepw() {
            return this.f12183iozdgvuglv;
        }

        @Override // androidx.navigation.lqeggnwhkg
        public void kcexrzcfyt(Context context, AttributeSet attrs) {
            zdlpuopuiu.btonecajqb(context, "context");
            zdlpuopuiu.btonecajqb(attrs, "attrs");
            super.kcexrzcfyt(context, attrs);
            TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attrs, rgvfuqvkyq.ActivityNavigator);
            zdlpuopuiu.dxjokdxxww(typedArrayObtainAttributes, "context.resources.obtain…leable.ActivityNavigator)");
            hcddaimhww(cdpycssgdh(context, typedArrayObtainAttributes.getString(rgvfuqvkyq.ActivityNavigator_targetPackage)));
            String string = typedArrayObtainAttributes.getString(rgvfuqvkyq.ActivityNavigator_android_name);
            if (string != null) {
                if (string.charAt(0) == '.') {
                    string = context.getPackageName() + string;
                }
                lmojexxdyd(new ComponentName(context, string));
            }
            iozdgvuglv(typedArrayObtainAttributes.getString(rgvfuqvkyq.ActivityNavigator_action));
            String strCdpycssgdh = cdpycssgdh(context, typedArrayObtainAttributes.getString(rgvfuqvkyq.ActivityNavigator_data));
            if (strCdpycssgdh != null) {
                wwaezpbzkn(Uri.parse(strCdpycssgdh));
            }
            ylkuphrtab(cdpycssgdh(context, typedArrayObtainAttributes.getString(rgvfuqvkyq.ActivityNavigator_dataPattern)));
            typedArrayObtainAttributes.recycle();
        }

        public final String lereixgezr() {
            Intent intent = this.f12183iozdgvuglv;
            if (intent != null) {
                return intent.getAction();
            }
            return null;
        }

        public final zoijcleaow lmojexxdyd(ComponentName componentName) {
            if (this.f12183iozdgvuglv == null) {
                this.f12183iozdgvuglv = new Intent();
            }
            Intent intent = this.f12183iozdgvuglv;
            zdlpuopuiu.lqeggnwhkg(intent);
            intent.setComponent(componentName);
            return this;
        }

        public final ComponentName pmvmpeiblj() {
            Intent intent = this.f12183iozdgvuglv;
            if (intent != null) {
                return intent.getComponent();
            }
            return null;
        }

        @Override // androidx.navigation.lqeggnwhkg
        public String toString() {
            ComponentName componentNamePmvmpeiblj = pmvmpeiblj();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(super.toString());
            if (componentNamePmvmpeiblj != null) {
                sb3.append(" class=");
                sb3.append(componentNamePmvmpeiblj.getClassName());
            } else {
                String strLereixgezr = lereixgezr();
                if (strLereixgezr != null) {
                    sb3.append(" action=");
                    sb3.append(strLereixgezr);
                }
            }
            String string = sb3.toString();
            zdlpuopuiu.dxjokdxxww(string, "sb.toString()");
            return string;
        }

        public final zoijcleaow wwaezpbzkn(Uri uri) {
            if (this.f12183iozdgvuglv == null) {
                this.f12183iozdgvuglv = new Intent();
            }
            Intent intent = this.f12183iozdgvuglv;
            zdlpuopuiu.lqeggnwhkg(intent);
            intent.setData(uri);
            return this;
        }

        public final zoijcleaow ylkuphrtab(String str) {
            this.f12184lmojexxdyd = str;
            return this;
        }

        public final String zynmafqrjb() {
            return this.f12184lmojexxdyd;
        }
    }

    public iobyxmoadg(Context context) {
        zdlpuopuiu.btonecajqb(context, "context");
        this.context = context;
        for (Object obj : lj.wflxmlrfwp.agtfadlqog(context, ppxfxbqfkf.f12182zdlpuopuiu)) {
            if (((Context) obj) instanceof Activity) {
                this.hostActivity = (Activity) obj;
            }
        }
        obj = null;
        this.hostActivity = (Activity) obj;
    }

    @Override // androidx.navigation.agtfadlqog
    /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
    public zoijcleaow iobyxmoadg() {
        return new zoijcleaow(this);
    }

    @Override // androidx.navigation.agtfadlqog
    public boolean gtknphoqwx() {
        Activity activity = this.hostActivity;
        if (activity == null) {
            return false;
        }
        activity.finish();
        return true;
    }

    @Override // androidx.navigation.agtfadlqog
    /* JADX INFO: renamed from: wflxmlrfwp, reason: merged with bridge method [inline-methods] */
    public lqeggnwhkg wkgbmnqykc(zoijcleaow destination, Bundle args, gtknphoqwx navOptions, agtfadlqog.iobyxmoadg navigatorExtras) {
        Intent intent;
        int intExtra;
        zdlpuopuiu.btonecajqb(destination, "destination");
        if (destination.istkbnxepw() == null) {
            throw new IllegalStateException(("Destination " + destination.gtknphoqwx() + " does not have an Intent set.").toString());
        }
        Intent intent2 = new Intent(destination.istkbnxepw());
        if (args != null) {
            intent2.putExtras(args);
            String strZynmafqrjb = destination.zynmafqrjb();
            if (strZynmafqrjb != null && strZynmafqrjb.length() != 0) {
                StringBuffer stringBuffer = new StringBuffer();
                Matcher matcher = Pattern.compile("\\{(.+?)\\}").matcher(strZynmafqrjb);
                while (matcher.find()) {
                    String strGroup = matcher.group(1);
                    if (!args.containsKey(strGroup)) {
                        throw new IllegalArgumentException("Could not find " + strGroup + " in " + args + " to fill data pattern " + strZynmafqrjb);
                    }
                    matcher.appendReplacement(stringBuffer, "");
                    stringBuffer.append(Uri.encode(String.valueOf(args.get(strGroup))));
                }
                matcher.appendTail(stringBuffer);
                intent2.setData(Uri.parse(stringBuffer.toString()));
            }
        }
        if (this.hostActivity == null) {
            intent2.addFlags(268435456);
        }
        if (navOptions != null && navOptions.btonecajqb()) {
            intent2.addFlags(536870912);
        }
        Activity activity = this.hostActivity;
        if (activity != null && (intent = activity.getIntent()) != null && (intExtra = intent.getIntExtra("android-support-navigation:ActivityNavigator:current", 0)) != 0) {
            intent2.putExtra("android-support-navigation:ActivityNavigator:source", intExtra);
        }
        intent2.putExtra("android-support-navigation:ActivityNavigator:current", destination.gtknphoqwx());
        Resources resources = this.context.getResources();
        if (navOptions != null) {
            int iPpxfxbqfkf = navOptions.ppxfxbqfkf();
            int iWkgbmnqykc = navOptions.wkgbmnqykc();
            if ((iPpxfxbqfkf <= 0 || !zdlpuopuiu.eablkybsjg(resources.getResourceTypeName(iPpxfxbqfkf), "animator")) && (iWkgbmnqykc <= 0 || !zdlpuopuiu.eablkybsjg(resources.getResourceTypeName(iWkgbmnqykc), "animator"))) {
                intent2.putExtra("android-support-navigation:ActivityNavigator:popEnterAnim", iPpxfxbqfkf);
                intent2.putExtra("android-support-navigation:ActivityNavigator:popExitAnim", iWkgbmnqykc);
            } else {
                Log.w("ActivityNavigator", "Activity destinations do not support Animator resource. Ignoring popEnter resource " + resources.getResourceName(iPpxfxbqfkf) + " and popExit resource " + resources.getResourceName(iWkgbmnqykc) + " when launching " + destination);
            }
        }
        this.context.startActivity(intent2);
        if (navOptions == null || this.hostActivity == null) {
            return null;
        }
        int iIobyxmoadg = navOptions.iobyxmoadg();
        int iZoijcleaow = navOptions.zoijcleaow();
        if ((iIobyxmoadg <= 0 || !zdlpuopuiu.eablkybsjg(resources.getResourceTypeName(iIobyxmoadg), "animator")) && (iZoijcleaow <= 0 || !zdlpuopuiu.eablkybsjg(resources.getResourceTypeName(iZoijcleaow), "animator"))) {
            if (iIobyxmoadg < 0 && iZoijcleaow < 0) {
                return null;
            }
            this.hostActivity.overridePendingTransition(zg.gtknphoqwx.gxszxtbevo(iIobyxmoadg, 0), zg.gtknphoqwx.gxszxtbevo(iZoijcleaow, 0));
            return null;
        }
        Log.w("ActivityNavigator", "Activity destinations do not support Animator resource. Ignoring enter resource " + resources.getResourceName(iIobyxmoadg) + " and exit resource " + resources.getResourceName(iZoijcleaow) + "when launching " + destination);
        return null;
    }
}
