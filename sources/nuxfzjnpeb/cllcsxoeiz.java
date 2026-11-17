package nuxfzjnpeb;

import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
final class cllcsxoeiz {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final cllcsxoeiz f71131iobyxmoadg = new cllcsxoeiz();

    private cllcsxoeiz() {
    }

    public final void iobyxmoadg(PendingIntent pendingIntent) {
        try {
            pendingIntent.send(ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1).toBundle());
        } catch (PendingIntent.CanceledException e13) {
            Log.e("TextClassification", "error sending pendingIntent: " + pendingIntent + " error: " + e13);
        }
    }
}
