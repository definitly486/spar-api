package ru.myspar.core.base.mvvm;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.base.api.bottomsheet.BaseBottomSheetDialogFragment;
import vx.eablkybsjg;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b'\u0018\u0000*\u0010\b\u0000\u0010\u0002*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00012\u00020\u0003B\u0011\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J-\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/myspar/core/base/mvvm/BaseMvvmBottomSheetDialogFragment;", "Lvx/eablkybsjg;", "VM", "Lru/myspar/core/base/api/bottomsheet/BaseBottomSheetDialogFragment;", "", "layoutId", "<init>", "(I)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "lereixgezr", "I", "cllcsxoeiz", "()I", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class BaseMvvmBottomSheetDialogFragment<VM extends eablkybsjg> extends BaseBottomSheetDialogFragment {

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata */
    private final int layoutId;

    public BaseMvvmBottomSheetDialogFragment(int i13) {
        super(i13);
        this.layoutId = i13;
    }

    @Override // ru.myspar.core.base.api.bottomsheet.BaseBottomSheetDialogFragment, ru.myspar.core.base.api.bottomsheet.FixedBottomSheetFragment
    /* JADX INFO: renamed from: cllcsxoeiz, reason: from getter */
    public int getLayoutId() {
        return this.layoutId;
    }

    @Override // ru.myspar.core.base.api.bottomsheet.FixedBottomSheetFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        zdlpuopuiu.btonecajqb(inflater, "inflater");
        return inflater.inflate(getLayoutId(), container, false);
    }
}
