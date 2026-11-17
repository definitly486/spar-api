package androidx.appcompat.widget;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.util.Log;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;
import v1.jhduphickx;

/* JADX INFO: loaded from: classes.dex */
abstract class rgvfuqvkyq {

    private static final class iobyxmoadg {
        static boolean iobyxmoadg(DragEvent dragEvent, TextView textView, Activity activity) {
            activity.requestDragAndDropPermissions(dragEvent);
            int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
            textView.beginBatchEdit();
            try {
                Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
                jhduphickx.jztzpxfvev(textView, new v1.wkgbmnqykc.iobyxmoadg(dragEvent.getClipData(), 3).iobyxmoadg());
                return true;
            } finally {
                textView.endBatchEdit();
            }
        }

        static boolean zoijcleaow(DragEvent dragEvent, View view, Activity activity) {
            activity.requestDragAndDropPermissions(dragEvent);
            jhduphickx.jztzpxfvev(view, new v1.wkgbmnqykc.iobyxmoadg(dragEvent.getClipData(), 3).iobyxmoadg());
            return true;
        }
    }

    static boolean iobyxmoadg(View view, DragEvent dragEvent) {
        if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && jhduphickx.istkbnxepw(view) != null) {
            Activity activityPpxfxbqfkf = ppxfxbqfkf(view);
            if (activityPpxfxbqfkf == null) {
                Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + view);
                return false;
            }
            if (dragEvent.getAction() == 1) {
                return !(view instanceof TextView);
            }
            if (dragEvent.getAction() == 3) {
                return view instanceof TextView ? iobyxmoadg.iobyxmoadg(dragEvent, (TextView) view, activityPpxfxbqfkf) : iobyxmoadg.zoijcleaow(dragEvent, view, activityPpxfxbqfkf);
            }
        }
        return false;
    }

    static Activity ppxfxbqfkf(View view) {
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }

    static boolean zoijcleaow(TextView textView, int i13) {
        if (Build.VERSION.SDK_INT >= 31 || jhduphickx.istkbnxepw(textView) == null || !(i13 == 16908322 || i13 == 16908337)) {
            return false;
        }
        ClipboardManager clipboardManager = (ClipboardManager) textView.getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            jhduphickx.jztzpxfvev(textView, new v1.wkgbmnqykc.iobyxmoadg(primaryClip, 1).ppxfxbqfkf(i13 != 16908322 ? 1 : 0).iobyxmoadg());
        }
        return true;
    }
}
