package nuxfzjnpeb;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import android.view.textclassifier.TextClassification;

/* JADX INFO: loaded from: classes.dex */
public final class dsvhmnatus {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final dsvhmnatus f71143iobyxmoadg = new dsvhmnatus();

    private dsvhmnatus() {
    }

    public final void iobyxmoadg(Context context, TextClassification textClassification) throws PendingIntent.CanceledException {
        String text = textClassification.getText();
        zoijcleaow(PendingIntent.getActivity(context, text != null ? text.hashCode() : 0, textClassification.getIntent(), 201326592));
    }

    public final void zoijcleaow(PendingIntent pendingIntent) throws PendingIntent.CanceledException {
        if (Build.VERSION.SDK_INT >= 34) {
            cllcsxoeiz.f71131iobyxmoadg.iobyxmoadg(pendingIntent);
        } else {
            pendingIntent.send();
        }
    }
}
