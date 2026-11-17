package ru.myspar.proloyalty.core.base.api.dialog;

import android.content.DialogInterface;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import tg.iobyxmoadg;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\bJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\bJ\u001f\u0010\u0011\u001a\u00020\u00002\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0017H\u0004¢\u0006\u0004\b\u0019\u0010\u001aR\"\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u000f0\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lru/myspar/proloyalty/core/base/api/dialog/BaseDialogFragment;", "Landroidx/fragment/app/DialogFragment;", "", "layoutId", "<init>", "(I)V", "Lgg/wwaezpbzkn;", "iozdgvuglv", "()V", "Landroid/content/DialogInterface;", "dialog", "onCancel", "(Landroid/content/DialogInterface;)V", "dismiss", "dismissAllowingStateLoss", "Lkotlin/Function0;", "action", "lmojexxdyd", "(Ltg/iobyxmoadg;)Lru/myspar/proloyalty/core/base/api/dialog/BaseDialogFragment;", "Landroidx/fragment/app/FragmentManager;", "manager", "wwaezpbzkn", "(Landroidx/fragment/app/FragmentManager;)V", "", "error", "ylkuphrtab", "(Ljava/lang/Throwable;)V", "", "zdlpuopuiu", "Ljava/util/List;", "dismissActions", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class BaseDialogFragment extends DialogFragment {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata */
    private List dismissActions;

    public BaseDialogFragment(int i13) {
        super(i13);
        this.dismissActions = new ArrayList();
    }

    private final void iozdgvuglv() {
        Iterator it = this.dismissActions.iterator();
        while (it.hasNext()) {
            ((iobyxmoadg) it.next()).invoke();
        }
        this.dismissActions.clear();
    }

    @Override // androidx.fragment.app.DialogFragment
    public void dismiss() {
        iozdgvuglv();
        super.dismiss();
    }

    @Override // androidx.fragment.app.DialogFragment
    public void dismissAllowingStateLoss() {
        iozdgvuglv();
        super.dismissAllowingStateLoss();
    }

    public final BaseDialogFragment lmojexxdyd(iobyxmoadg action) {
        if (action != null) {
            this.dismissActions.add(action);
        }
        return this;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialog) {
        zdlpuopuiu.btonecajqb(dialog, "dialog");
        iozdgvuglv();
    }

    public final void wwaezpbzkn(FragmentManager manager) {
        zdlpuopuiu.btonecajqb(manager, "manager");
        if (manager.oipsdeybqn(getClass().getSimpleName()) == null) {
            super.show(manager, getClass().getSimpleName());
        }
    }

    protected final void ylkuphrtab(Throwable error) {
        zdlpuopuiu.btonecajqb(error, "error");
        w11.iobyxmoadg.f118559iobyxmoadg.zoijcleaow(error);
    }
}
