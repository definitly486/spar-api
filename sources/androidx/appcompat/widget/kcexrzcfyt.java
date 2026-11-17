package androidx.appcompat.widget;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
final class kcexrzcfyt {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private TextView f3353iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private TextClassifier f3354zoijcleaow;

    private static final class iobyxmoadg {
        static TextClassifier iobyxmoadg(TextView textView) {
            TextClassificationManager textClassificationManager = (TextClassificationManager) textView.getContext().getSystemService(TextClassificationManager.class);
            return textClassificationManager != null ? textClassificationManager.getTextClassifier() : TextClassifier.NO_OP;
        }
    }

    kcexrzcfyt(TextView textView) {
        this.f3353iobyxmoadg = (TextView) u1.nufgyqmvbu.gxszxtbevo(textView);
    }

    public TextClassifier iobyxmoadg() {
        TextClassifier textClassifier = this.f3354zoijcleaow;
        return textClassifier == null ? iobyxmoadg.iobyxmoadg(this.f3353iobyxmoadg) : textClassifier;
    }

    public void zoijcleaow(TextClassifier textClassifier) {
        this.f3354zoijcleaow = textClassifier;
    }
}
