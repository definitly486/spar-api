package y1;

import android.content.ClipData;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import u1.nufgyqmvbu;
import v1.jhduphickx;

/* JADX INFO: loaded from: classes.dex */
public abstract class ppxfxbqfkf {

    class iobyxmoadg extends InputConnectionWrapper {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ zoijcleaow f123510iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        iobyxmoadg(InputConnection inputConnection, boolean z13, zoijcleaow zoijcleaowVar) {
            super(inputConnection, z13);
            this.f123510iobyxmoadg = zoijcleaowVar;
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public boolean commitContent(InputContentInfo inputContentInfo, int i13, Bundle bundle) {
            if (this.f123510iobyxmoadg.iobyxmoadg(wkgbmnqykc.gxszxtbevo(inputContentInfo), i13, bundle)) {
                return true;
            }
            return super.commitContent(inputContentInfo, i13, bundle);
        }
    }

    public interface zoijcleaow {
        boolean iobyxmoadg(wkgbmnqykc wkgbmnqykcVar, int i13, Bundle bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean eablkybsjg(View view, wkgbmnqykc wkgbmnqykcVar, int i13, Bundle bundle) {
        if ((i13 & 1) != 0) {
            try {
                wkgbmnqykcVar.wkgbmnqykc();
                Parcelable parcelable = (Parcelable) wkgbmnqykcVar.eablkybsjg();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception e13) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e13);
                return false;
            }
        }
        return jhduphickx.jztzpxfvev(view, new v1.wkgbmnqykc.iobyxmoadg(new ClipData(wkgbmnqykcVar.zoijcleaow(), new ClipData.Item(wkgbmnqykcVar.iobyxmoadg())), 2).wkgbmnqykc(wkgbmnqykcVar.ppxfxbqfkf()).zoijcleaow(bundle).iobyxmoadg()) == null;
    }

    public static InputConnection ppxfxbqfkf(View view, InputConnection inputConnection, EditorInfo editorInfo) {
        return wkgbmnqykc(inputConnection, editorInfo, zoijcleaow(view));
    }

    public static InputConnection wkgbmnqykc(InputConnection inputConnection, EditorInfo editorInfo, zoijcleaow zoijcleaowVar) {
        u1.zoijcleaow.wkgbmnqykc(inputConnection, "inputConnection must be non-null");
        u1.zoijcleaow.wkgbmnqykc(editorInfo, "editorInfo must be non-null");
        u1.zoijcleaow.wkgbmnqykc(zoijcleaowVar, "onCommitContentListener must be non-null");
        return new iobyxmoadg(inputConnection, false, zoijcleaowVar);
    }

    private static zoijcleaow zoijcleaow(final View view) {
        nufgyqmvbu.gxszxtbevo(view);
        return new zoijcleaow() { // from class: y1.zoijcleaow
            @Override // y1.ppxfxbqfkf.zoijcleaow
            public final boolean iobyxmoadg(wkgbmnqykc wkgbmnqykcVar, int i13, Bundle bundle) {
                return ppxfxbqfkf.eablkybsjg(view, wkgbmnqykcVar, i13, bundle);
            }
        };
    }
}
