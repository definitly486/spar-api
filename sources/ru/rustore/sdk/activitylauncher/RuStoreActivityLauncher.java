package ru.rustore.sdk.activitylauncher;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.ResultReceiver;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u001c2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\f\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006H\u0014¢\u0006\u0004\b\f\u0010\rJ)\u0010\u0012\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0014¢\u0006\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lru/rustore/sdk/activitylauncher/RuStoreActivityLauncher;", "Landroid/app/Activity;", "<init>", "()V", "", "code", "Landroid/os/Bundle;", "bundle", "Lgg/wwaezpbzkn;", "iobyxmoadg", "(ILandroid/os/Bundle;)V", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "Landroid/os/ResultReceiver;", "zdlpuopuiu", "Landroid/os/ResultReceiver;", "resultReceiver", "Lib2/iobyxmoadg;", "yggfygwlhe", "Lib2/iobyxmoadg;", "activityLauncherAnalytics", "jyumaefscl", "sdk-public-activitylauncher_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class RuStoreActivityLauncher extends Activity {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata */
    private ib2.iobyxmoadg activityLauncherAnalytics;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata */
    private ResultReceiver resultReceiver;

    /* JADX INFO: renamed from: ru.rustore.sdk.activitylauncher.RuStoreActivityLauncher$iobyxmoadg, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final Intent iobyxmoadg(Context context, ResultReceiver resultReceiver, Intent confirmationIntent) {
            zdlpuopuiu.btonecajqb(context, "context");
            zdlpuopuiu.btonecajqb(resultReceiver, "resultReceiver");
            zdlpuopuiu.btonecajqb(confirmationIntent, "confirmationIntent");
            Intent intent = new Intent(context, (Class<?>) RuStoreActivityLauncher.class);
            if (!(context instanceof Activity)) {
                intent.setFlags(268435456);
            }
            intent.putExtra("RESULT_RECEIVER", resultReceiver);
            intent.putExtra("CONFIRMATION_PENDING_INTENT", PendingIntent.getActivity(context, 0, confirmationIntent, 1140850688));
            return intent;
        }

        private Companion() {
        }
    }

    private final void iobyxmoadg(int code, Bundle bundle) {
        ResultReceiver resultReceiver = this.resultReceiver;
        if (resultReceiver == null) {
            zdlpuopuiu.pmvmpeiblj("resultReceiver");
            resultReceiver = null;
        }
        resultReceiver.send(code, bundle);
        finish();
    }

    @Override // android.app.Activity
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 0) {
            iobyxmoadg(resultCode, data != null ? data.getExtras() : null);
        }
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        Object parcelableExtra;
        Object parcelableExtra2;
        super.onCreate(savedInstanceState);
        Context applicationContext = getApplicationContext();
        zdlpuopuiu.dxjokdxxww(applicationContext, "this.applicationContext");
        this.activityLauncherAnalytics = new ib2.iobyxmoadg(applicationContext);
        Intent intent = getIntent();
        zdlpuopuiu.dxjokdxxww(intent, "intent");
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 33) {
            parcelableExtra = intent.getParcelableExtra("RESULT_RECEIVER", ResultReceiver.class);
            if (parcelableExtra == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
        } else {
            parcelableExtra = intent.getParcelableExtra("RESULT_RECEIVER");
            if (parcelableExtra == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        this.resultReceiver = (ResultReceiver) parcelableExtra;
        if (savedInstanceState == null) {
            Intent intent2 = getIntent();
            zdlpuopuiu.dxjokdxxww(intent2, "intent");
            if (i13 >= 33) {
                parcelableExtra2 = intent2.getParcelableExtra("CONFIRMATION_PENDING_INTENT", PendingIntent.class);
                if (parcelableExtra2 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
            } else {
                parcelableExtra2 = intent2.getParcelableExtra("CONFIRMATION_PENDING_INTENT");
                if (parcelableExtra2 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
            }
            try {
                startIntentSenderForResult(((PendingIntent) parcelableExtra2).getIntentSender(), 0, null, 0, 0, 0);
            } catch (ActivityNotFoundException e13) {
                ib2.iobyxmoadg iobyxmoadgVar = this.activityLauncherAnalytics;
                if (iobyxmoadgVar == null) {
                    zdlpuopuiu.pmvmpeiblj("activityLauncherAnalytics");
                    iobyxmoadgVar = null;
                }
                iobyxmoadgVar.ppxfxbqfkf(e13);
                iobyxmoadg(iobyxmoadg.C2540iobyxmoadg.f104814ppxfxbqfkf.iobyxmoadg(), null);
            } catch (IntentSender.SendIntentException e14) {
                ib2.iobyxmoadg iobyxmoadgVar2 = this.activityLauncherAnalytics;
                if (iobyxmoadgVar2 == null) {
                    zdlpuopuiu.pmvmpeiblj("activityLauncherAnalytics");
                    iobyxmoadgVar2 = null;
                }
                iobyxmoadgVar2.ppxfxbqfkf(e14);
                iobyxmoadg(iobyxmoadg.eablkybsjg.f104812ppxfxbqfkf.iobyxmoadg(), null);
            } catch (Exception e15) {
                ib2.iobyxmoadg iobyxmoadgVar3 = this.activityLauncherAnalytics;
                if (iobyxmoadgVar3 == null) {
                    zdlpuopuiu.pmvmpeiblj("activityLauncherAnalytics");
                    iobyxmoadgVar3 = null;
                }
                iobyxmoadgVar3.ppxfxbqfkf(e15);
                iobyxmoadg(iobyxmoadg.gxszxtbevo.f104813ppxfxbqfkf.iobyxmoadg(), null);
            }
        }
    }
}
