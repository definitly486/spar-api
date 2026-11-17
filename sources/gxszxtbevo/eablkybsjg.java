package gxszxtbevo;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.ext.SdkExtensions;
import hg.jyumaefscl;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes.dex */
public class eablkybsjg extends gxszxtbevo.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final iobyxmoadg f38655iobyxmoadg = new iobyxmoadg(null);

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final boolean eablkybsjg(Context context) {
            zdlpuopuiu.btonecajqb(context, "context");
            return zoijcleaow(context) != null;
        }

        public final boolean gxszxtbevo() {
            int i13 = Build.VERSION.SDK_INT;
            if (i13 >= 33) {
                return true;
            }
            return i13 >= 30 && SdkExtensions.getExtensionVersion(30) >= 2;
        }

        public final ResolveInfo iobyxmoadg(Context context) {
            zdlpuopuiu.btonecajqb(context, "context");
            return context.getPackageManager().resolveActivity(new Intent("com.google.android.gms.provider.action.PICK_IMAGES"), 1114112);
        }

        public final String ppxfxbqfkf(wkgbmnqykc input) {
            zdlpuopuiu.btonecajqb(input, "input");
            if (input instanceof ppxfxbqfkf) {
                return "image/*";
            }
            if (input instanceof zoijcleaow) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }

        public final boolean wkgbmnqykc(Context context) {
            zdlpuopuiu.btonecajqb(context, "context");
            return iobyxmoadg(context) != null;
        }

        public final ResolveInfo zoijcleaow(Context context) {
            zdlpuopuiu.btonecajqb(context, "context");
            return context.getPackageManager().resolveActivity(new Intent("androidx.activity.result.contract.action.PICK_IMAGES"), 1114112);
        }

        private iobyxmoadg() {
        }
    }

    public static final class ppxfxbqfkf implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final ppxfxbqfkf f38656iobyxmoadg = new ppxfxbqfkf();

        private ppxfxbqfkf() {
        }
    }

    public interface wkgbmnqykc {
    }

    public static final class zoijcleaow implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f38657iobyxmoadg = new zoijcleaow();

        private zoijcleaow() {
        }
    }

    @Override // gxszxtbevo.iobyxmoadg
    /* JADX INFO: renamed from: eablkybsjg, reason: merged with bridge method [inline-methods] */
    public final gxszxtbevo.iobyxmoadg.C0890iobyxmoadg zoijcleaow(Context context, eablkybsjg.eablkybsjg input) {
        zdlpuopuiu.btonecajqb(context, "context");
        zdlpuopuiu.btonecajqb(input, "input");
        return null;
    }

    @Override // gxszxtbevo.iobyxmoadg
    /* JADX INFO: renamed from: gxszxtbevo, reason: merged with bridge method [inline-methods] */
    public final Uri ppxfxbqfkf(int i13, Intent intent) {
        if (i13 != -1) {
            intent = null;
        }
        if (intent == null) {
            return null;
        }
        Uri data = intent.getData();
        if (data == null) {
            data = (Uri) jyumaefscl.weqkydbzbr(gxszxtbevo.zoijcleaow.f38661iobyxmoadg.iobyxmoadg(intent));
        }
        return data;
    }

    @Override // gxszxtbevo.iobyxmoadg
    /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
    public Intent iobyxmoadg(Context context, eablkybsjg.eablkybsjg input) {
        Intent intent;
        zdlpuopuiu.btonecajqb(context, "context");
        zdlpuopuiu.btonecajqb(input, "input");
        iobyxmoadg iobyxmoadgVar = f38655iobyxmoadg;
        if (iobyxmoadgVar.gxszxtbevo()) {
            Intent intent2 = new Intent("android.provider.action.PICK_IMAGES");
            intent2.setType(iobyxmoadgVar.ppxfxbqfkf(input.iobyxmoadg()));
            return intent2;
        }
        if (iobyxmoadgVar.eablkybsjg(context)) {
            ResolveInfo resolveInfoZoijcleaow = iobyxmoadgVar.zoijcleaow(context);
            if (resolveInfoZoijcleaow == null) {
                throw new IllegalStateException("Required value was null.");
            }
            ActivityInfo activityInfo = resolveInfoZoijcleaow.activityInfo;
            intent = new Intent("androidx.activity.result.contract.action.PICK_IMAGES");
            intent.setClassName(activityInfo.applicationInfo.packageName, activityInfo.name);
            intent.setType(iobyxmoadgVar.ppxfxbqfkf(input.iobyxmoadg()));
        } else {
            if (!iobyxmoadgVar.wkgbmnqykc(context)) {
                Intent intent3 = new Intent("android.intent.action.OPEN_DOCUMENT");
                intent3.setType(iobyxmoadgVar.ppxfxbqfkf(input.iobyxmoadg()));
                if (intent3.getType() != null) {
                    return intent3;
                }
                intent3.setType("*/*");
                intent3.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
                return intent3;
            }
            ResolveInfo resolveInfoIobyxmoadg = iobyxmoadgVar.iobyxmoadg(context);
            if (resolveInfoIobyxmoadg == null) {
                throw new IllegalStateException("Required value was null.");
            }
            ActivityInfo activityInfo2 = resolveInfoIobyxmoadg.activityInfo;
            intent = new Intent("com.google.android.gms.provider.action.PICK_IMAGES");
            intent.setClassName(activityInfo2.applicationInfo.packageName, activityInfo2.name);
            intent.setType(iobyxmoadgVar.ppxfxbqfkf(input.iobyxmoadg()));
        }
        return intent;
    }
}
