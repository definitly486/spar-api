package gtknphoqwx;

import android.content.Context;
import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class iobyxmoadg implements TransformationMethod {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private Locale f38489iobyxmoadg;

    public iobyxmoadg(Context context) {
        this.f38489iobyxmoadg = context.getResources().getConfiguration().locale;
    }

    @Override // android.text.method.TransformationMethod
    public CharSequence getTransformation(CharSequence charSequence, View view) {
        if (charSequence != null) {
            return charSequence.toString().toUpperCase(this.f38489iobyxmoadg);
        }
        return null;
    }

    @Override // android.text.method.TransformationMethod
    public void onFocusChanged(View view, CharSequence charSequence, boolean z13, int i13, Rect rect) {
    }
}
