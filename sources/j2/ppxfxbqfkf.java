package j2;

import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
final class ppxfxbqfkf extends InputConnectionWrapper {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final TextView f50558iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final iobyxmoadg f50559zoijcleaow;

    public static class iobyxmoadg {
        public boolean iobyxmoadg(InputConnection inputConnection, Editable editable, int i13, int i14, boolean z13) {
            return i2.iobyxmoadg.zoijcleaow(inputConnection, editable, i13, i14, z13);
        }

        public void zoijcleaow(EditorInfo editorInfo) {
            if (i2.iobyxmoadg.wkgbmnqykc()) {
                i2.iobyxmoadg.iobyxmoadg();
                throw null;
            }
        }
    }

    ppxfxbqfkf(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        this(textView, inputConnection, editorInfo, new iobyxmoadg());
    }

    private Editable zoijcleaow() {
        return this.f50558iobyxmoadg.getEditableText();
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i13, int i14) {
        return this.f50559zoijcleaow.iobyxmoadg(this, zoijcleaow(), i13, i14, false) || super.deleteSurroundingText(i13, i14);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int i13, int i14) {
        return this.f50559zoijcleaow.iobyxmoadg(this, zoijcleaow(), i13, i14, true) || super.deleteSurroundingTextInCodePoints(i13, i14);
    }

    ppxfxbqfkf(TextView textView, InputConnection inputConnection, EditorInfo editorInfo, iobyxmoadg iobyxmoadgVar) {
        super(inputConnection, false);
        this.f50558iobyxmoadg = textView;
        this.f50559zoijcleaow = iobyxmoadgVar;
        iobyxmoadgVar.zoijcleaow(editorInfo);
    }
}
