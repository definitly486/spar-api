package ru.myspar.scango.impl.component.presentation;

import android.app.Dialog;
import android.os.Bundle;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.ppxfxbqfkf;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.base.mvvm.BaseMvvmBottomSheetDialogFragment;
import s40.wflxmlrfwp;
import vx.eablkybsjg;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b'\u0018\u0000*\u0010\b\u0000\u0010\u0002*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0006¨\u0006\u0013"}, d2 = {"Lru/myspar/scango/impl/component/presentation/BaseMvvmScanGoBottomSheetDialogFragment;", "Lvx/eablkybsjg;", "VM", "Lru/myspar/core/base/mvvm/BaseMvvmBottomSheetDialogFragment;", "", "getTheme", "()I", "Landroid/os/Bundle;", "savedInstanceState", "Lcom/google/android/material/bottomsheet/ppxfxbqfkf;", "crxdokpmqz", "(Landroid/os/Bundle;)Lcom/google/android/material/bottomsheet/ppxfxbqfkf;", "Lgg/wwaezpbzkn;", "onDestroy", "()V", "pmvmpeiblj", "I", "cllcsxoeiz", "layoutId", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class BaseMvvmScanGoBottomSheetDialogFragment<VM extends eablkybsjg> extends BaseMvvmBottomSheetDialogFragment<VM> {

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name and from kotlin metadata */
    private final int layoutId;

    @Override // ru.myspar.core.base.mvvm.BaseMvvmBottomSheetDialogFragment, ru.myspar.core.base.api.bottomsheet.BaseBottomSheetDialogFragment, ru.myspar.core.base.api.bottomsheet.FixedBottomSheetFragment
    /* JADX INFO: renamed from: cllcsxoeiz, reason: from getter */
    public int getLayoutId() {
        return this.layoutId;
    }

    @Override // ru.myspar.core.base.api.bottomsheet.FixedBottomSheetFragment, com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    /* JADX INFO: renamed from: crxdokpmqz, reason: merged with bridge method [inline-methods] */
    public ppxfxbqfkf onCreateDialog(Bundle savedInstanceState) {
        Dialog dialogOnCreateDialog = super.onCreateDialog(savedInstanceState);
        zdlpuopuiu.nufgyqmvbu(dialogOnCreateDialog, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) dialogOnCreateDialog;
        ppxfxbqfkfVar.ojitshcjhn().ikoacuggdj(getCallback());
        return ppxfxbqfkfVar;
    }

    @Override // ru.myspar.core.base.api.bottomsheet.BaseBottomSheetDialogFragment, androidx.fragment.app.DialogFragment
    public int getTheme() {
        return wflxmlrfwp.AppBottomSheetDialogTheme;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        BottomSheetBehavior bottomSheetBehaviorOjitshcjhn;
        Dialog dialog = getDialog();
        ppxfxbqfkf ppxfxbqfkfVar = dialog instanceof ppxfxbqfkf ? (ppxfxbqfkf) dialog : null;
        if (ppxfxbqfkfVar != null && (bottomSheetBehaviorOjitshcjhn = ppxfxbqfkfVar.ojitshcjhn()) != null) {
            bottomSheetBehaviorOjitshcjhn.wizcaqwiak(getCallback());
        }
        super.onDestroy();
    }
}
